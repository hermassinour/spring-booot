
package com.springboot.dto.seatavailabilityrq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrefLevelCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PrefLevelCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Preferred"/&gt;
 *     &lt;enumeration value="Required"/&gt;
 *     &lt;enumeration value="Exclude"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrefLevelCodeContentType")
@XmlEnum
public enum PrefLevelCodeContentType {

    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * female description
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Exclude")
    EXCLUDE("Exclude");
    private final String value;

    PrefLevelCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrefLevelCodeContentType fromValue(String v) {
        for (PrefLevelCodeContentType c: PrefLevelCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
