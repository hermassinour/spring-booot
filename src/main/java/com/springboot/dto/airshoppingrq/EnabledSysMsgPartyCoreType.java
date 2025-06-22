
package com.springboot.dto.airshoppingrq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type for NDC-ENABLED SYSTEM Message Party Representation.
 * 
 * Notes:
 *  1. Derived from V172_EnabledSystemType.
 * 
 * <p>Java class for EnabledSysMsgPartyCoreType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnabledSysMsgPartyCoreType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}V172_EnabledSystemType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnabledSysMsgPartyCoreType")
@XmlSeeAlso({
    EnabledSysSenderType.class,
    EnabledSysRecipientType.class,
    EnabledSysParticipantType.class
})
public class EnabledSysMsgPartyCoreType
    extends V172EnabledSystemType
{


}
