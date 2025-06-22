
package com.springboot.dto.orderreshoprs;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A punishment imposed for breaking a law, rule, or contract.
 * 
 * <p>Java class for PenaltyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PenaltyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PenaltyID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ID_Type"/&gt;
 *         &lt;element name="UpgradeFeeInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PenaltyTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="AppCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PenaltyAppCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CancelFeeInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="ChangeFeeInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}IndType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="PenaltyPercent" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PercentType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyType", propOrder = {
    "penaltyID",
    "upgradeFeeInd",
    "typeCode",
    "descText",
    "appCode",
    "cancelFeeInd",
    "changeFeeInd",
    "penaltyAmount",
    "penaltyPercent"
})
public class PenaltyType {

    @XmlElement(name = "PenaltyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String penaltyID;
    @XmlElement(name = "UpgradeFeeInd")
    protected Boolean upgradeFeeInd;
    @XmlElement(name = "TypeCode")
    @XmlSchemaType(name = "string")
    protected PenaltyTypeContentType typeCode;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "AppCode")
    protected String appCode;
    @XmlElement(name = "CancelFeeInd")
    protected Boolean cancelFeeInd;
    @XmlElement(name = "ChangeFeeInd")
    protected Boolean changeFeeInd;
    @XmlElement(name = "PenaltyAmount")
    protected AmountType penaltyAmount;
    @XmlElement(name = "PenaltyPercent")
    protected BigDecimal penaltyPercent;

    /**
     * Gets the value of the penaltyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenaltyID() {
        return penaltyID;
    }

    /**
     * Sets the value of the penaltyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenaltyID(String value) {
        this.penaltyID = value;
    }

    /**
     * Gets the value of the upgradeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUpgradeFeeInd() {
        return upgradeFeeInd;
    }

    /**
     * Sets the value of the upgradeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUpgradeFeeInd(Boolean value) {
        this.upgradeFeeInd = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyTypeContentType }
     *     
     */
    public PenaltyTypeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyTypeContentType }
     *     
     */
    public void setTypeCode(PenaltyTypeContentType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the appCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppCode() {
        return appCode;
    }

    /**
     * Sets the value of the appCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppCode(String value) {
        this.appCode = value;
    }

    /**
     * Gets the value of the cancelFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelFeeInd() {
        return cancelFeeInd;
    }

    /**
     * Sets the value of the cancelFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelFeeInd(Boolean value) {
        this.cancelFeeInd = value;
    }

    /**
     * Gets the value of the changeFeeInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeFeeInd() {
        return changeFeeInd;
    }

    /**
     * Sets the value of the changeFeeInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeFeeInd(Boolean value) {
        this.changeFeeInd = value;
    }

    /**
     * Gets the value of the penaltyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPenaltyAmount() {
        return penaltyAmount;
    }

    /**
     * Sets the value of the penaltyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPenaltyAmount(AmountType value) {
        this.penaltyAmount = value;
    }

    /**
     * Gets the value of the penaltyPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPenaltyPercent() {
        return penaltyPercent;
    }

    /**
     * Sets the value of the penaltyPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPenaltyPercent(BigDecimal value) {
        this.penaltyPercent = value;
    }

}
