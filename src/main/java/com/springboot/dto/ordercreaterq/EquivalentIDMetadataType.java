
package com.springboot.dto.ordercreaterq;

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


/**
 * A data type for EQUIVALENT IDENTIFIER Metadata.
 * 
 * <p>Java class for EquivalentID_MetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EquivalentID_MetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EquivID" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}EquivalentID_Key"/&gt;
 *                   &lt;element name="ID_Value" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}UniqueStringID_SimpleType"/&gt;
 *                   &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameSimpleType"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}MetadataObjAttrGroup"/&gt;
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
@XmlType(name = "EquivalentID_MetadataType", propOrder = {
    "equivID"
})
public class EquivalentIDMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "EquivID", required = true)
    protected List<EquivalentIDMetadataType.EquivID> equivID;

    /**
     * Gets the value of the equivID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the equivID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEquivID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EquivalentIDMetadataType.EquivID }
     * 
     * 
     */
    public List<EquivalentIDMetadataType.EquivID> getEquivID() {
        if (equivID == null) {
            equivID = new ArrayList<EquivalentIDMetadataType.EquivID>();
        }
        return this.equivID;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}EquivalentID_Key"/&gt;
     *         &lt;element name="ID_Value" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}UniqueStringID_SimpleType"/&gt;
     *         &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameSimpleType"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}MetadataObjAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "equivalentIDKey",
        "idValue",
        "owner"
    })
    public static class EquivID {

        @XmlElement(name = "EquivalentID_Key", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String equivalentIDKey;
        @XmlElement(name = "ID_Value", required = true)
        protected String idValue;
        @XmlElement(name = "Owner", required = true)
        protected String owner;
        @XmlAttribute(name = "metarefs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String metarefs;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "MetadataKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String metadataKey;

        /**
         * Gets the value of the equivalentIDKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquivalentIDKey() {
            return equivalentIDKey;
        }

        /**
         * Sets the value of the equivalentIDKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquivalentIDKey(String value) {
            this.equivalentIDKey = value;
        }

        /**
         * Gets the value of the idValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDValue() {
            return idValue;
        }

        /**
         * Sets the value of the idValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDValue(String value) {
            this.idValue = value;
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
         * Gets the value of the metarefs property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetarefs() {
            return metarefs;
        }

        /**
         * Sets the value of the metarefs property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetarefs(String value) {
            this.metarefs = value;
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
         * Gets the value of the metadataKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetadataKey() {
            return metadataKey;
        }

        /**
         * Sets the value of the metadataKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetadataKey(String value) {
            this.metadataKey = value;
        }

    }

}
