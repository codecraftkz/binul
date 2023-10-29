//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.27 at 10:11:58 AM ALMT 
//


package kz.gov.services.gbd.binul;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Тип, описывающий данные справочника
 * 
 * <p>Java class for DirectoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NameRu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="NameKz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectoryType", propOrder = {
    "code",
    "nameRu",
    "nameKz"
})
public class DirectoryType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "NameRu", required = true)
    protected String nameRu;
    @XmlElement(name = "NameKz", required = true)
    protected String nameKz;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the nameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameRu() {
        return nameRu;
    }

    /**
     * Sets the value of the nameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameRu(String value) {
        this.nameRu = value;
    }

    /**
     * Gets the value of the nameKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameKz() {
        return nameKz;
    }

    /**
     * Sets the value of the nameKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameKz(String value) {
        this.nameKz = value;
    }

}