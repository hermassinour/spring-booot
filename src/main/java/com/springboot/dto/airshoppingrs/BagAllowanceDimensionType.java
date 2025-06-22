
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Baggage Allowance by Dimensions.
 * 
 * <p>Java class for BagAllowanceDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagAllowanceDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicableParty" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BagAppSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="DimensionUOM" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}SizeUnitSimpleType"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="MaxLinear"&gt;
 *               &lt;complexType&gt;
 *                 &lt;simpleContent&gt;
 *                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/simpleContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *             &lt;element name="MinLinear"&gt;
 *               &lt;complexType&gt;
 *                 &lt;simpleContent&gt;
 *                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
 *                   &lt;/extension&gt;
 *                 &lt;/simpleContent&gt;
 *               &lt;/complexType&gt;
 *             &lt;/element&gt;
 *           &lt;/sequence&gt;
 *           &lt;element name="Dimensions" maxOccurs="unbounded"&gt;
 *             &lt;complexType&gt;
 *               &lt;complexContent&gt;
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="Category" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BagDimensionSimpleType"/&gt;
 *                     &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *                     &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
 *                 &lt;/restriction&gt;
 *               &lt;/complexContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="ApplicableBag" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ProperNameSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Descriptions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagAllowanceDimensionType", propOrder = {
    "applicableParty",
    "dimensionUOM",
    "maxLinear",
    "minLinear",
    "dimensions",
    "applicableBag",
    "descriptions"
})
public class BagAllowanceDimensionType {

    @XmlElement(name = "ApplicableParty")
    protected String applicableParty;
    @XmlElement(name = "DimensionUOM", required = true)
    @XmlSchemaType(name = "string")
    protected SizeUnitSimpleType dimensionUOM;
    @XmlElement(name = "MaxLinear")
    protected BagAllowanceDimensionType.MaxLinear maxLinear;
    @XmlElement(name = "MinLinear")
    protected BagAllowanceDimensionType.MinLinear minLinear;
    @XmlElement(name = "Dimensions")
    protected List<BagAllowanceDimensionType.Dimensions> dimensions;
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
     * Gets the value of the dimensionUOM property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public SizeUnitSimpleType getDimensionUOM() {
        return dimensionUOM;
    }

    /**
     * Sets the value of the dimensionUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public void setDimensionUOM(SizeUnitSimpleType value) {
        this.dimensionUOM = value;
    }

    /**
     * Gets the value of the maxLinear property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceDimensionType.MaxLinear }
     *     
     */
    public BagAllowanceDimensionType.MaxLinear getMaxLinear() {
        return maxLinear;
    }

    /**
     * Sets the value of the maxLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceDimensionType.MaxLinear }
     *     
     */
    public void setMaxLinear(BagAllowanceDimensionType.MaxLinear value) {
        this.maxLinear = value;
    }

    /**
     * Gets the value of the minLinear property.
     * 
     * @return
     *     possible object is
     *     {@link BagAllowanceDimensionType.MinLinear }
     *     
     */
    public BagAllowanceDimensionType.MinLinear getMinLinear() {
        return minLinear;
    }

    /**
     * Sets the value of the minLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagAllowanceDimensionType.MinLinear }
     *     
     */
    public void setMinLinear(BagAllowanceDimensionType.MinLinear value) {
        this.minLinear = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BagAllowanceDimensionType.Dimensions }
     * 
     * 
     */
    public List<BagAllowanceDimensionType.Dimensions> getDimensions() {
        if (dimensions == null) {
            dimensions = new ArrayList<BagAllowanceDimensionType.Dimensions>();
        }
        return this.dimensions;
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
     *         &lt;element name="Category" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BagDimensionSimpleType"/&gt;
     *         &lt;element name="MaxValue" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
     *         &lt;element name="MinValue" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "category",
        "maxValue",
        "minValue"
    })
    public static class Dimensions {

        @XmlElement(name = "Category", required = true)
        protected String category;
        @XmlElement(name = "MaxValue", required = true)
        protected BigDecimal maxValue;
        @XmlElement(name = "MinValue")
        protected Object minValue;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the category property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * Sets the value of the category property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
        }

        /**
         * Gets the value of the maxValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxValue() {
            return maxValue;
        }

        /**
         * Sets the value of the maxValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxValue(BigDecimal value) {
            this.maxValue = value;
        }

        /**
         * Gets the value of the minValue property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getMinValue() {
            return minValue;
        }

        /**
         * Sets the value of the minValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setMinValue(Object value) {
            this.minValue = value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
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
    public static class MaxLinear {

        @XmlValue
        protected String value;
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
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
    public static class MinLinear {

        @XmlValue
        protected String value;
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
