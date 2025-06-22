
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The instance of a specific flight or Service Definition as it has been offered (and eventually ordered and consumed) in the context of a specific Offer and/or Order.
 * 
 * <p>Java class for ServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ServiceStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *         &lt;element name="ActionCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ActionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceTypeText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="MilestoneCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceAssociations" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ServiceAssociationsType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", propOrder = {
    "serviceID",
    "statusCode",
    "paxRefID",
    "actionCode",
    "descText",
    "serviceRefID",
    "statusDescText",
    "serviceTypeText",
    "expirationDateTime",
    "milestoneCode",
    "serviceAssociations"
})
public class ServiceType {

    @XmlElement(name = "ServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceID;
    @XmlElement(name = "StatusCode")
    @XmlSchemaType(name = "string")
    protected ServiceStatusCodeContentType statusCode;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "ActionCode")
    @XmlSchemaType(name = "string")
    protected ActionContentType actionCode;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "ServiceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceRefID;
    @XmlElement(name = "StatusDescText")
    protected String statusDescText;
    @XmlElement(name = "ServiceTypeText")
    protected String serviceTypeText;
    @XmlElement(name = "ExpirationDateTime")
    protected DateTimeType expirationDateTime;
    @XmlElement(name = "MilestoneCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String milestoneCode;
    @XmlElement(name = "ServiceAssociations", required = true)
    protected ServiceAssociationsType serviceAssociations;

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStatusCodeContentType }
     *     
     */
    public ServiceStatusCodeContentType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStatusCodeContentType }
     *     
     */
    public void setStatusCode(ServiceStatusCodeContentType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionContentType }
     *     
     */
    public ActionContentType getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionContentType }
     *     
     */
    public void setActionCode(ActionContentType value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the serviceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRefID() {
        return serviceRefID;
    }

    /**
     * Sets the value of the serviceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRefID(String value) {
        this.serviceRefID = value;
    }

    /**
     * Gets the value of the statusDescText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescText() {
        return statusDescText;
    }

    /**
     * Sets the value of the statusDescText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescText(String value) {
        this.statusDescText = value;
    }

    /**
     * Gets the value of the serviceTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceTypeText() {
        return serviceTypeText;
    }

    /**
     * Sets the value of the serviceTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceTypeText(String value) {
        this.serviceTypeText = value;
    }

    /**
     * Gets the value of the expirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getExpirationDateTime() {
        return expirationDateTime;
    }

    /**
     * Sets the value of the expirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setExpirationDateTime(DateTimeType value) {
        this.expirationDateTime = value;
    }

    /**
     * Gets the value of the milestoneCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMilestoneCode() {
        return milestoneCode;
    }

    /**
     * Sets the value of the milestoneCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMilestoneCode(String value) {
        this.milestoneCode = value;
    }

    /**
     * Gets the value of the serviceAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public ServiceAssociationsType getServiceAssociations() {
        return serviceAssociations;
    }

    /**
     * Sets the value of the serviceAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceAssociationsType }
     *     
     */
    public void setServiceAssociations(ServiceAssociationsType value) {
        this.serviceAssociations = value;
    }

}
