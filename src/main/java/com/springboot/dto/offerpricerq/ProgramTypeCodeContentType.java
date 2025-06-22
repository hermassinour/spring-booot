
package com.springboot.dto.offerpricerq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProgramTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProgramTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Discount Program"/&gt;
 *     &lt;enumeration value="Incentive Program"/&gt;
 *     &lt;enumeration value="Prepaid Program"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProgramTypeCodeContentType")
@XmlEnum
public enum ProgramTypeCodeContentType {

    @XmlEnumValue("Discount Program")
    DISCOUNT_PROGRAM("Discount Program"),
    @XmlEnumValue("Incentive Program")
    INCENTIVE_PROGRAM("Incentive Program"),
    @XmlEnumValue("Prepaid Program")
    PREPAID_PROGRAM("Prepaid Program");
    private final String value;

    ProgramTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProgramTypeCodeContentType fromValue(String v) {
        for (ProgramTypeCodeContentType c: ProgramTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
