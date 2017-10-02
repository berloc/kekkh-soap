
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Szemely (SZL adatoknak megfelelo) azonosito adatainak leirasara szolgalo komplex tipus
 * 
 * <p>Java class for SzemadatokTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SzemadatokTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Neve" type="{http://idomsoft.hu/szazig/v1}NevTipus"/>
 *         &lt;element name="Anyaneve" type="{http://idomsoft.hu/szazig/v1}NevTipus" minOccurs="0"/>
 *         &lt;element name="SzuletesiIdo" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="SzuletesiHely">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://idomsoft.hu/szazig/v1}SzuletesiHelyTipus">
 *               &lt;maxLength value="80"/>
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
@XmlType(name = "SzemadatokTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "neve",
    "anyaneve",
    "szuletesiIdo",
    "szuletesiHely"
})
public class SzemadatokTipus {

    @XmlElement(name = "Neve", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected NevTipus neve;
    @XmlElement(name = "Anyaneve", namespace = "http://idomsoft.hu/szazig/v1")
    protected NevTipus anyaneve;
    @XmlElement(name = "SzuletesiIdo", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar szuletesiIdo;
    @XmlElement(name = "SzuletesiHely", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String szuletesiHely;

    /**
     * Gets the value of the neve property.
     * 
     * @return
     *     possible object is
     *     {@link NevTipus }
     *     
     */
    public NevTipus getNeve() {
        return neve;
    }

    /**
     * Sets the value of the neve property.
     * 
     * @param value
     *     allowed object is
     *     {@link NevTipus }
     *     
     */
    public void setNeve(NevTipus value) {
        this.neve = value;
    }

    /**
     * Gets the value of the anyaneve property.
     * 
     * @return
     *     possible object is
     *     {@link NevTipus }
     *     
     */
    public NevTipus getAnyaneve() {
        return anyaneve;
    }

    /**
     * Sets the value of the anyaneve property.
     * 
     * @param value
     *     allowed object is
     *     {@link NevTipus }
     *     
     */
    public void setAnyaneve(NevTipus value) {
        this.anyaneve = value;
    }

    /**
     * Gets the value of the szuletesiIdo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSzuletesiIdo() {
        return szuletesiIdo;
    }

    /**
     * Sets the value of the szuletesiIdo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSzuletesiIdo(XMLGregorianCalendar value) {
        this.szuletesiIdo = value;
    }

    /**
     * Gets the value of the szuletesiHely property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSzuletesiHely() {
        return szuletesiHely;
    }

    /**
     * Sets the value of the szuletesiHely property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSzuletesiHely(String value) {
        this.szuletesiHely = value;
    }

}
