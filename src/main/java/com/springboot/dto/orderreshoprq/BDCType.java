
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Baggage Determining Carrier, analysis result, and reason information.
 * 
 * <p>Java class for BDC_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BDC_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagRuleCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BagRuleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BDCAnalysisResultCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}BDCAnalysisResultCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BDCReasonText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="BDCCarrierCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AirlineDesigCodeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BDC_Type", propOrder = {
    "bagRuleCode",
    "bdcAnalysisResultCode",
    "bdcReasonText",
    "bdcCarrierCode"
})
public class BDCType {

    @XmlElement(name = "BagRuleCode")
    @XmlSchemaType(name = "string")
    protected BagRuleCodeContentType bagRuleCode;
    @XmlElement(name = "BDCAnalysisResultCode")
    protected String bdcAnalysisResultCode;
    @XmlElement(name = "BDCReasonText")
    protected String bdcReasonText;
    @XmlElement(name = "BDCCarrierCode", required = true)
    protected String bdcCarrierCode;

    /**
     * Gets the value of the bagRuleCode property.
     * 
     * @return
     *     possible object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public BagRuleCodeContentType getBagRuleCode() {
        return bagRuleCode;
    }

    /**
     * Sets the value of the bagRuleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BagRuleCodeContentType }
     *     
     */
    public void setBagRuleCode(BagRuleCodeContentType value) {
        this.bagRuleCode = value;
    }

    /**
     * Gets the value of the bdcAnalysisResultCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCAnalysisResultCode() {
        return bdcAnalysisResultCode;
    }

    /**
     * Sets the value of the bdcAnalysisResultCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCAnalysisResultCode(String value) {
        this.bdcAnalysisResultCode = value;
    }

    /**
     * Gets the value of the bdcReasonText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCReasonText() {
        return bdcReasonText;
    }

    /**
     * Sets the value of the bdcReasonText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCReasonText(String value) {
        this.bdcReasonText = value;
    }

    /**
     * Gets the value of the bdcCarrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBDCCarrierCode() {
        return bdcCarrierCode;
    }

    /**
     * Sets the value of the bdcCarrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBDCCarrierCode(String value) {
        this.bdcCarrierCode = value;
    }

}
