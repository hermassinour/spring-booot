
package com.springboot.dto.servicelistrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for SUPPLIER GROUP, Core Representation.
 * 
 * <p>Java class for SupplierCoreRepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SupplierCoreRepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ActorObjectType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OtherIDs" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OtherID" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS&gt;CodesetValueSimpleType"&gt;
 *                           &lt;attribute name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ShortDescSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierCoreRepType", propOrder = {
    "otherIDs"
})
@XmlSeeAlso({
    AirlineCoreRepType.class,
    RetailerType.class
})
public class SupplierCoreRepType
    extends ActorObjectType
{

    @XmlElement(name = "OtherIDs")
    protected SupplierCoreRepType.OtherIDs otherIDs;

    /**
     * Gets the value of the otherIDs property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierCoreRepType.OtherIDs }
     *     
     */
    public SupplierCoreRepType.OtherIDs getOtherIDs() {
        return otherIDs;
    }

    /**
     * Sets the value of the otherIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCoreRepType.OtherIDs }
     *     
     */
    public void setOtherIDs(SupplierCoreRepType.OtherIDs value) {
        this.otherIDs = value;
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
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS&gt;CodesetValueSimpleType"&gt;
     *                 &lt;attribute name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ShortDescSimpleType" /&gt;
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
        protected List<SupplierCoreRepType.OtherIDs.OtherID> otherID;

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
         * {@link SupplierCoreRepType.OtherIDs.OtherID }
         * 
         * 
         */
        public List<SupplierCoreRepType.OtherIDs.OtherID> getOtherID() {
            if (otherID == null) {
                otherID = new ArrayList<SupplierCoreRepType.OtherIDs.OtherID>();
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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS&gt;CodesetValueSimpleType"&gt;
         *       &lt;attribute name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ShortDescSimpleType" /&gt;
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

            /**
             * Examples: A, ABC, 1
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

        }

    }

}
