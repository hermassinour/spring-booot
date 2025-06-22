
package com.springboot.dto.orderchangerq;

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
 * Payload information for OrderCreateRQ.
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
 *         &lt;element name="ActionContextCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ChangeOrderType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}OrdChangeMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}OrderType"/&gt;
 *         &lt;element name="OrderChangeParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}OrdChangeParamsType" minOccurs="0"/&gt;
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PaxGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfo" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PaymentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "actionContextCode",
    "bookingRef",
    "changeOrder",
    "dataLists",
    "metadata",
    "order",
    "orderChangeParameters",
    "paxGroup",
    "paymentInfo"
})
public class RequestType {

    @XmlElement(name = "ActionContextCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String actionContextCode;
    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "ChangeOrder")
    protected ChangeOrderType changeOrder;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected OrdChangeMetadataType metadata;
    @XmlElement(name = "Order", required = true)
    protected OrderType order;
    @XmlElement(name = "OrderChangeParameters")
    protected OrdChangeParamsType orderChangeParameters;
    @XmlElement(name = "PaxGroup")
    protected List<PaxGroupType> paxGroup;
    @XmlElement(name = "PaymentInfo")
    protected List<PaymentInfoType> paymentInfo;

    /**
     * Gets the value of the actionContextCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionContextCode() {
        return actionContextCode;
    }

    /**
     * Sets the value of the actionContextCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionContextCode(String value) {
        this.actionContextCode = value;
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
     * Gets the value of the changeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderType }
     *     
     */
    public ChangeOrderType getChangeOrder() {
        return changeOrder;
    }

    /**
     * Sets the value of the changeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderType }
     *     
     */
    public void setChangeOrder(ChangeOrderType value) {
        this.changeOrder = value;
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
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeMetadataType }
     *     
     */
    public OrdChangeMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeMetadataType }
     *     
     */
    public void setMetadata(OrdChangeMetadataType value) {
        this.metadata = value;
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
     * Gets the value of the orderChangeParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeParamsType }
     *     
     */
    public OrdChangeParamsType getOrderChangeParameters() {
        return orderChangeParameters;
    }

    /**
     * Sets the value of the orderChangeParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeParamsType }
     *     
     */
    public void setOrderChangeParameters(OrdChangeParamsType value) {
        this.orderChangeParameters = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaxGroupType }
     * 
     * 
     */
    public List<PaxGroupType> getPaxGroup() {
        if (paxGroup == null) {
            paxGroup = new ArrayList<PaxGroupType>();
        }
        return this.paxGroup;
    }

    /**
     * Gets the value of the paymentInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInfoType }
     * 
     * 
     */
    public List<PaymentInfoType> getPaymentInfo() {
        if (paymentInfo == null) {
            paymentInfo = new ArrayList<PaymentInfoType>();
        }
        return this.paymentInfo;
    }

}
