
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Deduction from the price amount, made in advance of its payment.
 * 
 * <p>Java class for DiscountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountPercent" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PercentType" minOccurs="0"/&gt;
 *         &lt;element name="PreDiscountedAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="AppText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DiscountContext" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}DiscountContextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountType", propOrder = {
    "discountAmount",
    "discountPercent",
    "preDiscountedAmount",
    "appText",
    "descText",
    "discountContext"
})
public class DiscountType {

    @XmlElement(name = "DiscountAmount")
    protected AmountType discountAmount;
    @XmlElement(name = "DiscountPercent")
    protected BigDecimal discountPercent;
    @XmlElement(name = "PreDiscountedAmount")
    protected AmountType preDiscountedAmount;
    @XmlElement(name = "AppText")
    protected String appText;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "DiscountContext")
    protected List<DiscountContextType> discountContext;

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setDiscountAmount(AmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the discountPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDiscountPercent() {
        return discountPercent;
    }

    /**
     * Sets the value of the discountPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDiscountPercent(BigDecimal value) {
        this.discountPercent = value;
    }

    /**
     * Gets the value of the preDiscountedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreDiscountedAmount() {
        return preDiscountedAmount;
    }

    /**
     * Sets the value of the preDiscountedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreDiscountedAmount(AmountType value) {
        this.preDiscountedAmount = value;
    }

    /**
     * Gets the value of the appText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppText() {
        return appText;
    }

    /**
     * Sets the value of the appText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppText(String value) {
        this.appText = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the discountContext property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the discountContext property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiscountContext().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiscountContextType }
     * 
     * 
     */
    public List<DiscountContextType> getDiscountContext() {
        if (discountContext == null) {
            discountContext = new ArrayList<DiscountContextType>();
        }
        return this.discountContext;
    }

}
