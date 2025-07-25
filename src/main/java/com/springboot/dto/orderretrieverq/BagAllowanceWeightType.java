
package com.springboot.dto.orderretrieverq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Baggage Allowance by Weight.
 * 
 * <p>Java class for BagAllowanceWeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowanceWeightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicableParty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}BagAppSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumWeight" maxOccurs="2"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                   &lt;element name="UOM" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
 *                   &lt;element name="SpreadOverBagsQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ApplicableBag" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Descriptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagAllowanceWeightType", propOrder = {
    "applicableParty",
    "maximumWeight",
    "applicableBag",
    "descriptions"
})
@XmlSeeAlso({
    WeightAllowance.class
})
public class BagAllowanceWeightType {

    @XmlElement(name = "ApplicableParty")
    protected String applicableParty;
    @XmlElement(name = "MaximumWeight", required = true)
    protected List<BagAllowanceWeightType.MaximumWeight> maximumWeight;
    @XmlElement(name = "ApplicableBag")
    protected String applicableBag;
    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the applicableParty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableParty() {
        return applicableParty;
    }

    /**
     * Sets the value of the applicableParty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableParty(String value) {
        this.applicableParty = value;
    }

    /**
     * Gets the value of the maximumWeight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maximumWeight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaximumWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowanceWeightType.MaximumWeight }
     * 
     * 
     */
    public List<BagAllowanceWeightType.MaximumWeight> getMaximumWeight() {
        if (maximumWeight == null) {
            maximumWeight = new ArrayList<BagAllowanceWeightType.MaximumWeight>();
        }
        return this.maximumWeight;
    }

    /**
     * Gets the value of the applicableBag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBag() {
        return applicableBag;
    }

    /**
     * Sets the value of the applicableBag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBag(String value) {
        this.applicableBag = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
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
     *       &lt;sequence&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="UOM" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
     *         &lt;element name="SpreadOverBagsQuantity" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value",
        "uom",
        "spreadOverBagsQuantity"
    })
    public static class MaximumWeight {

        @XmlElement(name = "Value", required = true)
        protected BigDecimal value;
        @XmlElement(name = "UOM", required = true)
        protected String uom;
        @XmlElement(name = "SpreadOverBagsQuantity")
        protected Integer spreadOverBagsQuantity;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUOM(String value) {
            this.uom = value;
        }

        /**
         * Gets the value of the spreadOverBagsQuantity property.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getSpreadOverBagsQuantity() {
            return spreadOverBagsQuantity;
        }

        /**
         * Sets the value of the spreadOverBagsQuantity property.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setSpreadOverBagsQuantity(Integer value) {
            this.spreadOverBagsQuantity = value;
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
