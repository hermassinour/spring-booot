
package com.springboot.dto.offerpricerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Information supporting a preference including preference level code (e.g. Preferred, Exclude, etc.).
 * 
 * <p>Java class for PrefLevelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrefLevelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrefLevelCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}PrefLevelCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PrefContextText" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrefLevelType", propOrder = {
    "prefLevelCode",
    "prefContextText"
})
public class PrefLevelType {

    @XmlElement(name = "PrefLevelCode")
    @XmlSchemaType(name = "string")
    protected PrefLevelCodeContentType prefLevelCode;
    @XmlElement(name = "PrefContextText")
    protected String prefContextText;

    /**
     * Gets the value of the prefLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public PrefLevelCodeContentType getPrefLevelCode() {
        return prefLevelCode;
    }

    /**
     * Sets the value of the prefLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelCodeContentType }
     *     
     */
    public void setPrefLevelCode(PrefLevelCodeContentType value) {
        this.prefLevelCode = value;
    }

    /**
     * Gets the value of the prefContextText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefContextText() {
        return prefContextText;
    }

    /**
     * Sets the value of the prefContextText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefContextText(String value) {
        this.prefContextText = value;
    }

}
