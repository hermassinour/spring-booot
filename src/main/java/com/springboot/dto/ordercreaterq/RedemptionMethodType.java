
package com.springboot.dto.ordercreaterq;

import java.math.BigInteger;
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
 * REDEMPTION Payment Method definition.
 * 
 * <p>Java class for RedemptionMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RedemptionMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Certificates" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CertificateNumber" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;ContextSimpleType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MemberNumber" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;ContextSimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RedemptionQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="PromotionCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="PromoVendorCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ContextSimpleType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionMethodType", propOrder = {
    "certificates",
    "memberNumber",
    "redemptionQuantity",
    "promotionCode",
    "promoVendorCode"
})
public class RedemptionMethodType {

    @XmlElement(name = "Certificates")
    protected RedemptionMethodType.Certificates certificates;
    @XmlElement(name = "MemberNumber")
    protected RedemptionMethodType.MemberNumber memberNumber;
    @XmlElement(name = "RedemptionQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger redemptionQuantity;
    @XmlElement(name = "PromotionCode")
    protected String promotionCode;
    @XmlElement(name = "PromoVendorCode")
    protected List<String> promoVendorCode;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the certificates property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionMethodType.Certificates }
     *     
     */
    public RedemptionMethodType.Certificates getCertificates() {
        return certificates;
    }

    /**
     * Sets the value of the certificates property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionMethodType.Certificates }
     *     
     */
    public void setCertificates(RedemptionMethodType.Certificates value) {
        this.certificates = value;
    }

    /**
     * Gets the value of the memberNumber property.
     * 
     * @return
     *     possible object is
     *     {@link RedemptionMethodType.MemberNumber }
     *     
     */
    public RedemptionMethodType.MemberNumber getMemberNumber() {
        return memberNumber;
    }

    /**
     * Sets the value of the memberNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link RedemptionMethodType.MemberNumber }
     *     
     */
    public void setMemberNumber(RedemptionMethodType.MemberNumber value) {
        this.memberNumber = value;
    }

    /**
     * Gets the value of the redemptionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRedemptionQuantity() {
        return redemptionQuantity;
    }

    /**
     * Sets the value of the redemptionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRedemptionQuantity(BigInteger value) {
        this.redemptionQuantity = value;
    }

    /**
     * Gets the value of the promotionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * Sets the value of the promotionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * Gets the value of the promoVendorCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promoVendorCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromoVendorCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPromoVendorCode() {
        if (promoVendorCode == null) {
            promoVendorCode = new ArrayList<String>();
        }
        return this.promoVendorCode;
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
     *         &lt;element name="CertificateNumber" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;ContextSimpleType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ObjAssociationAttrGroup"/&gt;
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
        "certificateNumber"
    })
    public static class Certificates {

        @XmlElement(name = "CertificateNumber", required = true)
        protected List<RedemptionMethodType.Certificates.CertificateNumber> certificateNumber;

        /**
         * Gets the value of the certificateNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the certificateNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificateNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RedemptionMethodType.Certificates.CertificateNumber }
         * 
         * 
         */
        public List<RedemptionMethodType.Certificates.CertificateNumber> getCertificateNumber() {
            if (certificateNumber == null) {
                certificateNumber = new ArrayList<RedemptionMethodType.Certificates.CertificateNumber>();
            }
            return this.certificateNumber;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;ContextSimpleType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ObjAssociationAttrGroup"/&gt;
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
        public static class CertificateNumber {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Examples: Provider, tablename.field
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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;ContextSimpleType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ObjAssociationAttrGroup"/&gt;
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
    public static class MemberNumber {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Examples: Provider, tablename.field
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
