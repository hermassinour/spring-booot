
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Function to accept a new OfferItem and adding it to the existing Order.
 * 
 * <p>Java class for AcceptOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcceptOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SelectedOfferType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="CreateOrderItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}OrderRequestType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcceptOfferType", propOrder = {
    "selectedOffer",
    "createOrderItem"
})
public class AcceptOfferType {

    @XmlElement(name = "SelectedOffer", required = true)
    protected List<SelectedOfferType> selectedOffer;
    @XmlElement(name = "CreateOrderItem")
    protected List<OrderRequestType> createOrderItem;

    /**
     * Gets the value of the selectedOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferType }
     * 
     * 
     */
    public List<SelectedOfferType> getSelectedOffer() {
        if (selectedOffer == null) {
            selectedOffer = new ArrayList<SelectedOfferType>();
        }
        return this.selectedOffer;
    }

    /**
     * Gets the value of the createOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRequestType }
     * 
     * 
     */
    public List<OrderRequestType> getCreateOrderItem() {
        if (createOrderItem == null) {
            createOrderItem = new ArrayList<OrderRequestType>();
        }
        return this.createOrderItem;
    }

}
