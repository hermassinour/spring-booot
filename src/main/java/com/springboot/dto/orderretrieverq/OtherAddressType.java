
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Other Contact Method information. E.g. web site URL, social media handle.
 * 
 * <p>Java class for OtherAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OtherAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TextType"/&gt;
 *         &lt;element name="OtherAddressText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TextType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OtherAddressType", propOrder = {
    "labelText",
    "otherAddressText"
})
public class OtherAddressType {

    @XmlElement(name = "LabelText", required = true)
    protected String labelText;
    @XmlElement(name = "OtherAddressText", required = true)
    protected String otherAddressText;

    /**
     * Gets the value of the labelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * Sets the value of the labelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelText(String value) {
        this.labelText = value;
    }

    /**
     * Gets the value of the otherAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAddressText() {
        return otherAddressText;
    }

    /**
     * Sets the value of the otherAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAddressText(String value) {
        this.otherAddressText = value;
    }

}
