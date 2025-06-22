
package com.springboot.dto.airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Recursive element to allow nested selections of services from a bundle of services.
 * 
 * <p>Java class for RequestedServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestedServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceDefinitionID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SelectedService" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}RequestedServiceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestedServiceType", propOrder = {
    "serviceDefinitionID",
    "selectedService"
})
@XmlSeeAlso({
    com.springboot.dto.airshoppingrs.OrderRequestType.Offer.OfferItem.ServiceSelection.class
})
public class RequestedServiceType {

    @XmlElement(name = "ServiceDefinitionID", required = true)
    protected String serviceDefinitionID;
    @XmlElement(name = "SelectedService")
    protected List<RequestedServiceType> selectedService;

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
     * Gets the value of the selectedService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestedServiceType }
     * 
     * 
     */
    public List<RequestedServiceType> getSelectedService() {
        if (selectedService == null) {
            selectedService = new ArrayList<RequestedServiceType>();
        }
        return this.selectedService;
    }

}
