
package com.springboot.dto.ordercancelrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Priced Flight Offer Association definition.
 * 
 * <p>Java class for PricedFlightOfferAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricedFlightOfferAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AssociatedPassenger" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ApplicableFlight" minOccurs="0"/&gt;
 *         &lt;element name="PriceClass" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PriceClassReference"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OfferDetailAssociation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}IncludedService" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AssociatedService" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OtherAssociation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedFlightOfferAssocType", propOrder = {
    "associatedPassenger",
    "applicableFlight",
    "priceClass",
    "offerDetailAssociation",
    "includedService",
    "associatedService",
    "otherAssociation"
})
public class PricedFlightOfferAssocType {

    @XmlElement(name = "AssociatedPassenger")
    protected PassengerInfoAssocType associatedPassenger;
    @XmlElement(name = "ApplicableFlight")
    protected ApplicableFlight applicableFlight;
    @XmlElement(name = "PriceClass")
    protected PricedFlightOfferAssocType.PriceClass priceClass;
    @XmlElement(name = "OfferDetailAssociation")
    protected OfferDetailInfoAssocType offerDetailAssociation;
    @XmlElement(name = "IncludedService")
    protected ServiceInfoAssocType includedService;
    @XmlElement(name = "AssociatedService")
    protected ServiceInfoAssocType associatedService;
    @XmlElement(name = "OtherAssociation")
    protected OtherOfferAssocType otherAssociation;

    /**
     * Gets the value of the associatedPassenger property.
     * 
     * @return
     *     possible object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public PassengerInfoAssocType getAssociatedPassenger() {
        return associatedPassenger;
    }

    /**
     * Sets the value of the associatedPassenger property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassengerInfoAssocType }
     *     
     */
    public void setAssociatedPassenger(PassengerInfoAssocType value) {
        this.associatedPassenger = value;
    }

    /**
     * Gets the value of the applicableFlight property.
     * 
     * @return
     *     possible object is
     *     {@link ApplicableFlight }
     *     
     */
    public ApplicableFlight getApplicableFlight() {
        return applicableFlight;
    }

    /**
     * Sets the value of the applicableFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link ApplicableFlight }
     *     
     */
    public void setApplicableFlight(ApplicableFlight value) {
        this.applicableFlight = value;
    }

    /**
     * Gets the value of the priceClass property.
     * 
     * @return
     *     possible object is
     *     {@link PricedFlightOfferAssocType.PriceClass }
     *     
     */
    public PricedFlightOfferAssocType.PriceClass getPriceClass() {
        return priceClass;
    }

    /**
     * Sets the value of the priceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedFlightOfferAssocType.PriceClass }
     *     
     */
    public void setPriceClass(PricedFlightOfferAssocType.PriceClass value) {
        this.priceClass = value;
    }

    /**
     * Gets the value of the offerDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public OfferDetailInfoAssocType getOfferDetailAssociation() {
        return offerDetailAssociation;
    }

    /**
     * Sets the value of the offerDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferDetailInfoAssocType }
     *     
     */
    public void setOfferDetailAssociation(OfferDetailInfoAssocType value) {
        this.offerDetailAssociation = value;
    }

    /**
     * Included Optional Service(s).
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getIncludedService() {
        return includedService;
    }

    /**
     * Sets the value of the includedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setIncludedService(ServiceInfoAssocType value) {
        this.includedService = value;
    }

    /**
     * Gets the value of the associatedService property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public ServiceInfoAssocType getAssociatedService() {
        return associatedService;
    }

    /**
     * Sets the value of the associatedService property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceInfoAssocType }
     *     
     */
    public void setAssociatedService(ServiceInfoAssocType value) {
        this.associatedService = value;
    }

    /**
     * Gets the value of the otherAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public OtherOfferAssocType getOtherAssociation() {
        return otherAssociation;
    }

    /**
     * Sets the value of the otherAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOfferAssocType }
     *     
     */
    public void setOtherAssociation(OtherOfferAssocType value) {
        this.otherAssociation = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PriceClassReference"/&gt;
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

}
