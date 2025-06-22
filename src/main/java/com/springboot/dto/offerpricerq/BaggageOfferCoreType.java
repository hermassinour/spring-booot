
package com.springboot.dto.offerpricerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Core Baggage Offer definition.
 * 
 * <p>Java class for BaggageOfferCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageOfferCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TotalPrice"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AwardPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CombinationPricing"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SimpleCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DetailCurrencyPrice"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}EncodedCurrencyPrice"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AirlineDesigSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="BagDetails" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BagDetail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AirlineDesigSimpleType"/&gt;
 *                             &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagOfferAssocType" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CheckedBags" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CarryOnBags" minOccurs="0"/&gt;
 *                             &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagV172_DisclosureType" minOccurs="0"/&gt;
 *                             &lt;element name="Price" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AwardPriceUnitType"/&gt;
 *                                       &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CombinationPriceType"/&gt;
 *                                       &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DetailCurrencyPriceType"/&gt;
 *                                       &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}EncodedPriceType"/&gt;
 *                                       &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SimpleCurrencyPriceType"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageOfferCoreType", propOrder = {
    "totalPrice",
    "validatingCarrier",
    "bagDetails"
})
@XmlSeeAlso({
    AltBaggageV172OfferType.class
})
public class BaggageOfferCoreType {

    @XmlElement(name = "TotalPrice", required = true)
    protected BaggageOfferCoreType.TotalPrice totalPrice;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "BagDetails")
    protected BaggageOfferCoreType.BagDetails bagDetails;

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferCoreType.TotalPrice }
     *     
     */
    public BaggageOfferCoreType.TotalPrice getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferCoreType.TotalPrice }
     *     
     */
    public void setTotalPrice(BaggageOfferCoreType.TotalPrice value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrier(String value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the bagDetails property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageOfferCoreType.BagDetails }
     *     
     */
    public BaggageOfferCoreType.BagDetails getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageOfferCoreType.BagDetails }
     *     
     */
    public void setBagDetails(BaggageOfferCoreType.BagDetails value) {
        this.bagDetails = value;
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
     *         &lt;element name="BagDetail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AirlineDesigSimpleType"/&gt;
     *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagOfferAssocType" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CheckedBags" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CarryOnBags" minOccurs="0"/&gt;
     *                   &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagV172_DisclosureType" minOccurs="0"/&gt;
     *                   &lt;element name="Price" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AwardPriceUnitType"/&gt;
     *                             &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CombinationPriceType"/&gt;
     *                             &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DetailCurrencyPriceType"/&gt;
     *                             &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}EncodedPriceType"/&gt;
     *                             &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SimpleCurrencyPriceType"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
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
        "bagDetail"
    })
    public static class BagDetails {

        @XmlElement(name = "BagDetail", required = true)
        protected List<BaggageOfferCoreType.BagDetails.BagDetail> bagDetail;

        /**
         * Gets the value of the bagDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bagDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBagDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageOfferCoreType.BagDetails.BagDetail }
         * 
         * 
         */
        public List<BaggageOfferCoreType.BagDetails.BagDetail> getBagDetail() {
            if (bagDetail == null) {
                bagDetail = new ArrayList<BaggageOfferCoreType.BagDetails.BagDetail>();
            }
            return this.bagDetail;
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
         *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AirlineDesigSimpleType"/&gt;
         *         &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagOfferAssocType" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CheckedBags" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CarryOnBags" minOccurs="0"/&gt;
         *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagV172_DisclosureType" minOccurs="0"/&gt;
         *         &lt;element name="Price" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AwardPriceUnitType"/&gt;
         *                   &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CombinationPriceType"/&gt;
         *                   &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DetailCurrencyPriceType"/&gt;
         *                   &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}EncodedPriceType"/&gt;
         *                   &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SimpleCurrencyPriceType"/&gt;
         *                 &lt;/choice&gt;
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
            "validatingCarrier",
            "associations",
            "checkedBags",
            "carryOnBags",
            "disclosure",
            "price"
        })
        public static class BagDetail {

            @XmlElement(name = "ValidatingCarrier", required = true)
            protected String validatingCarrier;
            @XmlElement(name = "Associations")
            protected BagOfferAssocType associations;
            @XmlElement(name = "CheckedBags")
            protected CheckedBags checkedBags;
            @XmlElement(name = "CarryOnBags")
            protected CarryOnBags carryOnBags;
            @XmlElement(name = "Disclosure")
            protected BagV172DisclosureType disclosure;
            @XmlElement(name = "Price")
            protected BaggageOfferCoreType.BagDetails.BagDetail.Price price;

            /**
             * Gets the value of the validatingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidatingCarrier() {
                return validatingCarrier;
            }

            /**
             * Sets the value of the validatingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidatingCarrier(String value) {
                this.validatingCarrier = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link BagOfferAssocType }
             *     
             */
            public BagOfferAssocType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagOfferAssocType }
             *     
             */
            public void setAssociations(BagOfferAssocType value) {
                this.associations = value;
            }

            /**
             * Gets the value of the checkedBags property.
             * 
             * @return
             *     possible object is
             *     {@link CheckedBags }
             *     
             */
            public CheckedBags getCheckedBags() {
                return checkedBags;
            }

            /**
             * Sets the value of the checkedBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CheckedBags }
             *     
             */
            public void setCheckedBags(CheckedBags value) {
                this.checkedBags = value;
            }

            /**
             * Gets the value of the carryOnBags property.
             * 
             * @return
             *     possible object is
             *     {@link CarryOnBags }
             *     
             */
            public CarryOnBags getCarryOnBags() {
                return carryOnBags;
            }

            /**
             * Sets the value of the carryOnBags property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarryOnBags }
             *     
             */
            public void setCarryOnBags(CarryOnBags value) {
                this.carryOnBags = value;
            }

            /**
             * Gets the value of the disclosure property.
             * 
             * @return
             *     possible object is
             *     {@link BagV172DisclosureType }
             *     
             */
            public BagV172DisclosureType getDisclosure() {
                return disclosure;
            }

            /**
             * Sets the value of the disclosure property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagV172DisclosureType }
             *     
             */
            public void setDisclosure(BagV172DisclosureType value) {
                this.disclosure = value;
            }

            /**
             * Gets the value of the price property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageOfferCoreType.BagDetails.BagDetail.Price }
             *     
             */
            public BaggageOfferCoreType.BagDetails.BagDetail.Price getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageOfferCoreType.BagDetails.BagDetail.Price }
             *     
             */
            public void setPrice(BaggageOfferCoreType.BagDetails.BagDetail.Price value) {
                this.price = value;
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
             *         &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AwardPriceUnitType"/&gt;
             *         &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CombinationPriceType"/&gt;
             *         &lt;element name="DetailCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DetailCurrencyPriceType"/&gt;
             *         &lt;element name="EncodedCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}EncodedPriceType"/&gt;
             *         &lt;element name="SimpleCurrencyPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SimpleCurrencyPriceType"/&gt;
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
            public static class Price {

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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AwardPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CombinationPricing"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SimpleCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DetailCurrencyPrice"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}EncodedCurrencyPrice"/&gt;
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
        "simpleCurrencyPrice",
        "detailCurrencyPrice",
        "encodedCurrencyPrice"
    })
    public static class TotalPrice {

        @XmlElement(name = "AwardPricing")
        protected AwardPriceUnitType awardPricing;
        @XmlElement(name = "CombinationPricing")
        protected CombinationPriceType combinationPricing;
        @XmlElement(name = "SimpleCurrencyPrice")
        protected SimpleCurrencyPriceType simpleCurrencyPrice;
        @XmlElement(name = "DetailCurrencyPrice")
        protected DetailCurrencyPriceType detailCurrencyPrice;
        @XmlElement(name = "EncodedCurrencyPrice")
        protected EncodedPriceType encodedCurrencyPrice;

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

    }

}
