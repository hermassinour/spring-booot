
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * The nonstop operation of a transport vehicle between the departure station and the arrival station. Can be used for aircrafts as well as other transport vehicles such as train or bus etc.
 * 
 * <p>Java class for DatedOperatingLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DatedOperatingLegType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatedOperatingLegID" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type"/&gt;
 *         &lt;element name="CarrierAircraftType" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CarrierAircraftTypeType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeofGaugeInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Dep" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TransportDepType"/&gt;
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TransportArrivalType"/&gt;
 *         &lt;element name="IATA_AircraftType" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IATA_AircraftTypeType" minOccurs="0"/&gt;
 *         &lt;element name="OnGroundTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatedOperatingLegType", propOrder = {
    "datedOperatingLegID",
    "carrierAircraftType",
    "changeofGaugeInd",
    "distanceMeasure",
    "dep",
    "arrival",
    "iataAircraftType",
    "onGroundTime"
})
public class DatedOperatingLegType {

    @XmlElement(name = "DatedOperatingLegID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String datedOperatingLegID;
    @XmlElement(name = "CarrierAircraftType")
    protected CarrierAircraftTypeType carrierAircraftType;
    @XmlElement(name = "ChangeofGaugeInd")
    protected Boolean changeofGaugeInd;
    @XmlElement(name = "DistanceMeasure")
    protected MeasureType distanceMeasure;
    @XmlElement(name = "Dep", required = true)
    protected TransportDepType dep;
    @XmlElement(name = "Arrival", required = true)
    protected TransportArrivalType arrival;
    @XmlElement(name = "IATA_AircraftType")
    protected IATAAircraftTypeType iataAircraftType;
    @XmlElement(name = "OnGroundTime")
    protected Duration onGroundTime;

    /**
     * Gets the value of the datedOperatingLegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatedOperatingLegID() {
        return datedOperatingLegID;
    }

    /**
     * Sets the value of the datedOperatingLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatedOperatingLegID(String value) {
        this.datedOperatingLegID = value;
    }

    /**
     * Gets the value of the carrierAircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierAircraftTypeType }
     *     
     */
    public CarrierAircraftTypeType getCarrierAircraftType() {
        return carrierAircraftType;
    }

    /**
     * Sets the value of the carrierAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierAircraftTypeType }
     *     
     */
    public void setCarrierAircraftType(CarrierAircraftTypeType value) {
        this.carrierAircraftType = value;
    }

    /**
     * Gets the value of the changeofGaugeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeofGaugeInd() {
        return changeofGaugeInd;
    }

    /**
     * Sets the value of the changeofGaugeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeofGaugeInd(Boolean value) {
        this.changeofGaugeInd = value;
    }

    /**
     * Gets the value of the distanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistanceMeasure() {
        return distanceMeasure;
    }

    /**
     * Sets the value of the distanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDistanceMeasure(MeasureType value) {
        this.distanceMeasure = value;
    }

    /**
     * Gets the value of the dep property.
     * 
     * @return
     *     possible object is
     *     {@link TransportDepType }
     *     
     */
    public TransportDepType getDep() {
        return dep;
    }

    /**
     * Sets the value of the dep property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportDepType }
     *     
     */
    public void setDep(TransportDepType value) {
        this.dep = value;
    }

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link TransportArrivalType }
     *     
     */
    public TransportArrivalType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportArrivalType }
     *     
     */
    public void setArrival(TransportArrivalType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the iataAircraftType property.
     * 
     * @return
     *     possible object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    public IATAAircraftTypeType getIATAAircraftType() {
        return iataAircraftType;
    }

    /**
     * Sets the value of the iataAircraftType property.
     * 
     * @param value
     *     allowed object is
     *     {@link IATAAircraftTypeType }
     *     
     */
    public void setIATAAircraftType(IATAAircraftTypeType value) {
        this.iataAircraftType = value;
    }

    /**
     * Gets the value of the onGroundTime property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOnGroundTime() {
        return onGroundTime;
    }

    /**
     * Sets the value of the onGroundTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOnGroundTime(Duration value) {
        this.onGroundTime = value;
    }

}
