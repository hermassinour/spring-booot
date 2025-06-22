
package com.springboot.dto.orderreshoprq;

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
 * Reshop actions to enquire about desired changes for a given order. New OfferItems will be presented in subsequent response, which will incur reconstruction of new OrderItems post-OrderChangeRQ.
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
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ID_Type"/&gt;
 *         &lt;element name="OrderActionContextText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReshopParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ItinReshopParamsType" minOccurs="0"/&gt;
 *         &lt;element name="UpdateOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}UpdateOrderType"/&gt;
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
    "orderItemRefID",
    "orderActionContextText",
    "bookingRef",
    "reshopParameters",
    "updateOrder"
})
public class RequestType {

    @XmlElement(name = "OrderItemRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemRefID;
    @XmlElement(name = "OrderActionContextText")
    protected String orderActionContextText;
    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "ReshopParameters")
    protected ItinReshopParamsType reshopParameters;
    @XmlElement(name = "UpdateOrder", required = true)
    protected UpdateOrderType updateOrder;

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
     * Gets the value of the orderActionContextText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderActionContextText() {
        return orderActionContextText;
    }

    /**
     * Sets the value of the orderActionContextText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderActionContextText(String value) {
        this.orderActionContextText = value;
    }

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
     * Gets the value of the reshopParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopParamsType }
     *     
     */
    public ItinReshopParamsType getReshopParameters() {
        return reshopParameters;
    }

    /**
     * Sets the value of the reshopParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopParamsType }
     *     
     */
    public void setReshopParameters(ItinReshopParamsType value) {
        this.reshopParameters = value;
    }

    /**
     * Gets the value of the updateOrder property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateOrderType }
     *     
     */
    public UpdateOrderType getUpdateOrder() {
        return updateOrder;
    }

    /**
     * Sets the value of the updateOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateOrderType }
     *     
     */
    public void setUpdateOrder(UpdateOrderType value) {
        this.updateOrder = value;
    }

}
