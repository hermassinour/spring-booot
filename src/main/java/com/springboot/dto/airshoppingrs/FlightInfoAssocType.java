
package com.springboot.dto.airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Flight that the offer applies to.
 * 
 * <p>Java class for FlightInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightInfoAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AllSegmentInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}FlightSegmentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AllOriginDestinationInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}OriginDestinationReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AllFlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}FlightReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightInfoAssocType", propOrder = {
    "allSegmentInd",
    "flightSegmentReference",
    "allOriginDestinationInd",
    "originDestinationReferences",
    "allFlightInd",
    "flightReferences"
})
@XmlSeeAlso({
    ApplicableFlight.class
})
public class FlightInfoAssocType {

    @XmlElement(name = "AllSegmentInd")
    protected Boolean allSegmentInd;
    @XmlElement(name = "FlightSegmentReference")
    protected List<FlightSegmentReference> flightSegmentReference;
    @XmlElement(name = "AllOriginDestinationInd")
    protected Boolean allOriginDestinationInd;
    @XmlElement(name = "OriginDestinationReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> originDestinationReferences;
    @XmlElement(name = "AllFlightInd")
    protected Boolean allFlightInd;
    @XmlElement(name = "FlightReferences")
    protected List<FlightReferences> flightReferences;

    /**
     * Gets the value of the allSegmentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllSegmentInd() {
        return allSegmentInd;
    }

    /**
     * Sets the value of the allSegmentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllSegmentInd(Boolean value) {
        this.allSegmentInd = value;
    }

    /**
     * Association to to single Flight  segment instance(s). Example: segment1 Gets the value of the flightSegmentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightSegmentReference }
     * 
     * 
     */
    public List<FlightSegmentReference> getFlightSegmentReference() {
        if (flightSegmentReference == null) {
            flightSegmentReference = new ArrayList<FlightSegmentReference>();
        }
        return this.flightSegmentReference;
    }

    /**
     * Gets the value of the allOriginDestinationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOriginDestinationInd() {
        return allOriginDestinationInd;
    }

    /**
     * Sets the value of the allOriginDestinationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllOriginDestinationInd(Boolean value) {
        this.allOriginDestinationInd = value;
    }

    /**
     * Gets the value of the originDestinationReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originDestinationReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginDestinationReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOriginDestinationReferences() {
        if (originDestinationReferences == null) {
            originDestinationReferences = new ArrayList<String>();
        }
        return this.originDestinationReferences;
    }

    /**
     * Gets the value of the allFlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllFlightInd() {
        return allFlightInd;
    }

    /**
     * Sets the value of the allFlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllFlightInd(Boolean value) {
        this.allFlightInd = value;
    }

    /**
     * Gets the value of the flightReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightReferences }
     * 
     * 
     */
    public List<FlightReferences> getFlightReferences() {
        if (flightReferences == null) {
            flightReferences = new ArrayList<FlightReferences>();
        }
        return this.flightReferences;
    }

}
