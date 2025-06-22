
package com.springboot.dto.offerpricers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Country Flight Arrival (Destination) information.
 * 
 * <p>Java class for AffinityCountryArriveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityCountryArriveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CountryQueryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityCountryArriveType", propOrder = {
    "arrival"
})
public class AffinityCountryArriveType {

    @XmlElement(name = "Arrival", required = true)
    protected CountryQueryType arrival;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType }
     *     
     */
    public CountryQueryType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType }
     *     
     */
    public void setArrival(CountryQueryType value) {
        this.arrival = value;
    }

}
