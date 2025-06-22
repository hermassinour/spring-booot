
package com.springboot.dto.orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A priced grouping of one or more services within an Offer.
 * 
 * <p>Java class for OfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="MandatoryInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="ModificationProhibitedInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PriceType"/&gt;
 *         &lt;element name="OriginalOrderItemDifferential" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopDifferentialType" minOccurs="0"/&gt;
 *         &lt;element name="NewOfferItemDifferential" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopDifferentialType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyDifferential" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopDifferentialType" minOccurs="0"/&gt;
 *         &lt;element name="FeesDifferential" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopDifferentialType" minOccurs="0"/&gt;
 *         &lt;element name="DifferentialAmountDue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopDifferentialType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemType", propOrder = {
    "offerItemID",
    "mandatoryInd",
    "modificationProhibitedInd",
    "orderItemRefID",
    "fareDetail",
    "service",
    "price",
    "originalOrderItemDifferential",
    "newOfferItemDifferential",
    "penaltyDifferential",
    "feesDifferential",
    "differentialAmountDue"
})
public class OfferItemType {

    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlElement(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;
    @XmlElement(name = "OrderItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> orderItemRefID;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "Service", required = true)
    protected List<ServiceType> service;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "OriginalOrderItemDifferential")
    protected ReshopDifferentialType originalOrderItemDifferential;
    @XmlElement(name = "NewOfferItemDifferential")
    protected ReshopDifferentialType newOfferItemDifferential;
    @XmlElement(name = "PenaltyDifferential")
    protected ReshopDifferentialType penaltyDifferential;
    @XmlElement(name = "FeesDifferential")
    protected ReshopDifferentialType feesDifferential;
    @XmlElement(name = "DifferentialAmountDue", required = true)
    protected ReshopDifferentialType differentialAmountDue;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
    }

    /**
     * Gets the value of the orderItemRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderItemRefID() {
        if (orderItemRefID == null) {
            orderItemRefID = new ArrayList<String>();
        }
        return this.orderItemRefID;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the originalOrderItemDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public ReshopDifferentialType getOriginalOrderItemDifferential() {
        return originalOrderItemDifferential;
    }

    /**
     * Sets the value of the originalOrderItemDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public void setOriginalOrderItemDifferential(ReshopDifferentialType value) {
        this.originalOrderItemDifferential = value;
    }

    /**
     * Gets the value of the newOfferItemDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public ReshopDifferentialType getNewOfferItemDifferential() {
        return newOfferItemDifferential;
    }

    /**
     * Sets the value of the newOfferItemDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public void setNewOfferItemDifferential(ReshopDifferentialType value) {
        this.newOfferItemDifferential = value;
    }

    /**
     * Gets the value of the penaltyDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public ReshopDifferentialType getPenaltyDifferential() {
        return penaltyDifferential;
    }

    /**
     * Sets the value of the penaltyDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public void setPenaltyDifferential(ReshopDifferentialType value) {
        this.penaltyDifferential = value;
    }

    /**
     * Gets the value of the feesDifferential property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public ReshopDifferentialType getFeesDifferential() {
        return feesDifferential;
    }

    /**
     * Sets the value of the feesDifferential property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public void setFeesDifferential(ReshopDifferentialType value) {
        this.feesDifferential = value;
    }

    /**
     * Gets the value of the differentialAmountDue property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public ReshopDifferentialType getDifferentialAmountDue() {
        return differentialAmountDue;
    }

    /**
     * Sets the value of the differentialAmountDue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopDifferentialType }
     *     
     */
    public void setDifferentialAmountDue(ReshopDifferentialType value) {
        this.differentialAmountDue = value;
    }

}
