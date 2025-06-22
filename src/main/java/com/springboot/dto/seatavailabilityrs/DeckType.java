
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A structural floor level. For aircraft having one structural level only, this floor level shall be referred to as the main deck. For aircraft having more than one structural floor level, the different floor levels shall be referred to as 'lower deck', 'm
 * 
 * <p>Java class for DeckType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeckType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeckCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}DeckCodeType"/&gt;
 *         &lt;element name="MaximumWeightMeasure" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VolumeMeasure" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LateralArmFromMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LateralArmToMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceArmFWDMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BalanceArmAFTMeasure" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemarksText" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}TextType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeckType", propOrder = {
    "deckCode",
    "maximumWeightMeasure",
    "volumeMeasure",
    "lateralArmFromMeasure",
    "lateralArmToMeasure",
    "balanceArmFWDMeasure",
    "balanceArmAFTMeasure",
    "remarksText"
})
public class DeckType {

    @XmlElement(name = "DeckCode", required = true)
    @XmlSchemaType(name = "string")
    protected DeckCodeContentType deckCode;
    @XmlElement(name = "MaximumWeightMeasure", required = true)
    protected String maximumWeightMeasure;
    @XmlElement(name = "VolumeMeasure", required = true)
    protected String volumeMeasure;
    @XmlElement(name = "LateralArmFromMeasure")
    protected String lateralArmFromMeasure;
    @XmlElement(name = "LateralArmToMeasure")
    protected String lateralArmToMeasure;
    @XmlElement(name = "BalanceArmFWDMeasure")
    protected String balanceArmFWDMeasure;
    @XmlElement(name = "BalanceArmAFTMeasure")
    protected String balanceArmAFTMeasure;
    @XmlElement(name = "RemarksText")
    protected String remarksText;

    /**
     * Gets the value of the deckCode property.
     * 
     * @return
     *     possible object is
     *     {@link DeckCodeContentType }
     *     
     */
    public DeckCodeContentType getDeckCode() {
        return deckCode;
    }

    /**
     * Sets the value of the deckCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeckCodeContentType }
     *     
     */
    public void setDeckCode(DeckCodeContentType value) {
        this.deckCode = value;
    }

    /**
     * Gets the value of the maximumWeightMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumWeightMeasure() {
        return maximumWeightMeasure;
    }

    /**
     * Sets the value of the maximumWeightMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumWeightMeasure(String value) {
        this.maximumWeightMeasure = value;
    }

    /**
     * Gets the value of the volumeMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeMeasure() {
        return volumeMeasure;
    }

    /**
     * Sets the value of the volumeMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeMeasure(String value) {
        this.volumeMeasure = value;
    }

    /**
     * Gets the value of the lateralArmFromMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateralArmFromMeasure() {
        return lateralArmFromMeasure;
    }

    /**
     * Sets the value of the lateralArmFromMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateralArmFromMeasure(String value) {
        this.lateralArmFromMeasure = value;
    }

    /**
     * Gets the value of the lateralArmToMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLateralArmToMeasure() {
        return lateralArmToMeasure;
    }

    /**
     * Sets the value of the lateralArmToMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLateralArmToMeasure(String value) {
        this.lateralArmToMeasure = value;
    }

    /**
     * Gets the value of the balanceArmFWDMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceArmFWDMeasure() {
        return balanceArmFWDMeasure;
    }

    /**
     * Sets the value of the balanceArmFWDMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceArmFWDMeasure(String value) {
        this.balanceArmFWDMeasure = value;
    }

    /**
     * Gets the value of the balanceArmAFTMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalanceArmAFTMeasure() {
        return balanceArmAFTMeasure;
    }

    /**
     * Sets the value of the balanceArmAFTMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalanceArmAFTMeasure(String value) {
        this.balanceArmAFTMeasure = value;
    }

    /**
     * Gets the value of the remarksText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarksText() {
        return remarksText;
    }

    /**
     * Sets the value of the remarksText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarksText(String value) {
        this.remarksText = value;
    }

}
