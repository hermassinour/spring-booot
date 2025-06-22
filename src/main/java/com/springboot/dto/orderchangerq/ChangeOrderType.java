
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contains a choice of functions to update and Order including Update Order Item, Update Passenger, and Accept Reprice Order.
 * 
 * <p>Java class for ChangeOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AcceptRepricedOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AcceptRepricedOrderType" minOccurs="0"/&gt;
 *         &lt;element name="UpdatePax" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}UpdatePaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UpdateOrderItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}UpdateOrderItemType" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeOrderType", propOrder = {
    "acceptRepricedOrder",
    "updatePax",
    "updateOrderItem"
})
public class ChangeOrderType {

    @XmlElement(name = "AcceptRepricedOrder")
    protected AcceptRepricedOrderType acceptRepricedOrder;
    @XmlElement(name = "UpdatePax")
    protected List<UpdatePaxType> updatePax;
    @XmlElement(name = "UpdateOrderItem")
    protected UpdateOrderItemType updateOrderItem;

    /**
     * Gets the value of the acceptRepricedOrder property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptRepricedOrderType }
     *     
     */
    public AcceptRepricedOrderType getAcceptRepricedOrder() {
        return acceptRepricedOrder;
    }

    /**
     * Sets the value of the acceptRepricedOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptRepricedOrderType }
     *     
     */
    public void setAcceptRepricedOrder(AcceptRepricedOrderType value) {
        this.acceptRepricedOrder = value;
    }

    /**
     * Gets the value of the updatePax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the updatePax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUpdatePax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UpdatePaxType }
     * 
     * 
     */
    public List<UpdatePaxType> getUpdatePax() {
        if (updatePax == null) {
            updatePax = new ArrayList<UpdatePaxType>();
        }
        return this.updatePax;
    }

    /**
     * Gets the value of the updateOrderItem property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderItemType }
     *     
     */
    public UpdateOrderItemType getUpdateOrderItem() {
        return updateOrderItem;
    }

    /**
     * Sets the value of the updateOrderItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderItemType }
     *     
     */
    public void setUpdateOrderItem(UpdateOrderItemType value) {
        this.updateOrderItem = value;
    }

}
