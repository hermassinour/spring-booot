
package com.springboot.dto.orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * CORE ORDER definition.
 * 
 * <p>Java class for V172_OrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_OrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BookingReferences" minOccurs="0"/&gt;
 *         &lt;element name="OriginalOrder" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PriceQuotes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmount"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Source"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                               &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}Commission"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PriceGuaranteeTimeLimit"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="OriginalOrderID" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}UniqueID_SimpleType" /&gt;
 *                 &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AirlineDesigSimpleType" /&gt;
 *                 &lt;attribute name="OwnerType"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;enumeration value="ORA"/&gt;
 *                       &lt;enumeration value="POA"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *                 &lt;attribute name="MetadataRefs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}InstanceClassRefSimpleType" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TotalOrderPrice" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AwardPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CombinationPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}DetailCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}EncodedCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}SimpleCurrencyPrice"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IATA_CodeType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Payments" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PaymentProcessType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TimeLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaymentTimeLimit" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CoreDateGrpType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}DepositTimeLimit" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}NamingTimeLimit" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BilateralTimeLimits" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}OrderKeys" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OrderID" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}UniqueID_SimpleType" /&gt;
 *       &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AirlineDesigSimpleType" /&gt;
 *       &lt;attribute name="OwnerType"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;enumeration value="ORA"/&gt;
 *             &lt;enumeration value="POA"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="MetadataRefs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}InstanceClassRefSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_OrderType", propOrder = {
    "bookingReferences",
    "originalOrder",
    "totalOrderPrice",
    "status",
    "payments",
    "timeLimits",
    "orderKeys"
})
public class V172OrderType {

    @XmlElement(name = "BookingReferences")
    protected BookingReferences bookingReferences;
    @XmlElement(name = "OriginalOrder")
    protected V172OrderType.OriginalOrder originalOrder;
    @XmlElement(name = "TotalOrderPrice")
    protected V172OrderType.TotalOrderPrice totalOrderPrice;
    @XmlElement(name = "Status")
    protected V172OrderType.Status status;
    @XmlElement(name = "Payments")
    protected V172OrderType.Payments payments;
    @XmlElement(name = "TimeLimits")
    protected V172OrderType.TimeLimits timeLimits;
    @XmlElement(name = "OrderKeys")
    protected OrderKeysType orderKeys;
    @XmlAttribute(name = "OrderID", required = true)
    protected String orderID;
    @XmlAttribute(name = "Owner", required = true)
    protected String owner;
    @XmlAttribute(name = "OwnerType")
    protected String ownerType;
    @XmlAttribute(name = "WebAddressID")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressID;
    @XmlAttribute(name = "MetadataRefs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String metadataRefs;

    /**
     * Gets the value of the bookingReferences property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferences }
     *     
     */
    public BookingReferences getBookingReferences() {
        return bookingReferences;
    }

    /**
     * Sets the value of the bookingReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferences }
     *     
     */
    public void setBookingReferences(BookingReferences value) {
        this.bookingReferences = value;
    }

    /**
     * Gets the value of the originalOrder property.
     * 
     * @return
     *     possible object is
     *     {@link V172OrderType.OriginalOrder }
     *     
     */
    public V172OrderType.OriginalOrder getOriginalOrder() {
        return originalOrder;
    }

    /**
     * Sets the value of the originalOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172OrderType.OriginalOrder }
     *     
     */
    public void setOriginalOrder(V172OrderType.OriginalOrder value) {
        this.originalOrder = value;
    }

    /**
     * Gets the value of the totalOrderPrice property.
     * 
     * @return
     *     possible object is
     *     {@link V172OrderType.TotalOrderPrice }
     *     
     */
    public V172OrderType.TotalOrderPrice getTotalOrderPrice() {
        return totalOrderPrice;
    }

    /**
     * Sets the value of the totalOrderPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172OrderType.TotalOrderPrice }
     *     
     */
    public void setTotalOrderPrice(V172OrderType.TotalOrderPrice value) {
        this.totalOrderPrice = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link V172OrderType.Status }
     *     
     */
    public V172OrderType.Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172OrderType.Status }
     *     
     */
    public void setStatus(V172OrderType.Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link V172OrderType.Payments }
     *     
     */
    public V172OrderType.Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172OrderType.Payments }
     *     
     */
    public void setPayments(V172OrderType.Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link V172OrderType.TimeLimits }
     *     
     */
    public V172OrderType.TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172OrderType.TimeLimits }
     *     
     */
    public void setTimeLimits(V172OrderType.TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Order Keys. Contains one Order ID with associated Order Item ID(s).
     * 
     * Notes: These are Orders that were created from Offers that have already been purchased, booked and/or are being held for a Traveler.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType }
     *     
     */
    public OrderKeysType getOrderKeys() {
        return orderKeys;
    }

    /**
     * Sets the value of the orderKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType }
     *     
     */
    public void setOrderKeys(OrderKeysType value) {
        this.orderKeys = value;
    }

    /**
     * Gets the value of the orderID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderID() {
        return orderID;
    }

    /**
     * Sets the value of the orderID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderID(String value) {
        this.orderID = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the ownerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerType() {
        return ownerType;
    }

    /**
     * Sets the value of the ownerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerType(String value) {
        this.ownerType = value;
    }

    /**
     * Gets the value of the webAddressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressID() {
        return webAddressID;
    }

    /**
     * Sets the value of the webAddressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressID(String value) {
        this.webAddressID = value;
    }

    /**
     * Gets the value of the metadataRefs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataRefs() {
        return metadataRefs;
    }

    /**
     * Sets the value of the metadataRefs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataRefs(String value) {
        this.metadataRefs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PriceQuotes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Amount"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmount"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Source"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                     &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}Commission"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PriceGuaranteeTimeLimit"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="OriginalOrderID" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}UniqueID_SimpleType" /&gt;
     *       &lt;attribute name="Owner" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AirlineDesigSimpleType" /&gt;
     *       &lt;attribute name="OwnerType"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;enumeration value="ORA"/&gt;
     *             &lt;enumeration value="POA"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
     *       &lt;attribute name="MetadataRefs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}InstanceClassRefSimpleType" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceQuotes"
    })
    public static class OriginalOrder {

        @XmlElement(name = "PriceQuotes")
        protected V172OrderType.OriginalOrder.PriceQuotes priceQuotes;
        @XmlAttribute(name = "OriginalOrderID", required = true)
        protected String originalOrderID;
        @XmlAttribute(name = "Owner", required = true)
        protected String owner;
        @XmlAttribute(name = "OwnerType")
        protected String ownerType;
        @XmlAttribute(name = "WebAddressID")
        @XmlSchemaType(name = "anyURI")
        protected String webAddressID;
        @XmlAttribute(name = "MetadataRefs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String metadataRefs;

        /**
         * Gets the value of the priceQuotes property.
         * 
         * @return
         *     possible object is
         *     {@link V172OrderType.OriginalOrder.PriceQuotes }
         *     
         */
        public V172OrderType.OriginalOrder.PriceQuotes getPriceQuotes() {
            return priceQuotes;
        }

        /**
         * Sets the value of the priceQuotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OrderType.OriginalOrder.PriceQuotes }
         *     
         */
        public void setPriceQuotes(V172OrderType.OriginalOrder.PriceQuotes value) {
            this.priceQuotes = value;
        }

        /**
         * Gets the value of the originalOrderID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalOrderID() {
            return originalOrderID;
        }

        /**
         * Sets the value of the originalOrderID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalOrderID(String value) {
            this.originalOrderID = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * Gets the value of the ownerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerType() {
            return ownerType;
        }

        /**
         * Sets the value of the ownerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerType(String value) {
            this.ownerType = value;
        }

        /**
         * Gets the value of the webAddressID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebAddressID() {
            return webAddressID;
        }

        /**
         * Sets the value of the webAddressID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebAddressID(String value) {
            this.webAddressID = value;
        }

        /**
         * Gets the value of the metadataRefs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadataRefs() {
            return metadataRefs;
        }

        /**
         * Sets the value of the metadataRefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadataRefs(String value) {
            this.metadataRefs = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="PriceQuote" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Amount"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmount"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Source"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                           &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}Commission"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PriceGuaranteeTimeLimit"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceQuote"
        })
        public static class PriceQuotes {

            @XmlElement(name = "PriceQuote", required = true)
            protected List<V172OrderType.OriginalOrder.PriceQuotes.PriceQuote> priceQuote;

            /**
             * Gets the value of the priceQuote property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the priceQuote property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPriceQuote().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote }
             * 
             * 
             */
            public List<V172OrderType.OriginalOrder.PriceQuotes.PriceQuote> getPriceQuote() {
                if (priceQuote == null) {
                    priceQuote = new ArrayList<V172OrderType.OriginalOrder.PriceQuotes.PriceQuote>();
                }
                return this.priceQuote;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Amount"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmount"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Source"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}Commission"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PriceGuaranteeTimeLimit"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "amount",
                "source",
                "commission",
                "priceGuaranteeTimeLimit"
            })
            public static class PriceQuote {

                @XmlElement(name = "Amount", required = true)
                protected V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount amount;
                @XmlElement(name = "Source", required = true)
                protected V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source source;
                @XmlElement(name = "Commission", required = true)
                protected V172CommissionType commission;
                @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
                protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
                @XmlAttribute(name = "CreatedDate")
                @XmlSchemaType(name = "anySimpleType")
                protected String createdDate;

                /**
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount }
                 *     
                 */
                public V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount }
                 *     
                 */
                public void setAmount(V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the source property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source }
                 *     
                 */
                public V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source getSource() {
                    return source;
                }

                /**
                 * Sets the value of the source property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source }
                 *     
                 */
                public void setSource(V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source value) {
                    this.source = value;
                }

                /**
                 * Gets the value of the commission property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link V172CommissionType }
                 *     
                 */
                public V172CommissionType getCommission() {
                    return commission;
                }

                /**
                 * Sets the value of the commission property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link V172CommissionType }
                 *     
                 */
                public void setCommission(V172CommissionType value) {
                    this.commission = value;
                }

                /**
                 * Gets the value of the priceGuaranteeTimeLimit property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link PriceGuaranteeTimeLimit }
                 *     
                 */
                public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
                    return priceGuaranteeTimeLimit;
                }

                /**
                 * Sets the value of the priceGuaranteeTimeLimit property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link PriceGuaranteeTimeLimit }
                 *     
                 */
                public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
                    this.priceGuaranteeTimeLimit = value;
                }

                /**
                 * Gets the value of the createdDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCreatedDate() {
                    return createdDate;
                }

                /**
                 * Sets the value of the createdDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCreatedDate(String value) {
                    this.createdDate = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmount"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "currencyAmount"
                })
                public static class Amount {

                    @XmlElement(name = "CurrencyAmount", required = true)
                    protected CurrencyAmountOptType currencyAmount;

                    /**
                     * Gets the value of the currencyAmount property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public CurrencyAmountOptType getCurrencyAmount() {
                        return currencyAmount;
                    }

                    /**
                     * Sets the value of the currencyAmount property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public void setCurrencyAmount(CurrencyAmountOptType value) {
                        this.currencyAmount = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
                 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Source {

                    @XmlAttribute(name = "Owner")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String owner;
                    @XmlAttribute(name = "Reference")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String reference;

                    /**
                     * Gets the value of the owner property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getOwner() {
                        return owner;
                    }

                    /**
                     * Sets the value of the owner property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setOwner(String value) {
                        this.owner = value;
                    }

                    /**
                     * Gets the value of the reference property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getReference() {
                        return reference;
                    }

                    /**
                     * Sets the value of the reference property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setReference(String value) {
                        this.reference = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Payment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PaymentProcessType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "payment"
    })
    public static class Payments {

        @XmlElement(name = "Payment", required = true)
        protected List<PaymentProcessType> payment;

        /**
         * Gets the value of the payment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the payment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPayment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentProcessType }
         * 
         * 
         */
        public List<PaymentProcessType> getPayment() {
            if (payment == null) {
                payment = new ArrayList<PaymentProcessType>();
            }
            return this.payment;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IATA_CodeType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ChangeOfGaugeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ScheduleChangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "statusCode"
    })
    public static class Status {

        @XmlElement(name = "StatusCode", required = true)
        protected String statusCode;
        @XmlAttribute(name = "ChangeOfGaugeInd")
        protected Boolean changeOfGaugeInd;
        @XmlAttribute(name = "ScheduleChangeInd")
        protected Boolean scheduleChangeInd;

        /**
         * Gets the value of the statusCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusCode() {
            return statusCode;
        }

        /**
         * Sets the value of the statusCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusCode(String value) {
            this.statusCode = value;
        }

        /**
         * Gets the value of the changeOfGaugeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isChangeOfGaugeInd() {
            return changeOfGaugeInd;
        }

        /**
         * Sets the value of the changeOfGaugeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setChangeOfGaugeInd(Boolean value) {
            this.changeOfGaugeInd = value;
        }

        /**
         * Gets the value of the scheduleChangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isScheduleChangeInd() {
            return scheduleChangeInd;
        }

        /**
         * Sets the value of the scheduleChangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setScheduleChangeInd(Boolean value) {
            this.scheduleChangeInd = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PaymentTimeLimit" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CoreDateGrpType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}DepositTimeLimit" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}NamingTimeLimit" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BilateralTimeLimits" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentTimeLimit",
        "depositTimeLimit",
        "namingTimeLimit",
        "bilateralTimeLimits"
    })
    public static class TimeLimits {

        @XmlElement(name = "PaymentTimeLimit")
        protected V172OrderType.TimeLimits.PaymentTimeLimit paymentTimeLimit;
        @XmlElement(name = "DepositTimeLimit")
        protected DepositTimeLimit depositTimeLimit;
        @XmlElement(name = "NamingTimeLimit")
        protected NamingTimeLimit namingTimeLimit;
        @XmlElement(name = "BilateralTimeLimits")
        protected BilateralTimeLimitsType bilateralTimeLimits;

        /**
         * Gets the value of the paymentTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link V172OrderType.TimeLimits.PaymentTimeLimit }
         *     
         */
        public V172OrderType.TimeLimits.PaymentTimeLimit getPaymentTimeLimit() {
            return paymentTimeLimit;
        }

        /**
         * Sets the value of the paymentTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OrderType.TimeLimits.PaymentTimeLimit }
         *     
         */
        public void setPaymentTimeLimit(V172OrderType.TimeLimits.PaymentTimeLimit value) {
            this.paymentTimeLimit = value;
        }

        /**
         * Gets the value of the depositTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link DepositTimeLimit }
         *     
         */
        public DepositTimeLimit getDepositTimeLimit() {
            return depositTimeLimit;
        }

        /**
         * Sets the value of the depositTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link DepositTimeLimit }
         *     
         */
        public void setDepositTimeLimit(DepositTimeLimit value) {
            this.depositTimeLimit = value;
        }

        /**
         * Gets the value of the namingTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link NamingTimeLimit }
         *     
         */
        public NamingTimeLimit getNamingTimeLimit() {
            return namingTimeLimit;
        }

        /**
         * Sets the value of the namingTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link NamingTimeLimit }
         *     
         */
        public void setNamingTimeLimit(NamingTimeLimit value) {
            this.namingTimeLimit = value;
        }

        /**
         * Gets the value of the bilateralTimeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link BilateralTimeLimitsType }
         *     
         */
        public BilateralTimeLimitsType getBilateralTimeLimits() {
            return bilateralTimeLimits;
        }

        /**
         * Sets the value of the bilateralTimeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link BilateralTimeLimitsType }
         *     
         */
        public void setBilateralTimeLimits(BilateralTimeLimitsType value) {
            this.bilateralTimeLimits = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CoreDateGrpType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentTimeLimit
            extends CoreDateGrpType
        {

            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the refs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefs() {
                return refs;
            }

            /**
             * Sets the value of the refs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefs(String value) {
                this.refs = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AwardPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CombinationPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}DetailCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}EncodedCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}SimpleCurrencyPrice"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "awardPricing",
        "combinationPricing",
        "detailCurrencyPrice",
        "encodedCurrencyPrice",
        "simpleCurrencyPrice"
    })
    public static class TotalOrderPrice {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;

        /**
         * Gets the value of the awardPricing property.
         * 
         * @return
         *     possible object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public AwardPriceUnitType getAwardPricing() {
            return awardPricing;
        }

        /**
         * Sets the value of the awardPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardPriceUnitType }
         *     
         */
        public void setAwardPricing(AwardPriceUnitType value) {
            this.awardPricing = value;
        }

        /**
         * Gets the value of the combinationPricing property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType }
         *     
         */
        public CombinationPriceType getCombinationPricing() {
            return combinationPricing;
        }

        /**
         * Sets the value of the combinationPricing property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType }
         *     
         */
        public void setCombinationPricing(CombinationPriceType value) {
            this.combinationPricing = value;
        }

        /**
         * Gets the value of the detailCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public DetailCurrencyPriceType getDetailCurrencyPrice() {
            return detailCurrencyPrice;
        }

        /**
         * Sets the value of the detailCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link DetailCurrencyPriceType }
         *     
         */
        public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
            this.detailCurrencyPrice = value;
        }

        /**
         * Gets the value of the encodedCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link EncodedPriceType }
         *     
         */
        public EncodedPriceType getEncodedCurrencyPrice() {
            return encodedCurrencyPrice;
        }

        /**
         * Sets the value of the encodedCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link EncodedPriceType }
         *     
         */
        public void setEncodedCurrencyPrice(EncodedPriceType value) {
            this.encodedCurrencyPrice = value;
        }

        /**
         * Gets the value of the simpleCurrencyPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
            return simpleCurrencyPrice;
        }

        /**
         * Sets the value of the simpleCurrencyPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
            this.simpleCurrencyPrice = value;
        }

    }

}
