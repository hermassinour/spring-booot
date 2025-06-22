
package com.springboot.dto.orderchangerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Data List definition for this message.
 * 
 * <p>Java class for DataListsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataListsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageAllowanceList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BaggageAllowanceListType" minOccurs="0"/&gt;
 *         &lt;element name="BaggageDisclosureList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BaggageDisclosureListType" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfoList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ContactInfoListType" minOccurs="0"/&gt;
 *         &lt;element name="ContentSource" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ListOfContentSourceType" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}FareList" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}InstructionsList" minOccurs="0"/&gt;
 *         &lt;element name="MediaList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}MediaListType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDestList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}OriginDestListType" minOccurs="0"/&gt;
 *         &lt;element name="PaxJourneyList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}JourneyListType" minOccurs="0"/&gt;
 *         &lt;element name="PaxList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PaxListType" minOccurs="0"/&gt;
 *         &lt;element name="PaxSegmentList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SegmentListType" minOccurs="0"/&gt;
 *         &lt;element name="PriceClassList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PriceClassListType" minOccurs="0"/&gt;
 *         &lt;element name="SeatProfileList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SeatProfileListType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDefinitionList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceDefinitionListType" minOccurs="0"/&gt;
 *         &lt;element name="TermsList" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ListOfOfferTermsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataListsType", propOrder = {
    "baggageAllowanceList",
    "baggageDisclosureList",
    "contactInfoList",
    "contentSource",
    "fareList",
    "instructionsList",
    "mediaList",
    "originDestList",
    "paxJourneyList",
    "paxList",
    "paxSegmentList",
    "priceClassList",
    "seatProfileList",
    "serviceDefinitionList",
    "termsList"
})
public class DataListsType {

    @XmlElement(name = "BaggageAllowanceList")
    protected BaggageAllowanceListType baggageAllowanceList;
    @XmlElement(name = "BaggageDisclosureList")
    protected BaggageDisclosureListType baggageDisclosureList;
    @XmlElement(name = "ContactInfoList")
    protected ContactInfoListType contactInfoList;
    @XmlElement(name = "ContentSource")
    protected ListOfContentSourceType contentSource;
    @XmlElement(name = "FareList")
    protected FareList fareList;
    @XmlElement(name = "InstructionsList")
    protected ListOfOfferInstructionsType instructionsList;
    @XmlElement(name = "MediaList")
    protected MediaListType mediaList;
    @XmlElement(name = "OriginDestList")
    protected OriginDestListType originDestList;
    @XmlElement(name = "PaxJourneyList")
    protected JourneyListType paxJourneyList;
    @XmlElement(name = "PaxList")
    protected PaxListType paxList;
    @XmlElement(name = "PaxSegmentList")
    protected SegmentListType paxSegmentList;
    @XmlElement(name = "PriceClassList")
    protected PriceClassListType priceClassList;
    @XmlElement(name = "SeatProfileList")
    protected SeatProfileListType seatProfileList;
    @XmlElement(name = "ServiceDefinitionList")
    protected ServiceDefinitionListType serviceDefinitionList;
    @XmlElement(name = "TermsList")
    protected ListOfOfferTermsType termsList;

    /**
     * Gets the value of the baggageAllowanceList property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    public BaggageAllowanceListType getBaggageAllowanceList() {
        return baggageAllowanceList;
    }

    /**
     * Sets the value of the baggageAllowanceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageAllowanceListType }
     *     
     */
    public void setBaggageAllowanceList(BaggageAllowanceListType value) {
        this.baggageAllowanceList = value;
    }

    /**
     * Gets the value of the baggageDisclosureList property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    public BaggageDisclosureListType getBaggageDisclosureList() {
        return baggageDisclosureList;
    }

    /**
     * Sets the value of the baggageDisclosureList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDisclosureListType }
     *     
     */
    public void setBaggageDisclosureList(BaggageDisclosureListType value) {
        this.baggageDisclosureList = value;
    }

    /**
     * Gets the value of the contactInfoList property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoListType }
     *     
     */
    public ContactInfoListType getContactInfoList() {
        return contactInfoList;
    }

    /**
     * Sets the value of the contactInfoList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoListType }
     *     
     */
    public void setContactInfoList(ContactInfoListType value) {
        this.contactInfoList = value;
    }

    /**
     * Gets the value of the contentSource property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfContentSourceType }
     *     
     */
    public ListOfContentSourceType getContentSource() {
        return contentSource;
    }

    /**
     * Sets the value of the contentSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfContentSourceType }
     *     
     */
    public void setContentSource(ListOfContentSourceType value) {
        this.contentSource = value;
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
     *     {@link MediaListType }
     *     
     */
    public MediaListType getMediaList() {
        return mediaList;
    }

    /**
     * Sets the value of the mediaList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaListType }
     *     
     */
    public void setMediaList(MediaListType value) {
        this.mediaList = value;
    }

    /**
     * Gets the value of the originDestList property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestListType }
     *     
     */
    public OriginDestListType getOriginDestList() {
        return originDestList;
    }

    /**
     * Sets the value of the originDestList property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestListType }
     *     
     */
    public void setOriginDestList(OriginDestListType value) {
        this.originDestList = value;
    }

    /**
     * Gets the value of the paxJourneyList property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyListType }
     *     
     */
    public JourneyListType getPaxJourneyList() {
        return paxJourneyList;
    }

    /**
     * Sets the value of the paxJourneyList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyListType }
     *     
     */
    public void setPaxJourneyList(JourneyListType value) {
        this.paxJourneyList = value;
    }

    /**
     * Gets the value of the paxList property.
     * 
     * @return
     *     possible object is
     *     {@link PaxListType }
     *     
     */
    public PaxListType getPaxList() {
        return paxList;
    }

    /**
     * Sets the value of the paxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxListType }
     *     
     */
    public void setPaxList(PaxListType value) {
        this.paxList = value;
    }

    /**
     * Gets the value of the paxSegmentList property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentListType }
     *     
     */
    public SegmentListType getPaxSegmentList() {
        return paxSegmentList;
    }

    /**
     * Sets the value of the paxSegmentList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentListType }
     *     
     */
    public void setPaxSegmentList(SegmentListType value) {
        this.paxSegmentList = value;
    }

    /**
     * Gets the value of the priceClassList property.
     * 
     * @return
     *     possible object is
     *     {@link PriceClassListType }
     *     
     */
    public PriceClassListType getPriceClassList() {
        return priceClassList;
    }

    /**
     * Sets the value of the priceClassList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceClassListType }
     *     
     */
    public void setPriceClassList(PriceClassListType value) {
        this.priceClassList = value;
    }

    /**
     * Gets the value of the seatProfileList property.
     * 
     * @return
     *     possible object is
     *     {@link SeatProfileListType }
     *     
     */
    public SeatProfileListType getSeatProfileList() {
        return seatProfileList;
    }

    /**
     * Sets the value of the seatProfileList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatProfileListType }
     *     
     */
    public void setSeatProfileList(SeatProfileListType value) {
        this.seatProfileList = value;
    }

    /**
     * Gets the value of the serviceDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    public ServiceDefinitionListType getServiceDefinitionList() {
        return serviceDefinitionList;
    }

    /**
     * Sets the value of the serviceDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionListType }
     *     
     */
    public void setServiceDefinitionList(ServiceDefinitionListType value) {
        this.serviceDefinitionList = value;
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

}
