
package com.springboot.dto.orderviewrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Pricing history information for a given Order.
 * 
 * <p>Java class for PriceQuoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceQuoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AmountType"/&gt;
 *         &lt;element name="QuoteDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="SourceText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType"/&gt;
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CommissionType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceQuoteType", propOrder = {
    "amount",
    "quoteDateTime",
    "sourceText",
    "ownerCode",
    "priceGuaranteeTimeLimitDateTime",
    "commission"
})
public class PriceQuoteType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "QuoteDateTime")
    protected DateTimeType quoteDateTime;
    @XmlElement(name = "SourceText")
    protected String sourceText;
    @XmlElement(name = "OwnerCode")
    protected String ownerCode;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime", required = true)
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "Commission", required = true)
    protected CommissionType commission;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the quoteDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getQuoteDateTime() {
        return quoteDateTime;
    }

    /**
     * Sets the value of the quoteDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setQuoteDateTime(DateTimeType value) {
        this.quoteDateTime = value;
    }

    /**
     * Gets the value of the sourceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceText() {
        return sourceText;
    }

    /**
     * Sets the value of the sourceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceText(String value) {
        this.sourceText = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

}
