
package com.springboot.dto.ordercreaterq;

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
 * For service bundle selection - only to be used for bundles with optional choices (e.g. pick 2 out of 4)
 * 
 * <p>Java class for SelectedBundleServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectedBundleServicesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectedServiceID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type"/&gt;
 *         &lt;element name="SelectedServiceDefinitionID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}ID_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectedBundleServicesType", propOrder = {
    "selectedServiceID",
    "selectedServiceDefinitionID"
})
public class SelectedBundleServicesType {

    @XmlElement(name = "SelectedServiceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String selectedServiceID;
    @XmlElement(name = "SelectedServiceDefinitionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> selectedServiceDefinitionID;

    /**
     * Gets the value of the selectedServiceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectedServiceID() {
        return selectedServiceID;
    }

    /**
     * Sets the value of the selectedServiceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectedServiceID(String value) {
        this.selectedServiceID = value;
    }

    /**
     * Gets the value of the selectedServiceDefinitionID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedServiceDefinitionID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedServiceDefinitionID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSelectedServiceDefinitionID() {
        if (selectedServiceDefinitionID == null) {
            selectedServiceDefinitionID = new ArrayList<String>();
        }
        return this.selectedServiceDefinitionID;
    }

}
