
package com.springboot.dto.ordercancelrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Row of seats located in a cabin compartment.
 * 
 * <p>Java class for SeatRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatRowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RowNumber" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}NumberType"/&gt;
 *         &lt;element name="CharacteristicsCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCancelRS}SeatRowCharacteristicsCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRowType", propOrder = {
    "rowNumber",
    "characteristicsCode"
})
public class SeatRowType {

    @XmlElement(name = "RowNumber", required = true)
    protected BigDecimal rowNumber;
    @XmlElement(name = "CharacteristicsCode")
    protected List<String> characteristicsCode;

    /**
     * Gets the value of the rowNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRowNumber() {
        return rowNumber;
    }

    /**
     * Sets the value of the rowNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRowNumber(BigDecimal value) {
        this.rowNumber = value;
    }

    /**
     * Gets the value of the characteristicsCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristicsCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristicsCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCharacteristicsCode() {
        if (characteristicsCode == null) {
            characteristicsCode = new ArrayList<String>();
        }
        return this.characteristicsCode;
    }

}
