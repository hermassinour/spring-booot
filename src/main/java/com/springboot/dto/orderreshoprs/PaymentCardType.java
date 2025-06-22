
package com.springboot.dto.orderreshoprs;

import java.math.BigDecimal;
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
 *         &lt;element name="CardType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardVendorCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CardNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CardHolderName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuerName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="MaskedCardNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="TokenizedCardNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="ApprovalCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PaymentApprovalCodeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PayCardDateSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PayCardDateSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ReconciliationID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" minOccurs="0"/&gt;
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
    "cardType",
    "creditCardVendorCode",
    "cardNumber",
    "cardHolderName",
    "cardIssuerName",
    "maskedCardNumber",
    "tokenizedCardNumber",
    "approvalCode",
    "effectiveDate",
    "expirationDate",
    "reconciliationID",
    "contactInfoRefID"
})
public class PaymentCardType {

    @XmlElement(name = "CardType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardType;
    @XmlElement(name = "CreditCardVendorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditCardVendorCode;
    @XmlElement(name = "CardNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardNumber;
    @XmlElement(name = "CardHolderName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardHolderName;
    @XmlElement(name = "CardIssuerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardIssuerName;
    @XmlElement(name = "MaskedCardNumber")
    protected BigDecimal maskedCardNumber;
    @XmlElement(name = "TokenizedCardNumber")
    protected BigDecimal tokenizedCardNumber;
    @XmlElement(name = "ApprovalCode")
    protected String approvalCode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "ReconciliationID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reconciliationID;
    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoRefID;

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
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
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cardIssuerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * Sets the value of the cardIssuerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuerName(String value) {
        this.cardIssuerName = value;
    }

    /**
     * Gets the value of the maskedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * Sets the value of the maskedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaskedCardNumber(BigDecimal value) {
        this.maskedCardNumber = value;
    }

    /**
     * Gets the value of the tokenizedCardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTokenizedCardNumber() {
        return tokenizedCardNumber;
    }

    /**
     * Sets the value of the tokenizedCardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTokenizedCardNumber(BigDecimal value) {
        this.tokenizedCardNumber = value;
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
     * Gets the value of the contactInfoRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefID() {
        return contactInfoRefID;
    }

    /**
     * Sets the value of the contactInfoRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoRefID(String value) {
        this.contactInfoRefID = value;
    }

}
