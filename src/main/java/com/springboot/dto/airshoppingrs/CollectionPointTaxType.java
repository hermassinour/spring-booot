
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Tax data breakdown by collection point for XF(Passenger Facility Fee) and ZP(federal tax segment) taxes.
 * 
 * <p>Java class for CollectionPointTaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionPointTaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirportAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AmountType"/&gt;
 *         &lt;element name="IATA_StationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}IATA_LocationCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionPointTaxType", propOrder = {
    "airportAmount",
    "iataStationCode"
})
public class CollectionPointTaxType {

    @XmlElement(name = "AirportAmount", required = true)
    protected AmountType airportAmount;
    @XmlElement(name = "IATA_StationCode", required = true)
    protected String iataStationCode;

    /**
     * Gets the value of the airportAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAirportAmount() {
        return airportAmount;
    }

    /**
     * Sets the value of the airportAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAirportAmount(AmountType value) {
        this.airportAmount = value;
    }

    /**
     * Gets the value of the iataStationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATAStationCode() {
        return iataStationCode;
    }

    /**
     * Sets the value of the iataStationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATAStationCode(String value) {
        this.iataStationCode = value;
    }

}
