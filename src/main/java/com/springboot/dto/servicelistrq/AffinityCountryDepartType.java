
package com.springboot.dto.servicelistrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Affinity Query Country Flight Departure (Origin) information.
 * 
 * <p>Java class for AffinityCountryDepartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityCountryDepartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Departure" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CountryQueryType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityCountryDepartType", propOrder = {
    "departure"
})
public class AffinityCountryDepartType {

    @XmlElement(name = "Departure", required = true)
    protected CountryQueryType departure;

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType }
     *     
     */
    public CountryQueryType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType }
     *     
     */
    public void setDeparture(CountryQueryType value) {
        this.departure = value;
    }

}
