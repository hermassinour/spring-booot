
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * COMMON NOTICES definition.
 * 
 * <p>Java class for NoticeBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoticeBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Localization" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}LocalizationNoticeType" minOccurs="0"/&gt;
 *         &lt;element name="InfoPolicies" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}InfoPolicyNoticeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoticeBaseType", propOrder = {
    "localization",
    "infoPolicies"
})
@XmlSeeAlso({
    com.springboot.dto.airshoppingrq.ItinReshopParamsType.Notices.class
})
public class NoticeBaseType {

    @XmlElement(name = "Localization")
    protected LocalizationNoticeType localization;
    @XmlElement(name = "InfoPolicies")
    protected InfoPolicyNoticeType infoPolicies;

    /**
     * Gets the value of the localization property.
     * 
     * @return
     *     possible object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public LocalizationNoticeType getLocalization() {
        return localization;
    }

    /**
     * Sets the value of the localization property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalizationNoticeType }
     *     
     */
    public void setLocalization(LocalizationNoticeType value) {
        this.localization = value;
    }

    /**
     * Gets the value of the infoPolicies property.
     * 
     * @return
     *     possible object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public InfoPolicyNoticeType getInfoPolicies() {
        return infoPolicies;
    }

    /**
     * Sets the value of the infoPolicies property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoPolicyNoticeType }
     *     
     */
    public void setInfoPolicies(InfoPolicyNoticeType value) {
        this.infoPolicies = value;
    }

}
