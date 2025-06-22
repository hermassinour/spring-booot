
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AIRCRAFT SUMMARY representation.
 * 
 * <p>Java class for AircraftSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AircraftCoreType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="AirlineEquipCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ContextSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftSummaryType", propOrder = {
    "name",
    "airlineEquipCode"
})
public class AircraftSummaryType
    extends AircraftCoreType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "AirlineEquipCode")
    protected String airlineEquipCode;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the airlineEquipCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineEquipCode() {
        return airlineEquipCode;
    }

    /**
     * Sets the value of the airlineEquipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineEquipCode(String value) {
        this.airlineEquipCode = value;
    }

}
