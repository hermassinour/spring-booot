
package com.springboot.dto.offerpricerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AddressCore"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AddressDetail"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addressCore",
    "addressDetail"
})
@XmlRootElement(name = "Address")
public class Address {

    @XmlElement(name = "AddressCore")
    protected AddressCoreType addressCore;
    @XmlElement(name = "AddressDetail")
    protected AddressDetailType addressDetail;

    /**
     * Gets the value of the addressCore property.
     * 
     * @return
     *     possible object is
     *     {@link AddressCoreType }
     *     
     */
    public AddressCoreType getAddressCore() {
        return addressCore;
    }

    /**
     * Sets the value of the addressCore property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressCoreType }
     *     
     */
    public void setAddressCore(AddressCoreType value) {
        this.addressCore = value;
    }

    /**
     * Gets the value of the addressDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AddressDetailType }
     *     
     */
    public AddressDetailType getAddressDetail() {
        return addressDetail;
    }

    /**
     * Sets the value of the addressDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressDetailType }
     *     
     */
    public void setAddressDetail(AddressDetailType value) {
        this.addressDetail = value;
    }

}
