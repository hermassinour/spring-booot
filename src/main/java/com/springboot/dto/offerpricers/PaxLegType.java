
package com.springboot.dto.offerpricers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Transportation of a passenger on a Dated Operating Leg.
 * 
 * <p>Java class for PaxLegType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxLegType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatedOperatingLeg" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}DatedOperatingLegType"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="PaxLegID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxLegType", propOrder = {
    "datedOperatingLeg"
})
public class PaxLegType {

    @XmlElement(name = "DatedOperatingLeg", required = true)
    protected DatedOperatingLegType datedOperatingLeg;
    @XmlAttribute(name = "PaxLegID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String paxLegID;

    /**
     * Gets the value of the datedOperatingLeg property.
     * 
     * @return
     *     possible object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public DatedOperatingLegType getDatedOperatingLeg() {
        return datedOperatingLeg;
    }

    /**
     * Sets the value of the datedOperatingLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatedOperatingLegType }
     *     
     */
    public void setDatedOperatingLeg(DatedOperatingLegType value) {
        this.datedOperatingLeg = value;
    }

    /**
     * Gets the value of the paxLegID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxLegID() {
        return paxLegID;
    }

    /**
     * Sets the value of the paxLegID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxLegID(String value) {
        this.paxLegID = value;
    }

}
