
package com.springboot.dto.seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of Service Definition data referenced in this message document.
 * 
 * <p>Java class for ServiceDefinitionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDefinitionListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ServiceDefinition" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ServiceDefinitionType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceDefinitionListType", propOrder = {
    "serviceDefinition"
})
public class ServiceDefinitionListType {

    @XmlElement(name = "ServiceDefinition", required = true)
    protected List<ServiceDefinitionType> serviceDefinition;

    /**
     * Gets the value of the serviceDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceDefinitionType }
     * 
     * 
     */
    public List<ServiceDefinitionType> getServiceDefinition() {
        if (serviceDefinition == null) {
            serviceDefinition = new ArrayList<ServiceDefinitionType>();
        }
        return this.serviceDefinition;
    }

}
