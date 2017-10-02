
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Fejlec adatainak leirasara szolgalo tipus
 * 
 * <p>Java class for FejlecTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FejlecTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TranzakcioKod">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="39"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Ido">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}dateTime">
 *               &lt;pattern value=".+T[^Z+\-]+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Szervkod">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="3"/>
 *               &lt;maxLength value="10"/>
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
@XmlType(name = "FejlecTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "tranzakcioKod",
    "ido",
    "szervkod"
})
public class FejlecTipus {

    @XmlElement(name = "TranzakcioKod", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String tranzakcioKod;
    @XmlElement(name = "Ido", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected XMLGregorianCalendar ido;
    @XmlElement(name = "Szervkod", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String szervkod;

    /**
     * Gets the value of the tranzakcioKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranzakcioKod() {
        return tranzakcioKod;
    }

    /**
     * Sets the value of the tranzakcioKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranzakcioKod(String value) {
        this.tranzakcioKod = value;
    }

    /**
     * Gets the value of the ido property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdo() {
        return ido;
    }

    /**
     * Sets the value of the ido property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdo(XMLGregorianCalendar value) {
        this.ido = value;
    }

    /**
     * Gets the value of the szervkod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzervkod() {
        return szervkod;
    }

    /**
     * Sets the value of the szervkod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzervkod(String value) {
        this.szervkod = value;
    }

}
