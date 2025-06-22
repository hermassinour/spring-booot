
package com.springboot.dto.ordercancelrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element name="OrderItemDetail" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OrderCommision"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OrderInstructions"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OrderItemSettlement" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}SettlementType" minOccurs="0"/&gt;
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
    "orderItemDetail",
    "orderItemSettlement"
})
@XmlRootElement(name = "OrderItemDetails")
public class OrderItemDetails {

    @XmlElement(name = "OrderItemDetail", required = true)
    protected List<OrderItemDetails.OrderItemDetail> orderItemDetail;
    @XmlElement(name = "OrderItemSettlement")
    protected SettlementType orderItemSettlement;

    /**
     * Gets the value of the orderItemDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderItemDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderItemDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderItemDetails.OrderItemDetail }
     * 
     * 
     */
    public List<OrderItemDetails.OrderItemDetail> getOrderItemDetail() {
        if (orderItemDetail == null) {
            orderItemDetail = new ArrayList<OrderItemDetails.OrderItemDetail>();
        }
        return this.orderItemDetail;
    }

    /**
     * Gets the value of the orderItemSettlement property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementType }
     *     
     */
    public SettlementType getOrderItemSettlement() {
        return orderItemSettlement;
    }

    /**
     * Sets the value of the orderItemSettlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementType }
     *     
     */
    public void setOrderItemSettlement(SettlementType value) {
        this.orderItemSettlement = value;
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
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OrderCommision"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OrderInstructions"/&gt;
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
        "orderCommision",
        "orderInstructions"
    })
    public static class OrderItemDetail {

        @XmlElement(name = "OrderCommision")
        protected OrderV172CommissionType orderCommision;
        @XmlElement(name = "OrderInstructions")
        protected OrderInstructions orderInstructions;

        /**
         * Details of the commission claimed by a Travel Agent for selling air transportation/services on behalf of an airline.
         * 
         * @return
         *     possible object is
         *     {@link OrderV172CommissionType }
         *     
         */
        public OrderV172CommissionType getOrderCommision() {
            return orderCommision;
        }

        /**
         * Sets the value of the orderCommision property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderV172CommissionType }
         *     
         */
        public void setOrderCommision(OrderV172CommissionType value) {
            this.orderCommision = value;
        }

        /**
         * Gets the value of the orderInstructions property.
         * 
         * @return
         *     possible object is
         *     {@link OrderInstructions }
         *     
         */
        public OrderInstructions getOrderInstructions() {
            return orderInstructions;
        }

        /**
         * Sets the value of the orderInstructions property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderInstructions }
         *     
         */
        public void setOrderInstructions(OrderInstructions value) {
            this.orderInstructions = value;
        }

    }

}
