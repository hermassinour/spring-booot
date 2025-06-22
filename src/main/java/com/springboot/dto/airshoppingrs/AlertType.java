
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PROCESSING ALERT definition.
 * 
 * <p>Java class for AlertType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}InventoryDiscrepancyAlert"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}PIN_AuthenticationAlert"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}SecurePaymentAlert"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertType", propOrder = {
    "inventoryDiscrepancyAlert",
    "pinAuthenticationAlert",
    "securePaymentAlert"
})
@XmlSeeAlso({
    com.springboot.dto.airshoppingrs.AlertsType.Alert.class
})
public class AlertType {

    @XmlElement(name = "InventoryDiscrepancyAlert")
    protected InvDiscrepencyAlertType inventoryDiscrepancyAlert;
    @XmlElement(name = "PIN_AuthenticationAlert")
    protected PINAuthTravelerType pinAuthenticationAlert;
    @XmlElement(name = "SecurePaymentAlert")
    protected SecurePaymentAlertType securePaymentAlert;

    /**
     * Gets the value of the inventoryDiscrepancyAlert property.
     * 
     * @return
     *     possible object is
     *     {@link InvDiscrepencyAlertType }
     *     
     */
    public InvDiscrepencyAlertType getInventoryDiscrepancyAlert() {
        return inventoryDiscrepancyAlert;
    }

    /**
     * Sets the value of the inventoryDiscrepancyAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvDiscrepencyAlertType }
     *     
     */
    public void setInventoryDiscrepancyAlert(InvDiscrepencyAlertType value) {
        this.inventoryDiscrepancyAlert = value;
    }

    /**
     * Gets the value of the pinAuthenticationAlert property.
     * 
     * @return
     *     possible object is
     *     {@link PINAuthTravelerType }
     *     
     */
    public PINAuthTravelerType getPINAuthenticationAlert() {
        return pinAuthenticationAlert;
    }

    /**
     * Sets the value of the pinAuthenticationAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link PINAuthTravelerType }
     *     
     */
    public void setPINAuthenticationAlert(PINAuthTravelerType value) {
        this.pinAuthenticationAlert = value;
    }

    /**
     * Gets the value of the securePaymentAlert property.
     * 
     * @return
     *     possible object is
     *     {@link SecurePaymentAlertType }
     *     
     */
    public SecurePaymentAlertType getSecurePaymentAlert() {
        return securePaymentAlert;
    }

    /**
     * Sets the value of the securePaymentAlert property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurePaymentAlertType }
     *     
     */
    public void setSecurePaymentAlert(SecurePaymentAlertType value) {
        this.securePaymentAlert = value;
    }

}
