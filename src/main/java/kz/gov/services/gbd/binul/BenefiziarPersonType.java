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
 * Тип описывающий персональные данные бенефициаров
 * 
 * <p>Java class for BenefiziarPersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BenefiziarPersonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfResidence" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CountryOfCitizenship" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipRelationCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TaxNumberIncCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PersonStatusInGBDFL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Middlename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="IdentityDocument" type="{http://gbdulinfobybin_v2.egp.gbdul.tamur.kz}DocumentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BenefiziarPersonType", propOrder = {
    "countryOfResidence",
    "countryOfCitizenship",
    "citizenshipRelationCode",
    "iin",
    "taxNumberIncCountry",
    "personStatusInGBDFL",
    "surname",
    "name",
    "middlename",
    "birthday",
    "identityDocument"
})
public class BenefiziarPersonType {

    @XmlElement(name = "CountryOfResidence", required = true)
    protected String countryOfResidence;
    @XmlElement(name = "CountryOfCitizenship")
    protected String countryOfCitizenship;
    @XmlElement(name = "CitizenshipRelationCode", required = true)
    protected String citizenshipRelationCode;
    @XmlElement(name = "IIN")
    protected String iin;
    @XmlElement(name = "TaxNumberIncCountry")
    protected String taxNumberIncCountry;
    @XmlElement(name = "PersonStatusInGBDFL")
    protected String personStatusInGBDFL;
    @XmlElement(name = "Surname")
    protected String surname;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Middlename")
    protected String middlename;
    @XmlElement(name = "Birthday")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthday;
    @XmlElement(name = "IdentityDocument")
    protected DocumentType identityDocument;

    /**
     * Gets the value of the countryOfResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    /**
     * Sets the value of the countryOfResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfResidence(String value) {
        this.countryOfResidence = value;
    }

    /**
     * Gets the value of the countryOfCitizenship property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryOfCitizenship() {
        return countryOfCitizenship;
    }

    /**
     * Sets the value of the countryOfCitizenship property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryOfCitizenship(String value) {
        this.countryOfCitizenship = value;
    }

    /**
     * Gets the value of the citizenshipRelationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipRelationCode() {
        return citizenshipRelationCode;
    }

    /**
     * Sets the value of the citizenshipRelationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipRelationCode(String value) {
        this.citizenshipRelationCode = value;
    }

    /**
     * Gets the value of the iin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIIN() {
        return iin;
    }

    /**
     * Sets the value of the iin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIIN(String value) {
        this.iin = value;
    }

    /**
     * Gets the value of the taxNumberIncCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNumberIncCountry() {
        return taxNumberIncCountry;
    }

    /**
     * Sets the value of the taxNumberIncCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNumberIncCountry(String value) {
        this.taxNumberIncCountry = value;
    }

    /**
     * Gets the value of the personStatusInGBDFL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonStatusInGBDFL() {
        return personStatusInGBDFL;
    }

    /**
     * Sets the value of the personStatusInGBDFL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonStatusInGBDFL(String value) {
        this.personStatusInGBDFL = value;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the middlename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddlename() {
        return middlename;
    }

    /**
     * Sets the value of the middlename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddlename(String value) {
        this.middlename = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the identityDocument property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getIdentityDocument() {
        return identityDocument;
    }

    /**
     * Sets the value of the identityDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setIdentityDocument(DocumentType value) {
        this.identityDocument = value;
    }

}