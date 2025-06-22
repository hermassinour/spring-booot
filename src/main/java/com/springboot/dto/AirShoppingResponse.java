package com.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "AirShoppingRS")
public class AirShoppingResponse {

    @JacksonXmlProperty(localName = "OfferID")
    private String offerId;

    @JacksonXmlProperty(localName = "TotalPrice")
    private String totalPrice;

    // Constructors
    public AirShoppingResponse() {}

    public AirShoppingResponse(String offerId, String totalPrice) {
        this.offerId = offerId;
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public String getOfferId() { return offerId; }
    public void setOfferId(String offerId) { this.offerId = offerId; }

    public String getTotalPrice() { return totalPrice; }
    public void setTotalPrice(String totalPrice) { this.totalPrice = totalPrice; }
}
