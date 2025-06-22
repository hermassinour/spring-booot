
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * AIRCRAFT EQUIPMENT CODE QUERY representation.
 * 
 * <p>Java class for AircraftCodeQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AircraftCodeQueryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}AircraftCode" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AircraftCodeQueryType", propOrder = {
    "aircraftCode"
})
@XmlSeeAlso({
    com.springboot.dto.orderchangerq.FlightPreferencesType.Aircraft.Equipment.class
})
public class AircraftCodeQueryType {

    @XmlElement(name = "AircraftCode", required = true)
    protected List<AircraftCode> aircraftCode;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * The IATA aircraft type 3 character code; use SSIM Appendix A. Example:318.Gets the value of the aircraftCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aircraftCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAircraftCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AircraftCode }
     * 
     * 
     */
    public List<AircraftCode> getAircraftCode() {
        if (aircraftCode == null) {
            aircraftCode = new ArrayList<AircraftCode>();
        }
        return this.aircraftCode;
    }

    /**
     * Gets the value of the refs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefs() {
        return refs;
    }

    /**
     * Sets the value of the refs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefs(String value) {
        this.refs = value;
    }

}
