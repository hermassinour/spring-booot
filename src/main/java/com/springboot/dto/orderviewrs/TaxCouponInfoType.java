
package com.springboot.dto.orderviewrs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Used to specify tax information for a coupon.
 * 
 * <p>Java class for TaxCouponInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxCouponInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TicketDocument" maxOccurs="4"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CouponNumber" maxOccurs="4"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="TaxCouponInfo" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                     &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Tax" maxOccurs="99" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TaxDetailType"&gt;
 *                                     &lt;attribute name="AirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
 *                                     &lt;attribute name="ApplicableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="CurrencyType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
 *                                     &lt;attribute name="ReportedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                                     &lt;attribute name="SegmentOriginAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
 *                                     &lt;attribute name="SegmentDestAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="CityAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to8" /&gt;
 *                                     &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *                                     &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="Number" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}Numeric1to4" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to16" /&gt;
 *                 &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="JourneyTurnaroundCityCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to8" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCouponInfoType", propOrder = {
    "ticketDocument"
})
public class TaxCouponInfoType {

    @XmlElement(name = "TicketDocument", required = true)
    protected List<TaxCouponInfoType.TicketDocument> ticketDocument;
    @XmlAttribute(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlAttribute(name = "JourneyTurnaroundCityCode")
    protected String journeyTurnaroundCityCode;

    /**
     * Gets the value of the ticketDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCouponInfoType.TicketDocument }
     * 
     * 
     */
    public List<TaxCouponInfoType.TicketDocument> getTicketDocument() {
        if (ticketDocument == null) {
            ticketDocument = new ArrayList<TaxCouponInfoType.TicketDocument>();
        }
        return this.ticketDocument;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the journeyTurnaroundCityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJourneyTurnaroundCityCode() {
        return journeyTurnaroundCityCode;
    }

    /**
     * Sets the value of the journeyTurnaroundCityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJourneyTurnaroundCityCode(String value) {
        this.journeyTurnaroundCityCode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CouponNumber" maxOccurs="4"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="TaxCouponInfo" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                           &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Tax" maxOccurs="99" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TaxDetailType"&gt;
     *                           &lt;attribute name="AirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
     *                           &lt;attribute name="ApplicableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="CurrencyType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
     *                           &lt;attribute name="ReportedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                           &lt;attribute name="SegmentOriginAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
     *                           &lt;attribute name="SegmentDestAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="CityAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to8" /&gt;
     *                           &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
     *                           &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="Number" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}Numeric1to4" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="TicketDocumentNbr" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to16" /&gt;
     *       &lt;attribute name="DateOfIssue" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "couponNumber"
    })
    public static class TicketDocument {

        @XmlElement(name = "CouponNumber", required = true)
        protected List<TaxCouponInfoType.TicketDocument.CouponNumber> couponNumber;
        @XmlAttribute(name = "TicketDocumentNbr", required = true)
        protected String ticketDocumentNbr;
        @XmlAttribute(name = "DateOfIssue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateOfIssue;

        /**
         * Gets the value of the couponNumber property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the couponNumber property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCouponNumber().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxCouponInfoType.TicketDocument.CouponNumber }
         * 
         * 
         */
        public List<TaxCouponInfoType.TicketDocument.CouponNumber> getCouponNumber() {
            if (couponNumber == null) {
                couponNumber = new ArrayList<TaxCouponInfoType.TicketDocument.CouponNumber>();
            }
            return this.couponNumber;
        }

        /**
         * Gets the value of the ticketDocumentNbr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDocumentNbr() {
            return ticketDocumentNbr;
        }

        /**
         * Sets the value of the ticketDocumentNbr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDocumentNbr(String value) {
            this.ticketDocumentNbr = value;
        }

        /**
         * Gets the value of the dateOfIssue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateOfIssue() {
            return dateOfIssue;
        }

        /**
         * Sets the value of the dateOfIssue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateOfIssue(XMLGregorianCalendar value) {
            this.dateOfIssue = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="TaxCouponInfo" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                 &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Tax" maxOccurs="99" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TaxDetailType"&gt;
         *                 &lt;attribute name="AirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
         *                 &lt;attribute name="ApplicableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="CurrencyType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
         *                 &lt;attribute name="ReportedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *                 &lt;attribute name="SegmentOriginAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
         *                 &lt;attribute name="SegmentDestAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="UnticketedPointInfo" maxOccurs="5" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="CityAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to8" /&gt;
         *                 &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
         *                 &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="Number" use="required" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}Numeric1to4" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "taxCouponInfo",
            "tax",
            "unticketedPointInfo"
        })
        public static class CouponNumber {

            @XmlElement(name = "TaxCouponInfo")
            protected TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo taxCouponInfo;
            @XmlElement(name = "Tax")
            protected List<TaxCouponInfoType.TicketDocument.CouponNumber.Tax> tax;
            @XmlElement(name = "UnticketedPointInfo")
            protected List<TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo> unticketedPointInfo;
            @XmlAttribute(name = "Number", required = true)
            protected int number;

            /**
             * Gets the value of the taxCouponInfo property.
             * 
             * @return
             *     possible object is
             *     {@link TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo }
             *     
             */
            public TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo getTaxCouponInfo() {
                return taxCouponInfo;
            }

            /**
             * Sets the value of the taxCouponInfo property.
             * 
             * @param value
             *     allowed object is
             *     {@link TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo }
             *     
             */
            public void setTaxCouponInfo(TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo value) {
                this.taxCouponInfo = value;
            }

            /**
             * Gets the value of the tax property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the tax property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTax().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TaxCouponInfoType.TicketDocument.CouponNumber.Tax }
             * 
             * 
             */
            public List<TaxCouponInfoType.TicketDocument.CouponNumber.Tax> getTax() {
                if (tax == null) {
                    tax = new ArrayList<TaxCouponInfoType.TicketDocument.CouponNumber.Tax>();
                }
                return this.tax;
            }

            /**
             * Gets the value of the unticketedPointInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the unticketedPointInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getUnticketedPointInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo }
             * 
             * 
             */
            public List<TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo> getUnticketedPointInfo() {
                if (unticketedPointInfo == null) {
                    unticketedPointInfo = new ArrayList<TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo>();
                }
                return this.unticketedPointInfo;
            }

            /**
             * Gets the value of the number property.
             * 
             */
            public int getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             */
            public void setNumber(int value) {
                this.number = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;extension base="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TaxDetailType"&gt;
             *       &lt;attribute name="AirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
             *       &lt;attribute name="ApplicableAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="CurrencyType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
             *       &lt;attribute name="ReportedAmount" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
             *       &lt;attribute name="SegmentOriginAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
             *       &lt;attribute name="SegmentDestAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to5" /&gt;
             *     &lt;/extension&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Tax
                extends TaxDetailType
            {

                @XmlAttribute(name = "AirportCode")
                protected String airportCode;
                @XmlAttribute(name = "ApplicableAmount")
                protected BigDecimal applicableAmount;
                @XmlAttribute(name = "CurrencyType")
                protected String currencyType;
                @XmlAttribute(name = "ReportedAmount")
                protected BigDecimal reportedAmount;
                @XmlAttribute(name = "SegmentOriginAirportCode")
                protected String segmentOriginAirportCode;
                @XmlAttribute(name = "SegmentDestAirportCode")
                protected String segmentDestAirportCode;

                /**
                 * Gets the value of the airportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirportCode() {
                    return airportCode;
                }

                /**
                 * Sets the value of the airportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirportCode(String value) {
                    this.airportCode = value;
                }

                /**
                 * Gets the value of the applicableAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getApplicableAmount() {
                    return applicableAmount;
                }

                /**
                 * Sets the value of the applicableAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setApplicableAmount(BigDecimal value) {
                    this.applicableAmount = value;
                }

                /**
                 * Gets the value of the currencyType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyType() {
                    return currencyType;
                }

                /**
                 * Sets the value of the currencyType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyType(String value) {
                    this.currencyType = value;
                }

                /**
                 * Gets the value of the reportedAmount property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getReportedAmount() {
                    return reportedAmount;
                }

                /**
                 * Sets the value of the reportedAmount property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setReportedAmount(BigDecimal value) {
                    this.reportedAmount = value;
                }

                /**
                 * Gets the value of the segmentOriginAirportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegmentOriginAirportCode() {
                    return segmentOriginAirportCode;
                }

                /**
                 * Sets the value of the segmentOriginAirportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegmentOriginAirportCode(String value) {
                    this.segmentOriginAirportCode = value;
                }

                /**
                 * Gets the value of the segmentDestAirportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegmentDestAirportCode() {
                    return segmentDestAirportCode;
                }

                /**
                 * Sets the value of the segmentDestAirportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegmentDestAirportCode(String value) {
                    this.segmentDestAirportCode = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="Cabin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *       &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TaxCouponInfo {

                @XmlAttribute(name = "Cabin")
                protected String cabin;
                @XmlAttribute(name = "AirEquipType")
                protected String airEquipType;

                /**
                 * Gets the value of the cabin property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCabin() {
                    return cabin;
                }

                /**
                 * Sets the value of the cabin property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCabin(String value) {
                    this.cabin = value;
                }

                /**
                 * Gets the value of the airEquipType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirEquipType() {
                    return airEquipType;
                }

                /**
                 * Sets the value of the airEquipType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirEquipType(String value) {
                    this.airEquipType = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="CityAirportCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}StringLength1to8" /&gt;
             *       &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
             *       &lt;attribute name="AirEquipType" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AlphaLength3" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class UnticketedPointInfo {

                @XmlAttribute(name = "CityAirportCode")
                protected String cityAirportCode;
                @XmlAttribute(name = "ArrivalDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar arrivalDate;
                @XmlAttribute(name = "DepartureDate")
                @XmlSchemaType(name = "dateTime")
                protected XMLGregorianCalendar departureDate;
                @XmlAttribute(name = "AirEquipType")
                protected String airEquipType;

                /**
                 * Gets the value of the cityAirportCode property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCityAirportCode() {
                    return cityAirportCode;
                }

                /**
                 * Sets the value of the cityAirportCode property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCityAirportCode(String value) {
                    this.cityAirportCode = value;
                }

                /**
                 * Gets the value of the arrivalDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getArrivalDate() {
                    return arrivalDate;
                }

                /**
                 * Sets the value of the arrivalDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setArrivalDate(XMLGregorianCalendar value) {
                    this.arrivalDate = value;
                }

                /**
                 * Gets the value of the departureDate property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDepartureDate() {
                    return departureDate;
                }

                /**
                 * Sets the value of the departureDate property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDepartureDate(XMLGregorianCalendar value) {
                    this.departureDate = value;
                }

                /**
                 * Gets the value of the airEquipType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAirEquipType() {
                    return airEquipType;
                }

                /**
                 * Sets the value of the airEquipType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAirEquipType(String value) {
                    this.airEquipType = value;
                }

            }

        }

    }

}
