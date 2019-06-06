package es.ehubio.dubase.dl.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Experiment database table.
 * 
 */
@Entity
@NamedQuery(name="Experiment.findAll", query="SELECT e FROM Experiment e")
public class Experiment implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String description;
	private Date expDate;
	private Date pubDate;
	private String title;
	private Author authorBean;
	private Enzyme enzymeBean;
	private Method methodBean;
	private List<Condition> conditions;
	private Cell cellBean;
	private List<SupportingFile> supportingFiles;

	public Experiment() {
	}


	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Lob
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	@Temporal(TemporalType.DATE)
	public Date getExpDate() {
		return this.expDate;
	}

	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}


	@Temporal(TemporalType.DATE)
	public Date getPubDate() {
		return this.pubDate;
	}

	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}


	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	//uni-directional many-to-one association to Author
	@ManyToOne
	@JoinColumn(name="author")
	public Author getAuthorBean() {
		return this.authorBean;
	}

	public void setAuthorBean(Author authorBean) {
		this.authorBean = authorBean;
	}


	//uni-directional many-to-one association to Enzyme
	@ManyToOne
	@JoinColumn(name="enzyme")
	public Enzyme getEnzymeBean() {
		return this.enzymeBean;
	}

	public void setEnzymeBean(Enzyme enzymeBean) {
		this.enzymeBean = enzymeBean;
	}


	//uni-directional many-to-one association to Method
	@ManyToOne
	@JoinColumn(name="method")
	public Method getMethodBean() {
		return this.methodBean;
	}

	public void setMethodBean(Method methodBean) {
		this.methodBean = methodBean;
	}


	//bi-directional many-to-one association to Condition
	@OneToMany(mappedBy="experimentBean", fetch=FetchType.EAGER)
	public List<Condition> getConditions() {
		return this.conditions;
	}

	public void setConditions(List<Condition> conditions) {
		this.conditions = conditions;
	}

	public Condition addCondition(Condition condition) {
		getConditions().add(condition);
		condition.setExperimentBean(this);

		return condition;
	}

	public Condition removeCondition(Condition condition) {
		getConditions().remove(condition);
		condition.setExperimentBean(null);

		return condition;
	}


	//uni-directional many-to-one association to Cell
	@ManyToOne
	@JoinColumn(name="cell")
	public Cell getCellBean() {
		return this.cellBean;
	}

	public void setCellBean(Cell cellBean) {
		this.cellBean = cellBean;
	}


	//bi-directional many-to-one association to SupportingFile
	@OneToMany(mappedBy="experimentBean", fetch=FetchType.EAGER)
	public List<SupportingFile> getSupportingFiles() {
		return this.supportingFiles;
	}

	public void setSupportingFiles(List<SupportingFile> supportingFiles) {
		this.supportingFiles = supportingFiles;
	}

	public SupportingFile addSupportingFile(SupportingFile supportingFile) {
		getSupportingFiles().add(supportingFile);
		supportingFile.setExperimentBean(this);

		return supportingFile;
	}

	public SupportingFile removeSupportingFile(SupportingFile supportingFile) {
		getSupportingFiles().remove(supportingFile);
		supportingFile.setExperimentBean(null);

		return supportingFile;
	}

}