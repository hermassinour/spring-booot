
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelAgencyTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TravelAgencyTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="OnlineTravelAgency"/&gt;
 *     &lt;enumeration value="TravelAgency"/&gt;
 *     &lt;enumeration value="TravelManagementCompany"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TravelAgencyTypeCodeContentType")
@XmlEnum
public enum TravelAgencyTypeCodeContentType {

    @XmlEnumValue("OnlineTravelAgency")
    ONLINE_TRAVEL_AGENCY("OnlineTravelAgency"),
    @XmlEnumValue("TravelAgency")
    TRAVEL_AGENCY("TravelAgency"),
    @XmlEnumValue("TravelManagementCompany")
    TRAVEL_MANAGEMENT_COMPANY("TravelManagementCompany");
    private final String value;

    TravelAgencyTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelAgencyTypeCodeContentType fromValue(String v) {
        for (TravelAgencyTypeCodeContentType c: TravelAgencyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
