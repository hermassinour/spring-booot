
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageDisclosureRuleTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BaggageDisclosureRuleTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="D"/&gt;
 *     &lt;enumeration value="N"/&gt;
 *     &lt;enumeration value="Y"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaggageDisclosureRuleTypeContentType")
@XmlEnum
public enum BaggageDisclosureRuleTypeContentType {


    /**
     * Disclosure with no US DOT Reservation
     * 
     */
    D("D"),

    /**
     * No Disclosure or US DOT Reservation
     * 
     */
    N("N"),

    /**
     * Disclosure and US DOT Reservation
     * 
     */
    Y("Y"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    BaggageDisclosureRuleTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageDisclosureRuleTypeContentType fromValue(String v) {
        for (BaggageDisclosureRuleTypeContentType c: BaggageDisclosureRuleTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
