
package com.springboot.dto.airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OFFER ITEM METADATA definition.
 * 
 * <p>Java class for OfferItemMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferItemMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ATPCO" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}Attributes" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Incentives" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferIncentiveType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Matches" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Match" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Terms" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="TimeLimits" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Rule" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Status" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferStatusType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferItemMetadataType", propOrder = {
    "atpco",
    "incentives",
    "matches",
    "terms",
    "timeLimits",
    "rule",
    "status"
})
public class OfferItemMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "ATPCO")
    protected OfferItemMetadataType.ATPCO atpco;
    @XmlElement(name = "Incentives")
    protected OfferItemMetadataType.Incentives incentives;
    @XmlElement(name = "Matches")
    protected OfferItemMetadataType.Matches matches;
    @XmlElement(name = "Terms")
    protected OfferItemMetadataType.Terms terms;
    @XmlElement(name = "TimeLimits")
    protected OfferItemMetadataType.TimeLimits timeLimits;
    @XmlElement(name = "Rule")
    protected OfferItemMetadataType.Rule rule;
    @XmlElement(name = "Status")
    protected OfferStatusType status;

    /**
     * Gets the value of the atpco property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemMetadataType.ATPCO }
     *     
     */
    public OfferItemMetadataType.ATPCO getATPCO() {
        return atpco;
    }

    /**
     * Sets the value of the atpco property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemMetadataType.ATPCO }
     *     
     */
    public void setATPCO(OfferItemMetadataType.ATPCO value) {
        this.atpco = value;
    }

    /**
     * Gets the value of the incentives property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemMetadataType.Incentives }
     *     
     */
    public OfferItemMetadataType.Incentives getIncentives() {
        return incentives;
    }

    /**
     * Sets the value of the incentives property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemMetadataType.Incentives }
     *     
     */
    public void setIncentives(OfferItemMetadataType.Incentives value) {
        this.incentives = value;
    }

    /**
     * Gets the value of the matches property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemMetadataType.Matches }
     *     
     */
    public OfferItemMetadataType.Matches getMatches() {
        return matches;
    }

    /**
     * Sets the value of the matches property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemMetadataType.Matches }
     *     
     */
    public void setMatches(OfferItemMetadataType.Matches value) {
        this.matches = value;
    }

    /**
     * Gets the value of the terms property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemMetadataType.Terms }
     *     
     */
    public OfferItemMetadataType.Terms getTerms() {
        return terms;
    }

    /**
     * Sets the value of the terms property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemMetadataType.Terms }
     *     
     */
    public void setTerms(OfferItemMetadataType.Terms value) {
        this.terms = value;
    }

    /**
     * Gets the value of the timeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemMetadataType.TimeLimits }
     *     
     */
    public OfferItemMetadataType.TimeLimits getTimeLimits() {
        return timeLimits;
    }

    /**
     * Sets the value of the timeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemMetadataType.TimeLimits }
     *     
     */
    public void setTimeLimits(OfferItemMetadataType.TimeLimits value) {
        this.timeLimits = value;
    }

    /**
     * Gets the value of the rule property.
     * 
     * @return
     *     possible object is
     *     {@link OfferItemMetadataType.Rule }
     *     
     */
    public OfferItemMetadataType.Rule getRule() {
        return rule;
    }

    /**
     * Sets the value of the rule property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferItemMetadataType.Rule }
     *     
     */
    public void setRule(OfferItemMetadataType.Rule value) {
        this.rule = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link OfferStatusType }
     *     
     */
    public OfferStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferStatusType }
     *     
     */
    public void setStatus(OfferStatusType value) {
        this.status = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}Attributes" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
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
        "attributes",
        "augmentationPoint"
    })
    public static class ATPCO {

        @XmlElement(name = "Attributes")
        protected AttributesType attributes;
        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;

        /**
         * Gets the value of the attributes property.
         * 
         * @return
         *     possible object is
         *     {@link AttributesType }
         *     
         */
        public AttributesType getAttributes() {
            return attributes;
        }

        /**
         * Sets the value of the attributes property.
         * 
         * @param value
         *     allowed object is
         *     {@link AttributesType }
         *     
         */
        public void setAttributes(AttributesType value) {
            this.attributes = value;
        }

        /**
         * Gets the value of the augmentationPoint property.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OfferIncentiveType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Incentives
        extends OfferIncentiveType
    {


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
     *         &lt;element name="Match" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
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
    @XmlType(name = "", propOrder = {
        "match"
    })
    public static class Matches {

        @XmlElement(name = "Match", required = true)
        protected List<OfferItemMetadataType.Matches.Match> match;

        /**
         * Gets the value of the match property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the match property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMatch().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OfferItemMetadataType.Matches.Match }
         * 
         * 
         */
        public List<OfferItemMetadataType.Matches.Match> getMatch() {
            if (match == null) {
                match = new ArrayList<OfferItemMetadataType.Matches.Match>();
            }
            return this.match;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
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
            "augmentationPoint"
        })
        public static class Match {

            @XmlElement(name = "AugmentationPoint")
            protected AugPointInfoType augmentationPoint;

            /**
             * Gets the value of the augmentationPoint property.
             * 
             * @return
             *     possible object is
             *     {@link AugPointInfoType }
             *     
             */
            public AugPointInfoType getAugmentationPoint() {
                return augmentationPoint;
            }

            /**
             * Sets the value of the augmentationPoint property.
             * 
             * @param value
             *     allowed object is
             *     {@link AugPointInfoType }
             *     
             */
            public void setAugmentationPoint(AugPointInfoType value) {
                this.augmentationPoint = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
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
        "augmentationPoint"
    })
    public static class Rule {

        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;

        /**
         * Gets the value of the augmentationPoint property.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
        }

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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
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
        "augmentationPoint"
    })
    public static class Terms {

        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;

        /**
         * Gets the value of the augmentationPoint property.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
        }

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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AugmentationPoint" minOccurs="0"/&gt;
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
        "augmentationPoint"
    })
    public static class TimeLimits {

        @XmlElement(name = "AugmentationPoint")
        protected AugPointInfoType augmentationPoint;

        /**
         * Gets the value of the augmentationPoint property.
         * 
         * @return
         *     possible object is
         *     {@link AugPointInfoType }
         *     
         */
        public AugPointInfoType getAugmentationPoint() {
            return augmentationPoint;
        }

        /**
         * Sets the value of the augmentationPoint property.
         * 
         * @param value
         *     allowed object is
         *     {@link AugPointInfoType }
         *     
         */
        public void setAugmentationPoint(AugPointInfoType value) {
            this.augmentationPoint = value;
        }

    }

}
