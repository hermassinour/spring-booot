
package com.springboot.dto.seatavailabilityrq;

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
 * Seat Qualifier
 * 
 * <p>Java class for SeatType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatRowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}NumberType"/&gt;
 *         &lt;element name="CabinColumnID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}SeatCharacteristicsCodeType" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="OccupationStatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}CodeType"/&gt;
 *         &lt;element name="SeatProfile" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}SeatProfileType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatType", propOrder = {
    "seatRowNumber",
    "cabinColumnID",
    "characteristicCode",
    "occupationStatusCode",
    "seatProfile"
})
public class SeatType {

    @XmlElement(name = "SeatRowNumber", required = true)
    protected BigDecimal seatRowNumber;
    @XmlElement(name = "CabinColumnID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cabinColumnID;
    @XmlElement(name = "CharacteristicCode")
    protected List<SeatCharacteristicsCodeType> characteristicCode;
    @XmlElement(name = "OccupationStatusCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationStatusCode;
    @XmlElement(name = "SeatProfile")
    protected List<SeatProfileType> seatProfile;

    /**
     * Gets the value of the seatRowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatRowNumber() {
        return seatRowNumber;
    }

    /**
     * Sets the value of the seatRowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatRowNumber(BigDecimal value) {
        this.seatRowNumber = value;
    }

    /**
     * Gets the value of the cabinColumnID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinColumnID() {
        return cabinColumnID;
    }

    /**
     * Sets the value of the cabinColumnID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinColumnID(String value) {
        this.cabinColumnID = value;
    }

    /**
     * Gets the value of the characteristicCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatCharacteristicsCodeType }
     * 
     * 
     */
    public List<SeatCharacteristicsCodeType> getCharacteristicCode() {
        if (characteristicCode == null) {
            characteristicCode = new ArrayList<SeatCharacteristicsCodeType>();
        }
        return this.characteristicCode;
    }

    /**
     * Gets the value of the occupationStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationStatusCode() {
        return occupationStatusCode;
    }

    /**
     * Sets the value of the occupationStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationStatusCode(String value) {
        this.occupationStatusCode = value;
    }

    /**
     * Gets the value of the seatProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatProfileType }
     * 
     * 
     */
    public List<SeatProfileType> getSeatProfile() {
        if (seatProfile == null) {
            seatProfile = new ArrayList<SeatProfileType>();
        }
        return this.seatProfile;
    }

}
