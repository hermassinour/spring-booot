
package com.springboot.dto.seatavailabilityrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Group and subgroup code(s) that specify the requested categories of Optional Services to be returned in the results.
 * 
 * <p>Java class for ServiceCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReasonForIssuanceCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ReasonForIssuanceCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ReasonForIssuanceSubCode" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}ReasonForIssuanceSubCodeType" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="ServicePricingOnlyInd" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="PrefLevel" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRQ}PrefLevelType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceCriteriaType", propOrder = {
    "reasonForIssuanceCode",
    "reasonForIssuanceSubCode",
    "servicePricingOnlyInd",
    "prefLevel"
})
public class ServiceCriteriaType {

    @XmlElement(name = "ReasonForIssuanceCode")
    protected String reasonForIssuanceCode;
    @XmlElement(name = "ReasonForIssuanceSubCode")
    protected List<String> reasonForIssuanceSubCode;
    @XmlElement(name = "ServicePricingOnlyInd")
    protected Boolean servicePricingOnlyInd;
    @XmlElement(name = "PrefLevel")
    protected PrefLevelType prefLevel;

    /**
     * Gets the value of the reasonForIssuanceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForIssuanceCode() {
        return reasonForIssuanceCode;
    }

    /**
     * Sets the value of the reasonForIssuanceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForIssuanceCode(String value) {
        this.reasonForIssuanceCode = value;
    }

    /**
     * Gets the value of the reasonForIssuanceSubCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonForIssuanceSubCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonForIssuanceSubCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReasonForIssuanceSubCode() {
        if (reasonForIssuanceSubCode == null) {
            reasonForIssuanceSubCode = new ArrayList<String>();
        }
        return this.reasonForIssuanceSubCode;
    }

    /**
     * Gets the value of the servicePricingOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isServicePricingOnlyInd() {
        return servicePricingOnlyInd;
    }

    /**
     * Sets the value of the servicePricingOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setServicePricingOnlyInd(Boolean value) {
        this.servicePricingOnlyInd = value;
    }

    /**
     * Gets the value of the prefLevel property.
     * 
     * @return
     *     possible object is
     *     {@link PrefLevelType }
     *     
     */
    public PrefLevelType getPrefLevel() {
        return prefLevel;
    }

    /**
     * Sets the value of the prefLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrefLevelType }
     *     
     */
    public void setPrefLevel(PrefLevelType value) {
        this.prefLevel = value;
    }

}
