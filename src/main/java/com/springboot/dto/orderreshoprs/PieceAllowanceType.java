
package com.springboot.dto.orderreshoprs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Defines the maximum number of each allowable baggage type.
 * 
 * <p>Java class for PieceAllowanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PieceAllowanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApplicablePartyText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType"/&gt;
 *         &lt;element name="TotalQty" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}QtyType"/&gt;
 *         &lt;element name="TypeText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="ApplicableBagText" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}TextType" minOccurs="0"/&gt;
 *         &lt;element name="Desc" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="99" minOccurs="0"/&gt;
 *         &lt;element name="PieceDimensionAllowance" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}DimensionAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PieceWeightAllowance" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderReshopRS}WeightAllowanceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PieceAllowanceType", propOrder = {
    "applicablePartyText",
    "totalQty",
    "typeText",
    "applicableBagText",
    "desc",
    "pieceDimensionAllowance",
    "pieceWeightAllowance"
})
public class PieceAllowanceType {

    @XmlElement(name = "ApplicablePartyText", required = true)
    protected String applicablePartyText;
    @XmlElement(name = "TotalQty", required = true)
    protected BigDecimal totalQty;
    @XmlElement(name = "TypeText")
    protected String typeText;
    @XmlElement(name = "ApplicableBagText")
    protected String applicableBagText;
    @XmlElement(name = "Desc")
    protected List<String> desc;
    @XmlElement(name = "PieceDimensionAllowance")
    protected List<DimensionAllowanceType> pieceDimensionAllowance;
    @XmlElement(name = "PieceWeightAllowance")
    protected List<WeightAllowanceType> pieceWeightAllowance;

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
     * Gets the value of the totalQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalQty() {
        return totalQty;
    }

    /**
     * Sets the value of the totalQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalQty(BigDecimal value) {
        this.totalQty = value;
    }

    /**
     * Gets the value of the typeText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeText() {
        return typeText;
    }

    /**
     * Sets the value of the typeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeText(String value) {
        this.typeText = value;
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
     * Gets the value of the desc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDesc() {
        if (desc == null) {
            desc = new ArrayList<String>();
        }
        return this.desc;
    }

    /**
     * Gets the value of the pieceDimensionAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceDimensionAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceDimensionAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DimensionAllowanceType }
     * 
     * 
     */
    public List<DimensionAllowanceType> getPieceDimensionAllowance() {
        if (pieceDimensionAllowance == null) {
            pieceDimensionAllowance = new ArrayList<DimensionAllowanceType>();
        }
        return this.pieceDimensionAllowance;
    }

    /**
     * Gets the value of the pieceWeightAllowance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pieceWeightAllowance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPieceWeightAllowance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightAllowanceType }
     * 
     * 
     */
    public List<WeightAllowanceType> getPieceWeightAllowance() {
        if (pieceWeightAllowance == null) {
            pieceWeightAllowance = new ArrayList<WeightAllowanceType>();
        }
        return this.pieceWeightAllowance;
    }

}
