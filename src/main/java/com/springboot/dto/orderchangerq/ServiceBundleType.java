
package com.springboot.dto.orderchangerq;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Where several services are offered for sale as one service.
 * 
 * <p>Java class for ServiceBundleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceBundleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MaximumServiceQty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}QtyType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDefinitionRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ID_Type" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBundleType", propOrder = {
    "maximumServiceQty",
    "serviceDefinitionRefID"
})
public class ServiceBundleType {

    @XmlElement(name = "MaximumServiceQty")
    protected BigDecimal maximumServiceQty;
    @XmlElement(name = "ServiceDefinitionRefID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> serviceDefinitionRefID;

    /**
     * Gets the value of the maximumServiceQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumServiceQty() {
        return maximumServiceQty;
    }

    /**
     * Sets the value of the maximumServiceQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumServiceQty(BigDecimal value) {
        this.maximumServiceQty = value;
    }

    /**
     * Gets the value of the serviceDefinitionRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDefinitionRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDefinitionRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceDefinitionRefID() {
        if (serviceDefinitionRefID == null) {
            serviceDefinitionRefID = new ArrayList<String>();
        }
        return this.serviceDefinitionRefID;
    }

}
