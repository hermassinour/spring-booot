
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderItemStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OrderItemStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NOT ENTITLED"/&gt;
 *     &lt;enumeration value="ENTITLED"/&gt;
 *     &lt;enumeration value="CANCELLED BY CUSTOMER"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderItemStatusContentType")
@XmlEnum
public enum OrderItemStatusContentType {


    /**
     * Customer is not entitled to receive the Order Item until certain conditions are met.
     * 
     */
    @XmlEnumValue("NOT ENTITLED")
    NOT_ENTITLED("NOT ENTITLED"),

    /**
     * Customer is entitled to receive the Order Item.
     * 
     */
    ENTITLED("ENTITLED"),

    /**
     * The Order Item reservation is cancelled by the Customer.
     * 
     */
    @XmlEnumValue("CANCELLED BY CUSTOMER")
    CANCELLED_BY_CUSTOMER("CANCELLED BY CUSTOMER");
    private final String value;

    OrderItemStatusContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OrderItemStatusContentType fromValue(String v) {
        for (OrderItemStatusContentType c: OrderItemStatusContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
