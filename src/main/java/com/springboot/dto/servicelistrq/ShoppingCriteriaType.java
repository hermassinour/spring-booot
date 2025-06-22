
package com.springboot.dto.servicelistrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
 * 
 * <p>Java class for ShoppingCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripPurposeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}TripPurposeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="AllianceCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}AllianceCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="BaggagePricingCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}BaggagePricingCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="CabinTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CarrierCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExistingOrderCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ExistingOrderCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="FarePreferences" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}FarePreferencesType" minOccurs="0"/&gt;
 *         &lt;element name="FlightCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}FlightCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PaymentMethodType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCardCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PaymentCardCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricingMethodCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}BestPricingPreferencesType" minOccurs="0"/&gt;
 *         &lt;element name="ProgramCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ProgramCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromotionCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PromotionType" minOccurs="0"/&gt;
 *         &lt;element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}SeatType" minOccurs="0"/&gt;
 *         &lt;element name="SegmentDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}SegmentDurationCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ServiceCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialNeedCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}SpecialQualiferType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ConnectionCriteriaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCriteriaType", propOrder = {
    "tripPurposeCode",
    "allianceCriteria",
    "baggagePricingCriteria",
    "cabinTypeCriteria",
    "carrierCriteria",
    "existingOrderCriteria",
    "farePreferences",
    "flightCriteria",
    "paymentMethodCriteria",
    "paymentCardCriteria",
    "pricingMethodCriteria",
    "programCriteria",
    "promotionCriteria",
    "seatCriteria",
    "segmentDurationCriteria",
    "serviceCriteria",
    "specialNeedCriteria",
    "connectionCriteria"
})
public class ShoppingCriteriaType {

    @XmlElement(name = "TripPurposeCode")
    @XmlSchemaType(name = "string")
    protected TripPurposeCodeContentType tripPurposeCode;
    @XmlElement(name = "AllianceCriteria")
    protected AllianceCriteriaType allianceCriteria;
    @XmlElement(name = "BaggagePricingCriteria")
    protected BaggagePricingCriteriaType baggagePricingCriteria;
    @XmlElement(name = "CabinTypeCriteria")
    protected List<CabinTypeType> cabinTypeCriteria;
    @XmlElement(name = "CarrierCriteria")
    protected List<CarrierCriteriaType> carrierCriteria;
    @XmlElement(name = "ExistingOrderCriteria")
    protected ExistingOrderCriteriaType existingOrderCriteria;
    @XmlElement(name = "FarePreferences")
    protected FarePreferencesType farePreferences;
    @XmlElement(name = "FlightCriteria")
    protected FlightCriteriaType flightCriteria;
    @XmlElement(name = "PaymentMethodCriteria")
    protected List<PaymentMethodType> paymentMethodCriteria;
    @XmlElement(name = "PaymentCardCriteria")
    protected List<PaymentCardCriteriaType> paymentCardCriteria;
    @XmlElement(name = "PricingMethodCriteria")
    protected BestPricingPreferencesType pricingMethodCriteria;
    @XmlElement(name = "ProgramCriteria")
    protected List<ProgramCriteriaType> programCriteria;
    @XmlElement(name = "PromotionCriteria")
    protected PromotionType promotionCriteria;
    @XmlElement(name = "SeatCriteria")
    protected SeatType seatCriteria;
    @XmlElement(name = "SegmentDurationCriteria")
    protected SegmentDurationCriteriaType segmentDurationCriteria;
    @XmlElement(name = "ServiceCriteria")
    protected ServiceCriteriaType serviceCriteria;
    @XmlElement(name = "SpecialNeedCriteria")
    protected SpecialQualiferType specialNeedCriteria;
    @XmlElement(name = "ConnectionCriteria")
    protected ConnectionCriteriaType connectionCriteria;

    /**
     * Gets the value of the tripPurposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public TripPurposeCodeContentType getTripPurposeCode() {
        return tripPurposeCode;
    }

    /**
     * Sets the value of the tripPurposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripPurposeCodeContentType }
     *     
     */
    public void setTripPurposeCode(TripPurposeCodeContentType value) {
        this.tripPurposeCode = value;
    }

    /**
     * Gets the value of the allianceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link AllianceCriteriaType }
     *     
     */
    public AllianceCriteriaType getAllianceCriteria() {
        return allianceCriteria;
    }

    /**
     * Sets the value of the allianceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceCriteriaType }
     *     
     */
    public void setAllianceCriteria(AllianceCriteriaType value) {
        this.allianceCriteria = value;
    }

    /**
     * Gets the value of the baggagePricingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public BaggagePricingCriteriaType getBaggagePricingCriteria() {
        return baggagePricingCriteria;
    }

    /**
     * Sets the value of the baggagePricingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePricingCriteriaType }
     *     
     */
    public void setBaggagePricingCriteria(BaggagePricingCriteriaType value) {
        this.baggagePricingCriteria = value;
    }

    /**
     * Gets the value of the cabinTypeCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinTypeCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinTypeCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getCabinTypeCriteria() {
        if (cabinTypeCriteria == null) {
            cabinTypeCriteria = new ArrayList<CabinTypeType>();
        }
        return this.cabinTypeCriteria;
    }

    /**
     * Gets the value of the carrierCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierCriteriaType }
     * 
     * 
     */
    public List<CarrierCriteriaType> getCarrierCriteria() {
        if (carrierCriteria == null) {
            carrierCriteria = new ArrayList<CarrierCriteriaType>();
        }
        return this.carrierCriteria;
    }

    /**
     * Gets the value of the existingOrderCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ExistingOrderCriteriaType }
     *     
     */
    public ExistingOrderCriteriaType getExistingOrderCriteria() {
        return existingOrderCriteria;
    }

    /**
     * Sets the value of the existingOrderCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExistingOrderCriteriaType }
     *     
     */
    public void setExistingOrderCriteria(ExistingOrderCriteriaType value) {
        this.existingOrderCriteria = value;
    }

    /**
     * Gets the value of the farePreferences property.
     * 
     * @return
     *     possible object is
     *     {@link FarePreferencesType }
     *     
     */
    public FarePreferencesType getFarePreferences() {
        return farePreferences;
    }

    /**
     * Sets the value of the farePreferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarePreferencesType }
     *     
     */
    public void setFarePreferences(FarePreferencesType value) {
        this.farePreferences = value;
    }

    /**
     * Gets the value of the flightCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCriteriaType }
     *     
     */
    public FlightCriteriaType getFlightCriteria() {
        return flightCriteria;
    }

    /**
     * Sets the value of the flightCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCriteriaType }
     *     
     */
    public void setFlightCriteria(FlightCriteriaType value) {
        this.flightCriteria = value;
    }

    /**
     * Gets the value of the paymentMethodCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentMethodCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentMethodCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentMethodType }
     * 
     * 
     */
    public List<PaymentMethodType> getPaymentMethodCriteria() {
        if (paymentMethodCriteria == null) {
            paymentMethodCriteria = new ArrayList<PaymentMethodType>();
        }
        return this.paymentMethodCriteria;
    }

    /**
     * Gets the value of the paymentCardCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentCardCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentCardCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardCriteriaType }
     * 
     * 
     */
    public List<PaymentCardCriteriaType> getPaymentCardCriteria() {
        if (paymentCardCriteria == null) {
            paymentCardCriteria = new ArrayList<PaymentCardCriteriaType>();
        }
        return this.paymentCardCriteria;
    }

    /**
     * Gets the value of the pricingMethodCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BestPricingPreferencesType }
     *     
     */
    public BestPricingPreferencesType getPricingMethodCriteria() {
        return pricingMethodCriteria;
    }

    /**
     * Sets the value of the pricingMethodCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BestPricingPreferencesType }
     *     
     */
    public void setPricingMethodCriteria(BestPricingPreferencesType value) {
        this.pricingMethodCriteria = value;
    }

    /**
     * Gets the value of the programCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramCriteriaType }
     * 
     * 
     */
    public List<ProgramCriteriaType> getProgramCriteria() {
        if (programCriteria == null) {
            programCriteria = new ArrayList<ProgramCriteriaType>();
        }
        return this.programCriteria;
    }

    /**
     * Gets the value of the promotionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionType }
     *     
     */
    public PromotionType getPromotionCriteria() {
        return promotionCriteria;
    }

    /**
     * Sets the value of the promotionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionType }
     *     
     */
    public void setPromotionCriteria(PromotionType value) {
        this.promotionCriteria = value;
    }

    /**
     * Gets the value of the seatCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeatCriteria() {
        return seatCriteria;
    }

    /**
     * Sets the value of the seatCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeatCriteria(SeatType value) {
        this.seatCriteria = value;
    }

    /**
     * Gets the value of the segmentDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentDurationCriteriaType }
     *     
     */
    public SegmentDurationCriteriaType getSegmentDurationCriteria() {
        return segmentDurationCriteria;
    }

    /**
     * Sets the value of the segmentDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentDurationCriteriaType }
     *     
     */
    public void setSegmentDurationCriteria(SegmentDurationCriteriaType value) {
        this.segmentDurationCriteria = value;
    }

    /**
     * Gets the value of the serviceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceCriteriaType }
     *     
     */
    public ServiceCriteriaType getServiceCriteria() {
        return serviceCriteria;
    }

    /**
     * Sets the value of the serviceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceCriteriaType }
     *     
     */
    public void setServiceCriteria(ServiceCriteriaType value) {
        this.serviceCriteria = value;
    }

    /**
     * Gets the value of the specialNeedCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialQualiferType }
     *     
     */
    public SpecialQualiferType getSpecialNeedCriteria() {
        return specialNeedCriteria;
    }

    /**
     * Sets the value of the specialNeedCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialQualiferType }
     *     
     */
    public void setSpecialNeedCriteria(SpecialQualiferType value) {
        this.specialNeedCriteria = value;
    }

    /**
     * Gets the value of the connectionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ConnectionCriteriaType }
     *     
     */
    public ConnectionCriteriaType getConnectionCriteria() {
        return connectionCriteria;
    }

    /**
     * Sets the value of the connectionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConnectionCriteriaType }
     *     
     */
    public void setConnectionCriteria(ConnectionCriteriaType value) {
        this.connectionCriteria = value;
    }

}
