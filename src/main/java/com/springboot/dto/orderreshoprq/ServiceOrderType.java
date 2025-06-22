
package com.springboot.dto.orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Functions to allow a Seller to request additions, replacement or deletions of OrderItems in this specific Order.
 * 
 * <p>Java class for ServiceOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddOfferItems" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AddOfferItemsType" minOccurs="0"/&gt;
 *         &lt;element name="DeleteOrderItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}DeleteOrderItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceOrderType", propOrder = {
    "addOfferItems",
    "deleteOrderItem"
})
public class ServiceOrderType {

    @XmlElement(name = "AddOfferItems")
    protected AddOfferItemsType addOfferItems;
    @XmlElement(name = "DeleteOrderItem")
    protected List<DeleteOrderItemType> deleteOrderItem;

    /**
     * Gets the value of the addOfferItems property.
     * 
     * @return
     *     possible object is
     *     {@link AddOfferItemsType }
     *     
     */
    public AddOfferItemsType getAddOfferItems() {
        return addOfferItems;
    }

    /**
     * Sets the value of the addOfferItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddOfferItemsType }
     *     
     */
    public void setAddOfferItems(AddOfferItemsType value) {
        this.addOfferItems = value;
    }

    /**
     * Gets the value of the deleteOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteOrderItemType }
     * 
     * 
     */
    public List<DeleteOrderItemType> getDeleteOrderItem() {
        if (deleteOrderItem == null) {
            deleteOrderItem = new ArrayList<DeleteOrderItemType>();
        }
        return this.deleteOrderItem;
    }

}
