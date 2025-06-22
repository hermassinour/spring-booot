
package com.springboot.dto.seatavailabilityrs;

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
 * Disclosure information specifically related to baggage.
 * 
 * <p>Java class for BaggageDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDisclosureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageDisclosureID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type"/&gt;
 *         &lt;element name="RuleTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}BaggageDisclosureRuleTypeCodeType"/&gt;
 *         &lt;element name="CommercialAgreementID" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="DeferralInd" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="FixedPrePaidInd" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="CheckInChargesInd" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="BDC" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}BDC_Type" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}DescType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureType", propOrder = {
    "baggageDisclosureID",
    "ruleTypeCode",
    "commercialAgreementID",
    "deferralInd",
    "fixedPrePaidInd",
    "checkInChargesInd",
    "bdc",
    "desc"
})
public class BaggageDisclosureType {

    @XmlElement(name = "BaggageDisclosureID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageDisclosureID;
    @XmlElement(name = "RuleTypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected BaggageDisclosureRuleTypeContentType ruleTypeCode;
    @XmlElement(name = "CommercialAgreementID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String commercialAgreementID;
    @XmlElement(name = "DeferralInd")
    protected Boolean deferralInd;
    @XmlElement(name = "FixedPrePaidInd")
    protected Boolean fixedPrePaidInd;
    @XmlElement(name = "CheckInChargesInd")
    protected Boolean checkInChargesInd;
    @XmlElement(name = "BDC")
    protected BDCType bdc;
    @XmlElement(name = "Desc")
    protected List<DescType> desc;

    /**
     * Gets the value of the baggageDisclosureID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageDisclosureID() {
        return baggageDisclosureID;
    }

    /**
     * Sets the value of the baggageDisclosureID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageDisclosureID(String value) {
        this.baggageDisclosureID = value;
    }

    /**
     * Gets the value of the ruleTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageDisclosureRuleTypeContentType }
     *     
     */
    public BaggageDisclosureRuleTypeContentType getRuleTypeCode() {
        return ruleTypeCode;
    }

    /**
     * Sets the value of the ruleTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDisclosureRuleTypeContentType }
     *     
     */
    public void setRuleTypeCode(BaggageDisclosureRuleTypeContentType value) {
        this.ruleTypeCode = value;
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
     * Gets the value of the fixedPrePaidInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFixedPrePaidInd() {
        return fixedPrePaidInd;
    }

    /**
     * Sets the value of the fixedPrePaidInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFixedPrePaidInd(Boolean value) {
        this.fixedPrePaidInd = value;
    }

    /**
     * Gets the value of the checkInChargesInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCheckInChargesInd() {
        return checkInChargesInd;
    }

    /**
     * Sets the value of the checkInChargesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCheckInChargesInd(Boolean value) {
        this.checkInChargesInd = value;
    }

    /**
     * Gets the value of the bdc property.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     */
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DescType }
     * 
     * 
     */
    public List<DescType> getDesc() {
        if (desc == null) {
            desc = new ArrayList<DescType>();
        }
        return this.desc;
    }

}
