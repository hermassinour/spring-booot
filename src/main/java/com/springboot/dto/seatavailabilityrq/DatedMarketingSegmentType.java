
package com.springboot.dto.seatavailabilityrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The commercial designation under which a Dated Operating Segment can be booked, either under the operating carrier's designator or that of another carrier (codeshare).
 * 
 * <p>Java class for DatedMarketingSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedMarketingSegmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}AirlineDesigCodeType"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="MarketingCarrierFlightNumberText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}FlightNumberTextType"/&gt;
 *         &lt;element name="OperationalSuffixText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}OperationalSuffixTextType" minOccurs="0"/&gt;
 *         &lt;element name="RBD_Code" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}RBD_CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedMarketingSegmentType", propOrder = {
    "carrierDesigCode",
    "carrierName",
    "marketingCarrierFlightNumberText",
    "operationalSuffixText",
    "rbdCode"
})
public class DatedMarketingSegmentType {

    @XmlElement(name = "CarrierDesigCode", required = true)
    protected String carrierDesigCode;
    @XmlElement(name = "CarrierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;
    @XmlElement(name = "MarketingCarrierFlightNumberText", required = true)
    protected String marketingCarrierFlightNumberText;
    @XmlElement(name = "OperationalSuffixText")
    protected String operationalSuffixText;
    @XmlElement(name = "RBD_Code")
    protected String rbdCode;

    /**
     * Gets the value of the carrierDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDesigCode() {
        return carrierDesigCode;
    }

    /**
     * Sets the value of the carrierDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierDesigCode(String value) {
        this.carrierDesigCode = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the marketingCarrierFlightNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrierFlightNumberText() {
        return marketingCarrierFlightNumberText;
    }

    /**
     * Sets the value of the marketingCarrierFlightNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrierFlightNumberText(String value) {
        this.marketingCarrierFlightNumberText = value;
    }

    /**
     * Gets the value of the operationalSuffixText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationalSuffixText() {
        return operationalSuffixText;
    }

    /**
     * Sets the value of the operationalSuffixText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationalSuffixText(String value) {
        this.operationalSuffixText = value;
    }

    /**
     * Gets the value of the rbdCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBDCode() {
        return rbdCode;
    }

    /**
     * Sets the value of the rbdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBDCode(String value) {
        this.rbdCode = value;
    }

}
