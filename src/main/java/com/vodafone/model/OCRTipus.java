
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OCRTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OCRTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OCRSor1" type="{http://idomsoft.hu/szazig/v1}OCRSorTipus"/>
 *         &lt;element name="OCRSor2" type="{http://idomsoft.hu/szazig/v1}OCRSorTipus"/>
 *         &lt;element name="OCRSor3" type="{http://idomsoft.hu/szazig/v1}OCRSorTipus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OCRTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "ocrSor1",
    "ocrSor2",
    "ocrSor3"
})
public class OCRTipus {

    @XmlElement(name = "OCRSor1", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String ocrSor1;
    @XmlElement(name = "OCRSor2", namespace = "http://idomsoft.hu/szazig/v1", required = true)
    protected String ocrSor2;
    @XmlElement(name = "OCRSor3", namespace = "http://idomsoft.hu/szazig/v1")
    protected String ocrSor3;

    /**
     * Gets the value of the ocrSor1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCRSor1() {
        return ocrSor1;
    }

    /**
     * Sets the value of the ocrSor1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCRSor1(String value) {
        this.ocrSor1 = value;
    }

    /**
     * Gets the value of the ocrSor2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCRSor2() {
        return ocrSor2;
    }

    /**
     * Sets the value of the ocrSor2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCRSor2(String value) {
        this.ocrSor2 = value;
    }

    /**
     * Gets the value of the ocrSor3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOCRSor3() {
        return ocrSor3;
    }

    /**
     * Sets the value of the ocrSor3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOCRSor3(String value) {
        this.ocrSor3 = value;
    }

}
