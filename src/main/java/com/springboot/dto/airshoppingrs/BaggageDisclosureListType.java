
package com.springboot.dto.airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * List of Baggage Disclosure data referenced in this message document.
 * 
 * <p>Java class for BaggageDisclosureListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageDisclosureListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageDisclosureInfo" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}BaggageDisclosureType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageDisclosureListType", propOrder = {
    "baggageDisclosureInfo"
})
public class BaggageDisclosureListType {

    @XmlElement(name = "BaggageDisclosureInfo", required = true)
    protected List<BaggageDisclosureType> baggageDisclosureInfo;

    /**
     * Gets the value of the baggageDisclosureInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baggageDisclosureInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaggageDisclosureInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDisclosureType }
     * 
     * 
     */
    public List<BaggageDisclosureType> getBaggageDisclosureInfo() {
        if (baggageDisclosureInfo == null) {
            baggageDisclosureInfo = new ArrayList<BaggageDisclosureType>();
        }
        return this.baggageDisclosureInfo;
    }

}
