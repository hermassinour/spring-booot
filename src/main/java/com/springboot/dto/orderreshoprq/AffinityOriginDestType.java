
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Origin and Destination information for affinity shopping requests.
 * 
 * <p>Java class for AffinityOriginDestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityOriginDestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ConnectionCriteriaRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="AffinityArrivalRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AffinityArrivalRequestType" minOccurs="0"/&gt;
 *         &lt;element name="AffinityDepRequest" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AffinityDepRequestType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityOriginDestType", propOrder = {
    "connectionCriteriaRefID",
    "affinityArrivalRequest",
    "affinityDepRequest"
})
public class AffinityOriginDestType {

    @XmlElement(name = "ConnectionCriteriaRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String connectionCriteriaRefID;
    @XmlElement(name = "AffinityArrivalRequest")
    protected AffinityArrivalRequestType affinityArrivalRequest;
    @XmlElement(name = "AffinityDepRequest")
    protected AffinityDepRequestType affinityDepRequest;

    /**
     * Gets the value of the connectionCriteriaRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectionCriteriaRefID() {
        return connectionCriteriaRefID;
    }

    /**
     * Sets the value of the connectionCriteriaRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectionCriteriaRefID(String value) {
        this.connectionCriteriaRefID = value;
    }

    /**
     * Gets the value of the affinityArrivalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityArrivalRequestType }
     *     
     */
    public AffinityArrivalRequestType getAffinityArrivalRequest() {
        return affinityArrivalRequest;
    }

    /**
     * Sets the value of the affinityArrivalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityArrivalRequestType }
     *     
     */
    public void setAffinityArrivalRequest(AffinityArrivalRequestType value) {
        this.affinityArrivalRequest = value;
    }

    /**
     * Gets the value of the affinityDepRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AffinityDepRequestType }
     *     
     */
    public AffinityDepRequestType getAffinityDepRequest() {
        return affinityDepRequest;
    }

    /**
     * Sets the value of the affinityDepRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AffinityDepRequestType }
     *     
     */
    public void setAffinityDepRequest(AffinityDepRequestType value) {
        this.affinityDepRequest = value;
    }

}
