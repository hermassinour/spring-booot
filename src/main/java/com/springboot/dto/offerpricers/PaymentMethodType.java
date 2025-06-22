
package com.springboot.dto.offerpricers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A form of procedure for the payment of goods or services .
 * 
 * <p>Java class for PaymentMethodType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethodType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PaymentMethodCodeType"/&gt;
 *         &lt;element name="BankAccount" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}BankAccountType" minOccurs="0"/&gt;
 *         &lt;element name="Cash" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CashType" minOccurs="0"/&gt;
 *         &lt;element name="Check" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CheckType" minOccurs="0"/&gt;
 *         &lt;element name="DirectBill" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}DirectBillType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyRedemption" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}LoyaltyRedemptionType" minOccurs="0"/&gt;
 *         &lt;element name="MiscChargeOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}MiscChargeOrderType" minOccurs="0"/&gt;
 *         &lt;element name="OtherPaymentMethod" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}OtherPaymentMethodType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PaymentCardType" minOccurs="0"/&gt;
 *         &lt;element name="Voucher" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}VoucherType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethodType", propOrder = {
    "typeCode",
    "bankAccount",
    "cash",
    "check",
    "directBill",
    "loyaltyRedemption",
    "miscChargeOrder",
    "otherPaymentMethod",
    "paymentCard",
    "voucher"
})
public class PaymentMethodType {

    @XmlElement(name = "TypeCode", required = true)
    protected String typeCode;
    @XmlElement(name = "BankAccount")
    protected BankAccountType bankAccount;
    @XmlElement(name = "Cash")
    protected CashType cash;
    @XmlElement(name = "Check")
    protected CheckType check;
    @XmlElement(name = "DirectBill")
    protected DirectBillType directBill;
    @XmlElement(name = "LoyaltyRedemption")
    protected LoyaltyRedemptionType loyaltyRedemption;
    @XmlElement(name = "MiscChargeOrder")
    protected MiscChargeOrderType miscChargeOrder;
    @XmlElement(name = "OtherPaymentMethod")
    protected OtherPaymentMethodType otherPaymentMethod;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "Voucher")
    protected VoucherType voucher;

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
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BankAccountType }
     *     
     */
    public BankAccountType getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankAccountType }
     *     
     */
    public void setBankAccount(BankAccountType value) {
        this.bankAccount = value;
    }

    /**
     * Gets the value of the cash property.
     * 
     * @return
     *     possible object is
     *     {@link CashType }
     *     
     */
    public CashType getCash() {
        return cash;
    }

    /**
     * Sets the value of the cash property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashType }
     *     
     */
    public void setCash(CashType value) {
        this.cash = value;
    }

    /**
     * Gets the value of the check property.
     * 
     * @return
     *     possible object is
     *     {@link CheckType }
     *     
     */
    public CheckType getCheck() {
        return check;
    }

    /**
     * Sets the value of the check property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckType }
     *     
     */
    public void setCheck(CheckType value) {
        this.check = value;
    }

    /**
     * Gets the value of the directBill property.
     * 
     * @return
     *     possible object is
     *     {@link DirectBillType }
     *     
     */
    public DirectBillType getDirectBill() {
        return directBill;
    }

    /**
     * Sets the value of the directBill property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectBillType }
     *     
     */
    public void setDirectBill(DirectBillType value) {
        this.directBill = value;
    }

    /**
     * Gets the value of the loyaltyRedemption property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public LoyaltyRedemptionType getLoyaltyRedemption() {
        return loyaltyRedemption;
    }

    /**
     * Sets the value of the loyaltyRedemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyRedemptionType }
     *     
     */
    public void setLoyaltyRedemption(LoyaltyRedemptionType value) {
        this.loyaltyRedemption = value;
    }

    /**
     * Gets the value of the miscChargeOrder property.
     * 
     * @return
     *     possible object is
     *     {@link MiscChargeOrderType }
     *     
     */
    public MiscChargeOrderType getMiscChargeOrder() {
        return miscChargeOrder;
    }

    /**
     * Sets the value of the miscChargeOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link MiscChargeOrderType }
     *     
     */
    public void setMiscChargeOrder(MiscChargeOrderType value) {
        this.miscChargeOrder = value;
    }

    /**
     * Gets the value of the otherPaymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public OtherPaymentMethodType getOtherPaymentMethod() {
        return otherPaymentMethod;
    }

    /**
     * Sets the value of the otherPaymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPaymentMethodType }
     *     
     */
    public void setOtherPaymentMethod(OtherPaymentMethodType value) {
        this.otherPaymentMethod = value;
    }

    /**
     * Gets the value of the paymentCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType }
     *     
     */
    public PaymentCardType getPaymentCard() {
        return paymentCard;
    }

    /**
     * Sets the value of the paymentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType }
     *     
     */
    public void setPaymentCard(PaymentCardType value) {
        this.paymentCard = value;
    }

    /**
     * Gets the value of the voucher property.
     * 
     * @return
     *     possible object is
     *     {@link VoucherType }
     *     
     */
    public VoucherType getVoucher() {
        return voucher;
    }

    /**
     * Sets the value of the voucher property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoucherType }
     *     
     */
    public void setVoucher(VoucherType value) {
        this.voucher = value;
    }

}
