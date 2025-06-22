
package com.springboot.dto.orderreshoprq;

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
 * Baggage pricing qualifiers.
 * 
 * <p>Java class for BaggagePricingCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggagePricingCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageOptionCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BaggageTypeCodeType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="FixedPrepaidInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="IncludeSettlementInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedActionCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}MessageFunctionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="OptionalChargesCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}CodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggagePricingCriteriaType", propOrder = {
    "baggageOptionCode",
    "fixedPrepaidInd",
    "commercialAgreementID",
    "deferralInd",
    "includeSettlementInd",
    "requestedActionCode",
    "optionalChargesCode"
})
public class BaggagePricingCriteriaType {

    @XmlElement(name = "BaggageOptionCode")
    @XmlSchemaType(name = "string")
    protected List<BaggageTypeContentType> baggageOptionCode;
    @XmlElement(name = "FixedPrepaidInd")
    protected Boolean fixedPrepaidInd;
    @XmlElement(name = "CommercialAgreementID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commercialAgreementID;
    @XmlElement(name = "DeferralInd")
    protected Boolean deferralInd;
    @XmlElement(name = "IncludeSettlementInd")
    protected Boolean includeSettlementInd;
    @XmlElement(name = "RequestedActionCode")
    protected String requestedActionCode;
    @XmlElement(name = "OptionalChargesCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String optionalChargesCode;

    /**
     * Gets the value of the baggageOptionCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageOptionCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageOptionCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageTypeContentType }
     * 
     * 
     */
    public List<BaggageTypeContentType> getBaggageOptionCode() {
        if (baggageOptionCode == null) {
            baggageOptionCode = new ArrayList<BaggageTypeContentType>();
        }
        return this.baggageOptionCode;
    }

    /**
     * Gets the value of the fixedPrepaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrepaidInd() {
        return fixedPrepaidInd;
    }

    /**
     * Sets the value of the fixedPrepaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedPrepaidInd(Boolean value) {
        this.fixedPrepaidInd = value;
    }

    /**
     * Gets the value of the commercialAgreementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommercialAgreementID() {
        return commercialAgreementID;
    }

    /**
     * Sets the value of the commercialAgreementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommercialAgreementID(String value) {
        this.commercialAgreementID = value;
    }

    /**
     * Gets the value of the deferralInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeferralInd() {
        return deferralInd;
    }

    /**
     * Sets the value of the deferralInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeferralInd(Boolean value) {
        this.deferralInd = value;
    }

    /**
     * Gets the value of the includeSettlementInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncludeSettlementInd() {
        return includeSettlementInd;
    }

    /**
     * Sets the value of the includeSettlementInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncludeSettlementInd(Boolean value) {
        this.includeSettlementInd = value;
    }

    /**
     * Gets the value of the requestedActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedActionCode() {
        return requestedActionCode;
    }

    /**
     * Sets the value of the requestedActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedActionCode(String value) {
        this.requestedActionCode = value;
    }

    /**
     * Gets the value of the optionalChargesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionalChargesCode() {
        return optionalChargesCode;
    }

    /**
     * Sets the value of the optionalChargesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionalChargesCode(String value) {
        this.optionalChargesCode = value;
    }

}
