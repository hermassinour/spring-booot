
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Passenger Type summary information for an offer.
 * 
 * <p>Java class for PTC_OfferParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_OfferParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PTC_PricedCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}IATA_PTC_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PTC_RequestedCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}IATA_PTC_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedPaxNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="PricedPaxNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}NumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_OfferParametersType", propOrder = {
    "ptcPricedCode",
    "ptcRequestedCode",
    "requestedPaxNumber",
    "pricedPaxNumber"
})
public class PTCOfferParametersType {

    @XmlElement(name = "PTC_PricedCode")
    protected String ptcPricedCode;
    @XmlElement(name = "PTC_RequestedCode")
    protected String ptcRequestedCode;
    @XmlElement(name = "RequestedPaxNumber")
    protected BigDecimal requestedPaxNumber;
    @XmlElement(name = "PricedPaxNumber")
    protected BigDecimal pricedPaxNumber;

    /**
     * Gets the value of the ptcPricedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCPricedCode() {
        return ptcPricedCode;
    }

    /**
     * Sets the value of the ptcPricedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTCPricedCode(String value) {
        this.ptcPricedCode = value;
    }

    /**
     * Gets the value of the ptcRequestedCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCRequestedCode() {
        return ptcRequestedCode;
    }

    /**
     * Sets the value of the ptcRequestedCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTCRequestedCode(String value) {
        this.ptcRequestedCode = value;
    }

    /**
     * Gets the value of the requestedPaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRequestedPaxNumber() {
        return requestedPaxNumber;
    }

    /**
     * Sets the value of the requestedPaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRequestedPaxNumber(BigDecimal value) {
        this.requestedPaxNumber = value;
    }

    /**
     * Gets the value of the pricedPaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricedPaxNumber() {
        return pricedPaxNumber;
    }

    /**
     * Sets the value of the pricedPaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricedPaxNumber(BigDecimal value) {
        this.pricedPaxNumber = value;
    }

}
