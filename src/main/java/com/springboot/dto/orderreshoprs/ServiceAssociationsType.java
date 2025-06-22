
package com.springboot.dto.orderreshoprs;

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
 * References to the details of this Service.  May include either Passenger Journeys, a Service Definition, or a Selected Seat.
 * 
 * <p>Java class for ServiceAssociationsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceAssociationsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="PaxJourneyRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SeatAssignment" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}SeatAssignmentType"/&gt;
 *         &lt;element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ServiceDefinitionRefType"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceAssociationsType", propOrder = {
    "paxJourneyRefID",
    "seatAssignment",
    "serviceDefinitionRef"
})
public class ServiceAssociationsType {

    @XmlElement(name = "PaxJourneyRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> paxJourneyRefID;
    @XmlElement(name = "SeatAssignment")
    protected SeatAssignmentType seatAssignment;
    @XmlElement(name = "ServiceDefinitionRef")
    protected ServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Gets the value of the paxJourneyRefID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paxJourneyRefID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaxJourneyRefID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPaxJourneyRefID() {
        if (paxJourneyRefID == null) {
            paxJourneyRefID = new ArrayList<String>();
        }
        return this.paxJourneyRefID;
    }

    /**
     * Gets the value of the seatAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link SeatAssignmentType }
     *     
     */
    public SeatAssignmentType getSeatAssignment() {
        return seatAssignment;
    }

    /**
     * Sets the value of the seatAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAssignmentType }
     *     
     */
    public void setSeatAssignment(SeatAssignmentType value) {
        this.seatAssignment = value;
    }

    /**
     * Gets the value of the serviceDefinitionRef property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDefinitionRefType }
     *     
     */
    public ServiceDefinitionRefType getServiceDefinitionRef() {
        return serviceDefinitionRef;
    }

    /**
     * Sets the value of the serviceDefinitionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDefinitionRefType }
     *     
     */
    public void setServiceDefinitionRef(ServiceDefinitionRefType value) {
        this.serviceDefinitionRef = value;
    }

}
