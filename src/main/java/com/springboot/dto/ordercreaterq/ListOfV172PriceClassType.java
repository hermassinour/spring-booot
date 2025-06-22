
package com.springboot.dto.ordercreaterq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * PRICE CLASS data list definition.
 * 
 * <p>Java class for ListOfV172_PriceClassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfV172_PriceClassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PriceClass" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}V172_PriceClassType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListOfV172_PriceClassType", propOrder = {
    "priceClass"
})
public class ListOfV172PriceClassType {

    @XmlElement(name = "PriceClass", required = true)
    protected List<V172PriceClassType> priceClass;

    /**
     * Gets the value of the priceClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link V172PriceClassType }
     * 
     * 
     */
    public List<V172PriceClassType> getPriceClass() {
        if (priceClass == null) {
            priceClass = new ArrayList<V172PriceClassType>();
        }
        return this.priceClass;
    }

}
