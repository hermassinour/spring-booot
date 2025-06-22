
package com.springboot.dto.airshoppingrs;

import java.math.BigDecimal;
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
 * Loyalty Program currency payment method.
 * 
 * <p>Java class for LoyaltyRedemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoyaltyRedemptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CertificateNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}NumberType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyCurAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}LoyaltyProgramAccountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoyaltyRedemptionType", propOrder = {
    "accountNumber",
    "certificateNumber",
    "loyaltyCurAmount",
    "loyaltyProgramAccount"
})
public class LoyaltyRedemptionType {

    @XmlElement(name = "AccountNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountNumber;
    @XmlElement(name = "CertificateNumber")
    protected List<BigDecimal> certificateNumber;
    @XmlElement(name = "LoyaltyCurAmount")
    protected AmountType loyaltyCurAmount;
    @XmlElement(name = "LoyaltyProgramAccount")
    protected LoyaltyProgramAccountType loyaltyProgramAccount;

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getCertificateNumber() {
        if (certificateNumber == null) {
            certificateNumber = new ArrayList<BigDecimal>();
        }
        return this.certificateNumber;
    }

    /**
     * Gets the value of the loyaltyCurAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getLoyaltyCurAmount() {
        return loyaltyCurAmount;
    }

    /**
     * Sets the value of the loyaltyCurAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setLoyaltyCurAmount(AmountType value) {
        this.loyaltyCurAmount = value;
    }

    /**
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProgramAccountType }
     *     
     */
    public LoyaltyProgramAccountType getLoyaltyProgramAccount() {
        return loyaltyProgramAccount;
    }

    /**
     * Sets the value of the loyaltyProgramAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProgramAccountType }
     *     
     */
    public void setLoyaltyProgramAccount(LoyaltyProgramAccountType value) {
        this.loyaltyProgramAccount = value;
    }

}
