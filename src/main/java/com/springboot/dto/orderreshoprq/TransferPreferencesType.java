
package com.springboot.dto.orderreshoprq;

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
import javax.xml.datatype.Duration;


/**
 * A data type for Airline Transfer/ Connection Preferences.
 * 
 * <p>Java class for TransferPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferPreferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Connection"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Codes" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Code" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;AirportCitySimpleType"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="MaxTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="MinTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *                   &lt;element name="Interline" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;IATA_CodeType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Pricing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="ConnectionPricingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransferPreferencesType", propOrder = {
    "connection",
    "pricing"
})
public class TransferPreferencesType {

    @XmlElement(name = "Connection", required = true)
    protected TransferPreferencesType.Connection connection;
    @XmlElement(name = "Pricing")
    protected TransferPreferencesType.Pricing pricing;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the connection property.
     * 
     * @return
     *     possible object is
     *     {@link TransferPreferencesType.Connection }
     *     
     */
    public TransferPreferencesType.Connection getConnection() {
        return connection;
    }

    /**
     * Sets the value of the connection property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferPreferencesType.Connection }
     *     
     */
    public void setConnection(TransferPreferencesType.Connection value) {
        this.connection = value;
    }

    /**
     * Gets the value of the pricing property.
     * 
     * @return
     *     possible object is
     *     {@link TransferPreferencesType.Pricing }
     *     
     */
    public TransferPreferencesType.Pricing getPricing() {
        return pricing;
    }

    /**
     * Sets the value of the pricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferPreferencesType.Pricing }
     *     
     */
    public void setPricing(TransferPreferencesType.Pricing value) {
        this.pricing = value;
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
     *         &lt;element name="Codes" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Code" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;AirportCitySimpleType"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="MaxNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="MaxTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="MinTime" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
     *         &lt;element name="Interline" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;IATA_CodeType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codes",
        "maxNumber",
        "maxTime",
        "minTime",
        "interline"
    })
    public static class Connection {

        @XmlElement(name = "Codes")
        protected TransferPreferencesType.Connection.Codes codes;
        @XmlElement(name = "MaxNumber")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maxNumber;
        @XmlElement(name = "MaxTime")
        protected Duration maxTime;
        @XmlElement(name = "MinTime")
        protected Duration minTime;
        @XmlElement(name = "Interline")
        protected TransferPreferencesType.Connection.Interline interline;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the codes property.
         * 
         * @return
         *     possible object is
         *     {@link TransferPreferencesType.Connection.Codes }
         *     
         */
        public TransferPreferencesType.Connection.Codes getCodes() {
            return codes;
        }

        /**
         * Sets the value of the codes property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferPreferencesType.Connection.Codes }
         *     
         */
        public void setCodes(TransferPreferencesType.Connection.Codes value) {
            this.codes = value;
        }

        /**
         * Gets the value of the maxNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxNumber() {
            return maxNumber;
        }

        /**
         * Sets the value of the maxNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxNumber(BigInteger value) {
            this.maxNumber = value;
        }

        /**
         * Gets the value of the maxTime property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMaxTime() {
            return maxTime;
        }

        /**
         * Sets the value of the maxTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMaxTime(Duration value) {
            this.maxTime = value;
        }

        /**
         * Gets the value of the minTime property.
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getMinTime() {
            return minTime;
        }

        /**
         * Sets the value of the minTime property.
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setMinTime(Duration value) {
            this.minTime = value;
        }

        /**
         * Gets the value of the interline property.
         * 
         * @return
         *     possible object is
         *     {@link TransferPreferencesType.Connection.Interline }
         *     
         */
        public TransferPreferencesType.Connection.Interline getInterline() {
            return interline;
        }

        /**
         * Sets the value of the interline property.
         * 
         * @param value
         *     allowed object is
         *     {@link TransferPreferencesType.Connection.Interline }
         *     
         */
        public void setInterline(TransferPreferencesType.Connection.Interline value) {
            this.interline = value;
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
         *         &lt;element name="Code" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;AirportCitySimpleType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
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
            "code"
        })
        public static class Codes {

            @XmlElement(name = "Code", required = true)
            protected List<TransferPreferencesType.Connection.Codes.Code> code;

            /**
             * Gets the value of the code property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TransferPreferencesType.Connection.Codes.Code }
             * 
             * 
             */
            public List<TransferPreferencesType.Connection.Codes.Code> getCode() {
                if (code == null) {
                    code = new ArrayList<TransferPreferencesType.Connection.Codes.Code>();
                }
                return this.code;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;AirportCitySimpleType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
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
                @XmlAttribute(name = "PreferencesLevel")
                protected String preferencesLevel;
                @XmlAttribute(name = "PreferencesContext")
                protected String preferencesContext;

                /**
                 * Examples: JFK, NYC
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
                 * Gets the value of the preferencesLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesLevel() {
                    return preferencesLevel;
                }

                /**
                 * Sets the value of the preferencesLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesLevel(String value) {
                    this.preferencesLevel = value;
                }

                /**
                 * Gets the value of the preferencesContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesContext() {
                    return preferencesContext;
                }

                /**
                 * Sets the value of the preferencesContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesContext(String value) {
                    this.preferencesContext = value;
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
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ&gt;IATA_CodeType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}PreferenceAttrGroup"/&gt;
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
        public static class Interline {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, EQP
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
             * Gets the value of the preferencesLevel property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesLevel() {
                return preferencesLevel;
            }

            /**
             * Sets the value of the preferencesLevel property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesLevel(String value) {
                this.preferencesLevel = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
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
     *       &lt;attribute name="ConnectionPricingInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Pricing {

        @XmlAttribute(name = "ConnectionPricingInd")
        protected Boolean connectionPricingInd;

        /**
         * Gets the value of the connectionPricingInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isConnectionPricingInd() {
            return connectionPricingInd;
        }

        /**
         * Sets the value of the connectionPricingInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setConnectionPricingInd(Boolean value) {
            this.connectionPricingInd = value;
        }

    }

}
