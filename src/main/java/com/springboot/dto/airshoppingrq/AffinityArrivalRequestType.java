
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Arrival information for affinity shopping requests.
 * 
 * <p>Java class for AffinityArrivalRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityArrivalRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Date" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TimeType" minOccurs="0"/&gt;
 *         &lt;element name="ProximityDistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Station" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}StationType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySub-Division" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CountrySubDivisionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityArrivalRequestType", propOrder = {
    "date",
    "time",
    "proximityDistanceMeasure",
    "station",
    "country",
    "countrySubDivision"
})
public class AffinityArrivalRequestType {

    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlElement(name = "ProximityDistanceMeasure")
    protected MeasureType proximityDistanceMeasure;
    @XmlElement(name = "Station")
    protected StationType station;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "CountrySub-Division")
    protected CountrySubDivisionType countrySubDivision;

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
     * Gets the value of the proximityDistanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getProximityDistanceMeasure() {
        return proximityDistanceMeasure;
    }

    /**
     * Sets the value of the proximityDistanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setProximityDistanceMeasure(MeasureType value) {
        this.proximityDistanceMeasure = value;
    }

    /**
     * Gets the value of the station property.
     * 
     * @return
     *     possible object is
     *     {@link StationType }
     *     
     */
    public StationType getStation() {
        return station;
    }

    /**
     * Sets the value of the station property.
     * 
     * @param value
     *     allowed object is
     *     {@link StationType }
     *     
     */
    public void setStation(StationType value) {
        this.station = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public CountrySubDivisionType getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * Sets the value of the countrySubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public void setCountrySubDivision(CountrySubDivisionType value) {
        this.countrySubDivision = value;
    }

}
