
package com.springboot.dto.offerpricers;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Additional Offers provided by the airline.
 * 
 * <p>Java class for OtherOffersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherOffersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ALaCarteOfferType" minOccurs="0"/&gt;
 *         &lt;element name="Offer" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}OfferType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherOffersType", propOrder = {
    "aLaCarteOffer",
    "offer"
})
public class OtherOffersType {

    @XmlElement(name = "ALaCarteOffer")
    protected ALaCarteOfferType aLaCarteOffer;
    @XmlElement(name = "Offer")
    protected List<OfferType> offer;

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
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferType }
     * 
     * 
     */
    public List<OfferType> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OfferType>();
        }
        return this.offer;
    }

}
