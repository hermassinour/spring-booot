
package com.springboot.dto.orderchangerq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for V172_PenaltyListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="V172_PenaltyListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Cancellation"/&gt;
 *     &lt;enumeration value="Change"/&gt;
 *     &lt;enumeration value="NoShow"/&gt;
 *     &lt;enumeration value="Upgrade"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "V172_PenaltyListType")
@XmlEnum
public enum V172PenaltyListType {

    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),
    @XmlEnumValue("Change")
    CHANGE("Change"),
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    V172PenaltyListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static V172PenaltyListType fromValue(String v) {
        for (V172PenaltyListType c: V172PenaltyListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
