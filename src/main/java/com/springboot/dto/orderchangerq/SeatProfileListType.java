
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Seat Profile data list definition.
 * 
 * <p>Java class for SeatProfileListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatProfileListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatProfile" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SeatProfileType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatProfileListType", propOrder = {
    "seatProfile"
})
public class SeatProfileListType {

    @XmlElement(name = "SeatProfile", required = true)
    protected List<SeatProfileType> seatProfile;

    /**
     * Gets the value of the seatProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SeatProfileType }
     * 
     * 
     */
    public List<SeatProfileType> getSeatProfile() {
        if (seatProfile == null) {
            seatProfile = new ArrayList<SeatProfileType>();
        }
        return this.seatProfile;
    }

}
