//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.28 at 02:15:42 PM CEST 
//


package com.ixopay.client.model.callback;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for callbackType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="callbackType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://gateway.ixopay.com/Schema/V2/Callback}resultType"/>
 *         &lt;element name="referenceId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="purchaseId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transactionType" type="{http://gateway.ixopay.com/Schema/V2/Callback}transactionMethodType" minOccurs="0"/>
 *         &lt;element name="amount" type="{http://gateway.ixopay.com/Schema/V2/Callback}amountType" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://gateway.ixopay.com/Schema/V2/Callback}currencyType" minOccurs="0"/>
 *         &lt;element name="errors" type="{http://gateway.ixopay.com/Schema/V2/Callback}errorsType" minOccurs="0"/>
 *         &lt;element name="chargebackData" type="{http://gateway.ixopay.com/Schema/V2/Callback}chargebackDataType" minOccurs="0"/>
 *         &lt;element name="extraData" type="{http://gateway.ixopay.com/Schema/V2/Callback}extraDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="returnData" type="{http://gateway.ixopay.com/Schema/V2/Callback}returnDataType" minOccurs="0"/>
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
    "result",
    "referenceId",
    "transactionId",
    "purchaseId",
    "transactionType",
    "amount",
    "currency",
    "errors",
    "chargebackData",
    "extraData",
    "returnData"
})
@XmlSeeAlso({
    CallbackType.class
})
@XmlRootElement(name = "callback")
public class OriginalCallbackType {

    @XmlElement(required = true)
    protected ResultType result;
    protected String referenceId;
    protected String transactionId;
    protected String purchaseId;
    protected TransactionMethodType transactionType;
    protected BigDecimal amount;
    protected String currency;
    protected ErrorsType errors;
    protected ChargebackDataType chargebackData;
    protected List<ExtraDataType> extraData;
    protected ReturnDataType returnData;

    /**
     * Default no-arg constructor
     * 
     */
    public OriginalCallbackType() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public OriginalCallbackType(final ResultType result, final String referenceId, final String transactionId, final String purchaseId, final TransactionMethodType transactionType, final BigDecimal amount, final String currency, final ErrorsType errors, final ChargebackDataType chargebackData, final List<ExtraDataType> extraData, final ReturnDataType returnData) {
        this.result = result;
        this.referenceId = referenceId;
        this.transactionId = transactionId;
        this.purchaseId = purchaseId;
        this.transactionType = transactionType;
        this.amount = amount;
        this.currency = currency;
        this.errors = errors;
        this.chargebackData = chargebackData;
        this.extraData = extraData;
        this.returnData = returnData;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ResultType }
     *     
     */
    public ResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultType }
     *     
     */
    public void setResult(ResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the referenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Sets the value of the referenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceId(String value) {
        this.referenceId = value;
    }

    /**
     * Gets the value of the transactionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the value of the transactionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Gets the value of the purchaseId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseId() {
        return purchaseId;
    }

    /**
     * Sets the value of the purchaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseId(String value) {
        this.purchaseId = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionMethodType }
     *     
     */
    public TransactionMethodType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionMethodType }
     *     
     */
    public void setTransactionType(TransactionMethodType value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorsType }
     *     
     */
    public ErrorsType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorsType }
     *     
     */
    public void setErrors(ErrorsType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the chargebackData property.
     * 
     * @return
     *     possible object is
     *     {@link ChargebackDataType }
     *     
     */
    public ChargebackDataType getChargebackData() {
        return chargebackData;
    }

    /**
     * Sets the value of the chargebackData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargebackDataType }
     *     
     */
    public void setChargebackData(ChargebackDataType value) {
        this.chargebackData = value;
    }

    /**
     * Gets the value of the extraData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraDataType }
     * 
     * 
     */
    public List<ExtraDataType> getExtraData() {
        if (extraData == null) {
            extraData = new ArrayList<ExtraDataType>();
        }
        return this.extraData;
    }

    /**
     * Gets the value of the returnData property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnDataType }
     *     
     */
    public ReturnDataType getReturnData() {
        return returnData;
    }

    /**
     * Sets the value of the returnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnDataType }
     *     
     */
    public void setReturnData(ReturnDataType value) {
        this.returnData = value;
    }

}
