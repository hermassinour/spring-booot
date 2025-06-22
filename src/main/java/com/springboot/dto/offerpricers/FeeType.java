
package com.springboot.dto.offerpricers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Amount added on to a charge for a specific product, purpose, or service.
 * 
 * <p>Java class for FeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}AmountType"/&gt;
 *         &lt;element name="RefundInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DesigText" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}IndType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeType", propOrder = {
    "amount",
    "refundInd",
    "descText",
    "desigText",
    "localAmount",
    "approximateInd"
})
public class FeeType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "RefundInd")
    protected Boolean refundInd;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "DesigText")
    protected String desigText;
    @XmlElement(name = "LocalAmount")
    protected AmountType localAmount;
    @XmlElement(name = "ApproximateInd")
    protected Boolean approximateInd;

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
     * Gets the value of the refundInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the desigText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesigText() {
        return desigText;
    }

    /**
     * Sets the value of the desigText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesigText(String value) {
        this.desigText = value;
    }

    /**
     * Gets the value of the localAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLocalAmount() {
        return localAmount;
    }

    /**
     * Sets the value of the localAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLocalAmount(AmountType value) {
        this.localAmount = value;
    }

    /**
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

}
