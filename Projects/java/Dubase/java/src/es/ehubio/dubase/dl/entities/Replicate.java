package es.ehubio.dubase.dl.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the Replicate database table.
 * 
 */
@Entity
@NamedQuery(name="Replicate.findAll", query="SELECT r FROM Replicate r")
public class Replicate implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private Condition conditionBean;

	public Replicate() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//bi-directional many-to-one association to Condition
	@ManyToOne
	@JoinColumn(name="condition")
	public Condition getConditionBean() {
		return this.conditionBean;
	}

	public void setConditionBean(Condition conditionBean) {
		this.conditionBean = conditionBean;
	}

}