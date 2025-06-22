
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ISO 3166-2 Country Sub-Division Code.  Max-3-char sub-division code without preceding country code.  E.g. 'AZ' for Arizona, 'BY' for Bavaria region in Germany.
 * 
 * <p>Java class for CountrySubDivisionCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CountrySubDivisionCodeType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ&gt;CountrySubDivisionCodeContentType"&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountrySubDivisionCodeType", propOrder = {
    "value"
})
public class CountrySubDivisionCodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;

    /**
     * The list of Country Sub-Division Codes in ISO 3166-2, or referenced from ISO 3166-2 for the specific countries. Max-3-char sub-division code without preceding country code.
     *                 {codeListAgencyName}ISO{/codeListAgencyName}
     *                 {codeListName}3166-2 Country Subdivision Codes{/codeListName}
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

}
