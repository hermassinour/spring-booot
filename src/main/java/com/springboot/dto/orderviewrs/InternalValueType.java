
package com.springboot.dto.orderviewrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * The Internal Value is the portion of the Price (Base Amount) belonging to an individual Service which can be used to set up liabilities. This value shall also be used for revenue recognition at time of service consumption. The sum of all Internal Values
 * 
 * <p>Java class for InternalValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InternalValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="QuotedAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AmountType"/&gt;
 *         &lt;element name="SoldInAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AmountType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InternalValueType", propOrder = {
    "quotedAmount",
    "soldInAmount"
})
public class InternalValueType {

    @XmlElement(name = "QuotedAmount", required = true)
    protected AmountType quotedAmount;
    @XmlElement(name = "SoldInAmount", required = true)
    protected AmountType soldInAmount;

    /**
     * Gets the value of the quotedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getQuotedAmount() {
        return quotedAmount;
    }

    /**
     * Sets the value of the quotedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setQuotedAmount(AmountType value) {
        this.quotedAmount = value;
    }

    /**
     * Gets the value of the soldInAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getSoldInAmount() {
        return soldInAmount;
    }

    /**
     * Sets the value of the soldInAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setSoldInAmount(AmountType value) {
        this.soldInAmount = value;
    }

}
