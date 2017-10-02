
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Fejlec" type="{http://idomsoft.hu/szazig/v1}FejlecTipus"/>
 *         &lt;choice>
 *           &lt;element name="Uzenet" type="{http://idomsoft.hu/szazig/v1}UzenetTipus"/>
 *           &lt;element name="LekerValasz" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fejlec",
    "uzenet",
    "lekerValasz"
})
@XmlRootElement(name = "Valasz", namespace = "http://idomsoft.hu/szazig/v1")
public class Valasz {

    @XmlElement(name = "Fejlec", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected FejlecTipus fejlec;
    @XmlElement(name = "Uzenet", namespace = "http://idomsoft.hu/szazig/v1")
    protected UzenetTipus uzenet;
    @XmlElement(name = "LekerValasz", namespace = "http://idomsoft.hu/szazig/v1")
    protected String lekerValasz;

    /**
     * Gets the value of the fejlec property.
     * 
     * @return
     *     possible object is
     *     {@link FejlecTipus }
     *     
     */
    public FejlecTipus getFejlec() {
        return fejlec;
    }

    /**
     * Sets the value of the fejlec property.
     * 
     * @param value
     *     allowed object is
     *     {@link FejlecTipus }
     *     
     */
    public void setFejlec(FejlecTipus value) {
        this.fejlec = value;
    }

    /**
     * Gets the value of the uzenet property.
     * 
     * @return
     *     possible object is
     *     {@link UzenetTipus }
     *     
     */
    public UzenetTipus getUzenet() {
        return uzenet;
    }

    /**
     * Sets the value of the uzenet property.
     * 
     * @param value
     *     allowed object is
     *     {@link UzenetTipus }
     *     
     */
    public void setUzenet(UzenetTipus value) {
        this.uzenet = value;
    }

    /**
     * Gets the value of the lekerValasz property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLekerValasz() {
        return lekerValasz;
    }

    /**
     * Sets the value of the lekerValasz property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLekerValasz(String value) {
        this.lekerValasz = value;
    }

}
