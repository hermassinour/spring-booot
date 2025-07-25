
package com.springboot.dto.orderchangerq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * SERVICE COMBINATION RULES representation.
 * 
 * <p>Java class for ServiceCombinationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceCombinationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Combination" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Rule" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SrvcCombineRuleSimpleType"/&gt;
 *                   &lt;choice&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceID" maxOccurs="unbounded"/&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceReference" maxOccurs="unbounded"/&gt;
 *                   &lt;/choice&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "ServiceCombinationType", propOrder = {
    "combination"
})
@XmlSeeAlso({
    ServiceCombinations.class
})
public class ServiceCombinationType {

    @XmlElement(name = "Combination", required = true)
    protected List<ServiceCombinationType.Combination> combination;

    /**
     * Gets the value of the combination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceCombinationType.Combination }
     * 
     * 
     */
    public List<ServiceCombinationType.Combination> getCombination() {
        if (combination == null) {
            combination = new ArrayList<ServiceCombinationType.Combination>();
        }
        return this.combination;
    }


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
     *         &lt;element name="Rule" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}SrvcCombineRuleSimpleType"/&gt;
     *         &lt;choice&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceID" maxOccurs="unbounded"/&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ServiceReference" maxOccurs="unbounded"/&gt;
     *         &lt;/choice&gt;
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
        "rule",
        "serviceID",
        "serviceReference"
    })
    public static class Combination {

        @XmlElement(name = "Rule", required = true)
        protected String rule;
        @XmlElement(name = "ServiceID")
        protected List<ServiceIDType> serviceID;
        @XmlElement(name = "ServiceReference")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected List<String> serviceReference;

        /**
         * Gets the value of the rule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRule() {
            return rule;
        }

        /**
         * Sets the value of the rule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRule(String value) {
            this.rule = value;
        }

        /**
         * Gets the value of the serviceID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServiceIDType }
         * 
         * 
         */
        public List<ServiceIDType> getServiceID() {
            if (serviceID == null) {
                serviceID = new ArrayList<ServiceIDType>();
            }
            return this.serviceID;
        }

        /**
         * Gets the value of the serviceReference property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the serviceReference property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getServiceReference().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getServiceReference() {
            if (serviceReference == null) {
                serviceReference = new ArrayList<String>();
            }
            return this.serviceReference;
        }

    }

}
