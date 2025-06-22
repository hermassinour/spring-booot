
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Program organized by a government which eliminates watch list misidentification and assists in identity verification of individuals.
 * 
 * <p>Java class for RedressProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedressProgramType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RedressID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}RedressID_Type"/&gt;
 *         &lt;element name="ProgramName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CountryCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedressProgramType", propOrder = {
    "redressID",
    "programName",
    "countryCode"
})
public class RedressProgramType {

    @XmlElement(name = "RedressID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String redressID;
    @XmlElement(name = "ProgramName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String programName;
    @XmlElement(name = "CountryCode", required = true)
    protected CountryCodeType countryCode;

    /**
     * Gets the value of the redressID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedressID() {
        return redressID;
    }

    /**
     * Sets the value of the redressID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedressID(String value) {
        this.redressID = value;
    }

    /**
     * Gets the value of the programName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * Sets the value of the programName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

}
