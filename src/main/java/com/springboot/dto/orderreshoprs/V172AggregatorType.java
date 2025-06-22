
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for AGGREGATOR Intermediary Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from IntermediaryCoreRepType.
 * 
 * <p>Java class for V172_AggregatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_AggregatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IntermediaryCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}RoleOfIntermediaryReference" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AggregatorID"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ConnectMethod" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ConnectMethodSimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_AggregatorType", propOrder = {
    "roleOfIntermediaryReference",
    "aggregatorID"
})
@XmlSeeAlso({
    AggregatorMsgPartyCoreType.class
})
public class V172AggregatorType
    extends IntermediaryCoreRepType
{

    @XmlElement(name = "RoleOfIntermediaryReference")
    protected RoleOfIntermediaryReferenceType roleOfIntermediaryReference;
    @XmlElement(name = "AggregatorID", required = true)
    protected AggregatorIDType aggregatorID;
    @XmlAttribute(name = "ConnectMethod")
    protected String connectMethod;

    /**
     * Gets the value of the roleOfIntermediaryReference property.
     * 
     * @return
     *     possible object is
     *     {@link RoleOfIntermediaryReferenceType }
     *     
     */
    public RoleOfIntermediaryReferenceType getRoleOfIntermediaryReference() {
        return roleOfIntermediaryReference;
    }

    /**
     * Sets the value of the roleOfIntermediaryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoleOfIntermediaryReferenceType }
     *     
     */
    public void setRoleOfIntermediaryReference(RoleOfIntermediaryReferenceType value) {
        this.roleOfIntermediaryReference = value;
    }

    /**
     * Gets the value of the aggregatorID property.
     * 
     * @return
     *     possible object is
     *     {@link AggregatorIDType }
     *     
     */
    public AggregatorIDType getAggregatorID() {
        return aggregatorID;
    }

    /**
     * Sets the value of the aggregatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorIDType }
     *     
     */
    public void setAggregatorID(AggregatorIDType value) {
        this.aggregatorID = value;
    }

    /**
     * Gets the value of the connectMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectMethod() {
        return connectMethod;
    }

    /**
     * Sets the value of the connectMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectMethod(String value) {
        this.connectMethod = value;
    }

}
