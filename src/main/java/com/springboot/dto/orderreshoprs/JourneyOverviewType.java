
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
 * Summary of proposed Journey information in the context of this specific Offer.
 * 
 * <p>Java class for JourneyOverviewType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="JourneyOverviewType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="JourneyPriceClass" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" minOccurs="0"/&gt;
 *                   &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "JourneyOverviewType", propOrder = {
    "priceClassRefID",
    "journeyPriceClass"
})
public class JourneyOverviewType {

    @XmlElement(name = "PriceClassRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String priceClassRefID;
    @XmlElement(name = "JourneyPriceClass", required = true)
    protected List<JourneyOverviewType.JourneyPriceClass> journeyPriceClass;

    /**
     * Gets the value of the priceClassRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClassRefID() {
        return priceClassRefID;
    }

    /**
     * Sets the value of the priceClassRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceClassRefID(String value) {
        this.priceClassRefID = value;
    }

    /**
     * Gets the value of the journeyPriceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the journeyPriceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJourneyPriceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyOverviewType.JourneyPriceClass }
     * 
     * 
     */
    public List<JourneyOverviewType.JourneyPriceClass> getJourneyPriceClass() {
        if (journeyPriceClass == null) {
            journeyPriceClass = new ArrayList<JourneyOverviewType.JourneyPriceClass>();
        }
        return this.journeyPriceClass;
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
     *       &lt;sequence&gt;
     *         &lt;element name="PriceClassRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" minOccurs="0"/&gt;
     *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceClassRefID",
        "paxJourneyRefID"
    })
    public static class JourneyPriceClass {

        @XmlElement(name = "PriceClassRefID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String priceClassRefID;
        @XmlElement(name = "PaxJourneyRefID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String paxJourneyRefID;

        /**
         * Gets the value of the priceClassRefID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPriceClassRefID() {
            return priceClassRefID;
        }

        /**
         * Sets the value of the priceClassRefID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPriceClassRefID(String value) {
            this.priceClassRefID = value;
        }

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

    }

}
