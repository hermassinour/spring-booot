
package com.springboot.dto.orderchangerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Collection of functions used by the seller to request the airline to commit changes to an existing Order. These may be adding, removing or replacing Order Items (with potential refund conditions, in case of cancellations). The actions possible are determ
 * 
 * <p>Java class for UpdateOrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AcceptOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AcceptOfferType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteOrderItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DeleteOrderItemType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderItemType", propOrder = {
    "acceptOffer",
    "deleteOrderItem"
})
public class UpdateOrderItemType {

    @XmlElement(name = "AcceptOffer")
    protected AcceptOfferType acceptOffer;
    @XmlElement(name = "DeleteOrderItem")
    protected DeleteOrderItemType deleteOrderItem;

    /**
     * Gets the value of the acceptOffer property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptOfferType }
     *     
     */
    public AcceptOfferType getAcceptOffer() {
        return acceptOffer;
    }

    /**
     * Sets the value of the acceptOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptOfferType }
     *     
     */
    public void setAcceptOffer(AcceptOfferType value) {
        this.acceptOffer = value;
    }

    /**
     * Gets the value of the deleteOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteOrderItemType }
     *     
     */
    public DeleteOrderItemType getDeleteOrderItem() {
        return deleteOrderItem;
    }

    /**
     * Sets the value of the deleteOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteOrderItemType }
     *     
     */
    public void setDeleteOrderItem(DeleteOrderItemType value) {
        this.deleteOrderItem = value;
    }

}
