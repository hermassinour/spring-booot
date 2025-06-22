
package com.springboot.dto.airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Pricing Parameters, including Simple Pricing, Award Travel, Auto Exchange, Override Currency and Tax Exemption.
 * 
 * <p>Java class for PricingParameterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingParameterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AutoExchInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="AwardIncludedInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="AwardOnlyInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="OverrideCurCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurCodeType" minOccurs="0"/&gt;
 *         &lt;element name="SimplePricingInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="TaxExemption" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingParameterType", propOrder = {
    "autoExchInd",
    "awardIncludedInd",
    "awardOnlyInd",
    "overrideCurCode",
    "simplePricingInd",
    "taxExemption"
})
public class PricingParameterType {

    @XmlElement(name = "AutoExchInd")
    protected Boolean autoExchInd;
    @XmlElement(name = "AwardIncludedInd")
    protected Boolean awardIncludedInd;
    @XmlElement(name = "AwardOnlyInd")
    protected Boolean awardOnlyInd;
    @XmlElement(name = "OverrideCurCode")
    protected String overrideCurCode;
    @XmlElement(name = "SimplePricingInd")
    protected Boolean simplePricingInd;
    @XmlElement(name = "TaxExemption")
    protected List<TaxSummaryType> taxExemption;

    /**
     * Gets the value of the autoExchInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoExchInd() {
        return autoExchInd;
    }

    /**
     * Sets the value of the autoExchInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoExchInd(Boolean value) {
        this.autoExchInd = value;
    }

    /**
     * Gets the value of the awardIncludedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwardIncludedInd() {
        return awardIncludedInd;
    }

    /**
     * Sets the value of the awardIncludedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwardIncludedInd(Boolean value) {
        this.awardIncludedInd = value;
    }

    /**
     * Gets the value of the awardOnlyInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwardOnlyInd() {
        return awardOnlyInd;
    }

    /**
     * Sets the value of the awardOnlyInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwardOnlyInd(Boolean value) {
        this.awardOnlyInd = value;
    }

    /**
     * Gets the value of the overrideCurCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideCurCode() {
        return overrideCurCode;
    }

    /**
     * Sets the value of the overrideCurCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideCurCode(String value) {
        this.overrideCurCode = value;
    }

    /**
     * Gets the value of the simplePricingInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSimplePricingInd() {
        return simplePricingInd;
    }

    /**
     * Sets the value of the simplePricingInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSimplePricingInd(Boolean value) {
        this.simplePricingInd = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxExemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxSummaryType }
     * 
     * 
     */
    public List<TaxSummaryType> getTaxExemption() {
        if (taxExemption == null) {
            taxExemption = new ArrayList<TaxSummaryType>();
        }
        return this.taxExemption;
    }

}
