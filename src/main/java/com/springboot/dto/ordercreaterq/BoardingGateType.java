
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An exit/entry from an airport building to an aircraft. Could for example be a boarding gate, arrival gate, departing gate etc.
 * 
 * <p>Java class for BoardingGateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BoardingGateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BoardingGateID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}BoardingGateID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BoardingGateType", propOrder = {
    "boardingGateID"
})
public class BoardingGateType {

    @XmlElement(name = "BoardingGateID")
    protected BoardingGateIDType boardingGateID;

    /**
     * Gets the value of the boardingGateID property.
     * 
     * @return
     *     possible object is
     *     {@link BoardingGateIDType }
     *     
     */
    public BoardingGateIDType getBoardingGateID() {
        return boardingGateID;
    }

    /**
     * Sets the value of the boardingGateID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BoardingGateIDType }
     *     
     */
    public void setBoardingGateID(BoardingGateIDType value) {
        this.boardingGateID = value;
    }

}
