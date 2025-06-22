
package com.springboot.dto.ordercancelrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for a Fee/ Surcharge.
 * 
 * <p>Java class for FeeSurchargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeSurchargeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;CurrencyAmountOptType"&gt;
 *                 &lt;attribute name="refundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Breakdown" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fee" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType"/&gt;
 *                             &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                             &lt;element name="Designator" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ShortDescSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="Nature" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                           &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeSurchargeType", propOrder = {
    "total",
    "breakdown"
})
@XmlSeeAlso({
    com.springboot.dto.ordercancelrq.DetailCurrencyPriceType.Fees.class,
    com.springboot.dto.ordercancelrq.SettlementType.Fees.class,
    com.springboot.dto.ordercancelrq.GenericPriceType.Fees.class,
    com.springboot.dto.ordercancelrq.OfferPriceLeadDetailType.PriceDetail.Fees.class,
    com.springboot.dto.ordercancelrq.V172OrderItemType.OrderItem.PriceDetail.Fees.class,
    com.springboot.dto.ordercancelrq.NameChangeV172OfferItemType.TotalPriceDetail.Fees.class,
    com.springboot.dto.ordercancelrq.ALaCarteV172OfferItemType.UnitPriceDetail.Fees.class,
    com.springboot.dto.ordercancelrq.V172OfferItemType.TotalPriceDetail.Fees.class
})
public class FeeSurchargeType {

    @XmlElement(name = "Total", required = true)
    protected FeeSurchargeType.Total total;
    @XmlElement(name = "Breakdown")
    protected FeeSurchargeType.Breakdown breakdown;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link FeeSurchargeType.Total }
     *     
     */
    public FeeSurchargeType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeSurchargeType.Total }
     *     
     */
    public void setTotal(FeeSurchargeType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the breakdown property.
     * 
     * @return
     *     possible object is
     *     {@link FeeSurchargeType.Breakdown }
     *     
     */
    public FeeSurchargeType.Breakdown getBreakdown() {
        return breakdown;
    }

    /**
     * Sets the value of the breakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeeSurchargeType.Breakdown }
     *     
     */
    public void setBreakdown(FeeSurchargeType.Breakdown value) {
        this.breakdown = value;
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
     *         &lt;element name="Fee" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType"/&gt;
     *                   &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
     *                   &lt;element name="Designator" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ShortDescSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="Nature" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *                 &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "fee"
    })
    public static class Breakdown {

        @XmlElement(name = "Fee", required = true)
        protected List<FeeSurchargeType.Breakdown.Fee> fee;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FeeSurchargeType.Breakdown.Fee }
         * 
         * 
         */
        public List<FeeSurchargeType.Breakdown.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<FeeSurchargeType.Breakdown.Fee>();
            }
            return this.fee;
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
         *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType"/&gt;
         *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
         *         &lt;element name="Designator" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ShortDescSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="Nature" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
         *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amount",
            "localAmount",
            "designator",
            "description",
            "nature"
        })
        public static class Fee {

            @XmlElement(name = "Amount", required = true)
            protected CurrencyAmountOptType amount;
            @XmlElement(name = "LocalAmount")
            protected CurrencyAmountOptType localAmount;
            @XmlElement(name = "Designator")
            protected String designator;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Nature")
            protected String nature;
            @XmlAttribute(name = "ApproxInd")
            protected Boolean approxInd;
            @XmlAttribute(name = "RefundInd")
            protected Boolean refundInd;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setAmount(CurrencyAmountOptType value) {
                this.amount = value;
            }

            /**
             * Gets the value of the localAmount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getLocalAmount() {
                return localAmount;
            }

            /**
             * Sets the value of the localAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setLocalAmount(CurrencyAmountOptType value) {
                this.localAmount = value;
            }

            /**
             * Gets the value of the designator property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDesignator() {
                return designator;
            }

            /**
             * Sets the value of the designator property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDesignator(String value) {
                this.designator = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * Gets the value of the nature property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNature() {
                return nature;
            }

            /**
             * Sets the value of the nature property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNature(String value) {
                this.nature = value;
            }

            /**
             * Gets the value of the approxInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isApproxInd() {
                return approxInd;
            }

            /**
             * Sets the value of the approxInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setApproxInd(Boolean value) {
                this.approxInd = value;
            }

            /**
             * Gets the value of the refundInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isRefundInd() {
                return refundInd;
            }

            /**
             * Sets the value of the refundInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRefundInd(Boolean value) {
                this.refundInd = value;
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

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;CurrencyAmountOptType"&gt;
     *       &lt;attribute name="refundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Total
        extends CurrencyAmountOptType
    {

        @XmlAttribute(name = "refundInd")
        protected Boolean refundInd;

        /**
         * Gets the value of the refundInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRefundInd() {
            return refundInd;
        }

        /**
         * Sets the value of the refundInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRefundInd(Boolean value) {
            this.refundInd = value;
        }

    }

}
