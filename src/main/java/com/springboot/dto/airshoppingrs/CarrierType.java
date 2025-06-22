
package com.springboot.dto.airshoppingrs;

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
 * Includes the carrier issuing the ticket and all carriers that carry or undertake to carry the passenger and/or his baggage or to perform any other services related to such carriage.
 * 
 * <p>Java class for CarrierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineDesigCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AirlineDesigCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DuplicateDesigInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="Alliance" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AllianceType" minOccurs="0"/&gt;
 *         &lt;element name="CarrierAircraft" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}CarrierAircraftTypeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarrierType", propOrder = {
    "airlineDesigCode",
    "duplicateDesigInd",
    "name",
    "alliance",
    "carrierAircraft"
})
public class CarrierType {

    @XmlElement(name = "AirlineDesigCode")
    protected String airlineDesigCode;
    @XmlElement(name = "DuplicateDesigInd")
    protected Boolean duplicateDesigInd;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "Alliance")
    protected AllianceType alliance;
    @XmlElement(name = "CarrierAircraft")
    protected List<CarrierAircraftTypeType> carrierAircraft;

    /**
     * Gets the value of the airlineDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineDesigCode() {
        return airlineDesigCode;
    }

    /**
     * Sets the value of the airlineDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineDesigCode(String value) {
        this.airlineDesigCode = value;
    }

    /**
     * Gets the value of the duplicateDesigInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDuplicateDesigInd() {
        return duplicateDesigInd;
    }

    /**
     * Sets the value of the duplicateDesigInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDuplicateDesigInd(Boolean value) {
        this.duplicateDesigInd = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the alliance property.
     * 
     * @return
     *     possible object is
     *     {@link AllianceType }
     *     
     */
    public AllianceType getAlliance() {
        return alliance;
    }

    /**
     * Sets the value of the alliance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllianceType }
     *     
     */
    public void setAlliance(AllianceType value) {
        this.alliance = value;
    }

    /**
     * Gets the value of the carrierAircraft property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierAircraft property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierAircraft().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierAircraftTypeType }
     * 
     * 
     */
    public List<CarrierAircraftTypeType> getCarrierAircraft() {
        if (carrierAircraft == null) {
            carrierAircraft = new ArrayList<CarrierAircraftTypeType>();
        }
        return this.carrierAircraft;
    }

}
