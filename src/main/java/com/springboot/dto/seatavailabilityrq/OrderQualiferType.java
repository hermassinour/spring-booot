
package com.springboot.dto.seatavailabilityrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Shopping Request Business Object: EXISTING ORDER Qualifiers.
 * 
 * <p>Java class for OrderQualiferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQualiferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}OrderKeys"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderQualiferType", propOrder = {
    "orderKeys"
})
@XmlSeeAlso({
    ExistingOrderQualifier.class
})
public class OrderQualiferType {

    @XmlElement(name = "OrderKeys", required = true)
    protected OrderKeysType orderKeys;

    /**
     * Gets the value of the orderKeys property.
     * 
     * @return
     *     possible object is
     *     {@link OrderKeysType }
     *     
     */
    public OrderKeysType getOrderKeys() {
        return orderKeys;
    }

    /**
     * Sets the value of the orderKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderKeysType }
     *     
     */
    public void setOrderKeys(OrderKeysType value) {
        this.orderKeys = value;
    }

}
