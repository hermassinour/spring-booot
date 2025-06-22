
package com.springboot.dto.seatavailabilityrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ORIGIN/ DESTINATION definition.
 * 
 * <p>Java class for OriginDestinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestinationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}DepartureCode"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ArrivalCode"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="OriginDestinationKey" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}KeyIdentifier" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestinationType", propOrder = {
    "departureCode",
    "arrivalCode"
})
@XmlSeeAlso({
    OriginDestination.class
})
public class OriginDestinationType {

    @XmlElement(name = "DepartureCode", required = true)
    protected DepartureCode departureCode;
    @XmlElement(name = "ArrivalCode", required = true)
    protected ArrivalCode arrivalCode;
    @XmlAttribute(name = "OriginDestinationKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String originDestinationKey;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Departure Airport Location code. Example: TPA
     * 
     * Encoding Scheme: IATA/ A4A (three character) Airport or City Code
     * 
     * @return
     *     possible object is
     *     {@link DepartureCode }
     *     
     */
    public DepartureCode getDepartureCode() {
        return departureCode;
    }

    /**
     * Sets the value of the departureCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureCode }
     *     
     */
    public void setDepartureCode(DepartureCode value) {
        this.departureCode = value;
    }

    /**
     * Airport or a city code. Use a three letter  location identifier assigned according to the IATA Resolution 763.  Refer to IATA Airline Coding Directory . Example: TPA
     * 
     * @return
     *     possible object is
     *     {@link ArrivalCode }
     *     
     */
    public ArrivalCode getArrivalCode() {
        return arrivalCode;
    }

    /**
     * Sets the value of the arrivalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalCode }
     *     
     */
    public void setArrivalCode(ArrivalCode value) {
        this.arrivalCode = value;
    }

    /**
     * Gets the value of the originDestinationKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationKey() {
        return originDestinationKey;
    }

    /**
     * Sets the value of the originDestinationKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationKey(String value) {
        this.originDestinationKey = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

}
