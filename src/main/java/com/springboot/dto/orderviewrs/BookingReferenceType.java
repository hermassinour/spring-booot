
package com.springboot.dto.orderviewrs;

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
 * Booking Reference definition.
 * 
 * <p>Java class for BookingReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ID"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[0-9a-zA-Z]{1,6}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AirlineID"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;AirlineID_Type"&gt;
 *                   &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameSimpleType" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *           &lt;element name="OtherID"&gt;
 *             &lt;complexType&gt;
 *               &lt;simpleContent&gt;
 *                 &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;UniqueStringID_SimpleType"&gt;
 *                   &lt;attribute name="refs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}InstanceClassRefSimpleType" /&gt;
 *                   &lt;attribute name="ObjectMetaReferences" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}InstanceClassRefSimpleType" /&gt;
 *                   &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameSimpleType" /&gt;
 *                 &lt;/extension&gt;
 *               &lt;/simpleContent&gt;
 *             &lt;/complexType&gt;
 *           &lt;/element&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingReferenceType", propOrder = {
    "type",
    "id",
    "airlineID",
    "otherID"
})
@XmlSeeAlso({
    BookingReference.class
})
public class BookingReferenceType {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "AirlineID")
    protected BookingReferenceType.AirlineID airlineID;
    @XmlElement(name = "OtherID")
    protected BookingReferenceType.OtherID otherID;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the airlineID property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferenceType.AirlineID }
     *     
     */
    public BookingReferenceType.AirlineID getAirlineID() {
        return airlineID;
    }

    /**
     * Sets the value of the airlineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferenceType.AirlineID }
     *     
     */
    public void setAirlineID(BookingReferenceType.AirlineID value) {
        this.airlineID = value;
    }

    /**
     * Gets the value of the otherID property.
     * 
     * @return
     *     possible object is
     *     {@link BookingReferenceType.OtherID }
     *     
     */
    public BookingReferenceType.OtherID getOtherID() {
        return otherID;
    }

    /**
     * Sets the value of the otherID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookingReferenceType.OtherID }
     *     
     */
    public void setOtherID(BookingReferenceType.OtherID value) {
        this.otherID = value;
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
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;AirlineID_Type"&gt;
     *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameSimpleType" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirlineID
        extends AirlineIDType
    {

        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;UniqueStringID_SimpleType"&gt;
     *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}InstanceClassRefSimpleType" /&gt;
     *       &lt;attribute name="ObjectMetaReferences" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}InstanceClassRefSimpleType" /&gt;
     *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameSimpleType" /&gt;
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
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String objectMetaReferences;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * A data type for a Unique String Identifier constraint.
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

        /**
         * Gets the value of the objectMetaReferences property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getObjectMetaReferences() {
            return objectMetaReferences;
        }

        /**
         * Sets the value of the objectMetaReferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setObjectMetaReferences(String value) {
            this.objectMetaReferences = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

    }

}
