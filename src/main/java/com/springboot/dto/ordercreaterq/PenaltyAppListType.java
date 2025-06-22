
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyAppListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PenaltyAppListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="MaximumPenaltyAmount"/&gt;
 *     &lt;enumeration value="MinimumPenaltyAmount"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PenaltyAppListType")
@XmlEnum
public enum PenaltyAppListType {

    @XmlEnumValue("MaximumPenaltyAmount")
    MAXIMUM_PENALTY_AMOUNT("MaximumPenaltyAmount"),
    @XmlEnumValue("MinimumPenaltyAmount")
    MINIMUM_PENALTY_AMOUNT("MinimumPenaltyAmount"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    PenaltyAppListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyAppListType fromValue(String v) {
        for (PenaltyAppListType c: PenaltyAppListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
