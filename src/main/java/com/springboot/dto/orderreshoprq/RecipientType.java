
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Message recipient information.
 * 
 * <p>Java class for RecipientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecipientType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AggregatorType"/&gt;
 *         &lt;element name="EnabledSystem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}EnabledSystemType"/&gt;
 *         &lt;element name="Corporation" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CorporationType"/&gt;
 *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CarrierType"/&gt;
 *         &lt;element name="OperatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CarrierType"/&gt;
 *         &lt;element name="ORA" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CarrierType"/&gt;
 *         &lt;element name="POA" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CarrierType"/&gt;
 *         &lt;element name="RetailPartner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}RetailPartnerType"/&gt;
 *         &lt;element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TravelAgencyType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecipientType", propOrder = {
    "aggregator",
    "enabledSystem",
    "corporation",
    "marketingCarrier",
    "operatingCarrier",
    "ora",
    "poa",
    "retailPartner",
    "travelAgency"
})
public class RecipientType {

    @XmlElement(name = "Aggregator")
    protected AggregatorType aggregator;
    @XmlElement(name = "EnabledSystem")
    protected EnabledSystemType enabledSystem;
    @XmlElement(name = "Corporation")
    protected CorporationType corporation;
    @XmlElement(name = "MarketingCarrier")
    protected CarrierType marketingCarrier;
    @XmlElement(name = "OperatingCarrier")
    protected CarrierType operatingCarrier;
    @XmlElement(name = "ORA")
    protected CarrierType ora;
    @XmlElement(name = "POA")
    protected CarrierType poa;
    @XmlElement(name = "RetailPartner")
    protected RetailPartnerType retailPartner;
    @XmlElement(name = "TravelAgency")
    protected TravelAgencyType travelAgency;

    /**
     * Gets the value of the aggregator property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorType }
     *     
     */
    public AggregatorType getAggregator() {
        return aggregator;
    }

    /**
     * Sets the value of the aggregator property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorType }
     *     
     */
    public void setAggregator(AggregatorType value) {
        this.aggregator = value;
    }

    /**
     * Gets the value of the enabledSystem property.
     * 
     * @return
     *     possible object is
     *     {@link EnabledSystemType }
     *     
     */
    public EnabledSystemType getEnabledSystem() {
        return enabledSystem;
    }

    /**
     * Sets the value of the enabledSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnabledSystemType }
     *     
     */
    public void setEnabledSystem(EnabledSystemType value) {
        this.enabledSystem = value;
    }

    /**
     * Gets the value of the corporation property.
     * 
     * @return
     *     possible object is
     *     {@link CorporationType }
     *     
     */
    public CorporationType getCorporation() {
        return corporation;
    }

    /**
     * Sets the value of the corporation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporationType }
     *     
     */
    public void setCorporation(CorporationType value) {
        this.corporation = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setMarketingCarrier(CarrierType value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setOperatingCarrier(CarrierType value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the ora property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getORA() {
        return ora;
    }

    /**
     * Sets the value of the ora property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setORA(CarrierType value) {
        this.ora = value;
    }

    /**
     * Gets the value of the poa property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getPOA() {
        return poa;
    }

    /**
     * Sets the value of the poa property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setPOA(CarrierType value) {
        this.poa = value;
    }

    /**
     * Gets the value of the retailPartner property.
     * 
     * @return
     *     possible object is
     *     {@link RetailPartnerType }
     *     
     */
    public RetailPartnerType getRetailPartner() {
        return retailPartner;
    }

    /**
     * Sets the value of the retailPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailPartnerType }
     *     
     */
    public void setRetailPartner(RetailPartnerType value) {
        this.retailPartner = value;
    }

    /**
     * Gets the value of the travelAgency property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgencyType }
     *     
     */
    public TravelAgencyType getTravelAgency() {
        return travelAgency;
    }

    /**
     * Sets the value of the travelAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgencyType }
     *     
     */
    public void setTravelAgency(TravelAgencyType value) {
        this.travelAgency = value;
    }

}
