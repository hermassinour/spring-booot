
package com.springboot.dto.offerpricers;

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
 *         &lt;element name="Commission" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CommissionType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}FltPriceResMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="OtherOffers" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}OtherOffersType" minOccurs="0"/&gt;
 *         &lt;element name="Payments" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PaymentsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PricedOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PricedOfferType"/&gt;
 *         &lt;element name="Processing" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ProcessingResultType" minOccurs="0"/&gt;
 *         &lt;element name="Promotions" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}PromotionsType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ResponseParametersType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ShoppingResponseType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "commission",
    "dataLists",
    "metadata",
    "otherOffers",
    "payments",
    "pricedOffer",
    "processing",
    "promotions",
    "responseParameters",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "Commission")
    protected CommissionType commission;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected FltPriceResMetadataType metadata;
    @XmlElement(name = "OtherOffers")
    protected OtherOffersType otherOffers;
    @XmlElement(name = "Payments")
    protected List<PaymentsType> payments;
    @XmlElement(name = "PricedOffer", required = true)
    protected PricedOfferType pricedOffer;
    @XmlElement(name = "Processing")
    protected ProcessingResultType processing;
    @XmlElement(name = "Promotions")
    protected PromotionsType promotions;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

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
     *     {@link FltPriceResMetadataType }
     *     
     */
    public FltPriceResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link FltPriceResMetadataType }
     *     
     */
    public void setMetadata(FltPriceResMetadataType value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the otherOffers property.
     * 
     * @return
     *     possible object is
     *     {@link OtherOffersType }
     *     
     */
    public OtherOffersType getOtherOffers() {
        return otherOffers;
    }

    /**
     * Sets the value of the otherOffers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherOffersType }
     *     
     */
    public void setOtherOffers(OtherOffersType value) {
        this.otherOffers = value;
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
     * Gets the value of the pricedOffer property.
     * 
     * @return
     *     possible object is
     *     {@link PricedOfferType }
     *     
     */
    public PricedOfferType getPricedOffer() {
        return pricedOffer;
    }

    /**
     * Sets the value of the pricedOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricedOfferType }
     *     
     */
    public void setPricedOffer(PricedOfferType value) {
        this.pricedOffer = value;
    }

    /**
     * Gets the value of the processing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultType }
     *     
     */
    public ProcessingResultType getProcessing() {
        return processing;
    }

    /**
     * Sets the value of the processing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultType }
     *     
     */
    public void setProcessing(ProcessingResultType value) {
        this.processing = value;
    }

    /**
     * Gets the value of the promotions property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionsType }
     *     
     */
    public PromotionsType getPromotions() {
        return promotions;
    }

    /**
     * Sets the value of the promotions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionsType }
     *     
     */
    public void setPromotions(PromotionsType value) {
        this.promotions = value;
    }

    /**
     * Gets the value of the responseParameters property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseParametersType }
     *     
     */
    public ResponseParametersType getResponseParameters() {
        return responseParameters;
    }

    /**
     * Sets the value of the responseParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseParametersType }
     *     
     */
    public void setResponseParameters(ResponseParametersType value) {
        this.responseParameters = value;
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
