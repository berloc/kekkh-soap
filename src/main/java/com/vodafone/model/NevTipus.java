
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Bontott nev + osszevont nev
 * 
 * <p>Java class for NevTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NevTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="BontottNev" type="{http://idomsoft.hu/szazig/v1}BontottNevTipus"/>
 *         &lt;element name="TotalNev">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://idomsoft.hu/szazig/v1}OsszevontnevTipus">
 *               &lt;maxLength value="300"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NevTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "bontottNev",
    "totalNev"
})
public class NevTipus {

    @XmlElement(name = "BontottNev", namespace = "http://idomsoft.hu/szazig/v1")
    protected BontottNevTipus bontottNev;
    @XmlElement(name = "TotalNev", namespace = "http://idomsoft.hu/szazig/v1")
    protected String totalNev;

    /**
     * Gets the value of the bontottNev property.
     * 
     * @return
     *     possible object is
     *     {@link BontottNevTipus }
     *     
     */
    public BontottNevTipus getBontottNev() {
        return bontottNev;
    }

    /**
     * Sets the value of the bontottNev property.
     * 
     * @param value
     *     allowed object is
     *     {@link BontottNevTipus }
     *     
     */
    public void setBontottNev(BontottNevTipus value) {
        this.bontottNev = value;
    }

    /**
     * Gets the value of the totalNev property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNev() {
        return totalNev;
    }

    /**
     * Sets the value of the totalNev property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNev(String value) {
        this.totalNev = value;
    }

}
