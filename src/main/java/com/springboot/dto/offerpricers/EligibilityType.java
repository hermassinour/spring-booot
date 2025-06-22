
package com.springboot.dto.offerpricers;

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
 * Refers to the Passengers, Price class or segments for which this offer item is eligible.
 * 
 * <p>Java class for EligibilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FlightAssociations" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" maxOccurs="unbounded"/&gt;
 *                   &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "EligibilityType", propOrder = {
    "paxRefID",
    "priceClassRefID",
    "flightAssociations"
})
public class EligibilityType {

    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxRefID;
    @XmlElement(name = "PriceClassRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> priceClassRefID;
    @XmlElement(name = "FlightAssociations")
    protected EligibilityType.FlightAssociations flightAssociations;

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
     * Gets the value of the priceClassRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceClassRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceClassRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPriceClassRefID() {
        if (priceClassRefID == null) {
            priceClassRefID = new ArrayList<String>();
        }
        return this.priceClassRefID;
    }

    /**
     * Gets the value of the flightAssociations property.
     * 
     * @return
     *     possible object is
     *     {@link EligibilityType.FlightAssociations }
     *     
     */
    public EligibilityType.FlightAssociations getFlightAssociations() {
        return flightAssociations;
    }

    /**
     * Sets the value of the flightAssociations property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibilityType.FlightAssociations }
     *     
     */
    public void setFlightAssociations(EligibilityType.FlightAssociations value) {
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
     *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" maxOccurs="unbounded"/&gt;
     *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ID_Type" maxOccurs="unbounded"/&gt;
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
        protected List<String> paxJourneyRefID;
        @XmlElement(name = "PaxSegmentRefID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> paxSegmentRefID;

        /**
         * Gets the value of the paxJourneyRefID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxJourneyRefID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaxJourneyRefID() {
            if (paxJourneyRefID == null) {
                paxJourneyRefID = new ArrayList<String>();
            }
            return this.paxJourneyRefID;
        }

        /**
         * Gets the value of the paxSegmentRefID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paxSegmentRefID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaxSegmentRefID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPaxSegmentRefID() {
            if (paxSegmentRefID == null) {
                paxSegmentRefID = new ArrayList<String>();
            }
            return this.paxSegmentRefID;
        }

    }

}
