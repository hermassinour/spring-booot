
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A priced grouping of one or more services within an Offer.
 * 
 * <p>Java class for NameChangeOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameChangeOfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="NameChangeService" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameChangeServiceType"/&gt;
 *         &lt;element name="MandatoryInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="ModificationProhibitedInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PriceType"/&gt;
 *         &lt;element name="PaxNameChange" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PaxNameChangeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameChangeOfferItemType", propOrder = {
    "offerItemID",
    "nameChangeService",
    "mandatoryInd",
    "modificationProhibitedInd",
    "price",
    "paxNameChange"
})
public class NameChangeOfferItemType {

    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "NameChangeService", required = true)
    protected NameChangeServiceType nameChangeService;
    @XmlElement(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlElement(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "PaxNameChange")
    protected PaxNameChangeType paxNameChange;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the nameChangeService property.
     * 
     * @return
     *     possible object is
     *     {@link NameChangeServiceType }
     *     
     */
    public NameChangeServiceType getNameChangeService() {
        return nameChangeService;
    }

    /**
     * Sets the value of the nameChangeService property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameChangeServiceType }
     *     
     */
    public void setNameChangeService(NameChangeServiceType value) {
        this.nameChangeService = value;
    }

    /**
     * Gets the value of the mandatoryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * Sets the value of the mandatoryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the paxNameChange property.
     * 
     * @return
     *     possible object is
     *     {@link PaxNameChangeType }
     *     
     */
    public PaxNameChangeType getPaxNameChange() {
        return paxNameChange;
    }

    /**
     * Sets the value of the paxNameChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxNameChangeType }
     *     
     */
    public void setPaxNameChange(PaxNameChangeType value) {
        this.paxNameChange = value;
    }

}
