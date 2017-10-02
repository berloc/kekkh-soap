
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OkmanyAdatokTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OkmanyAdatokTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OkmanyAzon">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *               &lt;minLength value="6"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SzemAdatok" type="{http://idomsoft.hu/szazig/v1}SzemadatokTipus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OkmanyAdatokTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "okmanyAzon",
    "szemAdatok"
})
public class OkmanyAdatokTipus {

    @XmlElement(name = "OkmanyAzon", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String okmanyAzon;
    @XmlElement(name = "SzemAdatok", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected SzemadatokTipus szemAdatok;

    /**
     * Gets the value of the okmanyAzon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOkmanyAzon() {
        return okmanyAzon;
    }

    /**
     * Sets the value of the okmanyAzon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOkmanyAzon(String value) {
        this.okmanyAzon = value;
    }

    /**
     * Gets the value of the szemAdatok property.
     * 
     * @return
     *     possible object is
     *     {@link SzemadatokTipus }
     *     
     */
    public SzemadatokTipus getSzemAdatok() {
        return szemAdatok;
    }

    /**
     * Sets the value of the szemAdatok property.
     * 
     * @param value
     *     allowed object is
     *     {@link SzemadatokTipus }
     *     
     */
    public void setSzemAdatok(SzemadatokTipus value) {
        this.szemAdatok = value;
    }

}
