
package com.springboot.dto.ordercancelrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Core Airline Representation.
 * 
 * Notes:
 *  1. This type contains the common properties for all defined Airline Supplier Role definitions, e.g. POA, Operating Carrier.
 *  2. This type is derived from SupplierCoreRepType.
 * 
 * <p>Java class for AirlineCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirlineCoreRepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}SupplierCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AirlineID"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CarrierNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirlineCoreRepType", propOrder = {
    "airlineID",
    "name"
})
@XmlSeeAlso({
    MarketingCarrierType.class,
    AirlineMsgPartyCoreType.class
})
public class AirlineCoreRepType
    extends SupplierCoreRepType
{

    @XmlElement(name = "AirlineID", required = true)
    protected AirlineID airlineID;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link AirlineID }
     *     
     */
    public AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirlineID }
     *     
     */
    public void setAirlineID(AirlineID value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
