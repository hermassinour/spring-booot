
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for AIRCRAFT Metadata.
 * 
 * <p>Java class for AircraftMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TailNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ProperNameSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftMetadataType", propOrder = {
    "tailNumber",
    "name"
})
public class AircraftMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "TailNumber")
    protected String tailNumber;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the tailNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailNumber() {
        return tailNumber;
    }

    /**
     * Sets the value of the tailNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailNumber(String value) {
        this.tailNumber = value;
    }

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

}
