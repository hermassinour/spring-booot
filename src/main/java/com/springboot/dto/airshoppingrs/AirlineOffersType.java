
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grouping of Offers returned by a single ORA.
 * 
 * <p>Java class for AirlineOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineOffersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ALaCarteOfferType" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}OfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriceCalendar" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceCalendarType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierOffersSummary" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
 *                   &lt;element name="LowestOfferPriceAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
 *                   &lt;element name="MatchedOfferQty" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}QtyType" minOccurs="0"/&gt;
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
@XmlType(name = "AirlineOffersType", propOrder = {
    "aLaCarteOffer",
    "offer",
    "priceCalendar",
    "carrierOffersSummary"
})
public class AirlineOffersType {

    @XmlElement(name = "ALaCarteOffer")
    protected ALaCarteOfferType aLaCarteOffer;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;
    @XmlElement(name = "PriceCalendar")
    protected List<PriceCalendarType> priceCalendar;
    @XmlElement(name = "CarrierOffersSummary")
    protected AirlineOffersType.CarrierOffersSummary carrierOffersSummary;

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public ALaCarteOfferType getALaCarteOffer() {
        return aLaCarteOffer;
    }

    /**
     * Sets the value of the aLaCarteOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public void setALaCarteOffer(ALaCarteOfferType value) {
        this.aLaCarteOffer = value;
    }

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
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return this.offer;
    }

    /**
     * Gets the value of the priceCalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceCalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceCalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceCalendarType }
     * 
     * 
     */
    public List<PriceCalendarType> getPriceCalendar() {
        if (priceCalendar == null) {
            priceCalendar = new ArrayList<PriceCalendarType>();
        }
        return this.priceCalendar;
    }

    /**
     * Gets the value of the carrierOffersSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineOffersType.CarrierOffersSummary }
     *     
     */
    public AirlineOffersType.CarrierOffersSummary getCarrierOffersSummary() {
        return carrierOffersSummary;
    }

    /**
     * Sets the value of the carrierOffersSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineOffersType.CarrierOffersSummary }
     *     
     */
    public void setCarrierOffersSummary(AirlineOffersType.CarrierOffersSummary value) {
        this.carrierOffersSummary = value;
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
     *         &lt;element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
     *         &lt;element name="LowestOfferPriceAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
     *         &lt;element name="MatchedOfferQty" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}QtyType" minOccurs="0"/&gt;
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
        "highestOfferPrice",
        "lowestOfferPriceAmount",
        "matchedOfferQty"
    })
    public static class CarrierOffersSummary {

        @XmlElement(name = "HighestOfferPrice")
        protected PriceSummaryType highestOfferPrice;
        @XmlElement(name = "LowestOfferPriceAmount")
        protected PriceSummaryType lowestOfferPriceAmount;
        @XmlElement(name = "MatchedOfferQty")
        protected BigDecimal matchedOfferQty;

        /**
         * Gets the value of the highestOfferPrice property.
         * 
         * @return
         *     possible object is
         *     {@link PriceSummaryType }
         *     
         */
        public PriceSummaryType getHighestOfferPrice() {
            return highestOfferPrice;
        }

        /**
         * Sets the value of the highestOfferPrice property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceSummaryType }
         *     
         */
        public void setHighestOfferPrice(PriceSummaryType value) {
            this.highestOfferPrice = value;
        }

        /**
         * Gets the value of the lowestOfferPriceAmount property.
         * 
         * @return
         *     possible object is
         *     {@link PriceSummaryType }
         *     
         */
        public PriceSummaryType getLowestOfferPriceAmount() {
            return lowestOfferPriceAmount;
        }

        /**
         * Sets the value of the lowestOfferPriceAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceSummaryType }
         *     
         */
        public void setLowestOfferPriceAmount(PriceSummaryType value) {
            this.lowestOfferPriceAmount = value;
        }

        /**
         * Gets the value of the matchedOfferQty property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMatchedOfferQty() {
            return matchedOfferQty;
        }

        /**
         * Sets the value of the matchedOfferQty property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMatchedOfferQty(BigDecimal value) {
            this.matchedOfferQty = value;
        }

    }

}
