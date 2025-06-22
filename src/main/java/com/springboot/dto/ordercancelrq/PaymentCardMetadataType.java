
package com.springboot.dto.ordercancelrq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for PAYMENT CARD Metadata.
 * 
 * <p>Java class for PaymentCardMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentCardMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CardName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardFields" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="FieldName" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CardProductType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}IATA_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="Surcharge" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType"/&gt;
 *                   &lt;element name="PercentageValue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}WholePercentageSimpleType"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}InstanceClassRefSimpleType" /&gt;
 *       &lt;attribute name="MetadataKey" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardMetadataType", propOrder = {
    "cardCode",
    "cardName",
    "cardType",
    "cardFields",
    "cardProductType",
    "surcharge"
})
public class PaymentCardMetadataType {

    @XmlElement(name = "CardCode", required = true)
    protected String cardCode;
    @XmlElement(name = "CardName")
    protected String cardName;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "CardFields")
    protected PaymentCardMetadataType.CardFields cardFields;
    @XmlElement(name = "CardProductType")
    protected String cardProductType;
    @XmlElement(name = "Surcharge")
    protected PaymentCardMetadataType.Surcharge surcharge;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;
    @XmlAttribute(name = "MetadataKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String metadataKey;

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * Sets the value of the cardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardName(String value) {
        this.cardName = value;
    }

    /**
     * Gets the value of the cardType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * Sets the value of the cardType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * Gets the value of the cardFields property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardMetadataType.CardFields }
     *     
     */
    public PaymentCardMetadataType.CardFields getCardFields() {
        return cardFields;
    }

    /**
     * Sets the value of the cardFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardMetadataType.CardFields }
     *     
     */
    public void setCardFields(PaymentCardMetadataType.CardFields value) {
        this.cardFields = value;
    }

    /**
     * Gets the value of the cardProductType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardProductType() {
        return cardProductType;
    }

    /**
     * Sets the value of the cardProductType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardProductType(String value) {
        this.cardProductType = value;
    }

    /**
     * Gets the value of the surcharge property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardMetadataType.Surcharge }
     *     
     */
    public PaymentCardMetadataType.Surcharge getSurcharge() {
        return surcharge;
    }

    /**
     * Sets the value of the surcharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardMetadataType.Surcharge }
     *     
     */
    public void setSurcharge(PaymentCardMetadataType.Surcharge value) {
        this.surcharge = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

    /**
     * Gets the value of the metadataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataKey() {
        return metadataKey;
    }

    /**
     * Sets the value of the metadataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataKey(String value) {
        this.metadataKey = value;
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
     *         &lt;element name="FieldName" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
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
        "fieldName"
    })
    public static class CardFields {

        @XmlElement(name = "FieldName", required = true)
        protected List<PaymentCardMetadataType.CardFields.FieldName> fieldName;

        /**
         * Gets the value of the fieldName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fieldName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFieldName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PaymentCardMetadataType.CardFields.FieldName }
         * 
         * 
         */
        public List<PaymentCardMetadataType.CardFields.FieldName> getFieldName() {
            if (fieldName == null) {
                fieldName = new ArrayList<PaymentCardMetadataType.CardFields.FieldName>();
            }
            return this.fieldName;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *       &lt;attribute name="Mandatory" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class FieldName {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Mandatory", required = true)
            protected boolean mandatory;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the mandatory property.
             * 
             */
            public boolean isMandatory() {
                return mandatory;
            }

            /**
             * Sets the value of the mandatory property.
             * 
             */
            public void setMandatory(boolean value) {
                this.mandatory = value;
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
     *       &lt;choice&gt;
     *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CurrencyAmountOptType"/&gt;
     *         &lt;element name="PercentageValue" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}WholePercentageSimpleType"/&gt;
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
        "amount",
        "percentageValue"
    })
    public static class Surcharge {

        @XmlElement(name = "Amount")
        protected CurrencyAmountOptType amount;
        @XmlElement(name = "PercentageValue")
        protected BigDecimal percentageValue;

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
         * Gets the value of the percentageValue property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercentageValue() {
            return percentageValue;
        }

        /**
         * Sets the value of the percentageValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercentageValue(BigDecimal value) {
            this.percentageValue = value;
        }

    }

}
