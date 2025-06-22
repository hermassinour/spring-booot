
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaggageCategoryListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BaggageCategoryListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CarryOn"/&gt;
 *     &lt;enumeration value="Checked"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BaggageCategoryListType")
@XmlEnum
public enum BaggageCategoryListType {

    @XmlEnumValue("CarryOn")
    CARRY_ON("CarryOn"),
    @XmlEnumValue("Checked")
    CHECKED("Checked");
    private final String value;

    BaggageCategoryListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BaggageCategoryListType fromValue(String v) {
        for (BaggageCategoryListType c: BaggageCategoryListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
