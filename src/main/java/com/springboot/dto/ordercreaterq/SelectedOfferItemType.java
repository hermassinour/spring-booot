
package com.springboot.dto.ordercreaterq;

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
 * OfferItem selected by the Passenger for inclusion in the requested Order. Repeat occurrence of OfferItem (once per passenger) if different passengers want to select different service options, different quantities of a-la-carte items or different seat loc
 * 
 * <p>Java class for SelectedOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedOfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OfferItemID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SelectedALaCarteOfferItem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SelectedALaCarteOfferItemType" minOccurs="0"/&gt;
 *         &lt;element name="SelectedBundleServices" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SelectedBundleServicesType" minOccurs="0"/&gt;
 *         &lt;element name="SelectedSeat" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SelectedSeatType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedOfferItemType", propOrder = {
    "offerItemID",
    "paxRefID",
    "selectedALaCarteOfferItem",
    "selectedBundleServices",
    "selectedSeat"
})
public class SelectedOfferItemType {

    @XmlElement(name = "OfferItemID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String offerItemID;
    @XmlElement(name = "PaxRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "SelectedALaCarteOfferItem")
    protected SelectedALaCarteOfferItemType selectedALaCarteOfferItem;
    @XmlElement(name = "SelectedBundleServices")
    protected SelectedBundleServicesType selectedBundleServices;
    @XmlElement(name = "SelectedSeat")
    protected SelectedSeatType selectedSeat;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfferItemID(String value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxRefID() {
        if (paxRefID == null) {
            paxRefID = new ArrayList<String>();
        }
        return this.paxRefID;
    }

    /**
     * Gets the value of the selectedALaCarteOfferItem property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedALaCarteOfferItemType }
     *     
     */
    public SelectedALaCarteOfferItemType getSelectedALaCarteOfferItem() {
        return selectedALaCarteOfferItem;
    }

    /**
     * Sets the value of the selectedALaCarteOfferItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedALaCarteOfferItemType }
     *     
     */
    public void setSelectedALaCarteOfferItem(SelectedALaCarteOfferItemType value) {
        this.selectedALaCarteOfferItem = value;
    }

    /**
     * Gets the value of the selectedBundleServices property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedBundleServicesType }
     *     
     */
    public SelectedBundleServicesType getSelectedBundleServices() {
        return selectedBundleServices;
    }

    /**
     * Sets the value of the selectedBundleServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedBundleServicesType }
     *     
     */
    public void setSelectedBundleServices(SelectedBundleServicesType value) {
        this.selectedBundleServices = value;
    }

    /**
     * Gets the value of the selectedSeat property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedSeatType }
     *     
     */
    public SelectedSeatType getSelectedSeat() {
        return selectedSeat;
    }

    /**
     * Sets the value of the selectedSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedSeatType }
     *     
     */
    public void setSelectedSeat(SelectedSeatType value) {
        this.selectedSeat = value;
    }

}
