
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Results of the OrderReshop request including reshopped Offers or repriced Offer.
 * 
 * <p>Java class for ReshopResultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopResultsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="NoPriceChangeInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType"/&gt;
 *         &lt;element name="RepricedOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}RepricedOfferType"/&gt;
 *         &lt;element name="ReshopOffers" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopOffersType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopResultsType", propOrder = {
    "noPriceChangeInd",
    "repricedOffer",
    "reshopOffers"
})
public class ReshopResultsType {

    @XmlElement(name = "NoPriceChangeInd")
    protected Boolean noPriceChangeInd;
    @XmlElement(name = "RepricedOffer")
    protected RepricedOfferType repricedOffer;
    @XmlElement(name = "ReshopOffers")
    protected ReshopOffersType reshopOffers;

    /**
     * Gets the value of the noPriceChangeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoPriceChangeInd() {
        return noPriceChangeInd;
    }

    /**
     * Sets the value of the noPriceChangeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoPriceChangeInd(Boolean value) {
        this.noPriceChangeInd = value;
    }

    /**
     * Gets the value of the repricedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link RepricedOfferType }
     *     
     */
    public RepricedOfferType getRepricedOffer() {
        return repricedOffer;
    }

    /**
     * Sets the value of the repricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepricedOfferType }
     *     
     */
    public void setRepricedOffer(RepricedOfferType value) {
        this.repricedOffer = value;
    }

    /**
     * Gets the value of the reshopOffers property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopOffersType }
     *     
     */
    public ReshopOffersType getReshopOffers() {
        return reshopOffers;
    }

    /**
     * Sets the value of the reshopOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopOffersType }
     *     
     */
    public void setReshopOffers(ReshopOffersType value) {
        this.reshopOffers = value;
    }

}
