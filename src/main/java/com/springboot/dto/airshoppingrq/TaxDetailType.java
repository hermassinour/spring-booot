
package com.springboot.dto.airshoppingrq;

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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * TAX DETAIL representation.
 * 
 * <p>Java class for TaxDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Total" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ&gt;CurrencyAmountOptType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Breakdown" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Tax" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType"/&gt;
 *                             &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                             &lt;element name="CollectionPoint" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrCode" minOccurs="0"/&gt;
 *                                       &lt;element name="AirportAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AirportCode"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                             &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShortDescSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="Conversion" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmount" maxOccurs="2" minOccurs="2"/&gt;
 *                                       &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FiledAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                             &lt;element name="FileTaxType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddlTaxType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AddlFiledTaxType" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
 *                           &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                           &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxDetailType", propOrder = {
    "total",
    "breakdown"
})
@XmlSeeAlso({
    com.springboot.dto.airshoppingrq.DetailCurrencyPriceType.Taxes.class,
    com.springboot.dto.airshoppingrq.CarrierFeeInfoType.CarrierFees.Fee.Taxes.class,
    com.springboot.dto.airshoppingrq.CarrierFeeInfoType.Taxes.class,
    com.springboot.dto.airshoppingrq.TaxCouponInfoType.TicketDocument.CouponNumber.Tax.class
})
public class TaxDetailType
    extends TaxCoreType
{

    @XmlElement(name = "Total")
    protected TaxDetailType.Total total;
    @XmlElement(name = "Breakdown")
    protected TaxDetailType.Breakdown breakdown;

    /**
     * Gets the value of the total property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType.Total }
     *     
     */
    public TaxDetailType.Total getTotal() {
        return total;
    }

    /**
     * Sets the value of the total property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType.Total }
     *     
     */
    public void setTotal(TaxDetailType.Total value) {
        this.total = value;
    }

    /**
     * Gets the value of the breakdown property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDetailType.Breakdown }
     *     
     */
    public TaxDetailType.Breakdown getBreakdown() {
        return breakdown;
    }

    /**
     * Sets the value of the breakdown property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDetailType.Breakdown }
     *     
     */
    public void setBreakdown(TaxDetailType.Breakdown value) {
        this.breakdown = value;
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
     *         &lt;element name="Tax" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType"/&gt;
     *                   &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *                   &lt;element name="CollectionPoint" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrCode" minOccurs="0"/&gt;
     *                             &lt;element name="AirportAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AirportCode"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
     *                   &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShortDescSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="Conversion" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmount" maxOccurs="2" minOccurs="2"/&gt;
     *                             &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FiledAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
     *                   &lt;element name="FileTaxType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddlTaxType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AddlFiledTaxType" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
     *                 &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *                 &lt;attribute name="RefundInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tax"
    })
    public static class Breakdown {

        @XmlElement(name = "Tax", required = true)
        protected List<TaxDetailType.Breakdown.Tax> tax;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxDetailType.Breakdown.Tax }
         * 
         * 
         */
        public List<TaxDetailType.Breakdown.Tax> getTax() {
            if (tax == null) {
                tax = new ArrayList<TaxDetailType.Breakdown.Tax>();
            }
            return this.tax;
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
         *         &lt;element name="Qualifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType"/&gt;
         *         &lt;element name="Nation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
         *         &lt;element name="CollectionPoint" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrCode" minOccurs="0"/&gt;
         *                   &lt;element name="AirportAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AirportCode"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LocalAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
         *         &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShortDescSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="Conversion" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmount" maxOccurs="2" minOccurs="2"/&gt;
         *                   &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FiledAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmountOptType" minOccurs="0"/&gt;
         *         &lt;element name="FileTaxType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddlTaxType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AddlFiledTaxType" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AlphaNumericStringLength1to3"&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
         *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *       &lt;attribute name="CollectionInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
            "qualifier",
            "amount",
            "nation",
            "taxCode",
            "taxType",
            "collectionPoint",
            "localAmount",
            "description",
            "conversion",
            "filedAmount",
            "fileTaxType",
            "addlTaxType",
            "addlFiledTaxType"
        })
        public static class Tax {

            @XmlElement(name = "Qualifier")
            protected String qualifier;
            @XmlElement(name = "Amount", required = true)
            protected CurrencyAmountOptType amount;
            @XmlElement(name = "Nation")
            protected String nation;
            @XmlElement(name = "TaxCode")
            protected String taxCode;
            @XmlElement(name = "TaxType")
            protected String taxType;
            @XmlElement(name = "CollectionPoint")
            protected List<TaxDetailType.Breakdown.Tax.CollectionPoint> collectionPoint;
            @XmlElement(name = "LocalAmount")
            protected CurrencyAmountOptType localAmount;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Conversion")
            protected TaxDetailType.Breakdown.Tax.Conversion conversion;
            @XmlElement(name = "FiledAmount")
            protected CurrencyAmountOptType filedAmount;
            @XmlElement(name = "FileTaxType")
            protected String fileTaxType;
            @XmlElement(name = "AddlTaxType")
            protected String addlTaxType;
            @XmlElement(name = "AddlFiledTaxType")
            protected String addlFiledTaxType;
            @XmlAttribute(name = "ApproxInd")
            protected Boolean approxInd;
            @XmlAttribute(name = "CollectionInd")
            protected Boolean collectionInd;
            @XmlAttribute(name = "RefundInd")
            protected Boolean refundInd;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the qualifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQualifier() {
                return qualifier;
            }

            /**
             * Sets the value of the qualifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQualifier(String value) {
                this.qualifier = value;
            }

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
             * Gets the value of the nation property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNation() {
                return nation;
            }

            /**
             * Sets the value of the nation property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNation(String value) {
                this.nation = value;
            }

            /**
             * Gets the value of the taxCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxCode() {
                return taxCode;
            }

            /**
             * Sets the value of the taxCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxCode(String value) {
                this.taxCode = value;
            }

            /**
             * Gets the value of the taxType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTaxType() {
                return taxType;
            }

            /**
             * Sets the value of the taxType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTaxType(String value) {
                this.taxType = value;
            }

            /**
             * Gets the value of the collectionPoint property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the collectionPoint property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCollectionPoint().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TaxDetailType.Breakdown.Tax.CollectionPoint }
             * 
             * 
             */
            public List<TaxDetailType.Breakdown.Tax.CollectionPoint> getCollectionPoint() {
                if (collectionPoint == null) {
                    collectionPoint = new ArrayList<TaxDetailType.Breakdown.Tax.CollectionPoint>();
                }
                return this.collectionPoint;
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
             * Gets the value of the conversion property.
             * 
             * @return
             *     possible object is
             *     {@link TaxDetailType.Breakdown.Tax.Conversion }
             *     
             */
            public TaxDetailType.Breakdown.Tax.Conversion getConversion() {
                return conversion;
            }

            /**
             * Sets the value of the conversion property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxDetailType.Breakdown.Tax.Conversion }
             *     
             */
            public void setConversion(TaxDetailType.Breakdown.Tax.Conversion value) {
                this.conversion = value;
            }

            /**
             * Gets the value of the filedAmount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getFiledAmount() {
                return filedAmount;
            }

            /**
             * Sets the value of the filedAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setFiledAmount(CurrencyAmountOptType value) {
                this.filedAmount = value;
            }

            /**
             * Gets the value of the fileTaxType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFileTaxType() {
                return fileTaxType;
            }

            /**
             * Sets the value of the fileTaxType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFileTaxType(String value) {
                this.fileTaxType = value;
            }

            /**
             * Gets the value of the addlTaxType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddlTaxType() {
                return addlTaxType;
            }

            /**
             * Sets the value of the addlTaxType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddlTaxType(String value) {
                this.addlTaxType = value;
            }

            /**
             * Gets the value of the addlFiledTaxType property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAddlFiledTaxType() {
                return addlFiledTaxType;
            }

            /**
             * Sets the value of the addlFiledTaxType property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAddlFiledTaxType(String value) {
                this.addlFiledTaxType = value;
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
             * Gets the value of the collectionInd property.
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCollectionInd() {
                return collectionInd;
            }

            /**
             * Sets the value of the collectionInd property.
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCollectionInd(Boolean value) {
                this.collectionInd = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrCode" minOccurs="0"/&gt;
             *         &lt;element name="AirportAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AirportCode"/&gt;
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
                "currCode",
                "airportAmount",
                "airportCode"
            })
            public static class CollectionPoint {

                @XmlElement(name = "CurrCode")
                protected CurrCode currCode;
                @XmlElement(name = "AirportAmount", required = true)
                protected Object airportAmount;
                @XmlElement(name = "AirportCode", required = true)
                protected AirportCode airportCode;

                /**
                 * Gets the value of the currCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CurrCode }
                 *     
                 */
                public CurrCode getCurrCode() {
                    return currCode;
                }

                /**
                 * Sets the value of the currCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CurrCode }
                 *     
                 */
                public void setCurrCode(CurrCode value) {
                    this.currCode = value;
                }

                /**
                 * Gets the value of the airportAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getAirportAmount() {
                    return airportAmount;
                }

                /**
                 * Sets the value of the airportAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setAirportAmount(Object value) {
                    this.airportAmount = value;
                }

                /**
                 * Gets the value of the airportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AirportCode }
                 *     
                 */
                public AirportCode getAirportCode() {
                    return airportCode;
                }

                /**
                 * Sets the value of the airportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AirportCode }
                 *     
                 */
                public void setAirportCode(AirportCode value) {
                    this.airportCode = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurrencyAmount" maxOccurs="2" minOccurs="2"/&gt;
             *         &lt;element name="ConversionRate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
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
                "currencyAmount",
                "conversionRate"
            })
            public static class Conversion {

                @XmlElement(name = "CurrencyAmount", required = true)
                protected List<CurrencyAmountOptType> currencyAmount;
                @XmlElement(name = "ConversionRate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar conversionRate;

                /**
                 * Gets the value of the currencyAmount property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the currencyAmount property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCurrencyAmount().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CurrencyAmountOptType }
                 * 
                 * 
                 */
                public List<CurrencyAmountOptType> getCurrencyAmount() {
                    if (currencyAmount == null) {
                        currencyAmount = new ArrayList<CurrencyAmountOptType>();
                    }
                    return this.currencyAmount;
                }

                /**
                 * Gets the value of the conversionRate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getConversionRate() {
                    return conversionRate;
                }

                /**
                 * Sets the value of the conversionRate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setConversionRate(XMLGregorianCalendar value) {
                    this.conversionRate = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ&gt;CurrencyAmountOptType"&gt;
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


    }

}
