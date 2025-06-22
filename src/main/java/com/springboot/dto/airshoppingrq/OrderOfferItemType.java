
package com.springboot.dto.airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OFFER ITEM IN ORDER definition.
 * 
 * <p>Java class for OrderOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderOfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferItemID"/&gt;
 *         &lt;element name="OfferItemType"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BaggageItem" maxOccurs="unbounded"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DetailedFlightItem" maxOccurs="unbounded"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherItem" maxOccurs="unbounded"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}SeatItem" maxOccurs="unbounded"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferItemTimeLimitSetType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderOfferItemType", propOrder = {
    "offerItemID",
    "offerItemType",
    "timeLimits"
})
public class OrderOfferItemType {

    @XmlElement(name = "OfferItemID", required = true)
    protected ItemIDType offerItemID;
    @XmlElement(name = "OfferItemType", required = true)
    protected OrderOfferItemType.OfferItemType offerItemType;
    @XmlElement(name = "TimeLimits")
    protected OfferItemTimeLimitSetType timeLimits;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the offerItemID property.
     * 
     * @return
     *     possible object is
     *     {@link ItemIDType }
     *     
     */
    public ItemIDType getOfferItemID() {
        return offerItemID;
    }

    /**
     * Sets the value of the offerItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemIDType }
     *     
     */
    public void setOfferItemID(ItemIDType value) {
        this.offerItemID = value;
    }

    /**
     * Gets the value of the offerItemType property.
     * 
     * @return
     *     possible object is
     *     {@link OrderOfferItemType.OfferItemType }
     *     
     */
    public OrderOfferItemType.OfferItemType getOfferItemType() {
        return offerItemType;
    }

    /**
     * Sets the value of the offerItemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderOfferItemType.OfferItemType }
     *     
     */
    public void setOfferItemType(OrderOfferItemType.OfferItemType value) {
        this.offerItemType = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public OfferItemTimeLimitSetType getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemTimeLimitSetType }
     *     
     */
    public void setTimeLimits(OfferItemTimeLimitSetType value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BaggageItem" maxOccurs="unbounded"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DetailedFlightItem" maxOccurs="unbounded"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherItem" maxOccurs="unbounded"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}SeatItem" maxOccurs="unbounded"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "baggageItem",
        "detailedFlightItem",
        "otherItem",
        "seatItem"
    })
    public static class OfferItemType {

        @XmlElement(name = "BaggageItem")
        protected List<BaggageItemType> baggageItem;
        @XmlElement(name = "DetailedFlightItem")
        protected List<FlightItemType> detailedFlightItem;
        @XmlElement(name = "OtherItem")
        protected List<OtherItemType> otherItem;
        @XmlElement(name = "SeatItem")
        protected List<SeatItem> seatItem;

        /**
         * Gets the value of the baggageItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the baggageItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBaggageItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BaggageItemType }
         * 
         * 
         */
        public List<BaggageItemType> getBaggageItem() {
            if (baggageItem == null) {
                baggageItem = new ArrayList<BaggageItemType>();
            }
            return this.baggageItem;
        }

        /**
         * Flight Offer Item.Gets the value of the detailedFlightItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detailedFlightItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetailedFlightItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightItemType }
         * 
         * 
         */
        public List<FlightItemType> getDetailedFlightItem() {
            if (detailedFlightItem == null) {
                detailedFlightItem = new ArrayList<FlightItemType>();
            }
            return this.detailedFlightItem;
        }

        /**
         * Gets the value of the otherItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherItemType }
         * 
         * 
         */
        public List<OtherItemType> getOtherItem() {
            if (otherItem == null) {
                otherItem = new ArrayList<OtherItemType>();
            }
            return this.otherItem;
        }

        /**
         * Gets the value of the seatItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatItem }
         * 
         * 
         */
        public List<SeatItem> getSeatItem() {
            if (seatItem == null) {
                seatItem = new ArrayList<SeatItem>();
            }
            return this.seatItem;
        }

    }

}
