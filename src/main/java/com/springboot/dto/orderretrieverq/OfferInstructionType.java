
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Offer Instructions.
 * 
 * <p>Java class for OfferInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferInstructionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ClassOfServiceUpgrade" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}OfferClassUpgradeType"/&gt;
 *         &lt;element name="FreeFormTextInstruction" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}FreeFormInstructionsType"/&gt;
 *         &lt;element name="SpecialBookingInstruction" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferInstructionType", propOrder = {
    "classOfServiceUpgrade",
    "freeFormTextInstruction",
    "specialBookingInstruction"
})
@XmlSeeAlso({
    com.springboot.dto.orderretrieverq.ListOfOfferInstructionsType.Instruction.class
})
public class OfferInstructionType {

    @XmlElement(name = "ClassOfServiceUpgrade")
    protected OfferClassUpgradeType classOfServiceUpgrade;
    @XmlElement(name = "FreeFormTextInstruction")
    protected FreeFormInstructionsType freeFormTextInstruction;
    @XmlElement(name = "SpecialBookingInstruction")
    protected String specialBookingInstruction;

    /**
     * Gets the value of the classOfServiceUpgrade property.
     * 
     * @return
     *     possible object is
     *     {@link OfferClassUpgradeType }
     *     
     */
    public OfferClassUpgradeType getClassOfServiceUpgrade() {
        return classOfServiceUpgrade;
    }

    /**
     * Sets the value of the classOfServiceUpgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferClassUpgradeType }
     *     
     */
    public void setClassOfServiceUpgrade(OfferClassUpgradeType value) {
        this.classOfServiceUpgrade = value;
    }

    /**
     * Gets the value of the freeFormTextInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link FreeFormInstructionsType }
     *     
     */
    public FreeFormInstructionsType getFreeFormTextInstruction() {
        return freeFormTextInstruction;
    }

    /**
     * Sets the value of the freeFormTextInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeFormInstructionsType }
     *     
     */
    public void setFreeFormTextInstruction(FreeFormInstructionsType value) {
        this.freeFormTextInstruction = value;
    }

    /**
     * Gets the value of the specialBookingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialBookingInstruction() {
        return specialBookingInstruction;
    }

    /**
     * Sets the value of the specialBookingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialBookingInstruction(String value) {
        this.specialBookingInstruction = value;
    }

}
