
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Payload information for OrderListRQ.
 * 
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderFilterCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}OrderFilterCriteriaType"/&gt;
 *         &lt;element name="OrderRetrieveParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}OrdRetrieveParamsType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", propOrder = {
    "orderFilterCriteria",
    "orderRetrieveParameters"
})
public class RequestType {

    @XmlElement(name = "OrderFilterCriteria", required = true)
    protected OrderFilterCriteriaType orderFilterCriteria;
    @XmlElement(name = "OrderRetrieveParameters")
    protected OrdRetrieveParamsType orderRetrieveParameters;

    /**
     * Gets the value of the orderFilterCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFilterCriteriaType }
     *     
     */
    public OrderFilterCriteriaType getOrderFilterCriteria() {
        return orderFilterCriteria;
    }

    /**
     * Sets the value of the orderFilterCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFilterCriteriaType }
     *     
     */
    public void setOrderFilterCriteria(OrderFilterCriteriaType value) {
        this.orderFilterCriteria = value;
    }

    /**
     * Gets the value of the orderRetrieveParameters property.
     * 
     * @return
     *     possible object is
     *     {@link OrdRetrieveParamsType }
     *     
     */
    public OrdRetrieveParamsType getOrderRetrieveParameters() {
        return orderRetrieveParameters;
    }

    /**
     * Sets the value of the orderRetrieveParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrdRetrieveParamsType }
     *     
     */
    public void setOrderRetrieveParameters(OrdRetrieveParamsType value) {
        this.orderRetrieveParameters = value;
    }

}
