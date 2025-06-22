
package com.springboot.dto.orderviewrs;

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
 * Payload information for OrderViewRS.
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
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OrdViewMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OrderViewProcessing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OrderViewProcessType" minOccurs="0"/&gt;
 *         &lt;element name="TicketDocInfos" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TicketDocInfo" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AgentIDs" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgentID" maxOccurs="2"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}IssuingAirlineInfo" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TicketDocument" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ServicePriceType" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierFeeInfo" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OriginalIssueInfo" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PassengerReference"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "commission",
    "dataLists",
    "metadata",
    "order",
    "orderViewProcessing",
    "ticketDocInfos",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected OrdViewMetadataType metadata;
    @XmlElement(name = "Order", required = true)
    protected List<OrderType> order;
    @XmlElement(name = "OrderViewProcessing")
    protected OrderViewProcessType orderViewProcessing;
    @XmlElement(name = "TicketDocInfos")
    protected ResponseType.TicketDocInfos ticketDocInfos;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

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
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link OrdViewMetadataType }
     *     
     */
    public OrdViewMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdViewMetadataType }
     *     
     */
    public void setMetadata(OrdViewMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the order property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the order property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrder().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderType }
     * 
     * 
     */
    public List<OrderType> getOrder() {
        if (order == null) {
            order = new ArrayList<OrderType>();
        }
        return this.order;
    }

    /**
     * Gets the value of the orderViewProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrderViewProcessType }
     *     
     */
    public OrderViewProcessType getOrderViewProcessing() {
        return orderViewProcessing;
    }

    /**
     * Sets the value of the orderViewProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderViewProcessType }
     *     
     */
    public void setOrderViewProcessing(OrderViewProcessType value) {
        this.orderViewProcessing = value;
    }

    /**
     * Gets the value of the ticketDocInfos property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType.TicketDocInfos }
     *     
     */
    public ResponseType.TicketDocInfos getTicketDocInfos() {
        return ticketDocInfos;
    }

    /**
     * Sets the value of the ticketDocInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType.TicketDocInfos }
     *     
     */
    public void setTicketDocInfos(ResponseType.TicketDocInfos value) {
        this.ticketDocInfos = value;
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
     *         &lt;element name="TicketDocInfo" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AgentIDs" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgentID" maxOccurs="2"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}IssuingAirlineInfo" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TicketDocument" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ServicePriceType" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierFeeInfo" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OriginalIssueInfo" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PassengerReference"/&gt;
     *                 &lt;/sequence&gt;
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
        "ticketDocInfo"
    })
    public static class TicketDocInfos {

        @XmlElement(name = "TicketDocInfo", required = true)
        protected List<ResponseType.TicketDocInfos.TicketDocInfo> ticketDocInfo;

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
         * {@link ResponseType.TicketDocInfos.TicketDocInfo }
         * 
         * 
         */
        public List<ResponseType.TicketDocInfos.TicketDocInfo> getTicketDocInfo() {
            if (ticketDocInfo == null) {
                ticketDocInfo = new ArrayList<ResponseType.TicketDocInfos.TicketDocInfo>();
            }
            return this.ticketDocInfo;
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
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgentID" maxOccurs="2"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}IssuingAirlineInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TicketDocument" maxOccurs="unbounded"/&gt;
         *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ServicePriceType" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CarrierFeeInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OriginalIssueInfo" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PassengerReference"/&gt;
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
            "ticketDocument",
            "price",
            "carrierFeeInfo",
            "originalIssueInfo",
            "passengerReference"
        })
        public static class TicketDocInfo {

            @XmlElement(name = "AgentIDs")
            protected ResponseType.TicketDocInfos.TicketDocInfo.AgentIDs agentIDs;
            @XmlElement(name = "IssuingAirlineInfo")
            protected IssuingAirlineInfo issuingAirlineInfo;
            @XmlElement(name = "TicketDocument", required = true)
            protected List<TicketDocument> ticketDocument;
            @XmlElement(name = "Price")
            protected ServicePriceType price;
            @XmlElement(name = "CarrierFeeInfo")
            protected CarrierFeeInfoType carrierFeeInfo;
            @XmlElement(name = "OriginalIssueInfo")
            protected OriginalIssueInfo originalIssueInfo;
            @XmlElement(name = "PassengerReference", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String passengerReference;

            /**
             * Gets the value of the agentIDs property.
             * 
             * @return
             *     possible object is
             *     {@link ResponseType.TicketDocInfos.TicketDocInfo.AgentIDs }
             *     
             */
            public ResponseType.TicketDocInfos.TicketDocInfo.AgentIDs getAgentIDs() {
                return agentIDs;
            }

            /**
             * Sets the value of the agentIDs property.
             * 
             * @param value
             *     allowed object is
             *     {@link ResponseType.TicketDocInfos.TicketDocInfo.AgentIDs }
             *     
             */
            public void setAgentIDs(ResponseType.TicketDocInfos.TicketDocInfo.AgentIDs value) {
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
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link ServicePriceType }
             *     
             */
            public ServicePriceType getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServicePriceType }
             *     
             */
            public void setPrice(ServicePriceType value) {
                this.price = value;
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
             * Gets the value of the passengerReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengerReference() {
                return passengerReference;
            }

            /**
             * Sets the value of the passengerReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengerReference(String value) {
                this.passengerReference = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgentID" maxOccurs="2"/&gt;
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

        }

    }

}
