package es.ehubio.dubase.dl.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


/**
 * The persistent class for the Method database table.
 * 
 */
@Entity
@NamedQuery(name="Method.findAll", query="SELECT m FROM Method m")
@XmlRootElement
public class Method implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String columnType;
	private String description;
	private double foldThreshold;
	private String instrument;
	private double pvalueThreshold;

	public Method() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@XmlElement(name="column")
	public String getColumnType() {
		return this.columnType;
	}

	public void setColumnType(String column) {
		this.columnType = column;
	}


	@Column(length = 65535, columnDefinition="TEXT")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public double getFoldThreshold() {
		return this.foldThreshold;
	}

	public void setFoldThreshold(double foldThreshold) {
		this.foldThreshold = foldThreshold;
	}


	public String getInstrument() {
		return this.instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}


	public double getPvalueThreshold() {
		return this.pvalueThreshold;
	}

	public void setPvalueThreshold(double pvalueThreshold) {
		this.pvalueThreshold = pvalueThreshold;
	}

}