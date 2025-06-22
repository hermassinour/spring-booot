
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
 * A single human being as distinct from a group, class, or family.
 * 
 * <p>Java class for IndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndividualType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IndividualID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="BirthplaceText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}GenderCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TitleName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SupplementNameType" minOccurs="0"/&gt;
 *         &lt;element name="GivenName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element name="MiddleName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType" maxOccurs="3" minOccurs="0"/&gt;
 *         &lt;element name="Surname" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ProperNameType"/&gt;
 *         &lt;element name="SuffixName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}SupplementNameType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualType", propOrder = {
    "individualID",
    "birthdate",
    "birthplaceText",
    "genderCode",
    "titleName",
    "givenName",
    "middleName",
    "surname",
    "suffixName"
})
public class IndividualType {

    @XmlElement(name = "IndividualID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String individualID;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "BirthplaceText")
    protected String birthplaceText;
    @XmlElement(name = "GenderCode")
    protected GenderCodeType genderCode;
    @XmlElement(name = "TitleName")
    protected SupplementNameType titleName;
    @XmlElement(name = "GivenName")
    protected List<ProperNameType> givenName;
    @XmlElement(name = "MiddleName")
    protected List<ProperNameType> middleName;
    @XmlElement(name = "Surname", required = true)
    protected ProperNameType surname;
    @XmlElement(name = "SuffixName")
    protected SupplementNameType suffixName;

    /**
     * Gets the value of the individualID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndividualID() {
        return individualID;
    }

    /**
     * Sets the value of the individualID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndividualID(String value) {
        this.individualID = value;
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

}
