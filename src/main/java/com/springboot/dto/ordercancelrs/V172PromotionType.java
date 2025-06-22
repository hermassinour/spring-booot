
package com.springboot.dto.ordercancelrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * PROMOTION helper object.
 * 
 * <p>Java class for V172_PromotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_PromotionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS&gt;CodesetValueSimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}ObjectPolicyMetaAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Link" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
 *         &lt;element name="Issuer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirlineID"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AgencyID"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}PartnerID"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}Remarks" minOccurs="0"/&gt;
 *         &lt;element name="VoucherOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_PromotionType", propOrder = {
    "code",
    "link",
    "issuer",
    "remarks",
    "voucherOwner"
})
@XmlSeeAlso({
    com.springboot.dto.ordercancelrs.PaymentProcessType.Promotions.Promotion.class,
    com.springboot.dto.ordercancelrs.V172PaymentMethodType.Method.Promotions.Promotion.class,
    com.springboot.dto.ordercancelrs.OrderV172PaymentMethodType.Promotions.Promotion.class,
    PromoQualifierType.class
})
public class V172PromotionType {

    @XmlElement(name = "Code", required = true)
    protected V172PromotionType.Code code;
    @XmlElement(name = "Link")
    @XmlSchemaType(name = "anyURI")
    protected String link;
    @XmlElement(name = "Issuer")
    protected V172PromotionType.Issuer issuer;
    @XmlElement(name = "Remarks")
    protected V172RemarkType remarks;
    @XmlElement(name = "VoucherOwner")
    protected String voucherOwner;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link V172PromotionType.Code }
     *     
     */
    public V172PromotionType.Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172PromotionType.Code }
     *     
     */
    public void setCode(V172PromotionType.Code value) {
        this.code = value;
    }

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLink() {
        return link;
    }

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLink(String value) {
        this.link = value;
    }

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link V172PromotionType.Issuer }
     *     
     */
    public V172PromotionType.Issuer getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172PromotionType.Issuer }
     *     
     */
    public void setIssuer(V172PromotionType.Issuer value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link V172RemarkType }
     *     
     */
    public V172RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172RemarkType }
     *     
     */
    public void setRemarks(V172RemarkType value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the voucherOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoucherOwner() {
        return voucherOwner;
    }

    /**
     * Sets the value of the voucherOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoucherOwner(String value) {
        this.voucherOwner = value;
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS&gt;CodesetValueSimpleType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}ObjectPolicyMetaAttrGroup"/&gt;
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
    public static class Code {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ObjectMetaReferences")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String objectMetaReferences;

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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AirlineID"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}AgencyID"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}PartnerID"/&gt;
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
        "airlineID",
        "agencyID",
        "partnerID"
    })
    public static class Issuer {

        @XmlElement(name = "AirlineID")
        protected AirlineID airlineID;
        @XmlElement(name = "AgencyID")
        protected AgencyIDType agencyID;
        @XmlElement(name = "PartnerID")
        protected PartnerCompanyIDType partnerID;

        /**
         * A two-character alpha-numeric code assigned according to the IATA Resolution 762 or a three-letter airline designator assigned by ICAO.  Refer to IATA Airline Coding Directory .
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
         * Gets the value of the agencyID property.
         * 
         * @return
         *     possible object is
         *     {@link AgencyIDType }
         *     
         */
        public AgencyIDType getAgencyID() {
            return agencyID;
        }

        /**
         * Sets the value of the agencyID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AgencyIDType }
         *     
         */
        public void setAgencyID(AgencyIDType value) {
            this.agencyID = value;
        }

        /**
         * Gets the value of the partnerID property.
         * 
         * @return
         *     possible object is
         *     {@link PartnerCompanyIDType }
         *     
         */
        public PartnerCompanyIDType getPartnerID() {
            return partnerID;
        }

        /**
         * Sets the value of the partnerID property.
         * 
         * @param value
         *     allowed object is
         *     {@link PartnerCompanyIDType }
         *     
         */
        public void setPartnerID(PartnerCompanyIDType value) {
            this.partnerID = value;
        }

    }

}
