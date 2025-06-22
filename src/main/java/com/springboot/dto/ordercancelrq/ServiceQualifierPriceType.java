
package com.springboot.dto.ordercancelrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE TO BE PRICED definition.
 * 
 * <p>Java class for ServiceQualifierPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceQualifierPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Encoding" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ServiceEncodingType"/&gt;
 *         &lt;element name="Fulfillment" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OfferValidDates" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Start" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="End" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Provider" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}FulfillmentPartnerType" minOccurs="0"/&gt;
 *                   &lt;element name="Location" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AirportFulfillmentLocation"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OtherFulfillmentLocation"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Associations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="2"&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}SegmentReferences" maxOccurs="unbounded"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PassengerReferences" maxOccurs="unbounded"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Include" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceQualifierPriceType", propOrder = {
    "encoding",
    "fulfillment",
    "associations",
    "include"
})
public class ServiceQualifierPriceType {

    @XmlElement(name = "Encoding", required = true)
    protected ServiceEncodingType encoding;
    @XmlElement(name = "Fulfillment")
    protected ServiceQualifierPriceType.Fulfillment fulfillment;
    @XmlElement(name = "Associations")
    protected ServiceQualifierPriceType.Associations associations;
    @XmlElement(name = "Include", defaultValue = "true")
    protected boolean include;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the encoding property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEncodingType }
     *     
     */
    public ServiceEncodingType getEncoding() {
        return encoding;
    }

    /**
     * Sets the value of the encoding property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEncodingType }
     *     
     */
    public void setEncoding(ServiceEncodingType value) {
        this.encoding = value;
    }

    /**
     * Gets the value of the fulfillment property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierPriceType.Fulfillment }
     *     
     */
    public ServiceQualifierPriceType.Fulfillment getFulfillment() {
        return fulfillment;
    }

    /**
     * Sets the value of the fulfillment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierPriceType.Fulfillment }
     *     
     */
    public void setFulfillment(ServiceQualifierPriceType.Fulfillment value) {
        this.fulfillment = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceQualifierPriceType.Associations }
     *     
     */
    public ServiceQualifierPriceType.Associations getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceQualifierPriceType.Associations }
     *     
     */
    public void setAssociations(ServiceQualifierPriceType.Associations value) {
        this.associations = value;
    }

    /**
     * Gets the value of the include property.
     * 
     */
    public boolean isInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     */
    public void setInclude(boolean value) {
        this.include = value;
    }

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice maxOccurs="2"&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}SegmentReferences" maxOccurs="unbounded"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PassengerReferences" maxOccurs="unbounded"/&gt;
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
        "segmentReferencesOrPassengerReferences"
    })
    public static class Associations {

        @XmlElementRefs({
            @XmlElementRef(name = "SegmentReferences", namespace = "http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ", type = SegmentReferences.class, required = false),
            @XmlElementRef(name = "PassengerReferences", namespace = "http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ", type = JAXBElement.class, required = false)
        })
        protected List<Object> segmentReferencesOrPassengerReferences;

        /**
         * Gets the value of the segmentReferencesOrPassengerReferences property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentReferencesOrPassengerReferences property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentReferencesOrPassengerReferences().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link String }{@code >}
         * {@link SegmentReferences }
         * 
         * 
         */
        public List<Object> getSegmentReferencesOrPassengerReferences() {
            if (segmentReferencesOrPassengerReferences == null) {
                segmentReferencesOrPassengerReferences = new ArrayList<Object>();
            }
            return this.segmentReferencesOrPassengerReferences;
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
     *         &lt;element name="OfferValidDates" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Start" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="End" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Provider" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}FulfillmentPartnerType" minOccurs="0"/&gt;
     *         &lt;element name="Location" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AirportFulfillmentLocation"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OtherFulfillmentLocation"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "offerValidDates",
        "provider",
        "location"
    })
    public static class Fulfillment {

        @XmlElement(name = "OfferValidDates")
        protected ServiceQualifierPriceType.Fulfillment.OfferValidDates offerValidDates;
        @XmlElement(name = "Provider")
        protected FulfillmentPartnerType provider;
        @XmlElement(name = "Location")
        protected ServiceQualifierPriceType.Fulfillment.Location location;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the offerValidDates property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates }
         *     
         */
        public ServiceQualifierPriceType.Fulfillment.OfferValidDates getOfferValidDates() {
            return offerValidDates;
        }

        /**
         * Sets the value of the offerValidDates property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates }
         *     
         */
        public void setOfferValidDates(ServiceQualifierPriceType.Fulfillment.OfferValidDates value) {
            this.offerValidDates = value;
        }

        /**
         * Gets the value of the provider property.
         * 
         * @return
         *     possible object is
         *     {@link FulfillmentPartnerType }
         *     
         */
        public FulfillmentPartnerType getProvider() {
            return provider;
        }

        /**
         * Sets the value of the provider property.
         * 
         * @param value
         *     allowed object is
         *     {@link FulfillmentPartnerType }
         *     
         */
        public void setProvider(FulfillmentPartnerType value) {
            this.provider = value;
        }

        /**
         * Gets the value of the location property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceQualifierPriceType.Fulfillment.Location }
         *     
         */
        public ServiceQualifierPriceType.Fulfillment.Location getLocation() {
            return location;
        }

        /**
         * Sets the value of the location property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceQualifierPriceType.Fulfillment.Location }
         *     
         */
        public void setLocation(ServiceQualifierPriceType.Fulfillment.Location value) {
            this.location = value;
        }

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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AirportFulfillmentLocation"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OtherFulfillmentLocation"/&gt;
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
            "airportFulfillmentLocation",
            "otherFulfillmentLocation"
        })
        public static class Location {

            @XmlElement(name = "AirportFulfillmentLocation", required = true)
            protected SrvcLocationAirportType airportFulfillmentLocation;
            @XmlElement(name = "OtherFulfillmentLocation", required = true)
            protected SrvcLocationAddressType otherFulfillmentLocation;

            /**
             * .
             * 
             * @return
             *     possible object is
             *     {@link SrvcLocationAirportType }
             *     
             */
            public SrvcLocationAirportType getAirportFulfillmentLocation() {
                return airportFulfillmentLocation;
            }

            /**
             * Sets the value of the airportFulfillmentLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link SrvcLocationAirportType }
             *     
             */
            public void setAirportFulfillmentLocation(SrvcLocationAirportType value) {
                this.airportFulfillmentLocation = value;
            }

            /**
             * Gets the value of the otherFulfillmentLocation property.
             * 
             * @return
             *     possible object is
             *     {@link SrvcLocationAddressType }
             *     
             */
            public SrvcLocationAddressType getOtherFulfillmentLocation() {
                return otherFulfillmentLocation;
            }

            /**
             * Sets the value of the otherFulfillmentLocation property.
             * 
             * @param value
             *     allowed object is
             *     {@link SrvcLocationAddressType }
             *     
             */
            public void setOtherFulfillmentLocation(SrvcLocationAddressType value) {
                this.otherFulfillmentLocation = value;
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
         *         &lt;element name="Start" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="End" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
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
            "start",
            "end"
        })
        public static class OfferValidDates {

            @XmlElement(name = "Start")
            protected ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start start;
            @XmlElement(name = "End")
            protected ServiceQualifierPriceType.Fulfillment.OfferValidDates.End end;

            /**
             * Gets the value of the start property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start }
             *     
             */
            public ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start getStart() {
                return start;
            }

            /**
             * Sets the value of the start property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start }
             *     
             */
            public void setStart(ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start value) {
                this.start = value;
            }

            /**
             * Gets the value of the end property.
             * 
             * @return
             *     possible object is
             *     {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.End }
             *     
             */
            public ServiceQualifierPriceType.Fulfillment.OfferValidDates.End getEnd() {
                return end;
            }

            /**
             * Sets the value of the end property.
             * 
             * @param value
             *     allowed object is
             *     {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.End }
             *     
             */
            public void setEnd(ServiceQualifierPriceType.Fulfillment.OfferValidDates.End value) {
                this.end = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class End
                extends CoreDateGrpType
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
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CoreDateGrpType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Start
                extends CoreDateGrpType
            {


            }

        }

    }

}
