
package com.springboot.dto.orderreshoprs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A proposal to sell a specific set of products or Services under specific conditions, for a certain price. Can be the response to a shopping request.
 * 
 * <p>Java class for OfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigCodeType"/&gt;
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDateInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="WebAddressURL" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}UniformResourceID_Type" minOccurs="0"/&gt;
 *         &lt;element name="RedemptionInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="MatchAppText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MatchType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="MatchPercent" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="OfferExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="BaggageAllowance" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BaggageDisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DescType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DisclosureRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="JourneyOverview" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}JourneyOverviewType" minOccurs="0"/&gt;
 *         &lt;element name="PTC_OfferParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PTC_OfferParametersType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PriceType" minOccurs="0"/&gt;
 *         &lt;element name="AddOfferItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OfferItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeleteOrderItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DeleteOrderItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NameChangeOfferItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameChangeOfferItemType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferType", propOrder = {
    "offerID",
    "ownerCode",
    "ownerTypeCode",
    "validatingCarrierCode",
    "requestedDateInd",
    "webAddressURL",
    "redemptionInd",
    "matchAppText",
    "matchType",
    "matchPercent",
    "offerExpirationDateTime",
    "paymentTimeLimitDateTime",
    "priceGuaranteeTimeLimitDateTime",
    "baggageAllowance",
    "baggageDisclosureRefID",
    "desc",
    "disclosureRefID",
    "penaltyRefID",
    "journeyOverview",
    "ptcOfferParameters",
    "totalPrice",
    "addOfferItem",
    "deleteOrderItem",
    "nameChangeOfferItem"
})
public class OfferType {

    @XmlElement(name = "OfferID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerID;
    @XmlElement(name = "OwnerCode", required = true)
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "string")
    protected OwnerTypeContentType ownerTypeCode;
    @XmlElement(name = "ValidatingCarrierCode")
    protected String validatingCarrierCode;
    @XmlElement(name = "RequestedDateInd")
    protected Boolean requestedDateInd;
    @XmlElement(name = "WebAddressURL")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURL;
    @XmlElement(name = "RedemptionInd")
    protected Boolean redemptionInd;
    @XmlElement(name = "MatchAppText")
    protected String matchAppText;
    @XmlElement(name = "MatchType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String matchType;
    @XmlElement(name = "MatchPercent")
    protected BigDecimal matchPercent;
    @XmlElement(name = "OfferExpirationDateTime")
    protected DateTimeType offerExpirationDateTime;
    @XmlElement(name = "PaymentTimeLimitDateTime")
    protected DateTimeType paymentTimeLimitDateTime;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "BaggageAllowance")
    protected List<OfferType.BaggageAllowance> baggageAllowance;
    @XmlElement(name = "BaggageDisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> baggageDisclosureRefID;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "DisclosureRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String disclosureRefID;
    @XmlElement(name = "PenaltyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> penaltyRefID;
    @XmlElement(name = "JourneyOverview")
    protected JourneyOverviewType journeyOverview;
    @XmlElement(name = "PTC_OfferParameters")
    protected List<PTCOfferParametersType> ptcOfferParameters;
    @XmlElement(name = "TotalPrice")
    protected PriceType totalPrice;
    @XmlElement(name = "AddOfferItem")
    protected List<OfferItemType> addOfferItem;
    @XmlElement(name = "DeleteOrderItem")
    protected List<DeleteOrderItemType> deleteOrderItem;
    @XmlElement(name = "NameChangeOfferItem")
    protected NameChangeOfferItemType nameChangeOfferItem;

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferID(String value) {
        this.offerID = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeContentType }
     *     
     */
    public OwnerTypeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

    /**
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
    }

    /**
     * Gets the value of the webAddressURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURL() {
        return webAddressURL;
    }

    /**
     * Sets the value of the webAddressURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressURL(String value) {
        this.webAddressURL = value;
    }

    /**
     * Gets the value of the redemptionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRedemptionInd() {
        return redemptionInd;
    }

    /**
     * Sets the value of the redemptionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRedemptionInd(Boolean value) {
        this.redemptionInd = value;
    }

    /**
     * Gets the value of the matchAppText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchAppText() {
        return matchAppText;
    }

    /**
     * Sets the value of the matchAppText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchAppText(String value) {
        this.matchAppText = value;
    }

    /**
     * Gets the value of the matchType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatchType() {
        return matchType;
    }

    /**
     * Sets the value of the matchType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatchType(String value) {
        this.matchType = value;
    }

    /**
     * Gets the value of the matchPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMatchPercent() {
        return matchPercent;
    }

    /**
     * Sets the value of the matchPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMatchPercent(BigDecimal value) {
        this.matchPercent = value;
    }

    /**
     * Gets the value of the offerExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOfferExpirationDateTime() {
        return offerExpirationDateTime;
    }

    /**
     * Sets the value of the offerExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOfferExpirationDateTime(DateTimeType value) {
        this.offerExpirationDateTime = value;
    }

    /**
     * Gets the value of the paymentTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPaymentTimeLimitDateTime(DateTimeType value) {
        this.paymentTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

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
     * {@link OfferType.BaggageAllowance }
     * 
     * 
     */
    public List<OfferType.BaggageAllowance> getBaggageAllowance() {
        if (baggageAllowance == null) {
            baggageAllowance = new ArrayList<OfferType.BaggageAllowance>();
        }
        return this.baggageAllowance;
    }

    /**
     * Gets the value of the baggageDisclosureRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosureRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDisclosureRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBaggageDisclosureRefID() {
        if (baggageDisclosureRefID == null) {
            baggageDisclosureRefID = new ArrayList<String>();
        }
        return this.baggageDisclosureRefID;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the disclosureRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureRefID() {
        return disclosureRefID;
    }

    /**
     * Sets the value of the disclosureRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureRefID(String value) {
        this.disclosureRefID = value;
    }

    /**
     * Gets the value of the penaltyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penaltyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenaltyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPenaltyRefID() {
        if (penaltyRefID == null) {
            penaltyRefID = new ArrayList<String>();
        }
        return this.penaltyRefID;
    }

    /**
     * Gets the value of the journeyOverview property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyOverviewType }
     *     
     */
    public JourneyOverviewType getJourneyOverview() {
        return journeyOverview;
    }

    /**
     * Sets the value of the journeyOverview property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyOverviewType }
     *     
     */
    public void setJourneyOverview(JourneyOverviewType value) {
        this.journeyOverview = value;
    }

    /**
     * Gets the value of the ptcOfferParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcOfferParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTCOfferParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PTCOfferParametersType }
     * 
     * 
     */
    public List<PTCOfferParametersType> getPTCOfferParameters() {
        if (ptcOfferParameters == null) {
            ptcOfferParameters = new ArrayList<PTCOfferParametersType>();
        }
        return this.ptcOfferParameters;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setTotalPrice(PriceType value) {
        this.totalPrice = value;
    }

    /**
     * Gets the value of the addOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemType }
     * 
     * 
     */
    public List<OfferItemType> getAddOfferItem() {
        if (addOfferItem == null) {
            addOfferItem = new ArrayList<OfferItemType>();
        }
        return this.addOfferItem;
    }

    /**
     * Gets the value of the deleteOrderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteOrderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteOrderItemType }
     * 
     * 
     */
    public List<DeleteOrderItemType> getDeleteOrderItem() {
        if (deleteOrderItem == null) {
            deleteOrderItem = new ArrayList<DeleteOrderItemType>();
        }
        return this.deleteOrderItem;
    }

    /**
     * Gets the value of the nameChangeOfferItem property.
     * 
     * @return
     *     possible object is
     *     {@link NameChangeOfferItemType }
     *     
     */
    public NameChangeOfferItemType getNameChangeOfferItem() {
        return nameChangeOfferItem;
    }

    /**
     * Sets the value of the nameChangeOfferItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameChangeOfferItemType }
     *     
     */
    public void setNameChangeOfferItem(NameChangeOfferItemType value) {
        this.nameChangeOfferItem = value;
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
     *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
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
        "paxJourneyRefID",
        "paxRefID",
        "baggageAllowanceRefID"
    })
    public static class BaggageAllowance {

        @XmlElement(name = "PaxJourneyRefID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> paxJourneyRefID;
        @XmlElement(name = "PaxRefID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> paxRefID;
        @XmlElement(name = "BaggageAllowanceRefID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String baggageAllowanceRefID;

        /**
         * Gets the value of the paxJourneyRefID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxJourneyRefID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaxJourneyRefID() {
            if (paxJourneyRefID == null) {
                paxJourneyRefID = new ArrayList<String>();
            }
            return this.paxJourneyRefID;
        }

        /**
         * Gets the value of the paxRefID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxRefID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaxRefID() {
            if (paxRefID == null) {
                paxRefID = new ArrayList<String>();
            }
            return this.paxRefID;
        }

        /**
         * Gets the value of the baggageAllowanceRefID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaggageAllowanceRefID() {
            return baggageAllowanceRefID;
        }

        /**
         * Sets the value of the baggageAllowanceRefID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaggageAllowanceRefID(String value) {
            this.baggageAllowanceRefID = value;
        }

    }

}
