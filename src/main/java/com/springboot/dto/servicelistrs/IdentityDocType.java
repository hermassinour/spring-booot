
package com.springboot.dto.servicelistrs;

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
 *         &lt;element name="IdentityDocNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CodeType"/&gt;
 *         &lt;element name="IdentityDocTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}IdentityDocTypeCodeType"/&gt;
 *         &lt;element name="IssuingCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TitleName" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}SupplementNameType" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ProperNameType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ProperNameType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="SuffixName" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}SupplementNameType" minOccurs="0"/&gt;
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DateType" minOccurs="0"/&gt;
 *         &lt;element name="BirthplaceText" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}GenderCodeType" minOccurs="0"/&gt;
 *         &lt;element name="IssueDate" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DateType" minOccurs="0"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DateType" minOccurs="0"/&gt;
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}IndividualType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Visa" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}VisaType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "identityDocNumber",
    "identityDocTypeCode",
    "issuingCountryCode",
    "titleName",
    "citizenshipCountryCode",
    "givenName",
    "residenceCountryCode",
    "middleName",
    "surname",
    "suffixName",
    "birthdate",
    "birthplaceText",
    "genderCode",
    "issueDate",
    "expiryDate",
    "individual",
    "visa"
})
public class IdentityDocType {

    @XmlElement(name = "IdentityDocNumber", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String identityDocNumber;
    @XmlElement(name = "IdentityDocTypeCode", required = true)
    protected String identityDocTypeCode;
    @XmlElement(name = "IssuingCountryCode")
    protected String issuingCountryCode;
    @XmlElement(name = "TitleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String titleName;
    @XmlElement(name = "CitizenshipCountryCode")
    protected String citizenshipCountryCode;
    @XmlElement(name = "GivenName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> givenName;
    @XmlElement(name = "ResidenceCountryCode")
    protected String residenceCountryCode;
    @XmlElement(name = "MiddleName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> middleName;
    @XmlElement(name = "Surname")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String surname;
    @XmlElement(name = "SuffixName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String suffixName;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "BirthplaceText")
    protected String birthplaceText;
    @XmlElement(name = "GenderCode")
    @XmlSchemaType(name = "string")
    protected GenderCodeContentType genderCode;
    @XmlElement(name = "IssueDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Individual", required = true)
    protected List<IndividualType> individual;
    @XmlElement(name = "Visa")
    protected List<VisaType> visa;

    /**
     * Gets the value of the identityDocNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocNumber() {
        return identityDocNumber;
    }

    /**
     * Sets the value of the identityDocNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocNumber(String value) {
        this.identityDocNumber = value;
    }

    /**
     * Gets the value of the identityDocTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityDocTypeCode() {
        return identityDocTypeCode;
    }

    /**
     * Sets the value of the identityDocTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityDocTypeCode(String value) {
        this.identityDocTypeCode = value;
    }

    /**
     * Gets the value of the issuingCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingCountryCode() {
        return issuingCountryCode;
    }

    /**
     * Sets the value of the issuingCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingCountryCode(String value) {
        this.issuingCountryCode = value;
    }

    /**
     * Gets the value of the titleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleName() {
        return titleName;
    }

    /**
     * Sets the value of the titleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleName(String value) {
        this.titleName = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitizenshipCountryCode(String value) {
        this.citizenshipCountryCode = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<String>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the residenceCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResidenceCountryCode() {
        return residenceCountryCode;
    }

    /**
     * Sets the value of the residenceCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResidenceCountryCode(String value) {
        this.residenceCountryCode = value;
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
     * {@link String }
     * 
     * 
     */
    public List<String> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<String>();
        }
        return this.middleName;
    }

    /**
     * Gets the value of the surname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets the value of the surname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurname(String value) {
        this.surname = value;
    }

    /**
     * Gets the value of the suffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixName(String value) {
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
     *     {@link GenderCodeContentType }
     *     
     */
    public GenderCodeContentType getGenderCode() {
        return genderCode;
    }

    /**
     * Sets the value of the genderCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeContentType }
     *     
     */
    public void setGenderCode(GenderCodeContentType value) {
        this.genderCode = value;
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
     * Gets the value of the individual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the individual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndividual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndividualType }
     * 
     * 
     */
    public List<IndividualType> getIndividual() {
        if (individual == null) {
            individual = new ArrayList<IndividualType>();
        }
        return this.individual;
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
