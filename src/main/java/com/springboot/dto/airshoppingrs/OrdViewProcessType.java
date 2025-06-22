
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Response Message Processing.
 * 
 * <p>Java class for OrdViewProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdViewProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}OrderProcessResultType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Alerts" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Notices" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}Remarks" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdViewProcessType", propOrder = {
    "alerts",
    "notices",
    "remarks"
})
public class OrdViewProcessType
    extends OrderProcessResultType
{

    @XmlElement(name = "Alerts")
    protected AlertsType alerts;
    @XmlElement(name = "Notices")
    protected Notices notices;
    @XmlElement(name = "Remarks")
    protected V172RemarkType remarks;

    /**
     * Gets the value of the alerts property.
     * 
     * @return
     *     possible object is
     *     {@link AlertsType }
     *     
     */
    public AlertsType getAlerts() {
        return alerts;
    }

    /**
     * Sets the value of the alerts property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertsType }
     *     
     */
    public void setAlerts(AlertsType value) {
        this.alerts = value;
    }

    /**
     * Gets the value of the notices property.
     * 
     * @return
     *     possible object is
     *     {@link Notices }
     *     
     */
    public Notices getNotices() {
        return notices;
    }

    /**
     * Sets the value of the notices property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notices }
     *     
     */
    public void setNotices(Notices value) {
        this.notices = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link V172RemarkType }
     *     
     */
    public V172RemarkType getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link V172RemarkType }
     *     
     */
    public void setRemarks(V172RemarkType value) {
        this.remarks = value;
    }

}
