
package com.springboot.dto.orderreshoprq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Requests the airline to additionally include a preview of the Offer price for the same Shopping Criteria for the specified date range.
 * 
 * <p>Java class for CalendarDateRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalendarDateRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DaysBeforeNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="DaysAfterNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}NumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalendarDateRequestType", propOrder = {
    "daysBeforeNumber",
    "daysAfterNumber"
})
public class CalendarDateRequestType {

    @XmlElement(name = "DaysBeforeNumber")
    protected BigDecimal daysBeforeNumber;
    @XmlElement(name = "DaysAfterNumber")
    protected BigDecimal daysAfterNumber;

    /**
     * Gets the value of the daysBeforeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysBeforeNumber() {
        return daysBeforeNumber;
    }

    /**
     * Sets the value of the daysBeforeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysBeforeNumber(BigDecimal value) {
        this.daysBeforeNumber = value;
    }

    /**
     * Gets the value of the daysAfterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDaysAfterNumber() {
        return daysAfterNumber;
    }

    /**
     * Sets the value of the daysAfterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDaysAfterNumber(BigDecimal value) {
        this.daysAfterNumber = value;
    }

}
