
package com.springboot.dto.orderreshoprs;

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
 * Airline specific definition of a product or service (excluding flights) that can be separately sold and delivered. e.g. bag, seat, meal on a flight
 * 
 * <p>Java class for ServiceDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceDefinitionID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="OwnerCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}NameType"/&gt;
 *         &lt;element name="ServiceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonForIssuanceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReasonForIssuanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonForIssuanceSubCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReasonForIssuanceSubCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DepositTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="NamingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="PriceGuaranteeTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="TicketingTimeLimitDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="BilateralProcessTimeLimit" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BilateralProcessTimeLimitType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValidatingCarrierCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DescType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ServiceDefinitionAssociation" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceDefinitionAssociationType" minOccurs="0"/&gt;
 *         &lt;element name="BookingInstructions" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="SSRCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="OSIText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="UpgradeMethod" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="NewClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Text" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                   &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Detail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceCombinations" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceCoupon" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceFulfillment" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceItemQuantityRules" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceDefinitionType", propOrder = {
    "serviceDefinitionID",
    "ownerCode",
    "name",
    "serviceCode",
    "reasonForIssuanceCode",
    "reasonForIssuanceSubCode",
    "depositTimeLimitDateTime",
    "namingTimeLimitDateTime",
    "paymentTimeLimitDateTime",
    "priceGuaranteeTimeLimitDateTime",
    "ticketingTimeLimitDateTime",
    "bilateralProcessTimeLimit",
    "validatingCarrierCode",
    "description",
    "serviceDefinitionAssociation",
    "bookingInstructions",
    "detail"
})
public class ServiceDefinitionType {

    @XmlElement(name = "ServiceDefinitionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceDefinitionID;
    @XmlElement(name = "OwnerCode")
    protected String ownerCode;
    @XmlElement(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "ServiceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String serviceCode;
    @XmlElement(name = "ReasonForIssuanceCode")
    protected String reasonForIssuanceCode;
    @XmlElement(name = "ReasonForIssuanceSubCode")
    protected String reasonForIssuanceSubCode;
    @XmlElement(name = "DepositTimeLimitDateTime")
    protected DateTimeType depositTimeLimitDateTime;
    @XmlElement(name = "NamingTimeLimitDateTime")
    protected DateTimeType namingTimeLimitDateTime;
    @XmlElement(name = "PaymentTimeLimitDateTime")
    protected DateTimeType paymentTimeLimitDateTime;
    @XmlElement(name = "PriceGuaranteeTimeLimitDateTime")
    protected DateTimeType priceGuaranteeTimeLimitDateTime;
    @XmlElement(name = "TicketingTimeLimitDateTime")
    protected DateTimeType ticketingTimeLimitDateTime;
    @XmlElement(name = "BilateralProcessTimeLimit")
    protected List<BilateralProcessTimeLimitType> bilateralProcessTimeLimit;
    @XmlElement(name = "ValidatingCarrierCode")
    protected String validatingCarrierCode;
    @XmlElement(name = "Description", required = true)
    protected List<DescType> description;
    @XmlElement(name = "ServiceDefinitionAssociation")
    protected ServiceDefinitionAssociationType serviceDefinitionAssociation;
    @XmlElement(name = "BookingInstructions")
    protected ServiceDefinitionType.BookingInstructions bookingInstructions;
    @XmlElement(name = "Detail")
    protected ServiceDefinitionType.Detail detail;

    /**
     * Gets the value of the serviceDefinitionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDefinitionID() {
        return serviceDefinitionID;
    }

    /**
     * Sets the value of the serviceDefinitionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDefinitionID(String value) {
        this.serviceDefinitionID = value;
    }

    /**
     * Gets the value of the ownerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerCode() {
        return ownerCode;
    }

    /**
     * Sets the value of the ownerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerCode(String value) {
        this.ownerCode = value;
    }

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

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the reasonForIssuanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForIssuanceCode() {
        return reasonForIssuanceCode;
    }

    /**
     * Sets the value of the reasonForIssuanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForIssuanceCode(String value) {
        this.reasonForIssuanceCode = value;
    }

    /**
     * Gets the value of the reasonForIssuanceSubCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForIssuanceSubCode() {
        return reasonForIssuanceSubCode;
    }

    /**
     * Sets the value of the reasonForIssuanceSubCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForIssuanceSubCode(String value) {
        this.reasonForIssuanceSubCode = value;
    }

    /**
     * Gets the value of the depositTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getDepositTimeLimitDateTime() {
        return depositTimeLimitDateTime;
    }

    /**
     * Sets the value of the depositTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setDepositTimeLimitDateTime(DateTimeType value) {
        this.depositTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the namingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getNamingTimeLimitDateTime() {
        return namingTimeLimitDateTime;
    }

    /**
     * Sets the value of the namingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setNamingTimeLimitDateTime(DateTimeType value) {
        this.namingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the paymentTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPaymentTimeLimitDateTime() {
        return paymentTimeLimitDateTime;
    }

    /**
     * Sets the value of the paymentTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPaymentTimeLimitDateTime(DateTimeType value) {
        this.paymentTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getPriceGuaranteeTimeLimitDateTime() {
        return priceGuaranteeTimeLimitDateTime;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setPriceGuaranteeTimeLimitDateTime(DateTimeType value) {
        this.priceGuaranteeTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the ticketingTimeLimitDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getTicketingTimeLimitDateTime() {
        return ticketingTimeLimitDateTime;
    }

    /**
     * Sets the value of the ticketingTimeLimitDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setTicketingTimeLimitDateTime(DateTimeType value) {
        this.ticketingTimeLimitDateTime = value;
    }

    /**
     * Gets the value of the bilateralProcessTimeLimit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bilateralProcessTimeLimit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBilateralProcessTimeLimit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BilateralProcessTimeLimitType }
     * 
     * 
     */
    public List<BilateralProcessTimeLimitType> getBilateralProcessTimeLimit() {
        if (bilateralProcessTimeLimit == null) {
            bilateralProcessTimeLimit = new ArrayList<BilateralProcessTimeLimitType>();
        }
        return this.bilateralProcessTimeLimit;
    }

    /**
     * Gets the value of the validatingCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidatingCarrierCode() {
        return validatingCarrierCode;
    }

    /**
     * Sets the value of the validatingCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidatingCarrierCode(String value) {
        this.validatingCarrierCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDescription() {
        if (description == null) {
            description = new ArrayList<DescType>();
        }
        return this.description;
    }

    /**
     * Gets the value of the serviceDefinitionAssociation property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public ServiceDefinitionAssociationType getServiceDefinitionAssociation() {
        return serviceDefinitionAssociation;
    }

    /**
     * Sets the value of the serviceDefinitionAssociation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionAssociationType }
     *     
     */
    public void setServiceDefinitionAssociation(ServiceDefinitionAssociationType value) {
        this.serviceDefinitionAssociation = value;
    }

    /**
     * Gets the value of the bookingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionType.BookingInstructions }
     *     
     */
    public ServiceDefinitionType.BookingInstructions getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * Sets the value of the bookingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionType.BookingInstructions }
     *     
     */
    public void setBookingInstructions(ServiceDefinitionType.BookingInstructions value) {
        this.bookingInstructions = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionType.Detail }
     *     
     */
    public ServiceDefinitionType.Detail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionType.Detail }
     *     
     */
    public void setDetail(ServiceDefinitionType.Detail value) {
        this.detail = value;
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
     *         &lt;element name="SSRCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="OSIText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="UpgradeMethod" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="NewClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Text" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *         &lt;element name="Equipment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
        "ssrCode",
        "osiText",
        "method",
        "upgradeMethod",
        "text",
        "equipment"
    })
    public static class BookingInstructions {

        @XmlElement(name = "SSRCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> ssrCode;
        @XmlElement(name = "OSIText")
        protected List<String> osiText;
        @XmlElement(name = "Method")
        protected String method;
        @XmlElement(name = "UpgradeMethod")
        protected ServiceDefinitionType.BookingInstructions.UpgradeMethod upgradeMethod;
        @XmlElement(name = "Text")
        protected List<String> text;
        @XmlElement(name = "Equipment")
        protected String equipment;

        /**
         * Gets the value of the ssrCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSSRCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSSRCode() {
            if (ssrCode == null) {
                ssrCode = new ArrayList<String>();
            }
            return this.ssrCode;
        }

        /**
         * Gets the value of the osiText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the osiText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOSIText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOSIText() {
            if (osiText == null) {
                osiText = new ArrayList<String>();
            }
            return this.osiText;
        }

        /**
         * Gets the value of the method property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * Sets the value of the method property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * Gets the value of the upgradeMethod property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceDefinitionType.BookingInstructions.UpgradeMethod }
         *     
         */
        public ServiceDefinitionType.BookingInstructions.UpgradeMethod getUpgradeMethod() {
            return upgradeMethod;
        }

        /**
         * Sets the value of the upgradeMethod property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceDefinitionType.BookingInstructions.UpgradeMethod }
         *     
         */
        public void setUpgradeMethod(ServiceDefinitionType.BookingInstructions.UpgradeMethod value) {
            this.upgradeMethod = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
        }

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEquipment(String value) {
            this.equipment = value;
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
         *       &lt;attribute name="NewClass" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
        public static class UpgradeMethod {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "NewClass")
            protected String newClass;

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
             * Gets the value of the newClass property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewClass() {
                return newClass;
            }

            /**
             * Sets the value of the newClass property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewClass(String value) {
                this.newClass = value;
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
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceCombinations" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceCoupon" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceFulfillment" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceItemQuantityRules" minOccurs="0"/&gt;
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
        "serviceCombinations",
        "serviceCoupon",
        "serviceFulfillment",
        "serviceItemQuantityRules"
    })
    public static class Detail {

        @XmlElement(name = "ServiceCombinations")
        protected ServiceCombinations serviceCombinations;
        @XmlElement(name = "ServiceCoupon")
        protected ServiceCouponType serviceCoupon;
        @XmlElement(name = "ServiceFulfillment")
        protected ServiceFulfillmentType serviceFulfillment;
        @XmlElement(name = "ServiceItemQuantityRules")
        protected ServiceItemQuantityType serviceItemQuantityRules;

        /**
         * Gets the value of the serviceCombinations property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCombinations }
         *     
         */
        public ServiceCombinations getServiceCombinations() {
            return serviceCombinations;
        }

        /**
         * Sets the value of the serviceCombinations property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCombinations }
         *     
         */
        public void setServiceCombinations(ServiceCombinations value) {
            this.serviceCombinations = value;
        }

        /**
         * Gets the value of the serviceCoupon property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceCouponType }
         *     
         */
        public ServiceCouponType getServiceCoupon() {
            return serviceCoupon;
        }

        /**
         * Sets the value of the serviceCoupon property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceCouponType }
         *     
         */
        public void setServiceCoupon(ServiceCouponType value) {
            this.serviceCoupon = value;
        }

        /**
         * Gets the value of the serviceFulfillment property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceFulfillmentType }
         *     
         */
        public ServiceFulfillmentType getServiceFulfillment() {
            return serviceFulfillment;
        }

        /**
         * Sets the value of the serviceFulfillment property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceFulfillmentType }
         *     
         */
        public void setServiceFulfillment(ServiceFulfillmentType value) {
            this.serviceFulfillment = value;
        }

        /**
         * Gets the value of the serviceItemQuantityRules property.
         * 
         * @return
         *     possible object is
         *     {@link ServiceItemQuantityType }
         *     
         */
        public ServiceItemQuantityType getServiceItemQuantityRules() {
            return serviceItemQuantityRules;
        }

        /**
         * Sets the value of the serviceItemQuantityRules property.
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceItemQuantityType }
         *     
         */
        public void setServiceItemQuantityRules(ServiceItemQuantityType value) {
            this.serviceItemQuantityRules = value;
        }

    }

}
