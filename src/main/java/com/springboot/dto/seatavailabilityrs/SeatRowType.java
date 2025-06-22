
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
 * Row of seats located in a cabin compartment.
 * 
 * <p>Java class for SeatRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType"/&gt;
 *         &lt;element name="CharacteristicsCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Seat" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}SeatType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRowType", propOrder = {
    "rowNumber",
    "characteristicsCode",
    "seat"
})
public class SeatRowType {

    @XmlElement(name = "RowNumber", required = true)
    protected BigDecimal rowNumber;
    @XmlElement(name = "CharacteristicsCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicsCode;
    @XmlElement(name = "Seat", required = true)
    protected List<SeatType> seat;

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowNumber(BigDecimal value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the characteristicsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacteristicsCode() {
        if (characteristicsCode == null) {
            characteristicsCode = new ArrayList<String>();
        }
        return this.characteristicsCode;
    }

    /**
     * Gets the value of the seat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatType }
     * 
     * 
     */
    public List<SeatType> getSeat() {
        if (seat == null) {
            seat = new ArrayList<SeatType>();
        }
        return this.seat;
    }

}
