
package com.springboot.dto.ordercancelrs;

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
 * Payload information for OrderHistoryRS.
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}ID_Type"/&gt;
 *         &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}PenaltyType" minOccurs="0"/&gt;
 *         &lt;element name="OrderCancelProcessing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OrdCancelProcessType" minOccurs="0"/&gt;
 *         &lt;element name="TicketDocInfo" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AgentIDs" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AgentID" maxOccurs="2"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}IssuingAirlineInfo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}BookingReferences" minOccurs="0"/&gt;
 *                   &lt;element name="Payments" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Payment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}V172_PaymentMethodType" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OriginDestination" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Origin" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirportCitySimpleType"/&gt;
 *                             &lt;element name="Destination" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirportCitySimpleType"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="EndorsementText" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1,70} "/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AddlReferenceIDs" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AddlReferenceID" maxOccurs="5"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="FareInfo" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}Total" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element name="Taxes" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TaxDetailType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}FareInfo" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TicketDocument" maxOccurs="4"/&gt;
 *                   &lt;element name="OrderReference" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}CouponOrderKeyType" minOccurs="0"/&gt;
 *                   &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}V172_CommissionType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}CarrierFeeInfo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OriginalIssueInfo" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}PricingInfo" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "orderRefID",
    "changeFees",
    "orderCancelProcessing",
    "ticketDocInfo",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "OrderRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderRefID;
    @XmlElement(name = "ChangeFees")
    protected PenaltyType changeFees;
    @XmlElement(name = "OrderCancelProcessing")
    protected OrdCancelProcessType orderCancelProcessing;
    @XmlElement(name = "TicketDocInfo")
    protected List<ResponseType.TicketDocInfo> ticketDocInfo;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the orderRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderRefID() {
        return orderRefID;
    }

    /**
     * Sets the value of the orderRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderRefID(String value) {
        this.orderRefID = value;
    }

    /**
     * Gets the value of the changeFees property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyType }
     *     
     */
    public PenaltyType getChangeFees() {
        return changeFees;
    }

    /**
     * Sets the value of the changeFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyType }
     *     
     */
    public void setChangeFees(PenaltyType value) {
        this.changeFees = value;
    }

    /**
     * Gets the value of the orderCancelProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrdCancelProcessType }
     *     
     */
    public OrdCancelProcessType getOrderCancelProcessing() {
        return orderCancelProcessing;
    }

    /**
     * Sets the value of the orderCancelProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdCancelProcessType }
     *     
     */
    public void setOrderCancelProcessing(OrdCancelProcessType value) {
        this.orderCancelProcessing = value;
    }

    /**
     * Gets the value of the ticketDocInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDocInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDocInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType.TicketDocInfo }
     * 
     * 
     */
    public List<ResponseType.TicketDocInfo> getTicketDocInfo() {
        if (ticketDocInfo == null) {
            ticketDocInfo = new ArrayList<ResponseType.TicketDocInfo>();
        }
        return this.ticketDocInfo;
    }

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
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
     *         &lt;element name="AgentIDs" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AgentID" maxOccurs="2"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}IssuingAirlineInfo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}BookingReferences" minOccurs="0"/&gt;
     *         &lt;element name="Payments" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Payment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}V172_PaymentMethodType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OriginDestination" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Origin" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirportCitySimpleType"/&gt;
     *                   &lt;element name="Destination" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirportCitySimpleType"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="EndorsementText" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1,70} "/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AddlReferenceIDs" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AddlReferenceID" maxOccurs="5"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="FareInfo" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}Total" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element name="Taxes" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TaxDetailType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}FareInfo" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TicketDocument" maxOccurs="4"/&gt;
     *         &lt;element name="OrderReference" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}CouponOrderKeyType" minOccurs="0"/&gt;
     *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}V172_CommissionType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}CarrierFeeInfo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OriginalIssueInfo" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}PricingInfo" minOccurs="0"/&gt;
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
        "agentIDs",
        "issuingAirlineInfo",
        "bookingReferences",
        "payments",
        "originDestination",
        "endorsementText",
        "addlReferenceIDs",
        "fareInfo",
        "ticketDocument",
        "orderReference",
        "commission",
        "carrierFeeInfo",
        "originalIssueInfo",
        "pricingInfo"
    })
    public static class TicketDocInfo {

        @XmlElement(name = "AgentIDs")
        protected ResponseType.TicketDocInfo.AgentIDs agentIDs;
        @XmlElement(name = "IssuingAirlineInfo")
        protected IssuingAirlineInfo issuingAirlineInfo;
        @XmlElement(name = "BookingReferences")
        protected BookingReferences bookingReferences;
        @XmlElement(name = "Payments")
        protected ResponseType.TicketDocInfo.Payments payments;
        @XmlElement(name = "OriginDestination")
        protected ResponseType.TicketDocInfo.OriginDestination originDestination;
        @XmlElement(name = "EndorsementText")
        protected String endorsementText;
        @XmlElement(name = "AddlReferenceIDs")
        protected ResponseType.TicketDocInfo.AddlReferenceIDs addlReferenceIDs;
        @XmlElement(name = "FareInfo")
        protected ResponseType.TicketDocInfo.FareInfo fareInfo;
        @XmlElement(name = "TicketDocument", required = true)
        protected List<TicketDocument> ticketDocument;
        @XmlElement(name = "OrderReference")
        protected CouponOrderKeyType orderReference;
        @XmlElement(name = "Commission")
        protected V172CommissionType commission;
        @XmlElement(name = "CarrierFeeInfo")
        protected CarrierFeeInfoType carrierFeeInfo;
        @XmlElement(name = "OriginalIssueInfo")
        protected OriginalIssueInfo originalIssueInfo;
        @XmlElement(name = "PricingInfo")
        protected PricingInfo pricingInfo;

        /**
         * Gets the value of the agentIDs property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType.TicketDocInfo.AgentIDs }
         *     
         */
        public ResponseType.TicketDocInfo.AgentIDs getAgentIDs() {
            return agentIDs;
        }

        /**
         * Sets the value of the agentIDs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType.TicketDocInfo.AgentIDs }
         *     
         */
        public void setAgentIDs(ResponseType.TicketDocInfo.AgentIDs value) {
            this.agentIDs = value;
        }

        /**
         * Gets the value of the issuingAirlineInfo property.
         * 
         * @return
         *     possible object is
         *     {@link IssuingAirlineInfo }
         *     
         */
        public IssuingAirlineInfo getIssuingAirlineInfo() {
            return issuingAirlineInfo;
        }

        /**
         * Sets the value of the issuingAirlineInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link IssuingAirlineInfo }
         *     
         */
        public void setIssuingAirlineInfo(IssuingAirlineInfo value) {
            this.issuingAirlineInfo = value;
        }

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
         * Gets the value of the payments property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType.TicketDocInfo.Payments }
         *     
         */
        public ResponseType.TicketDocInfo.Payments getPayments() {
            return payments;
        }

        /**
         * Sets the value of the payments property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType.TicketDocInfo.Payments }
         *     
         */
        public void setPayments(ResponseType.TicketDocInfo.Payments value) {
            this.payments = value;
        }

        /**
         * Gets the value of the originDestination property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType.TicketDocInfo.OriginDestination }
         *     
         */
        public ResponseType.TicketDocInfo.OriginDestination getOriginDestination() {
            return originDestination;
        }

        /**
         * Sets the value of the originDestination property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType.TicketDocInfo.OriginDestination }
         *     
         */
        public void setOriginDestination(ResponseType.TicketDocInfo.OriginDestination value) {
            this.originDestination = value;
        }

        /**
         * Gets the value of the endorsementText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndorsementText() {
            return endorsementText;
        }

        /**
         * Sets the value of the endorsementText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndorsementText(String value) {
            this.endorsementText = value;
        }

        /**
         * Gets the value of the addlReferenceIDs property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType.TicketDocInfo.AddlReferenceIDs }
         *     
         */
        public ResponseType.TicketDocInfo.AddlReferenceIDs getAddlReferenceIDs() {
            return addlReferenceIDs;
        }

        /**
         * Sets the value of the addlReferenceIDs property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType.TicketDocInfo.AddlReferenceIDs }
         *     
         */
        public void setAddlReferenceIDs(ResponseType.TicketDocInfo.AddlReferenceIDs value) {
            this.addlReferenceIDs = value;
        }

        /**
         * Gets the value of the fareInfo property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType.TicketDocInfo.FareInfo }
         *     
         */
        public ResponseType.TicketDocInfo.FareInfo getFareInfo() {
            return fareInfo;
        }

        /**
         * Sets the value of the fareInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType.TicketDocInfo.FareInfo }
         *     
         */
        public void setFareInfo(ResponseType.TicketDocInfo.FareInfo value) {
            this.fareInfo = value;
        }

        /**
         * Gets the value of the ticketDocument property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTicketDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TicketDocument }
         * 
         * 
         */
        public List<TicketDocument> getTicketDocument() {
            if (ticketDocument == null) {
                ticketDocument = new ArrayList<TicketDocument>();
            }
            return this.ticketDocument;
        }

        /**
         * Gets the value of the orderReference property.
         * 
         * @return
         *     possible object is
         *     {@link CouponOrderKeyType }
         *     
         */
        public CouponOrderKeyType getOrderReference() {
            return orderReference;
        }

        /**
         * Sets the value of the orderReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link CouponOrderKeyType }
         *     
         */
        public void setOrderReference(CouponOrderKeyType value) {
            this.orderReference = value;
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
         * Gets the value of the carrierFeeInfo property.
         * 
         * @return
         *     possible object is
         *     {@link CarrierFeeInfoType }
         *     
         */
        public CarrierFeeInfoType getCarrierFeeInfo() {
            return carrierFeeInfo;
        }

        /**
         * Sets the value of the carrierFeeInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link CarrierFeeInfoType }
         *     
         */
        public void setCarrierFeeInfo(CarrierFeeInfoType value) {
            this.carrierFeeInfo = value;
        }

        /**
         * Gets the value of the originalIssueInfo property.
         * 
         * @return
         *     possible object is
         *     {@link OriginalIssueInfo }
         *     
         */
        public OriginalIssueInfo getOriginalIssueInfo() {
            return originalIssueInfo;
        }

        /**
         * Sets the value of the originalIssueInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link OriginalIssueInfo }
         *     
         */
        public void setOriginalIssueInfo(OriginalIssueInfo value) {
            this.originalIssueInfo = value;
        }

        /**
         * Gets the value of the pricingInfo property.
         * 
         * @return
         *     possible object is
         *     {@link PricingInfo }
         *     
         */
        public PricingInfo getPricingInfo() {
            return pricingInfo;
        }

        /**
         * Sets the value of the pricingInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link PricingInfo }
         *     
         */
        public void setPricingInfo(PricingInfo value) {
            this.pricingInfo = value;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AddlReferenceID" maxOccurs="5"/&gt;
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
            "addlReferenceID"
        })
        public static class AddlReferenceIDs {

            @XmlElement(name = "AddlReferenceID", required = true)
            protected List<AdditionalReferenceType> addlReferenceID;

            /**
             * Gets the value of the addlReferenceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the addlReferenceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAddlReferenceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AdditionalReferenceType }
             * 
             * 
             */
            public List<AdditionalReferenceType> getAddlReferenceID() {
                if (addlReferenceID == null) {
                    addlReferenceID = new ArrayList<AdditionalReferenceType>();
                }
                return this.addlReferenceID;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AgentID" maxOccurs="2"/&gt;
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
            "agentID"
        })
        public static class AgentIDs {

            @XmlElement(name = "AgentID", required = true)
            protected List<AgentID> agentID;

            /**
             * Gets the value of the agentID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the agentID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAgentID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AgentID }
             * 
             * 
             */
            public List<AgentID> getAgentID() {
                if (agentID == null) {
                    agentID = new ArrayList<AgentID>();
                }
                return this.agentID;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}BaseFare" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}EquivFare" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}Total" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element name="Taxes" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TaxDetailType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}UnstructuredFareCalcInfo" maxOccurs="3" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}FareInfo" minOccurs="0"/&gt;
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
            "baseFare",
            "equivFare",
            "total",
            "taxes",
            "unstructuredFareCalcInfo",
            "fareInfo"
        })
        public static class FareInfo {

            @XmlElement(name = "BaseFare")
            protected List<BaseFareTransactionType> baseFare;
            @XmlElement(name = "EquivFare")
            protected List<EquivFareTransactionType> equivFare;
            @XmlElement(name = "Total")
            protected List<TotalFareTransactionType> total;
            @XmlElement(name = "Taxes")
            protected ResponseType.TicketDocInfo.FareInfo.Taxes taxes;
            @XmlElement(name = "UnstructuredFareCalcInfo")
            protected List<UnstructuredFareCalcType> unstructuredFareCalcInfo;
            @XmlElement(name = "FareInfo")
            protected ETFareInfoType fareInfo;

            /**
             * Gets the value of the baseFare property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the baseFare property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBaseFare().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BaseFareTransactionType }
             * 
             * 
             */
            public List<BaseFareTransactionType> getBaseFare() {
                if (baseFare == null) {
                    baseFare = new ArrayList<BaseFareTransactionType>();
                }
                return this.baseFare;
            }

            /**
             * Gets the value of the equivFare property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the equivFare property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getEquivFare().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link EquivFareTransactionType }
             * 
             * 
             */
            public List<EquivFareTransactionType> getEquivFare() {
                if (equivFare == null) {
                    equivFare = new ArrayList<EquivFareTransactionType>();
                }
                return this.equivFare;
            }

            /**
             * Gets the value of the total property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the total property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTotal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TotalFareTransactionType }
             * 
             * 
             */
            public List<TotalFareTransactionType> getTotal() {
                if (total == null) {
                    total = new ArrayList<TotalFareTransactionType>();
                }
                return this.total;
            }

            /**
             * Gets the value of the taxes property.
             * 
             * @return
             *     possible object is
             *     {@link ResponseType.TicketDocInfo.FareInfo.Taxes }
             *     
             */
            public ResponseType.TicketDocInfo.FareInfo.Taxes getTaxes() {
                return taxes;
            }

            /**
             * Sets the value of the taxes property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponseType.TicketDocInfo.FareInfo.Taxes }
             *     
             */
            public void setTaxes(ResponseType.TicketDocInfo.FareInfo.Taxes value) {
                this.taxes = value;
            }

            /**
             * Gets the value of the unstructuredFareCalcInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the unstructuredFareCalcInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUnstructuredFareCalcInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UnstructuredFareCalcType }
             * 
             * 
             */
            public List<UnstructuredFareCalcType> getUnstructuredFareCalcInfo() {
                if (unstructuredFareCalcInfo == null) {
                    unstructuredFareCalcInfo = new ArrayList<UnstructuredFareCalcType>();
                }
                return this.unstructuredFareCalcInfo;
            }

            /**
             * Gets the value of the fareInfo property.
             * 
             * @return
             *     possible object is
             *     {@link ETFareInfoType }
             *     
             */
            public ETFareInfoType getFareInfo() {
                return fareInfo;
            }

            /**
             * Sets the value of the fareInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link ETFareInfoType }
             *     
             */
            public void setFareInfo(ETFareInfoType value) {
                this.fareInfo = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TaxDetailType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Taxes
                extends TaxDetailType
            {


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
         *         &lt;element name="Origin" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirportCitySimpleType"/&gt;
         *         &lt;element name="Destination" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirportCitySimpleType"/&gt;
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
            "origin",
            "destination"
        })
        public static class OriginDestination {

            @XmlElement(name = "Origin", required = true)
            protected String origin;
            @XmlElement(name = "Destination", required = true)
            protected String destination;

            /**
             * Gets the value of the origin property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrigin() {
                return origin;
            }

            /**
             * Sets the value of the origin property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrigin(String value) {
                this.origin = value;
            }

            /**
             * Gets the value of the destination property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestination() {
                return destination;
            }

            /**
             * Sets the value of the destination property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestination(String value) {
                this.destination = value;
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
         *         &lt;element name="Payment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}V172_PaymentMethodType" maxOccurs="unbounded"/&gt;
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
            protected List<V172PaymentMethodType> payment;

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
             * {@link V172PaymentMethodType }
             * 
             * 
             */
            public List<V172PaymentMethodType> getPayment() {
                if (payment == null) {
                    payment = new ArrayList<V172PaymentMethodType>();
                }
                return this.payment;
            }

        }

    }

}
