
package com.cts.fasttack.bank.client.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://sab/}requestId"/&gt;
 *         &lt;element ref="{http://sab/}conversationId"/&gt;
 *         &lt;element ref="{http://sab/}pan"/&gt;
 *         &lt;element ref="{http://sab/}expiryMonth"/&gt;
 *         &lt;element ref="{http://sab/}expiryYear"/&gt;
 *         &lt;element ref="{http://sab/}lang" minOccurs="0"/&gt;
 *         &lt;element ref="{http://sab/}panSource"/&gt;
 *         &lt;element ref="{http://sab/}ips"/&gt;
 *         &lt;element ref="{http://sab/}paymentAppInstId"/&gt;
 *         &lt;element ref="{http://sab/}tokenRequestorId"/&gt;
 *         &lt;element ref="{http://sab/}tokenizationPath"/&gt;
 *         &lt;element ref="{http://sab/}tokenRefId"/&gt;
 *         &lt;element ref="{http://sab/}deviceName"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "requestId",
    "conversationId",
    "pan",
    "expiryMonth",
    "expiryYear",
    "lang",
    "panSource",
    "ips",
    "paymentAppInstId",
    "tokenRefId",
    "tokenRequestorId",
    "tokenizationPath",
    "deviceName"
})
@XmlRootElement(name = "confirmProvisioning", namespace = "http://sab/")
public class ConfirmProvisioning {

    @XmlElement(required = true, namespace = "http://sab/")
    protected String requestId;

    @XmlElement(required = true, namespace = "http://sab/")
    protected String conversationId;

    @XmlElement(required = true, namespace = "http://sab/")
    protected String pan;

    @XmlElement(required = true, namespace = "http://sab/")
    protected String expiryMonth;

    @XmlElement(required = true, namespace = "http://sab/")
    protected String expiryYear;

    @XmlElement(namespace = "http://sab/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String lang;

    @XmlElement(required = true, namespace = "http://sab/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String panSource;

    @XmlElement(required = true, namespace = "http://sab/")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ips;

    @XmlElement(required = true, namespace = "http://sab/")
    protected String tokenizationPath;

    @XmlElement(namespace = "http://sab/")
    protected String paymentAppInstId;

    @XmlElement(namespace = "http://sab/")
    protected String tokenRequestorId;

    @XmlElement(namespace = "http://sab/")
    protected String tokenRefId;

    @XmlElement(namespace = "http://sab/")
    protected String deviceName;

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getConversationId() {
        return conversationId;
    }

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public String getExpiryYear() {
        return expiryYear;
    }

    public void setExpiryYear(String expiryYear) {
        this.expiryYear = expiryYear;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getPanSource() {
        return panSource;
    }

    public void setPanSource(String panSource) {
        this.panSource = panSource;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getPaymentAppInstId() {
        return paymentAppInstId;
    }

    public void setPaymentAppInstId(String paymentAppInstId) {
        this.paymentAppInstId = paymentAppInstId;
    }

    public String getTokenRequestorId() {
        return tokenRequestorId;
    }

    public void setTokenRequestorId(String tokenRequestorId) {
        this.tokenRequestorId = tokenRequestorId;
    }

    public String getTokenRefId() {
        return tokenRefId;
    }

    public void setTokenRefId(String tokenRefId) {
        this.tokenRefId = tokenRefId;
    }

    public String getTokenizationPath() {
        return tokenizationPath;
    }

    public void setTokenizationPath(String tokenizationPath) {
        this.tokenizationPath = tokenizationPath;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
}
