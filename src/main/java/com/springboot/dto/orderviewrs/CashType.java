
package com.springboot.dto.orderviewrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Any payment that is collected by the agent and settled between the Airline and the agent. Refer to IATA Resolution 728 Attachment A for full details.
 * 
 * <p>Java class for CashType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReceiptID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="TerminalID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="CollectionAddress" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PostalAddressType" minOccurs="0"/&gt;
 *         &lt;element name="TravelAgent" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TravelAgentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashType", propOrder = {
    "receiptID",
    "terminalID",
    "collectionAddress",
    "travelAgent"
})
public class CashType {

    @XmlElement(name = "ReceiptID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String receiptID;
    @XmlElement(name = "TerminalID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String terminalID;
    @XmlElement(name = "CollectionAddress")
    protected PostalAddressType collectionAddress;
    @XmlElement(name = "TravelAgent")
    protected TravelAgentType travelAgent;

    /**
     * Gets the value of the receiptID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiptID() {
        return receiptID;
    }

    /**
     * Sets the value of the receiptID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiptID(String value) {
        this.receiptID = value;
    }

    /**
     * Gets the value of the terminalID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminalID() {
        return terminalID;
    }

    /**
     * Sets the value of the terminalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminalID(String value) {
        this.terminalID = value;
    }

    /**
     * Gets the value of the collectionAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddressType }
     *     
     */
    public PostalAddressType getCollectionAddress() {
        return collectionAddress;
    }

    /**
     * Sets the value of the collectionAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddressType }
     *     
     */
    public void setCollectionAddress(PostalAddressType value) {
        this.collectionAddress = value;
    }

    /**
     * Gets the value of the travelAgent property.
     * 
     * @return
     *     possible object is
     *     {@link TravelAgentType }
     *     
     */
    public TravelAgentType getTravelAgent() {
        return travelAgent;
    }

    /**
     * Sets the value of the travelAgent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravelAgentType }
     *     
     */
    public void setTravelAgent(TravelAgentType value) {
        this.travelAgent = value;
    }

}
