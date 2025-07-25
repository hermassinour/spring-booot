
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Flight Price Request Message Parameters.
 * 
 * Notes: Derived from MessageParamsBaseType.
 * 
 * <p>Java class for FltPriceReqParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FltPriceReqParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}MessageParamsBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceFilters" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AssociatedObjectBaseType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceFilter" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceFilterType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Pricing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OverrideCurrency" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CurrencySimpleType" minOccurs="0"/&gt;
 *                   &lt;element name="FeeExemption" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AssociatedObjectBaseType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Code"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;simpleContent&gt;
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                               &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                                             &lt;/extension&gt;
 *                                           &lt;/simpleContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="ProvinceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element name="GovernmentBody" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameSimpleType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "FltPriceReqParamsType", propOrder = {
    "serviceFilters",
    "pricing"
})
public class FltPriceReqParamsType
    extends MessageParamsBaseType
{

    @XmlElement(name = "ServiceFilters")
    protected FltPriceReqParamsType.ServiceFilters serviceFilters;
    @XmlElement(name = "Pricing")
    protected FltPriceReqParamsType.Pricing pricing;

    /**
     * Gets the value of the serviceFilters property.
     * 
     * @return
     *     possible object is
     *     {@link FltPriceReqParamsType.ServiceFilters }
     *     
     */
    public FltPriceReqParamsType.ServiceFilters getServiceFilters() {
        return serviceFilters;
    }

    /**
     * Sets the value of the serviceFilters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceReqParamsType.ServiceFilters }
     *     
     */
    public void setServiceFilters(FltPriceReqParamsType.ServiceFilters value) {
        this.serviceFilters = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link FltPriceReqParamsType.Pricing }
     *     
     */
    public FltPriceReqParamsType.Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceReqParamsType.Pricing }
     *     
     */
    public void setPricing(FltPriceReqParamsType.Pricing value) {
        this.pricing = value;
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
     *         &lt;element name="OverrideCurrency" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CurrencySimpleType" minOccurs="0"/&gt;
     *         &lt;element name="FeeExemption" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AssociatedObjectBaseType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Code"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;simpleContent&gt;
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                                     &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *                                   &lt;/extension&gt;
     *                                 &lt;/simpleContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="ProvinceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element name="GovernmentBody" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameSimpleType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="AutoExchangeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AwardIncludedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="AwardOnlyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="SimpleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "overrideCurrency",
        "feeExemption"
    })
    public static class Pricing {

        @XmlElement(name = "OverrideCurrency")
        protected String overrideCurrency;
        @XmlElement(name = "FeeExemption")
        protected FltPriceReqParamsType.Pricing.FeeExemption feeExemption;
        @XmlAttribute(name = "AutoExchangeInd")
        protected Boolean autoExchangeInd;
        @XmlAttribute(name = "AwardIncludedInd")
        protected Boolean awardIncludedInd;
        @XmlAttribute(name = "AwardOnlyInd")
        protected Boolean awardOnlyInd;
        @XmlAttribute(name = "SimpleInd")
        protected Boolean simpleInd;

        /**
         * Gets the value of the overrideCurrency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverrideCurrency() {
            return overrideCurrency;
        }

        /**
         * Sets the value of the overrideCurrency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverrideCurrency(String value) {
            this.overrideCurrency = value;
        }

        /**
         * Gets the value of the feeExemption property.
         * 
         * @return
         *     possible object is
         *     {@link FltPriceReqParamsType.Pricing.FeeExemption }
         *     
         */
        public FltPriceReqParamsType.Pricing.FeeExemption getFeeExemption() {
            return feeExemption;
        }

        /**
         * Sets the value of the feeExemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link FltPriceReqParamsType.Pricing.FeeExemption }
         *     
         */
        public void setFeeExemption(FltPriceReqParamsType.Pricing.FeeExemption value) {
            this.feeExemption = value;
        }

        /**
         * Gets the value of the autoExchangeInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAutoExchangeInd() {
            return autoExchangeInd;
        }

        /**
         * Sets the value of the autoExchangeInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAutoExchangeInd(Boolean value) {
            this.autoExchangeInd = value;
        }

        /**
         * Gets the value of the awardIncludedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardIncludedInd() {
            return awardIncludedInd;
        }

        /**
         * Sets the value of the awardIncludedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardIncludedInd(Boolean value) {
            this.awardIncludedInd = value;
        }

        /**
         * Gets the value of the awardOnlyInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAwardOnlyInd() {
            return awardOnlyInd;
        }

        /**
         * Sets the value of the awardOnlyInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAwardOnlyInd(Boolean value) {
            this.awardOnlyInd = value;
        }

        /**
         * Gets the value of the simpleInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSimpleInd() {
            return simpleInd;
        }

        /**
         * Sets the value of the simpleInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSimpleInd(Boolean value) {
            this.simpleInd = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AssociatedObjectBaseType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Fee" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Code"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;simpleContent&gt;
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                           &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *                         &lt;/extension&gt;
         *                       &lt;/simpleContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CountryCode" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="ProvinceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameSimpleType" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element name="GovernmentBody" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameSimpleType" minOccurs="0"/&gt;
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
            "fee",
            "countryCode",
            "provinceCode",
            "governmentBody"
        })
        public static class FeeExemption
            extends AssociatedObjectBaseType
        {

            @XmlElement(name = "Fee")
            protected List<FltPriceReqParamsType.Pricing.FeeExemption.Fee> fee;
            @XmlElement(name = "CountryCode")
            protected List<CountryCode> countryCode;
            @XmlElement(name = "ProvinceCode")
            protected List<String> provinceCode;
            @XmlElement(name = "GovernmentBody")
            protected String governmentBody;

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
             * {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee }
             * 
             * 
             */
            public List<FltPriceReqParamsType.Pricing.FeeExemption.Fee> getFee() {
                if (fee == null) {
                    fee = new ArrayList<FltPriceReqParamsType.Pricing.FeeExemption.Fee>();
                }
                return this.fee;
            }

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

            /**
             * Gets the value of the provinceCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the provinceCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProvinceCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getProvinceCode() {
                if (provinceCode == null) {
                    provinceCode = new ArrayList<String>();
                }
                return this.provinceCode;
            }

            /**
             * Gets the value of the governmentBody property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGovernmentBody() {
                return governmentBody;
            }

            /**
             * Sets the value of the governmentBody property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGovernmentBody(String value) {
                this.governmentBody = value;
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
             *         &lt;element name="Code"&gt;
             *           &lt;complexType&gt;
             *             &lt;simpleContent&gt;
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *                 &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
             *               &lt;/extension&gt;
             *             &lt;/simpleContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TaxType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
             *       &lt;/sequence&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "taxType"
            })
            public static class Fee {

                @XmlElement(name = "Code", required = true)
                protected FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code code;
                @XmlElement(name = "TaxType")
                protected List<String> taxType;
                @XmlAttribute(name = "refs")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String refs;

                /**
                 * Gets the value of the code property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code }
                 *     
                 */
                public FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code getCode() {
                    return code;
                }

                /**
                 * Sets the value of the code property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code }
                 *     
                 */
                public void setCode(FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code value) {
                    this.code = value;
                }

                /**
                 * Gets the value of the taxType property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the taxType property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getTaxType().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getTaxType() {
                    if (taxType == null) {
                        taxType = new ArrayList<String>();
                    }
                    return this.taxType;
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
                 *   &lt;simpleContent&gt;
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
                 *       &lt;attribute name="CollectionPoint" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
                public static class Code {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "CollectionPoint")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String collectionPoint;

                    /**
                     * Gets the value of the value property.
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
                     * Gets the value of the collectionPoint property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCollectionPoint() {
                        return collectionPoint;
                    }

                    /**
                     * Sets the value of the collectionPoint property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCollectionPoint(String value) {
                        this.collectionPoint = value;
                    }

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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AssociatedObjectBaseType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="ServiceFilter" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceFilterType" maxOccurs="unbounded"/&gt;
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
        "serviceFilter"
    })
    public static class ServiceFilters
        extends AssociatedObjectBaseType
    {

        @XmlElement(name = "ServiceFilter", required = true)
        protected List<ServiceFilterType> serviceFilter;

        /**
         * Gets the value of the serviceFilter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceFilter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceFilter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceFilterType }
         * 
         * 
         */
        public List<ServiceFilterType> getServiceFilter() {
            if (serviceFilter == null) {
                serviceFilter = new ArrayList<ServiceFilterType>();
            }
            return this.serviceFilter;
        }

    }

}
