
package com.springboot.dto.seatavailabilityrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Further qualifies the flight request by influencing which results are returned in the shopping response, including preferred or required criteria.
 * 
 * <p>Java class for ShoppingCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShoppingCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CabinTypeCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}CabinTypeType" minOccurs="0"/&gt;
 *         &lt;element name="SeatCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}SeatType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ServiceCriteriaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingCriteriaType", propOrder = {
    "cabinTypeCriteria",
    "seatCriteria",
    "serviceCriteria"
})
public class ShoppingCriteriaType {

    @XmlElement(name = "CabinTypeCriteria")
    protected CabinTypeType cabinTypeCriteria;
    @XmlElement(name = "SeatCriteria")
    protected SeatType seatCriteria;
    @XmlElement(name = "ServiceCriteria")
    protected List<ServiceCriteriaType> serviceCriteria;

    /**
     * Gets the value of the cabinTypeCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CabinTypeType }
     *     
     */
    public CabinTypeType getCabinTypeCriteria() {
        return cabinTypeCriteria;
    }

    /**
     * Sets the value of the cabinTypeCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinTypeType }
     *     
     */
    public void setCabinTypeCriteria(CabinTypeType value) {
        this.cabinTypeCriteria = value;
    }

    /**
     * Gets the value of the seatCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link SeatType }
     *     
     */
    public SeatType getSeatCriteria() {
        return seatCriteria;
    }

    /**
     * Sets the value of the seatCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatType }
     *     
     */
    public void setSeatCriteria(SeatType value) {
        this.seatCriteria = value;
    }

    /**
     * Gets the value of the serviceCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCriteriaType }
     * 
     * 
     */
    public List<ServiceCriteriaType> getServiceCriteria() {
        if (serviceCriteria == null) {
            serviceCriteria = new ArrayList<ServiceCriteriaType>();
        }
        return this.serviceCriteria;
    }

}
