
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Option to Reshop or Reprice an Order.
 * 
 * <p>Java class for UpdateOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="RepriceOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}RepriceOrderType"/&gt;
 *         &lt;element name="ReshopOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ReshopOrderType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateOrderType", propOrder = {
    "repriceOrder",
    "reshopOrder"
})
public class UpdateOrderType {

    @XmlElement(name = "RepriceOrder")
    protected RepriceOrderType repriceOrder;
    @XmlElement(name = "ReshopOrder")
    protected ReshopOrderType reshopOrder;

    /**
     * Gets the value of the repriceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link RepriceOrderType }
     *     
     */
    public RepriceOrderType getRepriceOrder() {
        return repriceOrder;
    }

    /**
     * Sets the value of the repriceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepriceOrderType }
     *     
     */
    public void setRepriceOrder(RepriceOrderType value) {
        this.repriceOrder = value;
    }

    /**
     * Gets the value of the reshopOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopOrderType }
     *     
     */
    public ReshopOrderType getReshopOrder() {
        return reshopOrder;
    }

    /**
     * Sets the value of the reshopOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopOrderType }
     *     
     */
    public void setReshopOrder(ReshopOrderType value) {
        this.reshopOrder = value;
    }

}
