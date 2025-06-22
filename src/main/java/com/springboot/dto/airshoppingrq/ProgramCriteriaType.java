
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
 * Filtering criteria based on discount programs.
 * 
 * <p>Java class for ProgramCriteriaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProgramCriteriaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MemberStatusText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}NameType" minOccurs="0"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ProgramTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="Pre-paidCertificate" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}PrePaidCertificateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProgamContract" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ProgamContractType" minOccurs="0"/&gt;
 *         &lt;element name="ProgramAccount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ProgramAccountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProgramOwner"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;choice&gt;
 *                   &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CarrierType" minOccurs="0"/&gt;
 *                   &lt;element name="Org" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrgType" minOccurs="0"/&gt;
 *                 &lt;/choice&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProgramCriteriaType", propOrder = {
    "memberStatusText",
    "name",
    "typeCode",
    "prePaidCertificate",
    "progamContract",
    "programAccount",
    "programOwner"
})
public class ProgramCriteriaType {

    @XmlElement(name = "MemberStatusText")
    protected String memberStatusText;
    @XmlElement(name = "Name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;
    @XmlElement(name = "TypeCode")
    @XmlSchemaType(name = "string")
    protected ProgramTypeCodeContentType typeCode;
    @XmlElement(name = "Pre-paidCertificate")
    protected List<PrePaidCertificateType> prePaidCertificate;
    @XmlElement(name = "ProgamContract")
    protected ProgamContractType progamContract;
    @XmlElement(name = "ProgramAccount")
    protected List<ProgramAccountType> programAccount;
    @XmlElement(name = "ProgramOwner", required = true)
    protected ProgramCriteriaType.ProgramOwner programOwner;

    /**
     * Gets the value of the memberStatusText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatusText() {
        return memberStatusText;
    }

    /**
     * Sets the value of the memberStatusText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberStatusText(String value) {
        this.memberStatusText = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramTypeCodeContentType }
     *     
     */
    public ProgramTypeCodeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramTypeCodeContentType }
     *     
     */
    public void setTypeCode(ProgramTypeCodeContentType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the prePaidCertificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prePaidCertificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrePaidCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrePaidCertificateType }
     * 
     * 
     */
    public List<PrePaidCertificateType> getPrePaidCertificate() {
        if (prePaidCertificate == null) {
            prePaidCertificate = new ArrayList<PrePaidCertificateType>();
        }
        return this.prePaidCertificate;
    }

    /**
     * Gets the value of the progamContract property.
     * 
     * @return
     *     possible object is
     *     {@link ProgamContractType }
     *     
     */
    public ProgamContractType getProgamContract() {
        return progamContract;
    }

    /**
     * Sets the value of the progamContract property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgamContractType }
     *     
     */
    public void setProgamContract(ProgamContractType value) {
        this.progamContract = value;
    }

    /**
     * Gets the value of the programAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProgramAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProgramAccountType }
     * 
     * 
     */
    public List<ProgramAccountType> getProgramAccount() {
        if (programAccount == null) {
            programAccount = new ArrayList<ProgramAccountType>();
        }
        return this.programAccount;
    }

    /**
     * Gets the value of the programOwner property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramCriteriaType.ProgramOwner }
     *     
     */
    public ProgramCriteriaType.ProgramOwner getProgramOwner() {
        return programOwner;
    }

    /**
     * Sets the value of the programOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramCriteriaType.ProgramOwner }
     *     
     */
    public void setProgramOwner(ProgramCriteriaType.ProgramOwner value) {
        this.programOwner = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;choice&gt;
     *         &lt;element name="Carrier" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CarrierType" minOccurs="0"/&gt;
     *         &lt;element name="Org" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}OrgType" minOccurs="0"/&gt;
     *       &lt;/choice&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "carrier",
        "org"
    })
    public static class ProgramOwner {

        @XmlElement(name = "Carrier")
        protected CarrierType carrier;
        @XmlElement(name = "Org")
        protected OrgType org;

        /**
         * Gets the value of the carrier property.
         * 
         * @return
         *     possible object is
         *     {@link CarrierType }
         *     
         */
        public CarrierType getCarrier() {
            return carrier;
        }

        /**
         * Sets the value of the carrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link CarrierType }
         *     
         */
        public void setCarrier(CarrierType value) {
            this.carrier = value;
        }

        /**
         * Gets the value of the org property.
         * 
         * @return
         *     possible object is
         *     {@link OrgType }
         *     
         */
        public OrgType getOrg() {
            return org;
        }

        /**
         * Sets the value of the org property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrgType }
         *     
         */
        public void setOrg(OrgType value) {
            this.org = value;
        }

    }

}
