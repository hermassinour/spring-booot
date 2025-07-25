
package com.springboot.dto.orderreshoprq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * ORDER PROCESSING RESULTS Information definition.
 * 
 * <p>Java class for OrderProcessResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProcessResultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}MarketingMessages" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProcessResultType", propOrder = {
    "marketingMessages"
})
@XmlSeeAlso({
    OrderViewProcessType.class,
    OrdViewProcessType.class,
    OrdCancelProcessType.class,
    ItinReshopProcessType.class,
    OrderListProcessType.class
})
public class OrderProcessResultType {

    @XmlElement(name = "MarketingMessages")
    protected MarketingMessages marketingMessages;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the marketingMessages property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingMessages }
     *     
     */
    public MarketingMessages getMarketingMessages() {
        return marketingMessages;
    }

    /**
     * Sets the value of the marketingMessages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingMessages }
     *     
     */
    public void setMarketingMessages(MarketingMessages value) {
        this.marketingMessages = value;
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
