
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="CarrierDesigCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AirlineDesigCodeType"/&gt;
 *         &lt;element name="CarrierName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}NameType" minOccurs="0"/&gt;
 *         &lt;element name="BagRuleCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BagRuleCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BDCAnalysisResultCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BDCAnalysisResultCodeType" minOccurs="0"/&gt;
 *         &lt;element name="BDCReasonText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}TextType" minOccurs="0"/&gt;
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
    "carrierDesigCode",
    "carrierName",
    "bagRuleCode",
    "bdcAnalysisResultCode",
    "bdcReasonText"
})
public class BDCType {

    @XmlElement(name = "CarrierDesigCode", required = true)
    protected String carrierDesigCode;
    @XmlElement(name = "CarrierName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String carrierName;
    @XmlElement(name = "BagRuleCode")
    @XmlSchemaType(name = "string")
    protected BagRuleCodeContentType bagRuleCode;
    @XmlElement(name = "BDCAnalysisResultCode")
    protected String bdcAnalysisResultCode;
    @XmlElement(name = "BDCReasonText")
    protected String bdcReasonText;

    /**
     * Gets the value of the carrierDesigCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierDesigCode() {
        return carrierDesigCode;
    }

    /**
     * Sets the value of the carrierDesigCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierDesigCode(String value) {
        this.carrierDesigCode = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

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

}
