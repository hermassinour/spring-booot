
package com.springboot.dto.orderviewrs;

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
import javax.xml.datatype.Duration;


/**
 * Price Variance supports specifying Payment Processing Rules, including payment failure.  Acceptable amount and/or percentage of the total amount by which the Order item price can vary. Example: 20 USD, 2 Percent
 * 
 * <p>Java class for PriceVarianceRuleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceVarianceRuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RuleID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type"/&gt;
 *         &lt;element name="RuleName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="AcceptableVarianceAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AmountType"/&gt;
 *         &lt;element name="AcceptableVariancePercent" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="EffectivePeriodDuration" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DurationType" minOccurs="0"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}RemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PriceVarianceRuleType", propOrder = {
    "ruleID",
    "ruleName",
    "acceptableVarianceAmount",
    "acceptableVariancePercent",
    "effectivePeriodDuration",
    "ownerName",
    "remark"
})
public class PriceVarianceRuleType {

    @XmlElement(name = "RuleID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ruleID;
    @XmlElement(name = "RuleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ruleName;
    @XmlElement(name = "AcceptableVarianceAmount", required = true)
    protected AmountType acceptableVarianceAmount;
    @XmlElement(name = "AcceptableVariancePercent")
    protected BigDecimal acceptableVariancePercent;
    @XmlElement(name = "EffectivePeriodDuration")
    protected Duration effectivePeriodDuration;
    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;

    /**
     * Gets the value of the ruleID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleID() {
        return ruleID;
    }

    /**
     * Sets the value of the ruleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleID(String value) {
        this.ruleID = value;
    }

    /**
     * Gets the value of the ruleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleName() {
        return ruleName;
    }

    /**
     * Sets the value of the ruleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleName(String value) {
        this.ruleName = value;
    }

    /**
     * Gets the value of the acceptableVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAcceptableVarianceAmount() {
        return acceptableVarianceAmount;
    }

    /**
     * Sets the value of the acceptableVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAcceptableVarianceAmount(AmountType value) {
        this.acceptableVarianceAmount = value;
    }

    /**
     * Gets the value of the acceptableVariancePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAcceptableVariancePercent() {
        return acceptableVariancePercent;
    }

    /**
     * Sets the value of the acceptableVariancePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAcceptableVariancePercent(BigDecimal value) {
        this.acceptableVariancePercent = value;
    }

    /**
     * Gets the value of the effectivePeriodDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getEffectivePeriodDuration() {
        return effectivePeriodDuration;
    }

    /**
     * Sets the value of the effectivePeriodDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setEffectivePeriodDuration(Duration value) {
        this.effectivePeriodDuration = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

}
