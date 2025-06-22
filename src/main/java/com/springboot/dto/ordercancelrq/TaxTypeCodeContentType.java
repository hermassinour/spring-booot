
package com.springboot.dto.ordercancelrq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="TaxTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Applied"/&gt;
 *     &lt;enumeration value="Exempt"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TaxTypeCodeContentType")
@XmlEnum
public enum TaxTypeCodeContentType {

    @XmlEnumValue("Applied")
    APPLIED("Applied"),
    @XmlEnumValue("Exempt")
    EXEMPT("Exempt");
    private final String value;

    TaxTypeCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TaxTypeCodeContentType fromValue(String v) {
        for (TaxTypeCodeContentType c: TaxTypeCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
