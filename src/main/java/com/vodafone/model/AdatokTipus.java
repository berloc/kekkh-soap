
package com.vodafone.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  4T adatok vagy OCR sorok
 * 
 * <p>Java class for AdatokTipus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdatokTipus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="OkmanyAdatok" type="{http://idomsoft.hu/szazig/v1}OkmanyAdatokTipus"/>
 *         &lt;element name="OCR" type="{http://idomsoft.hu/szazig/v1}OCRTipus"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdatokTipus", namespace = "http://idomsoft.hu/szazig/v1", propOrder = {
    "okmanyAdatok",
    "ocr"
})
public class AdatokTipus {

    @XmlElement(name = "OkmanyAdatok", namespace = "http://idomsoft.hu/szazig/v1")
    protected OkmanyAdatokTipus okmanyAdatok;
    @XmlElement(name = "OCR", namespace = "http://idomsoft.hu/szazig/v1")
    protected OCRTipus ocr;

    /**
     * Gets the value of the okmanyAdatok property.
     * 
     * @return
     *     possible object is
     *     {@link OkmanyAdatokTipus }
     *     
     */
    public OkmanyAdatokTipus getOkmanyAdatok() {
        return okmanyAdatok;
    }

    /**
     * Sets the value of the okmanyAdatok property.
     * 
     * @param value
     *     allowed object is
     *     {@link OkmanyAdatokTipus }
     *     
     */
    public void setOkmanyAdatok(OkmanyAdatokTipus value) {
        this.okmanyAdatok = value;
    }

    /**
     * Gets the value of the ocr property.
     * 
     * @return
     *     possible object is
     *     {@link OCRTipus }
     *     
     */
    public OCRTipus getOCR() {
        return ocr;
    }

    /**
     * Sets the value of the ocr property.
     * 
     * @param value
     *     allowed object is
     *     {@link OCRTipus }
     *     
     */
    public void setOCR(OCRTipus value) {
        this.ocr = value;
    }

}
