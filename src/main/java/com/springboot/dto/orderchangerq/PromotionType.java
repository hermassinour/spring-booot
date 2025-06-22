
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
 * Information related to the publicization of a product, organization, or venture so as to increase sales or public awareness.
 * 
 * <p>Java class for PromotionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromotionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PromotionID" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ID_Type"/&gt;
 *         &lt;element name="OwnerName" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}ProperNameType" minOccurs="0"/&gt;
 *         &lt;element name="URL" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}UniformResourceID_Type" minOccurs="0"/&gt;
 *         &lt;element name="Remark" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}RemarkType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PromotionIssuer" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderChangeRQ}PromotionIssuerType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromotionType", propOrder = {
    "promotionID",
    "ownerName",
    "url",
    "remark",
    "promotionIssuer"
})
public class PromotionType {

    @XmlElement(name = "PromotionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String promotionID;
    @XmlElement(name = "OwnerName")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ownerName;
    @XmlElement(name = "URL")
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "Remark")
    protected List<RemarkType> remark;
    @XmlElement(name = "PromotionIssuer")
    protected PromotionIssuerType promotionIssuer;

    /**
     * Gets the value of the promotionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionID() {
        return promotionID;
    }

    /**
     * Sets the value of the promotionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionID(String value) {
        this.promotionID = value;
    }

    /**
     * Gets the value of the ownerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets the value of the ownerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerName(String value) {
        this.ownerName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemarkType }
     * 
     * 
     */
    public List<RemarkType> getRemark() {
        if (remark == null) {
            remark = new ArrayList<RemarkType>();
        }
        return this.remark;
    }

    /**
     * Gets the value of the promotionIssuer property.
     * 
     * @return
     *     possible object is
     *     {@link PromotionIssuerType }
     *     
     */
    public PromotionIssuerType getPromotionIssuer() {
        return promotionIssuer;
    }

    /**
     * Sets the value of the promotionIssuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PromotionIssuerType }
     *     
     */
    public void setPromotionIssuer(PromotionIssuerType value) {
        this.promotionIssuer = value;
    }

}
