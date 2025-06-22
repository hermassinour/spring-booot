
package com.springboot.dto.ordercancelrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base type for a Transaction Processing Object.
 * 
 * <p>Java class for TrxProcessObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrxProcessObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}TrxProcessObjAttrGroup"/&gt;
 *       &lt;attribute name="AuthResponseInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="MaximumTryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="NotProcessedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RetryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AuthRequestInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrxProcessObjectBaseType")
@XmlSeeAlso({
    PINAuthTravelerType.class,
    SecurePaymentAlertType.class,
    PaymentRulesNoticeType.class,
    PricingParametersNoticeType.class,
    ServiceFilterNoticeType.class,
    TaxExemptionNoticeType.class,
    LocalizationNoticeType.class,
    PriceVarianceRuleNoticeType.class
})
public class TrxProcessObjectBaseType {

    @XmlAttribute(name = "AuthResponseInd")
    protected Boolean authResponseInd;
    @XmlAttribute(name = "MaximumTryInd")
    protected Boolean maximumTryInd;
    @XmlAttribute(name = "NotProcessedInd")
    protected Boolean notProcessedInd;
    @XmlAttribute(name = "RetryInd")
    protected Boolean retryInd;
    @XmlAttribute(name = "AuthRequestInd")
    protected Boolean authRequestInd;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;
    @XmlAttribute(name = "trxItemKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String trxItemKey;

    /**
     * Gets the value of the authResponseInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthResponseInd() {
        return authResponseInd;
    }

    /**
     * Sets the value of the authResponseInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthResponseInd(Boolean value) {
        this.authResponseInd = value;
    }

    /**
     * Gets the value of the maximumTryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMaximumTryInd() {
        return maximumTryInd;
    }

    /**
     * Sets the value of the maximumTryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMaximumTryInd(Boolean value) {
        this.maximumTryInd = value;
    }

    /**
     * Gets the value of the notProcessedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNotProcessedInd() {
        return notProcessedInd;
    }

    /**
     * Sets the value of the notProcessedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNotProcessedInd(Boolean value) {
        this.notProcessedInd = value;
    }

    /**
     * Gets the value of the retryInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetryInd() {
        return retryInd;
    }

    /**
     * Sets the value of the retryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetryInd(Boolean value) {
        this.retryInd = value;
    }

    /**
     * Gets the value of the authRequestInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAuthRequestInd() {
        return authRequestInd;
    }

    /**
     * Sets the value of the authRequestInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAuthRequestInd(Boolean value) {
        this.authRequestInd = value;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

    /**
     * Gets the value of the trxItemKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrxItemKey() {
        return trxItemKey;
    }

    /**
     * Sets the value of the trxItemKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrxItemKey(String value) {
        this.trxItemKey = value;
    }

}
