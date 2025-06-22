
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * AirShoppingRQ payload information.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FlightRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}FlightRequestType"/&gt;
 *         &lt;element name="Paxs" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PaxsType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ResponseParametersType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShoppingCriteriaType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "flightRequest",
    "paxs",
    "responseParameters",
    "shoppingCriteria"
})
public class RequestType {

    @XmlElement(name = "FlightRequest", required = true)
    protected FlightRequestType flightRequest;
    @XmlElement(name = "Paxs")
    protected PaxsType paxs;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingCriteria")
    protected ShoppingCriteriaType shoppingCriteria;

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

}
