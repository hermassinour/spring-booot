
package com.springboot.dto.offerpricers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Seat size and marketing information definition.
 * 
 * <p>Java class for SeatDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="Descriptions" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}Descriptions" minOccurs="0"/&gt;
 *           &lt;element name="UOM" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}SizeUnitSimpleType" minOccurs="0"/&gt;
 *           &lt;choice&gt;
 *             &lt;sequence&gt;
 *               &lt;element name="SeatPitchLow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *               &lt;element name="SeatWidthLow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *             &lt;/sequence&gt;
 *             &lt;element name="Keywords" minOccurs="0"&gt;
 *               &lt;complexType&gt;
 *                 &lt;complexContent&gt;
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                     &lt;sequence&gt;
 *                       &lt;element name="KeyWord" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}KeyWordType" maxOccurs="unbounded"/&gt;
 *                     &lt;/sequence&gt;
 *                   &lt;/restriction&gt;
 *                 &lt;/complexContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/choice&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="Marketing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}SeatMapMessageType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDataType", propOrder = {
    "descriptions",
    "uom",
    "seatPitchLow",
    "seatWidthLow",
    "keywords",
    "marketing"
})
@XmlSeeAlso({
    com.springboot.dto.offerpricers.SeatLocationType.Row.SeatData.class
})
public class SeatDataType {

    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "UOM")
    @XmlSchemaType(name = "string")
    protected SizeUnitSimpleType uom;
    @XmlElement(name = "SeatPitchLow")
    protected BigDecimal seatPitchLow;
    @XmlElement(name = "SeatWidthLow")
    protected BigDecimal seatWidthLow;
    @XmlElement(name = "Keywords")
    protected SeatDataType.Keywords keywords;
    @XmlElement(name = "Marketing")
    protected SeatDataType.Marketing marketing;

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
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public SizeUnitSimpleType getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public void setUOM(SizeUnitSimpleType value) {
        this.uom = value;
    }

    /**
     * Gets the value of the seatPitchLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatPitchLow() {
        return seatPitchLow;
    }

    /**
     * Sets the value of the seatPitchLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatPitchLow(BigDecimal value) {
        this.seatPitchLow = value;
    }

    /**
     * Gets the value of the seatWidthLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatWidthLow() {
        return seatWidthLow;
    }

    /**
     * Sets the value of the seatWidthLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatWidthLow(BigDecimal value) {
        this.seatWidthLow = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Keywords }
     *     
     */
    public SeatDataType.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Keywords }
     *     
     */
    public void setKeywords(SeatDataType.Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public SeatDataType.Marketing getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public void setMarketing(SeatDataType.Marketing value) {
        this.marketing = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="KeyWord" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}KeyWordType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "keyWord"
    })
    public static class Keywords {

        @XmlElement(name = "KeyWord", required = true)
        protected List<KeyWordType> keyWord;

        /**
         * Gets the value of the keyWord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyWord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyWord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KeyWordType }
         * 
         * 
         */
        public List<KeyWordType> getKeyWord() {
            if (keyWord == null) {
                keyWord = new ArrayList<KeyWordType>();
            }
            return this.keyWord;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}SeatMapMessageType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Marketing
        extends SeatMapMessageType
    {


    }

}
