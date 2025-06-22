
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type of compartment of an aircraft, offering specific services (e.g. business class, economy).
 * 
 * <p>Java class for CabinTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CabinTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CabinTypeName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinTypeType", propOrder = {
    "cabinTypeCode",
    "cabinTypeName"
})
public class CabinTypeType {

    @XmlElement(name = "CabinTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeCode;
    @XmlElement(name = "CabinTypeName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinTypeName;

    /**
     * Gets the value of the cabinTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeCode() {
        return cabinTypeCode;
    }

    /**
     * Sets the value of the cabinTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinTypeCode(String value) {
        this.cabinTypeCode = value;
    }

    /**
     * Gets the value of the cabinTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinTypeName() {
        return cabinTypeName;
    }

    /**
     * Sets the value of the cabinTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinTypeName(String value) {
        this.cabinTypeName = value;
    }

}
