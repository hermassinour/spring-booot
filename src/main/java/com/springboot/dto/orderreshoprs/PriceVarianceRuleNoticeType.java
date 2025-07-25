
package com.springboot.dto.orderreshoprs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Acceptable Price Variance Rule definition. Note: This is the acceptable amount and/or percentage of the total amount by which the Order item price can vary from the Offer price for Order creation to proceed, for example to cover minor currency exchange rate fluctuations for taxes quoted in a different currency.
 * 
 * <p>Java class for PriceVarianceRuleNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceVarianceRuleNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TrxProcessObjectBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PriceVarianceRule" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                             &lt;element name="RuleID"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AcceptableVariance"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Name" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" minOccurs="0"/&gt;
 *                             &lt;element name="RuleValid" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DatePeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimePeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DayPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}MonthPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}QuarterPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TimePeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearMonthPeriod"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearPeriod"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Currencies" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="InputCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                       &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Associations" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Remarks" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="VarianceRuleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Results"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RuleID" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Amount"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Associations" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="VarianceAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceVarianceRuleNoticeType", propOrder = {
    "query",
    "results"
})
@XmlSeeAlso({
    PriceVarianceNotice.class
})
public class PriceVarianceRuleNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Query")
    protected PriceVarianceRuleNoticeType.Query query;
    @XmlElement(name = "Results")
    protected PriceVarianceRuleNoticeType.Results results;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleNoticeType.Query }
     *     
     */
    public PriceVarianceRuleNoticeType.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleNoticeType.Query }
     *     
     */
    public void setQuery(PriceVarianceRuleNoticeType.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleNoticeType.Results }
     *     
     */
    public PriceVarianceRuleNoticeType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleNoticeType.Results }
     *     
     */
    public void setResults(PriceVarianceRuleNoticeType.Results value) {
        this.results = value;
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
     *         &lt;element name="PriceVarianceRule" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *                   &lt;element name="RuleID"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AcceptableVariance"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Name" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" minOccurs="0"/&gt;
     *                   &lt;element name="RuleValid" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DatePeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimePeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DayPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}MonthPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}QuarterPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TimePeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearMonthPeriod"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearPeriod"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Currencies" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="InputCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                             &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Associations" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Remarks" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="VarianceRuleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceVarianceRule"
    })
    public static class Query {

        @XmlElement(name = "PriceVarianceRule", required = true)
        protected List<PriceVarianceRuleNoticeType.Query.PriceVarianceRule> priceVarianceRule;
        @XmlAttribute(name = "VarianceRuleInd")
        protected Boolean varianceRuleInd;

        /**
         * Gets the value of the priceVarianceRule property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceVarianceRule property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceVarianceRule().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule }
         * 
         * 
         */
        public List<PriceVarianceRuleNoticeType.Query.PriceVarianceRule> getPriceVarianceRule() {
            if (priceVarianceRule == null) {
                priceVarianceRule = new ArrayList<PriceVarianceRuleNoticeType.Query.PriceVarianceRule>();
            }
            return this.priceVarianceRule;
        }

        /**
         * Gets the value of the varianceRuleInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVarianceRuleInd() {
            return varianceRuleInd;
        }

        /**
         * Sets the value of the varianceRuleInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVarianceRuleInd(Boolean value) {
            this.varianceRuleInd = value;
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
         *         &lt;element name="SequenceNbr" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
         *         &lt;element name="RuleID"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AcceptableVariance"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Name" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="RuleValid" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DatePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DayPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}MonthPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}QuarterPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TimePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearMonthPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearPeriod"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Currencies" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="InputCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                   &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Associations" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Remarks" minOccurs="0"/&gt;
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
            "sequenceNbr",
            "ruleID",
            "acceptableVariance",
            "name",
            "owner",
            "ruleValid",
            "currencies",
            "associations",
            "remarks"
        })
        public static class PriceVarianceRule {

            @XmlElement(name = "SequenceNbr")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger sequenceNbr;
            @XmlElement(name = "RuleID", required = true)
            protected PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID ruleID;
            @XmlElement(name = "AcceptableVariance", required = true)
            protected PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance acceptableVariance;
            @XmlElement(name = "Name")
            protected PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name name;
            @XmlElement(name = "Owner")
            protected String owner;
            @XmlElement(name = "RuleValid")
            protected PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid ruleValid;
            @XmlElement(name = "Currencies")
            protected PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies currencies;
            @XmlElement(name = "Associations")
            protected OrderItemAssociationType associations;
            @XmlElement(name = "Remarks")
            protected V172RemarkType remarks;

            /**
             * Gets the value of the sequenceNbr property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSequenceNbr() {
                return sequenceNbr;
            }

            /**
             * Sets the value of the sequenceNbr property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSequenceNbr(BigInteger value) {
                this.sequenceNbr = value;
            }

            /**
             * Gets the value of the ruleID property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID }
             *     
             */
            public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID getRuleID() {
                return ruleID;
            }

            /**
             * Sets the value of the ruleID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID }
             *     
             */
            public void setRuleID(PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID value) {
                this.ruleID = value;
            }

            /**
             * Gets the value of the acceptableVariance property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance }
             *     
             */
            public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance getAcceptableVariance() {
                return acceptableVariance;
            }

            /**
             * Sets the value of the acceptableVariance property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance }
             *     
             */
            public void setAcceptableVariance(PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance value) {
                this.acceptableVariance = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name }
             *     
             */
            public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name }
             *     
             */
            public void setName(PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name value) {
                this.name = value;
            }

            /**
             * Gets the value of the owner property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwner() {
                return owner;
            }

            /**
             * Sets the value of the owner property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwner(String value) {
                this.owner = value;
            }

            /**
             * Gets the value of the ruleValid property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid }
             *     
             */
            public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid getRuleValid() {
                return ruleValid;
            }

            /**
             * Sets the value of the ruleValid property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid }
             *     
             */
            public void setRuleValid(PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid value) {
                this.ruleValid = value;
            }

            /**
             * Gets the value of the currencies property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies }
             *     
             */
            public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies getCurrencies() {
                return currencies;
            }

            /**
             * Sets the value of the currencies property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies }
             *     
             */
            public void setCurrencies(PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies value) {
                this.currencies = value;
            }

            /**
             * Gets the value of the associations property.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
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
                "percentageValue"
            })
            public static class AcceptableVariance {

                @XmlElement(name = "CurrencyAmountValue", required = true)
                protected CurrencyAmountOptType currencyAmountValue;
                @XmlElement(name = "PercentageValue", required = true)
                protected BigDecimal percentageValue;

                /**
                 * Gets the value of the currencyAmountValue property.
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
             *         &lt;element name="InputCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
             *         &lt;element name="SettlementCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
                "inputCode",
                "settlementCode"
            })
            public static class Currencies {

                @XmlElement(name = "InputCode")
                protected List<CurrencyCodeType> inputCode;
                @XmlElement(name = "SettlementCode")
                protected List<CurrencyCodeType> settlementCode;

                /**
                 * Gets the value of the inputCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the inputCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInputCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CurrencyCodeType }
                 * 
                 * 
                 */
                public List<CurrencyCodeType> getInputCode() {
                    if (inputCode == null) {
                        inputCode = new ArrayList<CurrencyCodeType>();
                    }
                    return this.inputCode;
                }

                /**
                 * Gets the value of the settlementCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the settlementCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSettlementCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CurrencyCodeType }
                 * 
                 * 
                 */
                public List<CurrencyCodeType> getSettlementCode() {
                    if (settlementCode == null) {
                        settlementCode = new ArrayList<CurrencyCodeType>();
                    }
                    return this.settlementCode;
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
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Name {

                @XmlValue
                protected String value;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
             *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class RuleID {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Context")
                protected String context;
                @XmlAttribute(name = "Name")
                @XmlSchemaType(name = "anySimpleType")
                protected String name;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the context property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContext() {
                    return context;
                }

                /**
                 * Sets the value of the context property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContext(String value) {
                    this.context = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DatePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DayPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}MonthPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}QuarterPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TimePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearMonthPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}YearPeriod"/&gt;
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
                "datePeriod",
                "dateTimePeriod",
                "dayPeriod",
                "monthPeriod",
                "quarterPeriod",
                "timePeriod",
                "yearMonthPeriod",
                "yearPeriod"
            })
            public static class RuleValid {

                @XmlElement(name = "DatePeriod", required = true)
                protected DatePeriodRepType datePeriod;
                @XmlElement(name = "DateTimePeriod", required = true)
                protected DateTimePeriodRepType dateTimePeriod;
                @XmlElement(name = "DayPeriod", required = true)
                protected DayPeriodRepType dayPeriod;
                @XmlElement(name = "MonthPeriod", required = true)
                protected MonthPeriodRepType monthPeriod;
                @XmlElement(name = "QuarterPeriod", required = true)
                protected QuarterPeriodRepType quarterPeriod;
                @XmlElement(name = "TimePeriod", required = true)
                protected TimePeriodRepType timePeriod;
                @XmlElement(name = "YearMonthPeriod", required = true)
                protected YearMonthPeriodRepType yearMonthPeriod;
                @XmlElement(name = "YearPeriod", required = true)
                protected YearPeriodRepType yearPeriod;

                /**
                 * Gets the value of the datePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public DatePeriodRepType getDatePeriod() {
                    return datePeriod;
                }

                /**
                 * Sets the value of the datePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public void setDatePeriod(DatePeriodRepType value) {
                    this.datePeriod = value;
                }

                /**
                 * Gets the value of the dateTimePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public DateTimePeriodRepType getDateTimePeriod() {
                    return dateTimePeriod;
                }

                /**
                 * Sets the value of the dateTimePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public void setDateTimePeriod(DateTimePeriodRepType value) {
                    this.dateTimePeriod = value;
                }

                /**
                 * Gets the value of the dayPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public DayPeriodRepType getDayPeriod() {
                    return dayPeriod;
                }

                /**
                 * Sets the value of the dayPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public void setDayPeriod(DayPeriodRepType value) {
                    this.dayPeriod = value;
                }

                /**
                 * Gets the value of the monthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public MonthPeriodRepType getMonthPeriod() {
                    return monthPeriod;
                }

                /**
                 * Sets the value of the monthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public void setMonthPeriod(MonthPeriodRepType value) {
                    this.monthPeriod = value;
                }

                /**
                 * Gets the value of the quarterPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public QuarterPeriodRepType getQuarterPeriod() {
                    return quarterPeriod;
                }

                /**
                 * Sets the value of the quarterPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public void setQuarterPeriod(QuarterPeriodRepType value) {
                    this.quarterPeriod = value;
                }

                /**
                 * Gets the value of the timePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public TimePeriodRepType getTimePeriod() {
                    return timePeriod;
                }

                /**
                 * Sets the value of the timePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public void setTimePeriod(TimePeriodRepType value) {
                    this.timePeriod = value;
                }

                /**
                 * Gets the value of the yearMonthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public YearMonthPeriodRepType getYearMonthPeriod() {
                    return yearMonthPeriod;
                }

                /**
                 * Sets the value of the yearMonthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public void setYearMonthPeriod(YearMonthPeriodRepType value) {
                    this.yearMonthPeriod = value;
                }

                /**
                 * Gets the value of the yearPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public YearPeriodRepType getYearPeriod() {
                    return yearPeriod;
                }

                /**
                 * Sets the value of the yearPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public void setYearPeriod(YearPeriodRepType value) {
                    this.yearPeriod = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PriceVariance" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RuleID" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Amount"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Associations" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="VarianceAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceVariance"
    })
    public static class Results {

        @XmlElement(name = "PriceVariance")
        protected List<PriceVarianceRuleNoticeType.Results.PriceVariance> priceVariance;
        @XmlAttribute(name = "VarianceAppliedInd")
        protected Boolean varianceAppliedInd;

        /**
         * Gets the value of the priceVariance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceVariance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceVariance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceVarianceRuleNoticeType.Results.PriceVariance }
         * 
         * 
         */
        public List<PriceVarianceRuleNoticeType.Results.PriceVariance> getPriceVariance() {
            if (priceVariance == null) {
                priceVariance = new ArrayList<PriceVarianceRuleNoticeType.Results.PriceVariance>();
            }
            return this.priceVariance;
        }

        /**
         * Gets the value of the varianceAppliedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVarianceAppliedInd() {
            return varianceAppliedInd;
        }

        /**
         * Sets the value of the varianceAppliedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVarianceAppliedInd(Boolean value) {
            this.varianceAppliedInd = value;
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
         *         &lt;element name="RuleID" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Amount"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Associations" minOccurs="0"/&gt;
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
            "ruleID",
            "amount",
            "associations"
        })
        public static class PriceVariance {

            @XmlElement(name = "RuleID")
            protected PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID ruleID;
            @XmlElement(name = "Amount", required = true)
            protected PriceVarianceRuleNoticeType.Results.PriceVariance.Amount amount;
            @XmlElement(name = "Associations")
            protected OrderItemAssociationType associations;

            /**
             * Gets the value of the ruleID property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID }
             *     
             */
            public PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID getRuleID() {
                return ruleID;
            }

            /**
             * Sets the value of the ruleID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID }
             *     
             */
            public void setRuleID(PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID value) {
                this.ruleID = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link PriceVarianceRuleNoticeType.Results.PriceVariance.Amount }
             *     
             */
            public PriceVarianceRuleNoticeType.Results.PriceVariance.Amount getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link PriceVarianceRuleNoticeType.Results.PriceVariance.Amount }
             *     
             */
            public void setAmount(PriceVarianceRuleNoticeType.Results.PriceVariance.Amount value) {
                this.amount = value;
            }

            /**
             * Order ID, Order Item and other associations where a price variance was applied.
             * 
             * @return
             *     possible object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public OrderItemAssociationType getAssociations() {
                return associations;
            }

            /**
             * Sets the value of the associations property.
             * 
             * @param value
             *     allowed object is
             *     {@link OrderItemAssociationType }
             *     
             */
            public void setAssociations(OrderItemAssociationType value) {
                this.associations = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountValue"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentageValue"/&gt;
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
                "percentageValue"
            })
            public static class Amount {

                @XmlElement(name = "CurrencyAmountValue", required = true)
                protected CurrencyAmountOptType currencyAmountValue;
                @XmlElement(name = "PercentageValue", required = true)
                protected BigDecimal percentageValue;

                /**
                 * Gets the value of the currencyAmountValue property.
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

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS&gt;ProperNameSimpleType"&gt;
             *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
             *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class RuleID {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "Context")
                protected String context;
                @XmlAttribute(name = "Name")
                @XmlSchemaType(name = "anySimpleType")
                protected String name;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the context property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getContext() {
                    return context;
                }

                /**
                 * Sets the value of the context property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setContext(String value) {
                    this.context = value;
                }

                /**
                 * Gets the value of the name property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getName() {
                    return name;
                }

                /**
                 * Sets the value of the name property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }

    }

}
