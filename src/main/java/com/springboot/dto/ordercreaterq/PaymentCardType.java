
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A device that enables its owner (the cardholder) to make a payment by electronic funds transfer.
 * 
 * <p>Java class for PaymentCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PaymentCardNumberType" minOccurs="0"/&gt;
 *         &lt;element name="MaskedCardID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}MaskedCardID_Type" minOccurs="0"/&gt;
 *         &lt;element name="TokenizedCardID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="SeriesCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PaymentApprovalCodeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuerName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="CardTypeText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardVendorCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PayCardDateSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PayCardDateSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="CardholderContactInfo" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PostalAddressType" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SurchargeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardNumber",
    "maskedCardID",
    "tokenizedCardID",
    "seriesCode",
    "approvalCode",
    "cardIssuerName",
    "cardTypeText",
    "creditCardVendorCode",
    "effectiveDate",
    "expirationDate",
    "reconciliationID",
    "cardholderContactInfo",
    "surcharge"
})
public class PaymentCardType {

    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "MaskedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maskedCardID;
    @XmlElement(name = "TokenizedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tokenizedCardID;
    @XmlElement(name = "SeriesCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seriesCode;
    @XmlElement(name = "ApprovalCode")
    protected String approvalCode;
    @XmlElement(name = "CardIssuerName")
    protected ProperNameType cardIssuerName;
    @XmlElement(name = "CardTypeText")
    protected String cardTypeText;
    @XmlElement(name = "CreditCardVendorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditCardVendorCode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "ReconciliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reconciliationID;
    @XmlElement(name = "CardholderContactInfo")
    protected PostalAddressType cardholderContactInfo;
    @XmlElement(name = "Surcharge")
    protected SurchargeType surcharge;

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the maskedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardID() {
        return maskedCardID;
    }

    /**
     * Sets the value of the maskedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardID(String value) {
        this.maskedCardID = value;
    }

    /**
     * Gets the value of the tokenizedCardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTokenizedCardID() {
        return tokenizedCardID;
    }

    /**
     * Sets the value of the tokenizedCardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTokenizedCardID(String value) {
        this.tokenizedCardID = value;
    }

    /**
     * Gets the value of the seriesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /**
     * Sets the value of the seriesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesCode(String value) {
        this.seriesCode = value;
    }

    /**
     * Gets the value of the approvalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalCode() {
        return approvalCode;
    }

    /**
     * Sets the value of the approvalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalCode(String value) {
        this.approvalCode = value;
    }

    /**
     * Gets the value of the cardIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link ProperNameType }
     *     
     */
    public ProperNameType getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * Sets the value of the cardIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProperNameType }
     *     
     */
    public void setCardIssuerName(ProperNameType value) {
        this.cardIssuerName = value;
    }

    /**
     * Gets the value of the cardTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeText() {
        return cardTypeText;
    }

    /**
     * Sets the value of the cardTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeText(String value) {
        this.cardTypeText = value;
    }

    /**
     * Gets the value of the creditCardVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVendorCode() {
        return creditCardVendorCode;
    }

    /**
     * Sets the value of the creditCardVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVendorCode(String value) {
        this.creditCardVendorCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the reconciliationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReconciliationID() {
        return reconciliationID;
    }

    /**
     * Sets the value of the reconciliationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReconciliationID(String value) {
        this.reconciliationID = value;
    }

    /**
     * Gets the value of the cardholderContactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getCardholderContactInfo() {
        return cardholderContactInfo;
    }

    /**
     * Sets the value of the cardholderContactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setCardholderContactInfo(PostalAddressType value) {
        this.cardholderContactInfo = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link SurchargeType }
     *     
     */
    public SurchargeType getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargeType }
     *     
     */
    public void setSurcharge(SurchargeType value) {
        this.surcharge = value;
    }

}
