
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Order list request filter criteria.
 * 
 * <p>Java class for OrderFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookingRefFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BookingRefType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}OrderType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaxType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerGroupFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaxGroupType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaymentInfoType" minOccurs="0"/&gt;
 *         &lt;element name="TicketDocument" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TicketDocNbr"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="14"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *                   &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirportCitySimpleType" minOccurs="0"/&gt;
 *                   &lt;element name="CouponNumber" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="1"/&gt;
 *                         &lt;maxInclusive value="4"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FlightFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}FlightFilterCriteriaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderFilterCriteriaType", propOrder = {
    "bookingRefFilterCriteria",
    "order",
    "passengerFilterCriteria",
    "passengerGroupFilterCriteria",
    "paymentFilterCriteria",
    "ticketDocument",
    "flightFilterCriteria"
})
public class OrderFilterCriteriaType {

    @XmlElement(name = "BookingRefFilterCriteria")
    protected BookingRefType bookingRefFilterCriteria;
    @XmlElement(name = "Order")
    protected OrderType order;
    @XmlElement(name = "PassengerFilterCriteria")
    protected PaxType passengerFilterCriteria;
    @XmlElement(name = "PassengerGroupFilterCriteria")
    protected PaxGroupType passengerGroupFilterCriteria;
    @XmlElement(name = "PaymentFilterCriteria")
    protected PaymentInfoType paymentFilterCriteria;
    @XmlElement(name = "TicketDocument")
    protected OrderFilterCriteriaType.TicketDocument ticketDocument;
    @XmlElement(name = "FlightFilterCriteria")
    protected FlightFilterCriteriaType flightFilterCriteria;

    /**
     * Gets the value of the bookingRefFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link BookingRefType }
     *     
     */
    public BookingRefType getBookingRefFilterCriteria() {
        return bookingRefFilterCriteria;
    }

    /**
     * Sets the value of the bookingRefFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingRefType }
     *     
     */
    public void setBookingRefFilterCriteria(BookingRefType value) {
        this.bookingRefFilterCriteria = value;
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
     * Gets the value of the passengerFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaxType }
     *     
     */
    public PaxType getPassengerFilterCriteria() {
        return passengerFilterCriteria;
    }

    /**
     * Sets the value of the passengerFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxType }
     *     
     */
    public void setPassengerFilterCriteria(PaxType value) {
        this.passengerFilterCriteria = value;
    }

    /**
     * Gets the value of the passengerGroupFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPassengerGroupFilterCriteria() {
        return passengerGroupFilterCriteria;
    }

    /**
     * Sets the value of the passengerGroupFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPassengerGroupFilterCriteria(PaxGroupType value) {
        this.passengerGroupFilterCriteria = value;
    }

    /**
     * Gets the value of the paymentFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInfoType }
     *     
     */
    public PaymentInfoType getPaymentFilterCriteria() {
        return paymentFilterCriteria;
    }

    /**
     * Sets the value of the paymentFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInfoType }
     *     
     */
    public void setPaymentFilterCriteria(PaymentInfoType value) {
        this.paymentFilterCriteria = value;
    }

    /**
     * Gets the value of the ticketDocument property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFilterCriteriaType.TicketDocument }
     *     
     */
    public OrderFilterCriteriaType.TicketDocument getTicketDocument() {
        return ticketDocument;
    }

    /**
     * Sets the value of the ticketDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFilterCriteriaType.TicketDocument }
     *     
     */
    public void setTicketDocument(OrderFilterCriteriaType.TicketDocument value) {
        this.ticketDocument = value;
    }

    /**
     * Gets the value of the flightFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link FlightFilterCriteriaType }
     *     
     */
    public FlightFilterCriteriaType getFlightFilterCriteria() {
        return flightFilterCriteria;
    }

    /**
     * Sets the value of the flightFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightFilterCriteriaType }
     *     
     */
    public void setFlightFilterCriteria(FlightFilterCriteriaType value) {
        this.flightFilterCriteria = value;
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
     *         &lt;element name="TicketDocNbr"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="14"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
     *         &lt;element name="TicketingLocation" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirportCitySimpleType" minOccurs="0"/&gt;
     *         &lt;element name="CouponNumber" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="1"/&gt;
     *               &lt;maxInclusive value="4"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
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
        "ticketDocNbr",
        "dateOfIssue",
        "ticketingLocation",
        "couponNumber"
    })
    public static class TicketDocument {

        @XmlElement(name = "TicketDocNbr", required = true)
        protected String ticketDocNbr;
        @XmlElement(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;
        @XmlElement(name = "TicketingLocation")
        protected String ticketingLocation;
        @XmlElement(name = "CouponNumber")
        protected Integer couponNumber;

        /**
         * Gets the value of the ticketDocNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocNbr() {
            return ticketDocNbr;
        }

        /**
         * Sets the value of the ticketDocNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocNbr(String value) {
            this.ticketDocNbr = value;
        }

        /**
         * Gets the value of the dateOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * Sets the value of the dateOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
        }

        /**
         * Gets the value of the ticketingLocation property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketingLocation() {
            return ticketingLocation;
        }

        /**
         * Sets the value of the ticketingLocation property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketingLocation(String value) {
            this.ticketingLocation = value;
        }

        /**
         * Gets the value of the couponNumber property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getCouponNumber() {
            return couponNumber;
        }

        /**
         * Sets the value of the couponNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setCouponNumber(Integer value) {
            this.couponNumber = value;
        }

    }

}
