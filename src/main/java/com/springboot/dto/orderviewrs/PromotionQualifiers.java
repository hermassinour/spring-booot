
package com.springboot.dto.orderviewrs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PromoQualifierType"&gt;
 *       &lt;attribute name="CC_IssuingCountryInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PromotionQualifiers")
public class PromotionQualifiers
    extends PromoQualifierType
{

    @XmlAttribute(name = "CC_IssuingCountryInd")
    @XmlSchemaType(name = "anySimpleType")
    protected String ccIssuingCountryInd;

    /**
     * Gets the value of the ccIssuingCountryInd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCIssuingCountryInd() {
        return ccIssuingCountryInd;
    }

    /**
     * Sets the value of the ccIssuingCountryInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCIssuingCountryInd(String value) {
        this.ccIssuingCountryInd = value;
    }

}
