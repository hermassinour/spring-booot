
package com.springboot.dto.ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="BookingRef" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}BookingRefType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CreateOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CreateOrderType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="OrderCreateParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrdCreateParamsType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentInfo" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PaymentInfoType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PaxGroupType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "createOrder",
    "commission",
    "dataLists",
    "orderCreateParameters",
    "paymentInfo",
    "paxGroup",
    "promotion"
})
public class RequestType {

    @XmlElement(name = "BookingRef")
    protected List<BookingRefType> bookingRef;
    @XmlElement(name = "CreateOrder")
    protected List<CreateOrderType> createOrder;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "OrderCreateParameters")
    protected OrdCreateParamsType orderCreateParameters;
    @XmlElement(name = "PaymentInfo")
    protected List<PaymentInfoType> paymentInfo;
    @XmlElement(name = "PaxGroup")
    protected List<PaxGroupType> paxGroup;
    @XmlElement(name = "Promotion")
    protected List<PromotionType> promotion;

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
     * Gets the value of the createOrder property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the createOrder property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCreateOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CreateOrderType }
     * 
     * 
     */
    public List<CreateOrderType> getCreateOrder() {
        if (createOrder == null) {
            createOrder = new ArrayList<CreateOrderType>();
        }
        return this.createOrder;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
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
     * Gets the value of the orderCreateParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrdCreateParamsType }
     *     
     */
    public OrdCreateParamsType getOrderCreateParameters() {
        return orderCreateParameters;
    }

    /**
     * Sets the value of the orderCreateParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdCreateParamsType }
     *     
     */
    public void setOrderCreateParameters(OrdCreateParamsType value) {
        this.orderCreateParameters = value;
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
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<PromotionType>();
        }
        return this.promotion;
    }

}
