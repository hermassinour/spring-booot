
package com.springboot.dto.seatavailabilityrs;

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
 *         &lt;element name="Policy" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PolicyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}DefaultPolicy"/&gt;
 *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PolicyAugmentation"/&gt;
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
    "policy"
})
@XmlRootElement(name = "Policies")
public class Policies {

    @XmlElement(name = "Policy", required = true)
    protected List<Policies.Policy> policy;

    /**
     * Gets the value of the policy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the policy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Policies.Policy }
     * 
     * 
     */
    public List<Policies.Policy> getPolicy() {
        if (policy == null) {
            policy = new ArrayList<Policies.Policy>();
        }
        return this.policy;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PolicyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}DefaultPolicy"/&gt;
     *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/SeatAvailabilityRS}PolicyAugmentation"/&gt;
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
        "defaultPolicy",
        "policyAugmentation"
    })
    public static class Policy
        extends PolicyType
    {

        @XmlElement(name = "DefaultPolicy", required = true)
        protected PolicyDefaultType defaultPolicy;
        @XmlElement(name = "PolicyAugmentation", required = true)
        protected PolicyAugmentationType policyAugmentation;

        /**
         * Gets the value of the defaultPolicy property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyDefaultType }
         *     
         */
        public PolicyDefaultType getDefaultPolicy() {
            return defaultPolicy;
        }

        /**
         * Sets the value of the defaultPolicy property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyDefaultType }
         *     
         */
        public void setDefaultPolicy(PolicyDefaultType value) {
            this.defaultPolicy = value;
        }

        /**
         * Gets the value of the policyAugmentation property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyAugmentationType }
         *     
         */
        public PolicyAugmentationType getPolicyAugmentation() {
            return policyAugmentation;
        }

        /**
         * Sets the value of the policyAugmentation property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyAugmentationType }
         *     
         */
        public void setPolicyAugmentation(PolicyAugmentationType value) {
            this.policyAugmentation = value;
        }

    }

}
