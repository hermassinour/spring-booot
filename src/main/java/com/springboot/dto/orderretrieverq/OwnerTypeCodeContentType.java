
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OwnerTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OwnerTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ORA"/&gt;
 *     &lt;enumeration value="POA"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OwnerTypeCodeContentType")
@XmlEnum
public enum OwnerTypeCodeContentType {


    /**
     * Offer Responsible Airline
     * 
     */
    ORA,

    /**
     * Participating Offer Airline
     * 
     */
    POA;

    public String value() {
        return name();
    }

    public static OwnerTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
