
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Total segment travel time preferences.
 * 
 * <p>Java class for SegmentDurationCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentDurationCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumTimeMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="PrefLevelCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PrefLevelCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentDurationCriteriaType", propOrder = {
    "maximumTimeMeasure",
    "prefLevelCode"
})
public class SegmentDurationCriteriaType {

    @XmlElement(name = "MaximumTimeMeasure")
    protected MeasureType maximumTimeMeasure;
    @XmlElement(name = "PrefLevelCode")
    @XmlSchemaType(name = "string")
    protected PrefLevelCodeContentType prefLevelCode;

    /**
     * Gets the value of the maximumTimeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaximumTimeMeasure() {
        return maximumTimeMeasure;
    }

    /**
     * Sets the value of the maximumTimeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaximumTimeMeasure(MeasureType value) {
        this.maximumTimeMeasure = value;
    }

    /**
     * Gets the value of the prefLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public PrefLevelCodeContentType getPrefLevelCode() {
        return prefLevelCode;
    }

    /**
     * Sets the value of the prefLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public void setPrefLevelCode(PrefLevelCodeContentType value) {
        this.prefLevelCode = value;
    }

}
