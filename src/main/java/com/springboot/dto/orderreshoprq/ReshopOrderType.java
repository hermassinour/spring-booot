
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Function used to reshop items within an Order (e.g. adding ancillaries, canceling Order Items, or replacing Order Items.
 * 
 * <p>Java class for ReshopOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReshopOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="UpdatePaxName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}UpdatePaxNameType"/&gt;
 *         &lt;element name="ServiceOrder" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ServiceOrderType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReshopOrderType", propOrder = {
    "updatePaxName",
    "serviceOrder"
})
public class ReshopOrderType {

    @XmlElement(name = "UpdatePaxName")
    protected UpdatePaxNameType updatePaxName;
    @XmlElement(name = "ServiceOrder")
    protected ServiceOrderType serviceOrder;

    /**
     * Gets the value of the updatePaxName property.
     * 
     * @return
     *     possible object is
     *     {@link UpdatePaxNameType }
     *     
     */
    public UpdatePaxNameType getUpdatePaxName() {
        return updatePaxName;
    }

    /**
     * Sets the value of the updatePaxName property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdatePaxNameType }
     *     
     */
    public void setUpdatePaxName(UpdatePaxNameType value) {
        this.updatePaxName = value;
    }

    /**
     * Gets the value of the serviceOrder property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceOrderType }
     *     
     */
    public ServiceOrderType getServiceOrder() {
        return serviceOrder;
    }

    /**
     * Sets the value of the serviceOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceOrderType }
     *     
     */
    public void setServiceOrder(ServiceOrderType value) {
        this.serviceOrder = value;
    }

}
