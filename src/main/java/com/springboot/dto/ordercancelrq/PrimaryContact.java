
package com.springboot.dto.ordercancelrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="Name"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Surname"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjectPolicyMetaAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Contact" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}KeyObjectBaseType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PhoneContact"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OtherContactMethod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}EmailContact"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AddressContact"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/extension&gt;
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
    "name",
    "contact"
})
@XmlRootElement(name = "PrimaryContact")
public class PrimaryContact {

    @XmlElement(name = "Name", required = true)
    protected PrimaryContact.Name name;
    @XmlElement(name = "Contact", required = true)
    protected List<PrimaryContact.Contact> contact;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryContact.Name }
     *     
     */
    public PrimaryContact.Name getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryContact.Name }
     *     
     */
    public void setName(PrimaryContact.Name value) {
        this.name = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryContact.Contact }
     * 
     * 
     */
    public List<PrimaryContact.Contact> getContact() {
        if (contact == null) {
            contact = new ArrayList<PrimaryContact.Contact>();
        }
        return this.contact;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}KeyObjectBaseType"&gt;
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PhoneContact"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}OtherContactMethod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}EmailContact"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AddressContact"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phoneContact",
        "otherContactMethod",
        "emailContact",
        "addressContact"
    })
    public static class Contact
        extends KeyObjectBaseType
    {

        @XmlElement(name = "PhoneContact")
        protected PhoneContactType phoneContact;
        @XmlElement(name = "OtherContactMethod")
        protected OtherContactMethodType otherContactMethod;
        @XmlElement(name = "EmailContact")
        protected EmailType emailContact;
        @XmlElement(name = "AddressContact")
        protected AddressContactType addressContact;

        /**
         * Gets the value of the phoneContact property.
         * 
         * @return
         *     possible object is
         *     {@link PhoneContactType }
         *     
         */
        public PhoneContactType getPhoneContact() {
            return phoneContact;
        }

        /**
         * Sets the value of the phoneContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhoneContactType }
         *     
         */
        public void setPhoneContact(PhoneContactType value) {
            this.phoneContact = value;
        }

        /**
         * Gets the value of the otherContactMethod property.
         * 
         * @return
         *     possible object is
         *     {@link OtherContactMethodType }
         *     
         */
        public OtherContactMethodType getOtherContactMethod() {
            return otherContactMethod;
        }

        /**
         * Sets the value of the otherContactMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link OtherContactMethodType }
         *     
         */
        public void setOtherContactMethod(OtherContactMethodType value) {
            this.otherContactMethod = value;
        }

        /**
         * Gets the value of the emailContact property.
         * 
         * @return
         *     possible object is
         *     {@link EmailType }
         *     
         */
        public EmailType getEmailContact() {
            return emailContact;
        }

        /**
         * Sets the value of the emailContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link EmailType }
         *     
         */
        public void setEmailContact(EmailType value) {
            this.emailContact = value;
        }

        /**
         * Gets the value of the addressContact property.
         * 
         * @return
         *     possible object is
         *     {@link AddressContactType }
         *     
         */
        public AddressContactType getAddressContact() {
            return addressContact;
        }

        /**
         * Sets the value of the addressContact property.
         * 
         * @param value
         *     allowed object is
         *     {@link AddressContactType }
         *     
         */
        public void setAddressContact(AddressContactType value) {
            this.addressContact = value;
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
     *         &lt;element name="Surname"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Given" maxOccurs="5" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Middle" maxOccurs="3" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjectPolicyMetaAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "surname",
        "given",
        "middle"
    })
    public static class Name {

        @XmlElement(name = "Surname", required = true)
        protected PrimaryContact.Name.Surname surname;
        @XmlElement(name = "Given")
        protected List<PrimaryContact.Name.Given> given;
        @XmlElement(name = "Middle")
        protected List<PrimaryContact.Name.Middle> middle;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String objectMetaReferences;

        /**
         * Gets the value of the surname property.
         * 
         * @return
         *     possible object is
         *     {@link PrimaryContact.Name.Surname }
         *     
         */
        public PrimaryContact.Name.Surname getSurname() {
            return surname;
        }

        /**
         * Sets the value of the surname property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrimaryContact.Name.Surname }
         *     
         */
        public void setSurname(PrimaryContact.Name.Surname value) {
            this.surname = value;
        }

        /**
         * Gets the value of the given property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the given property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGiven().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrimaryContact.Name.Given }
         * 
         * 
         */
        public List<PrimaryContact.Name.Given> getGiven() {
            if (given == null) {
                given = new ArrayList<PrimaryContact.Name.Given>();
            }
            return this.given;
        }

        /**
         * Gets the value of the middle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the middle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiddle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrimaryContact.Name.Middle }
         * 
         * 
         */
        public List<PrimaryContact.Name.Middle> getMiddle() {
            if (middle == null) {
                middle = new ArrayList<PrimaryContact.Name.Middle>();
            }
            return this.middle;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
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
        public static class Given {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * A data type for Proper Name size constraint.
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
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
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
        public static class Middle {

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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;ProperNameSimpleType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
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
        public static class Surname {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * A data type for Proper Name size constraint.
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

}
