
package com.springboot.dto.orderreshoprs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OwnerTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORA"/&gt;
 *     &lt;enumeration value="POA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OwnerTypeContentType")
@XmlEnum
public enum OwnerTypeContentType {

    ORA,
    POA;

    public String value() {
        return name();
    }

    public static OwnerTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
