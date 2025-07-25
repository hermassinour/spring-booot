
package com.springboot.dto.airshoppingrs;

import java.math.BigInteger;
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
 * ORDER INPUT SHOPPING RESPONSE object definition.
 * 
 * <p>Java class for OrderRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Offer" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}SimpleCurrencyPriceType" minOccurs="0"/&gt;
 *                   &lt;element name="OfferItem" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PassengerRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="ALaCarteSelection" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                                       &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ServiceSelection" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}RequestedServiceType"&gt;
 *                                     &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="SeatSelection" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                       &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="OfferItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="OfferID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                 &lt;attribute name="Owner" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="ResponseID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderItem" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}OrderOfferItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderRequestType", propOrder = {
    "offer",
    "orderItem"
})
public class OrderRequestType {

    @XmlElement(name = "Offer")
    protected List<OrderRequestType.Offer> offer;
    @XmlElement(name = "OrderItem")
    protected List<OrderOfferItemType> orderItem;

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderRequestType.Offer }
     * 
     * 
     */
    public List<OrderRequestType.Offer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OrderRequestType.Offer>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderOfferItemType }
     * 
     * 
     */
    public List<OrderOfferItemType> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<OrderOfferItemType>();
        }
        return this.orderItem;
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
     *         &lt;element name="TotalOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}SimpleCurrencyPriceType" minOccurs="0"/&gt;
     *         &lt;element name="OfferItem" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PassengerRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="ALaCarteSelection" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *                             &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ServiceSelection" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}RequestedServiceType"&gt;
     *                           &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="SeatSelection" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                             &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="OfferItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="OfferID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *       &lt;attribute name="Owner" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="ResponseID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalOfferPrice",
        "offerItem"
    })
    public static class Offer {

        @XmlElement(name = "TotalOfferPrice")
        protected SimpleCurrencyPriceType totalOfferPrice;
        @XmlElement(name = "OfferItem", required = true)
        protected List<OrderRequestType.Offer.OfferItem> offerItem;
        @XmlAttribute(name = "OfferID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String offerID;
        @XmlAttribute(name = "Owner", required = true)
        protected String owner;
        @XmlAttribute(name = "ResponseID", required = true)
        protected String responseID;

        /**
         * Gets the value of the totalOfferPrice property.
         * 
         * @return
         *     possible object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public SimpleCurrencyPriceType getTotalOfferPrice() {
            return totalOfferPrice;
        }

        /**
         * Sets the value of the totalOfferPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link SimpleCurrencyPriceType }
         *     
         */
        public void setTotalOfferPrice(SimpleCurrencyPriceType value) {
            this.totalOfferPrice = value;
        }

        /**
         * Gets the value of the offerItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the offerItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOfferItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OrderRequestType.Offer.OfferItem }
         * 
         * 
         */
        public List<OrderRequestType.Offer.OfferItem> getOfferItem() {
            if (offerItem == null) {
                offerItem = new ArrayList<OrderRequestType.Offer.OfferItem>();
            }
            return this.offerItem;
        }

        /**
         * Gets the value of the offerID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfferID() {
            return offerID;
        }

        /**
         * Sets the value of the offerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfferID(String value) {
            this.offerID = value;
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
         * Gets the value of the responseID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseID() {
            return responseID;
        }

        /**
         * Sets the value of the responseID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseID(String value) {
            this.responseID = value;
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
         *         &lt;element name="PassengerRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/&gt;
         *         &lt;element name="ALaCarteSelection" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
         *                   &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ServiceSelection" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}RequestedServiceType"&gt;
         *                 &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="SeatSelection" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="OfferItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "passengerRefs",
            "aLaCarteSelection",
            "serviceSelection",
            "seatSelection"
        })
        public static class OfferItem {

            @XmlElement(name = "PassengerRefs", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected List<String> passengerRefs;
            @XmlElement(name = "ALaCarteSelection")
            protected OrderRequestType.Offer.OfferItem.ALaCarteSelection aLaCarteSelection;
            @XmlElement(name = "ServiceSelection")
            protected List<OrderRequestType.Offer.OfferItem.ServiceSelection> serviceSelection;
            @XmlElement(name = "SeatSelection")
            protected OrderRequestType.Offer.OfferItem.SeatSelection seatSelection;
            @XmlAttribute(name = "OfferItemID", required = true)
            protected String offerItemID;

            /**
             * Gets the value of the passengerRefs property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the passengerRefs property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPassengerRefs().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getPassengerRefs() {
                if (passengerRefs == null) {
                    passengerRefs = new ArrayList<String>();
                }
                return this.passengerRefs;
            }

            /**
             * Gets the value of the aLaCarteSelection property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRequestType.Offer.OfferItem.ALaCarteSelection }
             *     
             */
            public OrderRequestType.Offer.OfferItem.ALaCarteSelection getALaCarteSelection() {
                return aLaCarteSelection;
            }

            /**
             * Sets the value of the aLaCarteSelection property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRequestType.Offer.OfferItem.ALaCarteSelection }
             *     
             */
            public void setALaCarteSelection(OrderRequestType.Offer.OfferItem.ALaCarteSelection value) {
                this.aLaCarteSelection = value;
            }

            /**
             * Gets the value of the serviceSelection property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceSelection property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceSelection().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link OrderRequestType.Offer.OfferItem.ServiceSelection }
             * 
             * 
             */
            public List<OrderRequestType.Offer.OfferItem.ServiceSelection> getServiceSelection() {
                if (serviceSelection == null) {
                    serviceSelection = new ArrayList<OrderRequestType.Offer.OfferItem.ServiceSelection>();
                }
                return this.serviceSelection;
            }

            /**
             * Gets the value of the seatSelection property.
             * 
             * @return
             *     possible object is
             *     {@link OrderRequestType.Offer.OfferItem.SeatSelection }
             *     
             */
            public OrderRequestType.Offer.OfferItem.SeatSelection getSeatSelection() {
                return seatSelection;
            }

            /**
             * Sets the value of the seatSelection property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderRequestType.Offer.OfferItem.SeatSelection }
             *     
             */
            public void setSeatSelection(OrderRequestType.Offer.OfferItem.SeatSelection value) {
                this.seatSelection = value;
            }

            /**
             * Gets the value of the offerItemID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOfferItemID() {
                return offerItemID;
            }

            /**
             * Sets the value of the offerItemID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOfferItemID(String value) {
                this.offerItemID = value;
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
             *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
             *         &lt;element name="SegmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
                "quantity",
                "segmentID"
            })
            public static class ALaCarteSelection {

                @XmlElement(name = "Quantity")
                protected int quantity;
                @XmlElement(name = "SegmentID")
                protected String segmentID;

                /**
                 * Gets the value of the quantity property.
                 * 
                 */
                public int getQuantity() {
                    return quantity;
                }

                /**
                 * Sets the value of the quantity property.
                 * 
                 */
                public void setQuantity(int value) {
                    this.quantity = value;
                }

                /**
                 * Gets the value of the segmentID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegmentID() {
                    return segmentID;
                }

                /**
                 * Sets the value of the segmentID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegmentID(String value) {
                    this.segmentID = value;
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
             *         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                "row",
                "column"
            })
            public static class SeatSelection {

                @XmlElement(name = "Row", required = true)
                protected BigInteger row;
                @XmlElement(name = "Column", required = true)
                protected String column;

                /**
                 * Gets the value of the row property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getRow() {
                    return row;
                }

                /**
                 * Sets the value of the row property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setRow(BigInteger value) {
                    this.row = value;
                }

                /**
                 * Gets the value of the column property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getColumn() {
                    return column;
                }

                /**
                 * Sets the value of the column property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setColumn(String value) {
                    this.column = value;
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
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}RequestedServiceType"&gt;
             *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ServiceSelection
                extends RequestedServiceType
            {

                @XmlAttribute(name = "ServiceID", required = true)
                protected String serviceID;

                /**
                 * Gets the value of the serviceID property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getServiceID() {
                    return serviceID;
                }

                /**
                 * Sets the value of the serviceID property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setServiceID(String value) {
                    this.serviceID = value;
                }

            }

        }

    }

}
