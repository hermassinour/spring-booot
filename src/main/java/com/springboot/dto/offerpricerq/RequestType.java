
package com.springboot.dto.offerpricerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AirShoppingRQ payload information.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="InExchForTicket" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}TicketAutoExchangeType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}FltPriceReqMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDest" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IATA_LocationCodeType"/&gt;
 *                   &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IATA_LocationCodeType"/&gt;
 *                   &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}PaxJourneyType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricedOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CreateOrderType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ResponseParametersType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ShoppingCriteriaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "dataLists",
    "inExchForTicket",
    "metadata",
    "originDest",
    "policy",
    "pricedOffer",
    "responseParameters",
    "shoppingCriteria"
})
public class RequestType {

    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "InExchForTicket")
    protected TicketAutoExchangeType inExchForTicket;
    @XmlElement(name = "Metadata")
    protected FltPriceReqMetadataType metadata;
    @XmlElement(name = "OriginDest")
    protected RequestType.OriginDest originDest;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "PricedOffer")
    protected CreateOrderType pricedOffer;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the inExchForTicket property.
     * 
     * @return
     *     possible object is
     *     {@link TicketAutoExchangeType }
     *     
     */
    public TicketAutoExchangeType getInExchForTicket() {
        return inExchForTicket;
    }

    /**
     * Sets the value of the inExchForTicket property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketAutoExchangeType }
     *     
     */
    public void setInExchForTicket(TicketAutoExchangeType value) {
        this.inExchForTicket = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link FltPriceReqMetadataType }
     *     
     */
    public FltPriceReqMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceReqMetadataType }
     *     
     */
    public void setMetadata(FltPriceReqMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the originDest property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType.OriginDest }
     *     
     */
    public RequestType.OriginDest getOriginDest() {
        return originDest;
    }

    /**
     * Sets the value of the originDest property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType.OriginDest }
     *     
     */
    public void setOriginDest(RequestType.OriginDest value) {
        this.originDest = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * 
     * 
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PolicyType>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the pricedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link CreateOrderType }
     *     
     */
    public CreateOrderType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateOrderType }
     *     
     */
    public void setPricedOffer(CreateOrderType value) {
        this.pricedOffer = value;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
    }

    /**
     * Gets the value of the shoppingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public ShoppingCriteriaType getShoppingCriteria() {
        return shoppingCriteria;
    }

    /**
     * Sets the value of the shoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public void setShoppingCriteria(ShoppingCriteriaType value) {
        this.shoppingCriteria = value;
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
     *         &lt;element name="OriginStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IATA_LocationCodeType"/&gt;
     *         &lt;element name="DestStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IATA_LocationCodeType"/&gt;
     *         &lt;element name="PaxJourney" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}PaxJourneyType" minOccurs="0"/&gt;
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
