
package com.springboot.dto.orderretrieverq;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * A party is an individual, a group, or a body having a role in the air transport industry.  Party has a legal connotation in a business transaction.
 * 
 * <p>Java class for PartyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Participant" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}ParticipantType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Recipient" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}RecipientType" minOccurs="0"/&gt;
 *         &lt;element name="Sender" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderRetrieveRQ}SenderType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartyType", propOrder = {
    "participant",
    "recipient",
    "sender"
})
public class PartyType {

    @XmlElement(name = "Participant")
    protected List<ParticipantType> participant;
    @XmlElement(name = "Recipient")
    protected RecipientType recipient;
    @XmlElement(name = "Sender", required = true)
    protected SenderType sender;

    /**
     * Gets the value of the participant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipantType }
     * 
     * 
     */
    public List<ParticipantType> getParticipant() {
        if (participant == null) {
            participant = new ArrayList<ParticipantType>();
        }
        return this.participant;
    }

    /**
     * Gets the value of the recipient property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientType }
     *     
     */
    public RecipientType getRecipient() {
        return recipient;
    }

    /**
     * Sets the value of the recipient property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientType }
     *     
     */
    public void setRecipient(RecipientType value) {
        this.recipient = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link SenderType }
     *     
     */
    public SenderType getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link SenderType }
     *     
     */
    public void setSender(SenderType value) {
        this.sender = value;
    }

}
