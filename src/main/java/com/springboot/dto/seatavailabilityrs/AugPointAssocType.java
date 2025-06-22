
package com.springboot.dto.seatavailabilityrs;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type definition for Augmentation Point Association.
 * 
 * <p>Java class for AugPointAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugPointAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AugPointAssoc" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="KeyRef" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}InstanceClassRefSimpleType" /&gt;
 *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}OwnerSimpleType" /&gt;
 *                 &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}OwnerSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugPointAssocType", propOrder = {
    "augPointAssoc"
})
public class AugPointAssocType {

    @XmlElement(name = "AugPointAssoc", required = true)
    protected List<AugPointAssocType.AugPointAssoc> augPointAssoc;
    @XmlAttribute(name = "Owner")
    protected String owner;

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
     * {@link AugPointAssocType.AugPointAssoc }
     * 
     * 
     */
    public List<AugPointAssocType.AugPointAssoc> getAugPointAssoc() {
        if (augPointAssoc == null) {
            augPointAssoc = new ArrayList<AugPointAssocType.AugPointAssoc>();
        }
        return this.augPointAssoc;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="KeyRef" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}InstanceClassRefSimpleType" /&gt;
     *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}OwnerSimpleType" /&gt;
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

        @XmlAttribute(name = "KeyRef")
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
