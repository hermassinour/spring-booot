
package com.springboot.dto.airshoppingrq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Affinity search includes a wide range of criteria including generic origin/destination information, trip time periods, as well as travel budget.
 * 
 * <p>Java class for AffinityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AffinityOriginDest" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AffinityOriginDestType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="BudgetAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="JourneyDistanceCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}JourneyDistanceCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}JourneyDurationCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="KeywordPreference" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ShoppingResponseType" minOccurs="0"/&gt;
 *         &lt;element name="StayPeriod" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="StartDate" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DateType" minOccurs="0"/&gt;
 *                   &lt;element name="EndDate" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DateType" minOccurs="0"/&gt;
 *                   &lt;element name="StayMonthName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NameType" maxOccurs="12" minOccurs="0"/&gt;
 *                   &lt;element name="StayQuarterText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" maxOccurs="4" minOccurs="0"/&gt;
 *                   &lt;element name="MaximumStayNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NumberType" minOccurs="0"/&gt;
 *                   &lt;element name="MinimumStayNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NumberType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
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
@XmlType(name = "AffinityRequestType", propOrder = {
    "affinityOriginDest",
    "budgetAmount",
    "journeyDistanceCriteria",
    "journeyDurationCriteria",
    "keywordPreference",
    "shoppingResponse",
    "stayPeriod"
})
public class AffinityRequestType {

    @XmlElement(name = "AffinityOriginDest", required = true)
    protected List<AffinityOriginDestType> affinityOriginDest;
    @XmlElement(name = "BudgetAmount")
    protected AmountType budgetAmount;
    @XmlElement(name = "JourneyDistanceCriteria")
    protected JourneyDistanceCriteriaType journeyDistanceCriteria;
    @XmlElement(name = "JourneyDurationCriteria")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    @XmlElement(name = "KeywordPreference")
    protected List<KeyValuePropertyType> keywordPreference;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "StayPeriod")
    protected AffinityRequestType.StayPeriod stayPeriod;

    /**
     * Gets the value of the affinityOriginDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinityOriginDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinityOriginDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityOriginDestType }
     * 
     * 
     */
    public List<AffinityOriginDestType> getAffinityOriginDest() {
        if (affinityOriginDest == null) {
            affinityOriginDest = new ArrayList<AffinityOriginDestType>();
        }
        return this.affinityOriginDest;
    }

    /**
     * Gets the value of the budgetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBudgetAmount(AmountType value) {
        this.budgetAmount = value;
    }

    /**
     * Gets the value of the journeyDistanceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public JourneyDistanceCriteriaType getJourneyDistanceCriteria() {
        return journeyDistanceCriteria;
    }

    /**
     * Sets the value of the journeyDistanceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public void setJourneyDistanceCriteria(JourneyDistanceCriteriaType value) {
        this.journeyDistanceCriteria = value;
    }

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Gets the value of the keywordPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getKeywordPreference() {
        if (keywordPreference == null) {
            keywordPreference = new ArrayList<KeyValuePropertyType>();
        }
        return this.keywordPreference;
    }

    /**
     * Gets the value of the shoppingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

    /**
     * Gets the value of the stayPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityRequestType.StayPeriod }
     *     
     */
    public AffinityRequestType.StayPeriod getStayPeriod() {
        return stayPeriod;
    }

    /**
     * Sets the value of the stayPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityRequestType.StayPeriod }
     *     
     */
    public void setStayPeriod(AffinityRequestType.StayPeriod value) {
        this.stayPeriod = value;
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
     *         &lt;element name="StartDate" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DateType" minOccurs="0"/&gt;
     *         &lt;element name="EndDate" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DateType" minOccurs="0"/&gt;
     *         &lt;element name="StayMonthName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NameType" maxOccurs="12" minOccurs="0"/&gt;
     *         &lt;element name="StayQuarterText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" maxOccurs="4" minOccurs="0"/&gt;
     *         &lt;element name="MaximumStayNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NumberType" minOccurs="0"/&gt;
     *         &lt;element name="MinimumStayNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NumberType" minOccurs="0"/&gt;
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
        "startDate",
        "endDate",
        "stayMonthName",
        "stayQuarterText",
        "maximumStayNumber",
        "minimumStayNumber"
    })
    public static class StayPeriod {

        @XmlElement(name = "StartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar startDate;
        @XmlElement(name = "EndDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar endDate;
        @XmlElement(name = "StayMonthName")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> stayMonthName;
        @XmlElement(name = "StayQuarterText")
        protected List<String> stayQuarterText;
        @XmlElement(name = "MaximumStayNumber")
        protected BigDecimal maximumStayNumber;
        @XmlElement(name = "MinimumStayNumber")
        protected BigDecimal minimumStayNumber;

        /**
         * Gets the value of the startDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDate() {
            return startDate;
        }

        /**
         * Sets the value of the startDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDate(XMLGregorianCalendar value) {
            this.startDate = value;
        }

        /**
         * Gets the value of the endDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * Sets the value of the endDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
        }

        /**
         * Gets the value of the stayMonthName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stayMonthName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStayMonthName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStayMonthName() {
            if (stayMonthName == null) {
                stayMonthName = new ArrayList<String>();
            }
            return this.stayMonthName;
        }

        /**
         * Gets the value of the stayQuarterText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stayQuarterText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStayQuarterText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getStayQuarterText() {
            if (stayQuarterText == null) {
                stayQuarterText = new ArrayList<String>();
            }
            return this.stayQuarterText;
        }

        /**
         * Gets the value of the maximumStayNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaximumStayNumber() {
            return maximumStayNumber;
        }

        /**
         * Sets the value of the maximumStayNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaximumStayNumber(BigDecimal value) {
            this.maximumStayNumber = value;
        }

        /**
         * Gets the value of the minimumStayNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinimumStayNumber() {
            return minimumStayNumber;
        }

        /**
         * Sets the value of the minimumStayNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinimumStayNumber(BigDecimal value) {
            this.minimumStayNumber = value;
        }

    }

}
