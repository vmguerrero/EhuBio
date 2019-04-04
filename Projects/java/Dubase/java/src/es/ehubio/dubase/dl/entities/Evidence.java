package es.ehubio.dubase.dl.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Evidence database table.
 * 
 */
@Entity
@NamedQuery(name="Evidence.findAll", query="SELECT e FROM Evidence e")
public class Evidence implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private List<Ambiguity> ambiguities;
	private List<EvScore> evScores;
	private Experiment experimentBean;
	private List<Replicate> replicates;
	private List<Modification> modifications;

	public Evidence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}


	//bi-directional many-to-one association to Ambiguity
	@OneToMany(mappedBy="evidenceBean")
	public List<Ambiguity> getAmbiguities() {
		return this.ambiguities;
	}

	public void setAmbiguities(List<Ambiguity> ambiguities) {
		this.ambiguities = ambiguities;
	}

	public Ambiguity addAmbiguity(Ambiguity ambiguity) {
		getAmbiguities().add(ambiguity);
		ambiguity.setEvidenceBean(this);

		return ambiguity;
	}

	public Ambiguity removeAmbiguity(Ambiguity ambiguity) {
		getAmbiguities().remove(ambiguity);
		ambiguity.setEvidenceBean(null);

		return ambiguity;
	}


	//bi-directional many-to-one association to EvScore
	@OneToMany(mappedBy="evidenceBean")
	public List<EvScore> getEvScores() {
		return this.evScores;
	}

	public void setEvScores(List<EvScore> evScores) {
		this.evScores = evScores;
	}

	public EvScore addEvScore(EvScore evScore) {
		getEvScores().add(evScore);
		evScore.setEvidenceBean(this);

		return evScore;
	}

	public EvScore removeEvScore(EvScore evScore) {
		getEvScores().remove(evScore);
		evScore.setEvidenceBean(null);

		return evScore;
	}


	//bi-directional many-to-one association to Experiment
	@ManyToOne
	@JoinColumn(name="experiment")
	public Experiment getExperimentBean() {
		return this.experimentBean;
	}

	public void setExperimentBean(Experiment experimentBean) {
		this.experimentBean = experimentBean;
	}


	//bi-directional many-to-one association to Replicate
	@OneToMany(mappedBy="evidenceBean")
	public List<Replicate> getReplicates() {
		return this.replicates;
	}

	public void setReplicates(List<Replicate> replicates) {
		this.replicates = replicates;
	}

	public Replicate addReplicate(Replicate replicate) {
		getReplicates().add(replicate);
		replicate.setEvidenceBean(this);

		return replicate;
	}

	public Replicate removeReplicate(Replicate replicate) {
		getReplicates().remove(replicate);
		replicate.setEvidenceBean(null);

		return replicate;
	}


	//bi-directional many-to-one association to Modification
	@OneToMany(mappedBy="evidenceBean")
	public List<Modification> getModifications() {
		return this.modifications;
	}

	public void setModifications(List<Modification> modifications) {
		this.modifications = modifications;
	}

	public Modification addModification(Modification modification) {
		getModifications().add(modification);
		modification.setEvidenceBean(this);

		return modification;
	}

	public Modification removeModification(Modification modification) {
		getModifications().remove(modification);
		modification.setEvidenceBean(null);

		return modification;
	}

}