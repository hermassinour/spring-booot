
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * An account or representation of the certain or major aspects, characteristics, or features of a person, object, or event.
 * 
 * <p>Java class for DescType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="MarkupStyleText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}UniformResourceID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Media" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}MediaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescType", propOrder = {
    "descID",
    "descText",
    "markupStyleText",
    "url",
    "media"
})
public class DescType {

    @XmlElement(name = "DescID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String descID;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "MarkupStyleText")
    protected String markupStyleText;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "Media")
    protected MediaType media;

    /**
     * Gets the value of the descID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescID() {
        return descID;
    }

    /**
     * Sets the value of the descID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescID(String value) {
        this.descID = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the markupStyleText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarkupStyleText() {
        return markupStyleText;
    }

    /**
     * Sets the value of the markupStyleText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarkupStyleText(String value) {
        this.markupStyleText = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMedia(MediaType value) {
        this.media = value;
    }

}
