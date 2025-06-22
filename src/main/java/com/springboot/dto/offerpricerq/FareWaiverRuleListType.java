
package com.springboot.dto.offerpricerq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareWaiverRuleListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FareWaiverRuleListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ExchangedReissued"/&gt;
 *     &lt;enumeration value="FareComponent"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FareWaiverRuleListType")
@XmlEnum
public enum FareWaiverRuleListType {

    @XmlEnumValue("ExchangedReissued")
    EXCHANGED_REISSUED("ExchangedReissued"),
    @XmlEnumValue("FareComponent")
    FARE_COMPONENT("FareComponent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FareWaiverRuleListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareWaiverRuleListType fromValue(String v) {
        for (FareWaiverRuleListType c: FareWaiverRuleListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
