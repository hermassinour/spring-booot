
package com.springboot.dto.offerpricers;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OFFER TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTimeLimitSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferExpiration" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CoreDateGrpType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjectKeyMetaAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Payment" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CoreDateGrpType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherLimit" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PriceGuaranteeTimeLimit"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}TicketByTimeLimit"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjectKeyMetaAttrGroup"/&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTimeLimitSetType", propOrder = {
    "offerExpiration",
    "payment",
    "otherLimits"
})
public class OfferTimeLimitSetType {

    @XmlElement(name = "OfferExpiration")
    protected OfferTimeLimitSetType.OfferExpiration offerExpiration;
    @XmlElement(name = "Payment")
    protected CoreDateGrpType payment;
    @XmlElement(name = "OtherLimits")
    protected OfferTimeLimitSetType.OtherLimits otherLimits;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the offerExpiration property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public OfferTimeLimitSetType.OfferExpiration getOfferExpiration() {
        return offerExpiration;
    }

    /**
     * Sets the value of the offerExpiration property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OfferExpiration }
     *     
     */
    public void setOfferExpiration(OfferTimeLimitSetType.OfferExpiration value) {
        this.offerExpiration = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link CoreDateGrpType }
     *     
     */
    public CoreDateGrpType getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoreDateGrpType }
     *     
     */
    public void setPayment(CoreDateGrpType value) {
        this.payment = value;
    }

    /**
     * Gets the value of the otherLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimitSetType.OtherLimits }
     *     
     */
    public OfferTimeLimitSetType.OtherLimits getOtherLimits() {
        return otherLimits;
    }

    /**
     * Sets the value of the otherLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimitSetType.OtherLimits }
     *     
     */
    public void setOtherLimits(OfferTimeLimitSetType.OtherLimits value) {
        this.otherLimits = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CoreDateGrpType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjectKeyMetaAttrGroup"/&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OfferExpiration
        extends CoreDateGrpType
    {

        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ObjectKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String objectKey;

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
         * Gets the value of the objectKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectKey() {
            return objectKey;
        }

        /**
         * Sets the value of the objectKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectKey(String value) {
            this.objectKey = value;
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
     *         &lt;element name="OtherLimit" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PriceGuaranteeTimeLimit"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}TicketByTimeLimit"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjectKeyMetaAttrGroup"/&gt;
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
        "otherLimit"
    })
    public static class OtherLimits {

        @XmlElement(name = "OtherLimit", required = true)
        protected List<OfferTimeLimitSetType.OtherLimits.OtherLimit> otherLimit;

        /**
         * Gets the value of the otherLimit property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherLimit property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherLimit().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferTimeLimitSetType.OtherLimits.OtherLimit }
         * 
         * 
         */
        public List<OfferTimeLimitSetType.OtherLimits.OtherLimit> getOtherLimit() {
            if (otherLimit == null) {
                otherLimit = new ArrayList<OfferTimeLimitSetType.OtherLimits.OtherLimit>();
            }
            return this.otherLimit;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PriceGuaranteeTimeLimit"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}TicketByTimeLimit"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjectKeyMetaAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceGuaranteeTimeLimit",
            "ticketByTimeLimit"
        })
        public static class OtherLimit {

            @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
            protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
            @XmlElement(name = "TicketByTimeLimit", required = true)
            protected TicketByTimeLimitType ticketByTimeLimit;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;
            @XmlAttribute(name = "ObjectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String objectKey;

            /**
             * Gets the value of the priceGuaranteeTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link PriceGuaranteeTimeLimit }
             *     
             */
            public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
                return priceGuaranteeTimeLimit;
            }

            /**
             * Sets the value of the priceGuaranteeTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceGuaranteeTimeLimit }
             *     
             */
            public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
                this.priceGuaranteeTimeLimit = value;
            }

            /**
             * Gets the value of the ticketByTimeLimit property.
             * 
             * @return
             *     possible object is
             *     {@link TicketByTimeLimitType }
             *     
             */
            public TicketByTimeLimitType getTicketByTimeLimit() {
                return ticketByTimeLimit;
            }

            /**
             * Sets the value of the ticketByTimeLimit property.
             * 
             * @param value
             *     allowed object is
             *     {@link TicketByTimeLimitType }
             *     
             */
            public void setTicketByTimeLimit(TicketByTimeLimitType value) {
                this.ticketByTimeLimit = value;
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
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
            }

        }

    }

}
