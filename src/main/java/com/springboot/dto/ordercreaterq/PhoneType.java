
package com.springboot.dto.ordercreaterq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A telephone number is a sequence of digits assigned to a fixed-line telephone subscriber station connected to a telephone line or to a wireless electronic telephony device, such as a radio telephone or a mobile telephone, or to other devices for data tra
 * 
 * <p>Java class for PhoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhoneType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="CountryDialingCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CountryDialingCodeType" minOccurs="0"/&gt;
 *         &lt;element name="AreaCodeNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="PhoneNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="ExtensionNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhoneType", propOrder = {
    "labelText",
    "countryDialingCode",
    "areaCodeNumber",
    "phoneNumber",
    "extensionNumber"
})
public class PhoneType {

    @XmlElement(name = "LabelText")
    protected String labelText;
    @XmlElement(name = "CountryDialingCode")
    protected CountryDialingCodeType countryDialingCode;
    @XmlElement(name = "AreaCodeNumber")
    protected BigDecimal areaCodeNumber;
    @XmlElement(name = "PhoneNumber")
    protected BigDecimal phoneNumber;
    @XmlElement(name = "ExtensionNumber")
    protected BigDecimal extensionNumber;

    /**
     * Gets the value of the labelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * Sets the value of the labelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelText(String value) {
        this.labelText = value;
    }

    /**
     * Gets the value of the countryDialingCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryDialingCodeType }
     *     
     */
    public CountryDialingCodeType getCountryDialingCode() {
        return countryDialingCode;
    }

    /**
     * Sets the value of the countryDialingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDialingCodeType }
     *     
     */
    public void setCountryDialingCode(CountryDialingCodeType value) {
        this.countryDialingCode = value;
    }

    /**
     * Gets the value of the areaCodeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAreaCodeNumber() {
        return areaCodeNumber;
    }

    /**
     * Sets the value of the areaCodeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAreaCodeNumber(BigDecimal value) {
        this.areaCodeNumber = value;
    }

    /**
     * Gets the value of the phoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPhoneNumber(BigDecimal value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the extensionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getExtensionNumber() {
        return extensionNumber;
    }

    /**
     * Sets the value of the extensionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setExtensionNumber(BigDecimal value) {
        this.extensionNumber = value;
    }

}
