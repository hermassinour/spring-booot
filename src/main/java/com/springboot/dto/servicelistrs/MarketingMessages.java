
package com.springboot.dto.servicelistrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence&gt;
 *         &lt;element name="MarketMessage" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DescriptionType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}MultiAssociationType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "marketMessage"
})
@XmlRootElement(name = "MarketingMessages")
public class MarketingMessages {

    @XmlElement(name = "MarketMessage", required = true)
    protected List<MarketingMessages.MarketMessage> marketMessage;

    /**
     * Gets the value of the marketMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marketMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarketMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarketingMessages.MarketMessage }
     * 
     * 
     */
    public List<MarketingMessages.MarketMessage> getMarketMessage() {
        if (marketMessage == null) {
            marketMessage = new ArrayList<MarketingMessages.MarketMessage>();
        }
        return this.marketMessage;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DescriptionType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Associations" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}MultiAssociationType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "associations"
    })
    public static class MarketMessage
        extends DescriptionType
    {

        @XmlElement(name = "Associations")
        protected MultiAssociationType associations;

        /**
         * Gets the value of the associations property.
         * 
         * @return
         *     possible object is
         *     {@link MultiAssociationType }
         *     
         */
        public MultiAssociationType getAssociations() {
            return associations;
        }

        /**
         * Sets the value of the associations property.
         * 
         * @param value
         *     allowed object is
         *     {@link MultiAssociationType }
         *     
         */
        public void setAssociations(MultiAssociationType value) {
            this.associations = value;
        }

    }

}
