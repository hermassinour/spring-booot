
package com.springboot.dto.seatavailabilityrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A data type definition for Augmentation Point Definition and List.
 * 
 * <p>Java class for AugPointInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugPointInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AugPoint" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}AugPointType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Lists" type="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}AugPointListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugPointInfoType", propOrder = {
    "augPoint",
    "lists"
})
public class AugPointInfoType {

    @XmlElement(name = "AugPoint", required = true)
    protected List<AugPointType> augPoint;
    @XmlElement(name = "Lists")
    protected AugPointListType lists;

    /**
     * Gets the value of the augPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the augPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAugPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugPointType }
     * 
     * 
     */
    public List<AugPointType> getAugPoint() {
        if (augPoint == null) {
            augPoint = new ArrayList<AugPointType>();
        }
        return this.augPoint;
    }

    /**
     * Gets the value of the lists property.
     * 
     * @return
     *     possible object is
     *     {@link AugPointListType }
     *     
     */
    public AugPointListType getLists() {
        return lists;
    }

    /**
     * Sets the value of the lists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointListType }
     *     
     */
    public void setLists(AugPointListType value) {
        this.lists = value;
    }

}
