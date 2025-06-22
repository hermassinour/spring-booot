
package com.springboot.dto.airshoppingrs;

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
 * ORDER PAYMENT FORM definition.
 * 
 * <p>Java class for OrderPaymentFormType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderPaymentFormType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}IATA_CodeType"/&gt;
 *         &lt;element name="Method"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Voucher"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PaymentCard"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Other"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}MiscChargeOrder"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}LoyaltyRedemption"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}DirectBill"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Cash"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BankAccount"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Check"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}SimpleCurrencyPriceType"/&gt;
 *         &lt;element name="Payer" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ContactInfoRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "OrderPaymentFormType", propOrder = {
    "type",
    "method",
    "amount",
    "payer"
})
public class OrderPaymentFormType {

    @XmlElement(name = "Type", required = true)
    protected String type;
    @XmlElement(name = "Method", required = true)
    protected OrderPaymentFormType.Method method;
    @XmlElement(name = "Amount", required = true)
    protected SimpleCurrencyPriceType amount;
    @XmlElement(name = "Payer")
    protected OrderPaymentFormType.Payer payer;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Method }
     *     
     */
    public OrderPaymentFormType.Method getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Method }
     *     
     */
    public void setMethod(OrderPaymentFormType.Method value) {
        this.method = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public SimpleCurrencyPriceType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleCurrencyPriceType }
     *     
     */
    public void setAmount(SimpleCurrencyPriceType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the payer property.
     * 
     * @return
     *     possible object is
     *     {@link OrderPaymentFormType.Payer }
     *     
     */
    public OrderPaymentFormType.Payer getPayer() {
        return payer;
    }

    /**
     * Sets the value of the payer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderPaymentFormType.Payer }
     *     
     */
    public void setPayer(OrderPaymentFormType.Payer value) {
        this.payer = value;
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
     *       &lt;choice&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Voucher"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PaymentCard"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Other"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}MiscChargeOrder"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}LoyaltyRedemption"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}DirectBill"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Cash"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BankAccount"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Check"/&gt;
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
        "voucher",
        "paymentCard",
        "other",
        "miscChargeOrder",
        "loyaltyRedemption",
        "directBill",
        "cash",
        "bankAccount",
        "check"
    })
    public static class Method {

        @XmlElement(name = "Voucher")
        protected Voucher voucher;
        @XmlElement(name = "PaymentCard")
        protected V172PaymentCardType paymentCard;
        @XmlElement(name = "Other")
        protected Other other;
        @XmlElement(name = "MiscChargeOrder")
        protected MiscChargeOrder miscChargeOrder;
        @XmlElement(name = "LoyaltyRedemption")
        protected LoyaltyRedemption loyaltyRedemption;
        @XmlElement(name = "DirectBill")
        protected V172DirectBillType directBill;
        @XmlElement(name = "Cash")
        protected Cash cash;
        @XmlElement(name = "BankAccount")
        protected V172BankAccountType bankAccount;
        @XmlElement(name = "Check")
        protected Check check;

        /**
         * Information relating to prepayment vouchers.
         * 
         * @return
         *     possible object is
         *     {@link Voucher }
         *     
         */
        public Voucher getVoucher() {
            return voucher;
        }

        /**
         * Sets the value of the voucher property.
         * 
         * @param value
         *     allowed object is
         *     {@link Voucher }
         *     
         */
        public void setVoucher(Voucher value) {
            this.voucher = value;
        }

        /**
         * Gets the value of the paymentCard property.
         * 
         * @return
         *     possible object is
         *     {@link V172PaymentCardType }
         *     
         */
        public V172PaymentCardType getPaymentCard() {
            return paymentCard;
        }

        /**
         * Sets the value of the paymentCard property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172PaymentCardType }
         *     
         */
        public void setPaymentCard(V172PaymentCardType value) {
            this.paymentCard = value;
        }

        /**
         * Gets the value of the other property.
         * 
         * @return
         *     possible object is
         *     {@link Other }
         *     
         */
        public Other getOther() {
            return other;
        }

        /**
         * Sets the value of the other property.
         * 
         * @param value
         *     allowed object is
         *     {@link Other }
         *     
         */
        public void setOther(Other value) {
            this.other = value;
        }

        /**
         * Gets the value of the miscChargeOrder property.
         * 
         * @return
         *     possible object is
         *     {@link MiscChargeOrder }
         *     
         */
        public MiscChargeOrder getMiscChargeOrder() {
            return miscChargeOrder;
        }

        /**
         * Sets the value of the miscChargeOrder property.
         * 
         * @param value
         *     allowed object is
         *     {@link MiscChargeOrder }
         *     
         */
        public void setMiscChargeOrder(MiscChargeOrder value) {
            this.miscChargeOrder = value;
        }

        /**
         * Gets the value of the loyaltyRedemption property.
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public LoyaltyRedemption getLoyaltyRedemption() {
            return loyaltyRedemption;
        }

        /**
         * Sets the value of the loyaltyRedemption property.
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyRedemption }
         *     
         */
        public void setLoyaltyRedemption(LoyaltyRedemption value) {
            this.loyaltyRedemption = value;
        }

        /**
         * Gets the value of the directBill property.
         * 
         * @return
         *     possible object is
         *     {@link V172DirectBillType }
         *     
         */
        public V172DirectBillType getDirectBill() {
            return directBill;
        }

        /**
         * Sets the value of the directBill property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172DirectBillType }
         *     
         */
        public void setDirectBill(V172DirectBillType value) {
            this.directBill = value;
        }

        /**
         * Gets the value of the cash property.
         * 
         * @return
         *     possible object is
         *     {@link Cash }
         *     
         */
        public Cash getCash() {
            return cash;
        }

        /**
         * Sets the value of the cash property.
         * 
         * @param value
         *     allowed object is
         *     {@link Cash }
         *     
         */
        public void setCash(Cash value) {
            this.cash = value;
        }

        /**
         * Gets the value of the bankAccount property.
         * 
         * @return
         *     possible object is
         *     {@link V172BankAccountType }
         *     
         */
        public V172BankAccountType getBankAccount() {
            return bankAccount;
        }

        /**
         * Sets the value of the bankAccount property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172BankAccountType }
         *     
         */
        public void setBankAccount(V172BankAccountType value) {
            this.bankAccount = value;
        }

        /**
         * Check (Cheque) Payment
         * 
         * @return
         *     possible object is
         *     {@link Check }
         *     
         */
        public Check getCheck() {
            return check;
        }

        /**
         * Sets the value of the check property.
         * 
         * @param value
         *     allowed object is
         *     {@link Check }
         *     
         */
        public void setCheck(Check value) {
            this.check = value;
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
     *         &lt;element name="ContactInfoRefs" type="{http://www.w3.org/2001/XMLSchema}token" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        "contactInfoRefs"
    })
    public static class Payer {

        @XmlElement(name = "ContactInfoRefs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> contactInfoRefs;

        /**
         * Gets the value of the contactInfoRefs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the contactInfoRefs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getContactInfoRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getContactInfoRefs() {
            if (contactInfoRefs == null) {
                contactInfoRefs = new ArrayList<String>();
            }
            return this.contactInfoRefs;
        }

    }

}
