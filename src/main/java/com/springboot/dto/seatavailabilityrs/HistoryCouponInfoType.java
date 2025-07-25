
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * COUPON definition.
 * 
 * <p>Java class for HistoryCouponInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HistoryCouponInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CouponNumber" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *               &lt;maxInclusive value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PrevStatus" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="SettlementAuthCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="TransactionTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="SoldAirlineInfo" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CouponSoldAirlineType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CurrentAirlineInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CheckedInAirlineInfo" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}Party"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HistoryCouponInfoType", propOrder = {
    "couponNumber",
    "status",
    "prevStatus",
    "settlementAuthCode",
    "transactionTimeStamp",
    "soldAirlineInfo",
    "currentAirlineInfo",
    "checkedInAirlineInfo",
    "party"
})
public class HistoryCouponInfoType {

    @XmlElement(name = "CouponNumber")
    protected Integer couponNumber;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "PrevStatus")
    protected String prevStatus;
    @XmlElement(name = "SettlementAuthCode")
    protected String settlementAuthCode;
    @XmlElement(name = "TransactionTimeStamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionTimeStamp;
    @XmlElement(name = "SoldAirlineInfo")
    protected HistoryCouponInfoType.SoldAirlineInfo soldAirlineInfo;
    @XmlElement(name = "CurrentAirlineInfo")
    protected CouponSoldAirlineType currentAirlineInfo;
    @XmlElement(name = "CheckedInAirlineInfo")
    protected CouponSoldAirlineType checkedInAirlineInfo;
    @XmlElement(name = "Party", required = true)
    protected MsgPartiesType party;

    /**
     * Gets the value of the couponNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCouponNumber() {
        return couponNumber;
    }

    /**
     * Sets the value of the couponNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCouponNumber(Integer value) {
        this.couponNumber = value;
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
     * Gets the value of the prevStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrevStatus() {
        return prevStatus;
    }

    /**
     * Sets the value of the prevStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrevStatus(String value) {
        this.prevStatus = value;
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
     * Gets the value of the transactionTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionTimeStamp() {
        return transactionTimeStamp;
    }

    /**
     * Sets the value of the transactionTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionTimeStamp(XMLGregorianCalendar value) {
        this.transactionTimeStamp = value;
    }

    /**
     * Gets the value of the soldAirlineInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HistoryCouponInfoType.SoldAirlineInfo }
     *     
     */
    public HistoryCouponInfoType.SoldAirlineInfo getSoldAirlineInfo() {
        return soldAirlineInfo;
    }

    /**
     * Sets the value of the soldAirlineInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HistoryCouponInfoType.SoldAirlineInfo }
     *     
     */
    public void setSoldAirlineInfo(HistoryCouponInfoType.SoldAirlineInfo value) {
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
     * Gets the value of the party property.
     * 
     * @return
     *     possible object is
     *     {@link MsgPartiesType }
     *     
     */
    public MsgPartiesType getParty() {
        return party;
    }

    /**
     * Sets the value of the party property.
     * 
     * @param value
     *     allowed object is
     *     {@link MsgPartiesType }
     *     
     */
    public void setParty(MsgPartiesType value) {
        this.party = value;
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
