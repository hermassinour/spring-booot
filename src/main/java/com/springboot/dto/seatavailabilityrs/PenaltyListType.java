
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of Penalty data referenced in this message document.
 * 
 * <p>Java class for PenaltyListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PenaltyType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyListType", propOrder = {
    "penalty"
})
public class PenaltyListType {

    @XmlElement(name = "Penalty", required = true)
    protected PenaltyType penalty;

    /**
     * Gets the value of the penalty property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyType }
     *     
     */
    public PenaltyType getPenalty() {
        return penalty;
    }

    /**
     * Sets the value of the penalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyType }
     *     
     */
    public void setPenalty(PenaltyType value) {
        this.penalty = value;
    }

}
