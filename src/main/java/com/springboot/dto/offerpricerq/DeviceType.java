
package com.springboot.dto.offerpricerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Device upon which the secure transaction will occur.
 * 
 * <p>Java class for DeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}TouchPointDeviceCodeType"/&gt;
 *         &lt;element name="TouchPointTrxCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}TouchPointEventCodeType" minOccurs="0"/&gt;
 *         &lt;element name="GeospatialLocation" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}GeospatialLocationType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeviceType", propOrder = {
    "deviceCode",
    "touchPointTrxCode",
    "geospatialLocation"
})
public class DeviceType {

    @XmlElement(name = "DeviceCode", required = true)
    protected String deviceCode;
    @XmlElement(name = "TouchPointTrxCode")
    protected String touchPointTrxCode;
    @XmlElement(name = "GeospatialLocation")
    protected GeospatialLocationType geospatialLocation;

    /**
     * Gets the value of the deviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeviceCode() {
        return deviceCode;
    }

    /**
     * Sets the value of the deviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeviceCode(String value) {
        this.deviceCode = value;
    }

    /**
     * Gets the value of the touchPointTrxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTouchPointTrxCode() {
        return touchPointTrxCode;
    }

    /**
     * Sets the value of the touchPointTrxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTouchPointTrxCode(String value) {
        this.touchPointTrxCode = value;
    }

    /**
     * Gets the value of the geospatialLocation property.
     * 
     * @return
     *     possible object is
     *     {@link GeospatialLocationType }
     *     
     */
    public GeospatialLocationType getGeospatialLocation() {
        return geospatialLocation;
    }

    /**
     * Sets the value of the geospatialLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeospatialLocationType }
     *     
     */
    public void setGeospatialLocation(GeospatialLocationType value) {
        this.geospatialLocation = value;
    }

}
