//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.16 at 04:53:00 PM CET 
//


package es.ehubio.proteomics.waters.plgs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}GeneratedBy"/>
 *         &lt;element ref="{}PARAMS"/>
 *         &lt;element ref="{}CALCULATED"/>
 *         &lt;element ref="{}ANALYSIS_MODIFIER" maxOccurs="unbounded"/>
 *         &lt;element ref="{}PRODUCT" maxOccurs="unbounded"/>
 *         &lt;element ref="{}PEPTIDE" maxOccurs="unbounded"/>
 *         &lt;element ref="{}QUERY_MASS" maxOccurs="unbounded"/>
 *         &lt;element ref="{}HIT" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ENTRIES_SEARCHED" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *       &lt;attribute name="TIME_CALCULATED" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "generatedBy",
    "params",
    "calculated",
    "analysismodifier",
    "product",
    "peptide",
    "querymass",
    "hit"
})
@XmlRootElement(name = "RESULT")
public class RESULT {

    @XmlElement(name = "GeneratedBy", required = true)
    protected GeneratedBy generatedBy;
    @XmlElement(name = "PARAMS", required = true)
    protected PARAMS params;
    @XmlElement(name = "CALCULATED", required = true)
    protected CALCULATED calculated;
    @XmlElement(name = "ANALYSIS_MODIFIER", required = true)
    protected List<ANALYSISMODIFIER> analysismodifier;
    @XmlElement(name = "PRODUCT", required = true)
    protected List<PRODUCT> product;
    @XmlElement(name = "PEPTIDE", required = true)
    protected List<PEPTIDE> peptide;
    @XmlElement(name = "QUERY_MASS", required = true)
    protected List<QUERYMASS> querymass;
    @XmlElement(name = "HIT", required = true)
    protected List<HIT> hit;
    @XmlAttribute(name = "ENTRIES_SEARCHED", required = true)
    protected BigInteger entriessearched;
    @XmlAttribute(name = "ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String id;
    @XmlAttribute(name = "TIME_CALCULATED", required = true)
    protected BigInteger timecalculated;

    /**
     * Gets the value of the generatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link GeneratedBy }
     *     
     */
    public GeneratedBy getGeneratedBy() {
        return generatedBy;
    }

    /**
     * Sets the value of the generatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneratedBy }
     *     
     */
    public void setGeneratedBy(GeneratedBy value) {
        this.generatedBy = value;
    }

    /**
     * Gets the value of the params property.
     * 
     * @return
     *     possible object is
     *     {@link PARAMS }
     *     
     */
    public PARAMS getPARAMS() {
        return params;
    }

    /**
     * Sets the value of the params property.
     * 
     * @param value
     *     allowed object is
     *     {@link PARAMS }
     *     
     */
    public void setPARAMS(PARAMS value) {
        this.params = value;
    }

    /**
     * Gets the value of the calculated property.
     * 
     * @return
     *     possible object is
     *     {@link CALCULATED }
     *     
     */
    public CALCULATED getCALCULATED() {
        return calculated;
    }

    /**
     * Sets the value of the calculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link CALCULATED }
     *     
     */
    public void setCALCULATED(CALCULATED value) {
        this.calculated = value;
    }

    /**
     * Gets the value of the analysismodifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the analysismodifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getANALYSISMODIFIER().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ANALYSISMODIFIER }
     * 
     * 
     */
    public List<ANALYSISMODIFIER> getANALYSISMODIFIER() {
        if (analysismodifier == null) {
            analysismodifier = new ArrayList<ANALYSISMODIFIER>();
        }
        return this.analysismodifier;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRODUCT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCT }
     * 
     * 
     */
    public List<PRODUCT> getPRODUCT() {
        if (product == null) {
            product = new ArrayList<PRODUCT>();
        }
        return this.product;
    }

    /**
     * Gets the value of the peptide property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peptide property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPEPTIDE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PEPTIDE }
     * 
     * 
     */
    public List<PEPTIDE> getPEPTIDE() {
        if (peptide == null) {
            peptide = new ArrayList<PEPTIDE>();
        }
        return this.peptide;
    }

    /**
     * Gets the value of the querymass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the querymass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQUERYMASS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QUERYMASS }
     * 
     * 
     */
    public List<QUERYMASS> getQUERYMASS() {
        if (querymass == null) {
            querymass = new ArrayList<QUERYMASS>();
        }
        return this.querymass;
    }

    /**
     * Gets the value of the hit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHIT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HIT }
     * 
     * 
     */
    public List<HIT> getHIT() {
        if (hit == null) {
            hit = new ArrayList<HIT>();
        }
        return this.hit;
    }

    /**
     * Gets the value of the entriessearched property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getENTRIESSEARCHED() {
        return entriessearched;
    }

    /**
     * Sets the value of the entriessearched property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setENTRIESSEARCHED(BigInteger value) {
        this.entriessearched = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the timecalculated property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTIMECALCULATED() {
        return timecalculated;
    }

    /**
     * Sets the value of the timecalculated property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTIMECALCULATED(BigInteger value) {
        this.timecalculated = value;
    }

}
