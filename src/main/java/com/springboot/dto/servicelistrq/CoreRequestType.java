
package com.springboot.dto.servicelistrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Core Service List request including choice of Journey information, Offer, or Order references.
 * 
 * <p>Java class for CoreRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}OrderType"/&gt;
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}OfferType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OriginDest" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}IATA_LocationCodeType"/&gt;
 *                   &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}IATA_LocationCodeType"/&gt;
 *                   &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PaxJourneyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreRequestType", propOrder = {
    "order",
    "offer",
    "originDest"
})
public class CoreRequestType {

    @XmlElement(name = "Order")
    protected OrderType order;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;
    @XmlElement(name = "OriginDest")
    protected List<CoreRequestType.OriginDest> originDest;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the originDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreRequestType.OriginDest }
     * 
     * 
     */
    public List<CoreRequestType.OriginDest> getOriginDest() {
        if (originDest == null) {
            originDest = new ArrayList<CoreRequestType.OriginDest>();
        }
        return this.originDest;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}IATA_LocationCodeType"/&gt;
     *         &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}IATA_LocationCodeType"/&gt;
     *         &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PaxJourneyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "originStationCode",
        "destStationCode",
        "paxJourney"
    })
    public static class OriginDest {

        @XmlElement(name = "OriginStationCode", required = true)
        protected String originStationCode;
        @XmlElement(name = "DestStationCode", required = true)
        protected String destStationCode;
        @XmlElement(name = "PaxJourney")
        protected PaxJourneyType paxJourney;

        /**
         * Gets the value of the originStationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginStationCode() {
            return originStationCode;
        }

        /**
         * Sets the value of the originStationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginStationCode(String value) {
            this.originStationCode = value;
        }

        /**
         * Gets the value of the destStationCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestStationCode() {
            return destStationCode;
        }

        /**
         * Sets the value of the destStationCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestStationCode(String value) {
            this.destStationCode = value;
        }

        /**
         * Gets the value of the paxJourney property.
         * 
         * @return
         *     possible object is
         *     {@link PaxJourneyType }
         *     
         */
        public PaxJourneyType getPaxJourney() {
            return paxJourney;
        }

        /**
         * Sets the value of the paxJourney property.
         * 
         * @param value
         *     allowed object is
         *     {@link PaxJourneyType }
         *     
         */
        public void setPaxJourney(PaxJourneyType value) {
            this.paxJourney = value;
        }

    }

}
