
package com.springboot.dto.offerpricers;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A base type definition for Data List Object.
 * 
 * <p>Java class for ListBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="ListToken" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}DescriptionSimpleType" /&gt;
 *       &lt;attribute name="Owner" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}OwnerSimpleType" /&gt;
 *       &lt;attribute name="Seq" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListBaseType")
@XmlSeeAlso({
    AugPointListType.class
})
public class ListBaseType {

    @XmlAttribute(name = "ListToken")
    protected String listToken;
    @XmlAttribute(name = "Owner")
    protected String owner;
    @XmlAttribute(name = "Seq")
    protected BigInteger seq;

    /**
     * Gets the value of the listToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListToken() {
        return listToken;
    }

    /**
     * Sets the value of the listToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListToken(String value) {
        this.listToken = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the seq property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSeq() {
        return seq;
    }

    /**
     * Sets the value of the seq property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSeq(BigInteger value) {
        this.seq = value;
    }

}
