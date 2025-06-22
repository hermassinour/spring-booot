
package com.springboot.dto.ordercancelrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Payload information for OrderCancelRQ.
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
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderCancelParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OrderCancelParametersType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OrderType" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedRefundAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PriceType" minOccurs="0"/&gt;
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
    "bookingRef",
    "orderCancelParameters",
    "order",
    "expectedRefundAmount"
})
public class RequestType {

    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "OrderCancelParameters")
    protected OrderCancelParametersType orderCancelParameters;
    @XmlElement(name = "Order")
    protected OrderType order;
    @XmlElement(name = "ExpectedRefundAmount")
    protected PriceType expectedRefundAmount;

    /**
     * Gets the value of the bookingRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingRefType }
     * 
     * 
     */
    public List<BookingRefType> getBookingRef() {
        if (bookingRef == null) {
            bookingRef = new ArrayList<BookingRefType>();
        }
        return this.bookingRef;
    }

    /**
     * Gets the value of the orderCancelParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrderCancelParametersType }
     *     
     */
    public OrderCancelParametersType getOrderCancelParameters() {
        return orderCancelParameters;
    }

    /**
     * Sets the value of the orderCancelParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderCancelParametersType }
     *     
     */
    public void setOrderCancelParameters(OrderCancelParametersType value) {
        this.orderCancelParameters = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link OrderType }
     *     
     */
    public OrderType getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderType }
     *     
     */
    public void setOrder(OrderType value) {
        this.order = value;
    }

    /**
     * Gets the value of the expectedRefundAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getExpectedRefundAmount() {
        return expectedRefundAmount;
    }

    /**
     * Sets the value of the expectedRefundAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setExpectedRefundAmount(PriceType value) {
        this.expectedRefundAmount = value;
    }

}
