
package com.springboot.dto.offerpricerq;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * AMOUNT with OPTIONAL CURRENCY ENCODING representation.
 * 
 * <p>Java class for CurrencyAmountOptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CurrencyAmountOptType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;decimal"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}AmountCurrencyOptGroup"/&gt;
 *       &lt;attribute name="Taxable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyAmountOptType", propOrder = {
    "value"
})
@XmlSeeAlso({
    SimpleCurrencyPriceType.class,
    com.springboot.dto.offerpricerq.TaxExemptionType.Total.class,
    com.springboot.dto.offerpricerq.BaseFareTransactionType.Amount.class,
    com.springboot.dto.offerpricerq.EquivFareTransactionType.Amount.class,
    com.springboot.dto.offerpricerq.TotalFareTransactionType.Amount.class,
    com.springboot.dto.offerpricerq.GroupBudgetType.Amount.class,
    com.springboot.dto.offerpricerq.PersonBudgetType.Amount.class,
    com.springboot.dto.offerpricerq.TaxDetailType.Total.class,
    com.springboot.dto.offerpricerq.FeeSurchargeType.Total.class
})
public class CurrencyAmountOptType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "Taxable")
    protected Boolean taxable;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the taxable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTaxable() {
        if (taxable == null) {
            return true;
        } else {
            return taxable;
        }
    }

    /**
     * Sets the value of the taxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTaxable(Boolean value) {
        this.taxable = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

}
