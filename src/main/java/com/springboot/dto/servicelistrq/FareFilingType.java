
package com.springboot.dto.servicelistrq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * FARE FILING definition.
 * 
 * <p>Java class for FareFilingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareFilingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CurrencyAmountOptType"/&gt;
 *         &lt;element name="NUC_Amount" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ExchangeRate" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="TicketBulkMask" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}FiledFare" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFilingType", propOrder = {
    "baseAmount",
    "nucAmount",
    "exchangeRate",
    "ticketBulkMask",
    "filedFare"
})
public class FareFilingType {

    @XmlElement(name = "BaseAmount", required = true)
    protected CurrencyAmountOptType baseAmount;
    @XmlElement(name = "NUC_Amount")
    protected BigDecimal nucAmount;
    @XmlElement(name = "ExchangeRate")
    protected String exchangeRate;
    @XmlElement(name = "TicketBulkMask")
    protected String ticketBulkMask;
    @XmlElement(name = "FiledFare")
    protected FiledFare filedFare;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the baseAmount property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getBaseAmount() {
        return baseAmount;
    }

    /**
     * Sets the value of the baseAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setBaseAmount(CurrencyAmountOptType value) {
        this.baseAmount = value;
    }

    /**
     * Gets the value of the nucAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNUCAmount() {
        return nucAmount;
    }

    /**
     * Sets the value of the nucAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNUCAmount(BigDecimal value) {
        this.nucAmount = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRate() {
        return exchangeRate;
    }

    /**
     * Sets the value of the exchangeRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRate(String value) {
        this.exchangeRate = value;
    }

    /**
     * Gets the value of the ticketBulkMask property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketBulkMask() {
        return ticketBulkMask;
    }

    /**
     * Sets the value of the ticketBulkMask property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketBulkMask(String value) {
        this.ticketBulkMask = value;
    }

    /**
     * Filed fare information that may contain specific indicators applicable to the use of filed fares scenarios.
     * 
     * @return
     *     possible object is
     *     {@link FiledFare }
     *     
     */
    public FiledFare getFiledFare() {
        return filedFare;
    }

    /**
     * Sets the value of the filedFare property.
     * 
     * @param value
     *     allowed object is
     *     {@link FiledFare }
     *     
     */
    public void setFiledFare(FiledFare value) {
        this.filedFare = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

}
