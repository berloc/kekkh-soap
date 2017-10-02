
package com.vodafone.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.vodafone.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UzenetLista_QNAME = new QName("http://idomsoft.hu/szazig/v1", "UzenetLista");
    private final static QName _LekerValasz_QNAME = new QName("http://idomsoft.hu/szazig/v1", "LekerValasz");
    private final static QName _UzenetKateg_QNAME = new QName("http://idomsoft.hu/szazig/v1", "UzenetKateg");
    private final static QName _UzenetKod_QNAME = new QName("http://idomsoft.hu/szazig/v1", "UzenetKod");
    private final static QName _UzenetLeiras_QNAME = new QName("http://idomsoft.hu/szazig/v1", "UzenetLeiras");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.vodafone.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Keres }
     * 
     */
    public Keres createKeres() {
        return new Keres();
    }

    /**
     * Create an instance of {@link FejlecTipus }
     * 
     */
    public FejlecTipus createFejlecTipus() {
        return new FejlecTipus();
    }

    /**
     * Create an instance of {@link AdatokTipus }
     * 
     */
    public AdatokTipus createAdatokTipus() {
        return new AdatokTipus();
    }

    /**
     * Create an instance of {@link Valasz }
     * 
     */
    public Valasz createValasz() {
        return new Valasz();
    }

    /**
     * Create an instance of {@link UzenetTipus }
     * 
     */
    public UzenetTipus createUzenetTipus() {
        return new UzenetTipus();
    }

    /**
     * Create an instance of {@link NevTipus }
     * 
     */
    public NevTipus createNevTipus() {
        return new NevTipus();
    }

    /**
     * Create an instance of {@link OCRTipus }
     * 
     */
    public OCRTipus createOCRTipus() {
        return new OCRTipus();
    }

    /**
     * Create an instance of {@link SzemadatokTipus }
     * 
     */
    public SzemadatokTipus createSzemadatokTipus() {
        return new SzemadatokTipus();
    }

    /**
     * Create an instance of {@link BontottNevTipus }
     * 
     */
    public BontottNevTipus createBontottNevTipus() {
        return new BontottNevTipus();
    }

    /**
     * Create an instance of {@link NevekTipus }
     * 
     */
    public NevekTipus createNevekTipus() {
        return new NevekTipus();
    }

    /**
     * Create an instance of {@link OkmanyAdatokTipus }
     * 
     */
    public OkmanyAdatokTipus createOkmanyAdatokTipus() {
        return new OkmanyAdatokTipus();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UzenetTipus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://idomsoft.hu/szazig/v1", name = "UzenetLista")
    public JAXBElement<UzenetTipus> createUzenetLista(UzenetTipus value) {
        return new JAXBElement<UzenetTipus>(_UzenetLista_QNAME, UzenetTipus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://idomsoft.hu/szazig/v1", name = "LekerValasz")
    public JAXBElement<String> createLekerValasz(String value) {
        return new JAXBElement<String>(_LekerValasz_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://idomsoft.hu/szazig/v1", name = "UzenetKateg")
    public JAXBElement<String> createUzenetKateg(String value) {
        return new JAXBElement<String>(_UzenetKateg_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://idomsoft.hu/szazig/v1", name = "UzenetKod")
    public JAXBElement<String> createUzenetKod(String value) {
        return new JAXBElement<String>(_UzenetKod_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://idomsoft.hu/szazig/v1", name = "UzenetLeiras")
    public JAXBElement<String> createUzenetLeiras(String value) {
        return new JAXBElement<String>(_UzenetLeiras_QNAME, String.class, null, value);
    }

}
