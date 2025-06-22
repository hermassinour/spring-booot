
package com.springboot.dto.seatavailabilityrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Non-seat related cabin component (e.g. lavatory, galley, etc.)
 * 
 * <p>Java class for CabinComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinComponentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinComponentTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType"/&gt;
 *         &lt;element name="FirstRowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="LastRowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PositionCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AbsoluteWidthMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="AbsoluteLengthMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="OrientationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="RowEquivLengthNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="ColumnEquivWidthNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinComponentType", propOrder = {
    "cabinComponentTypeCode",
    "firstRowNumber",
    "lastRowNumber",
    "columnID",
    "positionCode",
    "absoluteWidthMeasure",
    "absoluteLengthMeasure",
    "orientationCode",
    "rowEquivLengthNumber",
    "columnEquivWidthNumber"
})
public class CabinComponentType {

    @XmlElement(name = "CabinComponentTypeCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinComponentTypeCode;
    @XmlElement(name = "FirstRowNumber")
    protected BigDecimal firstRowNumber;
    @XmlElement(name = "LastRowNumber")
    protected BigDecimal lastRowNumber;
    @XmlElement(name = "ColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> columnID;
    @XmlElement(name = "PositionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String positionCode;
    @XmlElement(name = "AbsoluteWidthMeasure")
    protected MeasureType absoluteWidthMeasure;
    @XmlElement(name = "AbsoluteLengthMeasure")
    protected MeasureType absoluteLengthMeasure;
    @XmlElement(name = "OrientationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orientationCode;
    @XmlElement(name = "RowEquivLengthNumber")
    protected BigDecimal rowEquivLengthNumber;
    @XmlElement(name = "ColumnEquivWidthNumber")
    protected BigDecimal columnEquivWidthNumber;

    /**
     * Gets the value of the cabinComponentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinComponentTypeCode() {
        return cabinComponentTypeCode;
    }

    /**
     * Sets the value of the cabinComponentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinComponentTypeCode(String value) {
        this.cabinComponentTypeCode = value;
    }

    /**
     * Gets the value of the firstRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFirstRowNumber() {
        return firstRowNumber;
    }

    /**
     * Sets the value of the firstRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFirstRowNumber(BigDecimal value) {
        this.firstRowNumber = value;
    }

    /**
     * Gets the value of the lastRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLastRowNumber() {
        return lastRowNumber;
    }

    /**
     * Sets the value of the lastRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLastRowNumber(BigDecimal value) {
        this.lastRowNumber = value;
    }

    /**
     * Gets the value of the columnID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getColumnID() {
        if (columnID == null) {
            columnID = new ArrayList<String>();
        }
        return this.columnID;
    }

    /**
     * Gets the value of the positionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionCode() {
        return positionCode;
    }

    /**
     * Sets the value of the positionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionCode(String value) {
        this.positionCode = value;
    }

    /**
     * Gets the value of the absoluteWidthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAbsoluteWidthMeasure() {
        return absoluteWidthMeasure;
    }

    /**
     * Sets the value of the absoluteWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAbsoluteWidthMeasure(MeasureType value) {
        this.absoluteWidthMeasure = value;
    }

    /**
     * Gets the value of the absoluteLengthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAbsoluteLengthMeasure() {
        return absoluteLengthMeasure;
    }

    /**
     * Sets the value of the absoluteLengthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAbsoluteLengthMeasure(MeasureType value) {
        this.absoluteLengthMeasure = value;
    }

    /**
     * Gets the value of the orientationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrientationCode() {
        return orientationCode;
    }

    /**
     * Sets the value of the orientationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrientationCode(String value) {
        this.orientationCode = value;
    }

    /**
     * Gets the value of the rowEquivLengthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowEquivLengthNumber() {
        return rowEquivLengthNumber;
    }

    /**
     * Sets the value of the rowEquivLengthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowEquivLengthNumber(BigDecimal value) {
        this.rowEquivLengthNumber = value;
    }

    /**
     * Gets the value of the columnEquivWidthNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getColumnEquivWidthNumber() {
        return columnEquivWidthNumber;
    }

    /**
     * Sets the value of the columnEquivWidthNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setColumnEquivWidthNumber(BigDecimal value) {
        this.columnEquivWidthNumber = value;
    }

}
