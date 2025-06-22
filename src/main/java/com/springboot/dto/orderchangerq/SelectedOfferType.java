
package com.springboot.dto.orderchangerq;

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
 * Offer selected by the Passenger for requesting an Order to be created. Multiple Offers can be requested at the same time, each of which could originate from different shopping responses (each with their own ResponseIDs).   Each Offer selected could ref
 * 
 * <p>Java class for SelectedOfferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedOfferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ID_Type"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AirlineDesigCodeType"/&gt;
 *         &lt;element name="ShoppingResponseRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ID_Type"/&gt;
 *         &lt;element name="TotalOfferPriceAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="SelectedOfferItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SelectedOfferItemType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedOfferType", propOrder = {
    "offerID",
    "ownerCode",
    "shoppingResponseRefID",
    "totalOfferPriceAmount",
    "selectedOfferItem"
})
public class SelectedOfferType {

    @XmlElement(name = "OfferID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerID;
    @XmlElement(name = "OwnerCode", required = true)
    protected String ownerCode;
    @XmlElement(name = "ShoppingResponseRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String shoppingResponseRefID;
    @XmlElement(name = "TotalOfferPriceAmount")
    protected AmountType totalOfferPriceAmount;
    @XmlElement(name = "SelectedOfferItem", required = true)
    protected List<SelectedOfferItemType> selectedOfferItem;

    /**
     * Gets the value of the offerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferID() {
        return offerID;
    }

    /**
     * Sets the value of the offerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferID(String value) {
        this.offerID = value;
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
     * Gets the value of the shoppingResponseRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShoppingResponseRefID() {
        return shoppingResponseRefID;
    }

    /**
     * Sets the value of the shoppingResponseRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShoppingResponseRefID(String value) {
        this.shoppingResponseRefID = value;
    }

    /**
     * Gets the value of the totalOfferPriceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalOfferPriceAmount() {
        return totalOfferPriceAmount;
    }

    /**
     * Sets the value of the totalOfferPriceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalOfferPriceAmount(AmountType value) {
        this.totalOfferPriceAmount = value;
    }

    /**
     * Gets the value of the selectedOfferItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedOfferItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedOfferItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SelectedOfferItemType }
     * 
     * 
     */
    public List<SelectedOfferItemType> getSelectedOfferItem() {
        if (selectedOfferItem == null) {
            selectedOfferItem = new ArrayList<SelectedOfferItemType>();
        }
        return this.selectedOfferItem;
    }

}
