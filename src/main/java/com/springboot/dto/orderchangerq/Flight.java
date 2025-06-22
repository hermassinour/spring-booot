
package com.springboot.dto.orderchangerq;

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
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}FlightMetadatas"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ItineraryMetadata"/&gt;
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
    "flightMetadatasOrItineraryMetadata"
})
@XmlRootElement(name = "Flight")
public class Flight {

    @XmlElements({
        @XmlElement(name = "FlightMetadatas", type = FlightMetadatas.class),
        @XmlElement(name = "ItineraryMetadata", type = ItineraryMetadataType.class)
    })
    protected List<Object> flightMetadatasOrItineraryMetadata;

    /**
     * Gets the value of the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightMetadatasOrItineraryMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightMetadatasOrItineraryMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightMetadatas }
     * {@link ItineraryMetadataType }
     * 
     * 
     */
    public List<Object> getFlightMetadatasOrItineraryMetadata() {
        if (flightMetadatasOrItineraryMetadata == null) {
            flightMetadatasOrItineraryMetadata = new ArrayList<Object>();
        }
        return this.flightMetadatasOrItineraryMetadata;
    }

}
