
package com.springboot.dto.ordercreaterq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Use to select the quantity of Offer Items from the A La Carte Offer Items.
 * 
 * <p>Java class for SelectedALaCarteOfferItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedALaCarteOfferItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Qty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}QtyType"/&gt;
 *         &lt;element name="FlightAssociations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *                   &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedALaCarteOfferItemType", propOrder = {
    "qty",
    "flightAssociations"
})
public class SelectedALaCarteOfferItemType {

    @XmlElement(name = "Qty", required = true)
    protected BigDecimal qty;
    @XmlElement(name = "FlightAssociations")
    protected SelectedALaCarteOfferItemType.FlightAssociations flightAssociations;

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQty(BigDecimal value) {
        this.qty = value;
    }

    /**
     * Gets the value of the flightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link SelectedALaCarteOfferItemType.FlightAssociations }
     *     
     */
    public SelectedALaCarteOfferItemType.FlightAssociations getFlightAssociations() {
        return flightAssociations;
    }

    /**
     * Sets the value of the flightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectedALaCarteOfferItemType.FlightAssociations }
     *     
     */
    public void setFlightAssociations(SelectedALaCarteOfferItemType.FlightAssociations value) {
        this.flightAssociations = value;
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
     *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
     *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
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
        "paxJourneyRefID",
        "paxSegmentRefID"
    })
    public static class FlightAssociations {

        @XmlElement(name = "PaxJourneyRefID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String paxJourneyRefID;
        @XmlElement(name = "PaxSegmentRefID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String paxSegmentRefID;

        /**
         * Gets the value of the paxJourneyRefID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaxJourneyRefID() {
            return paxJourneyRefID;
        }

        /**
         * Sets the value of the paxJourneyRefID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaxJourneyRefID(String value) {
            this.paxJourneyRefID = value;
        }

        /**
         * Gets the value of the paxSegmentRefID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaxSegmentRefID() {
            return paxSegmentRefID;
        }

        /**
         * Sets the value of the paxSegmentRefID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaxSegmentRefID(String value) {
            this.paxSegmentRefID = value;
        }

    }

}
