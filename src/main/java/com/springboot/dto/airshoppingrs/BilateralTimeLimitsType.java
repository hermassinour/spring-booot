
package com.springboot.dto.airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Offer/ Offer Item: BILATERAL (Implementer-Assigned) TIME LIMITS definition.
 * 
 * Bilateral Time Limit value.
 * Examples: 2017-05-30T09:00:00,  2015-01-13T13:59:38Z
 * 
 * Note: This is a bilaterally-agreed upon time limit that is not included in the NDC XML Specification.
 * 
 * <p>Java class for BilateralTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilateralTimeLimitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BilateralTimeLimit" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ProperNameSimpleType"/&gt;
 *                   &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}DescriptionSimpleType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AttrCoreDateGrpType"/&gt;
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
@XmlType(name = "BilateralTimeLimitsType", propOrder = {
    "bilateralTimeLimit"
})
public class BilateralTimeLimitsType {

    @XmlElement(name = "BilateralTimeLimit", required = true)
    protected List<BilateralTimeLimitsType.BilateralTimeLimit> bilateralTimeLimit;

    /**
     * Gets the value of the bilateralTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilateralTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralTimeLimitsType.BilateralTimeLimit }
     * 
     * 
     */
    public List<BilateralTimeLimitsType.BilateralTimeLimit> getBilateralTimeLimit() {
        if (bilateralTimeLimit == null) {
            bilateralTimeLimit = new ArrayList<BilateralTimeLimitsType.BilateralTimeLimit>();
        }
        return this.bilateralTimeLimit;
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
     *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ProperNameSimpleType"/&gt;
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}DescriptionSimpleType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}ObjAssociationAttrGroup"/&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AttrCoreDateGrpType"/&gt;
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
        "description"
    })
    public static class BilateralTimeLimit {

        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Description")
        protected String description;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "DateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar dateTime;
        @XmlAttribute(name = "ShortDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar shortDate;
        @XmlAttribute(name = "Timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "Time")
        protected String time;

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

        /**
         * Gets the value of the dateTime property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateTime() {
            return dateTime;
        }

        /**
         * Sets the value of the dateTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateTime(XMLGregorianCalendar value) {
            this.dateTime = value;
        }

        /**
         * Gets the value of the shortDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getShortDate() {
            return shortDate;
        }

        /**
         * Sets the value of the shortDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setShortDate(XMLGregorianCalendar value) {
            this.shortDate = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the time property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTime() {
            return time;
        }

        /**
         * Sets the value of the time property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTime(String value) {
            this.time = value;
        }

    }

}
