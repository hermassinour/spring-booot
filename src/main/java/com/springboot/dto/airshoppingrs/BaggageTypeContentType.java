
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BaggageTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CheckedBag"/&gt;
 *     &lt;enumeration value="CarryOnBag"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaggageTypeContentType")
@XmlEnum
public enum BaggageTypeContentType {

    @XmlEnumValue("CheckedBag")
    CHECKED_BAG("CheckedBag"),
    @XmlEnumValue("CarryOnBag")
    CARRY_ON_BAG("CarryOnBag");
    private final String value;

    BaggageTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageTypeContentType fromValue(String v) {
        for (BaggageTypeContentType c: BaggageTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
