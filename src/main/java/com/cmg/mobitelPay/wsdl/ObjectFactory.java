
package com.cmg.mobitelPay.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
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

    private final static QName _MsisdnInfoResponse_QNAME = new QName("http://ws/", "msisdnInfoResponse");
    private final static QName _ChargeFromMSISDNResponse_QNAME = new QName("http://ws/", "chargeFromMSISDNResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://ws/", "helloResponse");
    private final static QName _CheckBalanceResponse_QNAME = new QName("http://ws/", "checkBalanceResponse");
    private final static QName _CheckPrepaidBalance_QNAME = new QName("http://ws/", "checkPrepaidBalance");
    private final static QName _CheckPrepaidBalanceResponse_QNAME = new QName("http://ws/", "checkPrepaidBalanceResponse");
    private final static QName _MsisdnInfo_QNAME = new QName("http://ws/", "msisdnInfo");
    private final static QName _ChargeFromMSISDN_QNAME = new QName("http://ws/", "chargeFromMSISDN");
    private final static QName _Hello_QNAME = new QName("http://ws/", "hello");
    private final static QName _CheckBalance_QNAME = new QName("http://ws/", "checkBalance");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MsisdnInfoResponse }
     * 
     */
    public MsisdnInfoResponse createMsisdnInfoResponse() {
        return new MsisdnInfoResponse();
    }

    /**
     * Create an instance of {@link ChargeFromMSISDNResponse }
     * 
     */
    public ChargeFromMSISDNResponse createChargeFromMSISDNResponse() {
        return new ChargeFromMSISDNResponse();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CheckBalanceResponse }
     * 
     */
    public CheckBalanceResponse createCheckBalanceResponse() {
        return new CheckBalanceResponse();
    }

    /**
     * Create an instance of {@link CheckPrepaidBalance }
     * 
     */
    public CheckPrepaidBalance createCheckPrepaidBalance() {
        return new CheckPrepaidBalance();
    }

    /**
     * Create an instance of {@link CheckPrepaidBalanceResponse }
     * 
     */
    public CheckPrepaidBalanceResponse createCheckPrepaidBalanceResponse() {
        return new CheckPrepaidBalanceResponse();
    }

    /**
     * Create an instance of {@link MsisdnInfo }
     * 
     */
    public MsisdnInfo createMsisdnInfo() {
        return new MsisdnInfo();
    }

    /**
     * Create an instance of {@link ChargeFromMSISDN }
     * 
     */
    public ChargeFromMSISDN createChargeFromMSISDN() {
        return new ChargeFromMSISDN();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CheckBalance }
     * 
     */
    public CheckBalance createCheckBalance() {
        return new CheckBalance();
    }

    /**
     * Create an instance of {@link InfoResult }
     * 
     */
    public InfoResult createInfoResult() {
        return new InfoResult();
    }

    /**
     * Create an instance of {@link BalanceResult }
     * 
     */
    public BalanceResult createBalanceResult() {
        return new BalanceResult();
    }

    /**
     * Create an instance of {@link ChgRequest }
     * 
     */
    public ChgRequest createChgRequest() {
        return new ChgRequest();
    }

    /**
     * Create an instance of {@link ChgResult }
     * 
     */
    public ChgResult createChgResult() {
        return new ChgResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsisdnInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "msisdnInfoResponse")
    public JAXBElement<MsisdnInfoResponse> createMsisdnInfoResponse(MsisdnInfoResponse value) {
        return new JAXBElement<MsisdnInfoResponse>(_MsisdnInfoResponse_QNAME, MsisdnInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeFromMSISDNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "chargeFromMSISDNResponse")
    public JAXBElement<ChargeFromMSISDNResponse> createChargeFromMSISDNResponse(ChargeFromMSISDNResponse value) {
        return new JAXBElement<ChargeFromMSISDNResponse>(_ChargeFromMSISDNResponse_QNAME, ChargeFromMSISDNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "checkBalanceResponse")
    public JAXBElement<CheckBalanceResponse> createCheckBalanceResponse(CheckBalanceResponse value) {
        return new JAXBElement<CheckBalanceResponse>(_CheckBalanceResponse_QNAME, CheckBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPrepaidBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "checkPrepaidBalance")
    public JAXBElement<CheckPrepaidBalance> createCheckPrepaidBalance(CheckPrepaidBalance value) {
        return new JAXBElement<CheckPrepaidBalance>(_CheckPrepaidBalance_QNAME, CheckPrepaidBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPrepaidBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "checkPrepaidBalanceResponse")
    public JAXBElement<CheckPrepaidBalanceResponse> createCheckPrepaidBalanceResponse(CheckPrepaidBalanceResponse value) {
        return new JAXBElement<CheckPrepaidBalanceResponse>(_CheckPrepaidBalanceResponse_QNAME, CheckPrepaidBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsisdnInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "msisdnInfo")
    public JAXBElement<MsisdnInfo> createMsisdnInfo(MsisdnInfo value) {
        return new JAXBElement<MsisdnInfo>(_MsisdnInfo_QNAME, MsisdnInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChargeFromMSISDN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "chargeFromMSISDN")
    public JAXBElement<ChargeFromMSISDN> createChargeFromMSISDN(ChargeFromMSISDN value) {
        return new JAXBElement<ChargeFromMSISDN>(_ChargeFromMSISDN_QNAME, ChargeFromMSISDN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "checkBalance")
    public JAXBElement<CheckBalance> createCheckBalance(CheckBalance value) {
        return new JAXBElement<CheckBalance>(_CheckBalance_QNAME, CheckBalance.class, null, value);
    }

}
