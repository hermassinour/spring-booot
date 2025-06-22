
package com.springboot.dto.orderreshoprq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Affinity search includes a wide range of criteria including generic origin/destination information, trip time periods, as well as travel budget.
 * 
 * <p>Java class for AffinityRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffinityRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BudgetAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="AffinityOriginDest" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}AffinityOriginDestType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="JourneyDistanceCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}JourneyDistanceCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="KeywordPreference" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}KeyValuePropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="JourneyDurationCriteria" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}JourneyDurationCriteriaType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRQ}ShoppingResponseType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffinityRequestType", propOrder = {
    "budgetAmount",
    "affinityOriginDest",
    "journeyDistanceCriteria",
    "keywordPreference",
    "journeyDurationCriteria",
    "shoppingResponse"
})
public class AffinityRequestType {

    @XmlElement(name = "BudgetAmount")
    protected AmountType budgetAmount;
    @XmlElement(name = "AffinityOriginDest", required = true)
    protected List<AffinityOriginDestType> affinityOriginDest;
    @XmlElement(name = "JourneyDistanceCriteria")
    protected JourneyDistanceCriteriaType journeyDistanceCriteria;
    @XmlElement(name = "KeywordPreference")
    protected List<KeyValuePropertyType> keywordPreference;
    @XmlElement(name = "JourneyDurationCriteria")
    protected JourneyDurationCriteriaType journeyDurationCriteria;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;

    /**
     * Gets the value of the budgetAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getBudgetAmount() {
        return budgetAmount;
    }

    /**
     * Sets the value of the budgetAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setBudgetAmount(AmountType value) {
        this.budgetAmount = value;
    }

    /**
     * Gets the value of the affinityOriginDest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the affinityOriginDest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAffinityOriginDest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AffinityOriginDestType }
     * 
     * 
     */
    public List<AffinityOriginDestType> getAffinityOriginDest() {
        if (affinityOriginDest == null) {
            affinityOriginDest = new ArrayList<AffinityOriginDestType>();
        }
        return this.affinityOriginDest;
    }

    /**
     * Gets the value of the journeyDistanceCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public JourneyDistanceCriteriaType getJourneyDistanceCriteria() {
        return journeyDistanceCriteria;
    }

    /**
     * Sets the value of the journeyDistanceCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDistanceCriteriaType }
     *     
     */
    public void setJourneyDistanceCriteria(JourneyDistanceCriteriaType value) {
        this.journeyDistanceCriteria = value;
    }

    /**
     * Gets the value of the keywordPreference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keywordPreference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeywordPreference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KeyValuePropertyType }
     * 
     * 
     */
    public List<KeyValuePropertyType> getKeywordPreference() {
        if (keywordPreference == null) {
            keywordPreference = new ArrayList<KeyValuePropertyType>();
        }
        return this.keywordPreference;
    }

    /**
     * Gets the value of the journeyDurationCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public JourneyDurationCriteriaType getJourneyDurationCriteria() {
        return journeyDurationCriteria;
    }

    /**
     * Sets the value of the journeyDurationCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link JourneyDurationCriteriaType }
     *     
     */
    public void setJourneyDurationCriteria(JourneyDurationCriteriaType value) {
        this.journeyDurationCriteria = value;
    }

    /**
     * Gets the value of the shoppingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseType }
     *     
     */
    public ShoppingResponseType getShoppingResponse() {
        return shoppingResponse;
    }

    /**
     * Sets the value of the shoppingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseType }
     *     
     */
    public void setShoppingResponse(ShoppingResponseType value) {
        this.shoppingResponse = value;
    }

}
