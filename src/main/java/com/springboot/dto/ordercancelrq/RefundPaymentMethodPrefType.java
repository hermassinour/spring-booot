
package com.springboot.dto.ordercancelrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Choice of payment methods preferred by the customer for any refunds due to the cancellation of the Order.
 * 
 * <p>Java class for RefundPaymentMethodPrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefundPaymentMethodPrefType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OriginalPaymentMethodInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierCreditInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="BankAccount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}BankAccountType" minOccurs="0"/&gt;
 *         &lt;element name="Cash" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CashType" minOccurs="0"/&gt;
 *         &lt;element name="Check" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CheckType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentCard" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PaymentCardType" minOccurs="0"/&gt;
 *         &lt;element name="Voucher" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}VoucherType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundPaymentMethodPrefType", propOrder = {
    "originalPaymentMethodInd",
    "carrierCreditInd",
    "bankAccount",
    "cash",
    "check",
    "paymentCard",
    "voucher"
})
public class RefundPaymentMethodPrefType {

    @XmlElement(name = "OriginalPaymentMethodInd")
    protected Boolean originalPaymentMethodInd;
    @XmlElement(name = "CarrierCreditInd")
    protected Boolean carrierCreditInd;
    @XmlElement(name = "BankAccount")
    protected BankAccountType bankAccount;
    @XmlElement(name = "Cash")
    protected CashType cash;
    @XmlElement(name = "Check")
    protected CheckType check;
    @XmlElement(name = "PaymentCard")
    protected PaymentCardType paymentCard;
    @XmlElement(name = "Voucher")
    protected VoucherType voucher;

    /**
     * Gets the value of the originalPaymentMethodInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOriginalPaymentMethodInd() {
        return originalPaymentMethodInd;
    }

    /**
     * Sets the value of the originalPaymentMethodInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOriginalPaymentMethodInd(Boolean value) {
        this.originalPaymentMethodInd = value;
    }

    /**
     * Gets the value of the carrierCreditInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCarrierCreditInd() {
        return carrierCreditInd;
    }

    /**
     * Sets the value of the carrierCreditInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCarrierCreditInd(Boolean value) {
        this.carrierCreditInd = value;
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
