package es.ehubio.ubase.dl.entities;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the PeptideScore database table.
 * 
 */
@Entity
@NamedQuery(name="PeptideScore.findAll", query="SELECT p FROM PeptideScore p")
public class PeptideScore implements Serializable {
	private static final long serialVersionUID = 1L;
	private long id;
	private double value;
	private PeptideEvidence peptideEvidence;
	private Replica replicaBean;
	private Score score;

	public PeptideScore() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public double getValue() {
		return this.value;
	}

	public void setValue(double value) {
		this.value = value;
	}


	//uni-directional many-to-one association to PeptideEvidence
	@ManyToOne
	@JoinColumn(name="peptide")
	public PeptideEvidence getPeptideEvidence() {
		return this.peptideEvidence;
	}

	public void setPeptideEvidence(PeptideEvidence peptideEvidence) {
		this.peptideEvidence = peptideEvidence;
	}


	//uni-directional many-to-one association to Replica
	@ManyToOne
	@JoinColumn(name="replica")
	public Replica getReplicaBean() {
		return this.replicaBean;
	}

	public void setReplicaBean(Replica replicaBean) {
		this.replicaBean = replicaBean;
	}


	//uni-directional many-to-one association to Score
	@ManyToOne
	@JoinColumn(name="type")
	public Score getScore() {
		return this.score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

}