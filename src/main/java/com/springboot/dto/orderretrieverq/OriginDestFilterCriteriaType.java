
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Filters results based on Origin Destination.
 * 
 * <p>Java class for OriginDestFilterCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginDestFilterCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Arrival" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ArrivalFilterCriteriaType"/&gt;
 *         &lt;element name="Departure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DepFilterCriteriaType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginDestFilterCriteriaType", propOrder = {
    "arrival",
    "departure"
})
public class OriginDestFilterCriteriaType {

    @XmlElement(name = "Arrival", required = true)
    protected ArrivalFilterCriteriaType arrival;
    @XmlElement(name = "Departure", required = true)
    protected DepFilterCriteriaType departure;

    /**
     * Gets the value of the arrival property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalFilterCriteriaType }
     *     
     */
    public ArrivalFilterCriteriaType getArrival() {
        return arrival;
    }

    /**
     * Sets the value of the arrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalFilterCriteriaType }
     *     
     */
    public void setArrival(ArrivalFilterCriteriaType value) {
        this.arrival = value;
    }

    /**
     * Gets the value of the departure property.
     * 
     * @return
     *     possible object is
     *     {@link DepFilterCriteriaType }
     *     
     */
    public DepFilterCriteriaType getDeparture() {
        return departure;
    }

    /**
     * Sets the value of the departure property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepFilterCriteriaType }
     *     
     */
    public void setDeparture(DepFilterCriteriaType value) {
        this.departure = value;
    }

}
