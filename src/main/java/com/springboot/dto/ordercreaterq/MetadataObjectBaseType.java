
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Base type for NDC Metadata Representation.
 * 
 * Notes: Within NDC, metadata is defined as data about data. This may include information such as the security of a piece of data or the source of the data. These pieces of metadata may be composed into a metadata type. The types of data to which metadata may be applied may be constrained.
 * 
 * <p>Java class for MetadataObjectBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MetadataObjectBaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}AugmentationPoint" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="refs" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}InstanceClassRefSimpleType" /&gt;
 *       &lt;attribute name="MetadataKey" use="required" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MetadataObjectBaseType", propOrder = {
    "augmentationPoint"
})
@XmlSeeAlso({
    AddressMetadataType.class,
    AircraftMetadataType.class,
    AirportMetadataType.class,
    CityMetadataType.class,
    CodesetMetadataType.class,
    ContactMetadataType.class,
    ContentMetadataType.class,
    CountryMetadataType.class,
    DescriptionMetadataType.class,
    EquivalentIDMetadataType.class,
    LanguageMetadataType.class,
    MediaMetadataType.class,
    PaymentFormMetadataType.class,
    PriceMetadataType.class,
    RuleMetadataType.class,
    StateProvMetadataType.class,
    ZoneMetadataType.class,
    BaggageCheckedMetadataType.class,
    BaggageCarryOnMetadataType.class,
    BaggageDisclosureMetadataType.class,
    BaggageDetailMetadataType.class,
    BaggageQueryMetadataType.class,
    ItineraryMetadataType.class,
    DirectionsMetadataType.class,
    DisclosureMetadataType.class,
    OfferItemMetadataType.class,
    OfferInstructionMetadataType.class,
    PenaltyMetadataType.class,
    OfferTermsMetadataType.class,
    SeatMetadataType.class,
    SeatMapMetadataType.class,
    PassengerMetadataType.class,
    FlightMetadataType.class,
    CurrencyMetadataType.class
})
public class MetadataObjectBaseType {

    @XmlElement(name = "AugmentationPoint")
    protected AugPointInfoType augmentationPoint;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;
    @XmlAttribute(name = "MetadataKey", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String metadataKey;

    /**
     * Augmentation Point for this Metadata Structure.
     * 
     * @return
     *     possible object is
     *     {@link AugPointInfoType }
     *     
     */
    public AugPointInfoType getAugmentationPoint() {
        return augmentationPoint;
    }

    /**
     * Sets the value of the augmentationPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointInfoType }
     *     
     */
    public void setAugmentationPoint(AugPointInfoType value) {
        this.augmentationPoint = value;
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
     * Gets the value of the metadataKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetadataKey() {
        return metadataKey;
    }

    /**
     * Sets the value of the metadataKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetadataKey(String value) {
        this.metadataKey = value;
    }

}
