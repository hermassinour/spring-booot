
package com.springboot.dto.ordercancelrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Reason and Refund FOP parameters for this cancellation request.
 * 
 * <p>Java class for OrderCancelParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderCancelParametersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="RefundPaymentMethodPreference" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}RefundPaymentMethodPrefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderCancelParametersType", propOrder = {
    "reasonCode",
    "refundPaymentMethodPreference"
})
public class OrderCancelParametersType {

    @XmlElement(name = "ReasonCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonCode;
    @XmlElement(name = "RefundPaymentMethodPreference")
    protected RefundPaymentMethodPrefType refundPaymentMethodPreference;

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the refundPaymentMethodPreference property.
     * 
     * @return
     *     possible object is
     *     {@link RefundPaymentMethodPrefType }
     *     
     */
    public RefundPaymentMethodPrefType getRefundPaymentMethodPreference() {
        return refundPaymentMethodPreference;
    }

    /**
     * Sets the value of the refundPaymentMethodPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefundPaymentMethodPrefType }
     *     
     */
    public void setRefundPaymentMethodPreference(RefundPaymentMethodPrefType value) {
        this.refundPaymentMethodPreference = value;
    }

}
