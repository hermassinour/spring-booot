
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
 * Associations to Offers and Offer Items, including the corresponding Shopping Response ID.
 * 
 * <p>Java class for OfferAssocationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferAssocationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="OwnerRefCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigCodeType"/&gt;
 *         &lt;element name="ResponseRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="OfferItemRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="99" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferAssocationsType", propOrder = {
    "offerRefID",
    "ownerRefCode",
    "responseRefID",
    "offerItemRefID"
})
public class OfferAssocationsType {

    @XmlElement(name = "OfferRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;
    @XmlElement(name = "OwnerRefCode", required = true)
    protected String ownerRefCode;
    @XmlElement(name = "ResponseRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String responseRefID;
    @XmlElement(name = "OfferItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> offerItemRefID;

    /**
     * Gets the value of the offerRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRefID() {
        return offerRefID;
    }

    /**
     * Sets the value of the offerRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRefID(String value) {
        this.offerRefID = value;
    }

    /**
     * Gets the value of the ownerRefCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerRefCode() {
        return ownerRefCode;
    }

    /**
     * Sets the value of the ownerRefCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerRefCode(String value) {
        this.ownerRefCode = value;
    }

    /**
     * Gets the value of the responseRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseRefID() {
        return responseRefID;
    }

    /**
     * Sets the value of the responseRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseRefID(String value) {
        this.responseRefID = value;
    }

    /**
     * Gets the value of the offerItemRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerItemRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferItemRefID() {
        if (offerItemRefID == null) {
            offerItemRefID = new ArrayList<String>();
        }
        return this.offerItemRefID;
    }

}
