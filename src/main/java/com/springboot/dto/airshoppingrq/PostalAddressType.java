
package com.springboot.dto.airshoppingrq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Natural or physical address used for postal service. May be a building address, airport address, etc.
 * 
 * <p>Java class for PostalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PostalAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LabelText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="StreetText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" maxOccurs="2" minOccurs="0"/&gt;
 *         &lt;element name="BuildingRoomText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="PO_BoxCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySubdivisionName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="CountryName" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CountryCodeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalAddressType", propOrder = {
    "labelText",
    "streetText",
    "buildingRoomText",
    "poBoxCode",
    "postalCode",
    "cityName",
    "countrySubdivisionName",
    "countryName",
    "countryCode"
})
public class PostalAddressType {

    @XmlElement(name = "LabelText")
    protected String labelText;
    @XmlElement(name = "StreetText")
    protected List<String> streetText;
    @XmlElement(name = "BuildingRoomText")
    protected String buildingRoomText;
    @XmlElement(name = "PO_BoxCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String poBoxCode;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "CityName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String cityName;
    @XmlElement(name = "CountrySubdivisionName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countrySubdivisionName;
    @XmlElement(name = "CountryName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryName;
    @XmlElement(name = "CountryCode")
    protected String countryCode;

    /**
     * Gets the value of the labelText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelText() {
        return labelText;
    }

    /**
     * Sets the value of the labelText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelText(String value) {
        this.labelText = value;
    }

    /**
     * Gets the value of the streetText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the streetText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStreetText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStreetText() {
        if (streetText == null) {
            streetText = new ArrayList<String>();
        }
        return this.streetText;
    }

    /**
     * Gets the value of the buildingRoomText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingRoomText() {
        return buildingRoomText;
    }

    /**
     * Sets the value of the buildingRoomText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingRoomText(String value) {
        this.buildingRoomText = value;
    }

    /**
     * Gets the value of the poBoxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPOBoxCode() {
        return poBoxCode;
    }

    /**
     * Sets the value of the poBoxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPOBoxCode(String value) {
        this.poBoxCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countrySubdivisionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountrySubdivisionName() {
        return countrySubdivisionName;
    }

    /**
     * Sets the value of the countrySubdivisionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountrySubdivisionName(String value) {
        this.countrySubdivisionName = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
