
package com.springboot.dto.orderviewrs;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="PrepaidProgramDetail"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AirlineID"/&gt;
 *                     &lt;element name="Certificate" maxOccurs="unbounded"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;sequence&gt;
 *                               &lt;element name="Number"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;simpleContent&gt;
 *                                     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
 *                                       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *                                     &lt;/extension&gt;
 *                                   &lt;/simpleContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                               &lt;element name="Application" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ContactAppSimpleType" minOccurs="0"/&gt;
 *                               &lt;element name="EffectivePeriod" minOccurs="0"&gt;
 *                                 &lt;complexType&gt;
 *                                   &lt;complexContent&gt;
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                       &lt;sequence&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearPeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearMonthPeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TimePeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}QuarterPeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MonthPeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DayPeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimePeriod"/&gt;
 *                                         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DatePeriod"/&gt;
 *                                       &lt;/sequence&gt;
 *                                     &lt;/restriction&gt;
 *                                   &lt;/complexContent&gt;
 *                                 &lt;/complexType&gt;
 *                               &lt;/element&gt;
 *                             &lt;/sequence&gt;
 *                             &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                   &lt;sequence&gt;
 *                     &lt;element name="ProgramName"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;simpleContent&gt;
 *                           &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
 *                           &lt;/extension&gt;
 *                         &lt;/simpleContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                     &lt;element name="ProgramCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CodesetValueSimpleType" minOccurs="0"/&gt;
 *                     &lt;element name="Holder" minOccurs="0"&gt;
 *                       &lt;complexType&gt;
 *                         &lt;complexContent&gt;
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                             &lt;choice&gt;
 *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgencyID"/&gt;
 *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PartnerID"/&gt;
 *                             &lt;/choice&gt;
 *                           &lt;/restriction&gt;
 *                         &lt;/complexContent&gt;
 *                       &lt;/complexType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prepaidProgramDetail"
})
@XmlRootElement(name = "PrePaidProgramQualifier")
public class PrePaidProgramQualifier {

    @XmlElement(name = "PrepaidProgramDetail", required = true)
    protected PrePaidProgramQualifier.PrepaidProgramDetail prepaidProgramDetail;
    @XmlAttribute(name = "refs")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String refs;

    /**
     * Gets the value of the prepaidProgramDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     *     
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail getPrepaidProgramDetail() {
        return prepaidProgramDetail;
    }

    /**
     * Sets the value of the prepaidProgramDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     *     
     */
    public void setPrepaidProgramDetail(PrePaidProgramQualifier.PrepaidProgramDetail value) {
        this.prepaidProgramDetail = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AirlineID"/&gt;
     *           &lt;element name="Certificate" maxOccurs="unbounded"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;sequence&gt;
     *                     &lt;element name="Number"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;simpleContent&gt;
     *                           &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
     *                             &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
     *                           &lt;/extension&gt;
     *                         &lt;/simpleContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                     &lt;element name="Application" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ContactAppSimpleType" minOccurs="0"/&gt;
     *                     &lt;element name="EffectivePeriod" minOccurs="0"&gt;
     *                       &lt;complexType&gt;
     *                         &lt;complexContent&gt;
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                             &lt;sequence&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearPeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearMonthPeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TimePeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}QuarterPeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MonthPeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DayPeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimePeriod"/&gt;
     *                               &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DatePeriod"/&gt;
     *                             &lt;/sequence&gt;
     *                           &lt;/restriction&gt;
     *                         &lt;/complexContent&gt;
     *                       &lt;/complexType&gt;
     *                     &lt;/element&gt;
     *                   &lt;/sequence&gt;
     *                   &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *         &lt;sequence&gt;
     *           &lt;element name="ProgramName"&gt;
     *             &lt;complexType&gt;
     *               &lt;simpleContent&gt;
     *                 &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
     *                 &lt;/extension&gt;
     *               &lt;/simpleContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *           &lt;element name="ProgramCode" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}CodesetValueSimpleType" minOccurs="0"/&gt;
     *           &lt;element name="Holder" minOccurs="0"&gt;
     *             &lt;complexType&gt;
     *               &lt;complexContent&gt;
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                   &lt;choice&gt;
     *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgencyID"/&gt;
     *                     &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PartnerID"/&gt;
     *                   &lt;/choice&gt;
     *                 &lt;/restriction&gt;
     *               &lt;/complexContent&gt;
     *             &lt;/complexType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "airlineID",
        "certificate",
        "programName",
        "programCode",
        "holder"
    })
    public static class PrepaidProgramDetail {

        @XmlElement(name = "AirlineID", required = true)
        protected AirlineID airlineID;
        @XmlElement(name = "Certificate", required = true)
        protected List<PrePaidProgramQualifier.PrepaidProgramDetail.Certificate> certificate;
        @XmlElement(name = "ProgramName", required = true)
        protected PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName programName;
        @XmlElement(name = "ProgramCode")
        protected String programCode;
        @XmlElement(name = "Holder")
        protected PrePaidProgramQualifier.PrepaidProgramDetail.Holder holder;

        /**
         * Program issuing airline designator code. Example: BA
         * 
         * Encoding Scheme: IATA/ A4A (two to three character) Airline Designator Code
         * 
         * @return
         *     possible object is
         *     {@link AirlineID }
         *     
         */
        public AirlineID getAirlineID() {
            return airlineID;
        }

        /**
         * Sets the value of the airlineID property.
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineID }
         *     
         */
        public void setAirlineID(AirlineID value) {
            this.airlineID = value;
        }

        /**
         * Gets the value of the certificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the certificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate }
         * 
         * 
         */
        public List<PrePaidProgramQualifier.PrepaidProgramDetail.Certificate> getCertificate() {
            if (certificate == null) {
                certificate = new ArrayList<PrePaidProgramQualifier.PrepaidProgramDetail.Certificate>();
            }
            return this.certificate;
        }

        /**
         * Gets the value of the programName property.
         * 
         * @return
         *     possible object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
         *     
         */
        public PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName getProgramName() {
            return programName;
        }

        /**
         * Sets the value of the programName property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
         *     
         */
        public void setProgramName(PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName value) {
            this.programName = value;
        }

        /**
         * Gets the value of the programCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramCode() {
            return programCode;
        }

        /**
         * Sets the value of the programCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramCode(String value) {
            this.programCode = value;
        }

        /**
         * Gets the value of the holder property.
         * 
         * @return
         *     possible object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
         *     
         */
        public PrePaidProgramQualifier.PrepaidProgramDetail.Holder getHolder() {
            return holder;
        }

        /**
         * Sets the value of the holder property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
         *     
         */
        public void setHolder(PrePaidProgramQualifier.PrepaidProgramDetail.Holder value) {
            this.holder = value;
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
         *         &lt;element name="Number"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
         *                 &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Application" type="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ContactAppSimpleType" minOccurs="0"/&gt;
         *         &lt;element name="EffectivePeriod" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearMonthPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TimePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}QuarterPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MonthPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DayPeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimePeriod"/&gt;
         *                   &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DatePeriod"/&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "number",
            "application",
            "effectivePeriod"
        })
        public static class Certificate {

            @XmlElement(name = "Number", required = true)
            protected PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number number;
            @XmlElement(name = "Application")
            protected String application;
            @XmlElement(name = "EffectivePeriod")
            protected PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod effectivePeriod;
            @XmlAttribute(name = "refs")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String refs;

            /**
             * Gets the value of the number property.
             * 
             * @return
             *     possible object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
             *     
             */
            public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number getNumber() {
                return number;
            }

            /**
             * Sets the value of the number property.
             * 
             * @param value
             *     allowed object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
             *     
             */
            public void setNumber(PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number value) {
                this.number = value;
            }

            /**
             * Gets the value of the application property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getApplication() {
                return application;
            }

            /**
             * Sets the value of the application property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setApplication(String value) {
                this.application = value;
            }

            /**
             * Gets the value of the effectivePeriod property.
             * 
             * @return
             *     possible object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
             *     
             */
            public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod getEffectivePeriod() {
                return effectivePeriod;
            }

            /**
             * Sets the value of the effectivePeriod property.
             * 
             * @param value
             *     allowed object is
             *     {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
             *     
             */
            public void setEffectivePeriod(PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod value) {
                this.effectivePeriod = value;
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
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}YearMonthPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}TimePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}QuarterPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}MonthPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DayPeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DateTimePeriod"/&gt;
             *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}DatePeriod"/&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "yearPeriod",
                "yearMonthPeriod",
                "timePeriod",
                "quarterPeriod",
                "monthPeriod",
                "dayPeriod",
                "dateTimePeriod",
                "datePeriod"
            })
            public static class EffectivePeriod {

                @XmlElement(name = "YearPeriod", required = true)
                protected YearPeriodRepType yearPeriod;
                @XmlElement(name = "YearMonthPeriod", required = true)
                protected YearMonthPeriodRepType yearMonthPeriod;
                @XmlElement(name = "TimePeriod", required = true)
                protected TimePeriodRepType timePeriod;
                @XmlElement(name = "QuarterPeriod", required = true)
                protected QuarterPeriodRepType quarterPeriod;
                @XmlElement(name = "MonthPeriod", required = true)
                protected MonthPeriodRepType monthPeriod;
                @XmlElement(name = "DayPeriod", required = true)
                protected DayPeriodRepType dayPeriod;
                @XmlElement(name = "DateTimePeriod", required = true)
                protected DateTimePeriodRepType dateTimePeriod;
                @XmlElement(name = "DatePeriod", required = true)
                protected DatePeriodRepType datePeriod;

                /**
                 * Gets the value of the yearPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public YearPeriodRepType getYearPeriod() {
                    return yearPeriod;
                }

                /**
                 * Sets the value of the yearPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearPeriodRepType }
                 *     
                 */
                public void setYearPeriod(YearPeriodRepType value) {
                    this.yearPeriod = value;
                }

                /**
                 * Gets the value of the yearMonthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public YearMonthPeriodRepType getYearMonthPeriod() {
                    return yearMonthPeriod;
                }

                /**
                 * Sets the value of the yearMonthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link YearMonthPeriodRepType }
                 *     
                 */
                public void setYearMonthPeriod(YearMonthPeriodRepType value) {
                    this.yearMonthPeriod = value;
                }

                /**
                 * Gets the value of the timePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public TimePeriodRepType getTimePeriod() {
                    return timePeriod;
                }

                /**
                 * Sets the value of the timePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimePeriodRepType }
                 *     
                 */
                public void setTimePeriod(TimePeriodRepType value) {
                    this.timePeriod = value;
                }

                /**
                 * Gets the value of the quarterPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public QuarterPeriodRepType getQuarterPeriod() {
                    return quarterPeriod;
                }

                /**
                 * Sets the value of the quarterPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link QuarterPeriodRepType }
                 *     
                 */
                public void setQuarterPeriod(QuarterPeriodRepType value) {
                    this.quarterPeriod = value;
                }

                /**
                 * Gets the value of the monthPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public MonthPeriodRepType getMonthPeriod() {
                    return monthPeriod;
                }

                /**
                 * Sets the value of the monthPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MonthPeriodRepType }
                 *     
                 */
                public void setMonthPeriod(MonthPeriodRepType value) {
                    this.monthPeriod = value;
                }

                /**
                 * Gets the value of the dayPeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public DayPeriodRepType getDayPeriod() {
                    return dayPeriod;
                }

                /**
                 * Sets the value of the dayPeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DayPeriodRepType }
                 *     
                 */
                public void setDayPeriod(DayPeriodRepType value) {
                    this.dayPeriod = value;
                }

                /**
                 * Gets the value of the dateTimePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public DateTimePeriodRepType getDateTimePeriod() {
                    return dateTimePeriod;
                }

                /**
                 * Sets the value of the dateTimePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DateTimePeriodRepType }
                 *     
                 */
                public void setDateTimePeriod(DateTimePeriodRepType value) {
                    this.dateTimePeriod = value;
                }

                /**
                 * Gets the value of the datePeriod property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public DatePeriodRepType getDatePeriod() {
                    return datePeriod;
                }

                /**
                 * Sets the value of the datePeriod property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DatePeriodRepType }
                 *     
                 */
                public void setDatePeriod(DatePeriodRepType value) {
                    this.datePeriod = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;simpleContent&gt;
             *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
             *       &lt;attGroup ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}ObjAssociationAttrGroup"/&gt;
             *     &lt;/extension&gt;
             *   &lt;/simpleContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Number {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "refs")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String refs;

                /**
                 * A data type for Proper Name size constraint.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Sets the value of the value property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
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
         *       &lt;choice&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}AgencyID"/&gt;
         *         &lt;element ref="{http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS}PartnerID"/&gt;
         *       &lt;/choice&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "agencyID",
            "partnerID"
        })
        public static class Holder {

            @XmlElement(name = "AgencyID")
            protected AgencyIDType agencyID;
            @XmlElement(name = "PartnerID")
            protected PartnerCompanyIDType partnerID;

            /**
             * Gets the value of the agencyID property.
             * 
             * @return
             *     possible object is
             *     {@link AgencyIDType }
             *     
             */
            public AgencyIDType getAgencyID() {
                return agencyID;
            }

            /**
             * Sets the value of the agencyID property.
             * 
             * @param value
             *     allowed object is
             *     {@link AgencyIDType }
             *     
             */
            public void setAgencyID(AgencyIDType value) {
                this.agencyID = value;
            }

            /**
             * Gets the value of the partnerID property.
             * 
             * @return
             *     possible object is
             *     {@link PartnerCompanyIDType }
             *     
             */
            public PartnerCompanyIDType getPartnerID() {
                return partnerID;
            }

            /**
             * Sets the value of the partnerID property.
             * 
             * @param value
             *     allowed object is
             *     {@link PartnerCompanyIDType }
             *     
             */
            public void setPartnerID(PartnerCompanyIDType value) {
                this.partnerID = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;simpleContent&gt;
         *     &lt;extension base="&lt;http://www.iata.org/IATA/2015/00/2018.1/OrderViewRS&gt;ProperNameSimpleType"&gt;
         *     &lt;/extension&gt;
         *   &lt;/simpleContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class ProgramName {

            @XmlValue
            protected String value;

            /**
             * A data type for Proper Name size constraint.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

        }

    }

}
