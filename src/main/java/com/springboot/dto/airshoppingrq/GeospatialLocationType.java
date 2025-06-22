
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A location with a spatial attribute, probably on the surface of the earth. For example: Longitude and Latitude
 * 
 * <p>Java class for GeospatialLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeospatialLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PointLatitudeNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PositionNumberType" minOccurs="0"/&gt;
 *         &lt;element name="PointLongitudeNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PositionNumberType" minOccurs="0"/&gt;
 *         &lt;element name="PointAltitudeMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MeasureType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeospatialLocationType", propOrder = {
    "pointLatitudeNumber",
    "pointLongitudeNumber",
    "pointAltitudeMeasure"
})
public class GeospatialLocationType {

    @XmlElement(name = "PointLatitudeNumber")
    protected Double pointLatitudeNumber;
    @XmlElement(name = "PointLongitudeNumber")
    protected Double pointLongitudeNumber;
    @XmlElement(name = "PointAltitudeMeasure")
    protected MeasureType pointAltitudeMeasure;

    /**
     * Gets the value of the pointLatitudeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointLatitudeNumber() {
        return pointLatitudeNumber;
    }

    /**
     * Sets the value of the pointLatitudeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointLatitudeNumber(Double value) {
        this.pointLatitudeNumber = value;
    }

    /**
     * Gets the value of the pointLongitudeNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPointLongitudeNumber() {
        return pointLongitudeNumber;
    }

    /**
     * Sets the value of the pointLongitudeNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPointLongitudeNumber(Double value) {
        this.pointLongitudeNumber = value;
    }

    /**
     * Gets the value of the pointAltitudeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPointAltitudeMeasure() {
        return pointAltitudeMeasure;
    }

    /**
     * Sets the value of the pointAltitudeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPointAltitudeMeasure(MeasureType value) {
        this.pointAltitudeMeasure = value;
    }

}
