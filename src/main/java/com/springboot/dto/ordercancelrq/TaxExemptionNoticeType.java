
package com.springboot.dto.ordercancelrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Pricing-related Fee and Tax Exemption Notice definition.
 * 
 * <p>Java class for TaxExemptionNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}TrxProcessObjectBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Named" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Countries" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CountryCode" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Entities" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Entity" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
 *                                             &lt;pattern value="[A-Z]{2}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Territories" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Territory" maxOccurs="unbounded"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
 *                                             &lt;pattern value="[A-Z]{2}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="TaxCodes" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="Designator"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;pattern value="[A-Z]{1,2}"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Nature" minOccurs="0"&gt;
 *                                                   &lt;simpleType&gt;
 *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                                       &lt;pattern value="[A-Z]{1,2}"/&gt;
 *                                                     &lt;/restriction&gt;
 *                                                   &lt;/simpleType&gt;
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
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Rules" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}RuleSetType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Results"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TaxExemption" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="RuleID" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
 *                                     &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                                     &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}Associations" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ExemptionAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "TaxExemptionNoticeType", propOrder = {
    "query",
    "results"
})
public class TaxExemptionNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Query")
    protected TaxExemptionNoticeType.Query query;
    @XmlElement(name = "Results")
    protected TaxExemptionNoticeType.Results results;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionNoticeType.Query }
     *     
     */
    public TaxExemptionNoticeType.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionNoticeType.Query }
     *     
     */
    public void setQuery(TaxExemptionNoticeType.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionNoticeType.Results }
     *     
     */
    public TaxExemptionNoticeType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionNoticeType.Results }
     *     
     */
    public void setResults(TaxExemptionNoticeType.Results value) {
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
     *         &lt;element name="Named" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Countries" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CountryCode" maxOccurs="unbounded"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Entities" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Entity" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
     *                                   &lt;pattern value="[A-Z]{2}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Territories" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Territory" maxOccurs="unbounded"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
     *                                   &lt;pattern value="[A-Z]{2}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="TaxCodes" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="Designator"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;pattern value="[A-Z]{1,2}"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Nature" minOccurs="0"&gt;
     *                                         &lt;simpleType&gt;
     *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                             &lt;pattern value="[A-Z]{1,2}"/&gt;
     *                                           &lt;/restriction&gt;
     *                                         &lt;/simpleType&gt;
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
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Rules" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}RuleSetType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "named",
        "rules"
    })
    public static class Query {

        @XmlElement(name = "Named")
        protected TaxExemptionNoticeType.Query.Named named;
        @XmlElement(name = "Rules")
        protected RuleSetType rules;
        @XmlAttribute(name = "ExemptAllInd")
        protected Boolean exemptAllInd;

        /**
         * Gets the value of the named property.
         * 
         * @return
         *     possible object is
         *     {@link TaxExemptionNoticeType.Query.Named }
         *     
         */
        public TaxExemptionNoticeType.Query.Named getNamed() {
            return named;
        }

        /**
         * Sets the value of the named property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxExemptionNoticeType.Query.Named }
         *     
         */
        public void setNamed(TaxExemptionNoticeType.Query.Named value) {
            this.named = value;
        }

        /**
         * Gets the value of the rules property.
         * 
         * @return
         *     possible object is
         *     {@link RuleSetType }
         *     
         */
        public RuleSetType getRules() {
            return rules;
        }

        /**
         * Sets the value of the rules property.
         * 
         * @param value
         *     allowed object is
         *     {@link RuleSetType }
         *     
         */
        public void setRules(RuleSetType value) {
            this.rules = value;
        }

        /**
         * Gets the value of the exemptAllInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExemptAllInd() {
            return exemptAllInd;
        }

        /**
         * Sets the value of the exemptAllInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExemptAllInd(Boolean value) {
            this.exemptAllInd = value;
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
         *         &lt;element name="Countries" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CountryCode" maxOccurs="unbounded"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Entities" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Entity" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
         *                         &lt;pattern value="[A-Z]{2}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Territories" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Territory" maxOccurs="unbounded"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
         *                         &lt;pattern value="[A-Z]{2}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="TaxCodes" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="Designator"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;pattern value="[A-Z]{1,2}"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Nature" minOccurs="0"&gt;
         *                               &lt;simpleType&gt;
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                                   &lt;pattern value="[A-Z]{1,2}"/&gt;
         *                                 &lt;/restriction&gt;
         *                               &lt;/simpleType&gt;
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
        @XmlType(name = "", propOrder = {
            "countries",
            "entities",
            "territories",
            "taxCodes"
        })
        public static class Named {

            @XmlElement(name = "Countries")
            protected TaxExemptionNoticeType.Query.Named.Countries countries;
            @XmlElement(name = "Entities")
            protected TaxExemptionNoticeType.Query.Named.Entities entities;
            @XmlElement(name = "Territories")
            protected TaxExemptionNoticeType.Query.Named.Territories territories;
            @XmlElement(name = "TaxCodes")
            protected TaxExemptionNoticeType.Query.Named.TaxCodes taxCodes;

            /**
             * Gets the value of the countries property.
             * 
             * @return
             *     possible object is
             *     {@link TaxExemptionNoticeType.Query.Named.Countries }
             *     
             */
            public TaxExemptionNoticeType.Query.Named.Countries getCountries() {
                return countries;
            }

            /**
             * Sets the value of the countries property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxExemptionNoticeType.Query.Named.Countries }
             *     
             */
            public void setCountries(TaxExemptionNoticeType.Query.Named.Countries value) {
                this.countries = value;
            }

            /**
             * Gets the value of the entities property.
             * 
             * @return
             *     possible object is
             *     {@link TaxExemptionNoticeType.Query.Named.Entities }
             *     
             */
            public TaxExemptionNoticeType.Query.Named.Entities getEntities() {
                return entities;
            }

            /**
             * Sets the value of the entities property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxExemptionNoticeType.Query.Named.Entities }
             *     
             */
            public void setEntities(TaxExemptionNoticeType.Query.Named.Entities value) {
                this.entities = value;
            }

            /**
             * Gets the value of the territories property.
             * 
             * @return
             *     possible object is
             *     {@link TaxExemptionNoticeType.Query.Named.Territories }
             *     
             */
            public TaxExemptionNoticeType.Query.Named.Territories getTerritories() {
                return territories;
            }

            /**
             * Sets the value of the territories property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxExemptionNoticeType.Query.Named.Territories }
             *     
             */
            public void setTerritories(TaxExemptionNoticeType.Query.Named.Territories value) {
                this.territories = value;
            }

            /**
             * Gets the value of the taxCodes property.
             * 
             * @return
             *     possible object is
             *     {@link TaxExemptionNoticeType.Query.Named.TaxCodes }
             *     
             */
            public TaxExemptionNoticeType.Query.Named.TaxCodes getTaxCodes() {
                return taxCodes;
            }

            /**
             * Sets the value of the taxCodes property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxExemptionNoticeType.Query.Named.TaxCodes }
             *     
             */
            public void setTaxCodes(TaxExemptionNoticeType.Query.Named.TaxCodes value) {
                this.taxCodes = value;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CountryCode" maxOccurs="unbounded"/&gt;
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
                "countryCode"
            })
            public static class Countries {

                @XmlElement(name = "CountryCode", required = true)
                protected List<CountryCode> countryCode;

                /**
                 * Gets the value of the countryCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the countryCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCountryCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CountryCode }
                 * 
                 * 
                 */
                public List<CountryCode> getCountryCode() {
                    if (countryCode == null) {
                        countryCode = new ArrayList<CountryCode>();
                    }
                    return this.countryCode;
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
             *         &lt;element name="Entity" maxOccurs="unbounded"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
             *               &lt;pattern value="[A-Z]{2}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
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
                "entity"
            })
            public static class Entities {

                @XmlElement(name = "Entity", required = true)
                protected List<String> entity;

                /**
                 * Gets the value of the entity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the entity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEntity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getEntity() {
                    if (entity == null) {
                        entity = new ArrayList<String>();
                    }
                    return this.entity;
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
             *         &lt;element name="TaxCode" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Designator"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;pattern value="[A-Z]{1,2}"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Nature" minOccurs="0"&gt;
             *                     &lt;simpleType&gt;
             *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *                         &lt;pattern value="[A-Z]{1,2}"/&gt;
             *                       &lt;/restriction&gt;
             *                     &lt;/simpleType&gt;
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
                "taxCode"
            })
            public static class TaxCodes {

                @XmlElement(name = "TaxCode", required = true)
                protected List<TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode> taxCode;

                /**
                 * Gets the value of the taxCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the taxCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTaxCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode }
                 * 
                 * 
                 */
                public List<TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode> getTaxCode() {
                    if (taxCode == null) {
                        taxCode = new ArrayList<TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode>();
                    }
                    return this.taxCode;
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
                 *         &lt;element name="Designator"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;pattern value="[A-Z]{1,2}"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Nature" minOccurs="0"&gt;
                 *           &lt;simpleType&gt;
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
                 *               &lt;pattern value="[A-Z]{1,2}"/&gt;
                 *             &lt;/restriction&gt;
                 *           &lt;/simpleType&gt;
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
                    "designator",
                    "nature"
                })
                public static class TaxCode {

                    @XmlElement(name = "Designator", required = true)
                    protected String designator;
                    @XmlElement(name = "Nature")
                    protected String nature;

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
             *         &lt;element name="Territory" maxOccurs="unbounded"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ProperNameSimpleType"&gt;
             *               &lt;pattern value="[A-Z]{2}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
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
                "territory"
            })
            public static class Territories {

                @XmlElement(name = "Territory", required = true)
                protected List<String> territory;

                /**
                 * Gets the value of the territory property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the territory property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTerritory().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTerritory() {
                    if (territory == null) {
                        territory = new ArrayList<String>();
                    }
                    return this.territory;
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
     *         &lt;element name="TaxExemption" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="RuleID" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
     *                           &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *                           &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}Associations" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ExemptionAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxExemption"
    })
    public static class Results {

        @XmlElement(name = "TaxExemption")
        protected List<TaxExemptionNoticeType.Results.TaxExemption> taxExemption;
        @XmlAttribute(name = "ExemptionAppliedInd")
        protected Boolean exemptionAppliedInd;

        /**
         * Gets the value of the taxExemption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxExemption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxExemption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxExemptionNoticeType.Results.TaxExemption }
         * 
         * 
         */
        public List<TaxExemptionNoticeType.Results.TaxExemption> getTaxExemption() {
            if (taxExemption == null) {
                taxExemption = new ArrayList<TaxExemptionNoticeType.Results.TaxExemption>();
            }
            return this.taxExemption;
        }

        /**
         * Gets the value of the exemptionAppliedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExemptionAppliedInd() {
            return exemptionAppliedInd;
        }

        /**
         * Sets the value of the exemptionAppliedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExemptionAppliedInd(Boolean value) {
            this.exemptionAppliedInd = value;
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
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
         *                 &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}Associations" minOccurs="0"/&gt;
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
            "associations"
        })
        public static class TaxExemption {

            @XmlElement(name = "RuleID")
            protected TaxExemptionNoticeType.Results.TaxExemption.RuleID ruleID;
            @XmlElement(name = "Associations")
            protected OrderItemAssociationType associations;

            /**
             * Gets the value of the ruleID property.
             * 
             * @return
             *     possible object is
             *     {@link TaxExemptionNoticeType.Results.TaxExemption.RuleID }
             *     
             */
            public TaxExemptionNoticeType.Results.TaxExemption.RuleID getRuleID() {
                return ruleID;
            }

            /**
             * Sets the value of the ruleID property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxExemptionNoticeType.Results.TaxExemption.RuleID }
             *     
             */
            public void setRuleID(TaxExemptionNoticeType.Results.TaxExemption.RuleID value) {
                this.ruleID = value;
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
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
             *       &lt;attribute name="Context" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
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
