
package com.cts.fasttack.bank.client.ws.client.cardPT;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dealId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="feeClassId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dealId",
    "feeClassId"
})
@XmlRootElement(name = "getCardDealFees")
public class GetCardDealFees {

    @XmlElement(required = true, nillable = true)
    protected String dealId;
    @XmlElement(required = true, nillable = true)
    protected String feeClassId;

    /**
     * Gets the value of the dealId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealId() {
        return dealId;
    }

    /**
     * Sets the value of the dealId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealId(String value) {
        this.dealId = value;
    }

    /**
     * Gets the value of the feeClassId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeClassId() {
        return feeClassId;
    }

    /**
     * Sets the value of the feeClassId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeClassId(String value) {
        this.feeClassId = value;
    }

}
