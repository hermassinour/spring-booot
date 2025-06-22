
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OrderItems which the Airline confirms can be deleted in a subsequent OrderChangeRQ. Optionally, a price differential (e.g. refund amounts) can be added to each OrderItem occurrence being deleted.  Should not be used for 'replace' type functions. In the
 * 
 * <p>Java class for DeleteOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteOrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
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
@XmlType(name = "DeleteOrderItemType", propOrder = {
    "orderItemRefID",
    "originalOrderItemDifferential",
    "newOfferItemDifferential",
    "penaltyDifferential",
    "feesDifferential",
    "differentialAmountDue"
})
public class DeleteOrderItemType {

    @XmlElement(name = "OrderItemRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemRefID;
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
     * Gets the value of the orderItemRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemRefID() {
        return orderItemRefID;
    }

    /**
     * Sets the value of the orderItemRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemRefID(String value) {
        this.orderItemRefID = value;
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
