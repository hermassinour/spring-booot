
package com.springboot.dto.airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CheckedBagMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CarryOnBagMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BaggageDisclosureMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BaggageDetailMetadata"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}BaggageQueryMetadata"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas"
})
@XmlRootElement(name = "Baggage")
public class Baggage {

    @XmlElements({
        @XmlElement(name = "CheckedBagMetadatas", type = CheckedBagMetadatas.class),
        @XmlElement(name = "CarryOnBagMetadatas", type = CarryOnBagMetadatas.class),
        @XmlElement(name = "BaggageDisclosureMetadatas", type = BaggageDisclosureMetadatas.class),
        @XmlElement(name = "BaggageDetailMetadata", type = BaggageDetailMetadataType.class),
        @XmlElement(name = "BaggageQueryMetadata", type = BaggageQueryMetadataType.class)
    })
    protected List<Object> checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas;

    /**
     * Gets the value of the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggageDetailMetadataType }
     * {@link BaggageDisclosureMetadatas }
     * {@link BaggageQueryMetadataType }
     * {@link CarryOnBagMetadatas }
     * {@link CheckedBagMetadatas }
     * 
     * 
     */
    public List<Object> getCheckedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas() {
        if (checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas == null) {
            checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas = new ArrayList<Object>();
        }
        return this.checkedBagMetadatasOrCarryOnBagMetadatasOrBaggageDisclosureMetadatas;
    }

}
