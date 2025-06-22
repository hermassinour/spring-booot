
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Contextual information to further describe something using a key-value pair.
 * 
 * <p>Java class for KeyValuePropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KeyValuePropertyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeyText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ValueText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PrefLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyValuePropertyType", propOrder = {
    "keyText",
    "valueText",
    "prefLevel"
})
public class KeyValuePropertyType {

    @XmlElement(name = "KeyText")
    protected String keyText;
    @XmlElement(name = "ValueText")
    protected String valueText;
    @XmlElement(name = "PrefLevel")
    protected PrefLevelType prefLevel;

    /**
     * Gets the value of the keyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyText() {
        return keyText;
    }

    /**
     * Sets the value of the keyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyText(String value) {
        this.keyText = value;
    }

    /**
     * Gets the value of the valueText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueText() {
        return valueText;
    }

    /**
     * Sets the value of the valueText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueText(String value) {
        this.valueText = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
