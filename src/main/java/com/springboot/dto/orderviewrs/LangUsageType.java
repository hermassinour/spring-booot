
package com.springboot.dto.orderviewrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Language Code representation.
 * 
 * <p>Java class for LangUsageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LangUsageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LangCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}LangCodeType" minOccurs="0"/&gt;
 *         &lt;element name="LangUsageText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LangUsageType", propOrder = {
    "langCode",
    "langUsageText"
})
public class LangUsageType {

    @XmlElement(name = "LangCode")
    protected String langCode;
    @XmlElement(name = "LangUsageText")
    protected String langUsageText;

    /**
     * Gets the value of the langCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCode() {
        return langCode;
    }

    /**
     * Sets the value of the langCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCode(String value) {
        this.langCode = value;
    }

    /**
     * Gets the value of the langUsageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangUsageText() {
        return langUsageText;
    }

    /**
     * Sets the value of the langUsageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangUsageText(String value) {
        this.langUsageText = value;
    }

}
