
package com.springboot.dto.offerpricerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A piece of luggage associated with a passenger, packed for traveling, and necessary or appropriate in connection with a journey.
 * 
 * <p>Java class for BagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagDimension" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagDimensionType" minOccurs="0"/&gt;
 *         &lt;element name="BagTag" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BagTagType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagType", propOrder = {
    "bagDimension",
    "bagTag"
})
public class BagType {

    @XmlElement(name = "BagDimension")
    protected BagDimensionType bagDimension;
    @XmlElement(name = "BagTag")
    protected BagTagType bagTag;

    /**
     * Gets the value of the bagDimension property.
     * 
     * @return
     *     possible object is
     *     {@link BagDimensionType }
     *     
     */
    public BagDimensionType getBagDimension() {
        return bagDimension;
    }

    /**
     * Sets the value of the bagDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagDimensionType }
     *     
     */
    public void setBagDimension(BagDimensionType value) {
        this.bagDimension = value;
    }

    /**
     * Gets the value of the bagTag property.
     * 
     * @return
     *     possible object is
     *     {@link BagTagType }
     *     
     */
    public BagTagType getBagTag() {
        return bagTag;
    }

    /**
     * Sets the value of the bagTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagTagType }
     *     
     */
    public void setBagTag(BagTagType value) {
        this.bagTag = value;
    }

}
