
package com.springboot.dto.seatavailabilityrs;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="Percent" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}Percentage" /&gt;
 *       &lt;attribute name="Period" use="required" type="{http://www.w3.org/2001/XMLSchema}gYearMonth" /&gt;
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}NMTOKEN" /&gt;
 *       &lt;attribute name="LatePercent" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}Percentage" /&gt;
 *       &lt;attribute name="CancelledPercent" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}Percentage" /&gt;
 *       &lt;attribute name="SpecialHighlightInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "OnTimePerformance")
public class OnTimePerformance {

    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "Period", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar period;
    @XmlAttribute(name = "Type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String type;
    @XmlAttribute(name = "LatePercent")
    protected BigDecimal latePercent;
    @XmlAttribute(name = "CancelledPercent")
    protected BigDecimal cancelledPercent;
    @XmlAttribute(name = "SpecialHighlightInd")
    protected Boolean specialHighlightInd;

    /**
     * Gets the value of the percent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPercent() {
        return percent;
    }

    /**
     * Sets the value of the percent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPercent(BigDecimal value) {
        this.percent = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPeriod(XMLGregorianCalendar value) {
        this.period = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the latePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatePercent() {
        return latePercent;
    }

    /**
     * Sets the value of the latePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatePercent(BigDecimal value) {
        this.latePercent = value;
    }

    /**
     * Gets the value of the cancelledPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCancelledPercent() {
        return cancelledPercent;
    }

    /**
     * Sets the value of the cancelledPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCancelledPercent(BigDecimal value) {
        this.cancelledPercent = value;
    }

    /**
     * Gets the value of the specialHighlightInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialHighlightInd() {
        return specialHighlightInd;
    }

    /**
     * Sets the value of the specialHighlightInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialHighlightInd(Boolean value) {
        this.specialHighlightInd = value;
    }

}
