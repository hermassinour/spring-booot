
package com.springboot.dto.orderretrieverq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A BAGGAGE OFFER with additional Significant Carrier, Baggage Characteristics (e.g. dimensions/ weight) and Disclosures.
 * 
 * <p>Java class for BaggageItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}GenericPriceType" minOccurs="0"/&gt;
 *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirlineDesigSimpleType" minOccurs="0"/&gt;
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
 *                             &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirlineDesigSimpleType"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CheckedBags" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CarryOnBags" minOccurs="0"/&gt;
 *                             &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagV172_DisclosureType" minOccurs="0"/&gt;
 *                             &lt;element name="Price" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AwardPricing"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CombinationPricing"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}SimpleCurrencyPrice"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DetailCurrencyPrice"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}EncodedCurrencyPrice"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagDetailAssociation" minOccurs="0"/&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageItemType", propOrder = {
    "price",
    "validatingCarrier",
    "bagDetails"
})
public class BaggageItemType {

    @XmlElement(name = "Price")
    protected GenericPriceType price;
    @XmlElement(name = "ValidatingCarrier")
    protected String validatingCarrier;
    @XmlElement(name = "BagDetails")
    protected BaggageItemType.BagDetails bagDetails;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPriceType }
     *     
     */
    public GenericPriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPriceType }
     *     
     */
    public void setPrice(GenericPriceType value) {
        this.price = value;
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
     *     {@link BaggageItemType.BagDetails }
     *     
     */
    public BaggageItemType.BagDetails getBagDetails() {
        return bagDetails;
    }

    /**
     * Sets the value of the bagDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageItemType.BagDetails }
     *     
     */
    public void setBagDetails(BaggageItemType.BagDetails value) {
        this.bagDetails = value;
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
     *         &lt;element name="BagDetail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirlineDesigSimpleType"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CheckedBags" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CarryOnBags" minOccurs="0"/&gt;
     *                   &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagV172_DisclosureType" minOccurs="0"/&gt;
     *                   &lt;element name="Price" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AwardPricing"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CombinationPricing"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}SimpleCurrencyPrice"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DetailCurrencyPrice"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}EncodedCurrencyPrice"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagDetailAssociation" minOccurs="0"/&gt;
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
        protected List<BaggageItemType.BagDetails.BagDetail> bagDetail;

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
         * {@link BaggageItemType.BagDetails.BagDetail }
         * 
         * 
         */
        public List<BaggageItemType.BagDetails.BagDetail> getBagDetail() {
            if (bagDetail == null) {
                bagDetail = new ArrayList<BaggageItemType.BagDetails.BagDetail>();
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
         *         &lt;element name="ValidatingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirlineDesigSimpleType"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CheckedBags" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CarryOnBags" minOccurs="0"/&gt;
         *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagV172_DisclosureType" minOccurs="0"/&gt;
         *         &lt;element name="Price" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AwardPricing"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CombinationPricing"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}SimpleCurrencyPrice"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DetailCurrencyPrice"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}EncodedCurrencyPrice"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagDetailAssociation" minOccurs="0"/&gt;
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
            "checkedBags",
            "carryOnBags",
            "disclosure",
            "price",
            "bagDetailAssociation"
        })
        public static class BagDetail {

            @XmlElement(name = "ValidatingCarrier", required = true)
            protected String validatingCarrier;
            @XmlElement(name = "CheckedBags")
            protected CheckedBags checkedBags;
            @XmlElement(name = "CarryOnBags")
            protected CarryOnBags carryOnBags;
            @XmlElement(name = "Disclosure")
            protected BagV172DisclosureType disclosure;
            @XmlElement(name = "Price")
            protected BaggageItemType.BagDetails.BagDetail.Price price;
            @XmlElement(name = "BagDetailAssociation")
            protected BagDetailAssociation bagDetailAssociation;

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
             *     {@link BaggageItemType.BagDetails.BagDetail.Price }
             *     
             */
            public BaggageItemType.BagDetails.BagDetail.Price getPrice() {
                return price;
            }

            /**
             * Sets the value of the price property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageItemType.BagDetails.BagDetail.Price }
             *     
             */
            public void setPrice(BaggageItemType.BagDetails.BagDetail.Price value) {
                this.price = value;
            }

            /**
             * Gets the value of the bagDetailAssociation property.
             * 
             * @return
             *     possible object is
             *     {@link BagDetailAssociation }
             *     
             */
            public BagDetailAssociation getBagDetailAssociation() {
                return bagDetailAssociation;
            }

            /**
             * Sets the value of the bagDetailAssociation property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagDetailAssociation }
             *     
             */
            public void setBagDetailAssociation(BagDetailAssociation value) {
                this.bagDetailAssociation = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AwardPricing"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CombinationPricing"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}SimpleCurrencyPrice"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DetailCurrencyPrice"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}EncodedCurrencyPrice"/&gt;
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
            public static class Price {

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

    }

}
