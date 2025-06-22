
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Baggage dimension allowance with application information.
 * 
 * <p>Java class for DimensionAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DimensionAllowanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageDimensionCategory" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ShortTextType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MinMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MaxMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}TextType" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="Qty" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}QtyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DimensionAllowanceType", propOrder = {
    "baggageDimensionCategory",
    "applicableBagText",
    "minMeasure",
    "applicablePartyText",
    "maxMeasure",
    "descText",
    "qty"
})
public class DimensionAllowanceType {

    @XmlElement(name = "BaggageDimensionCategory")
    protected String baggageDimensionCategory;
    @XmlElement(name = "ApplicableBagText")
    protected String applicableBagText;
    @XmlElement(name = "MinMeasure")
    protected MeasureType minMeasure;
    @XmlElement(name = "ApplicablePartyText")
    protected String applicablePartyText;
    @XmlElement(name = "MaxMeasure")
    protected MeasureType maxMeasure;
    @XmlElement(name = "DescText")
    protected List<String> descText;
    @XmlElement(name = "Qty")
    protected BigDecimal qty;

    /**
     * Gets the value of the baggageDimensionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDimensionCategory() {
        return baggageDimensionCategory;
    }

    /**
     * Sets the value of the baggageDimensionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageDimensionCategory(String value) {
        this.baggageDimensionCategory = value;
    }

    /**
     * Gets the value of the applicableBagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBagText() {
        return applicableBagText;
    }

    /**
     * Sets the value of the applicableBagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBagText(String value) {
        this.applicableBagText = value;
    }

    /**
     * Gets the value of the minMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMinMeasure() {
        return minMeasure;
    }

    /**
     * Sets the value of the minMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMinMeasure(MeasureType value) {
        this.minMeasure = value;
    }

    /**
     * Gets the value of the applicablePartyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicablePartyText() {
        return applicablePartyText;
    }

    /**
     * Sets the value of the applicablePartyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicablePartyText(String value) {
        this.applicablePartyText = value;
    }

    /**
     * Gets the value of the maxMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getMaxMeasure() {
        return maxMeasure;
    }

    /**
     * Sets the value of the maxMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setMaxMeasure(MeasureType value) {
        this.maxMeasure = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<String>();
        }
        return this.descText;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

}
