
package com.springboot.dto.orderchangerq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A small piece of paper, fabric, plastic or similar material attached to an bag and giving information about it.
 * 
 * <p>Java class for BagTagType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagTagType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagTagID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BagTagID_Type" minOccurs="0"/&gt;
 *         &lt;element name="TagFallbackInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="TagInterlineInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="TagExpediteInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="IssuingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CarrierType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagTagType", propOrder = {
    "bagTagID",
    "tagFallbackInd",
    "tagInterlineInd",
    "tagExpediteInd",
    "issuingCarrier"
})
public class BagTagType {

    @XmlElement(name = "BagTagID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bagTagID;
    @XmlElement(name = "TagFallbackInd")
    protected Boolean tagFallbackInd;
    @XmlElement(name = "TagInterlineInd")
    protected Boolean tagInterlineInd;
    @XmlElement(name = "TagExpediteInd")
    protected Boolean tagExpediteInd;
    @XmlElement(name = "IssuingCarrier")
    protected CarrierType issuingCarrier;

    /**
     * Gets the value of the bagTagID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBagTagID() {
        return bagTagID;
    }

    /**
     * Sets the value of the bagTagID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBagTagID(String value) {
        this.bagTagID = value;
    }

    /**
     * Gets the value of the tagFallbackInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagFallbackInd() {
        return tagFallbackInd;
    }

    /**
     * Sets the value of the tagFallbackInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagFallbackInd(Boolean value) {
        this.tagFallbackInd = value;
    }

    /**
     * Gets the value of the tagInterlineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagInterlineInd() {
        return tagInterlineInd;
    }

    /**
     * Sets the value of the tagInterlineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagInterlineInd(Boolean value) {
        this.tagInterlineInd = value;
    }

    /**
     * Gets the value of the tagExpediteInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTagExpediteInd() {
        return tagExpediteInd;
    }

    /**
     * Sets the value of the tagExpediteInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTagExpediteInd(Boolean value) {
        this.tagExpediteInd = value;
    }

    /**
     * Gets the value of the issuingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierType }
     *     
     */
    public CarrierType getIssuingCarrier() {
        return issuingCarrier;
    }

    /**
     * Sets the value of the issuingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierType }
     *     
     */
    public void setIssuingCarrier(CarrierType value) {
        this.issuingCarrier = value;
    }

}
