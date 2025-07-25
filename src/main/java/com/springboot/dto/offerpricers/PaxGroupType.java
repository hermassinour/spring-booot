
package com.springboot.dto.offerpricers;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A number of individual passengers traveling under one commercial name that associates them. Passengers of a group have a homogenous itinerary, i.e. use the same segments. Group bookings are subject to special booking rules and may be eligible for special
 * 
 * <p>Java class for PaxGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxGroupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxGroupID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type"/&gt;
 *         &lt;element name="IntendedPaxQty" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}QtyType"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}NameType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxGroupType", propOrder = {
    "paxGroupID",
    "intendedPaxQty",
    "name"
})
public class PaxGroupType {

    @XmlElement(name = "PaxGroupID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxGroupID;
    @XmlElement(name = "IntendedPaxQty", required = true)
    protected BigDecimal intendedPaxQty;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    /**
     * Gets the value of the paxGroupID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxGroupID() {
        return paxGroupID;
    }

    /**
     * Sets the value of the paxGroupID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxGroupID(String value) {
        this.paxGroupID = value;
    }

    /**
     * Gets the value of the intendedPaxQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIntendedPaxQty() {
        return intendedPaxQty;
    }

    /**
     * Sets the value of the intendedPaxQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIntendedPaxQty(BigDecimal value) {
        this.intendedPaxQty = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
