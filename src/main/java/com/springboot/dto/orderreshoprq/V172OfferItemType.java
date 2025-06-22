
package com.springboot.dto.orderreshoprq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for V172_OfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_OfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPriceDetail"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalAmount"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AwardPricing"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CombinationPricing"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}DetailCurrencyPrice"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}EncodedCurrencyPrice"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}SimpleCurrencyPrice"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FareFiledIn" minOccurs="0"/&gt;
 *                   &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}V172_DiscountType" minOccurs="0"/&gt;
 *                   &lt;element name="Surcharges" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TaxDetailType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TaxExemption" minOccurs="0"/&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AwardPriceUnitType" minOccurs="0"/&gt;
 *                     &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CombinationPriceType" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Fees" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FeeSurchargeType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Service" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PassengerRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="FlightRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/&gt;
 *                     &lt;element name="ServiceDefinitionRef"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
 *                             &lt;attribute name="SegmentRefs" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="SelectedSeat"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Seat"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                               &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                             &lt;/sequence&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FareDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OfferItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ModificationProhibitedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_OfferItemType", propOrder = {
    "totalPriceDetail",
    "service",
    "fareDetail"
})
public class V172OfferItemType {

    @XmlElement(name = "TotalPriceDetail", required = true)
    protected V172OfferItemType.TotalPriceDetail totalPriceDetail;
    @XmlElement(name = "Service", required = true)
    protected List<V172OfferItemType.Service> service;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlAttribute(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlAttribute(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlAttribute(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;

    /**
     * Gets the value of the totalPriceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link V172OfferItemType.TotalPriceDetail }
     *     
     */
    public V172OfferItemType.TotalPriceDetail getTotalPriceDetail() {
        return totalPriceDetail;
    }

    /**
     * Sets the value of the totalPriceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172OfferItemType.TotalPriceDetail }
     *     
     */
    public void setTotalPriceDetail(V172OfferItemType.TotalPriceDetail value) {
        this.totalPriceDetail = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link V172OfferItemType.Service }
     * 
     * 
     */
    public List<V172OfferItemType.Service> getService() {
        if (service == null) {
            service = new ArrayList<V172OfferItemType.Service>();
        }
        return this.service;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
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
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
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
     *         &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *         &lt;choice&gt;
     *           &lt;element name="FlightRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded"/&gt;
     *           &lt;element name="ServiceDefinitionRef"&gt;
     *             &lt;complexType&gt;
     *               &lt;simpleContent&gt;
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
     *                   &lt;attribute name="SegmentRefs" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/simpleContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="SelectedSeat"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Seat"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                               &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                     &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                   &lt;/sequence&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
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
        "serviceRef",
        "flightRefs",
        "serviceDefinitionRef",
        "selectedSeat"
    })
    public static class Service {

        @XmlElement(name = "PassengerRefs", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> passengerRefs;
        @XmlElement(name = "ServiceRef")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String serviceRef;
        @XmlElement(name = "FlightRefs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> flightRefs;
        @XmlElement(name = "ServiceDefinitionRef")
        protected V172OfferItemType.Service.ServiceDefinitionRef serviceDefinitionRef;
        @XmlElement(name = "SelectedSeat")
        protected V172OfferItemType.Service.SelectedSeat selectedSeat;
        @XmlAttribute(name = "ServiceID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String serviceID;

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
         * Gets the value of the serviceRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceRef() {
            return serviceRef;
        }

        /**
         * Sets the value of the serviceRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceRef(String value) {
            this.serviceRef = value;
        }

        /**
         * Gets the value of the flightRefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightRefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightRefs() {
            if (flightRefs == null) {
                flightRefs = new ArrayList<String>();
            }
            return this.flightRefs;
        }

        /**
         * Gets the value of the serviceDefinitionRef property.
         * 
         * @return
         *     possible object is
         *     {@link V172OfferItemType.Service.ServiceDefinitionRef }
         *     
         */
        public V172OfferItemType.Service.ServiceDefinitionRef getServiceDefinitionRef() {
            return serviceDefinitionRef;
        }

        /**
         * Sets the value of the serviceDefinitionRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OfferItemType.Service.ServiceDefinitionRef }
         *     
         */
        public void setServiceDefinitionRef(V172OfferItemType.Service.ServiceDefinitionRef value) {
            this.serviceDefinitionRef = value;
        }

        /**
         * Gets the value of the selectedSeat property.
         * 
         * @return
         *     possible object is
         *     {@link V172OfferItemType.Service.SelectedSeat }
         *     
         */
        public V172OfferItemType.Service.SelectedSeat getSelectedSeat() {
            return selectedSeat;
        }

        /**
         * Sets the value of the selectedSeat property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OfferItemType.Service.SelectedSeat }
         *     
         */
        public void setSelectedSeat(V172OfferItemType.Service.SelectedSeat value) {
            this.selectedSeat = value;
        }

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
         *         &lt;element name="Seat"&gt;
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
         *         &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *         &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
            "seat",
            "segmentRef",
            "serviceDefinitionRef"
        })
        public static class SelectedSeat {

            @XmlElement(name = "Seat", required = true)
            protected V172OfferItemType.Service.SelectedSeat.Seat seat;
            @XmlElement(name = "SegmentRef", required = true)
            protected Object segmentRef;
            @XmlElement(name = "ServiceDefinitionRef", required = true)
            protected Object serviceDefinitionRef;

            /**
             * Gets the value of the seat property.
             * 
             * @return
             *     possible object is
             *     {@link V172OfferItemType.Service.SelectedSeat.Seat }
             *     
             */
            public V172OfferItemType.Service.SelectedSeat.Seat getSeat() {
                return seat;
            }

            /**
             * Sets the value of the seat property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172OfferItemType.Service.SelectedSeat.Seat }
             *     
             */
            public void setSeat(V172OfferItemType.Service.SelectedSeat.Seat value) {
                this.seat = value;
            }

            /**
             * Gets the value of the segmentRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSegmentRef() {
                return segmentRef;
            }

            /**
             * Sets the value of the segmentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSegmentRef(Object value) {
                this.segmentRef = value;
            }

            /**
             * Gets the value of the serviceDefinitionRef property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getServiceDefinitionRef() {
                return serviceDefinitionRef;
            }

            /**
             * Sets the value of the serviceDefinitionRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setServiceDefinitionRef(Object value) {
                this.serviceDefinitionRef = value;
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
            public static class Seat {

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

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
         *       &lt;attribute name="SegmentRefs" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ServiceDefinitionRef {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "SegmentRefs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String segmentRefs;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the segmentRefs property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentRefs() {
                return segmentRefs;
            }

            /**
             * Sets the value of the segmentRefs property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentRefs(String value) {
                this.segmentRefs = value;
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
     *         &lt;element name="TotalAmount"&gt;
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
     *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FareFiledIn" minOccurs="0"/&gt;
     *         &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}V172_DiscountType" minOccurs="0"/&gt;
     *         &lt;element name="Surcharges" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TaxDetailType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TaxExemption" minOccurs="0"/&gt;
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AwardPriceUnitType" minOccurs="0"/&gt;
     *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CombinationPriceType" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Fees" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FeeSurchargeType"&gt;
     *               &lt;/extension&gt;
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
        "totalAmount",
        "baseAmount",
        "fareFiledIn",
        "discount",
        "surcharges",
        "taxes",
        "taxExemption",
        "awardPricing",
        "combinationPricing",
        "fees"
    })
    public static class TotalPriceDetail {

        @XmlElement(name = "TotalAmount", required = true)
        protected V172OfferItemType.TotalPriceDetail.TotalAmount totalAmount;
        @XmlElement(name = "BaseAmount")
        protected CurrencyAmountOptType baseAmount;
        @XmlElement(name = "FareFiledIn")
        protected FareFilingType fareFiledIn;
        @XmlElement(name = "Discount")
        protected V172DiscountType discount;
        @XmlElement(name = "Surcharges")
        protected V172OfferItemType.TotalPriceDetail.Surcharges surcharges;
        @XmlElement(name = "Taxes")
        protected TaxDetailType taxes;
        @XmlElement(name = "TaxExemption")
        protected TaxExemptionType taxExemption;
        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "Fees")
        protected V172OfferItemType.TotalPriceDetail.Fees fees;

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link V172OfferItemType.TotalPriceDetail.TotalAmount }
         *     
         */
        public V172OfferItemType.TotalPriceDetail.TotalAmount getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OfferItemType.TotalPriceDetail.TotalAmount }
         *     
         */
        public void setTotalAmount(V172OfferItemType.TotalPriceDetail.TotalAmount value) {
            this.totalAmount = value;
        }

        /**
         * Gets the value of the baseAmount property.
         * 
         * @return
         *     possible object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public CurrencyAmountOptType getBaseAmount() {
            return baseAmount;
        }

        /**
         * Sets the value of the baseAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyAmountOptType }
         *     
         */
        public void setBaseAmount(CurrencyAmountOptType value) {
            this.baseAmount = value;
        }

        /**
         * Gets the value of the fareFiledIn property.
         * 
         * @return
         *     possible object is
         *     {@link FareFilingType }
         *     
         */
        public FareFilingType getFareFiledIn() {
            return fareFiledIn;
        }

        /**
         * Sets the value of the fareFiledIn property.
         * 
         * @param value
         *     allowed object is
         *     {@link FareFilingType }
         *     
         */
        public void setFareFiledIn(FareFilingType value) {
            this.fareFiledIn = value;
        }

        /**
         * Gets the value of the discount property.
         * 
         * @return
         *     possible object is
         *     {@link V172DiscountType }
         *     
         */
        public V172DiscountType getDiscount() {
            return discount;
        }

        /**
         * Sets the value of the discount property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172DiscountType }
         *     
         */
        public void setDiscount(V172DiscountType value) {
            this.discount = value;
        }

        /**
         * Gets the value of the surcharges property.
         * 
         * @return
         *     possible object is
         *     {@link V172OfferItemType.TotalPriceDetail.Surcharges }
         *     
         */
        public V172OfferItemType.TotalPriceDetail.Surcharges getSurcharges() {
            return surcharges;
        }

        /**
         * Sets the value of the surcharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OfferItemType.TotalPriceDetail.Surcharges }
         *     
         */
        public void setSurcharges(V172OfferItemType.TotalPriceDetail.Surcharges value) {
            this.surcharges = value;
        }

        /**
         * Gets the value of the taxes property.
         * 
         * @return
         *     possible object is
         *     {@link TaxDetailType }
         *     
         */
        public TaxDetailType getTaxes() {
            return taxes;
        }

        /**
         * Sets the value of the taxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxDetailType }
         *     
         */
        public void setTaxes(TaxDetailType value) {
            this.taxes = value;
        }

        /**
         * Gets the value of the taxExemption property.
         * 
         * @return
         *     possible object is
         *     {@link TaxExemptionType }
         *     
         */
        public TaxExemptionType getTaxExemption() {
            return taxExemption;
        }

        /**
         * Sets the value of the taxExemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxExemptionType }
         *     
         */
        public void setTaxExemption(TaxExemptionType value) {
            this.taxExemption = value;
        }

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
         * Gets the value of the fees property.
         * 
         * @return
         *     possible object is
         *     {@link V172OfferItemType.TotalPriceDetail.Fees }
         *     
         */
        public V172OfferItemType.TotalPriceDetail.Fees getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OfferItemType.TotalPriceDetail.Fees }
         *     
         */
        public void setFees(V172OfferItemType.TotalPriceDetail.Fees value) {
            this.fees = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FeeSurchargeType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Fees
            extends FeeSurchargeType
        {


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
         *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
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
            "surcharge"
        })
        public static class Surcharges {

            @XmlElement(name = "Surcharge", required = true)
            protected List<FeeSurchargeType> surcharge;

            /**
             * Gets the value of the surcharge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the surcharge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSurcharge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FeeSurchargeType }
             * 
             * 
             */
            public List<FeeSurchargeType> getSurcharge() {
                if (surcharge == null) {
                    surcharge = new ArrayList<FeeSurchargeType>();
                }
                return this.surcharge;
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
        public static class TotalAmount {

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

}
