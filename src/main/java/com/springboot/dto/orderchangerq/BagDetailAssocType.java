
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Baggage Detail Association.
 * 
 * <p>Java class for BagDetailAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BagDetailAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BagDisclosureReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CheckedBagReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}CarryOnReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BagDetailAssocType", propOrder = {
    "bagDisclosureReferences",
    "checkedBagReferences",
    "carryOnReferences"
})
public class BagDetailAssocType {

    @XmlElement(name = "BagDisclosureReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> bagDisclosureReferences;
    @XmlElement(name = "CheckedBagReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> checkedBagReferences;
    @XmlElement(name = "CarryOnReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> carryOnReferences;

    /**
     * Gets the value of the bagDisclosureReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDisclosureReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosureReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBagDisclosureReferences() {
        if (bagDisclosureReferences == null) {
            bagDisclosureReferences = new ArrayList<String>();
        }
        return this.bagDisclosureReferences;
    }

    /**
     * Gets the value of the checkedBagReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the checkedBagReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCheckedBagReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCheckedBagReferences() {
        if (checkedBagReferences == null) {
            checkedBagReferences = new ArrayList<String>();
        }
        return this.checkedBagReferences;
    }

    /**
     * Gets the value of the carryOnReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carryOnReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarryOnReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarryOnReferences() {
        if (carryOnReferences == null) {
            carryOnReferences = new ArrayList<String>();
        }
        return this.carryOnReferences;
    }

}
