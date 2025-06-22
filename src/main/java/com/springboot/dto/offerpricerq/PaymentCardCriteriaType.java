
package com.springboot.dto.offerpricerq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Requested card issuer type and identification number.
 * 
 * <p>Java class for PaymentCardCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CreditCardVendorCodeType"/&gt;
 *         &lt;element name="IssuerIdentificationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChargeAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ChargePercent" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="CardIssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CountryCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardCriteriaType", propOrder = {
    "cardTypeCode",
    "issuerIdentificationNumber",
    "chargeAmount",
    "chargePercent",
    "cardIssuingCountryCode"
})
public class PaymentCardCriteriaType {

    @XmlElement(name = "CardTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cardTypeCode;
    @XmlElement(name = "IssuerIdentificationNumber")
    protected String issuerIdentificationNumber;
    @XmlElement(name = "ChargeAmount")
    protected AmountType chargeAmount;
    @XmlElement(name = "ChargePercent")
    protected BigDecimal chargePercent;
    @XmlElement(name = "CardIssuingCountryCode")
    protected String cardIssuingCountryCode;

    /**
     * Gets the value of the cardTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardTypeCode() {
        return cardTypeCode;
    }

    /**
     * Sets the value of the cardTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardTypeCode(String value) {
        this.cardTypeCode = value;
    }

    /**
     * Gets the value of the issuerIdentificationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerIdentificationNumber() {
        return issuerIdentificationNumber;
    }

    /**
     * Sets the value of the issuerIdentificationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerIdentificationNumber(String value) {
        this.issuerIdentificationNumber = value;
    }

    /**
     * Gets the value of the chargeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getChargeAmount() {
        return chargeAmount;
    }

    /**
     * Sets the value of the chargeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setChargeAmount(AmountType value) {
        this.chargeAmount = value;
    }

    /**
     * Gets the value of the chargePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getChargePercent() {
        return chargePercent;
    }

    /**
     * Sets the value of the chargePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setChargePercent(BigDecimal value) {
        this.chargePercent = value;
    }

    /**
     * Gets the value of the cardIssuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardIssuingCountryCode() {
        return cardIssuingCountryCode;
    }

    /**
     * Sets the value of the cardIssuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardIssuingCountryCode(String value) {
        this.cardIssuingCountryCode = value;
    }

}
