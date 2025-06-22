
package com.springboot.dto.orderviewrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * LEAD PRICING CALENDAR Pricing definition.
 * 
 * Price information for alternate dates.
 * 
 * Notes:
 *  1. This is based on lead pricing specified in the AirShoppingRQ/ AttributeQuery/Flight node Arrival and/ or Departure elements.
 * 
 *  2. This capability may not be supported by all NDC-enabled systems or may be supported by bilateral agreement only.The technical implementation of this capability is not dictated by this specification.
 * 
 *  3. If implemented, the client application will typically send new a new shopping request if any of these window shopping dates are selected.
 * 
 * <p>Java class for OfferPriceLeadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferPriceLeadType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestedDate"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OfferPriceLeadDetailType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}FareDetail" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="OfferItemID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *       &lt;attribute name="ModificationProhibitedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferPriceLeadType", propOrder = {
    "requestedDate",
    "fareDetail"
})
@XmlSeeAlso({
    com.springboot.dto.orderviewrs.PricedFlightOfferCoreType.OfferPrice.class
})
public class OfferPriceLeadType {

    @XmlElement(name = "RequestedDate", required = true)
    protected OfferPriceLeadType.RequestedDate requestedDate;
    @XmlElement(name = "FareDetail")
    protected FareDetailType fareDetail;
    @XmlAttribute(name = "OfferItemID")
    @XmlSchemaType(name = "anySimpleType")
    protected String offerItemID;
    @XmlAttribute(name = "ModificationProhibitedInd")
    protected Boolean modificationProhibitedInd;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the requestedDate property.
     * 
     * @return
     *     possible object is
     *     {@link OfferPriceLeadType.RequestedDate }
     *     
     */
    public OfferPriceLeadType.RequestedDate getRequestedDate() {
        return requestedDate;
    }

    /**
     * Sets the value of the requestedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferPriceLeadType.RequestedDate }
     *     
     */
    public void setRequestedDate(OfferPriceLeadType.RequestedDate value) {
        this.requestedDate = value;
    }

    /**
     * Gets the value of the fareDetail property.
     * 
     * @return
     *     possible object is
     *     {@link FareDetailType }
     *     
     */
    public FareDetailType getFareDetail() {
        return fareDetail;
    }

    /**
     * Sets the value of the fareDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link FareDetailType }
     *     
     */
    public void setFareDetail(FareDetailType value) {
        this.fareDetail = value;
    }

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
     * Gets the value of the modificationProhibitedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModificationProhibitedInd() {
        return modificationProhibitedInd;
    }

    /**
     * Sets the value of the modificationProhibitedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModificationProhibitedInd(Boolean value) {
        this.modificationProhibitedInd = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}OfferPriceLeadDetailType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PricedFlightOfferAssocType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associations"
    })
    public static class RequestedDate
        extends OfferPriceLeadDetailType
    {

        @XmlElement(name = "Associations")
        protected List<PricedFlightOfferAssocType> associations;

        /**
         * Gets the value of the associations property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the associations property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssociations().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PricedFlightOfferAssocType }
         * 
         * 
         */
        public List<PricedFlightOfferAssocType> getAssociations() {
            if (associations == null) {
                associations = new ArrayList<PricedFlightOfferAssocType>();
            }
            return this.associations;
        }

    }

}
