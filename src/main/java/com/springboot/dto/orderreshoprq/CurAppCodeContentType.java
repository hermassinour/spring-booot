
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CurAppCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CurAppCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Actual"/&gt;
 *     &lt;enumeration value="Conversion"/&gt;
 *     &lt;enumeration value="Display"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="Requested"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CurAppCodeContentType")
@XmlEnum
public enum CurAppCodeContentType {

    @XmlEnumValue("Actual")
    ACTUAL("Actual"),
    @XmlEnumValue("Conversion")
    CONVERSION("Conversion"),
    @XmlEnumValue("Display")
    DISPLAY("Display"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Requested")
    REQUESTED("Requested");
    private final String value;

    CurAppCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CurAppCodeContentType fromValue(String v) {
        for (CurAppCodeContentType c: CurAppCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
