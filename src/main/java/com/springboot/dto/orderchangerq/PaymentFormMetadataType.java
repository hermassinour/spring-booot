
package com.springboot.dto.orderchangerq;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for PAYMENT FORM Metadata.
 * 
 * <p>Java class for PaymentFormMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFormMetadataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}MetadataObjectBaseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerFileReference" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ContextSimpleType"&gt;
 *               &lt;pattern value=""[0-9a-zA-Z]{1,27}" "/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ExtendedPaymentCode" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="Text" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DescriptionSimpleType" minOccurs="0"/&gt;
 *         &lt;element name="CorporateContractCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DescriptionSimpleType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFormMetadataType", propOrder = {
    "customerFileReference",
    "extendedPaymentCode",
    "text",
    "corporateContractCode"
})
public class PaymentFormMetadataType
    extends MetadataObjectBaseType
{

    @XmlElement(name = "CustomerFileReference")
    protected String customerFileReference;
    @XmlElement(name = "ExtendedPaymentCode")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger extendedPaymentCode;
    @XmlElement(name = "Text")
    protected String text;
    @XmlElement(name = "CorporateContractCode")
    protected String corporateContractCode;

    /**
     * Gets the value of the customerFileReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerFileReference() {
        return customerFileReference;
    }

    /**
     * Sets the value of the customerFileReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerFileReference(String value) {
        this.customerFileReference = value;
    }

    /**
     * Gets the value of the extendedPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExtendedPaymentCode() {
        return extendedPaymentCode;
    }

    /**
     * Sets the value of the extendedPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExtendedPaymentCode(BigInteger value) {
        this.extendedPaymentCode = value;
    }

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * Gets the value of the corporateContractCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateContractCode() {
        return corporateContractCode;
    }

    /**
     * Sets the value of the corporateContractCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateContractCode(String value) {
        this.corporateContractCode = value;
    }

}
