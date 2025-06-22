
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Action to request new Offer Items for the specified Order.  If used in conjunction with a “Delete” function, the intention is to replace the deleted item with whatever has been requested in this Add function’s shopping query.
 * 
 * <p>Java class for AddOfferItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOfferItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Paxs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PaxsType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ResponseParametersType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ShoppingCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="FlightRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}FlightRequestType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOfferItemsType", propOrder = {
    "paxs",
    "responseParameters",
    "shoppingCriteria",
    "flightRequest"
})
public class AddOfferItemsType {

    @XmlElement(name = "Paxs")
    protected PaxsType paxs;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;
    @XmlElement(name = "FlightRequest", required = true)
    protected FlightRequestType flightRequest;

    /**
     * Gets the value of the paxs property.
     * 
     * @return
     *     possible object is
     *     {@link PaxsType }
     *     
     */
    public PaxsType getPaxs() {
        return paxs;
    }

    /**
     * Sets the value of the paxs property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxsType }
     *     
     */
    public void setPaxs(PaxsType value) {
        this.paxs = value;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
    }

    /**
     * Gets the value of the shoppingCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public ShoppingCriteriaType getShoppingCriteria() {
        return shoppingCriteria;
    }

    /**
     * Sets the value of the shoppingCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingCriteriaType }
     *     
     */
    public void setShoppingCriteria(ShoppingCriteriaType value) {
        this.shoppingCriteria = value;
    }

    /**
     * Gets the value of the flightRequest property.
     * 
     * @return
     *     possible object is
     *     {@link FlightRequestType }
     *     
     */
    public FlightRequestType getFlightRequest() {
        return flightRequest;
    }

    /**
     * Sets the value of the flightRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightRequestType }
     *     
     */
    public void setFlightRequest(FlightRequestType value) {
        this.flightRequest = value;
    }

}
