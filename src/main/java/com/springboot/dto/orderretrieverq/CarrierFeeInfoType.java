
package com.springboot.dto.orderretrieverq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * CARRIER FEE definition.
 * 
 * <p>Java class for CarrierFeeInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierFeeInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaymentForm" minOccurs="0"/&gt;
 *         &lt;element name="CarrierFees" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Fee" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
 *                             &lt;element name="FeeAmount" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Type"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencyAmountOptType"/&gt;
 *                                       &lt;element name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencySimpleType" minOccurs="0"/&gt;
 *                                       &lt;element name="ApplicationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DepartureCode"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ArrivalCode"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Taxes" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TaxDetailType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaymentForm" minOccurs="0"/&gt;
 *                             &lt;element name="FareComponent" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Number" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                                             &lt;minInclusive value="0"/&gt;
 *                                             &lt;maxInclusive value="4"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="TariffNumber" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;pattern value="[0-9]{1,3}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RuleNumber" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;pattern value="[0-9a-zA-Z]{1,8}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                       &lt;element name="RuleCode" minOccurs="0"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AirlineID" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ&gt;AirlineID_Type"&gt;
 *                                     &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ProperNameSimpleType" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FareClassCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;minLength value="1"/&gt;
 *                                   &lt;maxLength value="8"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="ReportingCode" minOccurs="0"&gt;
 *                               &lt;simpleType&gt;
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                   &lt;pattern value="[0-9a-zA-Z]{1}"/&gt;
 *                                 &lt;/restriction&gt;
 *                               &lt;/simpleType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Taxes" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TaxDetailType"&gt;
 *               &lt;/extension&gt;
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
@XmlType(name = "CarrierFeeInfoType", propOrder = {
    "paymentForm",
    "carrierFees",
    "taxes"
})
public class CarrierFeeInfoType {

    @XmlElement(name = "PaymentForm")
    protected AcceptedPaymentFormType paymentForm;
    @XmlElement(name = "CarrierFees")
    protected CarrierFeeInfoType.CarrierFees carrierFees;
    @XmlElement(name = "Taxes")
    protected CarrierFeeInfoType.Taxes taxes;

    /**
     * Gets the value of the paymentForm property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptedPaymentFormType }
     *     
     */
    public AcceptedPaymentFormType getPaymentForm() {
        return paymentForm;
    }

    /**
     * Sets the value of the paymentForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptedPaymentFormType }
     *     
     */
    public void setPaymentForm(AcceptedPaymentFormType value) {
        this.paymentForm = value;
    }

    /**
     * Gets the value of the carrierFees property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierFeeInfoType.CarrierFees }
     *     
     */
    public CarrierFeeInfoType.CarrierFees getCarrierFees() {
        return carrierFees;
    }

    /**
     * Sets the value of the carrierFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierFeeInfoType.CarrierFees }
     *     
     */
    public void setCarrierFees(CarrierFeeInfoType.CarrierFees value) {
        this.carrierFees = value;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierFeeInfoType.Taxes }
     *     
     */
    public CarrierFeeInfoType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * Sets the value of the taxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierFeeInfoType.Taxes }
     *     
     */
    public void setTaxes(CarrierFeeInfoType.Taxes value) {
        this.taxes = value;
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
     *         &lt;element name="Fee" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
     *                   &lt;element name="FeeAmount" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Type"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencyAmountOptType"/&gt;
     *                             &lt;element name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencySimpleType" minOccurs="0"/&gt;
     *                             &lt;element name="ApplicationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DepartureCode"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ArrivalCode"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Taxes" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TaxDetailType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaymentForm" minOccurs="0"/&gt;
     *                   &lt;element name="FareComponent" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Number" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *                                   &lt;minInclusive value="0"/&gt;
     *                                   &lt;maxInclusive value="4"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="TariffNumber" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="[0-9]{1,3}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RuleNumber" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="[0-9a-zA-Z]{1,8}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                             &lt;element name="RuleCode" minOccurs="0"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AirlineID" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ&gt;AirlineID_Type"&gt;
     *                           &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ProperNameSimpleType" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FareClassCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;minLength value="1"/&gt;
     *                         &lt;maxLength value="8"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="ReportingCode" minOccurs="0"&gt;
     *                     &lt;simpleType&gt;
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                         &lt;pattern value="[0-9a-zA-Z]{1}"/&gt;
     *                       &lt;/restriction&gt;
     *                     &lt;/simpleType&gt;
     *                   &lt;/element&gt;
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
    @XmlType(name = "", propOrder = {
        "fee"
    })
    public static class CarrierFees {

        @XmlElement(name = "Fee", required = true)
        protected List<CarrierFeeInfoType.CarrierFees.Fee> fee;

        /**
         * Gets the value of the fee property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fee property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFee().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CarrierFeeInfoType.CarrierFees.Fee }
         * 
         * 
         */
        public List<CarrierFeeInfoType.CarrierFees.Fee> getFee() {
            if (fee == null) {
                fee = new ArrayList<CarrierFeeInfoType.CarrierFees.Fee>();
            }
            return this.fee;
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
         *         &lt;element name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
         *         &lt;element name="FeeAmount" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Type"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencyAmountOptType"/&gt;
         *                   &lt;element name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencySimpleType" minOccurs="0"/&gt;
         *                   &lt;element name="ApplicationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DepartureCode"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ArrivalCode"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Taxes" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TaxDetailType"&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PaymentForm" minOccurs="0"/&gt;
         *         &lt;element name="FareComponent" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Number" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
         *                         &lt;minInclusive value="0"/&gt;
         *                         &lt;maxInclusive value="4"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="TariffNumber" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;pattern value="[0-9]{1,3}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RuleNumber" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;pattern value="[0-9a-zA-Z]{1,8}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                   &lt;element name="RuleCode" minOccurs="0"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AirlineID" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ&gt;AirlineID_Type"&gt;
         *                 &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ProperNameSimpleType" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FareClassCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;minLength value="1"/&gt;
         *               &lt;maxLength value="8"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="ReportingCode" minOccurs="0"&gt;
         *           &lt;simpleType&gt;
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *               &lt;pattern value="[0-9a-zA-Z]{1}"/&gt;
         *             &lt;/restriction&gt;
         *           &lt;/simpleType&gt;
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
        @XmlType(name = "", propOrder = {
            "type",
            "feeAmount",
            "taxes",
            "paymentForm",
            "fareComponent",
            "airlineID",
            "fareClassCode",
            "reportingCode"
        })
        public static class Fee {

            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "FeeAmount", required = true)
            protected List<CarrierFeeInfoType.CarrierFees.Fee.FeeAmount> feeAmount;
            @XmlElement(name = "Taxes")
            protected CarrierFeeInfoType.CarrierFees.Fee.Taxes taxes;
            @XmlElement(name = "PaymentForm")
            protected AcceptedPaymentFormType paymentForm;
            @XmlElement(name = "FareComponent")
            protected CarrierFeeInfoType.CarrierFees.Fee.FareComponent fareComponent;
            @XmlElement(name = "AirlineID")
            protected CarrierFeeInfoType.CarrierFees.Fee.AirlineID airlineID;
            @XmlElement(name = "FareClassCode")
            protected String fareClassCode;
            @XmlElement(name = "ReportingCode")
            protected String reportingCode;

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
             * Gets the value of the feeAmount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feeAmount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeeAmount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CarrierFeeInfoType.CarrierFees.Fee.FeeAmount }
             * 
             * 
             */
            public List<CarrierFeeInfoType.CarrierFees.Fee.FeeAmount> getFeeAmount() {
                if (feeAmount == null) {
                    feeAmount = new ArrayList<CarrierFeeInfoType.CarrierFees.Fee.FeeAmount>();
                }
                return this.feeAmount;
            }

            /**
             * Gets the value of the taxes property.
             * 
             * @return
             *     possible object is
             *     {@link CarrierFeeInfoType.CarrierFees.Fee.Taxes }
             *     
             */
            public CarrierFeeInfoType.CarrierFees.Fee.Taxes getTaxes() {
                return taxes;
            }

            /**
             * Sets the value of the taxes property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarrierFeeInfoType.CarrierFees.Fee.Taxes }
             *     
             */
            public void setTaxes(CarrierFeeInfoType.CarrierFees.Fee.Taxes value) {
                this.taxes = value;
            }

            /**
             * Gets the value of the paymentForm property.
             * 
             * @return
             *     possible object is
             *     {@link AcceptedPaymentFormType }
             *     
             */
            public AcceptedPaymentFormType getPaymentForm() {
                return paymentForm;
            }

            /**
             * Sets the value of the paymentForm property.
             * 
             * @param value
             *     allowed object is
             *     {@link AcceptedPaymentFormType }
             *     
             */
            public void setPaymentForm(AcceptedPaymentFormType value) {
                this.paymentForm = value;
            }

            /**
             * Gets the value of the fareComponent property.
             * 
             * @return
             *     possible object is
             *     {@link CarrierFeeInfoType.CarrierFees.Fee.FareComponent }
             *     
             */
            public CarrierFeeInfoType.CarrierFees.Fee.FareComponent getFareComponent() {
                return fareComponent;
            }

            /**
             * Sets the value of the fareComponent property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarrierFeeInfoType.CarrierFees.Fee.FareComponent }
             *     
             */
            public void setFareComponent(CarrierFeeInfoType.CarrierFees.Fee.FareComponent value) {
                this.fareComponent = value;
            }

            /**
             * Gets the value of the airlineID property.
             * 
             * @return
             *     possible object is
             *     {@link CarrierFeeInfoType.CarrierFees.Fee.AirlineID }
             *     
             */
            public CarrierFeeInfoType.CarrierFees.Fee.AirlineID getAirlineID() {
                return airlineID;
            }

            /**
             * Sets the value of the airlineID property.
             * 
             * @param value
             *     allowed object is
             *     {@link CarrierFeeInfoType.CarrierFees.Fee.AirlineID }
             *     
             */
            public void setAirlineID(CarrierFeeInfoType.CarrierFees.Fee.AirlineID value) {
                this.airlineID = value;
            }

            /**
             * Gets the value of the fareClassCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFareClassCode() {
                return fareClassCode;
            }

            /**
             * Sets the value of the fareClassCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFareClassCode(String value) {
                this.fareClassCode = value;
            }

            /**
             * Gets the value of the reportingCode property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReportingCode() {
                return reportingCode;
            }

            /**
             * Sets the value of the reportingCode property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReportingCode(String value) {
                this.reportingCode = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ&gt;AirlineID_Type"&gt;
             *       &lt;attribute name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ProperNameSimpleType" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AirlineID
                extends AirlineIDType
            {

                @XmlAttribute(name = "Name")
                protected String name;

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
             *         &lt;element name="Number" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
             *               &lt;minInclusive value="0"/&gt;
             *               &lt;maxInclusive value="4"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="TariffNumber" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[0-9]{1,3}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RuleNumber" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[0-9a-zA-Z]{1,8}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="RuleCode" minOccurs="0"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
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
            @XmlType(name = "", propOrder = {
                "number",
                "tariffNumber",
                "ruleNumber",
                "ruleCode"
            })
            public static class FareComponent {

                @XmlElement(name = "Number")
                protected Integer number;
                @XmlElement(name = "TariffNumber")
                protected String tariffNumber;
                @XmlElement(name = "RuleNumber")
                protected String ruleNumber;
                @XmlElement(name = "RuleCode")
                protected String ruleCode;

                /**
                 * Gets the value of the number property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getNumber() {
                    return number;
                }

                /**
                 * Sets the value of the number property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setNumber(Integer value) {
                    this.number = value;
                }

                /**
                 * Gets the value of the tariffNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTariffNumber() {
                    return tariffNumber;
                }

                /**
                 * Sets the value of the tariffNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTariffNumber(String value) {
                    this.tariffNumber = value;
                }

                /**
                 * Gets the value of the ruleNumber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRuleNumber() {
                    return ruleNumber;
                }

                /**
                 * Sets the value of the ruleNumber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRuleNumber(String value) {
                    this.ruleNumber = value;
                }

                /**
                 * Gets the value of the ruleCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRuleCode() {
                    return ruleCode;
                }

                /**
                 * Sets the value of the ruleCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRuleCode(String value) {
                    this.ruleCode = value;
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
             *         &lt;element name="Type"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;pattern value="[0-9a-zA-Z]{1,3}"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencyAmountOptType"/&gt;
             *         &lt;element name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}CurrencySimpleType" minOccurs="0"/&gt;
             *         &lt;element name="ApplicationCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}IATA_CodeType"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}DepartureCode"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ArrivalCode"/&gt;
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
                "type",
                "amount",
                "currencyCode",
                "applicationCode",
                "departureCode",
                "arrivalCode"
            })
            public static class FeeAmount {

                @XmlElement(name = "Type", required = true)
                protected String type;
                @XmlElement(name = "Amount", required = true)
                protected CurrencyAmountOptType amount;
                @XmlElement(name = "CurrencyCode")
                protected String currencyCode;
                @XmlElement(name = "ApplicationCode", required = true)
                protected String applicationCode;
                @XmlElement(name = "DepartureCode", required = true)
                protected DepartureCode departureCode;
                @XmlElement(name = "ArrivalCode", required = true)
                protected ArrivalCode arrivalCode;

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
                 * Gets the value of the amount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public CurrencyAmountOptType getAmount() {
                    return amount;
                }

                /**
                 * Sets the value of the amount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CurrencyAmountOptType }
                 *     
                 */
                public void setAmount(CurrencyAmountOptType value) {
                    this.amount = value;
                }

                /**
                 * Gets the value of the currencyCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * Sets the value of the currencyCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * Gets the value of the applicationCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getApplicationCode() {
                    return applicationCode;
                }

                /**
                 * Sets the value of the applicationCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setApplicationCode(String value) {
                    this.applicationCode = value;
                }

                /**
                 * Departure Airport Location code. Example: TPA
                 * 
                 * Encoding Scheme: IATA/ A4A (three character) Airport or City Code
                 * 
                 * @return
                 *     possible object is
                 *     {@link DepartureCode }
                 *     
                 */
                public DepartureCode getDepartureCode() {
                    return departureCode;
                }

                /**
                 * Sets the value of the departureCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DepartureCode }
                 *     
                 */
                public void setDepartureCode(DepartureCode value) {
                    this.departureCode = value;
                }

                /**
                 * Gets the value of the arrivalCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link ArrivalCode }
                 *     
                 */
                public ArrivalCode getArrivalCode() {
                    return arrivalCode;
                }

                /**
                 * Sets the value of the arrivalCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ArrivalCode }
                 *     
                 */
                public void setArrivalCode(ArrivalCode value) {
                    this.arrivalCode = value;
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
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TaxDetailType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Taxes
                extends TaxDetailType
            {


            }

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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TaxDetailType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Taxes
        extends TaxDetailType
    {


    }

}
