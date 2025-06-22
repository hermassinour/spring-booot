
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Flight characteristics preferences including non-stop, red eye, etc.
 * 
 * <p>Java class for FlightCharacteristicsCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightCharacteristicsCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharacteristicsCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightCharacteristicsCodeType"/&gt;
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PrefLevelType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightCharacteristicsCriteriaType", propOrder = {
    "characteristicsCode",
    "prefLevel"
})
public class FlightCharacteristicsCriteriaType {

    @XmlElement(name = "CharacteristicsCode", required = true)
    @XmlSchemaType(name = "string")
    protected FlightCharacteristicsCodeContentType characteristicsCode;
    @XmlElement(name = "PrefLevel", required = true)
    protected PrefLevelType prefLevel;

    /**
     * Gets the value of the characteristicsCode property.
     * 
     * @return
     *     possible object is
     *     {@link FlightCharacteristicsCodeContentType }
     *     
     */
    public FlightCharacteristicsCodeContentType getCharacteristicsCode() {
        return characteristicsCode;
    }

    /**
     * Sets the value of the characteristicsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightCharacteristicsCodeContentType }
     *     
     */
    public void setCharacteristicsCode(FlightCharacteristicsCodeContentType value) {
        this.characteristicsCode = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
