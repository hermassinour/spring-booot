
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BeforeOrAfterListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BeforeOrAfterListType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Before"/&gt;
 *     &lt;enumeration value="After"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BeforeOrAfterListType")
@XmlEnum
public enum BeforeOrAfterListType {

    @XmlEnumValue("Before")
    BEFORE("Before"),
    @XmlEnumValue("After")
    AFTER("After");
    private final String value;

    BeforeOrAfterListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BeforeOrAfterListType fromValue(String v) {
        for (BeforeOrAfterListType c: BeforeOrAfterListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
