
package com.springboot.dto.offerpricerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Core Agency (Seller) Group Representation.
 * 
 * Notes:
 *  1. This type contains the common properties for all defined Agency Seller Role definitions, e.g. TravelAgency, Travel Agent.
 *  2. This type is derived from SellerCoreRepType.
 * 
 * <p>Java class for AgencyCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyCoreRepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}SellerCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherID" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ObjAssociationAttrGroup"/&gt;
 *                           &lt;attribute name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ShortDescSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PseudoCity" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ&gt;PseudoCitySimpleType"&gt;
 *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="IATA_Number" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IATA_NbrSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgencyCoreRepType", propOrder = {
    "otherIDs",
    "pseudoCity",
    "iataNumber"
})
@XmlSeeAlso({
    AgentUserType.class,
    V172TravelAgencyType.class
})
public class AgencyCoreRepType
    extends SellerCoreRepType
{

    @XmlElement(name = "OtherIDs")
    protected AgencyCoreRepType.OtherIDs otherIDs;
    @XmlElement(name = "PseudoCity")
    protected AgencyCoreRepType.PseudoCity pseudoCity;
    @XmlElement(name = "IATA_Number")
    protected String iataNumber;

    /**
     * Gets the value of the otherIDs property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCoreRepType.OtherIDs }
     *     
     */
    public AgencyCoreRepType.OtherIDs getOtherIDs() {
        return otherIDs;
    }

    /**
     * Sets the value of the otherIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCoreRepType.OtherIDs }
     *     
     */
    public void setOtherIDs(AgencyCoreRepType.OtherIDs value) {
        this.otherIDs = value;
    }

    /**
     * Gets the value of the pseudoCity property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCoreRepType.PseudoCity }
     *     
     */
    public AgencyCoreRepType.PseudoCity getPseudoCity() {
        return pseudoCity;
    }

    /**
     * Sets the value of the pseudoCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCoreRepType.PseudoCity }
     *     
     */
    public void setPseudoCity(AgencyCoreRepType.PseudoCity value) {
        this.pseudoCity = value;
    }

    /**
     * Gets the value of the iataNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATANumber() {
        return iataNumber;
    }

    /**
     * Sets the value of the iataNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATANumber(String value) {
        this.iataNumber = value;
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
     *         &lt;element name="OtherID" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ObjAssociationAttrGroup"/&gt;
     *                 &lt;attribute name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ShortDescSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
    @XmlType(name = "", propOrder = {
        "otherID"
    })
    public static class OtherIDs {

        @XmlElement(name = "OtherID", required = true)
        protected List<AgencyCoreRepType.OtherIDs.OtherID> otherID;

        /**
         * Gets the value of the otherID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AgencyCoreRepType.OtherIDs.OtherID }
         * 
         * 
         */
        public List<AgencyCoreRepType.OtherIDs.OtherID> getOtherID() {
            if (otherID == null) {
                otherID = new ArrayList<AgencyCoreRepType.OtherIDs.OtherID>();
            }
            return this.otherID;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ObjAssociationAttrGroup"/&gt;
         *       &lt;attribute name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ShortDescSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OtherID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the description property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * Sets the value of the description property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ&gt;PseudoCitySimpleType"&gt;
     *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PseudoCity {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Owner")
        protected String owner;

        /**
         * A data type for  Pseudo City Code encoding constraint. Example: AAA2
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

    }

}
