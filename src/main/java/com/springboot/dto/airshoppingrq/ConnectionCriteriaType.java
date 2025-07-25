
package com.springboot.dto.airshoppingrq;

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
import javax.xml.datatype.Duration;


/**
 * Customer's requested connection information.
 * 
 * <p>Java class for ConnectionCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConnectionCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionCriteriaID" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type"/&gt;
 *         &lt;element name="MaximumConnectionQty" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}QtyType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumConnectionDuration" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DurationType" minOccurs="0"/&gt;
 *         &lt;element name="MinimumConnectionDuration" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}DurationType" minOccurs="0"/&gt;
 *         &lt;element name="ConnectionPricingInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="InterlineInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="StationCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}StationCriteriaType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConnectionCriteriaType", propOrder = {
    "connectionCriteriaID",
    "maximumConnectionQty",
    "maximumConnectionDuration",
    "minimumConnectionDuration",
    "connectionPricingInd",
    "interlineInd",
    "stationCriteria"
})
public class ConnectionCriteriaType {

    @XmlElement(name = "ConnectionCriteriaID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionCriteriaID;
    @XmlElement(name = "MaximumConnectionQty")
    protected BigDecimal maximumConnectionQty;
    @XmlElement(name = "MaximumConnectionDuration")
    protected Duration maximumConnectionDuration;
    @XmlElement(name = "MinimumConnectionDuration")
    protected Duration minimumConnectionDuration;
    @XmlElement(name = "ConnectionPricingInd")
    protected Boolean connectionPricingInd;
    @XmlElement(name = "InterlineInd")
    protected Boolean interlineInd;
    @XmlElement(name = "StationCriteria", required = true)
    protected List<StationCriteriaType> stationCriteria;

    /**
     * Gets the value of the connectionCriteriaID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCriteriaID() {
        return connectionCriteriaID;
    }

    /**
     * Sets the value of the connectionCriteriaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCriteriaID(String value) {
        this.connectionCriteriaID = value;
    }

    /**
     * Gets the value of the maximumConnectionQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumConnectionQty() {
        return maximumConnectionQty;
    }

    /**
     * Sets the value of the maximumConnectionQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumConnectionQty(BigDecimal value) {
        this.maximumConnectionQty = value;
    }

    /**
     * Gets the value of the maximumConnectionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMaximumConnectionDuration() {
        return maximumConnectionDuration;
    }

    /**
     * Sets the value of the maximumConnectionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMaximumConnectionDuration(Duration value) {
        this.maximumConnectionDuration = value;
    }

    /**
     * Gets the value of the minimumConnectionDuration property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getMinimumConnectionDuration() {
        return minimumConnectionDuration;
    }

    /**
     * Sets the value of the minimumConnectionDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setMinimumConnectionDuration(Duration value) {
        this.minimumConnectionDuration = value;
    }

    /**
     * Gets the value of the connectionPricingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConnectionPricingInd() {
        return connectionPricingInd;
    }

    /**
     * Sets the value of the connectionPricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConnectionPricingInd(Boolean value) {
        this.connectionPricingInd = value;
    }

    /**
     * Gets the value of the interlineInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInterlineInd() {
        return interlineInd;
    }

    /**
     * Sets the value of the interlineInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInterlineInd(Boolean value) {
        this.interlineInd = value;
    }

    /**
     * Gets the value of the stationCriteria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stationCriteria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStationCriteria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StationCriteriaType }
     * 
     * 
     */
    public List<StationCriteriaType> getStationCriteria() {
        if (stationCriteria == null) {
            stationCriteria = new ArrayList<StationCriteriaType>();
        }
        return this.stationCriteria;
    }

}
