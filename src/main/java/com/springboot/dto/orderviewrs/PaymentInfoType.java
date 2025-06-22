
package com.springboot.dto.orderviewrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Information related to the settlement of a transaction through monetary or other compensations. For example, a payment may be applied to an entire Order or individual Order Items.
 * 
 * <p>Java class for PaymentInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaymentInfoID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AmountType"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PaymentMethodCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentStatusCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PaymentStatusCodeType" minOccurs="0"/&gt;
 *         &lt;element name="PriceVarianceAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="Promotion" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PromotionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PriceVarianceRule" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PriceVarianceRuleType" minOccurs="0"/&gt;
 *         &lt;element name="VerificationInd" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/&gt;
 *         &lt;element name="OrderItemRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfoRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DescType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PaymentMethodType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInfoType", propOrder = {
    "paymentInfoID",
    "amount",
    "typeCode",
    "paymentStatusCode",
    "priceVarianceAmount",
    "promotion",
    "priceVarianceRule",
    "verificationInd",
    "orderItemRefID",
    "contactInfoRefID",
    "desc",
    "paymentMethod"
})
public class PaymentInfoType {

    @XmlElement(name = "PaymentInfoID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paymentInfoID;
    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "TypeCode")
    protected String typeCode;
    @XmlElement(name = "PaymentStatusCode")
    @XmlSchemaType(name = "string")
    protected PaymentStatusContentType paymentStatusCode;
    @XmlElement(name = "PriceVarianceAmount")
    protected AmountType priceVarianceAmount;
    @XmlElement(name = "Promotion")
    protected List<PromotionType> promotion;
    @XmlElement(name = "PriceVarianceRule")
    protected PriceVarianceRuleType priceVarianceRule;
    @XmlElement(name = "VerificationInd")
    protected Object verificationInd;
    @XmlElement(name = "OrderItemRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> orderItemRefID;
    @XmlElement(name = "ContactInfoRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoRefID;
    @XmlElement(name = "Desc")
    protected DescType desc;
    @XmlElement(name = "PaymentMethod", required = true)
    protected PaymentMethodType paymentMethod;

    /**
     * Gets the value of the paymentInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentInfoID() {
        return paymentInfoID;
    }

    /**
     * Sets the value of the paymentInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentInfoID(String value) {
        this.paymentInfoID = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeCode(String value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the paymentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusContentType }
     *     
     */
    public PaymentStatusContentType getPaymentStatusCode() {
        return paymentStatusCode;
    }

    /**
     * Sets the value of the paymentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusContentType }
     *     
     */
    public void setPaymentStatusCode(PaymentStatusContentType value) {
        this.paymentStatusCode = value;
    }

    /**
     * Gets the value of the priceVarianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPriceVarianceAmount() {
        return priceVarianceAmount;
    }

    /**
     * Sets the value of the priceVarianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPriceVarianceAmount(AmountType value) {
        this.priceVarianceAmount = value;
    }

    /**
     * Gets the value of the promotion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotionType }
     * 
     * 
     */
    public List<PromotionType> getPromotion() {
        if (promotion == null) {
            promotion = new ArrayList<PromotionType>();
        }
        return this.promotion;
    }

    /**
     * Gets the value of the priceVarianceRule property.
     * 
     * @return
     *     possible object is
     *     {@link PriceVarianceRuleType }
     *     
     */
    public PriceVarianceRuleType getPriceVarianceRule() {
        return priceVarianceRule;
    }

    /**
     * Sets the value of the priceVarianceRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceVarianceRuleType }
     *     
     */
    public void setPriceVarianceRule(PriceVarianceRuleType value) {
        this.priceVarianceRule = value;
    }

    /**
     * Gets the value of the verificationInd property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getVerificationInd() {
        return verificationInd;
    }

    /**
     * Sets the value of the verificationInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setVerificationInd(Object value) {
        this.verificationInd = value;
    }

    /**
     * Gets the value of the orderItemRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOrderItemRefID() {
        if (orderItemRefID == null) {
            orderItemRefID = new ArrayList<String>();
        }
        return this.orderItemRefID;
    }

    /**
     * Gets the value of the contactInfoRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoRefID() {
        return contactInfoRefID;
    }

    /**
     * Sets the value of the contactInfoRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoRefID(String value) {
        this.contactInfoRefID = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
        this.paymentMethod = value;
    }

}
