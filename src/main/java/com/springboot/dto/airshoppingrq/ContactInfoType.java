
package com.springboot.dto.airshoppingrq;

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
 * The electronic or geographic address which a party has provided as the contact channel. For example, contact email, contact postal address, contact phone number.
 * 
 * <p>Java class for ContactInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContactInfoID" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ContactTypeText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="IndividualRef" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ContactRefusedInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="Phone" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PhoneType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OtherAddress" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OtherAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EmailAddress" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}EmailAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndividualType" minOccurs="0"/&gt;
 *         &lt;element name="PostalAddress" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PostalAddressType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInfoType", propOrder = {
    "contactInfoID",
    "contactTypeText",
    "individualRef",
    "contactRefusedInd",
    "phone",
    "otherAddress",
    "emailAddress",
    "individual",
    "postalAddress"
})
public class ContactInfoType {

    @XmlElement(name = "ContactInfoID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String contactInfoID;
    @XmlElement(name = "ContactTypeText")
    protected String contactTypeText;
    @XmlElement(name = "IndividualRef")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String individualRef;
    @XmlElement(name = "ContactRefusedInd")
    protected Boolean contactRefusedInd;
    @XmlElement(name = "Phone")
    protected List<PhoneType> phone;
    @XmlElement(name = "OtherAddress")
    protected List<OtherAddressType> otherAddress;
    @XmlElement(name = "EmailAddress")
    protected List<EmailAddressType> emailAddress;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlElement(name = "PostalAddress")
    protected List<PostalAddressType> postalAddress;

    /**
     * Gets the value of the contactInfoID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactInfoID() {
        return contactInfoID;
    }

    /**
     * Sets the value of the contactInfoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactInfoID(String value) {
        this.contactInfoID = value;
    }

    /**
     * Gets the value of the contactTypeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactTypeText() {
        return contactTypeText;
    }

    /**
     * Sets the value of the contactTypeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactTypeText(String value) {
        this.contactTypeText = value;
    }

    /**
     * Gets the value of the individualRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualRef() {
        return individualRef;
    }

    /**
     * Sets the value of the individualRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualRef(String value) {
        this.individualRef = value;
    }

    /**
     * Gets the value of the contactRefusedInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isContactRefusedInd() {
        return contactRefusedInd;
    }

    /**
     * Sets the value of the contactRefusedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContactRefusedInd(Boolean value) {
        this.contactRefusedInd = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneType }
     * 
     * 
     */
    public List<PhoneType> getPhone() {
        if (phone == null) {
            phone = new ArrayList<PhoneType>();
        }
        return this.phone;
    }

    /**
     * Gets the value of the otherAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherAddressType }
     * 
     * 
     */
    public List<OtherAddressType> getOtherAddress() {
        if (otherAddress == null) {
            otherAddress = new ArrayList<OtherAddressType>();
        }
        return this.otherAddress;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressType }
     * 
     * 
     */
    public List<EmailAddressType> getEmailAddress() {
        if (emailAddress == null) {
            emailAddress = new ArrayList<EmailAddressType>();
        }
        return this.emailAddress;
    }

    /**
     * Gets the value of the individual property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualType }
     *     
     */
    public IndividualType getIndividual() {
        return individual;
    }

    /**
     * Sets the value of the individual property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualType }
     *     
     */
    public void setIndividual(IndividualType value) {
        this.individual = value;
    }

    /**
     * Gets the value of the postalAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PostalAddressType }
     * 
     * 
     */
    public List<PostalAddressType> getPostalAddress() {
        if (postalAddress == null) {
            postalAddress = new ArrayList<PostalAddressType>();
        }
        return this.postalAddress;
    }

}
