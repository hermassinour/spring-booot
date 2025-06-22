
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Requested and Priced Passenger Type Code(s) and Quantity.
 * 
 * Passenger type code and Traveler quantity.  Example: ADT
 * 
 * Encoding scheme:  IATA (three character) Passenger Type Code
 * 
 * <p>Java class for PTC_QuantityPricedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PTC_QuantityPricedType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Requested" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PTC_QuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Priced" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PTC_QuantityType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PTC_QuantityPricedType", propOrder = {
    "requested",
    "priced"
})
public class PTCQuantityPricedType {

    @XmlElement(name = "Requested")
    protected PTCQuantityType requested;
    @XmlElement(name = "Priced")
    protected PTCQuantityType priced;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the requested property.
     * 
     * @return
     *     possible object is
     *     {@link PTCQuantityType }
     *     
     */
    public PTCQuantityType getRequested() {
        return requested;
    }

    /**
     * Sets the value of the requested property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCQuantityType }
     *     
     */
    public void setRequested(PTCQuantityType value) {
        this.requested = value;
    }

    /**
     * Gets the value of the priced property.
     * 
     * @return
     *     possible object is
     *     {@link PTCQuantityType }
     *     
     */
    public PTCQuantityType getPriced() {
        return priced;
    }

    /**
     * Sets the value of the priced property.
     * 
     * @param value
     *     allowed object is
     *     {@link PTCQuantityType }
     *     
     */
    public void setPriced(PTCQuantityType value) {
        this.priced = value;
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
