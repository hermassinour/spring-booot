
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains information related to potential business errors detected during processing of the preceding request.
 * 
 * <p>Java class for WarningType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarningType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="LanguageCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}LangCodeType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="StatusText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="TagText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}UniformResourceID_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WarningType", propOrder = {
    "code",
    "descText",
    "languageCode",
    "ownerName",
    "statusText",
    "tagText",
    "typeCode",
    "url"
})
public class WarningType {

    @XmlElement(name = "Code")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String code;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    @XmlElement(name = "StatusText")
    protected String statusText;
    @XmlElement(name = "TagText")
    protected String tagText;
    @XmlElement(name = "TypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeCode;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the statusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusText() {
        return statusText;
    }

    /**
     * Sets the value of the statusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusText(String value) {
        this.statusText = value;
    }

    /**
     * Gets the value of the tagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagText() {
        return tagText;
    }

    /**
     * Sets the value of the tagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagText(String value) {
        this.tagText = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
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

}
