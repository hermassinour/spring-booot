
package com.springboot.dto.seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SeatKeywordsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatKeywordsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="KeywordText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="KeywordValueText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatKeywordsType", propOrder = {
    "keywordText",
    "keywordValueText"
})
public class SeatKeywordsType {

    @XmlElement(name = "KeywordText")
    protected String keywordText;
    @XmlElement(name = "KeywordValueText")
    protected List<String> keywordValueText;

    /**
     * Gets the value of the keywordText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeywordText() {
        return keywordText;
    }

    /**
     * Sets the value of the keywordText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeywordText(String value) {
        this.keywordText = value;
    }

    /**
     * Gets the value of the keywordValueText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordValueText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordValueText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getKeywordValueText() {
        if (keywordValueText == null) {
            keywordValueText = new ArrayList<String>();
        }
        return this.keywordValueText;
    }

}
