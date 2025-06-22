
package com.springboot.dto.servicelistrs;

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
 *         &lt;element name="OfferExpirationDateTime" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="ALaCarteOffer" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ALaCarteOfferType" minOccurs="0"/&gt;
 *         &lt;element name="DataLists" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}DataListsType" minOccurs="0"/&gt;
 *         &lt;element name="Metadata" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}SrvListResMetadataType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseParameters" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ResponseParametersType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceListProcessing" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ProcessingResultType" minOccurs="0"/&gt;
 *         &lt;element name="ShoppingResponse" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}ShoppingResponseType" minOccurs="0"/&gt;
 *         &lt;element name="Warning" type="{http://www.iata.org/IATA/2015/00/2018.1/ServiceListRS}WarningType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "offerExpirationDateTime",
    "aLaCarteOffer",
    "dataLists",
    "metadata",
    "responseParameters",
    "serviceListProcessing",
    "shoppingResponse",
    "warning"
})
public class ResponseType {

    @XmlElement(name = "OfferExpirationDateTime")
    protected DateTimeType offerExpirationDateTime;
    @XmlElement(name = "ALaCarteOffer")
    protected ALaCarteOfferType aLaCarteOffer;
    @XmlElement(name = "DataLists")
    protected DataListsType dataLists;
    @XmlElement(name = "Metadata")
    protected SrvListResMetadataType metadata;
    @XmlElement(name = "ResponseParameters")
    protected ResponseParametersType responseParameters;
    @XmlElement(name = "ServiceListProcessing")
    protected ProcessingResultType serviceListProcessing;
    @XmlElement(name = "ShoppingResponse")
    protected ShoppingResponseType shoppingResponse;
    @XmlElement(name = "Warning")
    protected List<WarningType> warning;

    /**
     * Gets the value of the offerExpirationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimeType }
     *     
     */
    public DateTimeType getOfferExpirationDateTime() {
        return offerExpirationDateTime;
    }

    /**
     * Sets the value of the offerExpirationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeType }
     *     
     */
    public void setOfferExpirationDateTime(DateTimeType value) {
        this.offerExpirationDateTime = value;
    }

    /**
     * Gets the value of the aLaCarteOffer property.
     * 
     * @return
     *     possible object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public ALaCarteOfferType getALaCarteOffer() {
        return aLaCarteOffer;
    }

    /**
     * Sets the value of the aLaCarteOffer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALaCarteOfferType }
     *     
     */
    public void setALaCarteOffer(ALaCarteOfferType value) {
        this.aLaCarteOffer = value;
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
     *     {@link SrvListResMetadataType }
     *     
     */
    public SrvListResMetadataType getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SrvListResMetadataType }
     *     
     */
    public void setMetadata(SrvListResMetadataType value) {
        this.metadata = value;
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
     * Gets the value of the serviceListProcessing property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessingResultType }
     *     
     */
    public ProcessingResultType getServiceListProcessing() {
        return serviceListProcessing;
    }

    /**
     * Sets the value of the serviceListProcessing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessingResultType }
     *     
     */
    public void setServiceListProcessing(ProcessingResultType value) {
        this.serviceListProcessing = value;
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
