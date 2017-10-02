
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * csaladi es utonev kulon mezoben
 * 
 * <p>Java class for BontottNevTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BontottNevTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VezNev">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://idomsoft.hu/szazig/v1}VeznevTipus">
 *               &lt;maxLength value="200"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UtoNev">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://idomsoft.hu/szazig/v1}UtonevTipus">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BontottNevTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "vezNev",
    "utoNev"
})
public class BontottNevTipus {

    @XmlElement(name = "VezNev", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String vezNev;
    @XmlElement(name = "UtoNev", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String utoNev;

    /**
     * Gets the value of the vezNev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVezNev() {
        return vezNev;
    }

    /**
     * Sets the value of the vezNev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVezNev(String value) {
        this.vezNev = value;
    }

    /**
     * Gets the value of the utoNev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUtoNev() {
        return utoNev;
    }

    /**
     * Sets the value of the utoNev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUtoNev(String value) {
        this.utoNev = value;
    }

}
