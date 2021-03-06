package es.ehubio.dubase.bl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import es.ehubio.dubase.Thresholds;
import es.ehubio.dubase.bl.beans.Overlap;
import es.ehubio.dubase.bl.beans.Scatter;
import es.ehubio.dubase.dl.entities.Ambiguity;
import es.ehubio.dubase.dl.entities.Evidence;
import es.ehubio.dubase.dl.input.ScoreType;
import es.ehubio.io.CsvUtils;

@LocalBean
@Stateless
@Path("/analyze")
public class Analyzer {
	@EJB
	private Searcher searcher;
	@EJB
	private Browser browser;
	@PersistenceContext
	private EntityManager em;
	
	@Path("{gene}.json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Scatter> getScatter(@PathParam("gene") String gene, @QueryParam("xth") Double xth, @QueryParam("yth") Double yth) {
		Thresholds th = new Thresholds();
		th.setDown(true); // for vulcano
		if( xth != null )
			th.setLog2FoldChange(xth);
		if( yth != null )
			th.setLog10PValue(yth);
		List<Evidence> evidences = searcher.searchEnzyme(gene, th);
		List<Scatter> result = new ArrayList<>();
		for( Evidence ev : evidences ) {
			Scatter scatter = new Scatter();
			scatter.setGene(CsvUtils.getCsv(';',ev.getGenes().toArray()));
			scatter.setDesc(CsvUtils.getCsv(';', ev.getDescriptions().toArray()));
			scatter.setFoldChange(ev.getScore(ScoreType.FOLD_CHANGE));
			scatter.setpValue(ev.getScore(ScoreType.P_VALUE));
			scatter.setpValue(Math.pow(10, -scatter.getpValue()));
			result.add(scatter);
		}
		return result;
	}

	public List<Overlap> findOverlaps(Thresholds th) {
		List<String> enzymes = browser.getEnzymesWithEvidences();
		Map<String, Overlap> map = new HashMap<>();
		for( String enzyme : enzymes ) {
			List<Evidence> evs = searcher.searchEnzyme(enzyme, th);
			for( Evidence ev : evs )
				for( Ambiguity a : ev.getAmbiguities() ) {
					String gene = a.getProteinBean().getGeneBean().getName();
					Overlap overlap = map.get(gene);
					if( overlap == null ) {
						overlap = new Overlap();
						overlap.setGene(gene);
						map.put(gene, overlap);
					}
					overlap.getEnzymes().add(enzyme);
				}
		}
		
		return map.values().stream()
			.sorted()
			.filter(o -> o.getEnzymes().size() > 1)
			.collect(Collectors.toList());
	}
}
