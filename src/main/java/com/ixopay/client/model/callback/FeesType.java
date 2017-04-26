//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.28 at 02:15:42 PM CEST 
//


package com.ixopay.client.model.callback;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for feesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="feesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionAmount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *         &lt;element name="transactionCurrency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *         &lt;element name="providerFeeAmount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *         &lt;element name="providerFeeCurrency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *         &lt;element name="providerPayoutAmount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *         &lt;element name="providerPayoutCurrency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *         &lt;element name="ixopayFeeAmount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *         &lt;element name="ixopayFeeCurrency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *         &lt;element name="ixopayPayoutAmount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *         &lt;element name="ixopayPayoutCurrency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "feesType", propOrder = {
    "transactionAmount",
    "transactionCurrency",
    "providerFeeAmount",
    "providerFeeCurrency",
    "providerPayoutAmount",
    "providerPayoutCurrency",
    "ixopayFeeAmount",
    "ixopayFeeCurrency",
    "ixopayPayoutAmount",
    "ixopayPayoutCurrency"
})
public class FeesType {

    protected BigDecimal transactionAmount;
    protected String transactionCurrency;
    protected BigDecimal providerFeeAmount;
    protected String providerFeeCurrency;
    protected BigDecimal providerPayoutAmount;
    protected String providerPayoutCurrency;
    protected BigDecimal ixopayFeeAmount;
    protected String ixopayFeeCurrency;
    protected BigDecimal ixopayPayoutAmount;
    protected String ixopayPayoutCurrency;

    /**
     * Default no-arg constructor
     * 
     */
    public FeesType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public FeesType(final BigDecimal transactionAmount, final String transactionCurrency, final BigDecimal providerFeeAmount, final String providerFeeCurrency, final BigDecimal providerPayoutAmount, final String providerPayoutCurrency, final BigDecimal ixopayFeeAmount, final String ixopayFeeCurrency, final BigDecimal ixopayPayoutAmount, final String ixopayPayoutCurrency) {
        this.transactionAmount = transactionAmount;
        this.transactionCurrency = transactionCurrency;
        this.providerFeeAmount = providerFeeAmount;
        this.providerFeeCurrency = providerFeeCurrency;
        this.providerPayoutAmount = providerPayoutAmount;
        this.providerPayoutCurrency = providerPayoutCurrency;
        this.ixopayFeeAmount = ixopayFeeAmount;
        this.ixopayFeeCurrency = ixopayFeeCurrency;
        this.ixopayPayoutAmount = ixopayPayoutAmount;
        this.ixopayPayoutCurrency = ixopayPayoutCurrency;
    }

    /**
     * Gets the value of the transactionAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransactionAmount() {
        return transactionAmount;
    }

    /**
     * Sets the value of the transactionAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransactionAmount(BigDecimal value) {
        this.transactionAmount = value;
    }

    /**
     * Gets the value of the transactionCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    /**
     * Sets the value of the transactionCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionCurrency(String value) {
        this.transactionCurrency = value;
    }

    /**
     * Gets the value of the providerFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProviderFeeAmount() {
        return providerFeeAmount;
    }

    /**
     * Sets the value of the providerFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProviderFeeAmount(BigDecimal value) {
        this.providerFeeAmount = value;
    }

    /**
     * Gets the value of the providerFeeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderFeeCurrency() {
        return providerFeeCurrency;
    }

    /**
     * Sets the value of the providerFeeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderFeeCurrency(String value) {
        this.providerFeeCurrency = value;
    }

    /**
     * Gets the value of the providerPayoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProviderPayoutAmount() {
        return providerPayoutAmount;
    }

    /**
     * Sets the value of the providerPayoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProviderPayoutAmount(BigDecimal value) {
        this.providerPayoutAmount = value;
    }

    /**
     * Gets the value of the providerPayoutCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProviderPayoutCurrency() {
        return providerPayoutCurrency;
    }

    /**
     * Sets the value of the providerPayoutCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProviderPayoutCurrency(String value) {
        this.providerPayoutCurrency = value;
    }

    /**
     * Gets the value of the ixopayFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIxopayFeeAmount() {
        return ixopayFeeAmount;
    }

    /**
     * Sets the value of the ixopayFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIxopayFeeAmount(BigDecimal value) {
        this.ixopayFeeAmount = value;
    }

    /**
     * Gets the value of the ixopayFeeCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIxopayFeeCurrency() {
        return ixopayFeeCurrency;
    }

    /**
     * Sets the value of the ixopayFeeCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIxopayFeeCurrency(String value) {
        this.ixopayFeeCurrency = value;
    }

    /**
     * Gets the value of the ixopayPayoutAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIxopayPayoutAmount() {
        return ixopayPayoutAmount;
    }

    /**
     * Sets the value of the ixopayPayoutAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIxopayPayoutAmount(BigDecimal value) {
        this.ixopayPayoutAmount = value;
    }

    /**
     * Gets the value of the ixopayPayoutCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIxopayPayoutCurrency() {
        return ixopayPayoutCurrency;
    }

    /**
     * Sets the value of the ixopayPayoutCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIxopayPayoutCurrency(String value) {
        this.ixopayPayoutCurrency = value;
    }

}
