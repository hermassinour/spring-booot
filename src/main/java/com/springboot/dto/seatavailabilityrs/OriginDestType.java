
package com.springboot.dto.seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Origin and Destination airport/city pair which confines a passenger journey or an aircraft flight.
 * 
 * <p>Java class for OriginDestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ArrivalStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_LocationCodeType"/&gt;
 *         &lt;element name="DepStationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IATA_LocationCodeType"/&gt;
 *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestType", propOrder = {
    "originDestID",
    "arrivalStationCode",
    "depStationCode",
    "paxJourneyRefID"
})
public class OriginDestType {

    @XmlElement(name = "OriginDestID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    @XmlElement(name = "ArrivalStationCode", required = true)
    protected String arrivalStationCode;
    @XmlElement(name = "DepStationCode", required = true)
    protected String depStationCode;
    @XmlElement(name = "PaxJourneyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxJourneyRefID;

    /**
     * Gets the value of the originDestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestID() {
        return originDestID;
    }

    /**
     * Sets the value of the originDestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestID(String value) {
        this.originDestID = value;
    }

    /**
     * Gets the value of the arrivalStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrivalStationCode() {
        return arrivalStationCode;
    }

    /**
     * Sets the value of the arrivalStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrivalStationCode(String value) {
        this.arrivalStationCode = value;
    }

    /**
     * Gets the value of the depStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepStationCode() {
        return depStationCode;
    }

    /**
     * Sets the value of the depStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepStationCode(String value) {
        this.depStationCode = value;
    }

    /**
     * Gets the value of the paxJourneyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxJourneyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxJourneyRefID() {
        if (paxJourneyRefID == null) {
            paxJourneyRefID = new ArrayList<String>();
        }
        return this.paxJourneyRefID;
    }

}
