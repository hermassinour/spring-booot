
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PenaltyTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancellation"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *     &lt;enumeration value="NoShow"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Upgrade"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyTypeContentType")
@XmlEnum
public enum PenaltyTypeContentType {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade");
    private final String value;

    PenaltyTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyTypeContentType fromValue(String v) {
        for (PenaltyTypeContentType c: PenaltyTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
