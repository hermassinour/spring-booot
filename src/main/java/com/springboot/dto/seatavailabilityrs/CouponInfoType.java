
package com.springboot.dto.seatavailabilityrs;

import java.math.BigDecimal;
import java.math.BigInteger;
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * COUPON definition.
 * 
 * <p>Java class for CouponInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponItinSequenceNbr" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CouponNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="CouponReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="8"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}FareBasisCode" minOccurs="0"/&gt;
 *         &lt;element name="CouponMedia" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CouponMediaSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="CouponValid" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CouponEffectiveType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType"/&gt;
 *         &lt;element name="InvoluntaryIndicatorCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementAuthCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="AssocFareBasis" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="PromoCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}V172_PromotionType" minOccurs="0"/&gt;
 *         &lt;element name="DateOfService" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ServiceQuantity" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ServiceReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Value" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountOptType" minOccurs="0"/&gt;
 *         &lt;element name="SoldAirlineInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CouponSoldAirlineType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrentAirlineInfo"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CheckedInAirlineInfo"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}FlownAirlineInfo"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}InConnectionWithInfo" minOccurs="0"/&gt;
 *         &lt;element name="PresentInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="To"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;pattern value="[0-9a-zA-Z]{1,45}"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *                 &lt;attribute name="At"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                       &lt;pattern value="[0-9a-zA-Z]{1,43}"/&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReasonForIssuance" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}RFIC" minOccurs="0"/&gt;
 *                   &lt;element name="Code" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ShortDescSimpleType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="FiledFeeInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="BSR_Rate"&gt;
 *                   &lt;simpleType&gt;
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *                     &lt;/restriction&gt;
 *                   &lt;/simpleType&gt;
 *                 &lt;/attribute&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ProductCharacteristic" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Type" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1,35}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Description" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1,70}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="AdditionalServicesInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Group" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="SubGroup" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RFISC_DefinedType" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodesetType" minOccurs="0"/&gt;
 *                   &lt;element name="ServiceType" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;pattern value="[0-9a-zA-Z]{1}"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExcessBaggage" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountOptType" minOccurs="0"/&gt;
 *                   &lt;element name="UnitOfMeasureCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
 *                   &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *                   &lt;element name="UnitOfMeasure" minOccurs="0"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ValidatingAirline" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}AirlineDesigSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}AlphaNumericStringLength1to71" minOccurs="0"/&gt;
 *         &lt;element name="AddlBaggageInfo" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}AddlBaggageInfoType" minOccurs="0"/&gt;
 *         &lt;element name="ResAirlineDesig" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}AirlineType" minOccurs="0"/&gt;
 *         &lt;element name="ResDateOfFlight" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ResDesigAirportCityCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;AirportCitySimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResFlightDepartureTime" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;TimeSimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResFlightNumber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;FlightNumberType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResOriginAirportCityCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;AirportCitySimpleType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ResBookDesign" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodesetValueSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="ResStatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConsumedAtIssuanceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponInfoType", propOrder = {
    "couponItinSequenceNbr",
    "couponNumber",
    "couponReference",
    "fareBasisCode",
    "couponMedia",
    "couponValid",
    "status",
    "involuntaryIndicatorCode",
    "settlementAuthCode",
    "assocFareBasis",
    "promoCode",
    "dateOfService",
    "serviceQuantity",
    "serviceReferences",
    "value",
    "soldAirlineInfo",
    "currentAirlineInfo",
    "checkedInAirlineInfo",
    "flownAirlineInfo",
    "inConnectionWithInfo",
    "presentInfo",
    "reasonForIssuance",
    "filedFeeInfo",
    "productCharacteristic",
    "additionalServicesInfo",
    "excessBaggage",
    "validatingAirline",
    "remark",
    "addlBaggageInfo",
    "resAirlineDesig",
    "resDateOfFlight",
    "resDesigAirportCityCode",
    "resFlightDepartureTime",
    "resFlightNumber",
    "resOriginAirportCityCode",
    "resBookDesign",
    "resStatusCode"
})
public class CouponInfoType {

    @XmlElement(name = "CouponItinSequenceNbr")
    protected Integer couponItinSequenceNbr;
    @XmlElement(name = "CouponNumber", required = true)
    protected BigInteger couponNumber;
    @XmlElement(name = "CouponReference")
    protected String couponReference;
    @XmlElement(name = "FareBasisCode")
    protected FareBasisCodeType fareBasisCode;
    @XmlElement(name = "CouponMedia")
    protected String couponMedia;
    @XmlElement(name = "CouponValid")
    protected CouponEffectiveType couponValid;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "InvoluntaryIndicatorCode")
    protected String involuntaryIndicatorCode;
    @XmlElement(name = "SettlementAuthCode")
    protected String settlementAuthCode;
    @XmlElement(name = "AssocFareBasis")
    protected String assocFareBasis;
    @XmlElement(name = "PromoCode")
    protected V172PromotionType promoCode;
    @XmlElement(name = "DateOfService")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dateOfService;
    @XmlElement(name = "ServiceQuantity")
    protected Integer serviceQuantity;
    @XmlElement(name = "ServiceReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> serviceReferences;
    @XmlElement(name = "Value")
    protected CurrencyAmountOptType value;
    @XmlElement(name = "SoldAirlineInfo")
    protected CouponInfoType.SoldAirlineInfo soldAirlineInfo;
    @XmlElement(name = "CurrentAirlineInfo")
    protected CouponSoldAirlineType currentAirlineInfo;
    @XmlElement(name = "CheckedInAirlineInfo")
    protected CouponSoldAirlineType checkedInAirlineInfo;
    @XmlElement(name = "FlownAirlineInfo")
    protected CouponSoldAirlineType flownAirlineInfo;
    @XmlElement(name = "InConnectionWithInfo")
    protected InConnectionWithType inConnectionWithInfo;
    @XmlElement(name = "PresentInfo")
    protected CouponInfoType.PresentInfo presentInfo;
    @XmlElement(name = "ReasonForIssuance")
    protected CouponInfoType.ReasonForIssuance reasonForIssuance;
    @XmlElement(name = "FiledFeeInfo")
    protected CouponInfoType.FiledFeeInfo filedFeeInfo;
    @XmlElement(name = "ProductCharacteristic")
    protected CouponInfoType.ProductCharacteristic productCharacteristic;
    @XmlElement(name = "AdditionalServicesInfo")
    protected CouponInfoType.AdditionalServicesInfo additionalServicesInfo;
    @XmlElement(name = "ExcessBaggage")
    protected CouponInfoType.ExcessBaggage excessBaggage;
    @XmlElement(name = "ValidatingAirline")
    protected String validatingAirline;
    @XmlElement(name = "Remark")
    protected String remark;
    @XmlElement(name = "AddlBaggageInfo")
    protected AddlBaggageInfoType addlBaggageInfo;
    @XmlElement(name = "ResAirlineDesig")
    protected String resAirlineDesig;
    @XmlElement(name = "ResDateOfFlight")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar resDateOfFlight;
    @XmlElement(name = "ResDesigAirportCityCode")
    protected CouponInfoType.ResDesigAirportCityCode resDesigAirportCityCode;
    @XmlElement(name = "ResFlightDepartureTime")
    protected CouponInfoType.ResFlightDepartureTime resFlightDepartureTime;
    @XmlElement(name = "ResFlightNumber")
    protected CouponInfoType.ResFlightNumber resFlightNumber;
    @XmlElement(name = "ResOriginAirportCityCode")
    protected CouponInfoType.ResOriginAirportCityCode resOriginAirportCityCode;
    @XmlElement(name = "ResBookDesign")
    protected String resBookDesign;
    @XmlElement(name = "ResStatusCode")
    protected String resStatusCode;
    @XmlAttribute(name = "ConsumedAtIssuanceInd")
    protected Boolean consumedAtIssuanceInd;

    /**
     * Gets the value of the couponItinSequenceNbr property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponItinSequenceNbr() {
        return couponItinSequenceNbr;
    }

    /**
     * Sets the value of the couponItinSequenceNbr property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponItinSequenceNbr(Integer value) {
        this.couponItinSequenceNbr = value;
    }

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCouponNumber(BigInteger value) {
        this.couponNumber = value;
    }

    /**
     * Gets the value of the couponReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponReference() {
        return couponReference;
    }

    /**
     * Sets the value of the couponReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponReference(String value) {
        this.couponReference = value;
    }

    /**
     * Gets the value of the fareBasisCode property.
     * 
     * @return
     *     possible object is
     *     {@link FareBasisCodeType }
     *     
     */
    public FareBasisCodeType getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * Sets the value of the fareBasisCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareBasisCodeType }
     *     
     */
    public void setFareBasisCode(FareBasisCodeType value) {
        this.fareBasisCode = value;
    }

    /**
     * Gets the value of the couponMedia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponMedia() {
        return couponMedia;
    }

    /**
     * Sets the value of the couponMedia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponMedia(String value) {
        this.couponMedia = value;
    }

    /**
     * Gets the value of the couponValid property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType }
     *     
     */
    public CouponEffectiveType getCouponValid() {
        return couponValid;
    }

    /**
     * Sets the value of the couponValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType }
     *     
     */
    public void setCouponValid(CouponEffectiveType value) {
        this.couponValid = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the involuntaryIndicatorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoluntaryIndicatorCode() {
        return involuntaryIndicatorCode;
    }

    /**
     * Sets the value of the involuntaryIndicatorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoluntaryIndicatorCode(String value) {
        this.involuntaryIndicatorCode = value;
    }

    /**
     * Gets the value of the settlementAuthCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementAuthCode() {
        return settlementAuthCode;
    }

    /**
     * Sets the value of the settlementAuthCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementAuthCode(String value) {
        this.settlementAuthCode = value;
    }

    /**
     * Gets the value of the assocFareBasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssocFareBasis() {
        return assocFareBasis;
    }

    /**
     * Sets the value of the assocFareBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssocFareBasis(String value) {
        this.assocFareBasis = value;
    }

    /**
     * Gets the value of the promoCode property.
     * 
     * @return
     *     possible object is
     *     {@link V172PromotionType }
     *     
     */
    public V172PromotionType getPromoCode() {
        return promoCode;
    }

    /**
     * Sets the value of the promoCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172PromotionType }
     *     
     */
    public void setPromoCode(V172PromotionType value) {
        this.promoCode = value;
    }

    /**
     * Gets the value of the dateOfService property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfService() {
        return dateOfService;
    }

    /**
     * Sets the value of the dateOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfService(XMLGregorianCalendar value) {
        this.dateOfService = value;
    }

    /**
     * Gets the value of the serviceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getServiceQuantity() {
        return serviceQuantity;
    }

    /**
     * Sets the value of the serviceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setServiceQuantity(Integer value) {
        this.serviceQuantity = value;
    }

    /**
     * Association to services paid by the EMD             Association to multiple Optional Service instance(s). Example: srvc1 srvc2 Gets the value of the serviceReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceReferences() {
        if (serviceReferences == null) {
            serviceReferences = new ArrayList<String>();
        }
        return this.serviceReferences;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setValue(CurrencyAmountOptType value) {
        this.value = value;
    }

    /**
     * Gets the value of the soldAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.SoldAirlineInfo }
     *     
     */
    public CouponInfoType.SoldAirlineInfo getSoldAirlineInfo() {
        return soldAirlineInfo;
    }

    /**
     * Sets the value of the soldAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.SoldAirlineInfo }
     *     
     */
    public void setSoldAirlineInfo(CouponInfoType.SoldAirlineInfo value) {
        this.soldAirlineInfo = value;
    }

    /**
     * Gets the value of the currentAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public CouponSoldAirlineType getCurrentAirlineInfo() {
        return currentAirlineInfo;
    }

    /**
     * Sets the value of the currentAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public void setCurrentAirlineInfo(CouponSoldAirlineType value) {
        this.currentAirlineInfo = value;
    }

    /**
     * Gets the value of the checkedInAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public CouponSoldAirlineType getCheckedInAirlineInfo() {
        return checkedInAirlineInfo;
    }

    /**
     * Sets the value of the checkedInAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public void setCheckedInAirlineInfo(CouponSoldAirlineType value) {
        this.checkedInAirlineInfo = value;
    }

    /**
     * Gets the value of the flownAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public CouponSoldAirlineType getFlownAirlineInfo() {
        return flownAirlineInfo;
    }

    /**
     * Sets the value of the flownAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponSoldAirlineType }
     *     
     */
    public void setFlownAirlineInfo(CouponSoldAirlineType value) {
        this.flownAirlineInfo = value;
    }

    /**
     * In connection with document number (A document number representing a transaction that is issued in relation to this transaction); and coupon number (the coupon number(s) associated with the 'in connection with' document number.)
     * 
     * @return
     *     possible object is
     *     {@link InConnectionWithType }
     *     
     */
    public InConnectionWithType getInConnectionWithInfo() {
        return inConnectionWithInfo;
    }

    /**
     * Sets the value of the inConnectionWithInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InConnectionWithType }
     *     
     */
    public void setInConnectionWithInfo(InConnectionWithType value) {
        this.inConnectionWithInfo = value;
    }

    /**
     * Gets the value of the presentInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.PresentInfo }
     *     
     */
    public CouponInfoType.PresentInfo getPresentInfo() {
        return presentInfo;
    }

    /**
     * Sets the value of the presentInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.PresentInfo }
     *     
     */
    public void setPresentInfo(CouponInfoType.PresentInfo value) {
        this.presentInfo = value;
    }

    /**
     * Gets the value of the reasonForIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ReasonForIssuance }
     *     
     */
    public CouponInfoType.ReasonForIssuance getReasonForIssuance() {
        return reasonForIssuance;
    }

    /**
     * Sets the value of the reasonForIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ReasonForIssuance }
     *     
     */
    public void setReasonForIssuance(CouponInfoType.ReasonForIssuance value) {
        this.reasonForIssuance = value;
    }

    /**
     * Gets the value of the filedFeeInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.FiledFeeInfo }
     *     
     */
    public CouponInfoType.FiledFeeInfo getFiledFeeInfo() {
        return filedFeeInfo;
    }

    /**
     * Sets the value of the filedFeeInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.FiledFeeInfo }
     *     
     */
    public void setFiledFeeInfo(CouponInfoType.FiledFeeInfo value) {
        this.filedFeeInfo = value;
    }

    /**
     * Gets the value of the productCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ProductCharacteristic }
     *     
     */
    public CouponInfoType.ProductCharacteristic getProductCharacteristic() {
        return productCharacteristic;
    }

    /**
     * Sets the value of the productCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ProductCharacteristic }
     *     
     */
    public void setProductCharacteristic(CouponInfoType.ProductCharacteristic value) {
        this.productCharacteristic = value;
    }

    /**
     * Gets the value of the additionalServicesInfo property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.AdditionalServicesInfo }
     *     
     */
    public CouponInfoType.AdditionalServicesInfo getAdditionalServicesInfo() {
        return additionalServicesInfo;
    }

    /**
     * Sets the value of the additionalServicesInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.AdditionalServicesInfo }
     *     
     */
    public void setAdditionalServicesInfo(CouponInfoType.AdditionalServicesInfo value) {
        this.additionalServicesInfo = value;
    }

    /**
     * Gets the value of the excessBaggage property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ExcessBaggage }
     *     
     */
    public CouponInfoType.ExcessBaggage getExcessBaggage() {
        return excessBaggage;
    }

    /**
     * Sets the value of the excessBaggage property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ExcessBaggage }
     *     
     */
    public void setExcessBaggage(CouponInfoType.ExcessBaggage value) {
        this.excessBaggage = value;
    }

    /**
     * Gets the value of the validatingAirline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingAirline() {
        return validatingAirline;
    }

    /**
     * Sets the value of the validatingAirline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingAirline(String value) {
        this.validatingAirline = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the addlBaggageInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public AddlBaggageInfoType getAddlBaggageInfo() {
        return addlBaggageInfo;
    }

    /**
     * Sets the value of the addlBaggageInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBaggageInfoType }
     *     
     */
    public void setAddlBaggageInfo(AddlBaggageInfoType value) {
        this.addlBaggageInfo = value;
    }

    /**
     * Gets the value of the resAirlineDesig property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResAirlineDesig() {
        return resAirlineDesig;
    }

    /**
     * Sets the value of the resAirlineDesig property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResAirlineDesig(String value) {
        this.resAirlineDesig = value;
    }

    /**
     * Gets the value of the resDateOfFlight property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResDateOfFlight() {
        return resDateOfFlight;
    }

    /**
     * Sets the value of the resDateOfFlight property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResDateOfFlight(XMLGregorianCalendar value) {
        this.resDateOfFlight = value;
    }

    /**
     * Gets the value of the resDesigAirportCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ResDesigAirportCityCode }
     *     
     */
    public CouponInfoType.ResDesigAirportCityCode getResDesigAirportCityCode() {
        return resDesigAirportCityCode;
    }

    /**
     * Sets the value of the resDesigAirportCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ResDesigAirportCityCode }
     *     
     */
    public void setResDesigAirportCityCode(CouponInfoType.ResDesigAirportCityCode value) {
        this.resDesigAirportCityCode = value;
    }

    /**
     * Gets the value of the resFlightDepartureTime property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ResFlightDepartureTime }
     *     
     */
    public CouponInfoType.ResFlightDepartureTime getResFlightDepartureTime() {
        return resFlightDepartureTime;
    }

    /**
     * Sets the value of the resFlightDepartureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ResFlightDepartureTime }
     *     
     */
    public void setResFlightDepartureTime(CouponInfoType.ResFlightDepartureTime value) {
        this.resFlightDepartureTime = value;
    }

    /**
     * Gets the value of the resFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ResFlightNumber }
     *     
     */
    public CouponInfoType.ResFlightNumber getResFlightNumber() {
        return resFlightNumber;
    }

    /**
     * Sets the value of the resFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ResFlightNumber }
     *     
     */
    public void setResFlightNumber(CouponInfoType.ResFlightNumber value) {
        this.resFlightNumber = value;
    }

    /**
     * Gets the value of the resOriginAirportCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CouponInfoType.ResOriginAirportCityCode }
     *     
     */
    public CouponInfoType.ResOriginAirportCityCode getResOriginAirportCityCode() {
        return resOriginAirportCityCode;
    }

    /**
     * Sets the value of the resOriginAirportCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponInfoType.ResOriginAirportCityCode }
     *     
     */
    public void setResOriginAirportCityCode(CouponInfoType.ResOriginAirportCityCode value) {
        this.resOriginAirportCityCode = value;
    }

    /**
     * Gets the value of the resBookDesign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResBookDesign() {
        return resBookDesign;
    }

    /**
     * Sets the value of the resBookDesign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResBookDesign(String value) {
        this.resBookDesign = value;
    }

    /**
     * Gets the value of the resStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatusCode() {
        return resStatusCode;
    }

    /**
     * Sets the value of the resStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatusCode(String value) {
        this.resStatusCode = value;
    }

    /**
     * Gets the value of the consumedAtIssuanceInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConsumedAtIssuanceInd() {
        return consumedAtIssuanceInd;
    }

    /**
     * Sets the value of the consumedAtIssuanceInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConsumedAtIssuanceInd(Boolean value) {
        this.consumedAtIssuanceInd = value;
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
     *         &lt;element name="Group" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="SubGroup" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RFISC_DefinedType" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodesetType" minOccurs="0"/&gt;
     *         &lt;element name="ServiceType" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1}"/&gt;
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
        "group",
        "subGroup",
        "rfiscDefinedType",
        "serviceType"
    })
    public static class AdditionalServicesInfo {

        @XmlElement(name = "Group")
        protected String group;
        @XmlElement(name = "SubGroup")
        protected String subGroup;
        @XmlElement(name = "RFISC_DefinedType")
        protected CodesetType rfiscDefinedType;
        @XmlElement(name = "ServiceType")
        protected String serviceType;

        /**
         * Gets the value of the group property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroup() {
            return group;
        }

        /**
         * Sets the value of the group property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroup(String value) {
            this.group = value;
        }

        /**
         * Gets the value of the subGroup property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubGroup() {
            return subGroup;
        }

        /**
         * Sets the value of the subGroup property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubGroup(String value) {
            this.subGroup = value;
        }

        /**
         * Gets the value of the rfiscDefinedType property.
         * 
         * @return
         *     possible object is
         *     {@link CodesetType }
         *     
         */
        public CodesetType getRFISCDefinedType() {
            return rfiscDefinedType;
        }

        /**
         * Sets the value of the rfiscDefinedType property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodesetType }
         *     
         */
        public void setRFISCDefinedType(CodesetType value) {
            this.rfiscDefinedType = value;
        }

        /**
         * Gets the value of the serviceType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceType() {
            return serviceType;
        }

        /**
         * Sets the value of the serviceType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceType(String value) {
            this.serviceType = value;
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
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountOptType" minOccurs="0"/&gt;
     *         &lt;element name="UnitOfMeasureCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
     *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
     *         &lt;element name="UnitOfMeasure" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="16"/&gt;
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
        "amount",
        "unitOfMeasureCode",
        "quantity",
        "unitOfMeasure"
    })
    public static class ExcessBaggage {

        @XmlElement(name = "Amount")
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;
        @XmlElement(name = "Quantity")
        protected BigDecimal quantity;
        @XmlElement(name = "UnitOfMeasure")
        protected String unitOfMeasure;

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
         * Gets the value of the unitOfMeasureCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * Sets the value of the unitOfMeasureCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

        /**
         * Gets the value of the quantity property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getQuantity() {
            return quantity;
        }

        /**
         * Sets the value of the quantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setQuantity(BigDecimal value) {
            this.quantity = value;
        }

        /**
         * Gets the value of the unitOfMeasure property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * Sets the value of the unitOfMeasure property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
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
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrencyAmountOptType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="BSR_Rate"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
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
    public static class FiledFeeInfo {

        @XmlElement(name = "Amount")
        protected CurrencyAmountOptType amount;
        @XmlAttribute(name = "BSR_Rate")
        protected BigDecimal bsrRate;

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
         * Gets the value of the bsrRate property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBSRRate() {
            return bsrRate;
        }

        /**
         * Sets the value of the bsrRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBSRRate(BigDecimal value) {
            this.bsrRate = value;
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
     *       &lt;attribute name="To"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;pattern value="[0-9a-zA-Z]{1,45}"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *       &lt;attribute name="At"&gt;
     *         &lt;simpleType&gt;
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *             &lt;pattern value="[0-9a-zA-Z]{1,43}"/&gt;
     *           &lt;/restriction&gt;
     *         &lt;/simpleType&gt;
     *       &lt;/attribute&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PresentInfo {

        @XmlAttribute(name = "To")
        protected String to;
        @XmlAttribute(name = "At")
        protected String at;

        /**
         * Gets the value of the to property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTo() {
            return to;
        }

        /**
         * Sets the value of the to property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTo(String value) {
            this.to = value;
        }

        /**
         * Gets the value of the at property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAt() {
            return at;
        }

        /**
         * Sets the value of the at property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAt(String value) {
            this.at = value;
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
     *         &lt;element name="Type" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1,35}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1,70}"/&gt;
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
        "type",
        "description"
    })
    public static class ProductCharacteristic {

        @XmlElement(name = "Type")
        protected String type;
        @XmlElement(name = "Description")
        protected String description;

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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}RFIC" minOccurs="0"/&gt;
     *         &lt;element name="Code" minOccurs="0"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ShortDescSimpleType" minOccurs="0"/&gt;
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
        "rfic",
        "code",
        "description"
    })
    public static class ReasonForIssuance {

        @XmlElement(name = "RFIC")
        protected String rfic;
        @XmlElement(name = "Code")
        protected String code;
        @XmlElement(name = "Description")
        protected String description;

        /**
         * Gets the value of the rfic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRFIC() {
            return rfic;
        }

        /**
         * Sets the value of the rfic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRFIC(String value) {
            this.rfic = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
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

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;AirportCitySimpleType"&gt;
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
    public static class ResDesigAirportCityCode {

        @XmlValue
        protected String value;

        /**
         * Examples: JFK, NYC
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;TimeSimpleType"&gt;
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
    public static class ResFlightDepartureTime {

        @XmlValue
        protected String value;

        /**
         * A data type for Time encoding constraint: SO 8601 Military/ 24 Hour (HH:MM)
         * Example: 14:00
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;FlightNumberType"&gt;
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
    public static class ResFlightNumber {

        @XmlValue
        protected String value;

        /**
         * Identifies a flight number (1 to 4 numbers) or OPEN or ARNK.
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;AirportCitySimpleType"&gt;
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
    public static class ResOriginAirportCityCode {

        @XmlValue
        protected String value;

        /**
         * Examples: JFK, NYC
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
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CouponSoldAirlineType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class SoldAirlineInfo
        extends CouponSoldAirlineType
    {


    }

}
