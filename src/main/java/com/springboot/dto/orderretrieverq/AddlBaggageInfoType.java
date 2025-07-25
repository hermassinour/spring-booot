
package com.springboot.dto.orderretrieverq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Carry-on and checked baggage allowances.
 * 
 * <p>Java class for AddlBaggageInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddlBaggageInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AllowableBag" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *                 &lt;attribute name="Number" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Numeric0to99" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="BagCharge" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}NumericStringLength1to19" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaLength3" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CarryOnAllowableBag" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="DeterminingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirlineType" /&gt;
 *                 &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *                 &lt;attribute name="Number" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Numeric0to99" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CarryOnChargeableBag" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Embargo" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Info" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to71" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}NumericStringLength1to19" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaLength3" /&gt;
 *                 &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
 *                 &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CarryOnFree" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
 *                 &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CheckedFree" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
 *                 &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CheckedChargeableBag" maxOccurs="99" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Embargo" maxOccurs="99" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="Info" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to71" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *                 &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}NumericStringLength1to19" /&gt;
 *                 &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaLength3" /&gt;
 *                 &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
 *                 &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="MaxFreeBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddlBaggageInfoType", propOrder = {
    "allowableBag",
    "bagCharge",
    "carryOnAllowableBag",
    "carryOnChargeableBag",
    "carryOnFree",
    "checkedFree",
    "checkedChargeableBag"
})
public class AddlBaggageInfoType {

    @XmlElement(name = "AllowableBag")
    protected List<AddlBaggageInfoType.AllowableBag> allowableBag;
    @XmlElement(name = "BagCharge")
    protected List<AddlBaggageInfoType.BagCharge> bagCharge;
    @XmlElement(name = "CarryOnAllowableBag")
    protected List<AddlBaggageInfoType.CarryOnAllowableBag> carryOnAllowableBag;
    @XmlElement(name = "CarryOnChargeableBag")
    protected List<AddlBaggageInfoType.CarryOnChargeableBag> carryOnChargeableBag;
    @XmlElement(name = "CarryOnFree")
    protected AddlBaggageInfoType.CarryOnFree carryOnFree;
    @XmlElement(name = "CheckedFree")
    protected AddlBaggageInfoType.CheckedFree checkedFree;
    @XmlElement(name = "CheckedChargeableBag")
    protected List<AddlBaggageInfoType.CheckedChargeableBag> checkedChargeableBag;
    @XmlAttribute(name = "MaxFreeBagDim")
    protected String maxFreeBagDim;

    /**
     * Gets the value of the allowableBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowableBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAllowableBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlBaggageInfoType.AllowableBag }
     * 
     * 
     */
    public List<AddlBaggageInfoType.AllowableBag> getAllowableBag() {
        if (allowableBag == null) {
            allowableBag = new ArrayList<AddlBaggageInfoType.AllowableBag>();
        }
        return this.allowableBag;
    }

    /**
     * Gets the value of the bagCharge property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagCharge property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagCharge().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlBaggageInfoType.BagCharge }
     * 
     * 
     */
    public List<AddlBaggageInfoType.BagCharge> getBagCharge() {
        if (bagCharge == null) {
            bagCharge = new ArrayList<AddlBaggageInfoType.BagCharge>();
        }
        return this.bagCharge;
    }

    /**
     * Gets the value of the carryOnAllowableBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnAllowableBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnAllowableBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlBaggageInfoType.CarryOnAllowableBag }
     * 
     * 
     */
    public List<AddlBaggageInfoType.CarryOnAllowableBag> getCarryOnAllowableBag() {
        if (carryOnAllowableBag == null) {
            carryOnAllowableBag = new ArrayList<AddlBaggageInfoType.CarryOnAllowableBag>();
        }
        return this.carryOnAllowableBag;
    }

    /**
     * Gets the value of the carryOnChargeableBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnChargeableBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnChargeableBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlBaggageInfoType.CarryOnChargeableBag }
     * 
     * 
     */
    public List<AddlBaggageInfoType.CarryOnChargeableBag> getCarryOnChargeableBag() {
        if (carryOnChargeableBag == null) {
            carryOnChargeableBag = new ArrayList<AddlBaggageInfoType.CarryOnChargeableBag>();
        }
        return this.carryOnChargeableBag;
    }

    /**
     * Gets the value of the carryOnFree property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBaggageInfoType.CarryOnFree }
     *     
     */
    public AddlBaggageInfoType.CarryOnFree getCarryOnFree() {
        return carryOnFree;
    }

    /**
     * Sets the value of the carryOnFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBaggageInfoType.CarryOnFree }
     *     
     */
    public void setCarryOnFree(AddlBaggageInfoType.CarryOnFree value) {
        this.carryOnFree = value;
    }

    /**
     * Gets the value of the checkedFree property.
     * 
     * @return
     *     possible object is
     *     {@link AddlBaggageInfoType.CheckedFree }
     *     
     */
    public AddlBaggageInfoType.CheckedFree getCheckedFree() {
        return checkedFree;
    }

    /**
     * Sets the value of the checkedFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddlBaggageInfoType.CheckedFree }
     *     
     */
    public void setCheckedFree(AddlBaggageInfoType.CheckedFree value) {
        this.checkedFree = value;
    }

    /**
     * Gets the value of the checkedChargeableBag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedChargeableBag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedChargeableBag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddlBaggageInfoType.CheckedChargeableBag }
     * 
     * 
     */
    public List<AddlBaggageInfoType.CheckedChargeableBag> getCheckedChargeableBag() {
        if (checkedChargeableBag == null) {
            checkedChargeableBag = new ArrayList<AddlBaggageInfoType.CheckedChargeableBag>();
        }
        return this.checkedChargeableBag;
    }

    /**
     * Gets the value of the maxFreeBagDim property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaxFreeBagDim() {
        return maxFreeBagDim;
    }

    /**
     * Sets the value of the maxFreeBagDim property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaxFreeBagDim(String value) {
        this.maxFreeBagDim = value;
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
     *       &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *       &lt;attribute name="Number" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Numeric0to99" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AllowableBag {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Number")
        protected Integer number;

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
     *       &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}NumericStringLength1to19" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaLength3" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BagCharge {

        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;

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
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
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
     *       &lt;attribute name="DeterminingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AirlineType" /&gt;
     *       &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *       &lt;attribute name="Number" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}Numeric0to99" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CarryOnAllowableBag {

        @XmlAttribute(name = "DeterminingCarrierCode")
        protected String determiningCarrierCode;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Number")
        protected Integer number;

        /**
         * Gets the value of the determiningCarrierCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeterminingCarrierCode() {
            return determiningCarrierCode;
        }

        /**
         * Sets the value of the determiningCarrierCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeterminingCarrierCode(String value) {
            this.determiningCarrierCode = value;
        }

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
     *         &lt;element name="Embargo" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Info" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to71" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}NumericStringLength1to19" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaLength3" /&gt;
     *       &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
     *       &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "embargo"
    })
    public static class CarryOnChargeableBag {

        @XmlElement(name = "Embargo")
        protected List<AddlBaggageInfoType.CarryOnChargeableBag.Embargo> embargo;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "MaxBagDim")
        protected String maxBagDim;
        @XmlAttribute(name = "MaxBagWght")
        protected String maxBagWght;

        /**
         * Gets the value of the embargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the embargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmbargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddlBaggageInfoType.CarryOnChargeableBag.Embargo }
         * 
         * 
         */
        public List<AddlBaggageInfoType.CarryOnChargeableBag.Embargo> getEmbargo() {
            if (embargo == null) {
                embargo = new ArrayList<AddlBaggageInfoType.CarryOnChargeableBag.Embargo>();
            }
            return this.embargo;
        }

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
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
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
         * Gets the value of the maxBagDim property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagDim() {
            return maxBagDim;
        }

        /**
         * Sets the value of the maxBagDim property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagDim(String value) {
            this.maxBagDim = value;
        }

        /**
         * Gets the value of the maxBagWght property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagWght() {
            return maxBagWght;
        }

        /**
         * Sets the value of the maxBagWght property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagWght(String value) {
            this.maxBagWght = value;
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
         *       &lt;attribute name="Info" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to71" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Embargo {

            @XmlAttribute(name = "Info")
            protected String info;

            /**
             * Gets the value of the info property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfo() {
                return info;
            }

            /**
             * Sets the value of the info property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfo(String value) {
                this.info = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
     *       &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CarryOnFree {

        @XmlAttribute(name = "MaxBagDim")
        protected String maxBagDim;
        @XmlAttribute(name = "MaxBagWght")
        protected String maxBagWght;

        /**
         * Gets the value of the maxBagDim property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagDim() {
            return maxBagDim;
        }

        /**
         * Sets the value of the maxBagDim property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagDim(String value) {
            this.maxBagDim = value;
        }

        /**
         * Gets the value of the maxBagWght property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagWght() {
            return maxBagWght;
        }

        /**
         * Sets the value of the maxBagWght property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagWght(String value) {
            this.maxBagWght = value;
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
     *         &lt;element name="Embargo" maxOccurs="99" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="Info" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to71" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Type" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *       &lt;attribute name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}NumericStringLength1to19" /&gt;
     *       &lt;attribute name="CurrencyCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaLength3" /&gt;
     *       &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
     *       &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "embargo"
    })
    public static class CheckedChargeableBag {

        @XmlElement(name = "Embargo")
        protected List<AddlBaggageInfoType.CheckedChargeableBag.Embargo> embargo;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Amount")
        protected String amount;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "MaxBagDim")
        protected String maxBagDim;
        @XmlAttribute(name = "MaxBagWght")
        protected String maxBagWght;

        /**
         * Gets the value of the embargo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the embargo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getEmbargo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddlBaggageInfoType.CheckedChargeableBag.Embargo }
         * 
         * 
         */
        public List<AddlBaggageInfoType.CheckedChargeableBag.Embargo> getEmbargo() {
            if (embargo == null) {
                embargo = new ArrayList<AddlBaggageInfoType.CheckedChargeableBag.Embargo>();
            }
            return this.embargo;
        }

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
         *     {@link String }
         *     
         */
        public String getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAmount(String value) {
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
         * Gets the value of the maxBagDim property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagDim() {
            return maxBagDim;
        }

        /**
         * Sets the value of the maxBagDim property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagDim(String value) {
            this.maxBagDim = value;
        }

        /**
         * Gets the value of the maxBagWght property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagWght() {
            return maxBagWght;
        }

        /**
         * Sets the value of the maxBagWght property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagWght(String value) {
            this.maxBagWght = value;
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
         *       &lt;attribute name="Info" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to71" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Embargo {

            @XmlAttribute(name = "Info")
            protected String info;

            /**
             * Gets the value of the info property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfo() {
                return info;
            }

            /**
             * Sets the value of the info property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfo(String value) {
                this.info = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;attribute name="MaxBagDim" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to4" /&gt;
     *       &lt;attribute name="MaxBagWght" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}AlphaNumericStringLength1to3" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CheckedFree {

        @XmlAttribute(name = "MaxBagDim")
        protected String maxBagDim;
        @XmlAttribute(name = "MaxBagWght")
        protected String maxBagWght;

        /**
         * Gets the value of the maxBagDim property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagDim() {
            return maxBagDim;
        }

        /**
         * Sets the value of the maxBagDim property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagDim(String value) {
            this.maxBagDim = value;
        }

        /**
         * Gets the value of the maxBagWght property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxBagWght() {
            return maxBagWght;
        }

        /**
         * Sets the value of the maxBagWght property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxBagWght(String value) {
            this.maxBagWght = value;
        }

    }

}
