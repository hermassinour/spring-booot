
package com.springboot.dto.orderchangerq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * OPTIONAL SERVICE BUNDLE Data List definition.
 * 
 * <p>Java class for ListOfServiceBundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfServiceBundleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceBundle" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;element name="Associations"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceReference" maxOccurs="unbounded"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceID" maxOccurs="unbounded"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Selection" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;choice maxOccurs="2"&gt;
 *                             &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                             &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                           &lt;/choice&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="BundleID" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ&gt;UniqueStringID_SimpleType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjectKeyAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServicePriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="BundleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DataListObjAttrGroup"/&gt;
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
@XmlType(name = "ListOfServiceBundleType", propOrder = {
    "serviceBundle"
})
public class ListOfServiceBundleType {

    @XmlElement(name = "ServiceBundle", required = true)
    protected List<ListOfServiceBundleType.ServiceBundle> serviceBundle;

    /**
     * Gets the value of the serviceBundle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceBundle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceBundle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfServiceBundleType.ServiceBundle }
     * 
     * 
     */
    public List<ListOfServiceBundleType.ServiceBundle> getServiceBundle() {
        if (serviceBundle == null) {
            serviceBundle = new ArrayList<ListOfServiceBundleType.ServiceBundle>();
        }
        return this.serviceBundle;
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
     *         &lt;element name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;element name="Associations"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceReference" maxOccurs="unbounded"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceID" maxOccurs="unbounded"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Selection" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;choice maxOccurs="2"&gt;
     *                   &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                   &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                 &lt;/choice&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="BundleID" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ&gt;UniqueStringID_SimpleType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjectKeyAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Price" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServicePriceType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="BundleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DataListObjAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemCount",
        "associations",
        "selection",
        "bundleID",
        "price",
        "bundleName"
    })
    public static class ServiceBundle {

        @XmlElement(name = "ItemCount", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger itemCount;
        @XmlElement(name = "Associations", required = true)
        protected ListOfServiceBundleType.ServiceBundle.Associations associations;
        @XmlElement(name = "Selection")
        protected ListOfServiceBundleType.ServiceBundle.Selection selection;
        @XmlElement(name = "BundleID")
        protected ListOfServiceBundleType.ServiceBundle.BundleID bundleID;
        @XmlElement(name = "Price")
        protected List<ServicePriceType> price;
        @XmlElement(name = "BundleName")
        protected String bundleName;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String listKey;

        /**
         * Gets the value of the itemCount property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getItemCount() {
            return itemCount;
        }

        /**
         * Sets the value of the itemCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setItemCount(BigInteger value) {
            this.itemCount = value;
        }

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Associations }
         *     
         */
        public ListOfServiceBundleType.ServiceBundle.Associations getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Associations }
         *     
         */
        public void setAssociations(ListOfServiceBundleType.ServiceBundle.Associations value) {
            this.associations = value;
        }

        /**
         * Gets the value of the selection property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Selection }
         *     
         */
        public ListOfServiceBundleType.ServiceBundle.Selection getSelection() {
            return selection;
        }

        /**
         * Sets the value of the selection property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceBundleType.ServiceBundle.Selection }
         *     
         */
        public void setSelection(ListOfServiceBundleType.ServiceBundle.Selection value) {
            this.selection = value;
        }

        /**
         * Gets the value of the bundleID property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfServiceBundleType.ServiceBundle.BundleID }
         *     
         */
        public ListOfServiceBundleType.ServiceBundle.BundleID getBundleID() {
            return bundleID;
        }

        /**
         * Sets the value of the bundleID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfServiceBundleType.ServiceBundle.BundleID }
         *     
         */
        public void setBundleID(ListOfServiceBundleType.ServiceBundle.BundleID value) {
            this.bundleID = value;
        }

        /**
         * Gets the value of the price property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the price property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPrice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePriceType }
         * 
         * 
         */
        public List<ServicePriceType> getPrice() {
            if (price == null) {
                price = new ArrayList<ServicePriceType>();
            }
            return this.price;
        }

        /**
         * Gets the value of the bundleName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBundleName() {
            return bundleName;
        }

        /**
         * Sets the value of the bundleName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBundleName(String value) {
            this.bundleName = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;choice&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceReference" maxOccurs="unbounded"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceID" maxOccurs="unbounded"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "serviceReference",
            "serviceID"
        })
        public static class Associations {

            @XmlElement(name = "ServiceReference")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected List<String> serviceReference;
            @XmlElement(name = "ServiceID")
            protected List<ServiceIDType> serviceID;

            /**
             * Gets the value of the serviceReference property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceReference property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceReference().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getServiceReference() {
                if (serviceReference == null) {
                    serviceReference = new ArrayList<String>();
                }
                return this.serviceReference;
            }

            /**
             * Gets the value of the serviceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceIDType }
             * 
             * 
             */
            public List<ServiceIDType> getServiceID() {
                if (serviceID == null) {
                    serviceID = new ArrayList<ServiceIDType>();
                }
                return this.serviceID;
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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ&gt;UniqueStringID_SimpleType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjectKeyAttrGroup"/&gt;
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
        public static class BundleID {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;
            @XmlAttribute(name = "ObjectKey")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String objectKey;

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
             * Gets the value of the objectKey property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getObjectKey() {
                return objectKey;
            }

            /**
             * Sets the value of the objectKey property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setObjectKey(String value) {
                this.objectKey = value;
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
         *       &lt;choice maxOccurs="2"&gt;
         *         &lt;element name="MinimumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *         &lt;element name="MaximumQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "minimumQuantityOrMaximumQuantity"
        })
        public static class Selection {

            @XmlElementRefs({
                @XmlElementRef(name = "MinimumQuantity", namespace = "http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ", type = JAXBElement.class, required = false),
                @XmlElementRef(name = "MaximumQuantity", namespace = "http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ", type = JAXBElement.class, required = false)
            })
            protected List<JAXBElement<BigInteger>> minimumQuantityOrMaximumQuantity;

            /**
             * Gets the value of the minimumQuantityOrMaximumQuantity property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the minimumQuantityOrMaximumQuantity property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMinimumQuantityOrMaximumQuantity().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
             * 
             * 
             */
            public List<JAXBElement<BigInteger>> getMinimumQuantityOrMaximumQuantity() {
                if (minimumQuantityOrMaximumQuantity == null) {
                    minimumQuantityOrMaximumQuantity = new ArrayList<JAXBElement<BigInteger>>();
                }
                return this.minimumQuantityOrMaximumQuantity;
            }

        }

    }

}
