
package com.springboot.dto.ordercreaterq;

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
 *     &lt;enumeration value="Checked"/&gt;
 *     &lt;enumeration value="CarryOn"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaggageTypeContentType")
@XmlEnum
public enum BaggageTypeContentType {

    @XmlEnumValue("Checked")
    CHECKED("Checked"),
    @XmlEnumValue("CarryOn")
    CARRY_ON("CarryOn");
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
