
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * COUNTRY CODE representation.
 * 
 * Notes:
 *  1. Examples: US, FR
 *  2. Encoding Scheme: ISO 3166-1 (two character) Country Code
 * 
 * <p>Java class for V172_CountryCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_CountryCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS&gt;CountrySimpleType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ObjectPolicyMetaAttrGroup"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_CountryCodeType", propOrder = {
    "value"
})
@XmlSeeAlso({
    CountryCode.class
})
public class V172CountryCodeType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;
    @XmlAttribute(name = "ObjectMetaReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String objectMetaReferences;

    /**
     * A data type for Country Code encoding constraint: ISO 3166-1 (two character) Country Code
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

    /**
     * Gets the value of the objectMetaReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectMetaReferences() {
        return objectMetaReferences;
    }

    /**
     * Sets the value of the objectMetaReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectMetaReferences(String value) {
        this.objectMetaReferences = value;
    }

}
