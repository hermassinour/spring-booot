
package com.springboot.dto.offerpricers;

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
 * Description and characteristics of a seat.
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
 *         &lt;element name="SeatProfileID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type"/&gt;
 *         &lt;element name="SeatWidthMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="CharacteristicCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="SeatPitchMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}DescType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SeatKeywords" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}SeatKeywordsType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "seatWidthMeasure",
    "characteristicCode",
    "seatPitchMeasure",
    "desc",
    "seatKeywords"
})
public class SeatProfileType {

    @XmlElement(name = "SeatProfileID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String seatProfileID;
    @XmlElement(name = "SeatWidthMeasure")
    protected MeasureType seatWidthMeasure;
    @XmlElement(name = "CharacteristicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String characteristicCode;
    @XmlElement(name = "SeatPitchMeasure")
    protected MeasureType seatPitchMeasure;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;
    @XmlElement(name = "SeatKeywords")
    protected List<SeatKeywordsType> seatKeywords;

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
     * Gets the value of the characteristicCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCharacteristicCode() {
        return characteristicCode;
    }

    /**
     * Sets the value of the characteristicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCharacteristicCode(String value) {
        this.characteristicCode = value;
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
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the seatKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatKeywordsType }
     * 
     * 
     */
    public List<SeatKeywordsType> getSeatKeywords() {
        if (seatKeywords == null) {
            seatKeywords = new ArrayList<SeatKeywordsType>();
        }
        return this.seatKeywords;
    }

}
