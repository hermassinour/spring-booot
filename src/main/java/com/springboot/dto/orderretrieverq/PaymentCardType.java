
package com.springboot.dto.orderretrieverq;

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
 *         &lt;element name="MaskedCardID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}MaskedCardID_Type" minOccurs="0"/&gt;
 *         &lt;element name="TokenizedCardID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="CreditCardVendorCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PayCardDateSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PayCardDateSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="CardholderName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IndividualType" minOccurs="0"/&gt;
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
    "maskedCardID",
    "tokenizedCardID",
    "creditCardVendorCode",
    "effectiveDate",
    "expirationDate",
    "cardholderName"
})
public class PaymentCardType {

    @XmlElement(name = "MaskedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maskedCardID;
    @XmlElement(name = "TokenizedCardID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tokenizedCardID;
    @XmlElement(name = "CreditCardVendorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditCardVendorCode;
    @XmlElement(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "CardholderName")
    protected IndividualType cardholderName;

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
     * Gets the value of the cardholderName property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getCardholderName() {
        return cardholderName;
    }

    /**
     * Sets the value of the cardholderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setCardholderName(IndividualType value) {
        this.cardholderName = value;
    }

}
