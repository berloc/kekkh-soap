
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Adott hiba leirasra szolgalo struktura tipusa
 * 
 * <p>Java class for UzenetTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UzenetTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://idomsoft.hu/szazig/v1}UzenetKod"/>
 *         &lt;element ref="{http://idomsoft.hu/szazig/v1}UzenetKateg"/>
 *         &lt;element ref="{http://idomsoft.hu/szazig/v1}UzenetLeiras" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UzenetTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "uzenetKod",
    "uzenetKateg",
    "uzenetLeiras"
})
public class UzenetTipus {

    @XmlElement(name = "UzenetKod", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String uzenetKod;
    @XmlElement(name = "UzenetKateg", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String uzenetKateg;
    @XmlElement(name = "UzenetLeiras", namespace = "http://idomsoft.hu/szazig/v1")
    protected String uzenetLeiras;

    /**
     * Gets the value of the uzenetKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzenetKod() {
        return uzenetKod;
    }

    /**
     * Sets the value of the uzenetKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzenetKod(String value) {
        this.uzenetKod = value;
    }

    /**
     * Gets the value of the uzenetKateg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzenetKateg() {
        return uzenetKateg;
    }

    /**
     * Sets the value of the uzenetKateg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzenetKateg(String value) {
        this.uzenetKateg = value;
    }

    /**
     * Gets the value of the uzenetLeiras property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUzenetLeiras() {
        return uzenetLeiras;
    }

    /**
     * Sets the value of the uzenetLeiras property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUzenetLeiras(String value) {
        this.uzenetLeiras = value;
    }

}
