
package com.springboot.dto.orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Choice of Affinity, Origin Destination, or Journey flight information for this shopping request.
 * 
 * <p>Java class for FlightRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AffinityRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AffinityRequestType"/&gt;
 *         &lt;element name="OriginDestRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}OriginDestType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SpecificOriginDestRequest" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IATA_LocationCodeType"/&gt;
 *                   &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IATA_LocationCodeType"/&gt;
 *                   &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PaxJourneyType"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ShoppingResponseType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightRequestType", propOrder = {
    "affinityRequest",
    "originDestRequest",
    "specificOriginDestRequest",
    "shoppingResponse"
})
public class FlightRequestType {

    @XmlElement(name = "AffinityRequest")
    protected AffinityRequestType affinityRequest;
    @XmlElement(name = "OriginDestRequest")
    protected List<OriginDestType> originDestRequest;
    @XmlElement(name = "SpecificOriginDestRequest")
    protected List<FlightRequestType.SpecificOriginDestRequest> specificOriginDestRequest;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;

    /**
     * Gets the value of the affinityRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityRequestType }
     *     
     */
    public AffinityRequestType getAffinityRequest() {
        return affinityRequest;
    }

    /**
     * Sets the value of the affinityRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityRequestType }
     *     
     */
    public void setAffinityRequest(AffinityRequestType value) {
        this.affinityRequest = value;
    }

    /**
     * Gets the value of the originDestRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OriginDestType }
     * 
     * 
     */
    public List<OriginDestType> getOriginDestRequest() {
        if (originDestRequest == null) {
            originDestRequest = new ArrayList<OriginDestType>();
        }
        return this.originDestRequest;
    }

    /**
     * Gets the value of the specificOriginDestRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificOriginDestRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificOriginDestRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightRequestType.SpecificOriginDestRequest }
     * 
     * 
     */
    public List<FlightRequestType.SpecificOriginDestRequest> getSpecificOriginDestRequest() {
        if (specificOriginDestRequest == null) {
            specificOriginDestRequest = new ArrayList<FlightRequestType.SpecificOriginDestRequest>();
        }
        return this.specificOriginDestRequest;
    }

    /**
     * Gets the value of the shoppingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
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
     *         &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IATA_LocationCodeType"/&gt;
     *         &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IATA_LocationCodeType"/&gt;
     *         &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PaxJourneyType"/&gt;
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
    public static class SpecificOriginDestRequest {

        @XmlElement(name = "OriginStationCode", required = true)
        protected String originStationCode;
        @XmlElement(name = "DestStationCode", required = true)
        protected String destStationCode;
        @XmlElement(name = "PaxJourney", required = true)
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
