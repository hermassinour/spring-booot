
package com.springboot.dto.airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * NDC Capability Model: STATE OR PROVINCE QUERY
 * 
 *  ============
 * Feature(s)
 *  ============
 * • Query by list of State/ Province Codes
 * • Query by list of State/ Province Keywords
 * • Preference Level for all or individual Query ParameterGroups
 * • Proximity information containing either the requested maximum distance search radius values, or the actual Proximity information (which is typically used to specify the results from the named location radius search.)
 * 
 *  ============
 * Metadata
 *  ============
 * • Yes
 * 
 * <p>Java class for StateProvQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StateProvQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StateCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StateCode" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS&gt;StateProvCodeType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Keywords" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="KeyWord" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}KeyWordType"&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Proximity" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}StateProvProximityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StateProvQueryType", propOrder = {
    "stateCodes",
    "keywords",
    "proximity"
})
public class StateProvQueryType {

    @XmlElement(name = "StateCodes")
    protected StateProvQueryType.StateCodes stateCodes;
    @XmlElement(name = "Keywords")
    protected StateProvQueryType.Keywords keywords;
    @XmlElement(name = "Proximity")
    protected List<StateProvProximityType> proximity;
    @XmlAttribute(name = "PreferencesLevel")
    protected String preferencesLevel;
    @XmlAttribute(name = "PreferencesContext")
    protected String preferencesContext;

    /**
     * Gets the value of the stateCodes property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvQueryType.StateCodes }
     *     
     */
    public StateProvQueryType.StateCodes getStateCodes() {
        return stateCodes;
    }

    /**
     * Sets the value of the stateCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvQueryType.StateCodes }
     *     
     */
    public void setStateCodes(StateProvQueryType.StateCodes value) {
        this.stateCodes = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvQueryType.Keywords }
     *     
     */
    public StateProvQueryType.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvQueryType.Keywords }
     *     
     */
    public void setKeywords(StateProvQueryType.Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the proximity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proximity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProximity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateProvProximityType }
     * 
     * 
     */
    public List<StateProvProximityType> getProximity() {
        if (proximity == null) {
            proximity = new ArrayList<StateProvProximityType>();
        }
        return this.proximity;
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
     *         &lt;element name="KeyWord" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}KeyWordType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
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
        "keyWord"
    })
    public static class Keywords {

        @XmlElement(name = "KeyWord", required = true)
        protected List<StateProvQueryType.Keywords.KeyWord> keyWord;

        /**
         * Gets the value of the keyWord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyWord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyWord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StateProvQueryType.Keywords.KeyWord }
         * 
         * 
         */
        public List<StateProvQueryType.Keywords.KeyWord> getKeyWord() {
            if (keyWord == null) {
                keyWord = new ArrayList<StateProvQueryType.Keywords.KeyWord>();
            }
            return this.keyWord;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}KeyWordType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class KeyWord
            extends KeyWordType
        {

            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

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
     *       &lt;sequence&gt;
     *         &lt;element name="StateCode" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS&gt;StateProvCodeType"&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
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
        "stateCode"
    })
    public static class StateCodes {

        @XmlElement(name = "StateCode", required = true)
        protected List<StateProvQueryType.StateCodes.StateCode> stateCode;

        /**
         * Gets the value of the stateCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stateCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStateCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link StateProvQueryType.StateCodes.StateCode }
         * 
         * 
         */
        public List<StateProvQueryType.StateCodes.StateCode> getStateCode() {
            if (stateCode == null) {
                stateCode = new ArrayList<StateProvQueryType.StateCodes.StateCode>();
            }
            return this.stateCode;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS&gt;StateProvCodeType"&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PreferenceAttrGroup"/&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StateCode
            extends StateProvCodeType
        {

            @XmlAttribute(name = "PreferencesLevel")
            protected String preferencesLevel;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

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

}
