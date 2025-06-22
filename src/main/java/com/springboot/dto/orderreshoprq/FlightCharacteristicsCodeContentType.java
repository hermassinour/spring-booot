
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlightCharacteristicsCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="FlightCharacteristicsCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AirportChange"/&gt;
 *     &lt;enumeration value="Direct"/&gt;
 *     &lt;enumeration value="NonStop"/&gt;
 *     &lt;enumeration value="OvernightStop"/&gt;
 *     &lt;enumeration value="RedEye"/&gt;
 *     &lt;enumeration value="WaitList"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "FlightCharacteristicsCodeContentType")
@XmlEnum
public enum FlightCharacteristicsCodeContentType {

    @XmlEnumValue("AirportChange")
    AIRPORT_CHANGE("AirportChange"),
    @XmlEnumValue("Direct")
    DIRECT("Direct"),
    @XmlEnumValue("NonStop")
    NON_STOP("NonStop"),
    @XmlEnumValue("OvernightStop")
    OVERNIGHT_STOP("OvernightStop"),
    @XmlEnumValue("RedEye")
    RED_EYE("RedEye"),
    @XmlEnumValue("WaitList")
    WAIT_LIST("WaitList");
    private final String value;

    FlightCharacteristicsCodeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FlightCharacteristicsCodeContentType fromValue(String v) {
        for (FlightCharacteristicsCodeContentType c: FlightCharacteristicsCodeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
