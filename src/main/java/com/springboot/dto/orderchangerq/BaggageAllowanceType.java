
package com.springboot.dto.orderchangerq;

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
 * The amount of checked or carry-on luggage the airline will allow per passenger.
 * 
 * <p>Java class for BaggageAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaggageAllowanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaggageAllowanceID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ID_Type"/&gt;
 *         &lt;element name="TypeCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BaggageTypeCodeType"/&gt;
 *         &lt;element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}TextType" minOccurs="0"/&gt;
 *         &lt;element name="DescText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}TextType" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="WeightAllowance" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}WeightAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BDC" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}BDC_Type" minOccurs="0"/&gt;
 *         &lt;element name="DimensionAllowance" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}DimensionAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PieceAllowance" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PieceAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggageAllowanceType", propOrder = {
    "baggageAllowanceID",
    "typeCode",
    "applicableBagText",
    "applicablePartyText",
    "descText",
    "weightAllowance",
    "bdc",
    "dimensionAllowance",
    "pieceAllowance"
})
public class BaggageAllowanceType {

    @XmlElement(name = "BaggageAllowanceID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String baggageAllowanceID;
    @XmlElement(name = "TypeCode", required = true)
    @XmlSchemaType(name = "string")
    protected BaggageTypeContentType typeCode;
    @XmlElement(name = "ApplicableBagText")
    protected String applicableBagText;
    @XmlElement(name = "ApplicablePartyText")
    protected String applicablePartyText;
    @XmlElement(name = "DescText")
    protected List<String> descText;
    @XmlElement(name = "WeightAllowance")
    protected List<WeightAllowanceType> weightAllowance;
    @XmlElement(name = "BDC")
    protected BDCType bdc;
    @XmlElement(name = "DimensionAllowance")
    protected List<DimensionAllowanceType> dimensionAllowance;
    @XmlElement(name = "PieceAllowance")
    protected List<PieceAllowanceType> pieceAllowance;

    /**
     * Gets the value of the baggageAllowanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaggageAllowanceID() {
        return baggageAllowanceID;
    }

    /**
     * Sets the value of the baggageAllowanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaggageAllowanceID(String value) {
        this.baggageAllowanceID = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BaggageTypeContentType }
     *     
     */
    public BaggageTypeContentType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageTypeContentType }
     *     
     */
    public void setTypeCode(BaggageTypeContentType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the applicableBagText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicableBagText() {
        return applicableBagText;
    }

    /**
     * Sets the value of the applicableBagText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicableBagText(String value) {
        this.applicableBagText = value;
    }

    /**
     * Gets the value of the applicablePartyText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicablePartyText() {
        return applicablePartyText;
    }

    /**
     * Sets the value of the applicablePartyText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicablePartyText(String value) {
        this.applicablePartyText = value;
    }

    /**
     * Gets the value of the descText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescText() {
        if (descText == null) {
            descText = new ArrayList<String>();
        }
        return this.descText;
    }

    /**
     * Gets the value of the weightAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weightAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeightAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightAllowanceType }
     * 
     * 
     */
    public List<WeightAllowanceType> getWeightAllowance() {
        if (weightAllowance == null) {
            weightAllowance = new ArrayList<WeightAllowanceType>();
        }
        return this.weightAllowance;
    }

    /**
     * Gets the value of the bdc property.
     * 
     * @return
     *     possible object is
     *     {@link BDCType }
     *     
     */
    public BDCType getBDC() {
        return bdc;
    }

    /**
     * Sets the value of the bdc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BDCType }
     *     
     */
    public void setBDC(BDCType value) {
        this.bdc = value;
    }

    /**
     * Gets the value of the dimensionAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimensionAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimensionAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionAllowanceType }
     * 
     * 
     */
    public List<DimensionAllowanceType> getDimensionAllowance() {
        if (dimensionAllowance == null) {
            dimensionAllowance = new ArrayList<DimensionAllowanceType>();
        }
        return this.dimensionAllowance;
    }

    /**
     * Gets the value of the pieceAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PieceAllowanceType }
     * 
     * 
     */
    public List<PieceAllowanceType> getPieceAllowance() {
        if (pieceAllowance == null) {
            pieceAllowance = new ArrayList<PieceAllowanceType>();
        }
        return this.pieceAllowance;
    }

}
