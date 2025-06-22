
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any machine that can derive support in the atmosphere from the reactions of the air other than the reactions of the air against the earth’s surface. It must be certified as airworthy by a competent aeronautical authority.
 * 
 * <p>Java class for AircraftType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RegistrationNumberText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="TailNumberText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftType", propOrder = {
    "registrationNumberText",
    "tailNumberText"
})
public class AircraftType {

    @XmlElement(name = "RegistrationNumberText")
    protected String registrationNumberText;
    @XmlElement(name = "TailNumberText", required = true)
    protected String tailNumberText;

    /**
     * Gets the value of the registrationNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationNumberText() {
        return registrationNumberText;
    }

    /**
     * Sets the value of the registrationNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationNumberText(String value) {
        this.registrationNumberText = value;
    }

    /**
     * Gets the value of the tailNumberText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumberText() {
        return tailNumberText;
    }

    /**
     * Sets the value of the tailNumberText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumberText(String value) {
        this.tailNumberText = value;
    }

}
