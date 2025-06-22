
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A Customer's requested Destination arrival time and location.
 * 
 * <p>Java class for DestArrivalRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DestArrivalRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IATA_LocationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IATA_LocationCodeType"/&gt;
 *         &lt;element name="Date" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="TimeBeforeMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="TimeAfterMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="StationName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}StationNameType" minOccurs="0"/&gt;
 *         &lt;element name="TerminalName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestArrivalRequestType", propOrder = {
    "iataLocationCode",
    "date",
    "time",
    "timeBeforeMeasure",
    "timeAfterMeasure",
    "stationName",
    "terminalName",
    "boardingGateID"
})
public class DestArrivalRequestType {

    @XmlElement(name = "IATA_LocationCode", required = true)
    protected String iataLocationCode;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "TimeBeforeMeasure")
    protected MeasureType timeBeforeMeasure;
    @XmlElement(name = "TimeAfterMeasure")
    protected MeasureType timeAfterMeasure;
    @XmlElement(name = "StationName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String stationName;
    @XmlElement(name = "TerminalName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalName;
    @XmlElement(name = "BoardingGateID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String boardingGateID;

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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
    }

    /**
     * Gets the value of the timeBeforeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeBeforeMeasure() {
        return timeBeforeMeasure;
    }

    /**
     * Sets the value of the timeBeforeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTimeBeforeMeasure(MeasureType value) {
        this.timeBeforeMeasure = value;
    }

    /**
     * Gets the value of the timeAfterMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getTimeAfterMeasure() {
        return timeAfterMeasure;
    }

    /**
     * Sets the value of the timeAfterMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setTimeAfterMeasure(MeasureType value) {
        this.timeAfterMeasure = value;
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

}
