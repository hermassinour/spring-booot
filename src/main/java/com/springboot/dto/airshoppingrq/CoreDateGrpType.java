
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type definition for Commonly Used Date Representation Formats: Short Date, Date and Time, Timestamp
 * 
 * <p>Java class for CoreDateGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreDateGrpType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="ShortDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="Time" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TimeSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreDateGrpType")
@XmlSeeAlso({
    com.springboot.dto.airshoppingrq.ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start.class,
    com.springboot.dto.airshoppingrq.ServiceQualifierPriceType.Fulfillment.OfferValidDates.End.class,
    com.springboot.dto.airshoppingrq.InvGuaranteeType.InvGuaranteeTimeLimit.class,
    com.springboot.dto.airshoppingrq.TimeLimits.PaymentTimeLimit.class,
    com.springboot.dto.airshoppingrq.ServiceFulfillmentType.OfferValidDates.Start.class,
    com.springboot.dto.airshoppingrq.ServiceFulfillmentType.OfferValidDates.End.class,
    com.springboot.dto.airshoppingrq.FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start.class,
    com.springboot.dto.airshoppingrq.FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End.class,
    com.springboot.dto.airshoppingrq.OfferIncentiveType.Incentive.ExpirationDate.class,
    com.springboot.dto.airshoppingrq.OfferValidPeriodType.Earliest.class,
    com.springboot.dto.airshoppingrq.OfferValidPeriodType.Latest.class,
    com.springboot.dto.airshoppingrq.OfferTimeLimitSetType.OfferExpiration.class,
    com.springboot.dto.airshoppingrq.V172OrderType.TimeLimits.PaymentTimeLimit.class,
    com.springboot.dto.airshoppingrq.CouponSoldAirlineType.DepartureDateTime.class,
    com.springboot.dto.airshoppingrq.CouponSoldAirlineType.ArrivalDateTime.class,
    com.springboot.dto.airshoppingrq.CouponFlightSegmentType.DepartureDateTime.class,
    InventoryGuaranteeTimeLimits.class
})
public class CoreDateGrpType {

    @XmlAttribute(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "ShortDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shortDate;
    @XmlAttribute(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "Time")
    protected String time;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the shortDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShortDate() {
        return shortDate;
    }

    /**
     * Sets the value of the shortDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShortDate(XMLGregorianCalendar value) {
        this.shortDate = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}
