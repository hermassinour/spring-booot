
package com.springboot.dto.seatavailabilityrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Shopping Offer Association(s) definition.
 * 
 * <p>Java class for OfferAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAssociationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
 *         &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}FlightInfoAssocType" minOccurs="0"/&gt;
 *         &lt;element name="PriceClass" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}PriceClassReference"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}BagDetailAssocType" minOccurs="0"/&gt;
 *         &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
 *         &lt;element name="Services" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Service" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}BundleReference" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ServiceReferences" maxOccurs="unbounded"/&gt;
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
 *         &lt;element name="Media" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}MediaAssocType" minOccurs="0"/&gt;
 *         &lt;element name="Other" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}OtherOfferAssocType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssociationsType", propOrder = {
    "shopper",
    "flight",
    "priceClass",
    "bagDetails",
    "offerDetails",
    "services",
    "media",
    "other"
})
@XmlSeeAlso({
    OfferAssociations.class
})
public class OfferAssociationsType {

    @XmlElement(name = "Shopper")
    protected ShopperInfoAssocType shopper;
    @XmlElement(name = "Flight")
    protected FlightInfoAssocType flight;
    @XmlElement(name = "PriceClass")
    protected OfferAssociationsType.PriceClass priceClass;
    @XmlElement(name = "BagDetails")
    protected BagDetailAssocType bagDetails;
    @XmlElement(name = "OfferDetails")
    protected OfferDetailInfoAssocType offerDetails;
    @XmlElement(name = "Services")
    protected OfferAssociationsType.Services services;
    @XmlElement(name = "Media")
    protected MediaAssocType media;
    @XmlElement(name = "Other")
    protected OtherOfferAssocType other;

    /**
     * Gets the value of the shopper property.
     * 
     * @return
     *     possible object is
     *     {@link ShopperInfoAssocType }
     *     
     */
    public ShopperInfoAssocType getShopper() {
        return shopper;
    }

    /**
     * Sets the value of the shopper property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShopperInfoAssocType }
     *     
     */
    public void setShopper(ShopperInfoAssocType value) {
        this.shopper = value;
    }

    /**
     * Gets the value of the flight property.
     * 
     * @return
     *     possible object is
     *     {@link FlightInfoAssocType }
     *     
     */
    public FlightInfoAssocType getFlight() {
        return flight;
    }

    /**
     * Sets the value of the flight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInfoAssocType }
     *     
     */
    public void setFlight(FlightInfoAssocType value) {
        this.flight = value;
    }

    /**
     * Gets the value of the priceClass property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociationsType.PriceClass }
     *     
     */
    public OfferAssociationsType.PriceClass getPriceClass() {
        return priceClass;
    }

    /**
     * Sets the value of the priceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociationsType.PriceClass }
     *     
     */
    public void setPriceClass(OfferAssociationsType.PriceClass value) {
        this.priceClass = value;
    }

    /**
     * Gets the value of the bagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssocType }
     *     
     */
    public BagDetailAssocType getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssocType }
     *     
     */
    public void setBagDetails(BagDetailAssocType value) {
        this.bagDetails = value;
    }

    /**
     * Gets the value of the offerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetails() {
        return offerDetails;
    }

    /**
     * Sets the value of the offerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetails(OfferDetailInfoAssocType value) {
        this.offerDetails = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link OfferAssociationsType.Services }
     *     
     */
    public OfferAssociationsType.Services getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferAssociationsType.Services }
     *     
     */
    public void setServices(OfferAssociationsType.Services value) {
        this.services = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaAssocType }
     *     
     */
    public MediaAssocType getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaAssocType }
     *     
     */
    public void setMedia(MediaAssocType value) {
        this.media = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public OtherOfferAssocType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public void setOther(OtherOfferAssocType value) {
        this.other = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}PriceClassReference"/&gt;
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
        "priceClassReference"
    })
    public static class PriceClass {

        @XmlElement(name = "PriceClassReference", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String priceClassReference;

        /**
         * Gets the value of the priceClassReference property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceClassReference() {
            return priceClassReference;
        }

        /**
         * Sets the value of the priceClassReference property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceClassReference(String value) {
            this.priceClassReference = value;
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
     *         &lt;element name="Service" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}BundleReference" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ServiceReferences" maxOccurs="unbounded"/&gt;
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
        "service"
    })
    public static class Services {

        @XmlElement(name = "Service", required = true)
        protected List<OfferAssociationsType.Services.Service> service;

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
         * {@link OfferAssociationsType.Services.Service }
         * 
         * 
         */
        public List<OfferAssociationsType.Services.Service> getService() {
            if (service == null) {
                service = new ArrayList<OfferAssociationsType.Services.Service>();
            }
            return this.service;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}BundleReference" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ServiceReferences" maxOccurs="unbounded"/&gt;
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
            "bundleReference",
            "serviceReferences"
        })
        public static class Service {

            @XmlElement(name = "BundleReference")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String bundleReference;
            @XmlElement(name = "ServiceReferences", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected List<String> serviceReferences;

            /**
             * Gets the value of the bundleReference property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBundleReference() {
                return bundleReference;
            }

            /**
             * Sets the value of the bundleReference property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBundleReference(String value) {
                this.bundleReference = value;
            }

            /**
             * Gets the value of the serviceReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getServiceReferences() {
                if (serviceReferences == null) {
                    serviceReferences = new ArrayList<String>();
                }
                return this.serviceReferences;
            }

        }

    }

}
