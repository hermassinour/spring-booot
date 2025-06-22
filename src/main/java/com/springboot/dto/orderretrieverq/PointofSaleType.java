
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The place at which a retail transaction is carried out.
 * 
 * <p>Java class for PointofSaleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PointofSaleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="AgentDutyText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CityType" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="Device" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DeviceType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PointofSaleType", propOrder = {
    "requestTime",
    "agentDutyText",
    "city",
    "country",
    "device"
})
public class PointofSaleType {

    @XmlElement(name = "RequestTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestTime;
    @XmlElement(name = "AgentDutyText")
    protected String agentDutyText;
    @XmlElement(name = "City")
    protected CityType city;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "Device")
    protected DeviceType device;

    /**
     * Gets the value of the requestTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestTime() {
        return requestTime;
    }

    /**
     * Sets the value of the requestTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestTime(XMLGregorianCalendar value) {
        this.requestTime = value;
    }

    /**
     * Gets the value of the agentDutyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentDutyText() {
        return agentDutyText;
    }

    /**
     * Sets the value of the agentDutyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentDutyText(String value) {
        this.agentDutyText = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link CityType }
     *     
     */
    public CityType getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityType }
     *     
     */
    public void setCity(CityType value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the device property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDevice() {
        return device;
    }

    /**
     * Sets the value of the device property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDevice(DeviceType value) {
        this.device = value;
    }

}
