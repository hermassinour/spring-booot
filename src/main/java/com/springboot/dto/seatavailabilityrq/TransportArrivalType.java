
package com.springboot.dto.seatavailabilityrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The action or process of arriving of a transport vehicle in any place or location.
 * 
 * <p>Java class for TransportArrivalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransportArrivalType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}BoardingGateID_Type" minOccurs="0"/&gt;
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}IATA_LocationCodeType" minOccurs="0"/&gt;
 *         &lt;element name="StationName" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="AircraftScheduledDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}DateTimeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransportArrivalType", propOrder = {
    "boardingGateID",
    "iataLocationCode",
    "stationName",
    "terminalName",
    "aircraftScheduledDateTime"
})
public class TransportArrivalType {

    @XmlElement(name = "BoardingGateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;
    @XmlElement(name = "IATA_LocationCode")
    protected String iataLocationCode;
    @XmlElement(name = "StationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stationName;
    @XmlElement(name = "TerminalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalName;
    @XmlElement(name = "AircraftScheduledDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar aircraftScheduledDateTime;

    /**
     * Gets the value of the boardingGateID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardingGateID(String value) {
        this.boardingGateID = value;
    }

    /**
     * Gets the value of the iataLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATALocationCode() {
        return iataLocationCode;
    }

    /**
     * Sets the value of the iataLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATALocationCode(String value) {
        this.iataLocationCode = value;
    }

    /**
     * Gets the value of the stationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStationName() {
        return stationName;
    }

    /**
     * Sets the value of the stationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStationName(String value) {
        this.stationName = value;
    }

    /**
     * Gets the value of the terminalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalName() {
        return terminalName;
    }

    /**
     * Sets the value of the terminalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalName(String value) {
        this.terminalName = value;
    }

    /**
     * Gets the value of the aircraftScheduledDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAircraftScheduledDateTime() {
        return aircraftScheduledDateTime;
    }

    /**
     * Sets the value of the aircraftScheduledDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAircraftScheduledDateTime(XMLGregorianCalendar value) {
        this.aircraftScheduledDateTime = value;
    }

}
