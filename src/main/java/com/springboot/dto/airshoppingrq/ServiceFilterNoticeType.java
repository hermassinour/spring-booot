
package com.springboot.dto.airshoppingrq;

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
 * Optional Service Filter Notification. Note: Supports ATPCO group and subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
 * 
 * <p>Java class for ServiceFilterNoticeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceFilterNoticeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TrxProcessObjectBaseType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Query"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ServiceFilter" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ServiceFilterType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Results"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AppliedFilters" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="AppliedFilter" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ServiceFilterType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Associations" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;choice&gt;
 *                                                 &lt;element name="Offer"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
 *                                                           &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightInfoAssocType" minOccurs="0"/&gt;
 *                                                           &lt;element name="PriceClass" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;sequence&gt;
 *                                                                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
 *                                                                   &lt;/sequence&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                           &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BagDetailAssocType" minOccurs="0"/&gt;
 *                                                           &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
 *                                                           &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                                             &lt;complexType&gt;
 *                                                               &lt;complexContent&gt;
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                                   &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
 *                                                                   &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                                                                 &lt;/restriction&gt;
 *                                                               &lt;/complexContent&gt;
 *                                                             &lt;/complexType&gt;
 *                                                           &lt;/element&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrderItemAssociationType"/&gt;
 *                                               &lt;/choice&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
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
 *                 &lt;attribute name="SrvcFilterAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ServiceFilterNoticeType", propOrder = {
    "query",
    "results"
})
public class ServiceFilterNoticeType
    extends TrxProcessObjectBaseType
{

    @XmlElement(name = "Query")
    protected ServiceFilterNoticeType.Query query;
    @XmlElement(name = "Results")
    protected ServiceFilterNoticeType.Results results;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFilterNoticeType.Query }
     *     
     */
    public ServiceFilterNoticeType.Query getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFilterNoticeType.Query }
     *     
     */
    public void setQuery(ServiceFilterNoticeType.Query value) {
        this.query = value;
    }

    /**
     * Gets the value of the results property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceFilterNoticeType.Results }
     *     
     */
    public ServiceFilterNoticeType.Results getResults() {
        return results;
    }

    /**
     * Sets the value of the results property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceFilterNoticeType.Results }
     *     
     */
    public void setResults(ServiceFilterNoticeType.Results value) {
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
     *         &lt;element name="ServiceFilter" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ServiceFilterType" maxOccurs="unbounded"/&gt;
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
        "serviceFilter"
    })
    public static class Query {

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
     *         &lt;element name="AppliedFilters" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="AppliedFilter" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ServiceFilterType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Associations" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;choice&gt;
     *                                       &lt;element name="Offer"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
     *                                                 &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightInfoAssocType" minOccurs="0"/&gt;
     *                                                 &lt;element name="PriceClass" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;sequence&gt;
     *                                                           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
     *                                                         &lt;/sequence&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                                 &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BagDetailAssocType" minOccurs="0"/&gt;
     *                                                 &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
     *                                                 &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
     *                                                   &lt;complexType&gt;
     *                                                     &lt;complexContent&gt;
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                                         &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
     *                                                         &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *                                                       &lt;/restriction&gt;
     *                                                     &lt;/complexContent&gt;
     *                                                   &lt;/complexType&gt;
     *                                                 &lt;/element&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrderItemAssociationType"/&gt;
     *                                     &lt;/choice&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
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
     *       &lt;/sequence&gt;
     *       &lt;attribute name="SrvcFilterAppliedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "appliedFilters"
    })
    public static class Results {

        @XmlElement(name = "AppliedFilters")
        protected ServiceFilterNoticeType.Results.AppliedFilters appliedFilters;
        @XmlAttribute(name = "SrvcFilterAppliedInd")
        protected Boolean srvcFilterAppliedInd;

        /**
         * Gets the value of the appliedFilters property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFilterNoticeType.Results.AppliedFilters }
         *     
         */
        public ServiceFilterNoticeType.Results.AppliedFilters getAppliedFilters() {
            return appliedFilters;
        }

        /**
         * Sets the value of the appliedFilters property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFilterNoticeType.Results.AppliedFilters }
         *     
         */
        public void setAppliedFilters(ServiceFilterNoticeType.Results.AppliedFilters value) {
            this.appliedFilters = value;
        }

        /**
         * Gets the value of the srvcFilterAppliedInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSrvcFilterAppliedInd() {
            return srvcFilterAppliedInd;
        }

        /**
         * Sets the value of the srvcFilterAppliedInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSrvcFilterAppliedInd(Boolean value) {
            this.srvcFilterAppliedInd = value;
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
         *         &lt;element name="AppliedFilter" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ServiceFilterType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Associations" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;choice&gt;
         *                             &lt;element name="Offer"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
         *                                       &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightInfoAssocType" minOccurs="0"/&gt;
         *                                       &lt;element name="PriceClass" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;sequence&gt;
         *                                                 &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
         *                                               &lt;/sequence&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                       &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BagDetailAssocType" minOccurs="0"/&gt;
         *                                       &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
         *                                       &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
         *                                         &lt;complexType&gt;
         *                                           &lt;complexContent&gt;
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                               &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
         *                                               &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
         *                                             &lt;/restriction&gt;
         *                                           &lt;/complexContent&gt;
         *                                         &lt;/complexType&gt;
         *                                       &lt;/element&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrderItemAssociationType"/&gt;
         *                           &lt;/choice&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
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
            "appliedFilter"
        })
        public static class AppliedFilters {

            @XmlElement(name = "AppliedFilter", required = true)
            protected List<ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter> appliedFilter;

            /**
             * Gets the value of the appliedFilter property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the appliedFilter property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAppliedFilter().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter }
             * 
             * 
             */
            public List<ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter> getAppliedFilter() {
                if (appliedFilter == null) {
                    appliedFilter = new ArrayList<ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter>();
                }
                return this.appliedFilter;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ServiceFilterType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Associations" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;choice&gt;
             *                   &lt;element name="Offer"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
             *                             &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightInfoAssocType" minOccurs="0"/&gt;
             *                             &lt;element name="PriceClass" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;sequence&gt;
             *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
             *                                     &lt;/sequence&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                             &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BagDetailAssocType" minOccurs="0"/&gt;
             *                             &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
             *                             &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
             *                               &lt;complexType&gt;
             *                                 &lt;complexContent&gt;
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                                     &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
             *                                     &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
             *                                   &lt;/restriction&gt;
             *                                 &lt;/complexContent&gt;
             *                               &lt;/complexType&gt;
             *                             &lt;/element&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrderItemAssociationType"/&gt;
             *                 &lt;/choice&gt;
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
            @XmlType(name = "", propOrder = {
                "associations"
            })
            public static class AppliedFilter
                extends ServiceFilterType
            {

                @XmlElement(name = "Associations")
                protected ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations associations;

                /**
                 * Gets the value of the associations property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations }
                 *     
                 */
                public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations getAssociations() {
                    return associations;
                }

                /**
                 * Sets the value of the associations property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations }
                 *     
                 */
                public void setAssociations(ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations value) {
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
                 *       &lt;choice&gt;
                 *         &lt;element name="Offer"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
                 *                   &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightInfoAssocType" minOccurs="0"/&gt;
                 *                   &lt;element name="PriceClass" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;sequence&gt;
                 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
                 *                           &lt;/sequence&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                   &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BagDetailAssocType" minOccurs="0"/&gt;
                 *                   &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
                 *                   &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
                 *                     &lt;complexType&gt;
                 *                       &lt;complexContent&gt;
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                           &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
                 *                           &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
                 *                         &lt;/restriction&gt;
                 *                       &lt;/complexContent&gt;
                 *                     &lt;/complexType&gt;
                 *                   &lt;/element&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="Order" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrderItemAssociationType"/&gt;
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
                    "offer",
                    "order"
                })
                public static class Associations {

                    @XmlElement(name = "Offer")
                    protected ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer offer;
                    @XmlElement(name = "Order")
                    protected OrderItemAssociationType order;

                    /**
                     * Gets the value of the offer property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer }
                     *     
                     */
                    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer getOffer() {
                        return offer;
                    }

                    /**
                     * Sets the value of the offer property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer }
                     *     
                     */
                    public void setOffer(ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer value) {
                        this.offer = value;
                    }

                    /**
                     * Gets the value of the order property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link OrderItemAssociationType }
                     *     
                     */
                    public OrderItemAssociationType getOrder() {
                        return order;
                    }

                    /**
                     * Sets the value of the order property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OrderItemAssociationType }
                     *     
                     */
                    public void setOrder(OrderItemAssociationType value) {
                        this.order = value;
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
                     *         &lt;element name="Shopper" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShopperInfoAssocType" minOccurs="0"/&gt;
                     *         &lt;element name="Flight" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightInfoAssocType" minOccurs="0"/&gt;
                     *         &lt;element name="PriceClass" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;sequence&gt;
                     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
                     *                 &lt;/sequence&gt;
                     *               &lt;/restriction&gt;
                     *             &lt;/complexContent&gt;
                     *           &lt;/complexType&gt;
                     *         &lt;/element&gt;
                     *         &lt;element name="BagDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BagDetailAssocType" minOccurs="0"/&gt;
                     *         &lt;element name="OfferDetails" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferDetailInfoAssocType" minOccurs="0"/&gt;
                     *         &lt;element name="OtherAssociation" maxOccurs="unbounded" minOccurs="0"&gt;
                     *           &lt;complexType&gt;
                     *             &lt;complexContent&gt;
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *                 &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
                     *                 &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
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
                        "shopper",
                        "flight",
                        "priceClass",
                        "bagDetails",
                        "offerDetails",
                        "otherAssociation"
                    })
                    public static class Offer {

                        @XmlElement(name = "Shopper")
                        protected ShopperInfoAssocType shopper;
                        @XmlElement(name = "Flight")
                        protected FlightInfoAssocType flight;
                        @XmlElement(name = "PriceClass")
                        protected ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass priceClass;
                        @XmlElement(name = "BagDetails")
                        protected BagDetailAssocType bagDetails;
                        @XmlElement(name = "OfferDetails")
                        protected OfferDetailInfoAssocType offerDetails;
                        @XmlElement(name = "OtherAssociation")
                        protected List<ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation> otherAssociation;

                        /**
                         * Gets the value of the shopper property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ShopperInfoAssocType }
                         *     
                         */
                        public ShopperInfoAssocType getShopper() {
                            return shopper;
                        }

                        /**
                         * Sets the value of the shopper property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ShopperInfoAssocType }
                         *     
                         */
                        public void setShopper(ShopperInfoAssocType value) {
                            this.shopper = value;
                        }

                        /**
                         * Gets the value of the flight property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link FlightInfoAssocType }
                         *     
                         */
                        public FlightInfoAssocType getFlight() {
                            return flight;
                        }

                        /**
                         * Sets the value of the flight property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link FlightInfoAssocType }
                         *     
                         */
                        public void setFlight(FlightInfoAssocType value) {
                            this.flight = value;
                        }

                        /**
                         * Gets the value of the priceClass property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass }
                         *     
                         */
                        public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass getPriceClass() {
                            return priceClass;
                        }

                        /**
                         * Sets the value of the priceClass property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass }
                         *     
                         */
                        public void setPriceClass(ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass value) {
                            this.priceClass = value;
                        }

                        /**
                         * Gets the value of the bagDetails property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link BagDetailAssocType }
                         *     
                         */
                        public BagDetailAssocType getBagDetails() {
                            return bagDetails;
                        }

                        /**
                         * Sets the value of the bagDetails property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BagDetailAssocType }
                         *     
                         */
                        public void setBagDetails(BagDetailAssocType value) {
                            this.bagDetails = value;
                        }

                        /**
                         * Gets the value of the offerDetails property.
                         * 
                         * @return
                         *     possible object is
                         *     {@link OfferDetailInfoAssocType }
                         *     
                         */
                        public OfferDetailInfoAssocType getOfferDetails() {
                            return offerDetails;
                        }

                        /**
                         * Sets the value of the offerDetails property.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link OfferDetailInfoAssocType }
                         *     
                         */
                        public void setOfferDetails(OfferDetailInfoAssocType value) {
                            this.offerDetails = value;
                        }

                        /**
                         * Gets the value of the otherAssociation property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the otherAssociation property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getOtherAssociation().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation }
                         * 
                         * 
                         */
                        public List<ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation> getOtherAssociation() {
                            if (otherAssociation == null) {
                                otherAssociation = new ArrayList<ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation>();
                            }
                            return this.otherAssociation;
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
                         *       &lt;attribute name="Type" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherOrderAssocListType" /&gt;
                         *       &lt;attribute name="RefValue" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
                         *     &lt;/restriction&gt;
                         *   &lt;/complexContent&gt;
                         * &lt;/complexType&gt;
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class OtherAssociation {

                            @XmlAttribute(name = "Type", required = true)
                            protected String type;
                            @XmlAttribute(name = "RefValue", required = true)
                            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                            @XmlSchemaType(name = "token")
                            protected String refValue;

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
                             * Gets the value of the refValue property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getRefValue() {
                                return refValue;
                            }

                            /**
                             * Sets the value of the refValue property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setRefValue(String value) {
                                this.refValue = value;
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
                         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PriceClassReference"/&gt;
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
                            "priceClassReference"
                        })
                        public static class PriceClass {

                            @XmlElement(name = "PriceClassReference", required = true)
                            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                            @XmlSchemaType(name = "token")
                            protected String priceClassReference;

                            /**
                             * Gets the value of the priceClassReference property.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPriceClassReference() {
                                return priceClassReference;
                            }

                            /**
                             * Sets the value of the priceClassReference property.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPriceClassReference(String value) {
                                this.priceClassReference = value;
                            }

                        }

                    }

                }

            }

        }

    }

}
