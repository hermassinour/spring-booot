
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * An area of land which is a sub-division within a country, such as a state, a county, a canton, a province, etc.
 * 
 * <p>Java class for CountrySubDivisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySubDivisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountrySubDivisionCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CountrySubDivisionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubDivisionName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubDivisionType", propOrder = {
    "countrySubDivisionCode",
    "countrySubDivisionName"
})
public class CountrySubDivisionType {

    @XmlElement(name = "CountrySubDivisionCode")
    protected CountrySubDivisionCodeType countrySubDivisionCode;
    @XmlElement(name = "CountrySubDivisionName")
    protected ProperNameType countrySubDivisionName;

    /**
     * Gets the value of the countrySubDivisionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionCodeType }
     *     
     */
    public CountrySubDivisionCodeType getCountrySubDivisionCode() {
        return countrySubDivisionCode;
    }

    /**
     * Sets the value of the countrySubDivisionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionCodeType }
     *     
     */
    public void setCountrySubDivisionCode(CountrySubDivisionCodeType value) {
        this.countrySubDivisionCode = value;
    }

    /**
     * Gets the value of the countrySubDivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link ProperNameType }
     *     
     */
    public ProperNameType getCountrySubDivisionName() {
        return countrySubDivisionName;
    }

    /**
     * Sets the value of the countrySubDivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProperNameType }
     *     
     */
    public void setCountrySubDivisionName(ProperNameType value) {
        this.countrySubDivisionName = value;
    }

}
