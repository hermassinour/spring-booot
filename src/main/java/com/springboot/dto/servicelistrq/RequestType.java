
package com.springboot.dto.servicelistrq;

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
 *         &lt;element name="CoreRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CoreRequestType"/&gt;
 *         &lt;element name="OriginDest" minOccurs="0"&gt;
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
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}SrvListReqMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="Paxs" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PaxsType" minOccurs="0"/&gt;
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ResponseParametersType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ShoppingCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ShoppingResponseType" minOccurs="0"/&gt;
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
    "coreRequest",
    "originDest",
    "metadata",
    "paxs",
    "policy",
    "responseParameters",
    "shoppingCriteria",
    "shoppingResponse"
})
public class RequestType {

    @XmlElement(name = "CoreRequest", required = true)
    protected CoreRequestType coreRequest;
    @XmlElement(name = "OriginDest")
    protected RequestType.OriginDest originDest;
    @XmlElement(name = "Metadata")
    protected SrvListReqMetadataType metadata;
    @XmlElement(name = "Paxs")
    protected PaxsType paxs;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;

    /**
     * Gets the value of the coreRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CoreRequestType }
     *     
     */
    public CoreRequestType getCoreRequest() {
        return coreRequest;
    }

    /**
     * Sets the value of the coreRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreRequestType }
     *     
     */
    public void setCoreRequest(CoreRequestType value) {
        this.coreRequest = value;
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
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link SrvListReqMetadataType }
     *     
     */
    public SrvListReqMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrvListReqMetadataType }
     *     
     */
    public void setMetadata(SrvListReqMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the paxs property.
     * 
     * @return
     *     possible object is
     *     {@link PaxsType }
     *     
     */
    public PaxsType getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxsType }
     *     
     */
    public void setPaxs(PaxsType value) {
        this.paxs = value;
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
