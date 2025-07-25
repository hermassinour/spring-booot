
package com.springboot.dto.orderreshoprs;

import java.math.BigInteger;
import java.util.ArrayList;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type definition for Augmentation Point  List.
 * 
 * <p>Java class for AugPointListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugPointListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ListBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="List" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="AugPointAssoc" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="KeyRef" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}InstanceClassRefSimpleType" /&gt;
 *                           &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerSimpleType" /&gt;
 *                           &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="NamedAssocs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NamedAssocType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ListKey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}InstanceClassSimpleType" /&gt;
 *                 &lt;attribute name="ListName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
 *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerSimpleType" /&gt;
 *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
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
@XmlType(name = "AugPointListType", propOrder = {
    "list"
})
public class AugPointListType
    extends ListBaseType
{

    @XmlElement(name = "List", required = true)
    protected java.util.List<AugPointListType.List> list;

    /**
     * Gets the value of the list property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the list property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugPointListType.List }
     * 
     * 
     */
    public java.util.List<AugPointListType.List> getList() {
        if (list == null) {
            list = new ArrayList<AugPointListType.List>();
        }
        return this.list;
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
     *         &lt;element name="AugPointAssoc" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="KeyRef" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}InstanceClassRefSimpleType" /&gt;
     *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerSimpleType" /&gt;
     *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="NamedAssocs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NamedAssocType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ListKey" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}InstanceClassSimpleType" /&gt;
     *       &lt;attribute name="ListName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ContextSimpleType" /&gt;
     *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerSimpleType" /&gt;
     *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "augPointAssoc",
        "namedAssocs"
    })
    public static class List {

        @XmlElement(name = "AugPointAssoc", required = true)
        protected java.util.List<AugPointListType.List.AugPointAssoc> augPointAssoc;
        @XmlElement(name = "NamedAssocs")
        protected NamedAssocType namedAssocs;
        @XmlAttribute(name = "ListKey")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String listKey;
        @XmlAttribute(name = "ListName")
        protected String listName;
        @XmlAttribute(name = "Owner")
        protected String owner;
        @XmlAttribute(name = "Seq")
        protected BigInteger seq;

        /**
         * Gets the value of the augPointAssoc property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the augPointAssoc property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAugPointAssoc().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AugPointListType.List.AugPointAssoc }
         * 
         * 
         */
        public java.util.List<AugPointListType.List.AugPointAssoc> getAugPointAssoc() {
            if (augPointAssoc == null) {
                augPointAssoc = new ArrayList<AugPointListType.List.AugPointAssoc>();
            }
            return this.augPointAssoc;
        }

        /**
         * Gets the value of the namedAssocs property.
         * 
         * @return
         *     possible object is
         *     {@link NamedAssocType }
         *     
         */
        public NamedAssocType getNamedAssocs() {
            return namedAssocs;
        }

        /**
         * Sets the value of the namedAssocs property.
         * 
         * @param value
         *     allowed object is
         *     {@link NamedAssocType }
         *     
         */
        public void setNamedAssocs(NamedAssocType value) {
            this.namedAssocs = value;
        }

        /**
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

        /**
         * Gets the value of the listName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListName() {
            return listName;
        }

        /**
         * Sets the value of the listName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListName(String value) {
            this.listName = value;
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

        /**
         * Gets the value of the seq property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSeq() {
            return seq;
        }

        /**
         * Sets the value of the seq property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSeq(BigInteger value) {
            this.seq = value;
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
         *       &lt;attribute name="KeyRef" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}InstanceClassRefSimpleType" /&gt;
         *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}OwnerSimpleType" /&gt;
         *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AugPointAssoc {

            @XmlAttribute(name = "KeyRef", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String keyRef;
            @XmlAttribute(name = "Owner")
            protected String owner;
            @XmlAttribute(name = "Seq")
            protected BigInteger seq;

            /**
             * Gets the value of the keyRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getKeyRef() {
                return keyRef;
            }

            /**
             * Sets the value of the keyRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setKeyRef(String value) {
                this.keyRef = value;
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

            /**
             * Gets the value of the seq property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSeq() {
                return seq;
            }

            /**
             * Sets the value of the seq property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSeq(BigInteger value) {
                this.seq = value;
            }

        }

    }

}
