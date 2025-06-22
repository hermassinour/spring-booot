
package com.springboot.dto.seatavailabilityrs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="Cabin" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}SimpleAircraftCabinType"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="ClassOfService" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}FlightCOS_CoreType"/&gt;
 *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}BagDetailAssociation" minOccurs="0"/&gt;
 *           &lt;element name="MarriedSegmentGroup" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabin",
    "classOfService",
    "bagDetailAssociation",
    "marriedSegmentGroup"
})
@XmlRootElement(name = "FlightSegmentReference")
public class FlightSegmentReference {

    @XmlElement(name = "Cabin")
    protected SimpleAircraftCabinType cabin;
    @XmlElement(name = "ClassOfService")
    protected FlightCOSCoreType classOfService;
    @XmlElement(name = "BagDetailAssociation")
    protected BagDetailAssociation bagDetailAssociation;
    @XmlElement(name = "MarriedSegmentGroup")
    protected BigInteger marriedSegmentGroup;
    @XmlAttribute(name = "ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ref;

    /**
     * Gets the value of the cabin property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleAircraftCabinType }
     *     
     */
    public SimpleAircraftCabinType getCabin() {
        return cabin;
    }

    /**
     * Sets the value of the cabin property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleAircraftCabinType }
     *     
     */
    public void setCabin(SimpleAircraftCabinType value) {
        this.cabin = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public FlightCOSCoreType getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCOSCoreType }
     *     
     */
    public void setClassOfService(FlightCOSCoreType value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the bagDetailAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link BagDetailAssociation }
     *     
     */
    public BagDetailAssociation getBagDetailAssociation() {
        return bagDetailAssociation;
    }

    /**
     * Sets the value of the bagDetailAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDetailAssociation }
     *     
     */
    public void setBagDetailAssociation(BagDetailAssociation value) {
        this.bagDetailAssociation = value;
    }

    /**
     * Gets the value of the marriedSegmentGroup property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMarriedSegmentGroup() {
        return marriedSegmentGroup;
    }

    /**
     * Sets the value of the marriedSegmentGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMarriedSegmentGroup(BigInteger value) {
        this.marriedSegmentGroup = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

}
