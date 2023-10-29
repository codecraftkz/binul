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
 * Тип описывающий адрес местонахождения Ипс Нерезидента
 * 
 * <p>Java class for AddressIpsNerezType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressIpsNerezType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KATO" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistrictRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DistrictKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegionKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetRu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StreetKz" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BuildingNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AppartmentNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressIpsNerezType", propOrder = {
    "kato",
    "districtRu",
    "districtKz",
    "regionRu",
    "regionKz",
    "cityRu",
    "cityKz",
    "streetRu",
    "streetKz",
    "buildingNumber",
    "appartmentNumber"
})
public class AddressIpsNerezType {

    @XmlElement(name = "KATO")
    protected String kato;
    @XmlElement(name = "DistrictRu")
    protected String districtRu;
    @XmlElement(name = "DistrictKz")
    protected String districtKz;
    @XmlElement(name = "RegionRu")
    protected String regionRu;
    @XmlElement(name = "RegionKz")
    protected String regionKz;
    @XmlElement(name = "CityRu")
    protected String cityRu;
    @XmlElement(name = "CityKz")
    protected String cityKz;
    @XmlElement(name = "StreetRu")
    protected String streetRu;
    @XmlElement(name = "StreetKz")
    protected String streetKz;
    @XmlElement(name = "BuildingNumber")
    protected String buildingNumber;
    @XmlElement(name = "AppartmentNumber")
    protected String appartmentNumber;

    /**
     * Gets the value of the kato property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKATO() {
        return kato;
    }

    /**
     * Sets the value of the kato property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKATO(String value) {
        this.kato = value;
    }

    /**
     * Gets the value of the districtRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictRu() {
        return districtRu;
    }

    /**
     * Sets the value of the districtRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictRu(String value) {
        this.districtRu = value;
    }

    /**
     * Gets the value of the districtKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictKz() {
        return districtKz;
    }

    /**
     * Sets the value of the districtKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictKz(String value) {
        this.districtKz = value;
    }

    /**
     * Gets the value of the regionRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionRu() {
        return regionRu;
    }

    /**
     * Sets the value of the regionRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionRu(String value) {
        this.regionRu = value;
    }

    /**
     * Gets the value of the regionKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionKz() {
        return regionKz;
    }

    /**
     * Sets the value of the regionKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionKz(String value) {
        this.regionKz = value;
    }

    /**
     * Gets the value of the cityRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityRu() {
        return cityRu;
    }

    /**
     * Sets the value of the cityRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityRu(String value) {
        this.cityRu = value;
    }

    /**
     * Gets the value of the cityKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityKz() {
        return cityKz;
    }

    /**
     * Sets the value of the cityKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityKz(String value) {
        this.cityKz = value;
    }

    /**
     * Gets the value of the streetRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetRu() {
        return streetRu;
    }

    /**
     * Sets the value of the streetRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetRu(String value) {
        this.streetRu = value;
    }

    /**
     * Gets the value of the streetKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetKz() {
        return streetKz;
    }

    /**
     * Sets the value of the streetKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetKz(String value) {
        this.streetKz = value;
    }

    /**
     * Gets the value of the buildingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingNumber() {
        return buildingNumber;
    }

    /**
     * Sets the value of the buildingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingNumber(String value) {
        this.buildingNumber = value;
    }

    /**
     * Gets the value of the appartmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppartmentNumber() {
        return appartmentNumber;
    }

    /**
     * Sets the value of the appartmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppartmentNumber(String value) {
        this.appartmentNumber = value;
    }

}