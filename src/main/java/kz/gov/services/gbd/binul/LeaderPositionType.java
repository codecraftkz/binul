//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.27 at 10:11:58 AM ALMT 
//


package kz.gov.services.gbd.binul;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип, описывающий сведения должность руководителя
 * 
 * <p>Java class for LeaderPositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeaderPositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PositionType" type="{http://gbdulinfobybin_v2.egp.gbdul.tamur.kz}DirectoryType"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="LossDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LeaderPositionType", propOrder = {
    "positionType",
    "issueDate",
    "lossDate"
})
public class LeaderPositionType {

    @XmlElement(name = "PositionType", required = true)
    protected DirectoryType positionType;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "LossDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lossDate;

    /**
     * Gets the value of the positionType property.
     * 
     * @return
     *     possible object is
     *     {@link DirectoryType }
     *     
     */
    public DirectoryType getPositionType() {
        return positionType;
    }

    /**
     * Sets the value of the positionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectoryType }
     *     
     */
    public void setPositionType(DirectoryType value) {
        this.positionType = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the lossDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLossDate() {
        return lossDate;
    }

    /**
     * Sets the value of the lossDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLossDate(XMLGregorianCalendar value) {
        this.lossDate = value;
    }

}
