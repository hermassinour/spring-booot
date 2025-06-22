
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for Device identification.
 * 
 * <p>Java class for V172_DeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_DeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CodesetType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Position" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PhoneNumber" minOccurs="0"/&gt;
 *         &lt;element name="IP_Address" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ShortDescSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="MAC_Address" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ShortDescSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ProperNameSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_DeviceType", propOrder = {
    "type",
    "phoneNumber",
    "ipAddress",
    "macAddress",
    "name"
})
@XmlSeeAlso({
    com.springboot.dto.orderretrieverq.SecurePaymentAlertType.Details.CustomerDevice.class,
    com.springboot.dto.orderretrieverq.PinPhraseAnswerType.Device.class,
    com.springboot.dto.orderretrieverq.PinPhraseQuestionType.Device.class
})
public class V172DeviceType {

    @XmlElement(name = "Type")
    protected V172DeviceType.Type type;
    @XmlElement(name = "PhoneNumber")
    protected V172PhoneType phoneNumber;
    @XmlElement(name = "IP_Address")
    protected String ipAddress;
    @XmlElement(name = "MAC_Address")
    protected String macAddress;
    @XmlElement(name = "Name")
    protected String name;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link V172DeviceType.Type }
     *     
     */
    public V172DeviceType.Type getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172DeviceType.Type }
     *     
     */
    public void setType(V172DeviceType.Type value) {
        this.type = value;
    }

    /**
     * Provides telephone information, and allows to specify telephone number application (ie Home, Business, etc.). May be used for a simle, unstrucutured number, or, in combination with child attributes allows to create a structured telephone number (ie Country Code number, Area Code numbers, etc.)
     * 
     * @return
     *     possible object is
     *     {@link V172PhoneType }
     *     
     */
    public V172PhoneType getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the value of the phoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172PhoneType }
     *     
     */
    public void setPhoneNumber(V172PhoneType value) {
        this.phoneNumber = value;
    }

    /**
     * Gets the value of the ipAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPAddress() {
        return ipAddress;
    }

    /**
     * Sets the value of the ipAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPAddress(String value) {
        this.ipAddress = value;
    }

    /**
     * Gets the value of the macAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMACAddress() {
        return macAddress;
    }

    /**
     * Sets the value of the macAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMACAddress(String value) {
        this.macAddress = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CodesetType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Position" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "position"
    })
    public static class Type
        extends CodesetType
    {

        @XmlElement(name = "Position")
        protected Position position;

        /**
         * Device position and geocoding coordinates.
         * 
         * @return
         *     possible object is
         *     {@link Position }
         *     
         */
        public Position getPosition() {
            return position;
        }

        /**
         * Sets the value of the position property.
         * 
         * @param value
         *     allowed object is
         *     {@link Position }
         *     
         */
        public void setPosition(Position value) {
            this.position = value;
        }

    }

}
