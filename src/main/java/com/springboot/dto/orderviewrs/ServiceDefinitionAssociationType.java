
package com.springboot.dto.orderviewrs;

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
 * <p>Java class for ServiceDefinitionAssociationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionAssociationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="BaggageAllowanceRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type"/&gt;
 *         &lt;element name="SeatProfileRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ID_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ServiceBundle" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ServiceBundleType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionAssociationType", propOrder = {
    "baggageAllowanceRefID",
    "seatProfileRefID",
    "serviceBundle"
})
public class ServiceDefinitionAssociationType {

    @XmlElement(name = "BaggageAllowanceRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceRefID;
    @XmlElement(name = "SeatProfileRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> seatProfileRefID;
    @XmlElement(name = "ServiceBundle")
    protected ServiceBundleType serviceBundle;

    /**
     * Gets the value of the baggageAllowanceRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceRefID() {
        return baggageAllowanceRefID;
    }

    /**
     * Sets the value of the baggageAllowanceRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowanceRefID(String value) {
        this.baggageAllowanceRefID = value;
    }

    /**
     * Gets the value of the seatProfileRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfileRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatProfileRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSeatProfileRefID() {
        if (seatProfileRefID == null) {
            seatProfileRefID = new ArrayList<String>();
        }
        return this.seatProfileRefID;
    }

    /**
     * Gets the value of the serviceBundle property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceBundleType }
     *     
     */
    public ServiceBundleType getServiceBundle() {
        return serviceBundle;
    }

    /**
     * Sets the value of the serviceBundle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceBundleType }
     *     
     */
    public void setServiceBundle(ServiceBundleType value) {
        this.serviceBundle = value;
    }

}
