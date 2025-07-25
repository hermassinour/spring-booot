
package com.springboot.dto.ordercancelrs;

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
 * RULE SET definition.
 * 
 * <p>Java class for RuleSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RuleSetType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleSetID" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS&gt;ProperNameSimpleType"&gt;
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="RuleValid" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}YearPeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}YearMonthPeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TimePeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}QuarterPeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}MonthPeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DayPeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DateTimePeriod"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DatePeriod"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}ContextSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="Rule" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}RuleType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RuleSetType", propOrder = {
    "ruleSetID",
    "ruleValid",
    "owner",
    "rule"
})
public class RuleSetType {

    @XmlElement(name = "RuleSetID")
    protected RuleSetType.RuleSetID ruleSetID;
    @XmlElement(name = "RuleValid")
    protected RuleSetType.RuleValid ruleValid;
    @XmlElement(name = "Owner")
    protected String owner;
    @XmlElement(name = "Rule", required = true)
    protected List<RuleType> rule;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the ruleSetID property.
     * 
     * @return
     *     possible object is
     *     {@link RuleSetType.RuleSetID }
     *     
     */
    public RuleSetType.RuleSetID getRuleSetID() {
        return ruleSetID;
    }

    /**
     * Sets the value of the ruleSetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleSetType.RuleSetID }
     *     
     */
    public void setRuleSetID(RuleSetType.RuleSetID value) {
        this.ruleSetID = value;
    }

    /**
     * Gets the value of the ruleValid property.
     * 
     * @return
     *     possible object is
     *     {@link RuleSetType.RuleValid }
     *     
     */
    public RuleSetType.RuleValid getRuleValid() {
        return ruleValid;
    }

    /**
     * Sets the value of the ruleValid property.
     * 
     * @param value
     *     allowed object is
     *     {@link RuleSetType.RuleValid }
     *     
     */
    public void setRuleValid(RuleSetType.RuleValid value) {
        this.ruleValid = value;
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
     * Gets the value of the rule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RuleType }
     * 
     * 
     */
    public List<RuleType> getRule() {
        if (rule == null) {
            rule = new ArrayList<RuleType>();
        }
        return this.rule;
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
     *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS&gt;ProperNameSimpleType"&gt;
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
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
    public static class RuleSetID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name")
        @XmlSchemaType(name = "anySimpleType")
        protected String name;

        /**
         * A data type for Proper Name size constraint.
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
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}YearPeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}YearMonthPeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}TimePeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}QuarterPeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}MonthPeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DayPeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DateTimePeriod"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DatePeriod"/&gt;
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
        "yearPeriod",
        "yearMonthPeriod",
        "timePeriod",
        "quarterPeriod",
        "monthPeriod",
        "dayPeriod",
        "dateTimePeriod",
        "datePeriod"
    })
    public static class RuleValid {

        @XmlElement(name = "YearPeriod", required = true)
        protected YearPeriodRepType yearPeriod;
        @XmlElement(name = "YearMonthPeriod", required = true)
        protected YearMonthPeriodRepType yearMonthPeriod;
        @XmlElement(name = "TimePeriod", required = true)
        protected TimePeriodRepType timePeriod;
        @XmlElement(name = "QuarterPeriod", required = true)
        protected QuarterPeriodRepType quarterPeriod;
        @XmlElement(name = "MonthPeriod", required = true)
        protected MonthPeriodRepType monthPeriod;
        @XmlElement(name = "DayPeriod", required = true)
        protected DayPeriodRepType dayPeriod;
        @XmlElement(name = "DateTimePeriod", required = true)
        protected DateTimePeriodRepType dateTimePeriod;
        @XmlElement(name = "DatePeriod", required = true)
        protected DatePeriodRepType datePeriod;

        /**
         * Gets the value of the yearPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearPeriodRepType }
         *     
         */
        public YearPeriodRepType getYearPeriod() {
            return yearPeriod;
        }

        /**
         * Sets the value of the yearPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearPeriodRepType }
         *     
         */
        public void setYearPeriod(YearPeriodRepType value) {
            this.yearPeriod = value;
        }

        /**
         * Gets the value of the yearMonthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public YearMonthPeriodRepType getYearMonthPeriod() {
            return yearMonthPeriod;
        }

        /**
         * Sets the value of the yearMonthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link YearMonthPeriodRepType }
         *     
         */
        public void setYearMonthPeriod(YearMonthPeriodRepType value) {
            this.yearMonthPeriod = value;
        }

        /**
         * Gets the value of the timePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link TimePeriodRepType }
         *     
         */
        public TimePeriodRepType getTimePeriod() {
            return timePeriod;
        }

        /**
         * Sets the value of the timePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link TimePeriodRepType }
         *     
         */
        public void setTimePeriod(TimePeriodRepType value) {
            this.timePeriod = value;
        }

        /**
         * Gets the value of the quarterPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public QuarterPeriodRepType getQuarterPeriod() {
            return quarterPeriod;
        }

        /**
         * Sets the value of the quarterPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link QuarterPeriodRepType }
         *     
         */
        public void setQuarterPeriod(QuarterPeriodRepType value) {
            this.quarterPeriod = value;
        }

        /**
         * Gets the value of the monthPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public MonthPeriodRepType getMonthPeriod() {
            return monthPeriod;
        }

        /**
         * Sets the value of the monthPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link MonthPeriodRepType }
         *     
         */
        public void setMonthPeriod(MonthPeriodRepType value) {
            this.monthPeriod = value;
        }

        /**
         * Gets the value of the dayPeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DayPeriodRepType }
         *     
         */
        public DayPeriodRepType getDayPeriod() {
            return dayPeriod;
        }

        /**
         * Sets the value of the dayPeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DayPeriodRepType }
         *     
         */
        public void setDayPeriod(DayPeriodRepType value) {
            this.dayPeriod = value;
        }

        /**
         * Gets the value of the dateTimePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public DateTimePeriodRepType getDateTimePeriod() {
            return dateTimePeriod;
        }

        /**
         * Sets the value of the dateTimePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimePeriodRepType }
         *     
         */
        public void setDateTimePeriod(DateTimePeriodRepType value) {
            this.dateTimePeriod = value;
        }

        /**
         * Gets the value of the datePeriod property.
         * 
         * @return
         *     possible object is
         *     {@link DatePeriodRepType }
         *     
         */
        public DatePeriodRepType getDatePeriod() {
            return datePeriod;
        }

        /**
         * Sets the value of the datePeriod property.
         * 
         * @param value
         *     allowed object is
         *     {@link DatePeriodRepType }
         *     
         */
        public void setDatePeriod(DatePeriodRepType value) {
            this.datePeriod = value;
        }

    }

}
