
package com.springboot.dto.ordercreaterq;

import java.math.BigInteger;
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * CORE ORDER ITEM definition.
 * 
 * <p>Java class for V172_OrderItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_OrderItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderItem" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ItemStatus" minOccurs="0"/&gt;
 *                   &lt;element name="PriceDetail"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TotalAmount" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;choice&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPricing"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPricing"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DetailCurrencyPrice"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}EncodedCurrencyPrice"/&gt;
 *                                       &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SimpleCurrencyPrice"/&gt;
 *                                     &lt;/choice&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CurrencyAmountOptType"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FareFiledIn" minOccurs="0"/&gt;
 *                             &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}V172_DiscountType" minOccurs="0"/&gt;
 *                             &lt;element name="Surcharges" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TaxDetailType" minOccurs="0"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TaxExemption" minOccurs="0"/&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPriceUnitType" minOccurs="0"/&gt;
 *                               &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPriceType" minOccurs="0"/&gt;
 *                             &lt;/choice&gt;
 *                             &lt;element name="Fees" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType"&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Service" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                             &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
 *                             &lt;choice&gt;
 *                               &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
 *                               &lt;element name="ServiceDefinitionRef"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;simpleContent&gt;
 *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
 *                                       &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/simpleContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="SelectedSeat"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element name="Seat"&gt;
 *                                           &lt;complexType&gt;
 *                                             &lt;complexContent&gt;
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                 &lt;sequence&gt;
 *                                                   &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                                                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;/sequence&gt;
 *                                               &lt;/restriction&gt;
 *                                             &lt;/complexContent&gt;
 *                                           &lt;/complexType&gt;
 *                                         &lt;/element&gt;
 *                                         &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                         &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                           &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrderItemTimeLimitsType" minOccurs="0"/&gt;
 *                   &lt;element name="InventoryGuarantee" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}UniqueStringID_SimpleType"/&gt;
 *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}InventoryGuaranteeTimeLimits"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}Disclosures" minOccurs="0"/&gt;
 *                   &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrderV172_PenaltyType" minOccurs="0"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrderItemDetails" minOccurs="0"/&gt;
 *                   &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FareDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="OrderItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *                 &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AirlineDesigSimpleType" /&gt;
 *                 &lt;attribute name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                 &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
@XmlType(name = "V172_OrderItemType", propOrder = {
    "orderItem"
})
public class V172OrderItemType {

    @XmlElement(name = "OrderItem", required = true)
    protected List<V172OrderItemType.OrderItem> orderItem;

    /**
     * Gets the value of the orderItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link V172OrderItemType.OrderItem }
     * 
     * 
     */
    public List<V172OrderItemType.OrderItem> getOrderItem() {
        if (orderItem == null) {
            orderItem = new ArrayList<V172OrderItemType.OrderItem>();
        }
        return this.orderItem;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ItemStatus" minOccurs="0"/&gt;
     *         &lt;element name="PriceDetail"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TotalAmount" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;choice&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPricing"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPricing"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DetailCurrencyPrice"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}EncodedCurrencyPrice"/&gt;
     *                             &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SimpleCurrencyPrice"/&gt;
     *                           &lt;/choice&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CurrencyAmountOptType"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FareFiledIn" minOccurs="0"/&gt;
     *                   &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}V172_DiscountType" minOccurs="0"/&gt;
     *                   &lt;element name="Surcharges" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TaxDetailType" minOccurs="0"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TaxExemption" minOccurs="0"/&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPriceUnitType" minOccurs="0"/&gt;
     *                     &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPriceType" minOccurs="0"/&gt;
     *                   &lt;/choice&gt;
     *                   &lt;element name="Fees" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType"&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Service" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                   &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
     *                   &lt;choice&gt;
     *                     &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
     *                     &lt;element name="ServiceDefinitionRef"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;simpleContent&gt;
     *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
     *                             &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *                           &lt;/extension&gt;
     *                         &lt;/simpleContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="SelectedSeat"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element name="Seat"&gt;
     *                                 &lt;complexType&gt;
     *                                   &lt;complexContent&gt;
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                       &lt;sequence&gt;
     *                                         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *                                         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;/sequence&gt;
     *                                     &lt;/restriction&gt;
     *                                   &lt;/complexContent&gt;
     *                                 &lt;/complexType&gt;
     *                               &lt;/element&gt;
     *                               &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                               &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *                 &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="TimeLimits" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrderItemTimeLimitsType" minOccurs="0"/&gt;
     *         &lt;element name="InventoryGuarantee" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}UniqueStringID_SimpleType"/&gt;
     *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}InventoryGuaranteeTimeLimits"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}Disclosures" minOccurs="0"/&gt;
     *         &lt;element name="Penalty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrderV172_PenaltyType" minOccurs="0"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}OrderItemDetails" minOccurs="0"/&gt;
     *         &lt;element name="FareDetail" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FareDetailType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="OrderItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
     *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AirlineDesigSimpleType" /&gt;
     *       &lt;attribute name="OwnerType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *       &lt;attribute name="WebAddressID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "itemStatus",
        "priceDetail",
        "service",
        "timeLimits",
        "inventoryGuarantee",
        "disclosures",
        "penalty",
        "orderItemDetails",
        "fareDetail"
    })
    public static class OrderItem {

        @XmlElement(name = "ItemStatus")
        protected String itemStatus;
        @XmlElement(name = "PriceDetail", required = true)
        protected V172OrderItemType.OrderItem.PriceDetail priceDetail;
        @XmlElement(name = "Service", required = true)
        protected List<V172OrderItemType.OrderItem.Service> service;
        @XmlElement(name = "TimeLimits")
        protected OrderItemTimeLimitsType timeLimits;
        @XmlElement(name = "InventoryGuarantee")
        protected V172OrderItemType.OrderItem.InventoryGuarantee inventoryGuarantee;
        @XmlElement(name = "Disclosures")
        protected Disclosures disclosures;
        @XmlElement(name = "Penalty")
        protected OrderV172PenaltyType penalty;
        @XmlElement(name = "OrderItemDetails")
        protected OrderItemDetails orderItemDetails;
        @XmlElement(name = "FareDetail")
        protected List<FareDetailType> fareDetail;
        @XmlAttribute(name = "OrderItemID", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String orderItemID;
        @XmlAttribute(name = "Owner")
        protected String owner;
        @XmlAttribute(name = "OwnerType")
        protected String ownerType;
        @XmlAttribute(name = "Timestamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timestamp;
        @XmlAttribute(name = "WebAddressID")
        protected String webAddressID;

        /**
         * Current Order Item status. Example: OK (Confirmed) Encoding Scheme: IATA Padis Codeset - List for data element 4405 (Status, coded)
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemStatus() {
            return itemStatus;
        }

        /**
         * Sets the value of the itemStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemStatus(String value) {
            this.itemStatus = value;
        }

        /**
         * Gets the value of the priceDetail property.
         * 
         * @return
         *     possible object is
         *     {@link V172OrderItemType.OrderItem.PriceDetail }
         *     
         */
        public V172OrderItemType.OrderItem.PriceDetail getPriceDetail() {
            return priceDetail;
        }

        /**
         * Sets the value of the priceDetail property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OrderItemType.OrderItem.PriceDetail }
         *     
         */
        public void setPriceDetail(V172OrderItemType.OrderItem.PriceDetail value) {
            this.priceDetail = value;
        }

        /**
         * Gets the value of the service property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the service property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getService().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link V172OrderItemType.OrderItem.Service }
         * 
         * 
         */
        public List<V172OrderItemType.OrderItem.Service> getService() {
            if (service == null) {
                service = new ArrayList<V172OrderItemType.OrderItem.Service>();
            }
            return this.service;
        }

        /**
         * Gets the value of the timeLimits property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemTimeLimitsType }
         *     
         */
        public OrderItemTimeLimitsType getTimeLimits() {
            return timeLimits;
        }

        /**
         * Sets the value of the timeLimits property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemTimeLimitsType }
         *     
         */
        public void setTimeLimits(OrderItemTimeLimitsType value) {
            this.timeLimits = value;
        }

        /**
         * Gets the value of the inventoryGuarantee property.
         * 
         * @return
         *     possible object is
         *     {@link V172OrderItemType.OrderItem.InventoryGuarantee }
         *     
         */
        public V172OrderItemType.OrderItem.InventoryGuarantee getInventoryGuarantee() {
            return inventoryGuarantee;
        }

        /**
         * Sets the value of the inventoryGuarantee property.
         * 
         * @param value
         *     allowed object is
         *     {@link V172OrderItemType.OrderItem.InventoryGuarantee }
         *     
         */
        public void setInventoryGuarantee(V172OrderItemType.OrderItem.InventoryGuarantee value) {
            this.inventoryGuarantee = value;
        }

        /**
         * Gets the value of the disclosures property.
         * 
         * @return
         *     possible object is
         *     {@link Disclosures }
         *     
         */
        public Disclosures getDisclosures() {
            return disclosures;
        }

        /**
         * Sets the value of the disclosures property.
         * 
         * @param value
         *     allowed object is
         *     {@link Disclosures }
         *     
         */
        public void setDisclosures(Disclosures value) {
            this.disclosures = value;
        }

        /**
         * Gets the value of the penalty property.
         * 
         * @return
         *     possible object is
         *     {@link OrderV172PenaltyType }
         *     
         */
        public OrderV172PenaltyType getPenalty() {
            return penalty;
        }

        /**
         * Sets the value of the penalty property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderV172PenaltyType }
         *     
         */
        public void setPenalty(OrderV172PenaltyType value) {
            this.penalty = value;
        }

        /**
         * Gets the value of the orderItemDetails property.
         * 
         * @return
         *     possible object is
         *     {@link OrderItemDetails }
         *     
         */
        public OrderItemDetails getOrderItemDetails() {
            return orderItemDetails;
        }

        /**
         * Sets the value of the orderItemDetails property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderItemDetails }
         *     
         */
        public void setOrderItemDetails(OrderItemDetails value) {
            this.orderItemDetails = value;
        }

        /**
         * Gets the value of the fareDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the fareDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFareDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FareDetailType }
         * 
         * 
         */
        public List<FareDetailType> getFareDetail() {
            if (fareDetail == null) {
                fareDetail = new ArrayList<FareDetailType>();
            }
            return this.fareDetail;
        }

        /**
         * Gets the value of the orderItemID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderItemID() {
            return orderItemID;
        }

        /**
         * Sets the value of the orderItemID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderItemID(String value) {
            this.orderItemID = value;
        }

        /**
         * Gets the value of the owner property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * Sets the value of the owner property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
        }

        /**
         * Gets the value of the ownerType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerType() {
            return ownerType;
        }

        /**
         * Sets the value of the ownerType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerType(String value) {
            this.ownerType = value;
        }

        /**
         * Gets the value of the timestamp property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimestamp() {
            return timestamp;
        }

        /**
         * Sets the value of the timestamp property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimestamp(XMLGregorianCalendar value) {
            this.timestamp = value;
        }

        /**
         * Gets the value of the webAddressID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWebAddressID() {
            return webAddressID;
        }

        /**
         * Sets the value of the webAddressID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWebAddressID(String value) {
            this.webAddressID = value;
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
         *         &lt;element name="InventoryGuaranteeID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}UniqueStringID_SimpleType"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}InventoryGuaranteeTimeLimits"/&gt;
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
            "inventoryGuaranteeID",
            "inventoryGuaranteeTimeLimits"
        })
        public static class InventoryGuarantee {

            @XmlElement(name = "InventoryGuaranteeID", required = true)
            protected String inventoryGuaranteeID;
            @XmlElement(name = "InventoryGuaranteeTimeLimits", required = true)
            protected InventoryGuaranteeTimeLimits inventoryGuaranteeTimeLimits;

            /**
             * Gets the value of the inventoryGuaranteeID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInventoryGuaranteeID() {
                return inventoryGuaranteeID;
            }

            /**
             * Sets the value of the inventoryGuaranteeID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInventoryGuaranteeID(String value) {
                this.inventoryGuaranteeID = value;
            }

            /**
             * Gets the value of the inventoryGuaranteeTimeLimits property.
             * 
             * @return
             *     possible object is
             *     {@link InventoryGuaranteeTimeLimits }
             *     
             */
            public InventoryGuaranteeTimeLimits getInventoryGuaranteeTimeLimits() {
                return inventoryGuaranteeTimeLimits;
            }

            /**
             * Sets the value of the inventoryGuaranteeTimeLimits property.
             * 
             * @param value
             *     allowed object is
             *     {@link InventoryGuaranteeTimeLimits }
             *     
             */
            public void setInventoryGuaranteeTimeLimits(InventoryGuaranteeTimeLimits value) {
                this.inventoryGuaranteeTimeLimits = value;
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
         *         &lt;element name="TotalAmount" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;choice&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPricing"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPricing"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DetailCurrencyPrice"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}EncodedCurrencyPrice"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SimpleCurrencyPrice"/&gt;
         *                 &lt;/choice&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="BaseAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CurrencyAmountOptType"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FareFiledIn" minOccurs="0"/&gt;
         *         &lt;element name="Discount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}V172_DiscountType" minOccurs="0"/&gt;
         *         &lt;element name="Surcharges" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Taxes" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TaxDetailType" minOccurs="0"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TaxExemption" minOccurs="0"/&gt;
         *         &lt;choice&gt;
         *           &lt;element name="AwardPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPriceUnitType" minOccurs="0"/&gt;
         *           &lt;element name="CombinationPricing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPriceType" minOccurs="0"/&gt;
         *         &lt;/choice&gt;
         *         &lt;element name="Fees" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType"&gt;
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
        @XmlType(name = "", propOrder = {
            "totalAmount",
            "baseAmount",
            "fareFiledIn",
            "discount",
            "surcharges",
            "taxes",
            "taxExemption",
            "awardPricing",
            "combinationPricing",
            "fees"
        })
        public static class PriceDetail {

            @XmlElement(name = "TotalAmount")
            protected V172OrderItemType.OrderItem.PriceDetail.TotalAmount totalAmount;
            @XmlElement(name = "BaseAmount", required = true)
            protected CurrencyAmountOptType baseAmount;
            @XmlElement(name = "FareFiledIn")
            protected FareFilingType fareFiledIn;
            @XmlElement(name = "Discount")
            protected V172DiscountType discount;
            @XmlElement(name = "Surcharges")
            protected V172OrderItemType.OrderItem.PriceDetail.Surcharges surcharges;
            @XmlElement(name = "Taxes")
            protected TaxDetailType taxes;
            @XmlElement(name = "TaxExemption")
            protected TaxExemptionType taxExemption;
            @XmlElement(name = "AwardPricing")
            protected AwardPriceUnitType awardPricing;
            @XmlElement(name = "CombinationPricing")
            protected CombinationPriceType combinationPricing;
            @XmlElement(name = "Fees")
            protected V172OrderItemType.OrderItem.PriceDetail.Fees fees;

            /**
             * Gets the value of the totalAmount property.
             * 
             * @return
             *     possible object is
             *     {@link V172OrderItemType.OrderItem.PriceDetail.TotalAmount }
             *     
             */
            public V172OrderItemType.OrderItem.PriceDetail.TotalAmount getTotalAmount() {
                return totalAmount;
            }

            /**
             * Sets the value of the totalAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172OrderItemType.OrderItem.PriceDetail.TotalAmount }
             *     
             */
            public void setTotalAmount(V172OrderItemType.OrderItem.PriceDetail.TotalAmount value) {
                this.totalAmount = value;
            }

            /**
             * Gets the value of the baseAmount property.
             * 
             * @return
             *     possible object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public CurrencyAmountOptType getBaseAmount() {
                return baseAmount;
            }

            /**
             * Sets the value of the baseAmount property.
             * 
             * @param value
             *     allowed object is
             *     {@link CurrencyAmountOptType }
             *     
             */
            public void setBaseAmount(CurrencyAmountOptType value) {
                this.baseAmount = value;
            }

            /**
             * Gets the value of the fareFiledIn property.
             * 
             * @return
             *     possible object is
             *     {@link FareFilingType }
             *     
             */
            public FareFilingType getFareFiledIn() {
                return fareFiledIn;
            }

            /**
             * Sets the value of the fareFiledIn property.
             * 
             * @param value
             *     allowed object is
             *     {@link FareFilingType }
             *     
             */
            public void setFareFiledIn(FareFilingType value) {
                this.fareFiledIn = value;
            }

            /**
             * Gets the value of the discount property.
             * 
             * @return
             *     possible object is
             *     {@link V172DiscountType }
             *     
             */
            public V172DiscountType getDiscount() {
                return discount;
            }

            /**
             * Sets the value of the discount property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172DiscountType }
             *     
             */
            public void setDiscount(V172DiscountType value) {
                this.discount = value;
            }

            /**
             * Gets the value of the surcharges property.
             * 
             * @return
             *     possible object is
             *     {@link V172OrderItemType.OrderItem.PriceDetail.Surcharges }
             *     
             */
            public V172OrderItemType.OrderItem.PriceDetail.Surcharges getSurcharges() {
                return surcharges;
            }

            /**
             * Sets the value of the surcharges property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172OrderItemType.OrderItem.PriceDetail.Surcharges }
             *     
             */
            public void setSurcharges(V172OrderItemType.OrderItem.PriceDetail.Surcharges value) {
                this.surcharges = value;
            }

            /**
             * Gets the value of the taxes property.
             * 
             * @return
             *     possible object is
             *     {@link TaxDetailType }
             *     
             */
            public TaxDetailType getTaxes() {
                return taxes;
            }

            /**
             * Sets the value of the taxes property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxDetailType }
             *     
             */
            public void setTaxes(TaxDetailType value) {
                this.taxes = value;
            }

            /**
             * Gets the value of the taxExemption property.
             * 
             * @return
             *     possible object is
             *     {@link TaxExemptionType }
             *     
             */
            public TaxExemptionType getTaxExemption() {
                return taxExemption;
            }

            /**
             * Sets the value of the taxExemption property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxExemptionType }
             *     
             */
            public void setTaxExemption(TaxExemptionType value) {
                this.taxExemption = value;
            }

            /**
             * Gets the value of the awardPricing property.
             * 
             * @return
             *     possible object is
             *     {@link AwardPriceUnitType }
             *     
             */
            public AwardPriceUnitType getAwardPricing() {
                return awardPricing;
            }

            /**
             * Sets the value of the awardPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link AwardPriceUnitType }
             *     
             */
            public void setAwardPricing(AwardPriceUnitType value) {
                this.awardPricing = value;
            }

            /**
             * Gets the value of the combinationPricing property.
             * 
             * @return
             *     possible object is
             *     {@link CombinationPriceType }
             *     
             */
            public CombinationPriceType getCombinationPricing() {
                return combinationPricing;
            }

            /**
             * Sets the value of the combinationPricing property.
             * 
             * @param value
             *     allowed object is
             *     {@link CombinationPriceType }
             *     
             */
            public void setCombinationPricing(CombinationPriceType value) {
                this.combinationPricing = value;
            }

            /**
             * Gets the value of the fees property.
             * 
             * @return
             *     possible object is
             *     {@link V172OrderItemType.OrderItem.PriceDetail.Fees }
             *     
             */
            public V172OrderItemType.OrderItem.PriceDetail.Fees getFees() {
                return fees;
            }

            /**
             * Sets the value of the fees property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172OrderItemType.OrderItem.PriceDetail.Fees }
             *     
             */
            public void setFees(V172OrderItemType.OrderItem.PriceDetail.Fees value) {
                this.fees = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType"&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Fees
                extends FeeSurchargeType
            {


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
             *         &lt;element name="Surcharge" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}FeeSurchargeType" maxOccurs="unbounded"/&gt;
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
                "surcharge"
            })
            public static class Surcharges {

                @XmlElement(name = "Surcharge", required = true)
                protected List<FeeSurchargeType> surcharge;

                /**
                 * Gets the value of the surcharge property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the surcharge property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSurcharge().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FeeSurchargeType }
                 * 
                 * 
                 */
                public List<FeeSurchargeType> getSurcharge() {
                    if (surcharge == null) {
                        surcharge = new ArrayList<FeeSurchargeType>();
                    }
                    return this.surcharge;
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
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AwardPricing"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CombinationPricing"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DetailCurrencyPrice"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}EncodedCurrencyPrice"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SimpleCurrencyPrice"/&gt;
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
                "awardPricing",
                "combinationPricing",
                "detailCurrencyPrice",
                "encodedCurrencyPrice",
                "simpleCurrencyPrice"
            })
            public static class TotalAmount {

                @XmlElement(name = "AwardPricing")
                protected AwardPriceUnitType awardPricing;
                @XmlElement(name = "CombinationPricing")
                protected CombinationPriceType combinationPricing;
                @XmlElement(name = "DetailCurrencyPrice")
                protected DetailCurrencyPriceType detailCurrencyPrice;
                @XmlElement(name = "EncodedCurrencyPrice")
                protected EncodedPriceType encodedCurrencyPrice;
                @XmlElement(name = "SimpleCurrencyPrice")
                protected SimpleCurrencyPriceType simpleCurrencyPrice;

                /**
                 * Gets the value of the awardPricing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link AwardPriceUnitType }
                 *     
                 */
                public AwardPriceUnitType getAwardPricing() {
                    return awardPricing;
                }

                /**
                 * Sets the value of the awardPricing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AwardPriceUnitType }
                 *     
                 */
                public void setAwardPricing(AwardPriceUnitType value) {
                    this.awardPricing = value;
                }

                /**
                 * Gets the value of the combinationPricing property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CombinationPriceType }
                 *     
                 */
                public CombinationPriceType getCombinationPricing() {
                    return combinationPricing;
                }

                /**
                 * Sets the value of the combinationPricing property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CombinationPriceType }
                 *     
                 */
                public void setCombinationPricing(CombinationPriceType value) {
                    this.combinationPricing = value;
                }

                /**
                 * Gets the value of the detailCurrencyPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DetailCurrencyPriceType }
                 *     
                 */
                public DetailCurrencyPriceType getDetailCurrencyPrice() {
                    return detailCurrencyPrice;
                }

                /**
                 * Sets the value of the detailCurrencyPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DetailCurrencyPriceType }
                 *     
                 */
                public void setDetailCurrencyPrice(DetailCurrencyPriceType value) {
                    this.detailCurrencyPrice = value;
                }

                /**
                 * Gets the value of the encodedCurrencyPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public EncodedPriceType getEncodedCurrencyPrice() {
                    return encodedCurrencyPrice;
                }

                /**
                 * Sets the value of the encodedCurrencyPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncodedPriceType }
                 *     
                 */
                public void setEncodedCurrencyPrice(EncodedPriceType value) {
                    this.encodedCurrencyPrice = value;
                }

                /**
                 * Gets the value of the simpleCurrencyPrice property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link SimpleCurrencyPriceType }
                 *     
                 */
                public SimpleCurrencyPriceType getSimpleCurrencyPrice() {
                    return simpleCurrencyPrice;
                }

                /**
                 * Sets the value of the simpleCurrencyPrice property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link SimpleCurrencyPriceType }
                 *     
                 */
                public void setSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
                    this.simpleCurrencyPrice = value;
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
         *         &lt;element name="PassengerRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *         &lt;element name="ServiceRef" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/&gt;
         *         &lt;choice&gt;
         *           &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token"/&gt;
         *           &lt;element name="ServiceDefinitionRef"&gt;
         *             &lt;complexType&gt;
         *               &lt;simpleContent&gt;
         *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
         *                   &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
         *                 &lt;/extension&gt;
         *               &lt;/simpleContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *           &lt;element name="SelectedSeat"&gt;
         *             &lt;complexType&gt;
         *               &lt;complexContent&gt;
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                   &lt;sequence&gt;
         *                     &lt;element name="Seat"&gt;
         *                       &lt;complexType&gt;
         *                         &lt;complexContent&gt;
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                             &lt;sequence&gt;
         *                               &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
         *                               &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;/sequence&gt;
         *                           &lt;/restriction&gt;
         *                         &lt;/complexContent&gt;
         *                       &lt;/complexType&gt;
         *                     &lt;/element&gt;
         *                     &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                     &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
         *                   &lt;/sequence&gt;
         *                 &lt;/restriction&gt;
         *               &lt;/complexContent&gt;
         *             &lt;/complexType&gt;
         *           &lt;/element&gt;
         *         &lt;/choice&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="ServiceID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
         *       &lt;attribute name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "passengerRef",
            "serviceRef",
            "segmentRef",
            "serviceDefinitionRef",
            "selectedSeat"
        })
        public static class Service {

            @XmlElement(name = "PassengerRef", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String passengerRef;
            @XmlElement(name = "ServiceRef")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String serviceRef;
            @XmlElement(name = "SegmentRef")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String segmentRef;
            @XmlElement(name = "ServiceDefinitionRef")
            protected V172OrderItemType.OrderItem.Service.ServiceDefinitionRef serviceDefinitionRef;
            @XmlElement(name = "SelectedSeat")
            protected V172OrderItemType.OrderItem.Service.SelectedSeat selectedSeat;
            @XmlAttribute(name = "ServiceID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String serviceID;
            @XmlAttribute(name = "ServiceStatus")
            @XmlSchemaType(name = "anySimpleType")
            protected String serviceStatus;

            /**
             * Gets the value of the passengerRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPassengerRef() {
                return passengerRef;
            }

            /**
             * Sets the value of the passengerRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPassengerRef(String value) {
                this.passengerRef = value;
            }

            /**
             * Gets the value of the serviceRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceRef() {
                return serviceRef;
            }

            /**
             * Sets the value of the serviceRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceRef(String value) {
                this.serviceRef = value;
            }

            /**
             * Gets the value of the segmentRef property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSegmentRef() {
                return segmentRef;
            }

            /**
             * Sets the value of the segmentRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSegmentRef(String value) {
                this.segmentRef = value;
            }

            /**
             * Gets the value of the serviceDefinitionRef property.
             * 
             * @return
             *     possible object is
             *     {@link V172OrderItemType.OrderItem.Service.ServiceDefinitionRef }
             *     
             */
            public V172OrderItemType.OrderItem.Service.ServiceDefinitionRef getServiceDefinitionRef() {
                return serviceDefinitionRef;
            }

            /**
             * Sets the value of the serviceDefinitionRef property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172OrderItemType.OrderItem.Service.ServiceDefinitionRef }
             *     
             */
            public void setServiceDefinitionRef(V172OrderItemType.OrderItem.Service.ServiceDefinitionRef value) {
                this.serviceDefinitionRef = value;
            }

            /**
             * Gets the value of the selectedSeat property.
             * 
             * @return
             *     possible object is
             *     {@link V172OrderItemType.OrderItem.Service.SelectedSeat }
             *     
             */
            public V172OrderItemType.OrderItem.Service.SelectedSeat getSelectedSeat() {
                return selectedSeat;
            }

            /**
             * Sets the value of the selectedSeat property.
             * 
             * @param value
             *     allowed object is
             *     {@link V172OrderItemType.OrderItem.Service.SelectedSeat }
             *     
             */
            public void setSelectedSeat(V172OrderItemType.OrderItem.Service.SelectedSeat value) {
                this.selectedSeat = value;
            }

            /**
             * Gets the value of the serviceID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceID() {
                return serviceID;
            }

            /**
             * Sets the value of the serviceID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceID(String value) {
                this.serviceID = value;
            }

            /**
             * Gets the value of the serviceStatus property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getServiceStatus() {
                return serviceStatus;
            }

            /**
             * Sets the value of the serviceStatus property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setServiceStatus(String value) {
                this.serviceStatus = value;
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
             *         &lt;element name="Seat"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
             *                   &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *         &lt;element name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
             *         &lt;element name="ServiceDefinitionRef" type="{http://www.w3.org/2001/XMLSchema}anyType"/&gt;
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
                "seat",
                "segmentRef",
                "serviceDefinitionRef"
            })
            public static class SelectedSeat {

                @XmlElement(name = "Seat", required = true)
                protected V172OrderItemType.OrderItem.Service.SelectedSeat.Seat seat;
                @XmlElement(name = "SegmentRef", required = true)
                protected Object segmentRef;
                @XmlElement(name = "ServiceDefinitionRef", required = true)
                protected Object serviceDefinitionRef;

                /**
                 * Gets the value of the seat property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link V172OrderItemType.OrderItem.Service.SelectedSeat.Seat }
                 *     
                 */
                public V172OrderItemType.OrderItem.Service.SelectedSeat.Seat getSeat() {
                    return seat;
                }

                /**
                 * Sets the value of the seat property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link V172OrderItemType.OrderItem.Service.SelectedSeat.Seat }
                 *     
                 */
                public void setSeat(V172OrderItemType.OrderItem.Service.SelectedSeat.Seat value) {
                    this.seat = value;
                }

                /**
                 * Gets the value of the segmentRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getSegmentRef() {
                    return segmentRef;
                }

                /**
                 * Sets the value of the segmentRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setSegmentRef(Object value) {
                    this.segmentRef = value;
                }

                /**
                 * Gets the value of the serviceDefinitionRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getServiceDefinitionRef() {
                    return serviceDefinitionRef;
                }

                /**
                 * Sets the value of the serviceDefinitionRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setServiceDefinitionRef(Object value) {
                    this.serviceDefinitionRef = value;
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
                 *         &lt;element name="Row" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
                 *         &lt;element name="Column" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
                    "row",
                    "column"
                })
                public static class Seat {

                    @XmlElement(name = "Row", required = true)
                    protected BigInteger row;
                    @XmlElement(name = "Column", required = true)
                    protected String column;

                    /**
                     * Gets the value of the row property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRow() {
                        return row;
                    }

                    /**
                     * Sets the value of the row property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRow(BigInteger value) {
                        this.row = value;
                    }

                    /**
                     * Gets the value of the column property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getColumn() {
                        return column;
                    }

                    /**
                     * Sets the value of the column property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setColumn(String value) {
                        this.column = value;
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
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;token"&gt;
             *       &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
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
            public static class ServiceDefinitionRef {

                @XmlValue
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String value;
                @XmlAttribute(name = "SegmentRef")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String segmentRef;

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
                 * Gets the value of the segmentRef property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegmentRef() {
                    return segmentRef;
                }

                /**
                 * Sets the value of the segmentRef property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegmentRef(String value) {
                    this.segmentRef = value;
                }

            }

        }

    }

}
