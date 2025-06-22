
package com.springboot.dto.orderviewrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information related to parties relevant to the contents of this message.
 * 
 * <p>Java class for ParticipantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Aggregator" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AggregatorType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Corporation" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CorporationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EnabledSystem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}EnabledSystemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MarketingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OperatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ORA" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="POA" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RetailPartner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}RetailPartnerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgency" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TravelAgencyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantType", propOrder = {
    "aggregator",
    "corporation",
    "enabledSystem",
    "marketingCarrier",
    "operatingCarrier",
    "ora",
    "poa",
    "retailPartner",
    "travelAgency"
})
public class ParticipantType {

    @XmlElement(name = "Aggregator")
    protected List<AggregatorType> aggregator;
    @XmlElement(name = "Corporation")
    protected List<CorporationType> corporation;
    @XmlElement(name = "EnabledSystem")
    protected List<EnabledSystemType> enabledSystem;
    @XmlElement(name = "MarketingCarrier")
    protected List<CarrierType> marketingCarrier;
    @XmlElement(name = "OperatingCarrier")
    protected List<CarrierType> operatingCarrier;
    @XmlElement(name = "ORA")
    protected List<CarrierType> ora;
    @XmlElement(name = "POA")
    protected List<CarrierType> poa;
    @XmlElement(name = "RetailPartner")
    protected List<RetailPartnerType> retailPartner;
    @XmlElement(name = "TravelAgency")
    protected List<TravelAgencyType> travelAgency;

    /**
     * Gets the value of the aggregator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aggregator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAggregator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AggregatorType }
     * 
     * 
     */
    public List<AggregatorType> getAggregator() {
        if (aggregator == null) {
            aggregator = new ArrayList<AggregatorType>();
        }
        return this.aggregator;
    }

    /**
     * Gets the value of the corporation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the corporation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCorporation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CorporationType }
     * 
     * 
     */
    public List<CorporationType> getCorporation() {
        if (corporation == null) {
            corporation = new ArrayList<CorporationType>();
        }
        return this.corporation;
    }

    /**
     * Gets the value of the enabledSystem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enabledSystem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnabledSystem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnabledSystemType }
     * 
     * 
     */
    public List<EnabledSystemType> getEnabledSystem() {
        if (enabledSystem == null) {
            enabledSystem = new ArrayList<EnabledSystemType>();
        }
        return this.enabledSystem;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * 
     * 
     */
    public List<CarrierType> getMarketingCarrier() {
        if (marketingCarrier == null) {
            marketingCarrier = new ArrayList<CarrierType>();
        }
        return this.marketingCarrier;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatingCarrier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatingCarrier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * 
     * 
     */
    public List<CarrierType> getOperatingCarrier() {
        if (operatingCarrier == null) {
            operatingCarrier = new ArrayList<CarrierType>();
        }
        return this.operatingCarrier;
    }

    /**
     * Gets the value of the ora property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ora property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * 
     * 
     */
    public List<CarrierType> getORA() {
        if (ora == null) {
            ora = new ArrayList<CarrierType>();
        }
        return this.ora;
    }

    /**
     * Gets the value of the poa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the poa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPOA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierType }
     * 
     * 
     */
    public List<CarrierType> getPOA() {
        if (poa == null) {
            poa = new ArrayList<CarrierType>();
        }
        return this.poa;
    }

    /**
     * Gets the value of the retailPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the retailPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRetailPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RetailPartnerType }
     * 
     * 
     */
    public List<RetailPartnerType> getRetailPartner() {
        if (retailPartner == null) {
            retailPartner = new ArrayList<RetailPartnerType>();
        }
        return this.retailPartner;
    }

    /**
     * Gets the value of the travelAgency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelAgency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelAgency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelAgencyType }
     * 
     * 
     */
    public List<TravelAgencyType> getTravelAgency() {
        if (travelAgency == null) {
            travelAgency = new ArrayList<TravelAgencyType>();
        }
        return this.travelAgency;
    }

}
