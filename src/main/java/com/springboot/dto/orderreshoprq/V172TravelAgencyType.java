
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for TRAVEL AGENCY Seller Role, Core Representation.
 * 
 * Notes:
 *  1. This is a representation of common (role-agnostic) properties associated with this Actor definition.
 *  2. This type is used as (derived) base type for all Roles associated with this Actor.
 *  3. This type is derived from AgencyCoreRepType.
 * 
 * <p>Java class for V172_TravelAgencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="V172_TravelAgencyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AgencyCoreRepType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AgencyID"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "V172_TravelAgencyType", propOrder = {
    "agencyID"
})
@XmlSeeAlso({
    TrvlAgencyMsgPartyCoreType.class
})
public class V172TravelAgencyType
    extends AgencyCoreRepType
{

    @XmlElement(name = "AgencyID", required = true)
    protected AgencyIDType agencyID;

    /**
     * Gets the value of the agencyID property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyIDType }
     *     
     */
    public AgencyIDType getAgencyID() {
        return agencyID;
    }

    /**
     * Sets the value of the agencyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyIDType }
     *     
     */
    public void setAgencyID(AgencyIDType value) {
        this.agencyID = value;
    }

}
