
package com.springboot.dto.servicelistrs;

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
 * <p>Java class for ALaCarteV172_OfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ALaCarteV172_OfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Eligibility"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PassengerRefs" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
 *                           &lt;attribute name="AnyPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SegmentRefs" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
 *                           &lt;attribute name="AnySegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PriceClassRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="UnitPriceDetail"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalAmount"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}AwardPricing"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CombinationPricing"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DetailCurrencyPrice"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}EncodedCurrencyPrice"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}SimpleCurrencyPrice"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FareFiledIn" minOccurs="0"/&gt;
 *                   &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}V172_DiscountType" minOccurs="0"/&gt;
 *                   &lt;element name="Surcharges" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FeeSurchargeType" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}TaxDetailType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}TaxExemption" minOccurs="0"/&gt;
 *                   &lt;choice minOccurs="0"&gt;
 *                     &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}AwardPriceUnitType" minOccurs="0"/&gt;
 *                     &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CombinationPriceType" minOccurs="0"/&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Fees" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FeeSurchargeType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Service"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="OfferItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ALaCarteV172_OfferItemType", propOrder = {
    "eligibility",
    "unitPriceDetail",
    "service"
})
public class ALaCarteV172OfferItemType {

    @XmlElement(name = "Eligibility", required = true)
    protected ALaCarteV172OfferItemType.Eligibility eligibility;
    @XmlElement(name = "UnitPriceDetail", required = true)
    protected ALaCarteV172OfferItemType.UnitPriceDetail unitPriceDetail;
    @XmlElement(name = "Service", required = true)
    protected ALaCarteV172OfferItemType.Service service;
    @XmlAttribute(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;

    /**
     * Gets the value of the eligibility property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteV172OfferItemType.Eligibility }
     *     
     */
    public ALaCarteV172OfferItemType.Eligibility getEligibility() {
        return eligibility;
    }

    /**
     * Sets the value of the eligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteV172OfferItemType.Eligibility }
     *     
     */
    public void setEligibility(ALaCarteV172OfferItemType.Eligibility value) {
        this.eligibility = value;
    }

    /**
     * Gets the value of the unitPriceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteV172OfferItemType.UnitPriceDetail }
     *     
     */
    public ALaCarteV172OfferItemType.UnitPriceDetail getUnitPriceDetail() {
        return unitPriceDetail;
    }

    /**
     * Sets the value of the unitPriceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteV172OfferItemType.UnitPriceDetail }
     *     
     */
    public void setUnitPriceDetail(ALaCarteV172OfferItemType.UnitPriceDetail value) {
        this.unitPriceDetail = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteV172OfferItemType.Service }
     *     
     */
    public ALaCarteV172OfferItemType.Service getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteV172OfferItemType.Service }
     *     
     */
    public void setService(ALaCarteV172OfferItemType.Service value) {
        this.service = value;
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
     *         &lt;element name="PassengerRefs" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
     *                 &lt;attribute name="AnyPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SegmentRefs" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
     *                 &lt;attribute name="AnySegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PriceClassRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "passengerRefs",
        "segmentRefs",
        "priceClassRefs"
    })
    public static class Eligibility {

        @XmlElement(name = "PassengerRefs")
        protected List<ALaCarteV172OfferItemType.Eligibility.PassengerRefs> passengerRefs;
        @XmlElement(name = "SegmentRefs")
        protected List<ALaCarteV172OfferItemType.Eligibility.SegmentRefs> segmentRefs;
        @XmlElement(name = "PriceClassRefs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> priceClassRefs;

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
         * {@link ALaCarteV172OfferItemType.Eligibility.PassengerRefs }
         * 
         * 
         */
        public List<ALaCarteV172OfferItemType.Eligibility.PassengerRefs> getPassengerRefs() {
            if (passengerRefs == null) {
                passengerRefs = new ArrayList<ALaCarteV172OfferItemType.Eligibility.PassengerRefs>();
            }
            return this.passengerRefs;
        }

        /**
         * Gets the value of the segmentRefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentRefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ALaCarteV172OfferItemType.Eligibility.SegmentRefs }
         * 
         * 
         */
        public List<ALaCarteV172OfferItemType.Eligibility.SegmentRefs> getSegmentRefs() {
            if (segmentRefs == null) {
                segmentRefs = new ArrayList<ALaCarteV172OfferItemType.Eligibility.SegmentRefs>();
            }
            return this.segmentRefs;
        }

        /**
         * Gets the value of the priceClassRefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceClassRefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceClassRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPriceClassRefs() {
            if (priceClassRefs == null) {
                priceClassRefs = new ArrayList<String>();
            }
            return this.priceClassRefs;
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
         *       &lt;attribute name="AnyPassengerInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        public static class PassengerRefs {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "AnyPassengerInd")
            protected Boolean anyPassengerInd;

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
             * Gets the value of the anyPassengerInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnyPassengerInd() {
                return anyPassengerInd;
            }

            /**
             * Sets the value of the anyPassengerInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAnyPassengerInd(Boolean value) {
                this.anyPassengerInd = value;
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
         *       &lt;attribute name="AnySegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        public static class SegmentRefs {

            @XmlValue
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String value;
            @XmlAttribute(name = "AnySegmentInd")
            protected Boolean anySegmentInd;

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
             * Gets the value of the anySegmentInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAnySegmentInd() {
                return anySegmentInd;
            }

            /**
             * Sets the value of the anySegmentInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAnySegmentInd(Boolean value) {
                this.anySegmentInd = value;
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
     *         &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *         &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
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
        "serviceRef",
        "serviceDefinitionRef"
    })
    public static class Service {

        @XmlElement(name = "ServiceRef")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String serviceRef;
        @XmlElement(name = "ServiceDefinitionRef", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String serviceDefinitionRef;
        @XmlAttribute(name = "ServiceID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String serviceID;

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
         * Gets the value of the serviceDefinitionRef property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceDefinitionRef() {
            return serviceDefinitionRef;
        }

        /**
         * Sets the value of the serviceDefinitionRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceDefinitionRef(String value) {
            this.serviceDefinitionRef = value;
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
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}AwardPricing"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CombinationPricing"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DetailCurrencyPrice"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}EncodedCurrencyPrice"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}SimpleCurrencyPrice"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CurrencyAmountOptType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FareFiledIn" minOccurs="0"/&gt;
     *         &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}V172_DiscountType" minOccurs="0"/&gt;
     *         &lt;element name="Surcharges" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FeeSurchargeType" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}TaxDetailType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}TaxExemption" minOccurs="0"/&gt;
     *         &lt;choice minOccurs="0"&gt;
     *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}AwardPriceUnitType" minOccurs="0"/&gt;
     *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CombinationPriceType" minOccurs="0"/&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Fees" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FeeSurchargeType"&gt;
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
    public static class UnitPriceDetail {

        @XmlElement(name = "TotalAmount", required = true)
        protected ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount totalAmount;
        @XmlElement(name = "BaseAmount")
        protected CurrencyAmountOptType baseAmount;
        @XmlElement(name = "FareFiledIn")
        protected FareFilingType fareFiledIn;
        @XmlElement(name = "Discount")
        protected V172DiscountType discount;
        @XmlElement(name = "Surcharges")
        protected ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges surcharges;
        @XmlElement(name = "Taxes")
        protected TaxDetailType taxes;
        @XmlElement(name = "TaxExemption")
        protected TaxExemptionType taxExemption;
        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "Fees")
        protected ALaCarteV172OfferItemType.UnitPriceDetail.Fees fees;

        /**
         * Gets the value of the totalAmount property.
         * 
         * @return
         *     possible object is
         *     {@link ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount }
         *     
         */
        public ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount getTotalAmount() {
            return totalAmount;
        }

        /**
         * Sets the value of the totalAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount }
         *     
         */
        public void setTotalAmount(ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount value) {
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
         *     {@link ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges }
         *     
         */
        public ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges getSurcharges() {
            return surcharges;
        }

        /**
         * Sets the value of the surcharges property.
         * 
         * @param value
         *     allowed object is
         *     {@link ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges }
         *     
         */
        public void setSurcharges(ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges value) {
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
         *     {@link ALaCarteV172OfferItemType.UnitPriceDetail.Fees }
         *     
         */
        public ALaCarteV172OfferItemType.UnitPriceDetail.Fees getFees() {
            return fees;
        }

        /**
         * Sets the value of the fees property.
         * 
         * @param value
         *     allowed object is
         *     {@link ALaCarteV172OfferItemType.UnitPriceDetail.Fees }
         *     
         */
        public void setFees(ALaCarteV172OfferItemType.UnitPriceDetail.Fees value) {
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
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FeeSurchargeType"&gt;
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
         *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}FeeSurchargeType" maxOccurs="unbounded"/&gt;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}AwardPricing"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CombinationPricing"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DetailCurrencyPrice"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}EncodedCurrencyPrice"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}SimpleCurrencyPrice"/&gt;
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
