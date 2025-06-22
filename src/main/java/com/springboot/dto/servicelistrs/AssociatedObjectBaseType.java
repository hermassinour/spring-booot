
package com.springboot.dto.servicelistrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A base type for an Object with Instance Associations.
 * 
 * <p>Java class for AssociatedObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ObjAssociationAttrGroup"/&gt;
 *       &lt;attribute name="ApproxInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="RefundAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="ExemptAllInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="AllGuaranteeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="DisclosureInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="BrowserInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedObjectBaseType")
@XmlSeeAlso({
    com.springboot.dto.servicelistrs.FltPriceReqParamsType.ServiceFilters.class,
    com.springboot.dto.servicelistrs.FltPriceReqParamsType.Pricing.FeeExemption.class,
    com.springboot.dto.servicelistrs.SrvListResParamsType.Pricing.FeeExemption.class,
    com.springboot.dto.servicelistrs.SeatAvailReqParamsType.ServiceFilters.class,
    com.springboot.dto.servicelistrs.SeatAvailReqParamsType.Pricing.FeeExemption.class
})
public class AssociatedObjectBaseType {

    @XmlAttribute(name = "ApproxInd")
    protected Boolean approxInd;
    @XmlAttribute(name = "RefundAllInd")
    protected Boolean refundAllInd;
    @XmlAttribute(name = "ExemptAllInd")
    protected Boolean exemptAllInd;
    @XmlAttribute(name = "AllGuaranteeInd")
    protected Boolean allGuaranteeInd;
    @XmlAttribute(name = "DisclosureInd")
    protected Boolean disclosureInd;
    @XmlAttribute(name = "BrowserInd")
    protected Boolean browserInd;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the approxInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproxInd() {
        return approxInd;
    }

    /**
     * Sets the value of the approxInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproxInd(Boolean value) {
        this.approxInd = value;
    }

    /**
     * Gets the value of the refundAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundAllInd() {
        return refundAllInd;
    }

    /**
     * Sets the value of the refundAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundAllInd(Boolean value) {
        this.refundAllInd = value;
    }

    /**
     * Gets the value of the exemptAllInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptAllInd() {
        return exemptAllInd;
    }

    /**
     * Sets the value of the exemptAllInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemptAllInd(Boolean value) {
        this.exemptAllInd = value;
    }

    /**
     * Gets the value of the allGuaranteeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllGuaranteeInd() {
        return allGuaranteeInd;
    }

    /**
     * Sets the value of the allGuaranteeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllGuaranteeInd(Boolean value) {
        this.allGuaranteeInd = value;
    }

    /**
     * Gets the value of the disclosureInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisclosureInd() {
        return disclosureInd;
    }

    /**
     * Sets the value of the disclosureInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisclosureInd(Boolean value) {
        this.disclosureInd = value;
    }

    /**
     * Gets the value of the browserInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBrowserInd() {
        return browserInd;
    }

    /**
     * Sets the value of the browserInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBrowserInd(Boolean value) {
        this.browserInd = value;
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

}
