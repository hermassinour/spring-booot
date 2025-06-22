
package com.springboot.dto.ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Business Object Parameters.
 * 
 * <p>Java class for MessageParamsBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageParamsBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Languages" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}LanguageCode" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CurrCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FiledInCurrency" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CurrCode"/&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NumericStringLength1to19" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="MeasurementSystem" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}MeasurementTypeListType" minOccurs="0"/&gt;
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
@XmlType(name = "MessageParamsBaseType", propOrder = {
    "languages",
    "currCodes",
    "measurementSystem"
})
@XmlSeeAlso({
    FltPriceReqParamsType.class,
    SrvListResParamsType.class,
    SeatAvailReqParamsType.class
})
public class MessageParamsBaseType {

    @XmlElement(name = "Languages")
    protected MessageParamsBaseType.Languages languages;
    @XmlElement(name = "CurrCodes")
    protected MessageParamsBaseType.CurrCodes currCodes;
    @XmlElement(name = "MeasurementSystem")
    @XmlSchemaType(name = "string")
    protected MeasurementTypeListType measurementSystem;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the languages property.
     * 
     * @return
     *     possible object is
     *     {@link MessageParamsBaseType.Languages }
     *     
     */
    public MessageParamsBaseType.Languages getLanguages() {
        return languages;
    }

    /**
     * Sets the value of the languages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageParamsBaseType.Languages }
     *     
     */
    public void setLanguages(MessageParamsBaseType.Languages value) {
        this.languages = value;
    }

    /**
     * Gets the value of the currCodes property.
     * 
     * @return
     *     possible object is
     *     {@link MessageParamsBaseType.CurrCodes }
     *     
     */
    public MessageParamsBaseType.CurrCodes getCurrCodes() {
        return currCodes;
    }

    /**
     * Sets the value of the currCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageParamsBaseType.CurrCodes }
     *     
     */
    public void setCurrCodes(MessageParamsBaseType.CurrCodes value) {
        this.currCodes = value;
    }

    /**
     * Gets the value of the measurementSystem property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementTypeListType }
     *     
     */
    public MeasurementTypeListType getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * Sets the value of the measurementSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementTypeListType }
     *     
     */
    public void setMeasurementSystem(MeasurementTypeListType value) {
        this.measurementSystem = value;
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
     *         &lt;element name="FiledInCurrency" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CurrCode"/&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NumericStringLength1to19" /&gt;
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
    @XmlType(name = "", propOrder = {
        "filedInCurrency"
    })
    public static class CurrCodes {

        @XmlElement(name = "FiledInCurrency")
        protected List<MessageParamsBaseType.CurrCodes.FiledInCurrency> filedInCurrency;

        /**
         * Gets the value of the filedInCurrency property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filedInCurrency property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFiledInCurrency().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MessageParamsBaseType.CurrCodes.FiledInCurrency }
         * 
         * 
         */
        public List<MessageParamsBaseType.CurrCodes.FiledInCurrency> getFiledInCurrency() {
            if (filedInCurrency == null) {
                filedInCurrency = new ArrayList<MessageParamsBaseType.CurrCodes.FiledInCurrency>();
            }
            return this.filedInCurrency;
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
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CurrCode"/&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}NumericStringLength1to19" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "currCode"
        })
        public static class FiledInCurrency {

            @XmlElement(name = "CurrCode", required = true)
            protected CurrCode currCode;
            @XmlAttribute(name = "Amount")
            protected String amount;

            /**
             * Gets the value of the currCode property.
             * 
             * @return
             *     possible object is
             *     {@link CurrCode }
             *     
             */
            public CurrCode getCurrCode() {
                return currCode;
            }

            /**
             * Sets the value of the currCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrCode }
             *     
             */
            public void setCurrCode(CurrCode value) {
                this.currCode = value;
            }

            /**
             * Gets the value of the amount property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAmount() {
                return amount;
            }

            /**
             * Sets the value of the amount property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAmount(String value) {
                this.amount = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}LanguageCode" maxOccurs="unbounded"/&gt;
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
        "languageCode"
    })
    public static class Languages {

        @XmlElement(name = "LanguageCode", required = true)
        protected List<LanguageCodeType> languageCode;

        /**
         * Gets the value of the languageCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the languageCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLanguageCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LanguageCodeType }
         * 
         * 
         */
        public List<LanguageCodeType> getLanguageCode() {
            if (languageCode == null) {
                languageCode = new ArrayList<LanguageCodeType>();
            }
            return this.languageCode;
        }

    }

}
