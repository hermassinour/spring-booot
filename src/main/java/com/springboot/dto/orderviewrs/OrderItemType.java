
package com.springboot.dto.orderviewrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A selected Offer Item.
 * 
 * <p>Java class for OrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItemID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OwnerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="WebAddressURI" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}UniformResourceID_Type" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OrderItemStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="TicketingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="InventoryGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="BilateralProcessTimeLimit" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}BilateralProcessTimeLimitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Disclosure" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DisclosureType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}FareDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OrderItemDetails" minOccurs="0"/&gt;
 *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PenaltyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PriceType"/&gt;
 *         &lt;element name="Service" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ServiceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemType", propOrder = {
    "orderItemID",
    "ownerCode",
    "ownerTypeCode",
    "creationDateTime",
    "webAddressURI",
    "statusCode",
    "depositTimeLimitDateTime",
    "namingTimeLimitDateTime",
    "paymentTimeLimitDateTime",
    "priceGuaranteeTimeLimitDateTime",
    "ticketingTimeLimitDateTime",
    "inventoryGuaranteeTimeLimitDateTime",
    "inventoryGuaranteeID",
    "bilateralProcessTimeLimit",
    "disclosure",
    "fareDetail",
    "orderItemDetails",
    "penalty",
    "price",
    "service"
})
public class OrderItemType {

    @XmlElement(name = "OrderItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String orderItemID;
    @XmlElement(name = "OwnerCode")
    protected String ownerCode;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "string")
    protected OwnerTypeContentType ownerTypeCode;
    @XmlElement(name = "CreationDateTime")
    protected DateTimeType creationDateTime;
    @XmlElement(name = "WebAddressURI")
    @XmlSchemaType(name = "anyURI")
    protected String webAddressURI;
    @XmlElement(name = "StatusCode")
    protected String statusCode;
    @XmlElement(name = "DepositTimeLimitDateTime")
    protected DateTimeType depositTimeLimitDateTime;
    @XmlElement(name = "NamingTimeLimitDateTime")
    protected DateTimeType namingTimeLimitDateTime;
    @XmlElement(name = "PaymentTimeLimitDateTime")
    protected DateTimeType paymentTimeLimitDateTime;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "TicketingTimeLimitDateTime")
    protected DateTimeType ticketingTimeLimitDateTime;
    @XmlElement(name = "InventoryGuaranteeTimeLimitDateTime")
    protected DateTimeType inventoryGuaranteeTimeLimitDateTime;
    @XmlElement(name = "InventoryGuaranteeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String inventoryGuaranteeID;
    @XmlElement(name = "BilateralProcessTimeLimit")
    protected List<BilateralProcessTimeLimitType> bilateralProcessTimeLimit;
    @XmlElement(name = "Disclosure")
    protected List<DisclosureType> disclosure;
    @XmlElement(name = "FareDetail")
    protected List<FareDetailType> fareDetail;
    @XmlElement(name = "OrderItemDetails")
    protected OrderItemDetails orderItemDetails;
    @XmlElement(name = "Penalty")
    protected List<PenaltyType> penalty;
    @XmlElement(name = "Price", required = true)
    protected PriceType price;
    @XmlElement(name = "Service", required = true)
    protected List<ServiceType> service;

    /**
     * Gets the value of the orderItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderItemID() {
        return orderItemID;
    }

    /**
     * Sets the value of the orderItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderItemID(String value) {
        this.orderItemID = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

    /**
     * Gets the value of the ownerTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link OwnerTypeContentType }
     *     
     */
    public OwnerTypeContentType getOwnerTypeCode() {
        return ownerTypeCode;
    }

    /**
     * Sets the value of the ownerTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OwnerTypeContentType }
     *     
     */
    public void setOwnerTypeCode(OwnerTypeContentType value) {
        this.ownerTypeCode = value;
    }

    /**
     * Gets the value of the creationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Sets the value of the creationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setCreationDateTime(DateTimeType value) {
        this.creationDateTime = value;
    }

    /**
     * Gets the value of the webAddressURI property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebAddressURI() {
        return webAddressURI;
    }

    /**
     * Sets the value of the webAddressURI property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebAddressURI(String value) {
        this.webAddressURI = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the depositTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDepositTimeLimitDateTime(DateTimeType value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the namingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setNamingTimeLimitDateTime(DateTimeType value) {
        this.namingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the paymentTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPaymentTimeLimitDateTime(DateTimeType value) {
        this.paymentTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the ticketingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTicketingTimeLimitDateTime() {
        return ticketingTimeLimitDateTime;
    }

    /**
     * Sets the value of the ticketingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTicketingTimeLimitDateTime(DateTimeType value) {
        this.ticketingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the inventoryGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getInventoryGuaranteeTimeLimitDateTime() {
        return inventoryGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the inventoryGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setInventoryGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.inventoryGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the inventoryGuaranteeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInventoryGuaranteeID() {
        return inventoryGuaranteeID;
    }

    /**
     * Sets the value of the inventoryGuaranteeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInventoryGuaranteeID(String value) {
        this.inventoryGuaranteeID = value;
    }

    /**
     * Gets the value of the bilateralProcessTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralProcessTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilateralProcessTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralProcessTimeLimitType }
     * 
     * 
     */
    public List<BilateralProcessTimeLimitType> getBilateralProcessTimeLimit() {
        if (bilateralProcessTimeLimit == null) {
            bilateralProcessTimeLimit = new ArrayList<BilateralProcessTimeLimitType>();
        }
        return this.bilateralProcessTimeLimit;
    }

    /**
     * Gets the value of the disclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureType }
     * 
     * 
     */
    public List<DisclosureType> getDisclosure() {
        if (disclosure == null) {
            disclosure = new ArrayList<DisclosureType>();
        }
        return this.disclosure;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FareDetailType }
     * 
     * 
     */
    public List<FareDetailType> getFareDetail() {
        if (fareDetail == null) {
            fareDetail = new ArrayList<FareDetailType>();
        }
        return this.fareDetail;
    }

    /**
     * Gets the value of the orderItemDetails property.
     * 
     * @return
     *     possible object is
     *     {@link OrderItemDetails }
     *     
     */
    public OrderItemDetails getOrderItemDetails() {
        return orderItemDetails;
    }

    /**
     * Sets the value of the orderItemDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderItemDetails }
     *     
     */
    public void setOrderItemDetails(OrderItemDetails value) {
        this.orderItemDetails = value;
    }

    /**
     * Gets the value of the penalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the penalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPenalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyType }
     * 
     * 
     */
    public List<PenaltyType> getPenalty() {
        if (penalty == null) {
            penalty = new ArrayList<PenaltyType>();
        }
        return this.penalty;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     * 
     * 
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

}
