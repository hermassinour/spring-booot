
package com.springboot.dto.offerpricers;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * A data type for Message Security.
 * 
 * <p>Java class for SecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DutyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PseudoCityCode" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="LNIATA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ERSP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AirlineSpecificCodes" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="RES"/&gt;
 *               &lt;enumeration value="ATO"/&gt;
 *               &lt;enumeration value="CTO"/&gt;
 *               &lt;enumeration value="WEB"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
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
@XmlType(name = "SecurityType", propOrder = {
    "dutyCode",
    "iata",
    "pseudoCityCode",
    "lniata",
    "ersp",
    "department",
    "departmentCode",
    "airlineSpecificCodes"
})
@XmlSeeAlso({
    Security.class
})
public class SecurityType {

    @XmlElement(name = "DutyCode")
    protected String dutyCode;
    @XmlElement(name = "IATA")
    protected String iata;
    @XmlElement(name = "PseudoCityCode")
    protected SecurityType.PseudoCityCode pseudoCityCode;
    @XmlElement(name = "LNIATA")
    protected String lniata;
    @XmlElement(name = "ERSP")
    protected String ersp;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "DepartmentCode")
    protected String departmentCode;
    @XmlElement(name = "AirlineSpecificCodes")
    protected String airlineSpecificCodes;

    /**
     * Gets the value of the dutyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyCode() {
        return dutyCode;
    }

    /**
     * Sets the value of the dutyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyCode(String value) {
        this.dutyCode = value;
    }

    /**
     * Gets the value of the iata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIATA() {
        return iata;
    }

    /**
     * Sets the value of the iata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIATA(String value) {
        this.iata = value;
    }

    /**
     * Gets the value of the pseudoCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityType.PseudoCityCode }
     *     
     */
    public SecurityType.PseudoCityCode getPseudoCityCode() {
        return pseudoCityCode;
    }

    /**
     * Sets the value of the pseudoCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityType.PseudoCityCode }
     *     
     */
    public void setPseudoCityCode(SecurityType.PseudoCityCode value) {
        this.pseudoCityCode = value;
    }

    /**
     * Gets the value of the lniata property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLNIATA() {
        return lniata;
    }

    /**
     * Sets the value of the lniata property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLNIATA(String value) {
        this.lniata = value;
    }

    /**
     * Gets the value of the ersp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getERSP() {
        return ersp;
    }

    /**
     * Sets the value of the ersp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setERSP(String value) {
        this.ersp = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentCode(String value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the airlineSpecificCodes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineSpecificCodes() {
        return airlineSpecificCodes;
    }

    /**
     * Sets the value of the airlineSpecificCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineSpecificCodes(String value) {
        this.airlineSpecificCodes = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PseudoCityCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Owner")
        protected String owner;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
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

    }

}
