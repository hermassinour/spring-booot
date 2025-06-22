
package com.springboot.dto.orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Reshopped Carrier Offers.
 * 
 * <p>Java class for ReshopOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopOffersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ALaCarteOfferType" minOccurs="0"/&gt;
 *         &lt;element name="ReshopOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopOffersType", propOrder = {
    "aLaCarteOffer",
    "reshopOffer"
})
public class ReshopOffersType {

    @XmlElement(name = "ALaCarteOffer")
    protected ALaCarteOfferType aLaCarteOffer;
    @XmlElement(name = "ReshopOffer")
    protected List<OfferType> reshopOffer;

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public ALaCarteOfferType getALaCarteOffer() {
        return aLaCarteOffer;
    }

    /**
     * Sets the value of the aLaCarteOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public void setALaCarteOffer(ALaCarteOfferType value) {
        this.aLaCarteOffer = value;
    }

    /**
     * Gets the value of the reshopOffer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reshopOffer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReshopOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getReshopOffer() {
        if (reshopOffer == null) {
            reshopOffer = new ArrayList<OfferType>();
        }
        return this.reshopOffer;
    }

}
