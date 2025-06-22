
package com.springboot.dto.orderreshoprs;

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
 * Common NDC Data List choices.
 * 
 * <p>Java class for V172_DataListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_DataListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BagDisclosureList" minOccurs="0"/&gt;
 *         &lt;element name="BaggageAllowanceList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BaggageAllowance" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="BaggageCategory" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageCategoryListType"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AllowanceDescription" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DimensionAllowance" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}WeightAllowance" minOccurs="0"/&gt;
 *                             &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="BaggageAllowanceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ClassOfServiceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContentSourceList" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Description"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DisclosureList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}FareList" minOccurs="0"/&gt;
 *         &lt;element name="FlightSegmentList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ListOfFlightSegmentType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FlightList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Flight" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Journey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TotalJourneyType" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}SegmentReferences" maxOccurs="unbounded"/&gt;
 *                             &lt;element name="Settlement" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Method" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IATA_CodeType"/&gt;
 *                                       &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ObjAssociationAttrGroup"/&gt;
 *                           &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}KeyIdentifier" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OriginDestinationList" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OriginDestination" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}InstructionsList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}MediaList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PenaltyList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PriceClassList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceBundleList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TermsList" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_DataListType", propOrder = {
    "bagDisclosureList",
    "baggageAllowanceList",
    "classOfServiceList",
    "contentSourceList",
    "descriptionList",
    "disclosureList",
    "fareList",
    "flightSegmentList",
    "flightList",
    "originDestinationList",
    "instructionsList",
    "mediaList",
    "penaltyList",
    "priceClassList",
    "serviceBundleList",
    "serviceList",
    "termsList"
})
public class V172DataListType {

    @XmlElement(name = "BagDisclosureList")
    protected ListOfBagV172DisclosureType bagDisclosureList;
    @XmlElement(name = "BaggageAllowanceList")
    protected V172DataListType.BaggageAllowanceList baggageAllowanceList;
    @XmlElement(name = "ClassOfServiceList")
    protected ListOfClassOfServiceType classOfServiceList;
    @XmlElement(name = "ContentSourceList")
    protected ListOfContentSourceType contentSourceList;
    @XmlElement(name = "DescriptionList")
    protected V172DataListType.DescriptionList descriptionList;
    @XmlElement(name = "DisclosureList")
    protected ListOfV172DisclosureType disclosureList;
    @XmlElement(name = "FareList")
    protected FareList fareList;
    @XmlElement(name = "FlightSegmentList")
    protected V172DataListType.FlightSegmentList flightSegmentList;
    @XmlElement(name = "FlightList")
    protected V172DataListType.FlightList flightList;
    @XmlElement(name = "OriginDestinationList")
    protected V172DataListType.OriginDestinationList originDestinationList;
    @XmlElement(name = "InstructionsList")
    protected ListOfOfferInstructionsType instructionsList;
    @XmlElement(name = "MediaList")
    protected ListOfMediaType mediaList;
    @XmlElement(name = "PenaltyList")
    protected ListOfOfferV172PenaltyType penaltyList;
    @XmlElement(name = "PriceClassList")
    protected ListOfV172PriceClassType priceClassList;
    @XmlElement(name = "ServiceBundleList")
    protected ListOfServiceBundleType serviceBundleList;
    @XmlElement(name = "ServiceList")
    protected ServiceList serviceList;
    @XmlElement(name = "TermsList")
    protected ListOfOfferTermsType termsList;

    /**
     * Gets the value of the bagDisclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfBagV172DisclosureType }
     *     
     */
    public ListOfBagV172DisclosureType getBagDisclosureList() {
        return bagDisclosureList;
    }

    /**
     * Sets the value of the bagDisclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfBagV172DisclosureType }
     *     
     */
    public void setBagDisclosureList(ListOfBagV172DisclosureType value) {
        this.bagDisclosureList = value;
    }

    /**
     * Gets the value of the baggageAllowanceList property.
     * 
     * @return
     *     possible object is
     *     {@link V172DataListType.BaggageAllowanceList }
     *     
     */
    public V172DataListType.BaggageAllowanceList getBaggageAllowanceList() {
        return baggageAllowanceList;
    }

    /**
     * Sets the value of the baggageAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172DataListType.BaggageAllowanceList }
     *     
     */
    public void setBaggageAllowanceList(V172DataListType.BaggageAllowanceList value) {
        this.baggageAllowanceList = value;
    }

    /**
     * Gets the value of the classOfServiceList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfClassOfServiceType }
     *     
     */
    public ListOfClassOfServiceType getClassOfServiceList() {
        return classOfServiceList;
    }

    /**
     * Sets the value of the classOfServiceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfClassOfServiceType }
     *     
     */
    public void setClassOfServiceList(ListOfClassOfServiceType value) {
        this.classOfServiceList = value;
    }

    /**
     * Gets the value of the contentSourceList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContentSourceType }
     *     
     */
    public ListOfContentSourceType getContentSourceList() {
        return contentSourceList;
    }

    /**
     * Sets the value of the contentSourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContentSourceType }
     *     
     */
    public void setContentSourceList(ListOfContentSourceType value) {
        this.contentSourceList = value;
    }

    /**
     * Gets the value of the descriptionList property.
     * 
     * @return
     *     possible object is
     *     {@link V172DataListType.DescriptionList }
     *     
     */
    public V172DataListType.DescriptionList getDescriptionList() {
        return descriptionList;
    }

    /**
     * Sets the value of the descriptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172DataListType.DescriptionList }
     *     
     */
    public void setDescriptionList(V172DataListType.DescriptionList value) {
        this.descriptionList = value;
    }

    /**
     * Gets the value of the disclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfV172DisclosureType }
     *     
     */
    public ListOfV172DisclosureType getDisclosureList() {
        return disclosureList;
    }

    /**
     * Sets the value of the disclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfV172DisclosureType }
     *     
     */
    public void setDisclosureList(ListOfV172DisclosureType value) {
        this.disclosureList = value;
    }

    /**
     * Gets the value of the fareList property.
     * 
     * @return
     *     possible object is
     *     {@link FareList }
     *     
     */
    public FareList getFareList() {
        return fareList;
    }

    /**
     * Sets the value of the fareList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareList }
     *     
     */
    public void setFareList(FareList value) {
        this.fareList = value;
    }

    /**
     * Gets the value of the flightSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link V172DataListType.FlightSegmentList }
     *     
     */
    public V172DataListType.FlightSegmentList getFlightSegmentList() {
        return flightSegmentList;
    }

    /**
     * Sets the value of the flightSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172DataListType.FlightSegmentList }
     *     
     */
    public void setFlightSegmentList(V172DataListType.FlightSegmentList value) {
        this.flightSegmentList = value;
    }

    /**
     * Gets the value of the flightList property.
     * 
     * @return
     *     possible object is
     *     {@link V172DataListType.FlightList }
     *     
     */
    public V172DataListType.FlightList getFlightList() {
        return flightList;
    }

    /**
     * Sets the value of the flightList property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172DataListType.FlightList }
     *     
     */
    public void setFlightList(V172DataListType.FlightList value) {
        this.flightList = value;
    }

    /**
     * Gets the value of the originDestinationList property.
     * 
     * @return
     *     possible object is
     *     {@link V172DataListType.OriginDestinationList }
     *     
     */
    public V172DataListType.OriginDestinationList getOriginDestinationList() {
        return originDestinationList;
    }

    /**
     * Sets the value of the originDestinationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172DataListType.OriginDestinationList }
     *     
     */
    public void setOriginDestinationList(V172DataListType.OriginDestinationList value) {
        this.originDestinationList = value;
    }

    /**
     * Gets the value of the instructionsList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferInstructionsType }
     *     
     */
    public ListOfOfferInstructionsType getInstructionsList() {
        return instructionsList;
    }

    /**
     * Sets the value of the instructionsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferInstructionsType }
     *     
     */
    public void setInstructionsList(ListOfOfferInstructionsType value) {
        this.instructionsList = value;
    }

    /**
     * Gets the value of the mediaList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfMediaType }
     *     
     */
    public ListOfMediaType getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfMediaType }
     *     
     */
    public void setMediaList(ListOfMediaType value) {
        this.mediaList = value;
    }

    /**
     * Gets the value of the penaltyList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferV172PenaltyType }
     *     
     */
    public ListOfOfferV172PenaltyType getPenaltyList() {
        return penaltyList;
    }

    /**
     * Sets the value of the penaltyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferV172PenaltyType }
     *     
     */
    public void setPenaltyList(ListOfOfferV172PenaltyType value) {
        this.penaltyList = value;
    }

    /**
     * Gets the value of the priceClassList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfV172PriceClassType }
     *     
     */
    public ListOfV172PriceClassType getPriceClassList() {
        return priceClassList;
    }

    /**
     * Sets the value of the priceClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfV172PriceClassType }
     *     
     */
    public void setPriceClassList(ListOfV172PriceClassType value) {
        this.priceClassList = value;
    }

    /**
     * Gets the value of the serviceBundleList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfServiceBundleType }
     *     
     */
    public ListOfServiceBundleType getServiceBundleList() {
        return serviceBundleList;
    }

    /**
     * Sets the value of the serviceBundleList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfServiceBundleType }
     *     
     */
    public void setServiceBundleList(ListOfServiceBundleType value) {
        this.serviceBundleList = value;
    }

    /**
     * Gets the value of the serviceList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceList }
     *     
     */
    public ServiceList getServiceList() {
        return serviceList;
    }

    /**
     * Sets the value of the serviceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceList }
     *     
     */
    public void setServiceList(ServiceList value) {
        this.serviceList = value;
    }

    /**
     * Gets the value of the termsList property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfOfferTermsType }
     *     
     */
    public ListOfOfferTermsType getTermsList() {
        return termsList;
    }

    /**
     * Sets the value of the termsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfOfferTermsType }
     *     
     */
    public void setTermsList(ListOfOfferTermsType value) {
        this.termsList = value;
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
     *         &lt;element name="BaggageAllowance" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="BaggageCategory" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageCategoryListType"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AllowanceDescription" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DimensionAllowance" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}WeightAllowance" minOccurs="0"/&gt;
     *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="BaggageAllowanceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
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
        "baggageAllowance"
    })
    public static class BaggageAllowanceList {

        @XmlElement(name = "BaggageAllowance", required = true)
        protected List<V172DataListType.BaggageAllowanceList.BaggageAllowance> baggageAllowance;

        /**
         * Gets the value of the baggageAllowance property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageAllowance property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageAllowance().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link V172DataListType.BaggageAllowanceList.BaggageAllowance }
         * 
         * 
         */
        public List<V172DataListType.BaggageAllowanceList.BaggageAllowance> getBaggageAllowance() {
            if (baggageAllowance == null) {
                baggageAllowance = new ArrayList<V172DataListType.BaggageAllowanceList.BaggageAllowance>();
            }
            return this.baggageAllowance;
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
         *         &lt;element name="BaggageCategory" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageCategoryListType"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AllowanceDescription" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DimensionAllowance" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PieceAllowance" maxOccurs="unbounded" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}WeightAllowance" minOccurs="0"/&gt;
         *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="BaggageAllowanceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "baggageCategory",
            "allowanceDescription",
            "dimensionAllowance",
            "pieceAllowance",
            "weightAllowance",
            "baggageDeterminingCarrier"
        })
        public static class BaggageAllowance {

            @XmlElement(name = "BaggageCategory", required = true)
            @XmlSchemaType(name = "string")
            protected BaggageCategoryListType baggageCategory;
            @XmlElement(name = "AllowanceDescription")
            protected BagAllowanceDescType allowanceDescription;
            @XmlElement(name = "DimensionAllowance")
            protected BagAllowanceDimensionType dimensionAllowance;
            @XmlElement(name = "PieceAllowance")
            protected List<PieceAllowance> pieceAllowance;
            @XmlElement(name = "WeightAllowance")
            protected WeightAllowance weightAllowance;
            @XmlElement(name = "BaggageDeterminingCarrier")
            protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
            @XmlAttribute(name = "BaggageAllowanceID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String baggageAllowanceID;

            /**
             * Gets the value of the baggageCategory property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageCategoryListType }
             *     
             */
            public BaggageCategoryListType getBaggageCategory() {
                return baggageCategory;
            }

            /**
             * Sets the value of the baggageCategory property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageCategoryListType }
             *     
             */
            public void setBaggageCategory(BaggageCategoryListType value) {
                this.baggageCategory = value;
            }

            /**
             * Gets the value of the allowanceDescription property.
             * 
             * @return
             *     possible object is
             *     {@link BagAllowanceDescType }
             *     
             */
            public BagAllowanceDescType getAllowanceDescription() {
                return allowanceDescription;
            }

            /**
             * Sets the value of the allowanceDescription property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagAllowanceDescType }
             *     
             */
            public void setAllowanceDescription(BagAllowanceDescType value) {
                this.allowanceDescription = value;
            }

            /**
             * Gets the value of the dimensionAllowance property.
             * 
             * @return
             *     possible object is
             *     {@link BagAllowanceDimensionType }
             *     
             */
            public BagAllowanceDimensionType getDimensionAllowance() {
                return dimensionAllowance;
            }

            /**
             * Sets the value of the dimensionAllowance property.
             * 
             * @param value
             *     allowed object is
             *     {@link BagAllowanceDimensionType }
             *     
             */
            public void setDimensionAllowance(BagAllowanceDimensionType value) {
                this.dimensionAllowance = value;
            }

            /**
             * Gets the value of the pieceAllowance property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pieceAllowance property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPieceAllowance().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PieceAllowance }
             * 
             * 
             */
            public List<PieceAllowance> getPieceAllowance() {
                if (pieceAllowance == null) {
                    pieceAllowance = new ArrayList<PieceAllowance>();
                }
                return this.pieceAllowance;
            }

            /**
             * Gets the value of the weightAllowance property.
             * 
             * @return
             *     possible object is
             *     {@link WeightAllowance }
             *     
             */
            public WeightAllowance getWeightAllowance() {
                return weightAllowance;
            }

            /**
             * Sets the value of the weightAllowance property.
             * 
             * @param value
             *     allowed object is
             *     {@link WeightAllowance }
             *     
             */
            public void setWeightAllowance(WeightAllowance value) {
                this.weightAllowance = value;
            }

            /**
             * Gets the value of the baggageDeterminingCarrier property.
             * 
             * @return
             *     possible object is
             *     {@link BaggageDeterminingCarrierType }
             *     
             */
            public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
                return baggageDeterminingCarrier;
            }

            /**
             * Sets the value of the baggageDeterminingCarrier property.
             * 
             * @param value
             *     allowed object is
             *     {@link BaggageDeterminingCarrierType }
             *     
             */
            public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
                this.baggageDeterminingCarrier = value;
            }

            /**
             * Gets the value of the baggageAllowanceID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaggageAllowanceID() {
                return baggageAllowanceID;
            }

            /**
             * Sets the value of the baggageAllowanceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaggageAllowanceID(String value) {
                this.baggageAllowanceID = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Description"/&gt;
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
        "description"
    })
    public static class DescriptionList {

        @XmlElement(name = "Description", required = true)
        protected Description description;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link Description }
         *     
         */
        public Description getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link Description }
         *     
         */
        public void setDescription(Description value) {
            this.description = value;
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
     *         &lt;element name="Flight" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Journey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TotalJourneyType" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}SegmentReferences" maxOccurs="unbounded"/&gt;
     *                   &lt;element name="Settlement" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Method" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IATA_CodeType"/&gt;
     *                             &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountOptType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ObjAssociationAttrGroup"/&gt;
     *                 &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}KeyIdentifier" /&gt;
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
        "flight"
    })
    public static class FlightList {

        @XmlElement(name = "Flight", required = true)
        protected List<V172DataListType.FlightList.Flight> flight;

        /**
         * Gets the value of the flight property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flight property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlight().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link V172DataListType.FlightList.Flight }
         * 
         * 
         */
        public List<V172DataListType.FlightList.Flight> getFlight() {
            if (flight == null) {
                flight = new ArrayList<V172DataListType.FlightList.Flight>();
            }
            return this.flight;
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
         *         &lt;element name="Journey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TotalJourneyType" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}SegmentReferences" maxOccurs="unbounded"/&gt;
         *         &lt;element name="Settlement" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Method" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IATA_CodeType"/&gt;
         *                   &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountOptType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ObjAssociationAttrGroup"/&gt;
         *       &lt;attribute name="FlightKey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}KeyIdentifier" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "journey",
            "segmentReferences",
            "settlement"
        })
        public static class Flight {

            @XmlElement(name = "Journey")
            protected TotalJourneyType journey;
            @XmlElement(name = "SegmentReferences", required = true)
            protected List<SegmentReferences> segmentReferences;
            @XmlElement(name = "Settlement")
            protected V172DataListType.FlightList.Flight.Settlement settlement;
            @XmlAttribute(name = "FlightKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String flightKey;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the journey property.
             * 
             * @return
             *     possible object is
             *     {@link TotalJourneyType }
             *     
             */
            public TotalJourneyType getJourney() {
                return journey;
            }

            /**
             * Sets the value of the journey property.
             * 
             * @param value
             *     allowed object is
             *     {@link TotalJourneyType }
             *     
             */
            public void setJourney(TotalJourneyType value) {
                this.journey = value;
            }

            /**
             * Gets the value of the segmentReferences property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the segmentReferences property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSegmentReferences().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SegmentReferences }
             * 
             * 
             */
            public List<SegmentReferences> getSegmentReferences() {
                if (segmentReferences == null) {
                    segmentReferences = new ArrayList<SegmentReferences>();
                }
                return this.segmentReferences;
            }

            /**
             * Gets the value of the settlement property.
             * 
             * @return
             *     possible object is
             *     {@link V172DataListType.FlightList.Flight.Settlement }
             *     
             */
            public V172DataListType.FlightList.Flight.Settlement getSettlement() {
                return settlement;
            }

            /**
             * Sets the value of the settlement property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172DataListType.FlightList.Flight.Settlement }
             *     
             */
            public void setSettlement(V172DataListType.FlightList.Flight.Settlement value) {
                this.settlement = value;
            }

            /**
             * Gets the value of the flightKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFlightKey() {
                return flightKey;
            }

            /**
             * Sets the value of the flightKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFlightKey(String value) {
                this.flightKey = value;
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
             *         &lt;element name="Method" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IATA_CodeType"/&gt;
             *         &lt;element name="InterlineSettlementValue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountOptType" minOccurs="0"/&gt;
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
                "method",
                "interlineSettlementValue"
            })
            public static class Settlement {

                @XmlElement(name = "Method", required = true)
                protected String method;
                @XmlElement(name = "InterlineSettlementValue")
                protected CurrencyAmountOptType interlineSettlementValue;

                /**
                 * Gets the value of the method property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMethod() {
                    return method;
                }

                /**
                 * Sets the value of the method property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMethod(String value) {
                    this.method = value;
                }

                /**
                 * Gets the value of the interlineSettlementValue property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public CurrencyAmountOptType getInterlineSettlementValue() {
                    return interlineSettlementValue;
                }

                /**
                 * Sets the value of the interlineSettlementValue property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public void setInterlineSettlementValue(CurrencyAmountOptType value) {
                    this.interlineSettlementValue = value;
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
     *         &lt;element name="FlightSegment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ListOfFlightSegmentType" maxOccurs="unbounded"/&gt;
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
        "flightSegment"
    })
    public static class FlightSegmentList {

        @XmlElement(name = "FlightSegment", required = true)
        protected List<ListOfFlightSegmentType> flightSegment;

        /**
         * Gets the value of the flightSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ListOfFlightSegmentType }
         * 
         * 
         */
        public List<ListOfFlightSegmentType> getFlightSegment() {
            if (flightSegment == null) {
                flightSegment = new ArrayList<ListOfFlightSegmentType>();
            }
            return this.flightSegment;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OriginDestination" maxOccurs="unbounded"/&gt;
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
        "originDestination"
    })
    public static class OriginDestinationList {

        @XmlElement(name = "OriginDestination", required = true)
        protected List<OriginDestination> originDestination;

        /**
         * Gets the value of the originDestination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OriginDestination }
         * 
         * 
         */
        public List<OriginDestination> getOriginDestination() {
            if (originDestination == null) {
                originDestination = new ArrayList<OriginDestination>();
            }
            return this.originDestination;
        }

    }

}
