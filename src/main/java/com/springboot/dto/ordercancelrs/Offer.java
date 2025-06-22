
package com.springboot.dto.ordercancelrs;

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
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}DisclosureMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OfferMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OfferInstructionMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OfferPenaltyMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}OfferTermsMetadatas"/&gt;
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
    "disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas"
})
@XmlRootElement(name = "Offer")
public class Offer {

    @XmlElements({
        @XmlElement(name = "DisclosureMetadatas", type = DisclosureMetadatas.class),
        @XmlElement(name = "OfferMetadatas", type = OfferMetadatas.class),
        @XmlElement(name = "OfferInstructionMetadatas", type = OfferInstructionMetadatas.class),
        @XmlElement(name = "OfferPenaltyMetadatas", type = OfferPenaltyMetadatas.class),
        @XmlElement(name = "OfferTermsMetadatas", type = OfferTermsMetadatas.class)
    })
    protected List<Object> disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas;

    /**
     * Gets the value of the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DisclosureMetadatas }
     * {@link OfferInstructionMetadatas }
     * {@link OfferMetadatas }
     * {@link OfferPenaltyMetadatas }
     * {@link OfferTermsMetadatas }
     * 
     * 
     */
    public List<Object> getDisclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas() {
        if (disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas == null) {
            disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas = new ArrayList<Object>();
        }
        return this.disclosureMetadatasOrOfferMetadatasOrOfferInstructionMetadatas;
    }

}
