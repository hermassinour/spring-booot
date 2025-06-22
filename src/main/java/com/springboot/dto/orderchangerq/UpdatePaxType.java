
package com.springboot.dto.orderchangerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Function to Add, Remove or Update the Passenger Details. Providing the New and Previous values together implies an Update.
 * 
 * <p>Java class for UpdatePaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdatePaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Current" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PaxType" minOccurs="0"/&gt;
 *         &lt;element name="New" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PaxType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdatePaxType", propOrder = {
    "current",
    "_new"
})
public class UpdatePaxType {

    @XmlElement(name = "Current")
    protected PaxType current;
    @XmlElement(name = "New")
    protected PaxType _new;

    /**
     * Gets the value of the current property.
     * 
     * @return
     *     possible object is
     *     {@link PaxType }
     *     
     */
    public PaxType getCurrent() {
        return current;
    }

    /**
     * Sets the value of the current property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxType }
     *     
     */
    public void setCurrent(PaxType value) {
        this.current = value;
    }

    /**
     * Gets the value of the new property.
     * 
     * @return
     *     possible object is
     *     {@link PaxType }
     *     
     */
    public PaxType getNew() {
        return _new;
    }

    /**
     * Sets the value of the new property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxType }
     *     
     */
    public void setNew(PaxType value) {
        this._new = value;
    }

}
