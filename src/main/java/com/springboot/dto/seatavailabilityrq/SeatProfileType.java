
package com.springboot.dto.seatavailabilityrq;

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
 * Airline defined group of seats sharing common characteristics.
 * 
 * <p>Java class for SeatProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatProfileID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ID_Type"/&gt;
 *         &lt;element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}CodeType" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="SeatWidthMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="SeatPitchMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MarketingInformation" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}DescType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatProfileType", propOrder = {
    "seatProfileID",
    "characteristicCode",
    "seatWidthMeasure",
    "seatPitchMeasure",
    "descText",
    "marketingInformation"
})
public class SeatProfileType {

    @XmlElement(name = "SeatProfileID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatProfileID;
    @XmlElement(name = "CharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> characteristicCode;
    @XmlElement(name = "SeatWidthMeasure")
    protected MeasureType seatWidthMeasure;
    @XmlElement(name = "SeatPitchMeasure")
    protected MeasureType seatPitchMeasure;
    @XmlElement(name = "DescText")
    protected List<String> descText;
    @XmlElement(name = "MarketingInformation")
    protected List<DescType> marketingInformation;

    /**
     * Gets the value of the seatProfileID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatProfileID() {
        return seatProfileID;
    }

    /**
     * Sets the value of the seatProfileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatProfileID(String value) {
        this.seatProfileID = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacteristicCode() {
        if (characteristicCode == null) {
            characteristicCode = new ArrayList<String>();
        }
        return this.characteristicCode;
    }

    /**
     * Gets the value of the seatWidthMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeatWidthMeasure() {
        return seatWidthMeasure;
    }

    /**
     * Sets the value of the seatWidthMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeatWidthMeasure(MeasureType value) {
        this.seatWidthMeasure = value;
    }

    /**
     * Gets the value of the seatPitchMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getSeatPitchMeasure() {
        return seatPitchMeasure;
    }

    /**
     * Sets the value of the seatPitchMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setSeatPitchMeasure(MeasureType value) {
        this.seatPitchMeasure = value;
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
     * Gets the value of the marketingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getMarketingInformation() {
        if (marketingInformation == null) {
            marketingInformation = new ArrayList<DescType>();
        }
        return this.marketingInformation;
    }

}
