package com.springboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JacksonXmlRootElement(localName = "AirShoppingRQ")
public class AirShoppingRequest {

    @JacksonXmlProperty(localName = "Departure")
    private String departure;

    @JacksonXmlProperty(localName = "Destination")
    private String destination;

    // Constructors
    public AirShoppingRequest() {}

    public AirShoppingRequest(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    // Getters and Setters
    public String getDeparture() { return departure; }
    public void setDeparture(String departure) { this.departure = departure; }

    public String getDestination() { return destination; }
    public void setDestination(String destination) { this.destination = destination; }
}
