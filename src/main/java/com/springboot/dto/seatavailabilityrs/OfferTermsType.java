
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OFFER TERMS definition.
 * 
 * <p>Java class for OfferTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="AvailablePeriod" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}OfferValidPeriodType"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}Descriptions"/&gt;
 *         &lt;element name="GroupSize" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}OfferGroupSizeType"/&gt;
 *         &lt;element name="OrderingQuantity" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}OfferOrderQuantityType"/&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferTermsType", propOrder = {
    "availablePeriod",
    "descriptions",
    "groupSize",
    "orderingQuantity"
})
public class OfferTermsType {

    @XmlElement(name = "AvailablePeriod")
    protected OfferValidPeriodType availablePeriod;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "GroupSize")
    protected OfferGroupSizeType groupSize;
    @XmlElement(name = "OrderingQuantity")
    protected OfferOrderQuantityType orderingQuantity;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the availablePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public OfferValidPeriodType getAvailablePeriod() {
        return availablePeriod;
    }

    /**
     * Sets the value of the availablePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferValidPeriodType }
     *     
     */
    public void setAvailablePeriod(OfferValidPeriodType value) {
        this.availablePeriod = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the groupSize property.
     * 
     * @return
     *     possible object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public OfferGroupSizeType getGroupSize() {
        return groupSize;
    }

    /**
     * Sets the value of the groupSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferGroupSizeType }
     *     
     */
    public void setGroupSize(OfferGroupSizeType value) {
        this.groupSize = value;
    }

    /**
     * Gets the value of the orderingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public OfferOrderQuantityType getOrderingQuantity() {
        return orderingQuantity;
    }

    /**
     * Sets the value of the orderingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferOrderQuantityType }
     *     
     */
    public void setOrderingQuantity(OfferOrderQuantityType value) {
        this.orderingQuantity = value;
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

}
