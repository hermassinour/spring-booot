
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
 * A physical aircraft compartment where passenger seats are installed, classified by a given Cabin Type.
 * 
 * <p>Java class for CabinCompartmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CabinCompartmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeckCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="FirstRowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="LastRowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}NumberType" minOccurs="0"/&gt;
 *         &lt;element name="ColumnID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CabinType" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CabinTypeType" minOccurs="0"/&gt;
 *         &lt;element name="CabinComponent" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CabinComponentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatRow" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}SeatRowType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinCompartmentType", propOrder = {
    "deckCode",
    "firstRowNumber",
    "lastRowNumber",
    "columnID",
    "cabinType",
    "cabinComponent",
    "seatRow"
})
public class CabinCompartmentType {

    @XmlElement(name = "DeckCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String deckCode;
    @XmlElement(name = "FirstRowNumber")
    protected BigDecimal firstRowNumber;
    @XmlElement(name = "LastRowNumber")
    protected BigDecimal lastRowNumber;
    @XmlElement(name = "ColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> columnID;
    @XmlElement(name = "CabinType")
    protected CabinTypeType cabinType;
    @XmlElement(name = "CabinComponent")
    protected List<CabinComponentType> cabinComponent;
    @XmlElement(name = "SeatRow")
    protected List<SeatRowType> seatRow;

    /**
     * Gets the value of the deckCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckCode() {
        return deckCode;
    }

    /**
     * Sets the value of the deckCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckCode(String value) {
        this.deckCode = value;
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
     * Gets the value of the cabinType property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinType() {
        return cabinType;
    }

    /**
     * Sets the value of the cabinType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    public void setCabinType(CabinTypeType value) {
        this.cabinType = value;
    }

    /**
     * Gets the value of the cabinComponent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinComponent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinComponent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinComponentType }
     * 
     * 
     */
    public List<CabinComponentType> getCabinComponent() {
        if (cabinComponent == null) {
            cabinComponent = new ArrayList<CabinComponentType>();
        }
        return this.cabinComponent;
    }

    /**
     * Gets the value of the seatRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatRowType }
     * 
     * 
     */
    public List<SeatRowType> getSeatRow() {
        if (seatRow == null) {
            seatRow = new ArrayList<SeatRowType>();
        }
        return this.seatRow;
    }

}
