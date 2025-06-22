
package com.springboot.dto.seatavailabilityrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * NDC Capability Model: PENALTY
 * 
 *  ============
 * Representation(s)
 *  ============
 * • Core Penalty
 * • Detail Penalty
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Penalty Indicators (Cancellation fees apply; Change of Itinerary fees apply; Refundable ticket and/ or fare; Reusable ticket and/ or fare; Upgrade fee applies)
 * • Applicable Fee Remarks
 * • Penalty Type (Cancellation, No Show, Upgrade, etc.)
 * • Penalty Application (IATA Padis Codeset FAT - Fare or Application Penalty Type)
 * • Penalty Amount, represented as percentage or fixed value, with Amount Application (MinimumPenaltyAmount, MaximumPenaltyAmount, Other) and Applicable Fee Remarks
 * 
 *  ============
 * Metadata
 *  ============
 * • PenaltyMetadata
 * 
 * <p>Java class for V172_PenaltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_PenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Details" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Detail" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltySimpleType"/&gt;
 *                             &lt;element name="Application" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
 *                             &lt;element name="Amounts" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Amount" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;choice&gt;
 *                                                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountValue"/&gt;
 *                                                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PercentageValue"/&gt;
 *                                                 &lt;/choice&gt;
 *                                                 &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltyAppSimpleType" minOccurs="0"/&gt;
 *                                                 &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
 *                                                       &lt;/extension&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ObjAssociationAttrGroup"/&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="CancelFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ChangeFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefundableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ReuseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="UpgradeFeeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ObjectKey" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_PenaltyType", propOrder = {
    "applicableFeeRemarks",
    "details"
})
@XmlSeeAlso({
    PenaltyDetailType.class,
    OfferV172PenaltyType.class,
    OrderV172PenaltyType.class
})
public class V172PenaltyType {

    @XmlElement(name = "ApplicableFeeRemarks")
    protected V172PenaltyType.ApplicableFeeRemarks applicableFeeRemarks;
    @XmlElement(name = "Details")
    protected V172PenaltyType.Details details;
    @XmlAttribute(name = "CancelFeeInd")
    protected Boolean cancelFeeInd;
    @XmlAttribute(name = "ChangeFeeInd")
    protected Boolean changeFeeInd;
    @XmlAttribute(name = "RefundableInd")
    protected Boolean refundableInd;
    @XmlAttribute(name = "ReuseInd")
    protected Boolean reuseInd;
    @XmlAttribute(name = "UpgradeFeeInd")
    protected Boolean upgradeFeeInd;
    @XmlAttribute(name = "ObjectKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectKey;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the applicableFeeRemarks property.
     * 
     * @return
     *     possible object is
     *     {@link V172PenaltyType.ApplicableFeeRemarks }
     *     
     */
    public V172PenaltyType.ApplicableFeeRemarks getApplicableFeeRemarks() {
        return applicableFeeRemarks;
    }

    /**
     * Sets the value of the applicableFeeRemarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172PenaltyType.ApplicableFeeRemarks }
     *     
     */
    public void setApplicableFeeRemarks(V172PenaltyType.ApplicableFeeRemarks value) {
        this.applicableFeeRemarks = value;
    }

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link V172PenaltyType.Details }
     *     
     */
    public V172PenaltyType.Details getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172PenaltyType.Details }
     *     
     */
    public void setDetails(V172PenaltyType.Details value) {
        this.details = value;
    }

    /**
     * Gets the value of the cancelFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelFeeInd() {
        return cancelFeeInd;
    }

    /**
     * Sets the value of the cancelFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelFeeInd(Boolean value) {
        this.cancelFeeInd = value;
    }

    /**
     * Gets the value of the changeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Sets the value of the changeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeFeeInd(Boolean value) {
        this.changeFeeInd = value;
    }

    /**
     * Gets the value of the refundableInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundableInd() {
        return refundableInd;
    }

    /**
     * Sets the value of the refundableInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundableInd(Boolean value) {
        this.refundableInd = value;
    }

    /**
     * Gets the value of the reuseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReuseInd() {
        return reuseInd;
    }

    /**
     * Sets the value of the reuseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReuseInd(Boolean value) {
        this.reuseInd = value;
    }

    /**
     * Gets the value of the upgradeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeFeeInd() {
        return upgradeFeeInd;
    }

    /**
     * Sets the value of the upgradeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeFeeInd(Boolean value) {
        this.upgradeFeeInd = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ApplicableFeeRemarks
        extends V172RemarkType
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
     *         &lt;element name="Detail" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltySimpleType"/&gt;
     *                   &lt;element name="Application" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
     *                   &lt;element name="Amounts" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Amount" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;choice&gt;
     *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountValue"/&gt;
     *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PercentageValue"/&gt;
     *                                       &lt;/choice&gt;
     *                                       &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltyAppSimpleType" minOccurs="0"/&gt;
     *                                       &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
     *                                             &lt;/extension&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                     &lt;/sequence&gt;
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
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ObjAssociationAttrGroup"/&gt;
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
        "detail"
    })
    public static class Details {

        @XmlElement(name = "Detail", required = true)
        protected List<V172PenaltyType.Details.Detail> detail;

        /**
         * Gets the value of the detail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link V172PenaltyType.Details.Detail }
         * 
         * 
         */
        public List<V172PenaltyType.Details.Detail> getDetail() {
            if (detail == null) {
                detail = new ArrayList<V172PenaltyType.Details.Detail>();
            }
            return this.detail;
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
         *         &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltySimpleType"/&gt;
         *         &lt;element name="Application" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
         *         &lt;element name="Amounts" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Amount" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;choice&gt;
         *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountValue"/&gt;
         *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PercentageValue"/&gt;
         *                             &lt;/choice&gt;
         *                             &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltyAppSimpleType" minOccurs="0"/&gt;
         *                             &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
         *                                   &lt;/extension&gt;
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
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ObjAssociationAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "type",
            "application",
            "amounts"
        })
        public static class Detail {

            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "Application")
            protected String application;
            @XmlElement(name = "Amounts")
            protected V172PenaltyType.Details.Detail.Amounts amounts;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

            /**
             * Gets the value of the amounts property.
             * 
             * @return
             *     possible object is
             *     {@link V172PenaltyType.Details.Detail.Amounts }
             *     
             */
            public V172PenaltyType.Details.Detail.Amounts getAmounts() {
                return amounts;
            }

            /**
             * Sets the value of the amounts property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172PenaltyType.Details.Detail.Amounts }
             *     
             */
            public void setAmounts(V172PenaltyType.Details.Detail.Amounts value) {
                this.amounts = value;
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
             *         &lt;element name="Amount" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;choice&gt;
             *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountValue"/&gt;
             *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PercentageValue"/&gt;
             *                   &lt;/choice&gt;
             *                   &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltyAppSimpleType" minOccurs="0"/&gt;
             *                   &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
             *                         &lt;/extension&gt;
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
                "amount"
            })
            public static class Amounts {

                @XmlElement(name = "Amount", required = true)
                protected List<V172PenaltyType.Details.Detail.Amounts.Amount> amount;

                /**
                 * Gets the value of the amount property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the amount property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAmount().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link V172PenaltyType.Details.Detail.Amounts.Amount }
                 * 
                 * 
                 */
                public List<V172PenaltyType.Details.Detail.Amounts.Amount> getAmount() {
                    if (amount == null) {
                        amount = new ArrayList<V172PenaltyType.Details.Detail.Amounts.Amount>();
                    }
                    return this.amount;
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
                 *         &lt;choice&gt;
                 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountValue"/&gt;
                 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PercentageValue"/&gt;
                 *         &lt;/choice&gt;
                 *         &lt;element name="AmountApplication" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltyAppSimpleType" minOccurs="0"/&gt;
                 *         &lt;element name="ApplicableFeeRemarks" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
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
                    "currencyAmountValue",
                    "percentageValue",
                    "amountApplication",
                    "applicableFeeRemarks"
                })
                public static class Amount {

                    @XmlElement(name = "CurrencyAmountValue")
                    protected CurrencyAmountOptType currencyAmountValue;
                    @XmlElement(name = "PercentageValue")
                    protected BigDecimal percentageValue;
                    @XmlElement(name = "AmountApplication")
                    protected String amountApplication;
                    @XmlElement(name = "ApplicableFeeRemarks")
                    protected V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks applicableFeeRemarks;

                    /**
                     * Penalty monetary value amount and currency code.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public CurrencyAmountOptType getCurrencyAmountValue() {
                        return currencyAmountValue;
                    }

                    /**
                     * Sets the value of the currencyAmountValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CurrencyAmountOptType }
                     *     
                     */
                    public void setCurrencyAmountValue(CurrencyAmountOptType value) {
                        this.currencyAmountValue = value;
                    }

                    /**
                     * Gets the value of the percentageValue property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getPercentageValue() {
                        return percentageValue;
                    }

                    /**
                     * Sets the value of the percentageValue property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setPercentageValue(BigDecimal value) {
                        this.percentageValue = value;
                    }

                    /**
                     * Gets the value of the amountApplication property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getAmountApplication() {
                        return amountApplication;
                    }

                    /**
                     * Sets the value of the amountApplication property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setAmountApplication(String value) {
                        this.amountApplication = value;
                    }

                    /**
                     * Gets the value of the applicableFeeRemarks property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks }
                     *     
                     */
                    public V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks getApplicableFeeRemarks() {
                        return applicableFeeRemarks;
                    }

                    /**
                     * Sets the value of the applicableFeeRemarks property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks }
                     *     
                     */
                    public void setApplicableFeeRemarks(V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks value) {
                        this.applicableFeeRemarks = value;
                    }


                    /**
                     * <p>Java class for anonymous complex type.
                     * 
                     * <p>The following schema fragment specifies the expected content contained within this class.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_RemarkType"&gt;
                     *     &lt;/extension&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class ApplicableFeeRemarks
                        extends V172RemarkType
                    {


                    }

                }

            }

        }

    }

}
