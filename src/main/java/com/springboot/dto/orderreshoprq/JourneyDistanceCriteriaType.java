
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Total journey distance criteria.
 * 
 * <p>Java class for JourneyDistanceCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyDistanceCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DistanceMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}MeasureType" minOccurs="0"/&gt;
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
@XmlType(name = "JourneyDistanceCriteriaType", propOrder = {
    "distanceMeasure",
    "prefLevelCode"
})
public class JourneyDistanceCriteriaType {

    @XmlElement(name = "DistanceMeasure")
    protected MeasureType distanceMeasure;
    @XmlElement(name = "PrefLevelCode")
    @XmlSchemaType(name = "string")
    protected PrefLevelCodeContentType prefLevelCode;

    /**
     * Gets the value of the distanceMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getDistanceMeasure() {
        return distanceMeasure;
    }

    /**
     * Sets the value of the distanceMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setDistanceMeasure(MeasureType value) {
        this.distanceMeasure = value;
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
