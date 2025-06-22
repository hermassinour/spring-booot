
package com.springboot.dto.seatavailabilityrs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeckCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DeckCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Upper"/&gt;
 *     &lt;enumeration value="Main"/&gt;
 *     &lt;enumeration value="Lower"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeckCodeContentType")
@XmlEnum
public enum DeckCodeContentType {


    /**
     * Upper Deck
     * 
     */
    @XmlEnumValue("Upper")
    UPPER("Upper"),

    /**
     * Main Deck
     * 
     */
    @XmlEnumValue("Main")
    MAIN("Main"),

    /**
     * Lower Deck
     * 
     */
    @XmlEnumValue("Lower")
    LOWER("Lower");
    private final String value;

    DeckCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeckCodeContentType fromValue(String v) {
        for (DeckCodeContentType c: DeckCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
