
package com.springboot.dto.orderreshoprs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * OfferPriceRS response information.
 * 
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChangeFees" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PenaltyType" minOccurs="0"/&gt;
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ItinReshopMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="OrderReshopProcessing" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ItinReshopProcessType" minOccurs="0"/&gt;
 *         &lt;element name="PaxGroup" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PaxGroupType" minOccurs="0"/&gt;
 *         &lt;element name="Payments" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}PaymentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReshopResults" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ReshopResultsType"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}ShoppingResponseType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", propOrder = {
    "changeFees",
    "commission",
    "dataLists",
    "metadata",
    "orderReshopProcessing",
    "paxGroup",
    "payments",
    "reshopResults",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "ChangeFees")
    protected PenaltyType changeFees;
    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected ItinReshopMetadataType metadata;
    @XmlElement(name = "OrderReshopProcessing")
    protected ItinReshopProcessType orderReshopProcessing;
    @XmlElement(name = "PaxGroup")
    protected PaxGroupType paxGroup;
    @XmlElement(name = "Payments")
    protected List<PaymentsType> payments;
    @XmlElement(name = "ReshopResults", required = true)
    protected ReshopResultsType reshopResults;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the changeFees property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyType }
     *     
     */
    public PenaltyType getChangeFees() {
        return changeFees;
    }

    /**
     * Sets the value of the changeFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyType }
     *     
     */
    public void setChangeFees(PenaltyType value) {
        this.changeFees = value;
    }

    /**
     * Gets the value of the commission property.
     * 
     * @return
     *     possible object is
     *     {@link CommissionType }
     *     
     */
    public CommissionType getCommission() {
        return commission;
    }

    /**
     * Sets the value of the commission property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommissionType }
     *     
     */
    public void setCommission(CommissionType value) {
        this.commission = value;
    }

    /**
     * Gets the value of the dataLists property.
     * 
     * @return
     *     possible object is
     *     {@link DataListsType }
     *     
     */
    public DataListsType getDataLists() {
        return dataLists;
    }

    /**
     * Sets the value of the dataLists property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataListsType }
     *     
     */
    public void setDataLists(DataListsType value) {
        this.dataLists = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopMetadataType }
     *     
     */
    public ItinReshopMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopMetadataType }
     *     
     */
    public void setMetadata(ItinReshopMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the orderReshopProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ItinReshopProcessType }
     *     
     */
    public ItinReshopProcessType getOrderReshopProcessing() {
        return orderReshopProcessing;
    }

    /**
     * Sets the value of the orderReshopProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItinReshopProcessType }
     *     
     */
    public void setOrderReshopProcessing(ItinReshopProcessType value) {
        this.orderReshopProcessing = value;
    }

    /**
     * Gets the value of the paxGroup property.
     * 
     * @return
     *     possible object is
     *     {@link PaxGroupType }
     *     
     */
    public PaxGroupType getPaxGroup() {
        return paxGroup;
    }

    /**
     * Sets the value of the paxGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaxGroupType }
     *     
     */
    public void setPaxGroup(PaxGroupType value) {
        this.paxGroup = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentsType }
     * 
     * 
     */
    public List<PaymentsType> getPayments() {
        if (payments == null) {
            payments = new ArrayList<PaymentsType>();
        }
        return this.payments;
    }

    /**
     * Gets the value of the reshopResults property.
     * 
     * @return
     *     possible object is
     *     {@link ReshopResultsType }
     *     
     */
    public ReshopResultsType getReshopResults() {
        return reshopResults;
    }

    /**
     * Sets the value of the reshopResults property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReshopResultsType }
     *     
     */
    public void setReshopResults(ReshopResultsType value) {
        this.reshopResults = value;
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

    /**
     * Gets the value of the warning property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warning property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarning().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarningType }
     * 
     * 
     */
    public List<WarningType> getWarning() {
        if (warning == null) {
            warning = new ArrayList<WarningType>();
        }
        return this.warning;
    }

}
