package es.ehubio.ubase.dl.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PeptideEvidence database table.
 * 
 */
@Entity
@NamedQuery(name="PeptideEvidence.findAll", query="SELECT p FROM PeptideEvidence p")
public class PeptideEvidence implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private Character after;
	private Double mass;
	private Integer missedCleavages;
	private Character prev;
	private Boolean uniqueGroup;
	private Boolean uniqueProtein;
	private Experiment experimentBean;
	private Peptide peptideBean;

	public PeptideEvidence() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public Character getAfter() {
		return this.after;
	}

	public void setAfter(Character after) {
		this.after = after;
	}


	public Double getMass() {
		return this.mass;
	}

	public void setMass(Double mass) {
		this.mass = mass;
	}


	public Integer getMissedCleavages() {
		return this.missedCleavages;
	}

	public void setMissedCleavages(Integer missedCleavages) {
		this.missedCleavages = missedCleavages;
	}


	public Character getPrev() {
		return this.prev;
	}

	public void setPrev(Character prev) {
		this.prev = prev;
	}


	public Boolean getUniqueGroup() {
		return this.uniqueGroup;
	}

	public void setUniqueGroup(Boolean uniqueGroup) {
		this.uniqueGroup = uniqueGroup;
	}


	public Boolean getUniqueProtein() {
		return this.uniqueProtein;
	}

	public void setUniqueProtein(Boolean uniqueProtein) {
		this.uniqueProtein = uniqueProtein;
	}


	//uni-directional many-to-one association to Experiment
	@ManyToOne
	@JoinColumn(name="experiment")
	public Experiment getExperimentBean() {
		return this.experimentBean;
	}

	public void setExperimentBean(Experiment experimentBean) {
		this.experimentBean = experimentBean;
	}


	//uni-directional many-to-one association to Peptide
	@ManyToOne
	@JoinColumn(name="peptide")
	public Peptide getPeptideBean() {
		return this.peptideBean;
	}

	public void setPeptideBean(Peptide peptideBean) {
		this.peptideBean = peptideBean;
	}

}