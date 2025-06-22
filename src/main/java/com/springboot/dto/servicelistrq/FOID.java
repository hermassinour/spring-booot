
package com.springboot.dto.servicelistrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Form of identification.  Typically used to identify that the passenger is who he says he is.  This is the type of FOID as defined in AIRIMP (FF Number, Credit Card Number, etc.).
 * 
 * <p>Java class for FOID complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FOID"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CreditCardVendorCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}CreditCardVendorCodeType" minOccurs="0"/&gt;
 *         &lt;element name="FOID_ID" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}ID_Type"/&gt;
 *         &lt;element name="FOID_TypeText" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRQ}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FOID", propOrder = {
    "creditCardVendorCode",
    "foidid",
    "foidTypeText"
})
public class FOID {

    @XmlElement(name = "CreditCardVendorCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String creditCardVendorCode;
    @XmlElement(name = "FOID_ID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String foidid;
    @XmlElement(name = "FOID_TypeText", required = true)
    protected String foidTypeText;

    /**
     * Gets the value of the creditCardVendorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCardVendorCode() {
        return creditCardVendorCode;
    }

    /**
     * Sets the value of the creditCardVendorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCardVendorCode(String value) {
        this.creditCardVendorCode = value;
    }

    /**
     * Gets the value of the foidid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDID() {
        return foidid;
    }

    /**
     * Sets the value of the foidid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDID(String value) {
        this.foidid = value;
    }

    /**
     * Gets the value of the foidTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFOIDTypeText() {
        return foidTypeText;
    }

    /**
     * Sets the value of the foidTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFOIDTypeText(String value) {
        this.foidTypeText = value;
    }

}
