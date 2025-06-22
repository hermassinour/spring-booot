
package com.springboot.dto.servicelistrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Grouping of aircrafts with the same form, function and specification, currently flown, or soon to be flown. Possible types are defined in the IATA SSIM.
 * 
 * <p>Java class for IATA_AircraftTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IATA_AircraftTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IATA_AircraftTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}IATA_AircraftTypeCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IATA_AircraftTypeType", propOrder = {
    "iataAircraftTypeCode"
})
public class IATAAircraftTypeType {

    @XmlElement(name = "IATA_AircraftTypeCode", required = true)
    protected String iataAircraftTypeCode;

    /**
     * Gets the value of the iataAircraftTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATAAircraftTypeCode() {
        return iataAircraftTypeCode;
    }

    /**
     * Sets the value of the iataAircraftTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATAAircraftTypeCode(String value) {
        this.iataAircraftTypeCode = value;
    }

}
