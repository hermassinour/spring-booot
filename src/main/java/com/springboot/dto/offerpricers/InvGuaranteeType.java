
package com.springboot.dto.offerpricers;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Offer/ Offer Item: INVENTORY GUARANTEE definition.
 * 
 * <p>Java class for InvGuaranteeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvGuaranteeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InvGuaranteeTimeLimit"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CoreDateGrpType"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="InvGuaranteeID" type="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}UniqueStringID_SimpleType"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}OfferReferences" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvGuaranteeType", propOrder = {
    "invGuaranteeTimeLimit",
    "invGuaranteeID",
    "offerReferences"
})
public class InvGuaranteeType {

    @XmlElement(name = "InvGuaranteeTimeLimit", required = true)
    protected InvGuaranteeType.InvGuaranteeTimeLimit invGuaranteeTimeLimit;
    @XmlElement(name = "InvGuaranteeID", required = true)
    protected String invGuaranteeID;
    @XmlElement(name = "OfferReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> offerReferences;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the invGuaranteeTimeLimit property.
     * 
     * @return
     *     possible object is
     *     {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     *     
     */
    public InvGuaranteeType.InvGuaranteeTimeLimit getInvGuaranteeTimeLimit() {
        return invGuaranteeTimeLimit;
    }

    /**
     * Sets the value of the invGuaranteeTimeLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     *     
     */
    public void setInvGuaranteeTimeLimit(InvGuaranteeType.InvGuaranteeTimeLimit value) {
        this.invGuaranteeTimeLimit = value;
    }

    /**
     * Gets the value of the invGuaranteeID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvGuaranteeID() {
        return invGuaranteeID;
    }

    /**
     * Sets the value of the invGuaranteeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvGuaranteeID(String value) {
        this.invGuaranteeID = value;
    }

    /**
     * Association(s) to one or more Offers or Offer Items for which the inventory guarantee applies.Gets the value of the offerReferences property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offerReferences property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOfferReferences().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOfferReferences() {
        if (offerReferences == null) {
            offerReferences = new ArrayList<String>();
        }
        return this.offerReferences;
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
     *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS}CoreDateGrpType"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class InvGuaranteeTimeLimit
        extends CoreDateGrpType
    {


    }

}
