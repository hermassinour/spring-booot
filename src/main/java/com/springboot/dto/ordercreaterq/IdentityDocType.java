
package com.springboot.dto.ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Any document which may be used to identify a person or verify aspects of a person's personal identity. If issued in a small, standard credit card size form, it is usually called an identity card. Some countries issue formal identity documents, while othe
 * 
 * <p>Java class for IdentityDocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentityDocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentityDocID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *         &lt;element name="IdentityDocTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}IdentityDocTypeCodeType"/&gt;
 *         &lt;element name="IssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TitleName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SupplementNameType" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="SuffixName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SupplementNameType" minOccurs="0"/&gt;
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="BirthplaceText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}GenderCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Visa" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}VisaType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentityDocType", propOrder = {
    "identityDocID",
    "identityDocTypeCode",
    "issuingCountryCode",
    "citizenshipCountryCode",
    "residenceCountryCode",
    "titleName",
    "givenName",
    "issueDate",
    "expiryDate",
    "middleName",
    "surname",
    "suffixName",
    "birthdate",
    "birthplaceText",
    "genderCode",
    "visa"
})
public class IdentityDocType {

    @XmlElement(name = "IdentityDocID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocID;
    @XmlElement(name = "IdentityDocTypeCode", required = true)
    protected IdentityDocTypeCodeType identityDocTypeCode;
    @XmlElement(name = "IssuingCountryCode")
    protected CountryCodeType issuingCountryCode;
    @XmlElement(name = "CitizenshipCountryCode")
    protected CountryCodeType citizenshipCountryCode;
    @XmlElement(name = "ResidenceCountryCode")
    protected CountryCodeType residenceCountryCode;
    @XmlElement(name = "TitleName")
    protected SupplementNameType titleName;
    @XmlElement(name = "GivenName")
    protected List<ProperNameType> givenName;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "MiddleName")
    protected List<ProperNameType> middleName;
    @XmlElement(name = "Surname")
    protected ProperNameType surname;
    @XmlElement(name = "SuffixName")
    protected SupplementNameType suffixName;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "BirthplaceText")
    protected String birthplaceText;
    @XmlElement(name = "GenderCode")
    protected GenderCodeType genderCode;
    @XmlElement(name = "Visa")
    protected List<VisaType> visa;

    /**
     * Gets the value of the identityDocID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocID() {
        return identityDocID;
    }

    /**
     * Sets the value of the identityDocID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocID(String value) {
        this.identityDocID = value;
    }

    /**
     * Gets the value of the identityDocTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityDocTypeCodeType }
     *     
     */
    public IdentityDocTypeCodeType getIdentityDocTypeCode() {
        return identityDocTypeCode;
    }

    /**
     * Sets the value of the identityDocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityDocTypeCodeType }
     *     
     */
    public void setIdentityDocTypeCode(IdentityDocTypeCodeType value) {
        this.identityDocTypeCode = value;
    }

    /**
     * Gets the value of the issuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Sets the value of the issuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setIssuingCountryCode(CountryCodeType value) {
        this.issuingCountryCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCitizenshipCountryCode(CountryCodeType value) {
        this.citizenshipCountryCode = value;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setResidenceCountryCode(CountryCodeType value) {
        this.residenceCountryCode = value;
    }

    /**
     * Gets the value of the titleName property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementNameType }
     *     
     */
    public SupplementNameType getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementNameType }
     *     
     */
    public void setTitleName(SupplementNameType value) {
        this.titleName = value;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProperNameType }
     * 
     * 
     */
    public List<ProperNameType> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<ProperNameType>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProperNameType }
     * 
     * 
     */
    public List<ProperNameType> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<ProperNameType>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link ProperNameType }
     *     
     */
    public ProperNameType getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProperNameType }
     *     
     */
    public void setSurname(ProperNameType value) {
        this.surname = value;
    }

    /**
     * Gets the value of the suffixName property.
     * 
     * @return
     *     possible object is
     *     {@link SupplementNameType }
     *     
     */
    public SupplementNameType getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplementNameType }
     *     
     */
    public void setSuffixName(SupplementNameType value) {
        this.suffixName = value;
    }

    /**
     * Gets the value of the birthdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdate() {
        return birthdate;
    }

    /**
     * Sets the value of the birthdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdate(XMLGregorianCalendar value) {
        this.birthdate = value;
    }

    /**
     * Gets the value of the birthplaceText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthplaceText() {
        return birthplaceText;
    }

    /**
     * Sets the value of the birthplaceText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthplaceText(String value) {
        this.birthplaceText = value;
    }

    /**
     * Gets the value of the genderCode property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeType }
     *     
     */
    public GenderCodeType getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeType }
     *     
     */
    public void setGenderCode(GenderCodeType value) {
        this.genderCode = value;
    }

    /**
     * Gets the value of the visa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the visa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVisa().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VisaType }
     * 
     * 
     */
    public List<VisaType> getVisa() {
        if (visa == null) {
            visa = new ArrayList<VisaType>();
        }
        return this.visa;
    }

}
