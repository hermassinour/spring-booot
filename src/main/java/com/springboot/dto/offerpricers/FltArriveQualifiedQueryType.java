
package com.springboot.dto.offerpricers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type for Flight Destination with Additional Location Preference and Date/Time Qualifiers.
 * 
 * <p>Java class for FltArriveQualifiedQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FltArriveQualifiedQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LocationCode" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS&gt;AirportCitySimpleType"&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}RadiusAttrGroup"/&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PreferenceAttrGroup"/&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Time" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}TimeSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="LeadPricing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice maxOccurs="2"&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}LeadDatePeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}LeadTimePeriod"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FltArriveQualifiedQueryType", propOrder = {
    "locationCode",
    "date",
    "time",
    "leadPricing"
})
public class FltArriveQualifiedQueryType {

    @XmlElement(name = "LocationCode", required = true)
    protected List<FltArriveQualifiedQueryType.LocationCode> locationCode;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlElement(name = "Time")
    protected String time;
    @XmlElement(name = "LeadPricing")
    protected FltArriveQualifiedQueryType.LeadPricing leadPricing;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the locationCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FltArriveQualifiedQueryType.LocationCode }
     * 
     * 
     */
    public List<FltArriveQualifiedQueryType.LocationCode> getLocationCode() {
        if (locationCode == null) {
            locationCode = new ArrayList<FltArriveQualifiedQueryType.LocationCode>();
        }
        return this.locationCode;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

    /**
     * Gets the value of the leadPricing property.
     * 
     * @return
     *     possible object is
     *     {@link FltArriveQualifiedQueryType.LeadPricing }
     *     
     */
    public FltArriveQualifiedQueryType.LeadPricing getLeadPricing() {
        return leadPricing;
    }

    /**
     * Sets the value of the leadPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltArriveQualifiedQueryType.LeadPricing }
     *     
     */
    public void setLeadPricing(FltArriveQualifiedQueryType.LeadPricing value) {
        this.leadPricing = value;
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
     *       &lt;choice maxOccurs="2"&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}LeadDatePeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}LeadTimePeriod"/&gt;
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
        "leadDatePeriodOrLeadTimePeriod"
    })
    public static class LeadPricing {

        @XmlElements({
            @XmlElement(name = "LeadDatePeriod", type = LeadDatePeriodType.class),
            @XmlElement(name = "LeadTimePeriod", type = LeadTimePeriodType.class)
        })
        protected List<Object> leadDatePeriodOrLeadTimePeriod;

        /**
         * Gets the value of the leadDatePeriodOrLeadTimePeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the leadDatePeriodOrLeadTimePeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLeadDatePeriodOrLeadTimePeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LeadDatePeriodType }
         * {@link LeadTimePeriodType }
         * 
         * 
         */
        public List<Object> getLeadDatePeriodOrLeadTimePeriod() {
            if (leadDatePeriodOrLeadTimePeriod == null) {
                leadDatePeriodOrLeadTimePeriod = new ArrayList<Object>();
            }
            return this.leadDatePeriodOrLeadTimePeriod;
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS&gt;AirportCitySimpleType"&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}RadiusAttrGroup"/&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PreferenceAttrGroup"/&gt;
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
    public static class LocationCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Application")
        protected String application;
        @XmlAttribute(name = "Area")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger area;
        @XmlAttribute(name = "UOM")
        protected DistanceUnitListType uom;
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
         * Gets the value of the application property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * Sets the value of the application property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }

        /**
         * Gets the value of the area property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getArea() {
            return area;
        }

        /**
         * Sets the value of the area property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setArea(BigInteger value) {
            this.area = value;
        }

        /**
         * Gets the value of the uom property.
         * 
         * @return
         *     possible object is
         *     {@link DistanceUnitListType }
         *     
         */
        public DistanceUnitListType getUOM() {
            return uom;
        }

        /**
         * Sets the value of the uom property.
         * 
         * @param value
         *     allowed object is
         *     {@link DistanceUnitListType }
         *     
         */
        public void setUOM(DistanceUnitListType value) {
            this.uom = value;
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
