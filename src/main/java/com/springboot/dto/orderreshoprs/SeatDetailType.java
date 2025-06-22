
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * DETAIL SEAT definition.
 * 
 * <p>Java class for SeatDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}SeatCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Details" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}SeatCharacteristicType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailType", propOrder = {
    "details"
})
@XmlSeeAlso({
    SeatOfferCoreType.class
})
public class SeatDetailType
    extends SeatCoreType
{

    @XmlElement(name = "Details")
    protected SeatCharacteristicType details;

    /**
     * Gets the value of the details property.
     * 
     * @return
     *     possible object is
     *     {@link SeatCharacteristicType }
     *     
     */
    public SeatCharacteristicType getDetails() {
        return details;
    }

    /**
     * Sets the value of the details property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatCharacteristicType }
     *     
     */
    public void setDetails(SeatCharacteristicType value) {
        this.details = value;
    }

}
