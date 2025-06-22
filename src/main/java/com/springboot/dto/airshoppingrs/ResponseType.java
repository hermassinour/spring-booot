
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirShoppingProcessing" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}OrdViewProcessType" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="OffersGroup"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CarrierOffers" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AirlineOffersType" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="AllOffersSummary" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
 *                             &lt;element name="LowestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
 *                             &lt;element name="MatchedOfferQty" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}QtyType" minOccurs="0"/&gt;
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
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AirShopResMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="Payments" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PaymentsType" minOccurs="0"/&gt;
 *         &lt;element name="Policy" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PolicyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Promotions" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PromotionsType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ShoppingResponseType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}WarningType" maxOccurs="99" minOccurs="0"/&gt;
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
    "airShoppingProcessing",
    "commission",
    "dataLists",
    "offersGroup",
    "metadata",
    "payments",
    "policy",
    "promotions",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "AirShoppingProcessing")
    protected OrdViewProcessType airShoppingProcessing;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "OffersGroup", required = true)
    protected ResponseType.OffersGroup offersGroup;
    @XmlElement(name = "Metadata")
    protected AirShopResMetadataType metadata;
    @XmlElement(name = "Payments")
    protected PaymentsType payments;
    @XmlElement(name = "Policy")
    protected List<PolicyType> policy;
    @XmlElement(name = "Promotions")
    protected PromotionsType promotions;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the airShoppingProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link OrdViewProcessType }
     *     
     */
    public OrdViewProcessType getAirShoppingProcessing() {
        return airShoppingProcessing;
    }

    /**
     * Sets the value of the airShoppingProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdViewProcessType }
     *     
     */
    public void setAirShoppingProcessing(OrdViewProcessType value) {
        this.airShoppingProcessing = value;
    }

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
     * Gets the value of the offersGroup property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType.OffersGroup }
     *     
     */
    public ResponseType.OffersGroup getOffersGroup() {
        return offersGroup;
    }

    /**
     * Sets the value of the offersGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType.OffersGroup }
     *     
     */
    public void setOffersGroup(ResponseType.OffersGroup value) {
        this.offersGroup = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link AirShopResMetadataType }
     *     
     */
    public AirShopResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirShopResMetadataType }
     *     
     */
    public void setMetadata(AirShopResMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentsType }
     *     
     */
    public PaymentsType getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentsType }
     *     
     */
    public void setPayments(PaymentsType value) {
        this.payments = value;
    }

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PolicyType }
     * 
     * 
     */
    public List<PolicyType> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<PolicyType>();
        }
        return this.policy;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionsType }
     *     
     */
    public PromotionsType getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsType }
     *     
     */
    public void setPromotions(PromotionsType value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the shoppingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
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
     *         &lt;element name="CarrierOffers" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AirlineOffersType" maxOccurs="unbounded"/&gt;
     *         &lt;element name="AllOffersSummary" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="HighestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
     *                   &lt;element name="LowestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "carrierOffers",
        "allOffersSummary"
    })
    public static class OffersGroup {

        @XmlElement(name = "CarrierOffers", required = true)
        protected List<AirlineOffersType> carrierOffers;
        @XmlElement(name = "AllOffersSummary")
        protected ResponseType.OffersGroup.AllOffersSummary allOffersSummary;

        /**
         * Gets the value of the carrierOffers property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the carrierOffers property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCarrierOffers().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlineOffersType }
         * 
         * 
         */
        public List<AirlineOffersType> getCarrierOffers() {
            if (carrierOffers == null) {
                carrierOffers = new ArrayList<AirlineOffersType>();
            }
            return this.carrierOffers;
        }

        /**
         * Gets the value of the allOffersSummary property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType.OffersGroup.AllOffersSummary }
         *     
         */
        public ResponseType.OffersGroup.AllOffersSummary getAllOffersSummary() {
            return allOffersSummary;
        }

        /**
         * Sets the value of the allOffersSummary property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType.OffersGroup.AllOffersSummary }
         *     
         */
        public void setAllOffersSummary(ResponseType.OffersGroup.AllOffersSummary value) {
            this.allOffersSummary = value;
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
         *         &lt;element name="LowestOfferPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PriceSummaryType" minOccurs="0"/&gt;
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
            "lowestOfferPrice",
            "matchedOfferQty"
        })
        public static class AllOffersSummary {

            @XmlElement(name = "HighestOfferPrice")
            protected PriceSummaryType highestOfferPrice;
            @XmlElement(name = "LowestOfferPrice")
            protected PriceSummaryType lowestOfferPrice;
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
             * Gets the value of the lowestOfferPrice property.
             * 
             * @return
             *     possible object is
             *     {@link PriceSummaryType }
             *     
             */
            public PriceSummaryType getLowestOfferPrice() {
                return lowestOfferPrice;
            }

            /**
             * Sets the value of the lowestOfferPrice property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceSummaryType }
             *     
             */
            public void setLowestOfferPrice(PriceSummaryType value) {
                this.lowestOfferPrice = value;
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

}
