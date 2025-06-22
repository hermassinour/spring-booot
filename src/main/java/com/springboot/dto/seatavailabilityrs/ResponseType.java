
package com.springboot.dto.seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OfferPriceRS response information.
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ALaCarteOfferType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="MessageProcessing" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ProcessingResultType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}SeatAvailResMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="SeatMap" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}SeatMapType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ShoppingResponseType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "aLaCarteOffer",
    "dataLists",
    "messageProcessing",
    "metadata",
    "policy",
    "responseParameters",
    "seatMap",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "ALaCarteOffer")
    protected ALaCarteOfferType aLaCarteOffer;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "MessageProcessing")
    protected ProcessingResultType messageProcessing;
    @XmlElement(name = "Metadata")
    protected SeatAvailResMetadataType metadata;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "ResponseParameters")
    protected Object responseParameters;
    @XmlElement(name = "SeatMap", required = true)
    protected List<SeatMapType> seatMap;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public ALaCarteOfferType getALaCarteOffer() {
        return aLaCarteOffer;
    }

    /**
     * Sets the value of the aLaCarteOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public void setALaCarteOffer(ALaCarteOfferType value) {
        this.aLaCarteOffer = value;
    }

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
     * Gets the value of the messageProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultType }
     *     
     */
    public ProcessingResultType getMessageProcessing() {
        return messageProcessing;
    }

    /**
     * Sets the value of the messageProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultType }
     *     
     */
    public void setMessageProcessing(ProcessingResultType value) {
        this.messageProcessing = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAvailResMetadataType }
     *     
     */
    public SeatAvailResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAvailResMetadataType }
     *     
     */
    public void setMetadata(SeatAvailResMetadataType value) {
        this.metadata = value;
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
     *     {@link Object }
     *     
     */
    public Object getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setResponseParameters(Object value) {
        this.responseParameters = value;
    }

    /**
     * Gets the value of the seatMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatMapType }
     * 
     * 
     */
    public List<SeatMapType> getSeatMap() {
        if (seatMap == null) {
            seatMap = new ArrayList<SeatMapType>();
        }
        return this.seatMap;
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
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }

}
