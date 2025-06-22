
package com.springboot.dto.seatavailabilityrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * COMBINATION PRICE BASIS UNIT: Partial currency and award.
 * 
 * <p>Java class for CombinationPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CombinationPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Partial"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Currency"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}EncodedCurrencyAmount"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}SimpleCurrencyPrice"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Redemption" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}AwardRedemptionType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ObjAssociationAttrGroup"/&gt;
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
@XmlType(name = "CombinationPriceType", propOrder = {
    "partial"
})
public class CombinationPriceType {

    @XmlElement(name = "Partial", required = true)
    protected CombinationPriceType.Partial partial;

    /**
     * Gets the value of the partial property.
     * 
     * @return
     *     possible object is
     *     {@link CombinationPriceType.Partial }
     *     
     */
    public CombinationPriceType.Partial getPartial() {
        return partial;
    }

    /**
     * Sets the value of the partial property.
     * 
     * @param value
     *     allowed object is
     *     {@link CombinationPriceType.Partial }
     *     
     */
    public void setPartial(CombinationPriceType.Partial value) {
        this.partial = value;
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
     *         &lt;element name="Currency"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}EncodedCurrencyAmount"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}SimpleCurrencyPrice"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Redemption" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}AwardRedemptionType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currency",
        "redemption"
    })
    public static class Partial {

        @XmlElement(name = "Currency", required = true)
        protected CombinationPriceType.Partial.Currency currency;
        @XmlElement(name = "Redemption", required = true)
        protected AwardRedemptionType redemption;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link CombinationPriceType.Partial.Currency }
         *     
         */
        public CombinationPriceType.Partial.Currency getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link CombinationPriceType.Partial.Currency }
         *     
         */
        public void setCurrency(CombinationPriceType.Partial.Currency value) {
            this.currency = value;
        }

        /**
         * Gets the value of the redemption property.
         * 
         * @return
         *     possible object is
         *     {@link AwardRedemptionType }
         *     
         */
        public AwardRedemptionType getRedemption() {
            return redemption;
        }

        /**
         * Sets the value of the redemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link AwardRedemptionType }
         *     
         */
        public void setRedemption(AwardRedemptionType value) {
            this.redemption = value;
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
         *       &lt;choice&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}EncodedCurrencyAmount"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}SimpleCurrencyPrice"/&gt;
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
            "encodedCurrencyAmount",
            "simpleCurrencyPrice"
        })
        public static class Currency {

            @XmlElement(name = "EncodedCurrencyAmount")
            protected CurrencyAmountEncodedType encodedCurrencyAmount;
            @XmlElement(name = "SimpleCurrencyPrice")
            protected SimpleCurrencyPriceType simpleCurrencyPrice;

            /**
             * Monetary value amount and currency code.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountEncodedType }
             *     
             */
            public CurrencyAmountEncodedType getEncodedCurrencyAmount() {
                return encodedCurrencyAmount;
            }

            /**
             * Sets the value of the encodedCurrencyAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountEncodedType }
             *     
             */
            public void setEncodedCurrencyAmount(CurrencyAmountEncodedType value) {
                this.encodedCurrencyAmount = value;
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
