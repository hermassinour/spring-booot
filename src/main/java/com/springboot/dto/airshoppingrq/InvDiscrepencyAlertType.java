
package com.springboot.dto.airshoppingrq;

import java.math.BigInteger;
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
 * Inventory Discrepency Alert definition.
 * 
 * Note: This processing condition occurs when there is a discrepency between offered inventory and available inventory. It may include references to Alternate Offers.
 * 
 * <p>Java class for InvDiscrepencyAlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvDiscrepencyAlertType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MultiAssociationType" minOccurs="0"/&gt;
 *         &lt;element name="AlternateOffers" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AirlineID_Type"/&gt;
 *                   &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}V172_OfferType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltBaggageOffer"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltOtherOffer"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltPricedFlightOffer"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltSeatOffer"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}Remarks" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="NoInventoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvDiscrepencyAlertType", propOrder = {
    "code",
    "associations",
    "alternateOffers",
    "remarks"
})
public class InvDiscrepencyAlertType {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "Associations")
    protected MultiAssociationType associations;
    @XmlElement(name = "AlternateOffers")
    protected InvDiscrepencyAlertType.AlternateOffers alternateOffers;
    @XmlElement(name = "Remarks")
    protected V172RemarkType remarks;
    @XmlAttribute(name = "NoInventoryInd")
    protected Boolean noInventoryInd;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the associations property.
     * 
     * @return
     *     possible object is
     *     {@link MultiAssociationType }
     *     
     */
    public MultiAssociationType getAssociations() {
        return associations;
    }

    /**
     * Sets the value of the associations property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiAssociationType }
     *     
     */
    public void setAssociations(MultiAssociationType value) {
        this.associations = value;
    }

    /**
     * Gets the value of the alternateOffers property.
     * 
     * @return
     *     possible object is
     *     {@link InvDiscrepencyAlertType.AlternateOffers }
     *     
     */
    public InvDiscrepencyAlertType.AlternateOffers getAlternateOffers() {
        return alternateOffers;
    }

    /**
     * Sets the value of the alternateOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvDiscrepencyAlertType.AlternateOffers }
     *     
     */
    public void setAlternateOffers(InvDiscrepencyAlertType.AlternateOffers value) {
        this.alternateOffers = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link V172RemarkType }
     *     
     */
    public V172RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172RemarkType }
     *     
     */
    public void setRemarks(V172RemarkType value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the noInventoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoInventoryInd() {
        return noInventoryInd;
    }

    /**
     * Sets the value of the noInventoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoInventoryInd(Boolean value) {
        this.noInventoryInd = value;
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
     *         &lt;element name="TotalOfferQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AirlineID_Type"/&gt;
     *         &lt;element name="AlternateOffer" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}V172_OfferType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltBaggageOffer"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltOtherOffer"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltPricedFlightOffer"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltSeatOffer"/&gt;
     *                 &lt;/sequence&gt;
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
        "totalOfferQuantity",
        "owner",
        "alternateOffer"
    })
    public static class AlternateOffers {

        @XmlElement(name = "TotalOfferQuantity")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger totalOfferQuantity;
        @XmlElement(name = "Owner", required = true)
        protected AirlineIDType owner;
        @XmlElement(name = "AlternateOffer", required = true)
        protected List<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer> alternateOffer;

        /**
         * Gets the value of the totalOfferQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTotalOfferQuantity() {
            return totalOfferQuantity;
        }

        /**
         * Sets the value of the totalOfferQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTotalOfferQuantity(BigInteger value) {
            this.totalOfferQuantity = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineIDType }
         *     
         */
        public AirlineIDType getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineIDType }
         *     
         */
        public void setOwner(AirlineIDType value) {
            this.owner = value;
        }

        /**
         * Gets the value of the alternateOffer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternateOffer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternateOffer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvDiscrepencyAlertType.AlternateOffers.AlternateOffer }
         * 
         * 
         */
        public List<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer> getAlternateOffer() {
            if (alternateOffer == null) {
                alternateOffer = new ArrayList<InvDiscrepencyAlertType.AlternateOffers.AlternateOffer>();
            }
            return this.alternateOffer;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}V172_OfferType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltBaggageOffer"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltOtherOffer"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltPricedFlightOffer"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AltSeatOffer"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "altBaggageOffer",
            "altOtherOffer",
            "altPricedFlightOffer",
            "altSeatOffer"
        })
        public static class AlternateOffer
            extends V172OfferType
        {

            @XmlElement(name = "AltBaggageOffer", required = true)
            protected AltBaggageV172OfferType altBaggageOffer;
            @XmlElement(name = "AltOtherOffer", required = true)
            protected AltOtherV172OfferType altOtherOffer;
            @XmlElement(name = "AltPricedFlightOffer", required = true)
            protected AltPricedFlightV172OfferType altPricedFlightOffer;
            @XmlElement(name = "AltSeatOffer", required = true)
            protected AltSeatV172OfferType altSeatOffer;

            /**
             * Gets the value of the altBaggageOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltBaggageV172OfferType }
             *     
             */
            public AltBaggageV172OfferType getAltBaggageOffer() {
                return altBaggageOffer;
            }

            /**
             * Sets the value of the altBaggageOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltBaggageV172OfferType }
             *     
             */
            public void setAltBaggageOffer(AltBaggageV172OfferType value) {
                this.altBaggageOffer = value;
            }

            /**
             * Gets the value of the altOtherOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltOtherV172OfferType }
             *     
             */
            public AltOtherV172OfferType getAltOtherOffer() {
                return altOtherOffer;
            }

            /**
             * Sets the value of the altOtherOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltOtherV172OfferType }
             *     
             */
            public void setAltOtherOffer(AltOtherV172OfferType value) {
                this.altOtherOffer = value;
            }

            /**
             * Gets the value of the altPricedFlightOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltPricedFlightV172OfferType }
             *     
             */
            public AltPricedFlightV172OfferType getAltPricedFlightOffer() {
                return altPricedFlightOffer;
            }

            /**
             * Sets the value of the altPricedFlightOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltPricedFlightV172OfferType }
             *     
             */
            public void setAltPricedFlightOffer(AltPricedFlightV172OfferType value) {
                this.altPricedFlightOffer = value;
            }

            /**
             * Gets the value of the altSeatOffer property.
             * 
             * @return
             *     possible object is
             *     {@link AltSeatV172OfferType }
             *     
             */
            public AltSeatV172OfferType getAltSeatOffer() {
                return altSeatOffer;
            }

            /**
             * Sets the value of the altSeatOffer property.
             * 
             * @param value
             *     allowed object is
             *     {@link AltSeatV172OfferType }
             *     
             */
            public void setAltSeatOffer(AltSeatV172OfferType value) {
                this.altSeatOffer = value;
            }

        }

    }

}
