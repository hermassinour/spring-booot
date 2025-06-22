
package com.springboot.dto.airshoppingrq;

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
 *         &lt;element name="OriginDestID" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionCriteriaRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="CalendarDateRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CalendarDateRequestType" minOccurs="0"/&gt;
 *         &lt;element name="DestArrivalRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DestArrivalRequestType"/&gt;
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}JourneyDurationCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="OriginDepRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OriginDepRequestType"/&gt;
 *         &lt;element name="PreferredCabinType" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CabinTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "connectionCriteriaRefID",
    "calendarDateRequest",
    "destArrivalRequest",
    "journeyDurationCriteria",
    "originDepRequest",
    "preferredCabinType"
})
public class OriginDestType {

    @XmlElement(name = "OriginDestID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String originDestID;
    @XmlElement(name = "ConnectionCriteriaRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionCriteriaRefID;
    @XmlElement(name = "CalendarDateRequest")
    protected CalendarDateRequestType calendarDateRequest;
    @XmlElement(name = "DestArrivalRequest", required = true)
    protected DestArrivalRequestType destArrivalRequest;
    @XmlElement(name = "JourneyDurationCriteria")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    @XmlElement(name = "OriginDepRequest", required = true)
    protected OriginDepRequestType originDepRequest;
    @XmlElement(name = "PreferredCabinType")
    protected List<CabinTypeType> preferredCabinType;

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
     * Gets the value of the connectionCriteriaRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCriteriaRefID() {
        return connectionCriteriaRefID;
    }

    /**
     * Sets the value of the connectionCriteriaRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCriteriaRefID(String value) {
        this.connectionCriteriaRefID = value;
    }

    /**
     * Gets the value of the calendarDateRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarDateRequestType }
     *     
     */
    public CalendarDateRequestType getCalendarDateRequest() {
        return calendarDateRequest;
    }

    /**
     * Sets the value of the calendarDateRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarDateRequestType }
     *     
     */
    public void setCalendarDateRequest(CalendarDateRequestType value) {
        this.calendarDateRequest = value;
    }

    /**
     * Gets the value of the destArrivalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DestArrivalRequestType }
     *     
     */
    public DestArrivalRequestType getDestArrivalRequest() {
        return destArrivalRequest;
    }

    /**
     * Sets the value of the destArrivalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestArrivalRequestType }
     *     
     */
    public void setDestArrivalRequest(DestArrivalRequestType value) {
        this.destArrivalRequest = value;
    }

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Gets the value of the originDepRequest property.
     * 
     * @return
     *     possible object is
     *     {@link OriginDepRequestType }
     *     
     */
    public OriginDepRequestType getOriginDepRequest() {
        return originDepRequest;
    }

    /**
     * Sets the value of the originDepRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDepRequestType }
     *     
     */
    public void setOriginDepRequest(OriginDepRequestType value) {
        this.originDepRequest = value;
    }

    /**
     * Gets the value of the preferredCabinType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the preferredCabinType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPreferredCabinType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinTypeType }
     * 
     * 
     */
    public List<CabinTypeType> getPreferredCabinType() {
        if (preferredCabinType == null) {
            preferredCabinType = new ArrayList<CabinTypeType>();
        }
        return this.preferredCabinType;
    }

}
