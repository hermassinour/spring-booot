
package com.springboot.dto.airshoppingrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRS}OfferPenaltyMetadata" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "offerPenaltyMetadata"
})
@XmlRootElement(name = "OfferPenaltyMetadatas")
public class OfferPenaltyMetadatas {

    @XmlElement(name = "OfferPenaltyMetadata", required = true)
    protected List<PenaltyMetadataType> offerPenaltyMetadata;

    /**
     * Gets the value of the offerPenaltyMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerPenaltyMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferPenaltyMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PenaltyMetadataType }
     * 
     * 
     */
    public List<PenaltyMetadataType> getOfferPenaltyMetadata() {
        if (offerPenaltyMetadata == null) {
            offerPenaltyMetadata = new ArrayList<PenaltyMetadataType>();
        }
        return this.offerPenaltyMetadata;
    }

}
