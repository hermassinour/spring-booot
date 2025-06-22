
package com.springboot.dto.ordercreaterq;

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
 *         &lt;element name="PaxSegmentRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *         &lt;element name="SelectedSeat" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SeatonLegType"/&gt;
 *         &lt;element name="ServiceDefinitionRef" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ServiceDefinitionRefType"/&gt;
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
    "paxSegmentRefID",
    "selectedSeat",
    "serviceDefinitionRef"
})
public class ServiceAssociationsType {

    @XmlElement(name = "PaxSegmentRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxSegmentRefID;
    @XmlElement(name = "SelectedSeat")
    protected SeatonLegType selectedSeat;
    @XmlElement(name = "ServiceDefinitionRef")
    protected ServiceDefinitionRefType serviceDefinitionRef;

    /**
     * Gets the value of the paxSegmentRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxSegmentRefID() {
        return paxSegmentRefID;
    }

    /**
     * Sets the value of the paxSegmentRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxSegmentRefID(String value) {
        this.paxSegmentRefID = value;
    }

    /**
     * Gets the value of the selectedSeat property.
     * 
     * @return
     *     possible object is
     *     {@link SeatonLegType }
     *     
     */
    public SeatonLegType getSelectedSeat() {
        return selectedSeat;
    }

    /**
     * Sets the value of the selectedSeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatonLegType }
     *     
     */
    public void setSelectedSeat(SeatonLegType value) {
        this.selectedSeat = value;
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
