
package com.springboot.dto.orderreshoprs;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * BAGGAGE QUERY Metadata definition.
 * 
 * <p>Java class for BaggageQueryMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageQueryMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketIssuePlace" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="TicketIssueCountry" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CountrySimpleType" minOccurs="0"/&gt;
 *         &lt;element name="PassengerCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CurrencyAmountOptType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageQueryMetadataType", propOrder = {
    "ticketIssuePlace",
    "ticketIssueCountry",
    "passengerCount",
    "totalPrice"
})
public class BaggageQueryMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "TicketIssuePlace")
    protected String ticketIssuePlace;
    @XmlElement(name = "TicketIssueCountry")
    protected String ticketIssueCountry;
    @XmlElement(name = "PassengerCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger passengerCount;
    @XmlElement(name = "TotalPrice")
    protected CurrencyAmountOptType totalPrice;

    /**
     * Gets the value of the ticketIssuePlace property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssuePlace() {
        return ticketIssuePlace;
    }

    /**
     * Sets the value of the ticketIssuePlace property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssuePlace(String value) {
        this.ticketIssuePlace = value;
    }

    /**
     * Gets the value of the ticketIssueCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketIssueCountry() {
        return ticketIssueCountry;
    }

    /**
     * Sets the value of the ticketIssueCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketIssueCountry(String value) {
        this.ticketIssueCountry = value;
    }

    /**
     * Gets the value of the passengerCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPassengerCount() {
        return passengerCount;
    }

    /**
     * Sets the value of the passengerCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPassengerCount(BigInteger value) {
        this.passengerCount = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public CurrencyAmountOptType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountOptType }
     *     
     */
    public void setTotalPrice(CurrencyAmountOptType value) {
        this.totalPrice = value;
    }

}
