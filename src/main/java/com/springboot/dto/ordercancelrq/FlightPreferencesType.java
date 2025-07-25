
package com.springboot.dto.ordercancelrq;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A data type for Flight Preferences.
 * 
 * <p>Java class for FlightPreferencesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlightPreferencesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Aircraft" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Equipment" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftCodeQueryType"&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;choice&gt;
 *                     &lt;element name="Cabins" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Cabin" maxOccurs="unbounded"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;simpleContent&gt;
 *                                     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
 *                                       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/simpleContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="Classes" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Class" maxOccurs="unbounded"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;simpleContent&gt;
 *                                     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                                       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/simpleContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/choice&gt;
 *                   &lt;element name="Seats" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Characteristic" maxOccurs="unbounded"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Position" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="SeatRowNmber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Rows" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Feature" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Number" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
 *                                     &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Features" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftFeaturesQueryType" minOccurs="0"/&gt;
 *                   &lt;element name="TailNumbers" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftTailNmbrQueryType" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Characteristic" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NonStopPreferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
 *                           &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DirectPreferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
 *                           &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="OvernightStopPreferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
 *                           &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="AirportChangePreferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
 *                           &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RedEyePreferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
 *                           &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="WaitListing" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="WaitListPreferences" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
 *                           &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightPreferencesType", propOrder = {
    "aircraft",
    "characteristic",
    "waitListing"
})
public class FlightPreferencesType {

    @XmlElement(name = "Aircraft")
    protected FlightPreferencesType.Aircraft aircraft;
    @XmlElement(name = "Characteristic")
    protected FlightPreferencesType.Characteristic characteristic;
    @XmlElement(name = "WaitListing")
    protected FlightPreferencesType.WaitListing waitListing;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the aircraft property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPreferencesType.Aircraft }
     *     
     */
    public FlightPreferencesType.Aircraft getAircraft() {
        return aircraft;
    }

    /**
     * Sets the value of the aircraft property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPreferencesType.Aircraft }
     *     
     */
    public void setAircraft(FlightPreferencesType.Aircraft value) {
        this.aircraft = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPreferencesType.Characteristic }
     *     
     */
    public FlightPreferencesType.Characteristic getCharacteristic() {
        return characteristic;
    }

    /**
     * Sets the value of the characteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPreferencesType.Characteristic }
     *     
     */
    public void setCharacteristic(FlightPreferencesType.Characteristic value) {
        this.characteristic = value;
    }

    /**
     * Gets the value of the waitListing property.
     * 
     * @return
     *     possible object is
     *     {@link FlightPreferencesType.WaitListing }
     *     
     */
    public FlightPreferencesType.WaitListing getWaitListing() {
        return waitListing;
    }

    /**
     * Sets the value of the waitListing property.
     * 
     * @param value
     *     allowed object is
     *     {@link FlightPreferencesType.WaitListing }
     *     
     */
    public void setWaitListing(FlightPreferencesType.WaitListing value) {
        this.waitListing = value;
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Equipment" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftCodeQueryType"&gt;
     *               &lt;/extension&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;choice&gt;
     *           &lt;element name="Cabins" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Cabin" maxOccurs="unbounded"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;simpleContent&gt;
     *                           &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
     *                             &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
     *                           &lt;/extension&gt;
     *                         &lt;/simpleContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="Classes" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Class" maxOccurs="unbounded"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;simpleContent&gt;
     *                           &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                             &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
     *                           &lt;/extension&gt;
     *                         &lt;/simpleContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/choice&gt;
     *         &lt;element name="Seats" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Characteristic" maxOccurs="unbounded"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Position" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="SeatRowNmber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Rows" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Feature" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Number" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
     *                           &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Features" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftFeaturesQueryType" minOccurs="0"/&gt;
     *         &lt;element name="TailNumbers" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftTailNmbrQueryType" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "equipment",
        "cabins",
        "classes",
        "seats",
        "rows",
        "features",
        "tailNumbers"
    })
    public static class Aircraft {

        @XmlElement(name = "Equipment")
        protected FlightPreferencesType.Aircraft.Equipment equipment;
        @XmlElement(name = "Cabins")
        protected FlightPreferencesType.Aircraft.Cabins cabins;
        @XmlElement(name = "Classes")
        protected FlightPreferencesType.Aircraft.Classes classes;
        @XmlElement(name = "Seats")
        protected FlightPreferencesType.Aircraft.Seats seats;
        @XmlElement(name = "Rows")
        protected FlightPreferencesType.Aircraft.Rows rows;
        @XmlElement(name = "Features")
        protected AircraftFeaturesQueryType features;
        @XmlElement(name = "TailNumbers")
        protected AircraftTailNmbrQueryType tailNumbers;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the equipment property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Aircraft.Equipment }
         *     
         */
        public FlightPreferencesType.Aircraft.Equipment getEquipment() {
            return equipment;
        }

        /**
         * Sets the value of the equipment property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Aircraft.Equipment }
         *     
         */
        public void setEquipment(FlightPreferencesType.Aircraft.Equipment value) {
            this.equipment = value;
        }

        /**
         * Gets the value of the cabins property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Aircraft.Cabins }
         *     
         */
        public FlightPreferencesType.Aircraft.Cabins getCabins() {
            return cabins;
        }

        /**
         * Sets the value of the cabins property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Aircraft.Cabins }
         *     
         */
        public void setCabins(FlightPreferencesType.Aircraft.Cabins value) {
            this.cabins = value;
        }

        /**
         * Gets the value of the classes property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Aircraft.Classes }
         *     
         */
        public FlightPreferencesType.Aircraft.Classes getClasses() {
            return classes;
        }

        /**
         * Sets the value of the classes property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Aircraft.Classes }
         *     
         */
        public void setClasses(FlightPreferencesType.Aircraft.Classes value) {
            this.classes = value;
        }

        /**
         * Gets the value of the seats property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Aircraft.Seats }
         *     
         */
        public FlightPreferencesType.Aircraft.Seats getSeats() {
            return seats;
        }

        /**
         * Sets the value of the seats property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Aircraft.Seats }
         *     
         */
        public void setSeats(FlightPreferencesType.Aircraft.Seats value) {
            this.seats = value;
        }

        /**
         * Gets the value of the rows property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Aircraft.Rows }
         *     
         */
        public FlightPreferencesType.Aircraft.Rows getRows() {
            return rows;
        }

        /**
         * Sets the value of the rows property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Aircraft.Rows }
         *     
         */
        public void setRows(FlightPreferencesType.Aircraft.Rows value) {
            this.rows = value;
        }

        /**
         * Gets the value of the features property.
         * 
         * @return
         *     possible object is
         *     {@link AircraftFeaturesQueryType }
         *     
         */
        public AircraftFeaturesQueryType getFeatures() {
            return features;
        }

        /**
         * Sets the value of the features property.
         * 
         * @param value
         *     allowed object is
         *     {@link AircraftFeaturesQueryType }
         *     
         */
        public void setFeatures(AircraftFeaturesQueryType value) {
            this.features = value;
        }

        /**
         * Gets the value of the tailNumbers property.
         * 
         * @return
         *     possible object is
         *     {@link AircraftTailNmbrQueryType }
         *     
         */
        public AircraftTailNmbrQueryType getTailNumbers() {
            return tailNumbers;
        }

        /**
         * Sets the value of the tailNumbers property.
         * 
         * @param value
         *     allowed object is
         *     {@link AircraftTailNmbrQueryType }
         *     
         */
        public void setTailNumbers(AircraftTailNmbrQueryType value) {
            this.tailNumbers = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Cabin" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cabin"
        })
        public static class Cabins {

            @XmlElement(name = "Cabin", required = true)
            protected List<FlightPreferencesType.Aircraft.Cabins.Cabin> cabin;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the cabin property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabin property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabin().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightPreferencesType.Aircraft.Cabins.Cabin }
             * 
             * 
             */
            public List<FlightPreferencesType.Aircraft.Cabins.Cabin> getCabin() {
                if (cabin == null) {
                    cabin = new ArrayList<FlightPreferencesType.Aircraft.Cabins.Cabin>();
                }
                return this.cabin;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Cabin {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "PreferencesLevel")
                protected String preferencesLevel;
                @XmlAttribute(name = "PreferencesContext")
                protected String preferencesContext;

                /**
                 * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, EQP
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the preferencesLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesLevel() {
                    return preferencesLevel;
                }

                /**
                 * Sets the value of the preferencesLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesLevel(String value) {
                    this.preferencesLevel = value;
                }

                /**
                 * Gets the value of the preferencesContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesContext() {
                    return preferencesContext;
                }

                /**
                 * Sets the value of the preferencesContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesContext(String value) {
                    this.preferencesContext = value;
                }

            }

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
         *         &lt;element name="Class" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "clazz"
        })
        public static class Classes {

            @XmlElement(name = "Class", required = true)
            protected List<FlightPreferencesType.Aircraft.Classes.Class> clazz;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the clazz property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the clazz property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClazz().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightPreferencesType.Aircraft.Classes.Class }
             * 
             * 
             */
            public List<FlightPreferencesType.Aircraft.Classes.Class> getClazz() {
                if (clazz == null) {
                    clazz = new ArrayList<FlightPreferencesType.Aircraft.Classes.Class>();
                }
                return this.clazz;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Class {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "PreferencesLevel")
                protected String preferencesLevel;
                @XmlAttribute(name = "PreferencesContext")
                protected String preferencesContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the preferencesLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesLevel() {
                    return preferencesLevel;
                }

                /**
                 * Sets the value of the preferencesLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesLevel(String value) {
                    this.preferencesLevel = value;
                }

                /**
                 * Gets the value of the preferencesContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesContext() {
                    return preferencesContext;
                }

                /**
                 * Sets the value of the preferencesContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesContext(String value) {
                    this.preferencesContext = value;
                }

            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}AircraftCodeQueryType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Equipment
            extends AircraftCodeQueryType
        {


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
         *         &lt;element name="Feature" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Number" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
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
            "feature",
            "number"
        })
        public static class Rows {

            @XmlElement(name = "Feature")
            protected List<FlightPreferencesType.Aircraft.Rows.Feature> feature;
            @XmlElement(name = "Number")
            protected List<FlightPreferencesType.Aircraft.Rows.Number> number;

            /**
             * Gets the value of the feature property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the feature property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFeature().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightPreferencesType.Aircraft.Rows.Feature }
             * 
             * 
             */
            public List<FlightPreferencesType.Aircraft.Rows.Feature> getFeature() {
                if (feature == null) {
                    feature = new ArrayList<FlightPreferencesType.Aircraft.Rows.Feature>();
                }
                return this.feature;
            }

            /**
             * Gets the value of the number property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the number property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getNumber().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightPreferencesType.Aircraft.Rows.Number }
             * 
             * 
             */
            public List<FlightPreferencesType.Aircraft.Rows.Number> getNumber() {
                if (number == null) {
                    number = new ArrayList<FlightPreferencesType.Aircraft.Rows.Number>();
                }
                return this.number;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Feature {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "PreferencesLevel")
                protected String preferencesLevel;
                @XmlAttribute(name = "PreferencesContext")
                protected String preferencesContext;

                /**
                 * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, EQP
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the preferencesLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesLevel() {
                    return preferencesLevel;
                }

                /**
                 * Sets the value of the preferencesLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesLevel(String value) {
                    this.preferencesLevel = value;
                }

                /**
                 * Gets the value of the preferencesContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesContext() {
                    return preferencesContext;
                }

                /**
                 * Sets the value of the preferencesContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesContext(String value) {
                    this.preferencesContext = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;positiveInteger"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Number {

                @XmlValue
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger value;
                @XmlAttribute(name = "PreferencesLevel")
                protected String preferencesLevel;
                @XmlAttribute(name = "PreferencesContext")
                protected String preferencesContext;

                /**
                 * Gets the value of the value property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setValue(BigInteger value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the preferencesLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesLevel() {
                    return preferencesLevel;
                }

                /**
                 * Sets the value of the preferencesLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesLevel(String value) {
                    this.preferencesLevel = value;
                }

                /**
                 * Gets the value of the preferencesContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesContext() {
                    return preferencesContext;
                }

                /**
                 * Sets the value of the preferencesContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesContext(String value) {
                    this.preferencesContext = value;
                }

            }

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
         *         &lt;element name="Characteristic" maxOccurs="unbounded"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Position" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="SeatRowNmber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "characteristic",
            "position"
        })
        public static class Seats {

            @XmlElement(name = "Characteristic", required = true)
            protected List<FlightPreferencesType.Aircraft.Seats.Characteristic> characteristic;
            @XmlElement(name = "Position")
            protected FlightPreferencesType.Aircraft.Seats.Position position;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the characteristic property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the characteristic property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCharacteristic().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightPreferencesType.Aircraft.Seats.Characteristic }
             * 
             * 
             */
            public List<FlightPreferencesType.Aircraft.Seats.Characteristic> getCharacteristic() {
                if (characteristic == null) {
                    characteristic = new ArrayList<FlightPreferencesType.Aircraft.Seats.Characteristic>();
                }
                return this.characteristic;
            }

            /**
             * Gets the value of the position property.
             * 
             * @return
             *     possible object is
             *     {@link FlightPreferencesType.Aircraft.Seats.Position }
             *     
             */
            public FlightPreferencesType.Aircraft.Seats.Position getPosition() {
                return position;
            }

            /**
             * Sets the value of the position property.
             * 
             * @param value
             *     allowed object is
             *     {@link FlightPreferencesType.Aircraft.Seats.Position }
             *     
             */
            public void setPosition(FlightPreferencesType.Aircraft.Seats.Position value) {
                this.position = value;
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
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;IATA_CodeType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}PreferenceAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Characteristic {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "PreferencesLevel")
                protected String preferencesLevel;
                @XmlAttribute(name = "PreferencesContext")
                protected String preferencesContext;

                /**
                 * Used for codes in the IATA code tables. Possible values of this pattern are 1, 101, EQP
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Gets the value of the preferencesLevel property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesLevel() {
                    return preferencesLevel;
                }

                /**
                 * Sets the value of the preferencesLevel property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesLevel(String value) {
                    this.preferencesLevel = value;
                }

                /**
                 * Gets the value of the preferencesContext property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPreferencesContext() {
                    return preferencesContext;
                }

                /**
                 * Sets the value of the preferencesContext property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPreferencesContext(String value) {
                    this.preferencesContext = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="SeatRowNmber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}CodesetValueSimpleType" minOccurs="0"/&gt;
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
                "seatRowNmber"
            })
            public static class Position
                extends CodesetType
            {

                @XmlElement(name = "SeatRowNmber")
                protected String seatRowNmber;

                /**
                 * Gets the value of the seatRowNmber property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSeatRowNmber() {
                    return seatRowNmber;
                }

                /**
                 * Sets the value of the seatRowNmber property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSeatRowNmber(String value) {
                    this.seatRowNmber = value;
                }

            }

        }

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
     *         &lt;element name="NonStopPreferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
     *                 &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DirectPreferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
     *                 &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="OvernightStopPreferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
     *                 &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="AirportChangePreferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
     *                 &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RedEyePreferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
     *                 &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nonStopPreferences",
        "directPreferences",
        "overnightStopPreferences",
        "airportChangePreferences",
        "redEyePreferences"
    })
    public static class Characteristic {

        @XmlElement(name = "NonStopPreferences")
        protected FlightPreferencesType.Characteristic.NonStopPreferences nonStopPreferences;
        @XmlElement(name = "DirectPreferences")
        protected FlightPreferencesType.Characteristic.DirectPreferences directPreferences;
        @XmlElement(name = "OvernightStopPreferences")
        protected FlightPreferencesType.Characteristic.OvernightStopPreferences overnightStopPreferences;
        @XmlElement(name = "AirportChangePreferences")
        protected FlightPreferencesType.Characteristic.AirportChangePreferences airportChangePreferences;
        @XmlElement(name = "RedEyePreferences")
        protected FlightPreferencesType.Characteristic.RedEyePreferences redEyePreferences;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the nonStopPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Characteristic.NonStopPreferences }
         *     
         */
        public FlightPreferencesType.Characteristic.NonStopPreferences getNonStopPreferences() {
            return nonStopPreferences;
        }

        /**
         * Sets the value of the nonStopPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Characteristic.NonStopPreferences }
         *     
         */
        public void setNonStopPreferences(FlightPreferencesType.Characteristic.NonStopPreferences value) {
            this.nonStopPreferences = value;
        }

        /**
         * Gets the value of the directPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Characteristic.DirectPreferences }
         *     
         */
        public FlightPreferencesType.Characteristic.DirectPreferences getDirectPreferences() {
            return directPreferences;
        }

        /**
         * Sets the value of the directPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Characteristic.DirectPreferences }
         *     
         */
        public void setDirectPreferences(FlightPreferencesType.Characteristic.DirectPreferences value) {
            this.directPreferences = value;
        }

        /**
         * Gets the value of the overnightStopPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Characteristic.OvernightStopPreferences }
         *     
         */
        public FlightPreferencesType.Characteristic.OvernightStopPreferences getOvernightStopPreferences() {
            return overnightStopPreferences;
        }

        /**
         * Sets the value of the overnightStopPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Characteristic.OvernightStopPreferences }
         *     
         */
        public void setOvernightStopPreferences(FlightPreferencesType.Characteristic.OvernightStopPreferences value) {
            this.overnightStopPreferences = value;
        }

        /**
         * Gets the value of the airportChangePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Characteristic.AirportChangePreferences }
         *     
         */
        public FlightPreferencesType.Characteristic.AirportChangePreferences getAirportChangePreferences() {
            return airportChangePreferences;
        }

        /**
         * Sets the value of the airportChangePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Characteristic.AirportChangePreferences }
         *     
         */
        public void setAirportChangePreferences(FlightPreferencesType.Characteristic.AirportChangePreferences value) {
            this.airportChangePreferences = value;
        }

        /**
         * Gets the value of the redEyePreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.Characteristic.RedEyePreferences }
         *     
         */
        public FlightPreferencesType.Characteristic.RedEyePreferences getRedEyePreferences() {
            return redEyePreferences;
        }

        /**
         * Sets the value of the redEyePreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.Characteristic.RedEyePreferences }
         *     
         */
        public void setRedEyePreferences(FlightPreferencesType.Characteristic.RedEyePreferences value) {
            this.redEyePreferences = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
         *       &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class AirportChangePreferences {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * A data type for Language Code Application.
             * 
             * Examples: Display, Requested, Spoken, Written, Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
         *       &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class DirectPreferences {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * A data type for Language Code Application.
             * 
             * Examples: Display, Requested, Spoken, Written, Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
         *       &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class NonStopPreferences {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * A data type for Language Code Application.
             * 
             * Examples: Display, Requested, Spoken, Written, Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
         *       &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class OvernightStopPreferences {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * A data type for Language Code Application.
             * 
             * Examples: Display, Requested, Spoken, Written, Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
         *       &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class RedEyePreferences {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * A data type for Language Code Application.
             * 
             * Examples: Display, Requested, Spoken, Written, Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }

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
     *         &lt;element name="WaitListPreferences" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
     *                 &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ObjAssociationAttrGroup"/&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "waitListPreferences"
    })
    public static class WaitListing {

        @XmlElement(name = "WaitListPreferences")
        protected FlightPreferencesType.WaitListing.WaitListPreferences waitListPreferences;
        @XmlAttribute(name = "refs")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String refs;

        /**
         * Gets the value of the waitListPreferences property.
         * 
         * @return
         *     possible object is
         *     {@link FlightPreferencesType.WaitListing.WaitListPreferences }
         *     
         */
        public FlightPreferencesType.WaitListing.WaitListPreferences getWaitListPreferences() {
            return waitListPreferences;
        }

        /**
         * Sets the value of the waitListPreferences property.
         * 
         * @param value
         *     allowed object is
         *     {@link FlightPreferencesType.WaitListing.WaitListPreferences }
         *     
         */
        public void setWaitListPreferences(FlightPreferencesType.WaitListing.WaitListPreferences value) {
            this.waitListPreferences = value;
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
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ&gt;PreferencesLevelSimpleType"&gt;
         *       &lt;attribute name="PreferencesContext" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRQ}ContextSimpleType" /&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class WaitListPreferences {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "PreferencesContext")
            protected String preferencesContext;

            /**
             * A data type for Language Code Application.
             * 
             * Examples: Display, Requested, Spoken, Written, Other
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the preferencesContext property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPreferencesContext() {
                return preferencesContext;
            }

            /**
             * Sets the value of the preferencesContext property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPreferencesContext(String value) {
                this.preferencesContext = value;
            }

        }

    }

}
