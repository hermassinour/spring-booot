
package com.springboot.dto.orderretrieverq;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Order Item Time Limits definition.
 * 
 * <p>Java class for OrderItemTimeLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderItemTimeLimitsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}OrderTimeLimitsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}PriceGuaranteeTimeLimits" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}TicketingTimeLimits" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderItemTimeLimitsType", propOrder = {
    "priceGuaranteeTimeLimits",
    "ticketingTimeLimits"
})
public class OrderItemTimeLimitsType
    extends OrderTimeLimitsType
{

    @XmlElement(name = "PriceGuaranteeTimeLimits")
    protected PriceGuaranteeTimeLimitType priceGuaranteeTimeLimits;
    @XmlElement(name = "TicketingTimeLimits")
    protected TicketingTimeLimits ticketingTimeLimits;

    /**
     * Gets the value of the priceGuaranteeTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public PriceGuaranteeTimeLimitType getPriceGuaranteeTimeLimits() {
        return priceGuaranteeTimeLimits;
    }

    /**
     * Sets the value of the priceGuaranteeTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceGuaranteeTimeLimitType }
     *     
     */
    public void setPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        this.priceGuaranteeTimeLimits = value;
    }

    /**
     * Gets the value of the ticketingTimeLimits property.
     * 
     * @return
     *     possible object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public TicketingTimeLimits getTicketingTimeLimits() {
        return ticketingTimeLimits;
    }

    /**
     * Sets the value of the ticketingTimeLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingTimeLimits }
     *     
     */
    public void setTicketingTimeLimits(TicketingTimeLimits value) {
        this.ticketingTimeLimits = value;
    }

}
