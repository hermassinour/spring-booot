
package com.springboot.dto.offerpricerq;

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
 * Offer-Associated Optional Services definition.
 * 
 * <p>Java class for ServiceInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInfoAssocType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}BundleReference"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRQ}ServiceReferences" maxOccurs="unbounded"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceInfoAssocType", propOrder = {
    "bundleReference",
    "serviceReferences"
})
public class ServiceInfoAssocType {

    @XmlElement(name = "BundleReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String bundleReference;
    @XmlElement(name = "ServiceReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> serviceReferences;

    /**
     * Gets the value of the bundleReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleReference() {
        return bundleReference;
    }

    /**
     * Sets the value of the bundleReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleReference(String value) {
        this.bundleReference = value;
    }

    /**
     * Gets the value of the serviceReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceReferences() {
        if (serviceReferences == null) {
            serviceReferences = new ArrayList<String>();
        }
        return this.serviceReferences;
    }

}
