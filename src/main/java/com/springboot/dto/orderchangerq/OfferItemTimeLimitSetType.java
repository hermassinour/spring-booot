
package com.springboot.dto.orderchangerq;

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
 * OFFER ITEM TIME LIMIT SET (collection) definition.
 * 
 * <p>Java class for OfferItemTimeLimitSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemTimeLimitSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TimeLimit" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PriceGuaranteeTimeLimit"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}TicketByTimeLimit"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
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
@XmlType(name = "OfferItemTimeLimitSetType", propOrder = {
    "timeLimit"
})
public class OfferItemTimeLimitSetType {

    @XmlElement(name = "TimeLimit", required = true)
    protected List<OfferItemTimeLimitSetType.TimeLimit> timeLimit;

    /**
     * Gets the value of the timeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the timeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OfferItemTimeLimitSetType.TimeLimit }
     * 
     * 
     */
    public List<OfferItemTimeLimitSetType.TimeLimit> getTimeLimit() {
        if (timeLimit == null) {
            timeLimit = new ArrayList<OfferItemTimeLimitSetType.TimeLimit>();
        }
        return this.timeLimit;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PriceGuaranteeTimeLimit"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}TicketByTimeLimit"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "priceGuaranteeTimeLimit",
        "ticketByTimeLimit"
    })
    public static class TimeLimit {

        @XmlElement(name = "PriceGuaranteeTimeLimit", required = true)
        protected PriceGuaranteeTimeLimit priceGuaranteeTimeLimit;
        @XmlElement(name = "TicketByTimeLimit", required = true)
        protected TicketByTimeLimitType ticketByTimeLimit;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the priceGuaranteeTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public PriceGuaranteeTimeLimit getPriceGuaranteeTimeLimit() {
            return priceGuaranteeTimeLimit;
        }

        /**
         * Sets the value of the priceGuaranteeTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link PriceGuaranteeTimeLimit }
         *     
         */
        public void setPriceGuaranteeTimeLimit(PriceGuaranteeTimeLimit value) {
            this.priceGuaranteeTimeLimit = value;
        }

        /**
         * Gets the value of the ticketByTimeLimit property.
         * 
         * @return
         *     possible object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public TicketByTimeLimitType getTicketByTimeLimit() {
            return ticketByTimeLimit;
        }

        /**
         * Sets the value of the ticketByTimeLimit property.
         * 
         * @param value
         *     allowed object is
         *     {@link TicketByTimeLimitType }
         *     
         */
        public void setTicketByTimeLimit(TicketByTimeLimitType value) {
            this.ticketByTimeLimit = value;
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

    }

}
