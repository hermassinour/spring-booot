
package com.springboot.dto.servicelistrs;

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
 * COUNTRY RADIUS QUERY definition.
 * 
 * <p>Java class for CountryQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountryQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryCodes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CountryCode" maxOccurs="unbounded"/&gt;
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
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}KeyWord" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Proximity" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CountryProximityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ObjAssociationAttrGroup"/&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}PreferenceAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryQueryType", propOrder = {
    "countryCodes",
    "keywords",
    "proximity"
})
public class CountryQueryType {

    @XmlElement(name = "CountryCodes")
    protected CountryQueryType.CountryCodes countryCodes;
    @XmlElement(name = "Keywords")
    protected CountryQueryType.Keywords keywords;
    @XmlElement(name = "Proximity")
    protected List<CountryProximityType> proximity;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;
    @XmlAttribute(name = "PreferencesLevel")
    protected String preferencesLevel;
    @XmlAttribute(name = "PreferencesContext")
    protected String preferencesContext;

    /**
     * Gets the value of the countryCodes property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType.CountryCodes }
     *     
     */
    public CountryQueryType.CountryCodes getCountryCodes() {
        return countryCodes;
    }

    /**
     * Sets the value of the countryCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType.CountryCodes }
     *     
     */
    public void setCountryCodes(CountryQueryType.CountryCodes value) {
        this.countryCodes = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link CountryQueryType.Keywords }
     *     
     */
    public CountryQueryType.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryQueryType.Keywords }
     *     
     */
    public void setKeywords(CountryQueryType.Keywords value) {
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
     * {@link CountryProximityType }
     * 
     * 
     */
    public List<CountryProximityType> getProximity() {
        if (proximity == null) {
            proximity = new ArrayList<CountryProximityType>();
        }
        return this.proximity;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CountryCode" maxOccurs="unbounded"/&gt;
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
        "countryCode"
    })
    public static class CountryCodes {

        @XmlElement(name = "CountryCode", required = true)
        protected List<CountryCode> countryCode;

        /**
         * Country Code. Examples: US, FR
         * 
         * Encoding Scheme: ISO 3166-1 (two character) Country Code Gets the value of the countryCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the countryCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCountryCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CountryCode }
         * 
         * 
         */
        public List<CountryCode> getCountryCode() {
            if (countryCode == null) {
                countryCode = new ArrayList<CountryCode>();
            }
            return this.countryCode;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}KeyWord" maxOccurs="unbounded"/&gt;
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
        protected List<KeyWord> keyWord;

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
         * {@link KeyWord }
         * 
         * 
         */
        public List<KeyWord> getKeyWord() {
            if (keyWord == null) {
                keyWord = new ArrayList<KeyWord>();
            }
            return this.keyWord;
        }

    }

}
