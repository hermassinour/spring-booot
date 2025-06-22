
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
 * Tax breakdown details.
 * 
 * <p>Java class for TaxType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Amount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AmountType"/&gt;
 *         &lt;element name="TaxCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxCodeType" minOccurs="0"/&gt;
 *         &lt;element name="TaxTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxTypeCodeType" minOccurs="0"/&gt;
 *         &lt;element name="QualifierCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxQualifierCodeType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="FiledAmount" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="FiledTaxCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ApproximateInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="CollectionInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="RefundInd" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}IndType" minOccurs="0"/&gt;
 *         &lt;element name="AppTypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CodeType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalTaxCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxCodeType" minOccurs="0"/&gt;
 *         &lt;element name="AdditionalFiledTaxCode" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}TaxCodeType" minOccurs="0"/&gt;
 *         &lt;element name="CollectionPointTax" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CollectionPointTaxType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Country" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="CountrySub-Division" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CountrySubDivisionType" minOccurs="0"/&gt;
 *         &lt;element name="CurConversion" type="{http://www.iata.org/IATA/2015/00/2018.1/AirShoppingRQ}CurConversionType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxType", propOrder = {
    "amount",
    "taxCode",
    "taxTypeCode",
    "qualifierCode",
    "descText",
    "filedAmount",
    "filedTaxCode",
    "approximateInd",
    "collectionInd",
    "refundInd",
    "appTypeCode",
    "additionalTaxCode",
    "additionalFiledTaxCode",
    "collectionPointTax",
    "country",
    "countrySubDivision",
    "curConversion"
})
public class TaxType {

    @XmlElement(name = "Amount", required = true)
    protected AmountType amount;
    @XmlElement(name = "TaxCode")
    protected String taxCode;
    @XmlElement(name = "TaxTypeCode")
    @XmlSchemaType(name = "string")
    protected TaxTypeContentType taxTypeCode;
    @XmlElement(name = "QualifierCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String qualifierCode;
    @XmlElement(name = "DescText")
    protected String descText;
    @XmlElement(name = "FiledAmount")
    protected AmountType filedAmount;
    @XmlElement(name = "FiledTaxCode")
    protected String filedTaxCode;
    @XmlElement(name = "ApproximateInd")
    protected Boolean approximateInd;
    @XmlElement(name = "CollectionInd")
    protected Boolean collectionInd;
    @XmlElement(name = "RefundInd")
    protected Boolean refundInd;
    @XmlElement(name = "AppTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String appTypeCode;
    @XmlElement(name = "AdditionalTaxCode")
    protected String additionalTaxCode;
    @XmlElement(name = "AdditionalFiledTaxCode")
    protected String additionalFiledTaxCode;
    @XmlElement(name = "CollectionPointTax")
    protected List<CollectionPointTaxType> collectionPointTax;
    @XmlElement(name = "Country")
    protected CountryType country;
    @XmlElement(name = "CountrySub-Division")
    protected CountrySubDivisionType countrySubDivision;
    @XmlElement(name = "CurConversion")
    protected CurConversionType curConversion;

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmount(AmountType value) {
        this.amount = value;
    }

    /**
     * Gets the value of the taxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * Sets the value of the taxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxCode(String value) {
        this.taxCode = value;
    }

    /**
     * Gets the value of the taxTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxTypeContentType }
     *     
     */
    public TaxTypeContentType getTaxTypeCode() {
        return taxTypeCode;
    }

    /**
     * Sets the value of the taxTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxTypeContentType }
     *     
     */
    public void setTaxTypeCode(TaxTypeContentType value) {
        this.taxTypeCode = value;
    }

    /**
     * Gets the value of the qualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualifierCode() {
        return qualifierCode;
    }

    /**
     * Sets the value of the qualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualifierCode(String value) {
        this.qualifierCode = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescText() {
        return descText;
    }

    /**
     * Sets the value of the descText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescText(String value) {
        this.descText = value;
    }

    /**
     * Gets the value of the filedAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getFiledAmount() {
        return filedAmount;
    }

    /**
     * Sets the value of the filedAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setFiledAmount(AmountType value) {
        this.filedAmount = value;
    }

    /**
     * Gets the value of the filedTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiledTaxCode() {
        return filedTaxCode;
    }

    /**
     * Sets the value of the filedTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiledTaxCode(String value) {
        this.filedTaxCode = value;
    }

    /**
     * Gets the value of the approximateInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isApproximateInd() {
        return approximateInd;
    }

    /**
     * Sets the value of the approximateInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setApproximateInd(Boolean value) {
        this.approximateInd = value;
    }

    /**
     * Gets the value of the collectionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCollectionInd() {
        return collectionInd;
    }

    /**
     * Sets the value of the collectionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCollectionInd(Boolean value) {
        this.collectionInd = value;
    }

    /**
     * Gets the value of the refundInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInd() {
        return refundInd;
    }

    /**
     * Sets the value of the refundInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInd(Boolean value) {
        this.refundInd = value;
    }

    /**
     * Gets the value of the appTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTypeCode() {
        return appTypeCode;
    }

    /**
     * Sets the value of the appTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTypeCode(String value) {
        this.appTypeCode = value;
    }

    /**
     * Gets the value of the additionalTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalTaxCode() {
        return additionalTaxCode;
    }

    /**
     * Sets the value of the additionalTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalTaxCode(String value) {
        this.additionalTaxCode = value;
    }

    /**
     * Gets the value of the additionalFiledTaxCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFiledTaxCode() {
        return additionalFiledTaxCode;
    }

    /**
     * Sets the value of the additionalFiledTaxCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFiledTaxCode(String value) {
        this.additionalFiledTaxCode = value;
    }

    /**
     * Gets the value of the collectionPointTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionPointTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionPointTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CollectionPointTaxType }
     * 
     * 
     */
    public List<CollectionPointTaxType> getCollectionPointTax() {
        if (collectionPointTax == null) {
            collectionPointTax = new ArrayList<CollectionPointTaxType>();
        }
        return this.collectionPointTax;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubDivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public CountrySubDivisionType getCountrySubDivision() {
        return countrySubDivision;
    }

    /**
     * Sets the value of the countrySubDivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubDivisionType }
     *     
     */
    public void setCountrySubDivision(CountrySubDivisionType value) {
        this.countrySubDivision = value;
    }

    /**
     * Gets the value of the curConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurConversionType }
     *     
     */
    public CurConversionType getCurConversion() {
        return curConversion;
    }

    /**
     * Sets the value of the curConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurConversionType }
     *     
     */
    public void setCurConversion(CurConversionType value) {
        this.curConversion = value;
    }

}
