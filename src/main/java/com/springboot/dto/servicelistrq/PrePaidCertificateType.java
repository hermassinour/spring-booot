
package com.springboot.dto.servicelistrq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PrePaidCertificateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrePaidCertificateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AppText" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="Number" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}NumberType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrePaidCertificateType", propOrder = {
    "appText",
    "effectiveDateTime",
    "expiryDateTime",
    "number"
})
public class PrePaidCertificateType {

    @XmlElement(name = "AppText")
    protected String appText;
    @XmlElement(name = "EffectiveDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDateTime;
    @XmlElement(name = "ExpiryDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDateTime;
    @XmlElement(name = "Number")
    protected BigDecimal number;

    /**
     * Gets the value of the appText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppText() {
        return appText;
    }

    /**
     * Sets the value of the appText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppText(String value) {
        this.appText = value;
    }

    /**
     * Gets the value of the effectiveDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDateTime() {
        return effectiveDateTime;
    }

    /**
     * Sets the value of the effectiveDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDateTime(XMLGregorianCalendar value) {
        this.effectiveDateTime = value;
    }

    /**
     * Gets the value of the expiryDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * Sets the value of the expiryDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDateTime(XMLGregorianCalendar value) {
        this.expiryDateTime = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumber(BigDecimal value) {
        this.number = value;
    }

}
