
package com.springboot.dto.orderreshoprs;

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
 * Function used to request the repricing of an existing Order, possibly as a consequence of expired TimeLimits. Airline returns Offers/OfferItems that describe the changes incurred from the reprice request.
 * 
 * <p>Java class for RepricedOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepricedOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="OwnerTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDateInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigCodeType"/&gt;
 *         &lt;element name="RepricedOfferItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}RepricedOfferItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepricedOfferType", propOrder = {
    "offerRefID",
    "ownerTypeCode",
    "requestedDateInd",
    "ownerCode",
    "repricedOfferItem"
})
public class RepricedOfferType {

    @XmlElement(name = "OfferRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerRefID;
    @XmlElement(name = "OwnerTypeCode")
    @XmlSchemaType(name = "string")
    protected OwnerTypeContentType ownerTypeCode;
    @XmlElement(name = "RequestedDateInd")
    protected Boolean requestedDateInd;
    @XmlElement(name = "OwnerCode", required = true)
    protected String ownerCode;
    @XmlElement(name = "RepricedOfferItem", required = true)
    protected List<RepricedOfferItemType> repricedOfferItem;

    /**
     * Gets the value of the offerRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferRefID() {
        return offerRefID;
    }

    /**
     * Sets the value of the offerRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferRefID(String value) {
        this.offerRefID = value;
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
     * Gets the value of the requestedDateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestedDateInd() {
        return requestedDateInd;
    }

    /**
     * Sets the value of the requestedDateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestedDateInd(Boolean value) {
        this.requestedDateInd = value;
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
     * Gets the value of the repricedOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repricedOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepricedOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepricedOfferItemType }
     * 
     * 
     */
    public List<RepricedOfferItemType> getRepricedOfferItem() {
        if (repricedOfferItem == null) {
            repricedOfferItem = new ArrayList<RepricedOfferItemType>();
        }
        return this.repricedOfferItem;
    }

}
