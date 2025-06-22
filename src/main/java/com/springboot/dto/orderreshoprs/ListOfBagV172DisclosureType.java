
package com.springboot.dto.orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Select a value from the enumerated list or enter a string value.
 *  =enumerated values=
 * N = NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
 * Y = SUBJECT TO US DOT RESERVATION AND DISCLOSURE
 * D = SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
 * 
 * <p>Java class for ListOfBagV172_DisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfBagV172_DisclosureType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BagDisclosure" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="BagRule" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BagDiscloseRuleSimpleType"/&gt;
 *                   &lt;element name="Descriptions" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Descriptions" minOccurs="0"/&gt;
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DataListObjAttrGroup"/&gt;
 *                 &lt;attribute name="CheckInTFC_ApplicableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
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
@XmlType(name = "ListOfBagV172_DisclosureType", propOrder = {
    "bagDisclosure"
})
public class ListOfBagV172DisclosureType {

    @XmlElement(name = "BagDisclosure", required = true)
    protected List<ListOfBagV172DisclosureType.BagDisclosure> bagDisclosure;

    /**
     * Gets the value of the bagDisclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDisclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfBagV172DisclosureType.BagDisclosure }
     * 
     * 
     */
    public List<ListOfBagV172DisclosureType.BagDisclosure> getBagDisclosure() {
        if (bagDisclosure == null) {
            bagDisclosure = new ArrayList<ListOfBagV172DisclosureType.BagDisclosure>();
        }
        return this.bagDisclosure;
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
     *         &lt;element name="BagRule" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BagDiscloseRuleSimpleType"/&gt;
     *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}Descriptions" minOccurs="0"/&gt;
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}BaggageDeterminingCarrierType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DataListObjAttrGroup"/&gt;
     *       &lt;attribute name="CheckInTFC_ApplicableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bagRule",
        "descriptions",
        "baggageDeterminingCarrier"
    })
    public static class BagDisclosure {

        @XmlElement(name = "BagRule", required = true)
        protected String bagRule;
        @XmlElement(name = "Descriptions")
        protected Descriptions descriptions;
        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlAttribute(name = "CheckInTFC_ApplicableInd")
        protected Boolean checkInTFCApplicableInd;
        @XmlAttribute(name = "DeferralInd")
        protected Boolean deferralInd;
        @XmlAttribute(name = "CommercialAgreementID")
        protected String commercialAgreementID;
        @XmlAttribute(name = "FixedPrePaidInd")
        protected Boolean fixedPrePaidInd;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String listKey;

        /**
         * Gets the value of the bagRule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBagRule() {
            return bagRule;
        }

        /**
         * Sets the value of the bagRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBagRule(String value) {
            this.bagRule = value;
        }

        /**
         * Gets the value of the descriptions property.
         * 
         * @return
         *     possible object is
         *     {@link Descriptions }
         *     
         */
        public Descriptions getDescriptions() {
            return descriptions;
        }

        /**
         * Sets the value of the descriptions property.
         * 
         * @param value
         *     allowed object is
         *     {@link Descriptions }
         *     
         */
        public void setDescriptions(Descriptions value) {
            this.descriptions = value;
        }

        /**
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the checkInTFCApplicableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckInTFCApplicableInd() {
            return checkInTFCApplicableInd;
        }

        /**
         * Sets the value of the checkInTFCApplicableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckInTFCApplicableInd(Boolean value) {
            this.checkInTFCApplicableInd = value;
        }

        /**
         * Gets the value of the deferralInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeferralInd() {
            return deferralInd;
        }

        /**
         * Sets the value of the deferralInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDeferralInd(Boolean value) {
            this.deferralInd = value;
        }

        /**
         * Gets the value of the commercialAgreementID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommercialAgreementID() {
            return commercialAgreementID;
        }

        /**
         * Sets the value of the commercialAgreementID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommercialAgreementID(String value) {
            this.commercialAgreementID = value;
        }

        /**
         * Gets the value of the fixedPrePaidInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFixedPrePaidInd() {
            return fixedPrePaidInd;
        }

        /**
         * Sets the value of the fixedPrePaidInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFixedPrePaidInd(Boolean value) {
            this.fixedPrePaidInd = value;
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

        /**
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

    }

}
