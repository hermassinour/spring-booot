
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Message Parameters.
 * 
 * <p>Java class for OrdChangeParamsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdChangeParamsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Alerts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Notices" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="RefundFOP_Preference" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice minOccurs="0"&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Voucher" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PaymentCard" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Cash" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BankAccount" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Check" minOccurs="0"/&gt;
 *                   &lt;element name="CarrierCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *                 &lt;attribute name="OriginalFOP_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="References" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}MultiAssocSimpleType" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdChangeParamsType", propOrder = {
    "alerts",
    "notices",
    "reason",
    "refundFOPPreference"
})
public class OrdChangeParamsType {

    @XmlElement(name = "Alerts")
    protected AlertsType alerts;
    @XmlElement(name = "Notices")
    protected Notices notices;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElement(name = "RefundFOP_Preference")
    protected OrdChangeParamsType.RefundFOPPreference refundFOPPreference;
    @XmlAttribute(name = "References")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String references;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link AlertsType }
     *     
     */
    public AlertsType getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertsType }
     *     
     */
    public void setAlerts(AlertsType value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link Notices }
     *     
     */
    public Notices getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notices }
     *     
     */
    public void setNotices(Notices value) {
        this.notices = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the refundFOPPreference property.
     * 
     * @return
     *     possible object is
     *     {@link OrdChangeParamsType.RefundFOPPreference }
     *     
     */
    public OrdChangeParamsType.RefundFOPPreference getRefundFOPPreference() {
        return refundFOPPreference;
    }

    /**
     * Sets the value of the refundFOPPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdChangeParamsType.RefundFOPPreference }
     *     
     */
    public void setRefundFOPPreference(OrdChangeParamsType.RefundFOPPreference value) {
        this.refundFOPPreference = value;
    }

    /**
     * Gets the value of the references property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * Sets the value of the references property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
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
     *       &lt;choice minOccurs="0"&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Voucher" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PaymentCard" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Cash" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BankAccount" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Check" minOccurs="0"/&gt;
     *         &lt;element name="CarrierCredit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *       &lt;attribute name="OriginalFOP_Ind" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
        "cash",
        "bankAccount",
        "check",
        "carrierCredit"
    })
    public static class RefundFOPPreference {

        @XmlElement(name = "Voucher")
        protected Voucher voucher;
        @XmlElement(name = "PaymentCard")
        protected V172PaymentCardType paymentCard;
        @XmlElement(name = "Cash")
        protected Cash cash;
        @XmlElement(name = "BankAccount")
        protected V172BankAccountType bankAccount;
        @XmlElement(name = "Check")
        protected Check check;
        @XmlElement(name = "CarrierCredit")
        protected Boolean carrierCredit;
        @XmlAttribute(name = "OriginalFOP_Ind")
        protected Boolean originalFOPInd;

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

        /**
         * Gets the value of the carrierCredit property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCarrierCredit() {
            return carrierCredit;
        }

        /**
         * Sets the value of the carrierCredit property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCarrierCredit(Boolean value) {
            this.carrierCredit = value;
        }

        /**
         * Gets the value of the originalFOPInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOriginalFOPInd() {
            return originalFOPInd;
        }

        /**
         * Sets the value of the originalFOPInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOriginalFOPInd(Boolean value) {
            this.originalFOPInd = value;
        }

    }

}
