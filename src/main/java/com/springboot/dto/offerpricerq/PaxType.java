
package com.springboot.dto.offerpricerq;

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
 * Any person except members of the crew carried or to be carried with the consent of the carrier, on board of any transport vehicle such as aircraft, train, bus, ship. Holds the attributes specific to a one booking, from shopping to f
 * 
 * <p>Java class for PaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PaxID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ID_Type"/&gt;
 *         &lt;element name="PTC" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IATA_PTC_CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AgeMeasure" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Birthdate" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}DateType" minOccurs="0"/&gt;
 *         &lt;element name="ResidenceCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CitizenshipCountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}CountryCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ProfileID_Text" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ProfileConsentInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="PaxRefID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ID_Type" minOccurs="0"/&gt;
 *         &lt;element name="ContactInfo" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ContactInfoType" minOccurs="0"/&gt;
 *         &lt;element name="IdentityDoc" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IdentityDocType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Individual" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}IndividualType" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}LangUsageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LoyaltyProgramAccount" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}LoyaltyProgramAccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RedressProgram" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}RedressProgramType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaxType", propOrder = {
    "paxID",
    "ptc",
    "ageMeasure",
    "birthdate",
    "residenceCountryCode",
    "citizenshipCountryCode",
    "profileIDText",
    "profileConsentInd",
    "paxRefID",
    "contactInfo",
    "identityDoc",
    "individual",
    "language",
    "loyaltyProgramAccount",
    "redressProgram",
    "remark"
})
public class PaxType {

    @XmlElement(name = "PaxID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxID;
    @XmlElement(name = "PTC")
    protected String ptc;
    @XmlElement(name = "AgeMeasure")
    protected MeasureType ageMeasure;
    @XmlElement(name = "Birthdate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthdate;
    @XmlElement(name = "ResidenceCountryCode")
    protected String residenceCountryCode;
    @XmlElement(name = "CitizenshipCountryCode")
    protected String citizenshipCountryCode;
    @XmlElement(name = "ProfileID_Text")
    protected String profileIDText;
    @XmlElement(name = "ProfileConsentInd")
    protected Boolean profileConsentInd;
    @XmlElement(name = "PaxRefID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String paxRefID;
    @XmlElement(name = "ContactInfo")
    protected ContactInfoType contactInfo;
    @XmlElement(name = "IdentityDoc")
    protected List<IdentityDocType> identityDoc;
    @XmlElement(name = "Individual")
    protected IndividualType individual;
    @XmlElement(name = "Language")
    protected List<LangUsageType> language;
    @XmlElement(name = "LoyaltyProgramAccount")
    protected List<LoyaltyProgramAccountType> loyaltyProgramAccount;
    @XmlElement(name = "RedressProgram")
    protected List<RedressProgramType> redressProgram;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;

    /**
     * Gets the value of the paxID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxID() {
        return paxID;
    }

    /**
     * Sets the value of the paxID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxID(String value) {
        this.paxID = value;
    }

    /**
     * Gets the value of the ptc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTC() {
        return ptc;
    }

    /**
     * Sets the value of the ptc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTC(String value) {
        this.ptc = value;
    }

    /**
     * Gets the value of the ageMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getAgeMeasure() {
        return ageMeasure;
    }

    /**
     * Sets the value of the ageMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setAgeMeasure(MeasureType value) {
        this.ageMeasure = value;
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
     * Gets the value of the profileIDText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileIDText() {
        return profileIDText;
    }

    /**
     * Sets the value of the profileIDText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileIDText(String value) {
        this.profileIDText = value;
    }

    /**
     * Gets the value of the profileConsentInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProfileConsentInd() {
        return profileConsentInd;
    }

    /**
     * Sets the value of the profileConsentInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProfileConsentInd(Boolean value) {
        this.profileConsentInd = value;
    }

    /**
     * Gets the value of the paxRefID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaxRefID() {
        return paxRefID;
    }

    /**
     * Sets the value of the paxRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaxRefID(String value) {
        this.paxRefID = value;
    }

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfoType }
     *     
     */
    public ContactInfoType getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfoType }
     *     
     */
    public void setContactInfo(ContactInfoType value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the identityDoc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identityDoc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentityDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentityDocType }
     * 
     * 
     */
    public List<IdentityDocType> getIdentityDoc() {
        if (identityDoc == null) {
            identityDoc = new ArrayList<IdentityDocType>();
        }
        return this.identityDoc;
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
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LangUsageType }
     * 
     * 
     */
    public List<LangUsageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LangUsageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the loyaltyProgramAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyaltyProgramAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyaltyProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LoyaltyProgramAccountType }
     * 
     * 
     */
    public List<LoyaltyProgramAccountType> getLoyaltyProgramAccount() {
        if (loyaltyProgramAccount == null) {
            loyaltyProgramAccount = new ArrayList<LoyaltyProgramAccountType>();
        }
        return this.loyaltyProgramAccount;
    }

    /**
     * Gets the value of the redressProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redressProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedressProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RedressProgramType }
     * 
     * 
     */
    public List<RedressProgramType> getRedressProgram() {
        if (redressProgram == null) {
            redressProgram = new ArrayList<RedressProgramType>();
        }
        return this.redressProgram;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

}
