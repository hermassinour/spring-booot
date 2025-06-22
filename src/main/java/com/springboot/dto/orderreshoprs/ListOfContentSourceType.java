
package com.springboot.dto.orderreshoprs;

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
 * CONTENT SOURCE data list definition.
 * 
 * <p>Java class for ListOfContentSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfContentSourceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentSource" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NodePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineID"/&gt;
 *                     &lt;element name="OtherID"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                             &lt;attribute name="name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ProperNameSimpleType" /&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DataListObjAttrGroup"/&gt;
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
@XmlType(name = "ListOfContentSourceType", propOrder = {
    "contentSource"
})
public class ListOfContentSourceType {

    @XmlElement(name = "ContentSource", required = true)
    protected List<ListOfContentSourceType.ContentSource> contentSource;

    /**
     * Gets the value of the contentSource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentSource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentSource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfContentSourceType.ContentSource }
     * 
     * 
     */
    public List<ListOfContentSourceType.ContentSource> getContentSource() {
        if (contentSource == null) {
            contentSource = new ArrayList<ListOfContentSourceType.ContentSource>();
        }
        return this.contentSource;
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
     *         &lt;element name="NodePath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineID"/&gt;
     *           &lt;element name="OtherID"&gt;
     *             &lt;complexType&gt;
     *               &lt;simpleContent&gt;
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                   &lt;attribute name="name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ProperNameSimpleType" /&gt;
     *                 &lt;/extension&gt;
     *               &lt;/simpleContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DataListObjAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nodePath",
        "airlineID",
        "otherID"
    })
    public static class ContentSource {

        @XmlElement(name = "NodePath", required = true)
        protected String nodePath;
        @XmlElement(name = "AirlineID")
        protected AirlineID airlineID;
        @XmlElement(name = "OtherID")
        protected ListOfContentSourceType.ContentSource.OtherID otherID;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String listKey;

        /**
         * Gets the value of the nodePath property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodePath() {
            return nodePath;
        }

        /**
         * Sets the value of the nodePath property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodePath(String value) {
            this.nodePath = value;
        }

        /**
         * Gets the value of the airlineID property.
         * 
         * @return
         *     possible object is
         *     {@link AirlineID }
         *     
         */
        public AirlineID getAirlineID() {
            return airlineID;
        }

        /**
         * Sets the value of the airlineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineID }
         *     
         */
        public void setAirlineID(AirlineID value) {
            this.airlineID = value;
        }

        /**
         * Gets the value of the otherID property.
         * 
         * @return
         *     possible object is
         *     {@link ListOfContentSourceType.ContentSource.OtherID }
         *     
         */
        public ListOfContentSourceType.ContentSource.OtherID getOtherID() {
            return otherID;
        }

        /**
         * Sets the value of the otherID property.
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfContentSourceType.ContentSource.OtherID }
         *     
         */
        public void setOtherID(ListOfContentSourceType.ContentSource.OtherID value) {
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
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ProperNameSimpleType" /&gt;
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
            @XmlAttribute(name = "name")
            protected String name;

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

}
