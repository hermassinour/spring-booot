
package com.springboot.dto.servicelistrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Flight preferences including aircraft features, Cabin Type, RBD, and Tail Number.
 * 
 * <p>Java class for FlightCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Aircraft" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}AircraftType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Cabin" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FlightCharacteristicsCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}FlightCharacteristicsCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IATA_Aircraft" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}IATA_AircraftTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RBD" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}RBD_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaitListCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}PrefLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCriteriaType", propOrder = {
    "aircraft",
    "cabin",
    "flightCharacteristicsCriteria",
    "iataAircraft",
    "rbd",
    "waitListCriteria"
})
public class FlightCriteriaType {

    @XmlElement(name = "Aircraft")
    protected List<AircraftType> aircraft;
    @XmlElement(name = "Cabin")
    protected List<CabinTypeType> cabin;
    @XmlElement(name = "FlightCharacteristicsCriteria")
    protected List<FlightCharacteristicsCriteriaType> flightCharacteristicsCriteria;
    @XmlElement(name = "IATA_Aircraft")
    protected List<IATAAircraftTypeType> iataAircraft;
    @XmlElement(name = "RBD")
    protected List<RBDType> rbd;
    @XmlElement(name = "WaitListCriteria")
    protected PrefLevelType waitListCriteria;

    /**
     * Gets the value of the aircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftType }
     * 
     * 
     */
    public List<AircraftType> getAircraft() {
        if (aircraft == null) {
            aircraft = new ArrayList<AircraftType>();
        }
        return this.aircraft;
    }

    /**
     * Gets the value of the cabin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getCabin() {
        if (cabin == null) {
            cabin = new ArrayList<CabinTypeType>();
        }
        return this.cabin;
    }

    /**
     * Gets the value of the flightCharacteristicsCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightCharacteristicsCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightCharacteristicsCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightCharacteristicsCriteriaType }
     * 
     * 
     */
    public List<FlightCharacteristicsCriteriaType> getFlightCharacteristicsCriteria() {
        if (flightCharacteristicsCriteria == null) {
            flightCharacteristicsCriteria = new ArrayList<FlightCharacteristicsCriteriaType>();
        }
        return this.flightCharacteristicsCriteria;
    }

    /**
     * Gets the value of the iataAircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the iataAircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIATAAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IATAAircraftTypeType }
     * 
     * 
     */
    public List<IATAAircraftTypeType> getIATAAircraft() {
        if (iataAircraft == null) {
            iataAircraft = new ArrayList<IATAAircraftTypeType>();
        }
        return this.iataAircraft;
    }

    /**
     * Gets the value of the rbd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rbd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRBD().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RBDType }
     * 
     * 
     */
    public List<RBDType> getRBD() {
        if (rbd == null) {
            rbd = new ArrayList<RBDType>();
        }
        return this.rbd;
    }

    /**
     * Gets the value of the waitListCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getWaitListCriteria() {
        return waitListCriteria;
    }

    /**
     * Sets the value of the waitListCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setWaitListCriteria(PrefLevelType value) {
        this.waitListCriteria = value;
    }

}
