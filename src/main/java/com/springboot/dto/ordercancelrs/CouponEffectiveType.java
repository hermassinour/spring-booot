
package com.springboot.dto.ordercancelrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * COUPON EFFECTIVE PERIOD definition.
 * 
 * <p>Java class for CouponEffectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CouponEffectiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="EffectiveDatePeriod" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DatePeriodRepType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EffectiveDateTimePeriod" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DateTimePeriodRepType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponEffectiveType", propOrder = {
    "effectiveDatePeriod",
    "effectiveDateTimePeriod"
})
public class CouponEffectiveType {

    @XmlElement(name = "EffectiveDatePeriod")
    protected CouponEffectiveType.EffectiveDatePeriod effectiveDatePeriod;
    @XmlElement(name = "EffectiveDateTimePeriod")
    protected CouponEffectiveType.EffectiveDateTimePeriod effectiveDateTimePeriod;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the effectiveDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType.EffectiveDatePeriod }
     *     
     */
    public CouponEffectiveType.EffectiveDatePeriod getEffectiveDatePeriod() {
        return effectiveDatePeriod;
    }

    /**
     * Sets the value of the effectiveDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType.EffectiveDatePeriod }
     *     
     */
    public void setEffectiveDatePeriod(CouponEffectiveType.EffectiveDatePeriod value) {
        this.effectiveDatePeriod = value;
    }

    /**
     * Gets the value of the effectiveDateTimePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link CouponEffectiveType.EffectiveDateTimePeriod }
     *     
     */
    public CouponEffectiveType.EffectiveDateTimePeriod getEffectiveDateTimePeriod() {
        return effectiveDateTimePeriod;
    }

    /**
     * Sets the value of the effectiveDateTimePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEffectiveType.EffectiveDateTimePeriod }
     *     
     */
    public void setEffectiveDateTimePeriod(CouponEffectiveType.EffectiveDateTimePeriod value) {
        this.effectiveDateTimePeriod = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DatePeriodRepType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "duration"
    })
    public static class EffectiveDatePeriod
        extends DatePeriodRepType
    {

        @XmlElement(name = "Duration")
        protected Duration duration;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DateTimePeriodRepType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "duration"
    })
    public static class EffectiveDateTimePeriod
        extends DateTimePeriodRepType
    {

        @XmlElement(name = "Duration")
        protected Duration duration;

        /**
         * Gets the value of the duration property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getDuration() {
            return duration;
        }

        /**
         * Sets the value of the duration property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setDuration(Duration value) {
            this.duration = value;
        }

    }

}
