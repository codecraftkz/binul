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
 * Сведения о видах деятельности
 * 
 * <p>Java class for ActivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Main" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OKED" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ActivityNameKz" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ActivityNameRu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActivityType", propOrder = {
    "main",
    "oked",
    "activityNameKz",
    "activityNameRu"
})
public class ActivityType {

    @XmlElement(name = "Main")
    protected boolean main;
    @XmlElement(name = "OKED")
    protected String oked;
    @XmlElement(name = "ActivityNameKz", required = true)
    protected String activityNameKz;
    @XmlElement(name = "ActivityNameRu", required = true)
    protected String activityNameRu;

    /**
     * Gets the value of the main property.
     * 
     */
    public boolean isMain() {
        return main;
    }

    /**
     * Sets the value of the main property.
     * 
     */
    public void setMain(boolean value) {
        this.main = value;
    }

    /**
     * Gets the value of the oked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOKED() {
        return oked;
    }

    /**
     * Sets the value of the oked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOKED(String value) {
        this.oked = value;
    }

    /**
     * Gets the value of the activityNameKz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityNameKz() {
        return activityNameKz;
    }

    /**
     * Sets the value of the activityNameKz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityNameKz(String value) {
        this.activityNameKz = value;
    }

    /**
     * Gets the value of the activityNameRu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivityNameRu() {
        return activityNameRu;
    }

    /**
     * Sets the value of the activityNameRu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivityNameRu(String value) {
        this.activityNameRu = value;
    }

}
