
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * viseltnev (optionalis) es szuletesi nev
 * 
 * <p>Java class for NevekTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NevekTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nev1" type="{http://idomsoft.hu/szazig/v1}NevTipus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NevekTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "nev1"
})
public class NevekTipus {

    @XmlElement(name = "Nev1", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected NevTipus nev1;

    /**
     * Gets the value of the nev1 property.
     * 
     * @return
     *     possible object is
     *     {@link NevTipus }
     *     
     */
    public NevTipus getNev1() {
        return nev1;
    }

    /**
     * Sets the value of the nev1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NevTipus }
     *     
     */
    public void setNev1(NevTipus value) {
        this.nev1 = value;
    }

}
