
package com.springboot.dto.ordercreaterq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Any payment that is collected by the agent and settled between the Airline and the agent. Refer to IATA Resolution 728 Attachment A for full details.
 * 
 * <p>Java class for CashType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CashType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CashInd" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderCreateRQ}IndType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashType", propOrder = {
    "cashInd"
})
public class CashType {

    @XmlElement(name = "CashInd")
    protected boolean cashInd;

    /**
     * Gets the value of the cashInd property.
     * 
     */
    public boolean isCashInd() {
        return cashInd;
    }

    /**
     * Sets the value of the cashInd property.
     * 
     */
    public void setCashInd(boolean value) {
        this.cashInd = value;
    }

}
