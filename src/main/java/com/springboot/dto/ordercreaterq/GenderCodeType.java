
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;


/**
 * Additional BDT to specify Gender code.
 * 
 * <p>Java class for GenderCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenderCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;GenderCodeContentType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenderCodeType", propOrder = {
    "value"
})
public class GenderCodeType {

    @XmlValue
    protected GenderCodeContentType value;

    /**
     * Enumeration set for Gender Code.
     *                 {codeListAgencyName}ICAO{/codeListAgencyName}
     *                 {codeListName}Document 9303 Sex of the holder{/codeListName}
     * 
     * @return
     *     possible object is
     *     {@link GenderCodeContentType }
     *     
     */
    public GenderCodeContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCodeContentType }
     *     
     */
    public void setValue(GenderCodeContentType value) {
        this.value = value;
    }

}
