
package com.springboot.dto.ordercancelrs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PenaltyTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PenaltyTypeCodeContentType"&gt;
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
@XmlType(name = "PenaltyTypeCodeContentType")
@XmlEnum
public enum PenaltyTypeCodeContentType {


    /**
     * Cancellation
     * 
     */
    @XmlEnumValue("Cancellation")
    CANCELLATION("Cancellation"),

    /**
     * Change
     * 
     */
    @XmlEnumValue("Change")
    CHANGE("Change"),

    /**
     * NoShow
     * 
     */
    @XmlEnumValue("NoShow")
    NO_SHOW("NoShow"),

    /**
     * Other
     * 
     */
    @XmlEnumValue("Other")
    OTHER("Other"),

    /**
     * Upgrade
     * 
     */
    @XmlEnumValue("Upgrade")
    UPGRADE("Upgrade");
    private final String value;

    PenaltyTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PenaltyTypeCodeContentType fromValue(String v) {
        for (PenaltyTypeCodeContentType c: PenaltyTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
