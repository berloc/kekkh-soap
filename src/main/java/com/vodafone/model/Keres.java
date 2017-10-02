
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
 *         &lt;element name="OkmanyTipus">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="10"/>
 *               &lt;minLength value="3"/>
 *               &lt;enumeration value="SZIG"/>
 *               &lt;enumeration value="UTL"/>
 *               &lt;enumeration value="VEN"/>
 *               &lt;enumeration value="RSZIG"/>
 *               &lt;enumeration value="OCRSZIG"/>
 *               &lt;enumeration value="OCRUTL"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Adatok" type="{http://idomsoft.hu/szazig/v1}AdatokTipus"/>
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
    "okmanyTipus",
    "adatok"
})
@XmlRootElement(name = "Keres", namespace = "http://idomsoft.hu/szazig/v1")
public class Keres {

    @XmlElement(name = "Fejlec", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected FejlecTipus fejlec;
    @XmlElement(name = "OkmanyTipus", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String okmanyTipus;
    @XmlElement(name = "Adatok", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected AdatokTipus adatok;

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
     * Gets the value of the okmanyTipus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkmanyTipus() {
        return okmanyTipus;
    }

    /**
     * Sets the value of the okmanyTipus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkmanyTipus(String value) {
        this.okmanyTipus = value;
    }

    /**
     * Gets the value of the adatok property.
     * 
     * @return
     *     possible object is
     *     {@link AdatokTipus }
     *     
     */
    public AdatokTipus getAdatok() {
        return adatok;
    }

    /**
     * Sets the value of the adatok property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdatokTipus }
     *     
     */
    public void setAdatok(AdatokTipus value) {
        this.adatok = value;
    }

}
