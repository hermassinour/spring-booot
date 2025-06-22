
package com.springboot.dto.orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Associated Offer Detail definition.
 * 
 * <p>Java class for OfferDetailInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferDetailInfoAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OfferInstructionReferences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OfferPenaltyReferences" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OfferTermReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferDetailInfoAssocType", propOrder = {
    "offerInstructionReferences",
    "offerPenaltyReferences",
    "offerTermReferences"
})
public class OfferDetailInfoAssocType {

    @XmlElement(name = "OfferInstructionReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerInstructionReferences;
    @XmlElement(name = "OfferPenaltyReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerPenaltyReferences;
    @XmlElement(name = "OfferTermReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> offerTermReferences;

    /**
     * Gets the value of the offerInstructionReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferInstructionReferences() {
        return offerInstructionReferences;
    }

    /**
     * Sets the value of the offerInstructionReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferInstructionReferences(String value) {
        this.offerInstructionReferences = value;
    }

    /**
     * Gets the value of the offerPenaltyReferences property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferPenaltyReferences() {
        return offerPenaltyReferences;
    }

    /**
     * Sets the value of the offerPenaltyReferences property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferPenaltyReferences(String value) {
        this.offerPenaltyReferences = value;
    }

    /**
     * Gets the value of the offerTermReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerTermReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferTermReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferTermReferences() {
        if (offerTermReferences == null) {
            offerTermReferences = new ArrayList<String>();
        }
        return this.offerTermReferences;
    }

}
