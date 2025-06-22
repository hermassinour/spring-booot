
package com.springboot.dto.airshoppingrs;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ServiceStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *     &lt;enumeration value="IN PROGRESS"/&gt;
 *     &lt;enumeration value="NOT CLAIMED"/&gt;
 *     &lt;enumeration value="REMOVED"/&gt;
 *     &lt;enumeration value="REQUESTED"/&gt;
 *     &lt;enumeration value="LOCKED"/&gt;
 *     &lt;enumeration value="DELIVERED"/&gt;
 *     &lt;enumeration value="FAILED TO DELIVER"/&gt;
 *     &lt;enumeration value="SUSPENDED"/&gt;
 *     &lt;enumeration value="READY TO DELIVER"/&gt;
 *     &lt;enumeration value="CONFIRMED"/&gt;
 *     &lt;enumeration value="READY TO PROCEED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ServiceStatusContentType")
@XmlEnum
public enum ServiceStatusContentType {


    /**
     * The service was delivered partially
     * 
     */
    EXPIRED("EXPIRED"),

    /**
     * Service delivery by delivery provider is in progress.
     * 
     */
    @XmlEnumValue("IN PROGRESS")
    IN_PROGRESS("IN PROGRESS"),

    /**
     * Customer did not claim the service delivery as expected by the Delivery Provider (e.g. no show).
     * 
     */
    @XmlEnumValue("NOT CLAIMED")
    NOT_CLAIMED("NOT CLAIMED"),

    /**
     * Service delivery successfully completed by the Delivery Provider to the passenger on-board.
     * 
     */
    REMOVED("REMOVED"),

    /**
     * Service is ready to be ordered from the Delivery Provider. (I.e. it has not been ordered as yet!).
     * 
     */
    REQUESTED("REQUESTED"),

    /**
     * Order Management system blocked the Delivery Provider from Delivering the Service previously Ordered or the Service Delivery was interrupted. The delivery may resume in the future.
     * 
     */
    LOCKED("LOCKED"),

    /**
     * Service delivery successfully completed by the Delivery Provider.
     * 
     */
    DELIVERED("DELIVERED"),

    /**
     * Delivery of the service failed. For example, the passenger was denied boarding.
     * 
     */
    @XmlEnumValue("FAILED TO DELIVER")
    FAILED_TO_DELIVER("FAILED TO DELIVER"),

    /**
     * Delivery provider was successfully informed about the service he has to deliver.
     * 
     */
    SUSPENDED("SUSPENDED"),

    /**
     * Provider is in a position to start delivery of the service.
     * 
     */
    @XmlEnumValue("READY TO DELIVER")
    READY_TO_DELIVER("READY TO DELIVER"),

    /**
     * Delivery provider (cabin crew) is in a position to start delivery of the Service.
     * 
     */
    CONFIRMED("CONFIRMED"),

    /**
     * Airline is in a position to start delivery of the Service, or in a position to allow a Delivery Provider to prepare the service
     * 
     */
    @XmlEnumValue("READY TO PROCEED")
    READY_TO_PROCEED("READY TO PROCEED");
    private final String value;

    ServiceStatusContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ServiceStatusContentType fromValue(String v) {
        for (ServiceStatusContentType c: ServiceStatusContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
