
package com.springboot.dto.offerpricers;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.springboot.dto.offerpricers package.
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AugmentationPoint_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AugmentationPoint");
    private final static QName _Month_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Month");
    private final static QName _DatePeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DatePeriod");
    private final static QName _DateTimePeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DateTimePeriod");
    private final static QName _DayPeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DayPeriod");
    private final static QName _MonthPeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MonthPeriod");
    private final static QName _QuarterPeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "QuarterPeriod");
    private final static QName _TimePeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TimePeriod");
    private final static QName _YearPeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "YearPeriod");
    private final static QName _YearMonthPeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "YearMonthPeriod");
    private final static QName _AddressCore_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AddressCore");
    private final static QName _AddressDetail_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AddressDetail");
    private final static QName _PaymentAddress_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentAddress");
    private final static QName _SimpleAddress_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SimpleAddress");
    private final static QName _StructuredAddress_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StructuredAddress");
    private final static QName _Attributes_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Attributes");
    private final static QName _AllowanceDescription_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AllowanceDescription");
    private final static QName _DimensionAllowance_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DimensionAllowance");
    private final static QName _CityName_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CityName");
    private final static QName _AddressContact_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AddressContact");
    private final static QName _EmailContact_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EmailContact");
    private final static QName _PhoneContact_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PhoneContact");
    private final static QName _PhoneNumber_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PhoneNumber");
    private final static QName _OtherContactMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OtherContactMethod");
    private final static QName _Commission_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Commission");
    private final static QName _CurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CurrencyAmount");
    private final static QName _EncodedCurrencyAmount_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EncodedCurrencyAmount");
    private final static QName _OriginDestinationReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OriginDestinationReference");
    private final static QName _DescriptionReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DescriptionReferences");
    private final static QName _Direction_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Direction");
    private final static QName _DiscountAmount_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DiscountAmount");
    private final static QName _DiscountPercent_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DiscountPercent");
    private final static QName _InstantPurchase_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "InstantPurchase");
    private final static QName _LanguageCode_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "LanguageCode");
    private final static QName _NodePath_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "NodePath");
    private final static QName _BankAccount_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BankAccount");
    private final static QName _DirectBill_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DirectBill");
    private final static QName _Remarks_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Remarks");
    private final static QName _PaymentCard_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentCard");
    private final static QName _Penalty_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Penalty");
    private final static QName _DetailCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DetailCurrencyPrice");
    private final static QName _AwardPricing_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AwardPricing");
    private final static QName _CombinationPricing_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CombinationPricing");
    private final static QName _EncodedCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EncodedCurrencyPrice");
    private final static QName _SimpleCurrencyPrice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SimpleCurrencyPrice");
    private final static QName _CurrencyAmountValue_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CurrencyAmountValue");
    private final static QName _PercentageValue_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PercentageValue");
    private final static QName _ShoppingResponseID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ShoppingResponseID");
    private final static QName _TaxExemption_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TaxExemption");
    private final static QName _TicketDesig_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TicketDesig");
    private final static QName _BilateralTimeLimits_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BilateralTimeLimits");
    private final static QName _PaymentTimeLimit_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentTimeLimit");
    private final static QName _PriceGuaranteeTimeLimits_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PriceGuaranteeTimeLimits");
    private final static QName _RetailerID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RetailerID");
    private final static QName _MarketingCarrierAirline_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MarketingCarrierAirline");
    private final static QName _ValidatingCarrier_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ValidatingCarrier");
    private final static QName _AggregatorID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AggregatorID");
    private final static QName _RoleOfIntermediaryReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RoleOfIntermediaryReference");
    private final static QName _SystemID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SystemID");
    private final static QName _AgentUser_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AgentUser");
    private final static QName _AgencyID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AgencyID");
    private final static QName _AgentUserID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AgentUserID");
    private final static QName _PartnerID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PartnerID");
    private final static QName _Document_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Document");
    private final static QName _DefaultPolicy_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DefaultPolicy");
    private final static QName _PolicyAugmentation_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PolicyAugmentation");
    private final static QName _PolicyLink_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PolicyLink");
    private final static QName _PointOfSale_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PointOfSale");
    private final static QName _Party_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Party");
    private final static QName _ORASender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ORA_Sender");
    private final static QName _POASender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "POA_Sender");
    private final static QName _AggregatorSender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AggregatorSender");
    private final static QName _AgentUserSender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AgentUserSender");
    private final static QName _EnabledSystemSender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EnabledSystemSender");
    private final static QName _MarketingCarrierSender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MarketingCarrierSender");
    private final static QName _OperatingCarrierSender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OperatingCarrierSender");
    private final static QName _RetailPartnerSender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RetailPartnerSender");
    private final static QName _TravelAgencySender_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TravelAgencySender");
    private final static QName _AggregatorRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AggregatorRecipient");
    private final static QName _AgentUserRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AgentUserRecipient");
    private final static QName _EnabledSystemRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EnabledSystemRecipient");
    private final static QName _MarketingCarrierRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MarketingCarrierRecipient");
    private final static QName _OperatingCarrierRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OperatingCarrierRecipient");
    private final static QName _ORARecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ORA_Recipient");
    private final static QName _POARecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "POA_Recipient");
    private final static QName _RetailPartnerRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RetailPartnerRecipient");
    private final static QName _TravelAgencyRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TravelAgencyRecipient");
    private final static QName _AggregatorParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AggregatorParticipant");
    private final static QName _EnabledSystemParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EnabledSystemParticipant");
    private final static QName _MarketingCarrierParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MarketingCarrierParticipant");
    private final static QName _OperatingCarrierParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OperatingCarrierParticipant");
    private final static QName _ORAParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ORA_Participant");
    private final static QName _POAParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "POA_Participant");
    private final static QName _RetailSupplierParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RetailSupplierParticipant");
    private final static QName _TravelAgencyParticipant_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TravelAgencyParticipant");
    private final static QName _Errors_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Errors");
    private final static QName _Alerts_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Alerts");
    private final static QName _InventoryDiscrepancyAlert_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "InventoryDiscrepancyAlert");
    private final static QName _PINAuthenticationAlert_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PIN_AuthenticationAlert");
    private final static QName _SecurePaymentAlert_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SecurePaymentAlert");
    private final static QName _InventoryGuaranteeNotif_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "InventoryGuaranteeNotif");
    private final static QName _PaymentRulesNotice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentRulesNotice");
    private final static QName _PricingParametersNotice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PricingParametersNotice");
    private final static QName _ServiceFilterNotice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceFilterNotice");
    private final static QName _TaxExemptionNotice_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TaxExemptionNotice");
    private final static QName _BagDisclosureList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BagDisclosureList");
    private final static QName _ContentSourceList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ContentSourceList");
    private final static QName _DisclosureList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DisclosureList");
    private final static QName _ClassOfServiceList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ClassOfServiceList");
    private final static QName _MediaList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MediaList");
    private final static QName _InstructionsList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "InstructionsList");
    private final static QName _PenaltyList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PenaltyList");
    private final static QName _TermsList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TermsList");
    private final static QName _PriceClassList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PriceClassList");
    private final static QName _ServiceBundleList_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceBundleList");
    private final static QName _FareCode_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareCode");
    private final static QName _FareBasisCode_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareBasisCode");
    private final static QName _Fare_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Fare");
    private final static QName _FareDetail_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareDetail");
    private final static QName _FareRules_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareRules");
    private final static QName _TourCode_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TourCode");
    private final static QName _FareBasisCityPair_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareBasisCityPair");
    private final static QName _FareFiledIn_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareFiledIn");
    private final static QName _FareInd_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareInd");
    private final static QName _FareRuleCategory_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareRuleCategory");
    private final static QName _FareTextInd_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareTextInd");
    private final static QName _ClassOfService_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ClassOfService");
    private final static QName _StopLocations_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StopLocations");
    private final static QName _Arrival_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Arrival");
    private final static QName _DepartureDate_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DepartureDate");
    private final static QName _FlightDistance_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlightDistance");
    private final static QName _FlightDuration_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlightDuration");
    private final static QName _TotalJourney_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TotalJourney");
    private final static QName _FlightStatus_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlightStatus");
    private final static QName _Frequency_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Frequency");
    private final static QName _FlightMileage_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlightMileage");
    private final static QName _FlightSegmentType_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlightSegmentType");
    private final static QName _Equipment_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Equipment");
    private final static QName _OriginDestinationReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OriginDestinationReferences");
    private final static QName _OfferItemID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferItemID");
    private final static QName _OrderItemID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OrderItemID");
    private final static QName _BagDisclosureReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BagDisclosureReferences");
    private final static QName _CheckedBagReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CheckedBagReferences");
    private final static QName _CarryOnReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CarryOnReferences");
    private final static QName _BagDisclosureKey_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BagDisclosureKey");
    private final static QName _EquivalentIDKey_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EquivalentID_Key");
    private final static QName _OriginDestinationKey_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OriginDestinationKey");
    private final static QName _SegmentKey_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SegmentKey");
    private final static QName _GroupReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "GroupReference");
    private final static QName _MediaGroupreference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MediaGroupreference");
    private final static QName _MediaItemReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MediaItemReference");
    private final static QName _OfferReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferReferences");
    private final static QName _OfferInstructionReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferInstructionReferences");
    private final static QName _OfferPenaltyReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferPenaltyReferences");
    private final static QName _OfferTermReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferTermReferences");
    private final static QName _PassengerReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PassengerReference");
    private final static QName _PassengerReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PassengerReferences");
    private final static QName _PriceClassReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PriceClassReference");
    private final static QName _SeatReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SeatReference");
    private final static QName _ServiceReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceReference");
    private final static QName _ServiceReferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceReferences");
    private final static QName _BundleReference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BundleReference");
    private final static QName _AddressMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AddressMetadata");
    private final static QName _AircraftMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AircraftMetadata");
    private final static QName _AirportMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AirportMetadata");
    private final static QName _CityMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CityMetadata");
    private final static QName _CodesetMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CodesetMetadata");
    private final static QName _ContactMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ContactMetadata");
    private final static QName _ContentMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ContentMetadata");
    private final static QName _CountryMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CountryMetadata");
    private final static QName _DescriptionMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DescriptionMetadata");
    private final static QName _EquivalentIDMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EquivalentID_Metadata");
    private final static QName _LanguageMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "LanguageMetadata");
    private final static QName _MediaMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MediaMetadata");
    private final static QName _PaymentCardMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentCardMetadata");
    private final static QName _PaymentFormMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentFormMetadata");
    private final static QName _PriceMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PriceMetadata");
    private final static QName _RuleMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RuleMetadata");
    private final static QName _StateProvMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StateProvMetadata");
    private final static QName _ZoneMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ZoneMetadata");
    private final static QName _CheckedBagMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CheckedBagMetadata");
    private final static QName _CarryOnBagMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CarryOnBagMetadata");
    private final static QName _BaggageDisclosureMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BaggageDisclosureMetadata");
    private final static QName _BaggageDetailMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BaggageDetailMetadata");
    private final static QName _BaggageQueryMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BaggageQueryMetadata");
    private final static QName _ItineraryMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ItineraryMetadata");
    private final static QName _DirectionMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DirectionMetadata");
    private final static QName _DisclosureMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DisclosureMetadata");
    private final static QName _OfferMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferMetadata");
    private final static QName _OfferInstructionMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferInstructionMetadata");
    private final static QName _OfferPenaltyMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferPenaltyMetadata");
    private final static QName _OfferTermsMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferTermsMetadata");
    private final static QName _DiscountMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DiscountMetadata");
    private final static QName _BaggagePricingQualifier_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BaggagePricingQualifier");
    private final static QName _OrderKeys_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OrderKeys");
    private final static QName _PaymentCardQualifiers_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentCardQualifiers");
    private final static QName _ServiceQualifier_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceQualifier");
    private final static QName _SocialMediaQualifiers_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SocialMediaQualifiers");
    private final static QName _SpecialFareQualifiers_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SpecialFareQualifiers");
    private final static QName _SpecialNeedQualifiers_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SpecialNeedQualifiers");
    private final static QName _TripPurposeQualifier_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TripPurposeQualifier");
    private final static QName _SeatMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SeatMetadata");
    private final static QName _SeatMapMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SeatMapMetadata");
    private final static QName _PassengerMetadata_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PassengerMetadata");
    private final static QName _AssociatedService_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AssociatedService");
    private final static QName _AssociatedPassenger_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AssociatedPassenger");
    private final static QName _IncludedService_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "IncludedService");
    private final static QName _OfferDetailAssociation_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OfferDetailAssociation");
    private final static QName _OtherAssociation_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OtherAssociation");
    private final static QName _ClassOfServiceUpgrade_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ClassOfServiceUpgrade");
    private final static QName _FreeFormTextInstruction_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FreeFormTextInstruction");
    private final static QName _InventoryGuarantee_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "InventoryGuarantee");
    private final static QName _Match_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Match");
    private final static QName _PTCPriced_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PTC_Priced");
    private final static QName _AllOffersSnapshot_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AllOffersSnapshot");
    private final static QName _AirlineOfferSnapshot_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AirlineOfferSnapshot");
    private final static QName _TicketByTimeLimit_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TicketByTimeLimit");
    private final static QName _Associations_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Associations");
    private final static QName _OrderAssociations_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OrderAssociations");
    private final static QName _OrderCommision_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OrderCommision");
    private final static QName _OrderID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OrderID");
    private final static QName _BaggageItem_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BaggageItem");
    private final static QName _DetailedFlightItem_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DetailedFlightItem");
    private final static QName _OtherItem_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OtherItem");
    private final static QName _BankAccountMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BankAccountMethod");
    private final static QName _CashMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CashMethod");
    private final static QName _DirectBillMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DirectBillMethod");
    private final static QName _MiscChargeMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MiscChargeMethod");
    private final static QName _OtherMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OtherMethod");
    private final static QName _PaymentCardMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentCardMethod");
    private final static QName _RedemptionMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RedemptionMethod");
    private final static QName _VoucherMethod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "VoucherMethod");
    private final static QName _AltBaggageOffer_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AltBaggageOffer");
    private final static QName _AltPricedFlightOffer_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AltPricedFlightOffer");
    private final static QName _AltOtherOffer_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AltOtherOffer");
    private final static QName _AltSeatOffer_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AltSeatOffer");
    private final static QName _ItemStatus_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ItemStatus");
    private final static QName _CarrierFeeInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CarrierFeeInfo");
    private final static QName _AddlReferenceID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AddlReferenceID");
    private final static QName _CheckedInAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CheckedInAirlineInfo");
    private final static QName _CurrentAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CurrentAirlineInfo");
    private final static QName _FlownAirlineInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlownAirlineInfo");
    private final static QName _InConnectionWithInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "InConnectionWithInfo");
    private final static QName _TicketDocQuantity_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TicketDocQuantity");
    private final static QName _BaseFare_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "BaseFare");
    private final static QName _EquivFare_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "EquivFare");
    private final static QName _FareInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FareInfo");
    private final static QName _Total_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Total");
    private final static QName _UnstructuredFareCalcInfo_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "UnstructuredFareCalcInfo");
    private final static QName _PaymentForm_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PaymentForm");
    private final static QName _RFIC_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "RFIC");
    private final static QName _AirportFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AirportFulfillmentLocation");
    private final static QName _OtherFulfillmentLocation_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OtherFulfillmentLocation");
    private final static QName _ServiceFulfillment_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceFulfillment");
    private final static QName _ServiceCoupon_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceCoupon");
    private final static QName _ServiceItemQuantityRules_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceItemQuantityRules");
    private final static QName _ServiceID_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ServiceID");
    private final static QName _AirportCityDeparture_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AirportCityDeparture");
    private final static QName _AirportCityArrival_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AirportCityArrival");
    private final static QName _CountryDeparture_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CountryDeparture");
    private final static QName _CountryArrival_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CountryArrival");
    private final static QName _ReferencePointDeparture_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ReferencePointDeparture");
    private final static QName _ReferencePointArrival_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ReferencePointArrival");
    private final static QName _StateProvDeparture_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StateProvDeparture");
    private final static QName _StateProvArrival_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StateProvArrival");
    private final static QName _LeadDatePeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "LeadDatePeriod");
    private final static QName _LeadTimePeriod_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "LeadTimePeriod");
    private final static QName _DiscountProgramQualifier_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "DiscountProgramQualifier");
    private final static QName _StayPeriodDateRange_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StayPeriodDateRange");
    private final static QName _StayPeriodSeason_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "StayPeriodSeason");
    private final static QName _GroupBudget_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "GroupBudget");
    private final static QName _PerPersonBudget_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PerPersonBudget");
    private final static QName _AirlinePreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AirlinePreferences");
    private final static QName _AlliancePreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "AlliancePreferences");
    private final static QName _CabinPreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "CabinPreferences");
    private final static QName _FlightPreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FlightPreferences");
    private final static QName _FarePreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "FarePreferences");
    private final static QName _PricingMethodPreference_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "PricingMethodPreference");
    private final static QName _SegMaxTimePreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "SegMaxTimePreferences");
    private final static QName _TransferPreferences_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TransferPreferences");
    private final static QName _TripTime_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TripTime");
    private final static QName _TripDistance_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "TripDistance");
    private final static QName _OrderListParameters_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "OrderListParameters");
    private final static QName _ReshopParameters_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "ReshopParameters");
    private final static QName _OfferGroupSizeTypeMinimum_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Minimum");
    private final static QName _OfferGroupSizeTypeMaximum_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Maximum");
    private final static QName _ListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MinimumQuantity");
    private final static QName _ListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "MaximumQuantity");
    private final static QName _MsgPartiesTypeParticipants_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Participants");
    private final static QName _MsgPartiesTypeRecipient_QNAME = new QName("http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", "Recipient");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.springboot.dto.offerpricers
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType }
     * 
     */
    public CarryOnAllowanceType createCarryOnAllowanceType() {
        return new CarryOnAllowanceType();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType }
     * 
     */
    public CheckedBagAllowanceType createCheckedBagAllowanceType() {
        return new CheckedBagAllowanceType();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType }
     * 
     */
    public BagAllowancePieceType createBagAllowancePieceType() {
        return new BagAllowancePieceType();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType }
     * 
     */
    public BagAllowanceWeightType createBagAllowanceWeightType() {
        return new BagAllowanceWeightType();
    }

    /**
     * Create an instance of {@link BookingReferenceType }
     * 
     */
    public BookingReferenceType createBookingReferenceType() {
        return new BookingReferenceType();
    }

    /**
     * Create an instance of {@link Contacts }
     * 
     */
    public Contacts createContacts() {
        return new Contacts();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link KeyWordType }
     * 
     */
    public KeyWordType createKeyWordType() {
        return new KeyWordType();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption }
     * 
     */
    public LoyaltyRedemption createLoyaltyRedemption() {
        return new LoyaltyRedemption();
    }

    /**
     * Create an instance of {@link Voucher }
     * 
     */
    public Voucher createVoucher() {
        return new Voucher();
    }

    /**
     * Create an instance of {@link PositionType }
     * 
     */
    public PositionType createPositionType() {
        return new PositionType();
    }

    /**
     * Create an instance of {@link PrimaryContact }
     * 
     */
    public PrimaryContact createPrimaryContact() {
        return new PrimaryContact();
    }

    /**
     * Create an instance of {@link Policies }
     * 
     */
    public Policies createPolicies() {
        return new Policies();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType }
     * 
     */
    public SecurePaymentPaxInfoType createSecurePaymentPaxInfoType() {
        return new SecurePaymentPaxInfoType();
    }

    /**
     * Create an instance of {@link MarketingMessages }
     * 
     */
    public MarketingMessages createMarketingMessages() {
        return new MarketingMessages();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Notices }
     * 
     */
    public com.springboot.dto.offerpricers.Notices createNotices() {
        return new com.springboot.dto.offerpricers.Notices();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType }
     * 
     */
    public PriceVarianceRuleNoticeType createPriceVarianceRuleNoticeType() {
        return new PriceVarianceRuleNoticeType();
    }

    /**
     * Create an instance of {@link FareList }
     * 
     */
    public FareList createFareList() {
        return new FareList();
    }

    /**
     * Create an instance of {@link AdvanceTicketing }
     * 
     */
    public AdvanceTicketing createAdvanceTicketing() {
        return new AdvanceTicketing();
    }

    /**
     * Create an instance of {@link CorporateFare }
     * 
     */
    public CorporateFare createCorporateFare() {
        return new CorporateFare();
    }

    /**
     * Create an instance of {@link MinimumStay }
     * 
     */
    public MinimumStay createMinimumStay() {
        return new MinimumStay();
    }

    /**
     * Create an instance of {@link MaximumStay }
     * 
     */
    public MaximumStay createMaximumStay() {
        return new MaximumStay();
    }

    /**
     * Create an instance of {@link FareRulesRemarks }
     * 
     */
    public FareRulesRemarks createFareRulesRemarks() {
        return new FareRulesRemarks();
    }

    /**
     * Create an instance of {@link FileFareType }
     * 
     */
    public FileFareType createFileFareType() {
        return new FileFareType();
    }

    /**
     * Create an instance of {@link FlightDepartureType }
     * 
     */
    public FlightDepartureType createFlightDepartureType() {
        return new FlightDepartureType();
    }

    /**
     * Create an instance of {@link ResDateTime }
     * 
     */
    public ResDateTime createResDateTime() {
        return new ResDateTime();
    }

    /**
     * Create an instance of {@link FlightMetadataType }
     * 
     */
    public FlightMetadataType createFlightMetadataType() {
        return new FlightMetadataType();
    }

    /**
     * Create an instance of {@link V172PromotionType }
     * 
     */
    public V172PromotionType createV172PromotionType() {
        return new V172PromotionType();
    }

    /**
     * Create an instance of {@link SeatQualifier }
     * 
     */
    public SeatQualifier createSeatQualifier() {
        return new SeatQualifier();
    }

    /**
     * Create an instance of {@link OfferAssociationsType }
     * 
     */
    public OfferAssociationsType createOfferAssociationsType() {
        return new OfferAssociationsType();
    }

    /**
     * Create an instance of {@link OrderItemDetails }
     * 
     */
    public OrderItemDetails createOrderItemDetails() {
        return new OrderItemDetails();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.TimeLimits }
     * 
     */
    public com.springboot.dto.offerpricers.TimeLimits createTimeLimits() {
        return new com.springboot.dto.offerpricers.TimeLimits();
    }

    /**
     * Create an instance of {@link CouponAgentType }
     * 
     */
    public CouponAgentType createCouponAgentType() {
        return new CouponAgentType();
    }

    /**
     * Create an instance of {@link SecurityType }
     * 
     */
    public SecurityType createSecurityType() {
        return new SecurityType();
    }

    /**
     * Create an instance of {@link ServiceCombinationType }
     * 
     */
    public ServiceCombinationType createServiceCombinationType() {
        return new ServiceCombinationType();
    }

    /**
     * Create an instance of {@link IncentiveProgramType }
     * 
     */
    public IncentiveProgramType createIncentiveProgramType() {
        return new IncentiveProgramType();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier }
     * 
     */
    public PrePaidProgramQualifier createPrePaidProgramQualifier() {
        return new PrePaidProgramQualifier();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType }
     * 
     */
    public ServiceDefinitionType createServiceDefinitionType() {
        return new ServiceDefinitionType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.BookingInstructions }
     * 
     */
    public ServiceDefinitionType.BookingInstructions createServiceDefinitionTypeBookingInstructions() {
        return new ServiceDefinitionType.BookingInstructions();
    }

    /**
     * Create an instance of {@link OfferType }
     * 
     */
    public OfferType createOfferType() {
        return new OfferType();
    }

    /**
     * Create an instance of {@link JourneyOverviewType }
     * 
     */
    public JourneyOverviewType createJourneyOverviewType() {
        return new JourneyOverviewType();
    }

    /**
     * Create an instance of {@link EligibilityType }
     * 
     */
    public EligibilityType createEligibilityType() {
        return new EligibilityType();
    }

    /**
     * Create an instance of {@link OrdChangeMetadataType }
     * 
     */
    public OrdChangeMetadataType createOrdChangeMetadataType() {
        return new OrdChangeMetadataType();
    }

    /**
     * Create an instance of {@link OrdChangeMetadataType.Other }
     * 
     */
    public OrdChangeMetadataType.Other createOrdChangeMetadataTypeOther() {
        return new OrdChangeMetadataType.Other();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType }
     * 
     */
    public SeatAvailReqMetadataType createSeatAvailReqMetadataType() {
        return new SeatAvailReqMetadataType();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.Other }
     * 
     */
    public SeatAvailReqMetadataType.Other createSeatAvailReqMetadataTypeOther() {
        return new SeatAvailReqMetadataType.Other();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType }
     * 
     */
    public MessageParamsBaseType createMessageParamsBaseType() {
        return new MessageParamsBaseType();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType }
     * 
     */
    public SeatAvailReqParamsType createSeatAvailReqParamsType() {
        return new SeatAvailReqParamsType();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing }
     * 
     */
    public SeatAvailReqParamsType.Pricing createSeatAvailReqParamsTypePricing() {
        return new SeatAvailReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing.FeeExemption }
     * 
     */
    public SeatAvailReqParamsType.Pricing.FeeExemption createSeatAvailReqParamsTypePricingFeeExemption() {
        return new SeatAvailReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public SeatAvailReqParamsType.Pricing.FeeExemption.Fee createSeatAvailReqParamsTypePricingFeeExemptionFee() {
        return new SeatAvailReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType.CurrCodes }
     * 
     */
    public MessageParamsBaseType.CurrCodes createMessageParamsBaseTypeCurrCodes() {
        return new MessageParamsBaseType.CurrCodes();
    }

    /**
     * Create an instance of {@link OrdChangeParamsType }
     * 
     */
    public OrdChangeParamsType createOrdChangeParamsType() {
        return new OrdChangeParamsType();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType }
     * 
     */
    public SrvListReqMetadataType createSrvListReqMetadataType() {
        return new SrvListReqMetadataType();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.Other }
     * 
     */
    public SrvListReqMetadataType.Other createSrvListReqMetadataTypeOther() {
        return new SrvListReqMetadataType.Other();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType }
     * 
     */
    public SrvListResMetadataType createSrvListResMetadataType() {
        return new SrvListResMetadataType();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.Other }
     * 
     */
    public SrvListResMetadataType.Other createSrvListResMetadataTypeOther() {
        return new SrvListResMetadataType.Other();
    }

    /**
     * Create an instance of {@link SrvListResParamsType }
     * 
     */
    public SrvListResParamsType createSrvListResParamsType() {
        return new SrvListResParamsType();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing }
     * 
     */
    public SrvListResParamsType.Pricing createSrvListResParamsTypePricing() {
        return new SrvListResParamsType.Pricing();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing.FeeExemption }
     * 
     */
    public SrvListResParamsType.Pricing.FeeExemption createSrvListResParamsTypePricingFeeExemption() {
        return new SrvListResParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public SrvListResParamsType.Pricing.FeeExemption.Fee createSrvListResParamsTypePricingFeeExemptionFee() {
        return new SrvListResParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType }
     * 
     */
    public SeatAvailResMetadataType createSeatAvailResMetadataType() {
        return new SeatAvailResMetadataType();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.Other }
     * 
     */
    public SeatAvailResMetadataType.Other createSeatAvailResMetadataTypeOther() {
        return new SeatAvailResMetadataType.Other();
    }

    /**
     * Create an instance of {@link ItinReshopMetadataType }
     * 
     */
    public ItinReshopMetadataType createItinReshopMetadataType() {
        return new ItinReshopMetadataType();
    }

    /**
     * Create an instance of {@link ItinReshopMetadataType.Other }
     * 
     */
    public ItinReshopMetadataType.Other createItinReshopMetadataTypeOther() {
        return new ItinReshopMetadataType.Other();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType }
     * 
     */
    public FltPriceResMetadataType createFltPriceResMetadataType() {
        return new FltPriceResMetadataType();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.Other }
     * 
     */
    public FltPriceResMetadataType.Other createFltPriceResMetadataTypeOther() {
        return new FltPriceResMetadataType.Other();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType }
     * 
     */
    public FltPriceReqMetadataType createFltPriceReqMetadataType() {
        return new FltPriceReqMetadataType();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.Other }
     * 
     */
    public FltPriceReqMetadataType.Other createFltPriceReqMetadataTypeOther() {
        return new FltPriceReqMetadataType.Other();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType }
     * 
     */
    public FltPriceReqParamsType createFltPriceReqParamsType() {
        return new FltPriceReqParamsType();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing }
     * 
     */
    public FltPriceReqParamsType.Pricing createFltPriceReqParamsTypePricing() {
        return new FltPriceReqParamsType.Pricing();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing.FeeExemption }
     * 
     */
    public FltPriceReqParamsType.Pricing.FeeExemption createFltPriceReqParamsTypePricingFeeExemption() {
        return new FltPriceReqParamsType.Pricing.FeeExemption();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee }
     * 
     */
    public FltPriceReqParamsType.Pricing.FeeExemption.Fee createFltPriceReqParamsTypePricingFeeExemptionFee() {
        return new FltPriceReqParamsType.Pricing.FeeExemption.Fee();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType }
     * 
     */
    public AirShopResMetadataType createAirShopResMetadataType() {
        return new AirShopResMetadataType();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.Other }
     * 
     */
    public AirShopResMetadataType.Other createAirShopResMetadataTypeOther() {
        return new AirShopResMetadataType.Other();
    }

    /**
     * Create an instance of {@link OrdViewMetadataType }
     * 
     */
    public OrdViewMetadataType createOrdViewMetadataType() {
        return new OrdViewMetadataType();
    }

    /**
     * Create an instance of {@link OrdViewMetadataType.Other }
     * 
     */
    public OrdViewMetadataType.Other createOrdViewMetadataTypeOther() {
        return new OrdViewMetadataType.Other();
    }

    /**
     * Create an instance of {@link V172OfferItemType }
     * 
     */
    public V172OfferItemType createV172OfferItemType() {
        return new V172OfferItemType();
    }

    /**
     * Create an instance of {@link V172OfferItemType.Service }
     * 
     */
    public V172OfferItemType.Service createV172OfferItemTypeService() {
        return new V172OfferItemType.Service();
    }

    /**
     * Create an instance of {@link V172OfferItemType.Service.SelectedSeat }
     * 
     */
    public V172OfferItemType.Service.SelectedSeat createV172OfferItemTypeServiceSelectedSeat() {
        return new V172OfferItemType.Service.SelectedSeat();
    }

    /**
     * Create an instance of {@link V172OfferItemType.TotalPriceDetail }
     * 
     */
    public V172OfferItemType.TotalPriceDetail createV172OfferItemTypeTotalPriceDetail() {
        return new V172OfferItemType.TotalPriceDetail();
    }

    /**
     * Create an instance of {@link FeeSurchargeType }
     * 
     */
    public FeeSurchargeType createFeeSurchargeType() {
        return new FeeSurchargeType();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Breakdown }
     * 
     */
    public FeeSurchargeType.Breakdown createFeeSurchargeTypeBreakdown() {
        return new FeeSurchargeType.Breakdown();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType }
     * 
     */
    public ALaCarteV172OfferItemType createALaCarteV172OfferItemType() {
        return new ALaCarteV172OfferItemType();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.UnitPriceDetail }
     * 
     */
    public ALaCarteV172OfferItemType.UnitPriceDetail createALaCarteV172OfferItemTypeUnitPriceDetail() {
        return new ALaCarteV172OfferItemType.UnitPriceDetail();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.Eligibility }
     * 
     */
    public ALaCarteV172OfferItemType.Eligibility createALaCarteV172OfferItemTypeEligibility() {
        return new ALaCarteV172OfferItemType.Eligibility();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType }
     * 
     */
    public V172ServiceDefinitionType createV172ServiceDefinitionType() {
        return new V172ServiceDefinitionType();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.BookingInstructions }
     * 
     */
    public V172ServiceDefinitionType.BookingInstructions createV172ServiceDefinitionTypeBookingInstructions() {
        return new V172ServiceDefinitionType.BookingInstructions();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.ServiceBundle }
     * 
     */
    public V172ServiceDefinitionType.ServiceBundle createV172ServiceDefinitionTypeServiceBundle() {
        return new V172ServiceDefinitionType.ServiceBundle();
    }

    /**
     * Create an instance of {@link OrderRequestType }
     * 
     */
    public OrderRequestType createOrderRequestType() {
        return new OrderRequestType();
    }

    /**
     * Create an instance of {@link OrderRequestType.Offer }
     * 
     */
    public OrderRequestType.Offer createOrderRequestTypeOffer() {
        return new OrderRequestType.Offer();
    }

    /**
     * Create an instance of {@link OrderRequestType.Offer.OfferItem }
     * 
     */
    public OrderRequestType.Offer.OfferItem createOrderRequestTypeOfferOfferItem() {
        return new OrderRequestType.Offer.OfferItem();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType }
     * 
     */
    public NameChangeV172OfferItemType createNameChangeV172OfferItemType() {
        return new NameChangeV172OfferItemType();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType.Service }
     * 
     */
    public NameChangeV172OfferItemType.Service createNameChangeV172OfferItemTypeService() {
        return new NameChangeV172OfferItemType.Service();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType.TotalPriceDetail }
     * 
     */
    public NameChangeV172OfferItemType.TotalPriceDetail createNameChangeV172OfferItemTypeTotalPriceDetail() {
        return new NameChangeV172OfferItemType.TotalPriceDetail();
    }

    /**
     * Create an instance of {@link NonGeographicSpecificationType }
     * 
     */
    public NonGeographicSpecificationType createNonGeographicSpecificationType() {
        return new NonGeographicSpecificationType();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType }
     * 
     */
    public GeographicSpecificationType createGeographicSpecificationType() {
        return new GeographicSpecificationType();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType.Coordinates }
     * 
     */
    public GeographicSpecificationType.Coordinates createGeographicSpecificationTypeCoordinates() {
        return new GeographicSpecificationType.Coordinates();
    }

    /**
     * Create an instance of {@link ReissuedFlownType }
     * 
     */
    public ReissuedFlownType createReissuedFlownType() {
        return new ReissuedFlownType();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType }
     * 
     */
    public CouponFlightSegmentType createCouponFlightSegmentType() {
        return new CouponFlightSegmentType();
    }

    /**
     * Create an instance of {@link ReissuedFlownType.FlightCouponData }
     * 
     */
    public ReissuedFlownType.FlightCouponData createReissuedFlownTypeFlightCouponData() {
        return new ReissuedFlownType.FlightCouponData();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType }
     * 
     */
    public TaxCouponInfoType createTaxCouponInfoType() {
        return new TaxCouponInfoType();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument }
     * 
     */
    public TaxCouponInfoType.TicketDocument createTaxCouponInfoTypeTicketDocument() {
        return new TaxCouponInfoType.TicketDocument();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber createTaxCouponInfoTypeTicketDocumentCouponNumber() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber();
    }

    /**
     * Create an instance of {@link TaxDetailType }
     * 
     */
    public TaxDetailType createTaxDetailType() {
        return new TaxDetailType();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown }
     * 
     */
    public TaxDetailType.Breakdown createTaxDetailTypeBreakdown() {
        return new TaxDetailType.Breakdown();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax }
     * 
     */
    public TaxDetailType.Breakdown.Tax createTaxDetailTypeBreakdownTax() {
        return new TaxDetailType.Breakdown.Tax();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType }
     * 
     */
    public GroupFarePreferencesType createGroupFarePreferencesType() {
        return new GroupFarePreferencesType();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType.GroupFare }
     * 
     */
    public GroupFarePreferencesType.GroupFare createGroupFarePreferencesTypeGroupFare() {
        return new GroupFarePreferencesType.GroupFare();
    }

    /**
     * Create an instance of {@link QualifiersType }
     * 
     */
    public QualifiersType createQualifiersType() {
        return new QualifiersType();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType }
     * 
     */
    public SocialMediaQualifierType createSocialMediaQualifierType() {
        return new SocialMediaQualifierType();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType }
     * 
     */
    public ReferencePointQueryType createReferencePointQueryType() {
        return new ReferencePointQueryType();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity }
     * 
     */
    public ReferencePointQueryType.Proximity createReferencePointQueryTypeProximity() {
        return new ReferencePointQueryType.Proximity();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.ReferencePoints }
     * 
     */
    public ReferencePointQueryType.ReferencePoints createReferencePointQueryTypeReferencePoints() {
        return new ReferencePointQueryType.ReferencePoints();
    }

    /**
     * Create an instance of {@link ServicePriceType }
     * 
     */
    public ServicePriceType createServicePriceType() {
        return new ServicePriceType();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details }
     * 
     */
    public ServicePriceType.Details createServicePriceTypeDetails() {
        return new ServicePriceType.Details();
    }

    /**
     * Create an instance of {@link ServiceFilterType }
     * 
     */
    public ServiceFilterType createServiceFilterType() {
        return new ServiceFilterType();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType }
     * 
     */
    public ServiceDescriptionType createServiceDescriptionType() {
        return new ServiceDescriptionType();
    }

    /**
     * Create an instance of {@link ServiceEncodingType }
     * 
     */
    public ServiceEncodingType createServiceEncodingType() {
        return new ServiceEncodingType();
    }

    /**
     * Create an instance of {@link ServiceCoreType }
     * 
     */
    public ServiceCoreType createServiceCoreType() {
        return new ServiceCoreType();
    }

    /**
     * Create an instance of {@link ServiceAssocType }
     * 
     */
    public ServiceAssocType createServiceAssocType() {
        return new ServiceAssocType();
    }

    /**
     * Create an instance of {@link ServiceCoreType.BookingInstructions }
     * 
     */
    public ServiceCoreType.BookingInstructions createServiceCoreTypeBookingInstructions() {
        return new ServiceCoreType.BookingInstructions();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocType }
     * 
     */
    public ServiceOtherAssocType createServiceOtherAssocType() {
        return new ServiceOtherAssocType();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocType.OtherAssociation }
     * 
     */
    public ServiceOtherAssocType.OtherAssociation createServiceOtherAssocTypeOtherAssociation() {
        return new ServiceOtherAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link SeatMapMessageType }
     * 
     */
    public SeatMapMessageType createSeatMapMessageType() {
        return new SeatMapMessageType();
    }

    /**
     * Create an instance of {@link SeatDataType }
     * 
     */
    public SeatDataType createSeatDataType() {
        return new SeatDataType();
    }

    /**
     * Create an instance of {@link CabinCameraPosType }
     * 
     */
    public CabinCameraPosType createCabinCameraPosType() {
        return new CabinCameraPosType();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType }
     * 
     */
    public OrderV172PaymentMethodType createOrderV172PaymentMethodType() {
        return new OrderV172PaymentMethodType();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType.Associations }
     * 
     */
    public OrderV172PaymentMethodType.Associations createOrderV172PaymentMethodTypeAssociations() {
        return new OrderV172PaymentMethodType.Associations();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType.Promotions }
     * 
     */
    public OrderV172PaymentMethodType.Promotions createOrderV172PaymentMethodTypePromotions() {
        return new OrderV172PaymentMethodType.Promotions();
    }

    /**
     * Create an instance of {@link V172PaymentMethodType }
     * 
     */
    public V172PaymentMethodType createV172PaymentMethodType() {
        return new V172PaymentMethodType();
    }

    /**
     * Create an instance of {@link V172PaymentMethodType.Method }
     * 
     */
    public V172PaymentMethodType.Method createV172PaymentMethodTypeMethod() {
        return new V172PaymentMethodType.Method();
    }

    /**
     * Create an instance of {@link V172PaymentMethodType.Method.Promotions }
     * 
     */
    public V172PaymentMethodType.Method.Promotions createV172PaymentMethodTypeMethodPromotions() {
        return new V172PaymentMethodType.Method.Promotions();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType }
     * 
     */
    public OrderPaymentFormType createOrderPaymentFormType() {
        return new OrderPaymentFormType();
    }

    /**
     * Create an instance of {@link TicketDocumentType }
     * 
     */
    public TicketDocumentType createTicketDocumentType() {
        return new TicketDocumentType();
    }

    /**
     * Create an instance of {@link HistoryCouponInfoType }
     * 
     */
    public HistoryCouponInfoType createHistoryCouponInfoType() {
        return new HistoryCouponInfoType();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType }
     * 
     */
    public CouponSoldAirlineType createCouponSoldAirlineType() {
        return new CouponSoldAirlineType();
    }

    /**
     * Create an instance of {@link CouponEffectiveType }
     * 
     */
    public CouponEffectiveType createCouponEffectiveType() {
        return new CouponEffectiveType();
    }

    /**
     * Create an instance of {@link V172PenaltyType }
     * 
     */
    public V172PenaltyType createV172PenaltyType() {
        return new V172PenaltyType();
    }

    /**
     * Create an instance of {@link V172PenaltyType.Details }
     * 
     */
    public V172PenaltyType.Details createV172PenaltyTypeDetails() {
        return new V172PenaltyType.Details();
    }

    /**
     * Create an instance of {@link V172PenaltyType.Details.Detail }
     * 
     */
    public V172PenaltyType.Details.Detail createV172PenaltyTypeDetailsDetail() {
        return new V172PenaltyType.Details.Detail();
    }

    /**
     * Create an instance of {@link V172PenaltyType.Details.Detail.Amounts }
     * 
     */
    public V172PenaltyType.Details.Detail.Amounts createV172PenaltyTypeDetailsDetailAmounts() {
        return new V172PenaltyType.Details.Detail.Amounts();
    }

    /**
     * Create an instance of {@link V172PenaltyType.Details.Detail.Amounts.Amount }
     * 
     */
    public V172PenaltyType.Details.Detail.Amounts.Amount createV172PenaltyTypeDetailsDetailAmountsAmount() {
        return new V172PenaltyType.Details.Detail.Amounts.Amount();
    }

    /**
     * Create an instance of {@link V172RemarkType }
     * 
     */
    public V172RemarkType createV172RemarkType() {
        return new V172RemarkType();
    }

    /**
     * Create an instance of {@link PaymentProcessType }
     * 
     */
    public PaymentProcessType createPaymentProcessType() {
        return new PaymentProcessType();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Promotions }
     * 
     */
    public PaymentProcessType.Promotions createPaymentProcessTypePromotions() {
        return new PaymentProcessType.Promotions();
    }

    /**
     * Create an instance of {@link PaymentStatusType }
     * 
     */
    public PaymentStatusType createPaymentStatusType() {
        return new PaymentStatusType();
    }

    /**
     * Create an instance of {@link OrderOfferItemType }
     * 
     */
    public OrderOfferItemType createOrderOfferItemType() {
        return new OrderOfferItemType();
    }

    /**
     * Create an instance of {@link V172OrderItemType }
     * 
     */
    public V172OrderItemType createV172OrderItemType() {
        return new V172OrderItemType();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem }
     * 
     */
    public V172OrderItemType.OrderItem createV172OrderItemTypeOrderItem() {
        return new V172OrderItemType.OrderItem();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.Service }
     * 
     */
    public V172OrderItemType.OrderItem.Service createV172OrderItemTypeOrderItemService() {
        return new V172OrderItemType.OrderItem.Service();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.Service.SelectedSeat }
     * 
     */
    public V172OrderItemType.OrderItem.Service.SelectedSeat createV172OrderItemTypeOrderItemServiceSelectedSeat() {
        return new V172OrderItemType.OrderItem.Service.SelectedSeat();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.PriceDetail }
     * 
     */
    public V172OrderItemType.OrderItem.PriceDetail createV172OrderItemTypeOrderItemPriceDetail() {
        return new V172OrderItemType.OrderItem.PriceDetail();
    }

    /**
     * Create an instance of {@link V172OrderType }
     * 
     */
    public V172OrderType createV172OrderType() {
        return new V172OrderType();
    }

    /**
     * Create an instance of {@link V172OrderType.TimeLimits }
     * 
     */
    public V172OrderType.TimeLimits createV172OrderTypeTimeLimits() {
        return new V172OrderType.TimeLimits();
    }

    /**
     * Create an instance of {@link V172OrderType.OriginalOrder }
     * 
     */
    public V172OrderType.OriginalOrder createV172OrderTypeOriginalOrder() {
        return new V172OrderType.OriginalOrder();
    }

    /**
     * Create an instance of {@link V172OrderType.OriginalOrder.PriceQuotes }
     * 
     */
    public V172OrderType.OriginalOrder.PriceQuotes createV172OrderTypeOriginalOrderPriceQuotes() {
        return new V172OrderType.OriginalOrder.PriceQuotes();
    }

    /**
     * Create an instance of {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote }
     * 
     */
    public V172OrderType.OriginalOrder.PriceQuotes.PriceQuote createV172OrderTypeOriginalOrderPriceQuotesPriceQuote() {
        return new V172OrderType.OriginalOrder.PriceQuotes.PriceQuote();
    }

    /**
     * Create an instance of {@link OtherOrderAssocType }
     * 
     */
    public OtherOrderAssocType createOtherOrderAssocType() {
        return new OtherOrderAssocType();
    }

    /**
     * Create an instance of {@link OfferItemTimeLimitSetType }
     * 
     */
    public OfferItemTimeLimitSetType createOfferItemTimeLimitSetType() {
        return new OfferItemTimeLimitSetType();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType }
     * 
     */
    public OfferTimeLimitSetType createOfferTimeLimitSetType() {
        return new OfferTimeLimitSetType();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OtherLimits }
     * 
     */
    public OfferTimeLimitSetType.OtherLimits createOfferTimeLimitSetTypeOtherLimits() {
        return new OfferTimeLimitSetType.OtherLimits();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType }
     * 
     */
    public OfferValidPeriodType createOfferValidPeriodType() {
        return new OfferValidPeriodType();
    }

    /**
     * Create an instance of {@link OfferIncentiveType }
     * 
     */
    public OfferIncentiveType createOfferIncentiveType() {
        return new OfferIncentiveType();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive }
     * 
     */
    public OfferIncentiveType.Incentive createOfferIncentiveTypeIncentive() {
        return new OfferIncentiveType.Incentive();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType }
     * 
     */
    public OfferPriceLeadDetailType createOfferPriceLeadDetailType() {
        return new OfferPriceLeadDetailType();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail createOfferPriceLeadDetailTypePriceDetail() {
        return new OfferPriceLeadDetailType.PriceDetail();
    }

    /**
     * Create an instance of {@link OfferPriceLeadType }
     * 
     */
    public OfferPriceLeadType createOfferPriceLeadType() {
        return new OfferPriceLeadType();
    }

    /**
     * Create an instance of {@link SeatOfferCoreType }
     * 
     */
    public SeatOfferCoreType createSeatOfferCoreType() {
        return new SeatOfferCoreType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferCoreType }
     * 
     */
    public PricedFlightOfferCoreType createPricedFlightOfferCoreType() {
        return new PricedFlightOfferCoreType();
    }

    /**
     * Create an instance of {@link OtherOfferCoreType }
     * 
     */
    public OtherOfferCoreType createOtherOfferCoreType() {
        return new OtherOfferCoreType();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType }
     * 
     */
    public BaggageOfferCoreType createBaggageOfferCoreType() {
        return new BaggageOfferCoreType();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetails }
     * 
     */
    public BaggageOfferCoreType.BagDetails createBaggageOfferCoreTypeBagDetails() {
        return new BaggageOfferCoreType.BagDetails();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetails.BagDetail }
     * 
     */
    public BaggageOfferCoreType.BagDetails.BagDetail createBaggageOfferCoreTypeBagDetailsBagDetail() {
        return new BaggageOfferCoreType.BagDetails.BagDetail();
    }

    /**
     * Create an instance of {@link V172OfferType }
     * 
     */
    public V172OfferType createV172OfferType() {
        return new V172OfferType();
    }

    /**
     * Create an instance of {@link PricedFlightOfferAssocType }
     * 
     */
    public PricedFlightOfferAssocType createPricedFlightOfferAssocType() {
        return new PricedFlightOfferAssocType();
    }

    /**
     * Create an instance of {@link ItineraryType }
     * 
     */
    public ItineraryType createItineraryType() {
        return new ItineraryType();
    }

    /**
     * Create an instance of {@link FlightType }
     * 
     */
    public FlightType createFlightType() {
        return new FlightType();
    }

    /**
     * Create an instance of {@link FlightType.Flight }
     * 
     */
    public FlightType.Flight createFlightTypeFlight() {
        return new FlightType.Flight();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType }
     * 
     */
    public FlightCabinCoreType createFlightCabinCoreType() {
        return new FlightCabinCoreType();
    }

    /**
     * Create an instance of {@link AircraftFeaturesQueryType }
     * 
     */
    public AircraftFeaturesQueryType createAircraftFeaturesQueryType() {
        return new AircraftFeaturesQueryType();
    }

    /**
     * Create an instance of {@link FlightOnlyType }
     * 
     */
    public FlightOnlyType createFlightOnlyType() {
        return new FlightOnlyType();
    }

    /**
     * Create an instance of {@link FlightDetailType }
     * 
     */
    public FlightDetailType createFlightDetailType() {
        return new FlightDetailType();
    }

    /**
     * Create an instance of {@link COSOtherAssocType }
     * 
     */
    public COSOtherAssocType createCOSOtherAssocType() {
        return new COSOtherAssocType();
    }

    /**
     * Create an instance of {@link FarePriceBaseType }
     * 
     */
    public FarePriceBaseType createFarePriceBaseType() {
        return new FarePriceBaseType();
    }

    /**
     * Create an instance of {@link FareComponentType }
     * 
     */
    public FareComponentType createFareComponentType() {
        return new FareComponentType();
    }

    /**
     * Create an instance of {@link FareComponentType.FareBasis }
     * 
     */
    public FareComponentType.FareBasis createFareComponentTypeFareBasis() {
        return new FareComponentType.FareBasis();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType }
     * 
     */
    public ListOfFlightSegmentType createListOfFlightSegmentType() {
        return new ListOfFlightSegmentType();
    }

    /**
     * Create an instance of {@link LinkFormattedType }
     * 
     */
    public LinkFormattedType createLinkFormattedType() {
        return new LinkFormattedType();
    }

    /**
     * Create an instance of {@link LinkDescriptionType }
     * 
     */
    public LinkDescriptionType createLinkDescriptionType() {
        return new LinkDescriptionType();
    }

    /**
     * Create an instance of {@link V172DataListType }
     * 
     */
    public V172DataListType createV172DataListType() {
        return new V172DataListType();
    }

    /**
     * Create an instance of {@link V172DataListType.FlightList }
     * 
     */
    public V172DataListType.FlightList createV172DataListTypeFlightList() {
        return new V172DataListType.FlightList();
    }

    /**
     * Create an instance of {@link V172DataListType.FlightList.Flight }
     * 
     */
    public V172DataListType.FlightList.Flight createV172DataListTypeFlightListFlight() {
        return new V172DataListType.FlightList.Flight();
    }

    /**
     * Create an instance of {@link V172DataListType.BaggageAllowanceList }
     * 
     */
    public V172DataListType.BaggageAllowanceList createV172DataListTypeBaggageAllowanceList() {
        return new V172DataListType.BaggageAllowanceList();
    }

    /**
     * Create an instance of {@link PolicyType }
     * 
     */
    public PolicyType createPolicyType() {
        return new PolicyType();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata }
     * 
     */
    public PolicyType.Metadata createPolicyTypeMetadata() {
        return new PolicyType.Metadata();
    }

    /**
     * Create an instance of {@link CorePeriodGrpType }
     * 
     */
    public CorePeriodGrpType createCorePeriodGrpType() {
        return new CorePeriodGrpType();
    }

    /**
     * Create an instance of {@link EncSchemeType }
     * 
     */
    public EncSchemeType createEncSchemeType() {
        return new EncSchemeType();
    }

    /**
     * Create an instance of {@link EncSchemeType.Detail }
     * 
     */
    public EncSchemeType.Detail createEncSchemeTypeDetail() {
        return new EncSchemeType.Detail();
    }

    /**
     * Create an instance of {@link PolicyType.Nodes }
     * 
     */
    public PolicyType.Nodes createPolicyTypeNodes() {
        return new PolicyType.Nodes();
    }

    /**
     * Create an instance of {@link NodePathType }
     * 
     */
    public NodePathType createNodePathType() {
        return new NodePathType();
    }

    /**
     * Create an instance of {@link LocalizationNoticeType }
     * 
     */
    public LocalizationNoticeType createLocalizationNoticeType() {
        return new LocalizationNoticeType();
    }

    /**
     * Create an instance of {@link InfoPolicyNoticeType }
     * 
     */
    public InfoPolicyNoticeType createInfoPolicyNoticeType() {
        return new InfoPolicyNoticeType();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType }
     * 
     */
    public PinPhraseQuestionType createPinPhraseQuestionType() {
        return new PinPhraseQuestionType();
    }

    /**
     * Create an instance of {@link V172DeviceType }
     * 
     */
    public V172DeviceType createV172DeviceType() {
        return new V172DeviceType();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge }
     * 
     */
    public PinPhraseQuestionType.Challenge createPinPhraseQuestionTypeChallenge() {
        return new PinPhraseQuestionType.Challenge();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge.Parameters }
     * 
     */
    public PinPhraseQuestionType.Challenge.Parameters createPinPhraseQuestionTypeChallengeParameters() {
        return new PinPhraseQuestionType.Challenge.Parameters();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType }
     * 
     */
    public PinPhraseAnswerType createPinPhraseAnswerType() {
        return new PinPhraseAnswerType();
    }

    /**
     * Create an instance of {@link MarketMsgAssocType }
     * 
     */
    public MarketMsgAssocType createMarketMsgAssocType() {
        return new MarketMsgAssocType();
    }

    /**
     * Create an instance of {@link MarketingInfoType }
     * 
     */
    public MarketingInfoType createMarketingInfoType() {
        return new MarketingInfoType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType }
     * 
     */
    public AgencyCoreRepType createAgencyCoreRepType() {
        return new AgencyCoreRepType();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.OtherIDs }
     * 
     */
    public AgencyCoreRepType.OtherIDs createAgencyCoreRepTypeOtherIDs() {
        return new AgencyCoreRepType.OtherIDs();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType }
     * 
     */
    public SupplierCoreRepType createSupplierCoreRepType() {
        return new SupplierCoreRepType();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType.OtherIDs }
     * 
     */
    public SupplierCoreRepType.OtherIDs createSupplierCoreRepTypeOtherIDs() {
        return new SupplierCoreRepType.OtherIDs();
    }

    /**
     * Create an instance of {@link IntermediaryCoreRepType }
     * 
     */
    public IntermediaryCoreRepType createIntermediaryCoreRepType() {
        return new IntermediaryCoreRepType();
    }

    /**
     * Create an instance of {@link AgentUserType }
     * 
     */
    public AgentUserType createAgentUserType() {
        return new AgentUserType();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType }
     * 
     */
    public FulfillmentPartnerType createFulfillmentPartnerType() {
        return new FulfillmentPartnerType();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments }
     * 
     */
    public FulfillmentPartnerType.Fulfillments createFulfillmentPartnerTypeFulfillments() {
        return new FulfillmentPartnerType.Fulfillments();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment createFulfillmentPartnerTypeFulfillmentsFulfillment() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates createFulfillmentPartnerTypeFulfillmentsFulfillmentOfferValidDates() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link TravelerFOIDType }
     * 
     */
    public TravelerFOIDType createTravelerFOIDType() {
        return new TravelerFOIDType();
    }

    /**
     * Create an instance of {@link InstrClassUpgradeType }
     * 
     */
    public InstrClassUpgradeType createInstrClassUpgradeType() {
        return new InstrClassUpgradeType();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType }
     * 
     */
    public TicketAutoExchangeType createTicketAutoExchangeType() {
        return new TicketAutoExchangeType();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.TicketNumbers }
     * 
     */
    public TicketAutoExchangeType.TicketNumbers createTicketAutoExchangeTypeTicketNumbers() {
        return new TicketAutoExchangeType.TicketNumbers();
    }

    /**
     * Create an instance of {@link LocationProximityType }
     * 
     */
    public LocationProximityType createLocationProximityType() {
        return new LocationProximityType();
    }

    /**
     * Create an instance of {@link StateProvProximityType }
     * 
     */
    public StateProvProximityType createStateProvProximityType() {
        return new StateProvProximityType();
    }

    /**
     * Create an instance of {@link StateProvQueryType }
     * 
     */
    public StateProvQueryType createStateProvQueryType() {
        return new StateProvQueryType();
    }

    /**
     * Create an instance of {@link StateProvQueryType.Keywords }
     * 
     */
    public StateProvQueryType.Keywords createStateProvQueryTypeKeywords() {
        return new StateProvQueryType.Keywords();
    }

    /**
     * Create an instance of {@link StateProvQueryType.StateCodes }
     * 
     */
    public StateProvQueryType.StateCodes createStateProvQueryTypeStateCodes() {
        return new StateProvQueryType.StateCodes();
    }

    /**
     * Create an instance of {@link SpecialType }
     * 
     */
    public SpecialType createSpecialType() {
        return new SpecialType();
    }

    /**
     * Create an instance of {@link RuleType }
     * 
     */
    public RuleType createRuleType() {
        return new RuleType();
    }

    /**
     * Create an instance of {@link RuleSetType }
     * 
     */
    public RuleSetType createRuleSetType() {
        return new RuleSetType();
    }

    /**
     * Create an instance of {@link V172PriceVarianceRuleType }
     * 
     */
    public V172PriceVarianceRuleType createV172PriceVarianceRuleType() {
        return new V172PriceVarianceRuleType();
    }

    /**
     * Create an instance of {@link AwardRedemptionType }
     * 
     */
    public AwardRedemptionType createAwardRedemptionType() {
        return new AwardRedemptionType();
    }

    /**
     * Create an instance of {@link CombinationPriceSimpleType }
     * 
     */
    public CombinationPriceSimpleType createCombinationPriceSimpleType() {
        return new CombinationPriceSimpleType();
    }

    /**
     * Create an instance of {@link CombinationPriceSimpleType.Partial }
     * 
     */
    public CombinationPriceSimpleType.Partial createCombinationPriceSimpleTypePartial() {
        return new CombinationPriceSimpleType.Partial();
    }

    /**
     * Create an instance of {@link TravelerFQTVType }
     * 
     */
    public TravelerFQTVType createTravelerFQTVType() {
        return new TravelerFQTVType();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account }
     * 
     */
    public TravelerFQTVType.Account createTravelerFQTVTypeAccount() {
        return new TravelerFQTVType.Account();
    }

    /**
     * Create an instance of {@link RenderingParameterType }
     * 
     */
    public RenderingParameterType createRenderingParameterType() {
        return new RenderingParameterType();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType }
     * 
     */
    public RenderingInstructionsType createRenderingInstructionsType() {
        return new RenderingInstructionsType();
    }

    /**
     * Create an instance of {@link MediaAttachmentType }
     * 
     */
    public MediaAttachmentType createMediaAttachmentType() {
        return new MediaAttachmentType();
    }

    /**
     * Create an instance of {@link CountryQueryType }
     * 
     */
    public CountryQueryType createCountryQueryType() {
        return new CountryQueryType();
    }

    /**
     * Create an instance of {@link NamedAssocType }
     * 
     */
    public NamedAssocType createNamedAssocType() {
        return new NamedAssocType();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc }
     * 
     */
    public NamedAssocType.NamedAssoc createNamedAssocTypeNamedAssoc() {
        return new NamedAssocType.NamedAssoc();
    }

    /**
     * Create an instance of {@link AugPointListType }
     * 
     */
    public AugPointListType createAugPointListType() {
        return new AugPointListType();
    }

    /**
     * Create an instance of {@link AugPointListType.List }
     * 
     */
    public AugPointListType.List createAugPointListTypeList() {
        return new AugPointListType.List();
    }

    /**
     * Create an instance of {@link AugPointAssocType }
     * 
     */
    public AugPointAssocType createAugPointAssocType() {
        return new AugPointAssocType();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType }
     * 
     */
    public ItinReshopParamsType createItinReshopParamsType() {
        return new ItinReshopParamsType();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.Notices }
     * 
     */
    public ItinReshopParamsType.Notices createItinReshopParamsTypeNotices() {
        return new ItinReshopParamsType.Notices();
    }

    /**
     * Create an instance of {@link TransferPreferencesType }
     * 
     */
    public TransferPreferencesType createTransferPreferencesType() {
        return new TransferPreferencesType();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection }
     * 
     */
    public TransferPreferencesType.Connection createTransferPreferencesTypeConnection() {
        return new TransferPreferencesType.Connection();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Codes }
     * 
     */
    public TransferPreferencesType.Connection.Codes createTransferPreferencesTypeConnectionCodes() {
        return new TransferPreferencesType.Connection.Codes();
    }

    /**
     * Create an instance of {@link FltSegmentMaxTimePreferencesType }
     * 
     */
    public FltSegmentMaxTimePreferencesType createFltSegmentMaxTimePreferencesType() {
        return new FltSegmentMaxTimePreferencesType();
    }

    /**
     * Create an instance of {@link FarePreferencesType }
     * 
     */
    public FarePreferencesType createFarePreferencesType() {
        return new FarePreferencesType();
    }

    /**
     * Create an instance of {@link FarePreferencesType.TicketDesigs }
     * 
     */
    public FarePreferencesType.TicketDesigs createFarePreferencesTypeTicketDesigs() {
        return new FarePreferencesType.TicketDesigs();
    }

    /**
     * Create an instance of {@link FarePreferencesType.FareCodes }
     * 
     */
    public FarePreferencesType.FareCodes createFarePreferencesTypeFareCodes() {
        return new FarePreferencesType.FareCodes();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Types }
     * 
     */
    public FarePreferencesType.Types createFarePreferencesTypeTypes() {
        return new FarePreferencesType.Types();
    }

    /**
     * Create an instance of {@link FlightPreferencesType }
     * 
     */
    public FlightPreferencesType createFlightPreferencesType() {
        return new FlightPreferencesType();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.WaitListing }
     * 
     */
    public FlightPreferencesType.WaitListing createFlightPreferencesTypeWaitListing() {
        return new FlightPreferencesType.WaitListing();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic }
     * 
     */
    public FlightPreferencesType.Characteristic createFlightPreferencesTypeCharacteristic() {
        return new FlightPreferencesType.Characteristic();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft }
     * 
     */
    public FlightPreferencesType.Aircraft createFlightPreferencesTypeAircraft() {
        return new FlightPreferencesType.Aircraft();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows createFlightPreferencesTypeAircraftRows() {
        return new FlightPreferencesType.Aircraft.Rows();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats createFlightPreferencesTypeAircraftSeats() {
        return new FlightPreferencesType.Aircraft.Seats();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Classes }
     * 
     */
    public FlightPreferencesType.Aircraft.Classes createFlightPreferencesTypeAircraftClasses() {
        return new FlightPreferencesType.Aircraft.Classes();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Cabins }
     * 
     */
    public FlightPreferencesType.Aircraft.Cabins createFlightPreferencesTypeAircraftCabins() {
        return new FlightPreferencesType.Aircraft.Cabins();
    }

    /**
     * Create an instance of {@link AlliancePreferencesType }
     * 
     */
    public AlliancePreferencesType createAlliancePreferencesType() {
        return new AlliancePreferencesType();
    }

    /**
     * Create an instance of {@link AirlinePreferencesType }
     * 
     */
    public AirlinePreferencesType createAirlinePreferencesType() {
        return new AirlinePreferencesType();
    }

    /**
     * Create an instance of {@link PersonBudgetType }
     * 
     */
    public PersonBudgetType createPersonBudgetType() {
        return new PersonBudgetType();
    }

    /**
     * Create an instance of {@link GroupBudgetType }
     * 
     */
    public GroupBudgetType createGroupBudgetType() {
        return new GroupBudgetType();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail createPrePaidProgramQualifierPrepaidProgramDetail() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate createPrePaidProgramQualifierPrepaidProgramDetailCertificate() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate();
    }

    /**
     * Create an instance of {@link DiscountProgramType }
     * 
     */
    public DiscountProgramType createDiscountProgramType() {
        return new DiscountProgramType();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType }
     * 
     */
    public FltArriveQualifiedQueryType createFltArriveQualifiedQueryType() {
        return new FltArriveQualifiedQueryType();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType }
     * 
     */
    public FltDepartQualifiedQueryType createFltDepartQualifiedQueryType() {
        return new FltDepartQualifiedQueryType();
    }

    /**
     * Create an instance of {@link ServiceCouponType }
     * 
     */
    public ServiceCouponType createServiceCouponType() {
        return new ServiceCouponType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType }
     * 
     */
    public ServiceFulfillmentType createServiceFulfillmentType() {
        return new ServiceFulfillmentType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates createServiceFulfillmentTypeOfferValidDates() {
        return new ServiceFulfillmentType.OfferValidDates();
    }

    /**
     * Create an instance of {@link TotalFareTransactionType }
     * 
     */
    public TotalFareTransactionType createTotalFareTransactionType() {
        return new TotalFareTransactionType();
    }

    /**
     * Create an instance of {@link ETFareInfoType }
     * 
     */
    public ETFareInfoType createETFareInfoType() {
        return new ETFareInfoType();
    }

    /**
     * Create an instance of {@link EquivFareTransactionType }
     * 
     */
    public EquivFareTransactionType createEquivFareTransactionType() {
        return new EquivFareTransactionType();
    }

    /**
     * Create an instance of {@link BaseFareTransactionType }
     * 
     */
    public BaseFareTransactionType createBaseFareTransactionType() {
        return new BaseFareTransactionType();
    }

    /**
     * Create an instance of {@link CouponInfoType }
     * 
     */
    public CouponInfoType createCouponInfoType() {
        return new CouponInfoType();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType }
     * 
     */
    public AddlBaggageInfoType createAddlBaggageInfoType() {
        return new AddlBaggageInfoType();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedChargeableBag }
     * 
     */
    public AddlBaggageInfoType.CheckedChargeableBag createAddlBaggageInfoTypeCheckedChargeableBag() {
        return new AddlBaggageInfoType.CheckedChargeableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnChargeableBag }
     * 
     */
    public AddlBaggageInfoType.CarryOnChargeableBag createAddlBaggageInfoTypeCarryOnChargeableBag() {
        return new AddlBaggageInfoType.CarryOnChargeableBag();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType }
     * 
     */
    public CarrierFeeInfoType createCarrierFeeInfoType() {
        return new CarrierFeeInfoType();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees }
     * 
     */
    public CarrierFeeInfoType.CarrierFees createCarrierFeeInfoTypeCarrierFees() {
        return new CarrierFeeInfoType.CarrierFees();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee createCarrierFeeInfoTypeCarrierFeesFee() {
        return new CarrierFeeInfoType.CarrierFees.Fee();
    }

    /**
     * Create an instance of {@link VoucherMethodType }
     * 
     */
    public VoucherMethodType createVoucherMethodType() {
        return new VoucherMethodType();
    }

    /**
     * Create an instance of {@link RedemptionMethodType }
     * 
     */
    public RedemptionMethodType createRedemptionMethodType() {
        return new RedemptionMethodType();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.Certificates }
     * 
     */
    public RedemptionMethodType.Certificates createRedemptionMethodTypeCertificates() {
        return new RedemptionMethodType.Certificates();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType }
     * 
     */
    public PaymentCardMethodType createPaymentCardMethodType() {
        return new PaymentCardMethodType();
    }

    /**
     * Create an instance of {@link DirectBillMethodType }
     * 
     */
    public DirectBillMethodType createDirectBillMethodType() {
        return new DirectBillMethodType();
    }

    /**
     * Create an instance of {@link CashMethodType }
     * 
     */
    public CashMethodType createCashMethodType() {
        return new CashMethodType();
    }

    /**
     * Create an instance of {@link BankAccountMethodType }
     * 
     */
    public BankAccountMethodType createBankAccountMethodType() {
        return new BankAccountMethodType();
    }

    /**
     * Create an instance of {@link SeatLocationType }
     * 
     */
    public SeatLocationType createSeatLocationType() {
        return new SeatLocationType();
    }

    /**
     * Create an instance of {@link SeatLocationType.Characteristics }
     * 
     */
    public SeatLocationType.Characteristics createSeatLocationTypeCharacteristics() {
        return new SeatLocationType.Characteristics();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row }
     * 
     */
    public SeatLocationType.Row createSeatLocationTypeRow() {
        return new SeatLocationType.Row();
    }

    /**
     * Create an instance of {@link GenericPriceType }
     * 
     */
    public GenericPriceType createGenericPriceType() {
        return new GenericPriceType();
    }

    /**
     * Create an instance of {@link BaggageItemType }
     * 
     */
    public BaggageItemType createBaggageItemType() {
        return new BaggageItemType();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetails }
     * 
     */
    public BaggageItemType.BagDetails createBaggageItemTypeBagDetails() {
        return new BaggageItemType.BagDetails();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetails.BagDetail }
     * 
     */
    public BaggageItemType.BagDetails.BagDetail createBaggageItemTypeBagDetailsBagDetail() {
        return new BaggageItemType.BagDetails.BagDetail();
    }

    /**
     * Create an instance of {@link SettlementType }
     * 
     */
    public SettlementType createSettlementType() {
        return new SettlementType();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType }
     * 
     */
    public OrderItemAssociationType createOrderItemAssociationType() {
        return new OrderItemAssociationType();
    }

    /**
     * Create an instance of {@link TicketByTimeLimitType }
     * 
     */
    public TicketByTimeLimitType createTicketByTimeLimitType() {
        return new TicketByTimeLimitType();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType }
     * 
     */
    public AirlineOffersSnapshotType createAirlineOffersSnapshotType() {
        return new AirlineOffersSnapshotType();
    }

    /**
     * Create an instance of {@link OfferMatchType }
     * 
     */
    public OfferMatchType createOfferMatchType() {
        return new OfferMatchType();
    }

    /**
     * Create an instance of {@link InvGuaranteeType }
     * 
     */
    public InvGuaranteeType createInvGuaranteeType() {
        return new InvGuaranteeType();
    }

    /**
     * Create an instance of {@link MediaAssocType }
     * 
     */
    public MediaAssocType createMediaAssocType() {
        return new MediaAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.Services }
     * 
     */
    public OfferAssociationsType.Services createOfferAssociationsTypeServices() {
        return new OfferAssociationsType.Services();
    }

    /**
     * Create an instance of {@link OtherOfferAssocType }
     * 
     */
    public OtherOfferAssocType createOtherOfferAssocType() {
        return new OtherOfferAssocType();
    }

    /**
     * Create an instance of {@link PassengerMetadataType }
     * 
     */
    public PassengerMetadataType createPassengerMetadataType() {
        return new PassengerMetadataType();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType }
     * 
     */
    public ServiceQualifierPriceType createServiceQualifierPriceType() {
        return new ServiceQualifierPriceType();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment createServiceQualifierPriceTypeFulfillment() {
        return new ServiceQualifierPriceType.Fulfillment();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates createServiceQualifierPriceTypeFulfillmentOfferValidDates() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates();
    }

    /**
     * Create an instance of {@link OrderKeysType }
     * 
     */
    public OrderKeysType createOrderKeysType() {
        return new OrderKeysType();
    }

    /**
     * Create an instance of {@link OrderKeysType.AssociatedIDs }
     * 
     */
    public OrderKeysType.AssociatedIDs createOrderKeysTypeAssociatedIDs() {
        return new OrderKeysType.AssociatedIDs();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType }
     * 
     */
    public OfferItemMetadataType createOfferItemMetadataType() {
        return new OfferItemMetadataType();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Matches }
     * 
     */
    public OfferItemMetadataType.Matches createOfferItemMetadataTypeMatches() {
        return new OfferItemMetadataType.Matches();
    }

    /**
     * Create an instance of {@link BaggageDetailMetadataType }
     * 
     */
    public BaggageDetailMetadataType createBaggageDetailMetadataType() {
        return new BaggageDetailMetadataType();
    }

    /**
     * Create an instance of {@link RuleMetadataType }
     * 
     */
    public RuleMetadataType createRuleMetadataType() {
        return new RuleMetadataType();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Values }
     * 
     */
    public RuleMetadataType.Values createRuleMetadataTypeValues() {
        return new RuleMetadataType.Values();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Values.Value }
     * 
     */
    public RuleMetadataType.Values.Value createRuleMetadataTypeValuesValue() {
        return new RuleMetadataType.Values.Value();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType }
     * 
     */
    public PaymentCardMetadataType createPaymentCardMetadataType() {
        return new PaymentCardMetadataType();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.CardFields }
     * 
     */
    public PaymentCardMetadataType.CardFields createPaymentCardMetadataTypeCardFields() {
        return new PaymentCardMetadataType.CardFields();
    }

    /**
     * Create an instance of {@link MediaMetadataType }
     * 
     */
    public MediaMetadataType createMediaMetadataType() {
        return new MediaMetadataType();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadataType }
     * 
     */
    public EquivalentIDMetadataType createEquivalentIDMetadataType() {
        return new EquivalentIDMetadataType();
    }

    /**
     * Create an instance of {@link CodesetMetadataType }
     * 
     */
    public CodesetMetadataType createCodesetMetadataType() {
        return new CodesetMetadataType();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.Source }
     * 
     */
    public CodesetMetadataType.Source createCodesetMetadataTypeSource() {
        return new CodesetMetadataType.Source();
    }

    /**
     * Create an instance of {@link AirportMetadataType }
     * 
     */
    public AirportMetadataType createAirportMetadataType() {
        return new AirportMetadataType();
    }

    /**
     * Create an instance of {@link AddressMetadataType }
     * 
     */
    public AddressMetadataType createAddressMetadataType() {
        return new AddressMetadataType();
    }

    /**
     * Create an instance of {@link AddressMetadataType.AddressFields }
     * 
     */
    public AddressMetadataType.AddressFields createAddressMetadataTypeAddressFields() {
        return new AddressMetadataType.AddressFields();
    }

    /**
     * Create an instance of {@link TotalJourneyType }
     * 
     */
    public TotalJourneyType createTotalJourneyType() {
        return new TotalJourneyType();
    }

    /**
     * Create an instance of {@link FlightArrivalType }
     * 
     */
    public FlightArrivalType createFlightArrivalType() {
        return new FlightArrivalType();
    }

    /**
     * Create an instance of {@link StopLocationType }
     * 
     */
    public StopLocationType createStopLocationType() {
        return new StopLocationType();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType }
     * 
     */
    public FlightCOSCoreType createFlightCOSCoreType() {
        return new FlightCOSCoreType();
    }

    /**
     * Create an instance of {@link FareQualifierType }
     * 
     */
    public FareQualifierType createFareQualifierType() {
        return new FareQualifierType();
    }

    /**
     * Create an instance of {@link FareRulesType }
     * 
     */
    public FareRulesType createFareRulesType() {
        return new FareRulesType();
    }

    /**
     * Create an instance of {@link FareRulesType.Ticketing }
     * 
     */
    public FareRulesType.Ticketing createFareRulesTypeTicketing() {
        return new FareRulesType.Ticketing();
    }

    /**
     * Create an instance of {@link FareDetailType }
     * 
     */
    public FareDetailType createFareDetailType() {
        return new FareDetailType();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType }
     * 
     */
    public ListOfServiceBundleType createListOfServiceBundleType() {
        return new ListOfServiceBundleType();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle createListOfServiceBundleTypeServiceBundle() {
        return new ListOfServiceBundleType.ServiceBundle();
    }

    /**
     * Create an instance of {@link ServiceDetailType }
     * 
     */
    public ServiceDetailType createServiceDetailType() {
        return new ServiceDetailType();
    }

    /**
     * Create an instance of {@link ListOfOfferV172PenaltyType }
     * 
     */
    public ListOfOfferV172PenaltyType createListOfOfferV172PenaltyType() {
        return new ListOfOfferV172PenaltyType();
    }

    /**
     * Create an instance of {@link ListOfOfferInstructionsType }
     * 
     */
    public ListOfOfferInstructionsType createListOfOfferInstructionsType() {
        return new ListOfOfferInstructionsType();
    }

    /**
     * Create an instance of {@link ListOfMediaType }
     * 
     */
    public ListOfMediaType createListOfMediaType() {
        return new ListOfMediaType();
    }

    /**
     * Create an instance of {@link ListOfClassOfServiceType }
     * 
     */
    public ListOfClassOfServiceType createListOfClassOfServiceType() {
        return new ListOfClassOfServiceType();
    }

    /**
     * Create an instance of {@link FareList.FareGroup }
     * 
     */
    public FareList.FareGroup createFareListFareGroup() {
        return new FareList.FareGroup();
    }

    /**
     * Create an instance of {@link ListOfV172DisclosureType }
     * 
     */
    public ListOfV172DisclosureType createListOfV172DisclosureType() {
        return new ListOfV172DisclosureType();
    }

    /**
     * Create an instance of {@link ListOfContentSourceType }
     * 
     */
    public ListOfContentSourceType createListOfContentSourceType() {
        return new ListOfContentSourceType();
    }

    /**
     * Create an instance of {@link ListOfContentSourceType.ContentSource }
     * 
     */
    public ListOfContentSourceType.ContentSource createListOfContentSourceTypeContentSource() {
        return new ListOfContentSourceType.ContentSource();
    }

    /**
     * Create an instance of {@link ListOfBagV172DisclosureType }
     * 
     */
    public ListOfBagV172DisclosureType createListOfBagV172DisclosureType() {
        return new ListOfBagV172DisclosureType();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType }
     * 
     */
    public TaxExemptionNoticeType createTaxExemptionNoticeType() {
        return new TaxExemptionNoticeType();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results }
     * 
     */
    public TaxExemptionNoticeType.Results createTaxExemptionNoticeTypeResults() {
        return new TaxExemptionNoticeType.Results();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results.TaxExemption }
     * 
     */
    public TaxExemptionNoticeType.Results.TaxExemption createTaxExemptionNoticeTypeResultsTaxExemption() {
        return new TaxExemptionNoticeType.Results.TaxExemption();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query }
     * 
     */
    public TaxExemptionNoticeType.Query createTaxExemptionNoticeTypeQuery() {
        return new TaxExemptionNoticeType.Query();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named }
     * 
     */
    public TaxExemptionNoticeType.Query.Named createTaxExemptionNoticeTypeQueryNamed() {
        return new TaxExemptionNoticeType.Query.Named();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.TaxCodes }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.TaxCodes createTaxExemptionNoticeTypeQueryNamedTaxCodes() {
        return new TaxExemptionNoticeType.Query.Named.TaxCodes();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType }
     * 
     */
    public ServiceFilterNoticeType createServiceFilterNoticeType() {
        return new ServiceFilterNoticeType();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results }
     * 
     */
    public ServiceFilterNoticeType.Results createServiceFilterNoticeTypeResults() {
        return new ServiceFilterNoticeType.Results();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters createServiceFilterNoticeTypeResultsAppliedFilters() {
        return new ServiceFilterNoticeType.Results.AppliedFilters();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilter() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociations() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociationsOffer() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType }
     * 
     */
    public PricingParametersNoticeType createPricingParametersNoticeType() {
        return new PricingParametersNoticeType();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results }
     * 
     */
    public PriceVarianceRuleNoticeType.Results createPriceVarianceRuleNoticeTypeResults() {
        return new PriceVarianceRuleNoticeType.Results();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance createPriceVarianceRuleNoticeTypeResultsPriceVariance() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query }
     * 
     */
    public PriceVarianceRuleNoticeType.Query createPriceVarianceRuleNoticeTypeQuery() {
        return new PriceVarianceRuleNoticeType.Query();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule createPriceVarianceRuleNoticeTypeQueryPriceVarianceRule() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType }
     * 
     */
    public PaymentRulesNoticeType createPaymentRulesNoticeType() {
        return new PaymentRulesNoticeType();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment createPaymentRulesNoticeTypeFormOfPayment() {
        return new PaymentRulesNoticeType.FormOfPayment();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType }
     * 
     */
    public InvGuaranteeNoticeType createInvGuaranteeNoticeType() {
        return new InvGuaranteeNoticeType();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Results }
     * 
     */
    public InvGuaranteeNoticeType.Results createInvGuaranteeNoticeTypeResults() {
        return new InvGuaranteeNoticeType.Results();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.StopLocations }
     * 
     */
    public SecurePaymentPaxInfoType.StopLocations createSecurePaymentPaxInfoTypeStopLocations() {
        return new SecurePaymentPaxInfoType.StopLocations();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.DateTimes }
     * 
     */
    public SecurePaymentPaxInfoType.DateTimes createSecurePaymentPaxInfoTypeDateTimes() {
        return new SecurePaymentPaxInfoType.DateTimes();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.Carriers }
     * 
     */
    public SecurePaymentPaxInfoType.Carriers createSecurePaymentPaxInfoTypeCarriers() {
        return new SecurePaymentPaxInfoType.Carriers();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType }
     * 
     */
    public SecurePaymentAlertType createSecurePaymentAlertType() {
        return new SecurePaymentAlertType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos createSecurePaymentAlertTypeProcessingInfos() {
        return new SecurePaymentAlertType.ProcessingInfos();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo createSecurePaymentAlertTypeProcessingInfosProcessingInfo() {
        return new SecurePaymentAlertType.ProcessingInfos.ProcessingInfo();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details }
     * 
     */
    public SecurePaymentAlertType.Details createSecurePaymentAlertTypeDetails() {
        return new SecurePaymentAlertType.Details();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference }
     * 
     */
    public SecurePaymentAlertType.Reference createSecurePaymentAlertTypeReference() {
        return new SecurePaymentAlertType.Reference();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline }
     * 
     */
    public SecurePaymentAlertType.Airline createSecurePaymentAlertTypeAirline() {
        return new SecurePaymentAlertType.Airline();
    }

    /**
     * Create an instance of {@link PINAuthTravelerType }
     * 
     */
    public PINAuthTravelerType createPINAuthTravelerType() {
        return new PINAuthTravelerType();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType }
     * 
     */
    public InvDiscrepencyAlertType createInvDiscrepencyAlertType() {
        return new InvDiscrepencyAlertType();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.AlternateOffers }
     * 
     */
    public InvDiscrepencyAlertType.AlternateOffers createInvDiscrepencyAlertTypeAlternateOffers() {
        return new InvDiscrepencyAlertType.AlternateOffers();
    }

    /**
     * Create an instance of {@link AlertsType }
     * 
     */
    public AlertsType createAlertsType() {
        return new AlertsType();
    }

    /**
     * Create an instance of {@link MsgPartiesType }
     * 
     */
    public MsgPartiesType createMsgPartiesType() {
        return new MsgPartiesType();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Participants }
     * 
     */
    public MsgPartiesType.Participants createMsgPartiesTypeParticipants() {
        return new MsgPartiesType.Participants();
    }

    /**
     * Create an instance of {@link PointOfSaleType }
     * 
     */
    public PointOfSaleType createPointOfSaleType() {
        return new PointOfSaleType();
    }

    /**
     * Create an instance of {@link PointOfSaleType.TouchPoint }
     * 
     */
    public PointOfSaleType.TouchPoint createPointOfSaleTypeTouchPoint() {
        return new PointOfSaleType.TouchPoint();
    }

    /**
     * Create an instance of {@link PolicyAugmentationType }
     * 
     */
    public PolicyAugmentationType createPolicyAugmentationType() {
        return new PolicyAugmentationType();
    }

    /**
     * Create an instance of {@link PolicyDefaultType }
     * 
     */
    public PolicyDefaultType createPolicyDefaultType() {
        return new PolicyDefaultType();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name }
     * 
     */
    public PrimaryContact.Name createPrimaryContactName() {
        return new PrimaryContact.Name();
    }

    /**
     * Create an instance of {@link BilateralTimeLimitsType }
     * 
     */
    public BilateralTimeLimitsType createBilateralTimeLimitsType() {
        return new BilateralTimeLimitsType();
    }

    /**
     * Create an instance of {@link TaxExemptionType }
     * 
     */
    public TaxExemptionType createTaxExemptionType() {
        return new TaxExemptionType();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType }
     * 
     */
    public ShoppingResponseIDType createShoppingResponseIDType() {
        return new ShoppingResponseIDType();
    }

    /**
     * Create an instance of {@link CombinationPriceType }
     * 
     */
    public CombinationPriceType createCombinationPriceType() {
        return new CombinationPriceType();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial }
     * 
     */
    public CombinationPriceType.Partial createCombinationPriceTypePartial() {
        return new CombinationPriceType.Partial();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType }
     * 
     */
    public DetailCurrencyPriceType createDetailCurrencyPriceType() {
        return new DetailCurrencyPriceType();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details }
     * 
     */
    public DetailCurrencyPriceType.Details createDetailCurrencyPriceTypeDetails() {
        return new DetailCurrencyPriceType.Details();
    }

    /**
     * Create an instance of {@link Voucher.Name }
     * 
     */
    public Voucher.Name createVoucherName() {
        return new Voucher.Name();
    }

    /**
     * Create an instance of {@link V172PaymentCardType }
     * 
     */
    public V172PaymentCardType createV172PaymentCardType() {
        return new V172PaymentCardType();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.Certificates }
     * 
     */
    public LoyaltyRedemption.Certificates createLoyaltyRedemptionCertificates() {
        return new LoyaltyRedemption.Certificates();
    }

    /**
     * Create an instance of {@link V172DirectBillType }
     * 
     */
    public V172DirectBillType createV172DirectBillType() {
        return new V172DirectBillType();
    }

    /**
     * Create an instance of {@link V172BankAccountType }
     * 
     */
    public V172BankAccountType createV172BankAccountType() {
        return new V172BankAccountType();
    }

    /**
     * Create an instance of {@link DirectionsType }
     * 
     */
    public DirectionsType createDirectionsType() {
        return new DirectionsType();
    }

    /**
     * Create an instance of {@link V172PhoneType }
     * 
     */
    public V172PhoneType createV172PhoneType() {
        return new V172PhoneType();
    }

    /**
     * Create an instance of {@link EmailType }
     * 
     */
    public EmailType createEmailType() {
        return new EmailType();
    }

    /**
     * Create an instance of {@link Contacts.Contact }
     * 
     */
    public Contacts.Contact createContactsContact() {
        return new Contacts.Contact();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name }
     * 
     */
    public Contacts.Contact.Name createContactsContactName() {
        return new Contacts.Contact.Name();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType }
     * 
     */
    public BagAllowanceDimensionType createBagAllowanceDimensionType() {
        return new BagAllowanceDimensionType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link PaymentAddrType }
     * 
     */
    public PaymentAddrType createPaymentAddrType() {
        return new PaymentAddrType();
    }

    /**
     * Create an instance of {@link AddressCoreType }
     * 
     */
    public AddressCoreType createAddressCoreType() {
        return new AddressCoreType();
    }

    /**
     * Create an instance of {@link AddressDetailType }
     * 
     */
    public AddressDetailType createAddressDetailType() {
        return new AddressDetailType();
    }

    /**
     * Create an instance of {@link AugPointInfoType }
     * 
     */
    public AugPointInfoType createAugPointInfoType() {
        return new AugPointInfoType();
    }

    /**
     * Create an instance of {@link MonthRepType }
     * 
     */
    public MonthRepType createMonthRepType() {
        return new MonthRepType();
    }

    /**
     * Create an instance of {@link DatePeriodRepType }
     * 
     */
    public DatePeriodRepType createDatePeriodRepType() {
        return new DatePeriodRepType();
    }

    /**
     * Create an instance of {@link DateTimePeriodRepType }
     * 
     */
    public DateTimePeriodRepType createDateTimePeriodRepType() {
        return new DateTimePeriodRepType();
    }

    /**
     * Create an instance of {@link DayPeriodRepType }
     * 
     */
    public DayPeriodRepType createDayPeriodRepType() {
        return new DayPeriodRepType();
    }

    /**
     * Create an instance of {@link MonthPeriodRepType }
     * 
     */
    public MonthPeriodRepType createMonthPeriodRepType() {
        return new MonthPeriodRepType();
    }

    /**
     * Create an instance of {@link QuarterPeriodRepType }
     * 
     */
    public QuarterPeriodRepType createQuarterPeriodRepType() {
        return new QuarterPeriodRepType();
    }

    /**
     * Create an instance of {@link TimePeriodRepType }
     * 
     */
    public TimePeriodRepType createTimePeriodRepType() {
        return new TimePeriodRepType();
    }

    /**
     * Create an instance of {@link YearPeriodRepType }
     * 
     */
    public YearPeriodRepType createYearPeriodRepType() {
        return new YearPeriodRepType();
    }

    /**
     * Create an instance of {@link YearMonthPeriodRepType }
     * 
     */
    public YearMonthPeriodRepType createYearMonthPeriodRepType() {
        return new YearMonthPeriodRepType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Address }
     * 
     */
    public com.springboot.dto.offerpricers.Address createAddress() {
        return new com.springboot.dto.offerpricers.Address();
    }

    /**
     * Create an instance of {@link SimpleAddrType }
     * 
     */
    public SimpleAddrType createSimpleAddrType() {
        return new SimpleAddrType();
    }

    /**
     * Create an instance of {@link StructuredAddrType }
     * 
     */
    public StructuredAddrType createStructuredAddrType() {
        return new StructuredAddrType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.AirportCode }
     * 
     */
    public com.springboot.dto.offerpricers.AirportCode createAirportCode() {
        return new com.springboot.dto.offerpricers.AirportCode();
    }

    /**
     * Create an instance of {@link BagAllowanceDescType }
     * 
     */
    public BagAllowanceDescType createBagAllowanceDescType() {
        return new BagAllowanceDescType();
    }

    /**
     * Create an instance of {@link CarryOnBags }
     * 
     */
    public CarryOnBags createCarryOnBags() {
        return new CarryOnBags();
    }

    /**
     * Create an instance of {@link CarryOnAllowanceType.CarryOnBag }
     * 
     */
    public CarryOnAllowanceType.CarryOnBag createCarryOnAllowanceTypeCarryOnBag() {
        return new CarryOnAllowanceType.CarryOnBag();
    }

    /**
     * Create an instance of {@link CheckedBags }
     * 
     */
    public CheckedBags createCheckedBags() {
        return new CheckedBags();
    }

    /**
     * Create an instance of {@link CheckedBagAllowanceType.CheckedBag }
     * 
     */
    public CheckedBagAllowanceType.CheckedBag createCheckedBagAllowanceTypeCheckedBag() {
        return new CheckedBagAllowanceType.CheckedBag();
    }

    /**
     * Create an instance of {@link PieceAllowance }
     * 
     */
    public PieceAllowance createPieceAllowance() {
        return new PieceAllowance();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Descriptions }
     * 
     */
    public com.springboot.dto.offerpricers.Descriptions createDescriptions() {
        return new com.springboot.dto.offerpricers.Descriptions();
    }

    /**
     * Create an instance of {@link BagAllowancePieceType.PieceMeasurements }
     * 
     */
    public BagAllowancePieceType.PieceMeasurements createBagAllowancePieceTypePieceMeasurements() {
        return new BagAllowancePieceType.PieceMeasurements();
    }

    /**
     * Create an instance of {@link WeightAllowance }
     * 
     */
    public WeightAllowance createWeightAllowance() {
        return new WeightAllowance();
    }

    /**
     * Create an instance of {@link BagAllowanceWeightType.MaximumWeight }
     * 
     */
    public BagAllowanceWeightType.MaximumWeight createBagAllowanceWeightTypeMaximumWeight() {
        return new BagAllowanceWeightType.MaximumWeight();
    }

    /**
     * Create an instance of {@link BookingReference }
     * 
     */
    public BookingReference createBookingReference() {
        return new BookingReference();
    }

    /**
     * Create an instance of {@link BookingReferenceType.AirlineID }
     * 
     */
    public BookingReferenceType.AirlineID createBookingReferenceTypeAirlineID() {
        return new BookingReferenceType.AirlineID();
    }

    /**
     * Create an instance of {@link BookingReferenceType.OtherID }
     * 
     */
    public BookingReferenceType.OtherID createBookingReferenceTypeOtherID() {
        return new BookingReferenceType.OtherID();
    }

    /**
     * Create an instance of {@link BookingReferences }
     * 
     */
    public BookingReferences createBookingReferences() {
        return new BookingReferences();
    }

    /**
     * Create an instance of {@link CityCode }
     * 
     */
    public CityCode createCityCode() {
        return new CityCode();
    }

    /**
     * Create an instance of {@link CityCodeType }
     * 
     */
    public CityCodeType createCityCodeType() {
        return new CityCodeType();
    }

    /**
     * Create an instance of {@link AddressContactType }
     * 
     */
    public AddressContactType createAddressContactType() {
        return new AddressContactType();
    }

    /**
     * Create an instance of {@link PhoneContactType }
     * 
     */
    public PhoneContactType createPhoneContactType() {
        return new PhoneContactType();
    }

    /**
     * Create an instance of {@link OtherContactMethodType }
     * 
     */
    public OtherContactMethodType createOtherContactMethodType() {
        return new OtherContactMethodType();
    }

    /**
     * Create an instance of {@link V172CommissionType }
     * 
     */
    public V172CommissionType createV172CommissionType() {
        return new V172CommissionType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.CountryCode }
     * 
     */
    public com.springboot.dto.offerpricers.CountryCode createCountryCode() {
        return new com.springboot.dto.offerpricers.CountryCode();
    }

    /**
     * Create an instance of {@link V172CountryCodeType }
     * 
     */
    public V172CountryCodeType createV172CountryCodeType() {
        return new V172CountryCodeType();
    }

    /**
     * Create an instance of {@link CurrencyAmountOptType }
     * 
     */
    public CurrencyAmountOptType createCurrencyAmountOptType() {
        return new CurrencyAmountOptType();
    }

    /**
     * Create an instance of {@link CurrCode }
     * 
     */
    public CurrCode createCurrCode() {
        return new CurrCode();
    }

    /**
     * Create an instance of {@link CurrencyAmountEncodedType }
     * 
     */
    public CurrencyAmountEncodedType createCurrencyAmountEncodedType() {
        return new CurrencyAmountEncodedType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Description }
     * 
     */
    public com.springboot.dto.offerpricers.Description createDescription() {
        return new com.springboot.dto.offerpricers.Description();
    }

    /**
     * Create an instance of {@link DescriptionType.Text }
     * 
     */
    public DescriptionType.Text createDescriptionTypeText() {
        return new DescriptionType.Text();
    }

    /**
     * Create an instance of {@link DescriptionType.Media }
     * 
     */
    public DescriptionType.Media createDescriptionTypeMedia() {
        return new DescriptionType.Media();
    }

    /**
     * Create an instance of {@link MediaLink }
     * 
     */
    public MediaLink createMediaLink() {
        return new MediaLink();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Directions }
     * 
     */
    public com.springboot.dto.offerpricers.Directions createDirections() {
        return new com.springboot.dto.offerpricers.Directions();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Disclosures }
     * 
     */
    public com.springboot.dto.offerpricers.Disclosures createDisclosures() {
        return new com.springboot.dto.offerpricers.Disclosures();
    }

    /**
     * Create an instance of {@link V172DisclosureType }
     * 
     */
    public V172DisclosureType createV172DisclosureType() {
        return new V172DisclosureType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.KeyWord }
     * 
     */
    public com.springboot.dto.offerpricers.KeyWord createKeyWord() {
        return new com.springboot.dto.offerpricers.KeyWord();
    }

    /**
     * Create an instance of {@link KeyWordType.Word }
     * 
     */
    public KeyWordType.Word createKeyWordTypeWord() {
        return new KeyWordType.Word();
    }

    /**
     * Create an instance of {@link KeyWordType.Value }
     * 
     */
    public KeyWordType.Value createKeyWordTypeValue() {
        return new KeyWordType.Value();
    }

    /**
     * Create an instance of {@link LanguageCodeType }
     * 
     */
    public LanguageCodeType createLanguageCodeType() {
        return new LanguageCodeType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Languages }
     * 
     */
    public com.springboot.dto.offerpricers.Languages createLanguages() {
        return new com.springboot.dto.offerpricers.Languages();
    }

    /**
     * Create an instance of {@link Cash }
     * 
     */
    public Cash createCash() {
        return new Cash();
    }

    /**
     * Create an instance of {@link Check }
     * 
     */
    public Check createCheck() {
        return new Check();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.MemberNumber }
     * 
     */
    public LoyaltyRedemption.MemberNumber createLoyaltyRedemptionMemberNumber() {
        return new LoyaltyRedemption.MemberNumber();
    }

    /**
     * Create an instance of {@link MiscChargeOrder }
     * 
     */
    public MiscChargeOrder createMiscChargeOrder() {
        return new MiscChargeOrder();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Other }
     * 
     */
    public com.springboot.dto.offerpricers.Other createOther() {
        return new com.springboot.dto.offerpricers.Other();
    }

    /**
     * Create an instance of {@link Voucher.EffectiveExpireDate }
     * 
     */
    public Voucher.EffectiveExpireDate createVoucherEffectiveExpireDate() {
        return new Voucher.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link PenaltyDetailType }
     * 
     */
    public PenaltyDetailType createPenaltyDetailType() {
        return new PenaltyDetailType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Position }
     * 
     */
    public com.springboot.dto.offerpricers.Position createPosition() {
        return new com.springboot.dto.offerpricers.Position();
    }

    /**
     * Create an instance of {@link PositionType.Latitude }
     * 
     */
    public PositionType.Latitude createPositionTypeLatitude() {
        return new PositionType.Latitude();
    }

    /**
     * Create an instance of {@link PositionType.Longitude }
     * 
     */
    public PositionType.Longitude createPositionTypeLongitude() {
        return new PositionType.Longitude();
    }

    /**
     * Create an instance of {@link PositionType.Altitude }
     * 
     */
    public PositionType.Altitude createPositionTypeAltitude() {
        return new PositionType.Altitude();
    }

    /**
     * Create an instance of {@link AwardPriceUnitType }
     * 
     */
    public AwardPriceUnitType createAwardPriceUnitType() {
        return new AwardPriceUnitType();
    }

    /**
     * Create an instance of {@link EncodedPriceType }
     * 
     */
    public EncodedPriceType createEncodedPriceType() {
        return new EncodedPriceType();
    }

    /**
     * Create an instance of {@link SimpleCurrencyPriceType }
     * 
     */
    public SimpleCurrencyPriceType createSimpleCurrencyPriceType() {
        return new SimpleCurrencyPriceType();
    }

    /**
     * Create an instance of {@link TicketDesignatorType }
     * 
     */
    public TicketDesignatorType createTicketDesignatorType() {
        return new TicketDesignatorType();
    }

    /**
     * Create an instance of {@link DepositTimeLimit }
     * 
     */
    public DepositTimeLimit createDepositTimeLimit() {
        return new DepositTimeLimit();
    }

    /**
     * Create an instance of {@link DepositTimeLimitType }
     * 
     */
    public DepositTimeLimitType createDepositTimeLimitType() {
        return new DepositTimeLimitType();
    }

    /**
     * Create an instance of {@link InventoryGuaranteeTimeLimits }
     * 
     */
    public InventoryGuaranteeTimeLimits createInventoryGuaranteeTimeLimits() {
        return new InventoryGuaranteeTimeLimits();
    }

    /**
     * Create an instance of {@link CoreDateGrpType }
     * 
     */
    public CoreDateGrpType createCoreDateGrpType() {
        return new CoreDateGrpType();
    }

    /**
     * Create an instance of {@link NamingTimeLimit }
     * 
     */
    public NamingTimeLimit createNamingTimeLimit() {
        return new NamingTimeLimit();
    }

    /**
     * Create an instance of {@link NamingTimeLimitType }
     * 
     */
    public NamingTimeLimitType createNamingTimeLimitType() {
        return new NamingTimeLimitType();
    }

    /**
     * Create an instance of {@link PaymentTimeLimitType }
     * 
     */
    public PaymentTimeLimitType createPaymentTimeLimitType() {
        return new PaymentTimeLimitType();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimitType }
     * 
     */
    public PriceGuaranteeTimeLimitType createPriceGuaranteeTimeLimitType() {
        return new PriceGuaranteeTimeLimitType();
    }

    /**
     * Create an instance of {@link TicketingTimeLimits }
     * 
     */
    public TicketingTimeLimits createTicketingTimeLimits() {
        return new TicketingTimeLimits();
    }

    /**
     * Create an instance of {@link TicketingTimeLimitType }
     * 
     */
    public TicketingTimeLimitType createTicketingTimeLimitType() {
        return new TicketingTimeLimitType();
    }

    /**
     * Create an instance of {@link PrimaryContact.Contact }
     * 
     */
    public PrimaryContact.Contact createPrimaryContactContact() {
        return new PrimaryContact.Contact();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.AirlineID }
     * 
     */
    public com.springboot.dto.offerpricers.AirlineID createAirlineID() {
        return new com.springboot.dto.offerpricers.AirlineID();
    }

    /**
     * Create an instance of {@link AirlineIDType }
     * 
     */
    public AirlineIDType createAirlineIDType() {
        return new AirlineIDType();
    }

    /**
     * Create an instance of {@link RetailerIDType }
     * 
     */
    public RetailerIDType createRetailerIDType() {
        return new RetailerIDType();
    }

    /**
     * Create an instance of {@link MarketingCarrierType }
     * 
     */
    public MarketingCarrierType createMarketingCarrierType() {
        return new MarketingCarrierType();
    }

    /**
     * Create an instance of {@link AggregatorIDType }
     * 
     */
    public AggregatorIDType createAggregatorIDType() {
        return new AggregatorIDType();
    }

    /**
     * Create an instance of {@link RoleOfIntermediaryReferenceType }
     * 
     */
    public RoleOfIntermediaryReferenceType createRoleOfIntermediaryReferenceType() {
        return new RoleOfIntermediaryReferenceType();
    }

    /**
     * Create an instance of {@link SystemIDType }
     * 
     */
    public SystemIDType createSystemIDType() {
        return new SystemIDType();
    }

    /**
     * Create an instance of {@link AgencyIDType }
     * 
     */
    public AgencyIDType createAgencyIDType() {
        return new AgencyIDType();
    }

    /**
     * Create an instance of {@link AgentUserIDType }
     * 
     */
    public AgentUserIDType createAgentUserIDType() {
        return new AgentUserIDType();
    }

    /**
     * Create an instance of {@link PartnerCompanyIDType }
     * 
     */
    public PartnerCompanyIDType createPartnerCompanyIDType() {
        return new PartnerCompanyIDType();
    }

    /**
     * Create an instance of {@link MsgDocumentType }
     * 
     */
    public MsgDocumentType createMsgDocumentType() {
        return new MsgDocumentType();
    }

    /**
     * Create an instance of {@link Policies.Policy }
     * 
     */
    public Policies.Policy createPoliciesPolicy() {
        return new Policies.Policy();
    }

    /**
     * Create an instance of {@link ORAAirlineSenderType }
     * 
     */
    public ORAAirlineSenderType createORAAirlineSenderType() {
        return new ORAAirlineSenderType();
    }

    /**
     * Create an instance of {@link POAAirlineSenderType }
     * 
     */
    public POAAirlineSenderType createPOAAirlineSenderType() {
        return new POAAirlineSenderType();
    }

    /**
     * Create an instance of {@link AggregatorSenderType }
     * 
     */
    public AggregatorSenderType createAggregatorSenderType() {
        return new AggregatorSenderType();
    }

    /**
     * Create an instance of {@link AgentUserSenderType }
     * 
     */
    public AgentUserSenderType createAgentUserSenderType() {
        return new AgentUserSenderType();
    }

    /**
     * Create an instance of {@link EnabledSysSenderType }
     * 
     */
    public EnabledSysSenderType createEnabledSysSenderType() {
        return new EnabledSysSenderType();
    }

    /**
     * Create an instance of {@link MarketingCarrierSenderType }
     * 
     */
    public MarketingCarrierSenderType createMarketingCarrierSenderType() {
        return new MarketingCarrierSenderType();
    }

    /**
     * Create an instance of {@link OperatingCarrierSenderType }
     * 
     */
    public OperatingCarrierSenderType createOperatingCarrierSenderType() {
        return new OperatingCarrierSenderType();
    }

    /**
     * Create an instance of {@link RetailSupplierSenderType }
     * 
     */
    public RetailSupplierSenderType createRetailSupplierSenderType() {
        return new RetailSupplierSenderType();
    }

    /**
     * Create an instance of {@link TravelAgencySenderType }
     * 
     */
    public TravelAgencySenderType createTravelAgencySenderType() {
        return new TravelAgencySenderType();
    }

    /**
     * Create an instance of {@link CorporateSender }
     * 
     */
    public CorporateSender createCorporateSender() {
        return new CorporateSender();
    }

    /**
     * Create an instance of {@link CorporateParticipant }
     * 
     */
    public CorporateParticipant createCorporateParticipant() {
        return new CorporateParticipant();
    }

    /**
     * Create an instance of {@link AggregatorRecipientType }
     * 
     */
    public AggregatorRecipientType createAggregatorRecipientType() {
        return new AggregatorRecipientType();
    }

    /**
     * Create an instance of {@link AgentUserRecipientType }
     * 
     */
    public AgentUserRecipientType createAgentUserRecipientType() {
        return new AgentUserRecipientType();
    }

    /**
     * Create an instance of {@link EnabledSysRecipientType }
     * 
     */
    public EnabledSysRecipientType createEnabledSysRecipientType() {
        return new EnabledSysRecipientType();
    }

    /**
     * Create an instance of {@link MarketingCarrierRecipientType }
     * 
     */
    public MarketingCarrierRecipientType createMarketingCarrierRecipientType() {
        return new MarketingCarrierRecipientType();
    }

    /**
     * Create an instance of {@link OperatingCarrierRecipientType }
     * 
     */
    public OperatingCarrierRecipientType createOperatingCarrierRecipientType() {
        return new OperatingCarrierRecipientType();
    }

    /**
     * Create an instance of {@link ORAAirlineRecipientType }
     * 
     */
    public ORAAirlineRecipientType createORAAirlineRecipientType() {
        return new ORAAirlineRecipientType();
    }

    /**
     * Create an instance of {@link POAAirlineRecipientType }
     * 
     */
    public POAAirlineRecipientType createPOAAirlineRecipientType() {
        return new POAAirlineRecipientType();
    }

    /**
     * Create an instance of {@link RetailSupplierRecipientType }
     * 
     */
    public RetailSupplierRecipientType createRetailSupplierRecipientType() {
        return new RetailSupplierRecipientType();
    }

    /**
     * Create an instance of {@link TravelAgencyRecipientType }
     * 
     */
    public TravelAgencyRecipientType createTravelAgencyRecipientType() {
        return new TravelAgencyRecipientType();
    }

    /**
     * Create an instance of {@link AggregatorParticipantType }
     * 
     */
    public AggregatorParticipantType createAggregatorParticipantType() {
        return new AggregatorParticipantType();
    }

    /**
     * Create an instance of {@link EnabledSysParticipantType }
     * 
     */
    public EnabledSysParticipantType createEnabledSysParticipantType() {
        return new EnabledSysParticipantType();
    }

    /**
     * Create an instance of {@link MarketingCarrierParticipantType }
     * 
     */
    public MarketingCarrierParticipantType createMarketingCarrierParticipantType() {
        return new MarketingCarrierParticipantType();
    }

    /**
     * Create an instance of {@link OperatingCarrierParticipantType }
     * 
     */
    public OperatingCarrierParticipantType createOperatingCarrierParticipantType() {
        return new OperatingCarrierParticipantType();
    }

    /**
     * Create an instance of {@link ORAAirlineParticipantType }
     * 
     */
    public ORAAirlineParticipantType createORAAirlineParticipantType() {
        return new ORAAirlineParticipantType();
    }

    /**
     * Create an instance of {@link POAAirlineParticipantType }
     * 
     */
    public POAAirlineParticipantType createPOAAirlineParticipantType() {
        return new POAAirlineParticipantType();
    }

    /**
     * Create an instance of {@link RetailSupplierParticipantType }
     * 
     */
    public RetailSupplierParticipantType createRetailSupplierParticipantType() {
        return new RetailSupplierParticipantType();
    }

    /**
     * Create an instance of {@link TravelAgencyParticipantType }
     * 
     */
    public TravelAgencyParticipantType createTravelAgencyParticipantType() {
        return new TravelAgencyParticipantType();
    }

    /**
     * Create an instance of {@link ErrorsType }
     * 
     */
    public ErrorsType createErrorsType() {
        return new ErrorsType();
    }

    /**
     * Create an instance of {@link ACSTxnReference }
     * 
     */
    public ACSTxnReference createACSTxnReference() {
        return new ACSTxnReference();
    }

    /**
     * Create an instance of {@link ReservationInfo }
     * 
     */
    public ReservationInfo createReservationInfo() {
        return new ReservationInfo();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.ClassesOfService }
     * 
     */
    public SecurePaymentPaxInfoType.ClassesOfService createSecurePaymentPaxInfoTypeClassesOfService() {
        return new SecurePaymentPaxInfoType.ClassesOfService();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.FareBasisCodes }
     * 
     */
    public SecurePaymentPaxInfoType.FareBasisCodes createSecurePaymentPaxInfoTypeFareBasisCodes() {
        return new SecurePaymentPaxInfoType.FareBasisCodes();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.FlightNumbers }
     * 
     */
    public SecurePaymentPaxInfoType.FlightNumbers createSecurePaymentPaxInfoTypeFlightNumbers() {
        return new SecurePaymentPaxInfoType.FlightNumbers();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.ResidenceCode }
     * 
     */
    public SecurePaymentPaxInfoType.ResidenceCode createSecurePaymentPaxInfoTypeResidenceCode() {
        return new SecurePaymentPaxInfoType.ResidenceCode();
    }

    /**
     * Create an instance of {@link SPMTxnReference }
     * 
     */
    public SPMTxnReference createSPMTxnReference() {
        return new SPMTxnReference();
    }

    /**
     * Create an instance of {@link MarketingMessages.MarketMessage }
     * 
     */
    public MarketingMessages.MarketMessage createMarketingMessagesMarketMessage() {
        return new MarketingMessages.MarketMessage();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Notices.Notice }
     * 
     */
    public com.springboot.dto.offerpricers.Notices.Notice createNoticesNotice() {
        return new com.springboot.dto.offerpricers.Notices.Notice();
    }

    /**
     * Create an instance of {@link PriceVarianceNotice }
     * 
     */
    public PriceVarianceNotice createPriceVarianceNotice() {
        return new PriceVarianceNotice();
    }

    /**
     * Create an instance of {@link TrxProcessObjectBaseType }
     * 
     */
    public TrxProcessObjectBaseType createTrxProcessObjectBaseType() {
        return new TrxProcessObjectBaseType();
    }

    /**
     * Create an instance of {@link ListOfOfferTermsType }
     * 
     */
    public ListOfOfferTermsType createListOfOfferTermsType() {
        return new ListOfOfferTermsType();
    }

    /**
     * Create an instance of {@link ListOfV172PriceClassType }
     * 
     */
    public ListOfV172PriceClassType createListOfV172PriceClassType() {
        return new ListOfV172PriceClassType();
    }

    /**
     * Create an instance of {@link ServiceList }
     * 
     */
    public ServiceList createServiceList() {
        return new ServiceList();
    }

    /**
     * Create an instance of {@link FareBasisCodeType }
     * 
     */
    public FareBasisCodeType createFareBasisCodeType() {
        return new FareBasisCodeType();
    }

    /**
     * Create an instance of {@link FareType }
     * 
     */
    public FareType createFareType() {
        return new FareType();
    }

    /**
     * Create an instance of {@link AdvancePurchase }
     * 
     */
    public AdvancePurchase createAdvancePurchase() {
        return new AdvancePurchase();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceReservation }
     * 
     */
    public AdvanceTicketing.AdvanceReservation createAdvanceTicketingAdvanceReservation() {
        return new AdvanceTicketing.AdvanceReservation();
    }

    /**
     * Create an instance of {@link AdvanceTicketing.AdvanceDeparture }
     * 
     */
    public AdvanceTicketing.AdvanceDeparture createAdvanceTicketingAdvanceDeparture() {
        return new AdvanceTicketing.AdvanceDeparture();
    }

    /**
     * Create an instance of {@link KeyObjectBaseType }
     * 
     */
    public KeyObjectBaseType createKeyObjectBaseType() {
        return new KeyObjectBaseType();
    }

    /**
     * Create an instance of {@link CorporateFare.CompanyIndex }
     * 
     */
    public CorporateFare.CompanyIndex createCorporateFareCompanyIndex() {
        return new CorporateFare.CompanyIndex();
    }

    /**
     * Create an instance of {@link CorporateFare.Contract }
     * 
     */
    public CorporateFare.Contract createCorporateFareContract() {
        return new CorporateFare.Contract();
    }

    /**
     * Create an instance of {@link CorporateFare.Account }
     * 
     */
    public CorporateFare.Account createCorporateFareAccount() {
        return new CorporateFare.Account();
    }

    /**
     * Create an instance of {@link MinimumStay.DayQuantity }
     * 
     */
    public MinimumStay.DayQuantity createMinimumStayDayQuantity() {
        return new MinimumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link MaximumStay.DayQuantity }
     * 
     */
    public MaximumStay.DayQuantity createMaximumStayDayQuantity() {
        return new MaximumStay.DayQuantity();
    }

    /**
     * Create an instance of {@link FareRulesRemarks.FareRulesRemark }
     * 
     */
    public FareRulesRemarks.FareRulesRemark createFareRulesRemarksFareRulesRemark() {
        return new FareRulesRemarks.FareRulesRemark();
    }

    /**
     * Create an instance of {@link FareFilingType }
     * 
     */
    public FareFilingType createFareFilingType() {
        return new FareFilingType();
    }

    /**
     * Create an instance of {@link FiledFare }
     * 
     */
    public FiledFare createFiledFare() {
        return new FiledFare();
    }

    /**
     * Create an instance of {@link FileFareType.FareIndicatorCode }
     * 
     */
    public FileFareType.FareIndicatorCode createFileFareTypeFareIndicatorCode() {
        return new FileFareType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link FareQualifierCodes }
     * 
     */
    public FareQualifierCodes createFareQualifierCodes() {
        return new FareQualifierCodes();
    }

    /**
     * Create an instance of {@link FareReferenceKey }
     * 
     */
    public FareReferenceKey createFareReferenceKey() {
        return new FareReferenceKey();
    }

    /**
     * Create an instance of {@link FlightNumber }
     * 
     */
    public FlightNumber createFlightNumber() {
        return new FlightNumber();
    }

    /**
     * Create an instance of {@link ArrivalCode }
     * 
     */
    public ArrivalCode createArrivalCode() {
        return new ArrivalCode();
    }

    /**
     * Create an instance of {@link Departure }
     * 
     */
    public Departure createDeparture() {
        return new Departure();
    }

    /**
     * Create an instance of {@link FlightDepartureType.AirportCode }
     * 
     */
    public FlightDepartureType.AirportCode createFlightDepartureTypeAirportCode() {
        return new FlightDepartureType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightDepartureType.Terminal }
     * 
     */
    public FlightDepartureType.Terminal createFlightDepartureTypeTerminal() {
        return new FlightDepartureType.Terminal();
    }

    /**
     * Create an instance of {@link DepartureCode }
     * 
     */
    public DepartureCode createDepartureCode() {
        return new DepartureCode();
    }

    /**
     * Create an instance of {@link FlightDistanceType }
     * 
     */
    public FlightDistanceType createFlightDistanceType() {
        return new FlightDistanceType();
    }

    /**
     * Create an instance of {@link FlightDurationType }
     * 
     */
    public FlightDurationType createFlightDurationType() {
        return new FlightDurationType();
    }

    /**
     * Create an instance of {@link FlightFrequencyType }
     * 
     */
    public FlightFrequencyType createFlightFrequencyType() {
        return new FlightFrequencyType();
    }

    /**
     * Create an instance of {@link OnTimePerformance }
     * 
     */
    public OnTimePerformance createOnTimePerformance() {
        return new OnTimePerformance();
    }

    /**
     * Create an instance of {@link FlightMileageType }
     * 
     */
    public FlightMileageType createFlightMileageType() {
        return new FlightMileageType();
    }

    /**
     * Create an instance of {@link ResDateTime.Date }
     * 
     */
    public ResDateTime.Date createResDateTimeDate() {
        return new ResDateTime.Date();
    }

    /**
     * Create an instance of {@link AircraftCode }
     * 
     */
    public AircraftCode createAircraftCode() {
        return new AircraftCode();
    }

    /**
     * Create an instance of {@link AircraftCodeType }
     * 
     */
    public AircraftCodeType createAircraftCodeType() {
        return new AircraftCodeType();
    }

    /**
     * Create an instance of {@link AircraftSummaryType }
     * 
     */
    public AircraftSummaryType createAircraftSummaryType() {
        return new AircraftSummaryType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.CabinType }
     * 
     */
    public com.springboot.dto.offerpricers.CabinType createCabinType() {
        return new com.springboot.dto.offerpricers.CabinType();
    }

    /**
     * Create an instance of {@link CodesetType }
     * 
     */
    public CodesetType createCodesetType() {
        return new CodesetType();
    }

    /**
     * Create an instance of {@link OriginDestination }
     * 
     */
    public OriginDestination createOriginDestination() {
        return new OriginDestination();
    }

    /**
     * Create an instance of {@link OriginDestinationType }
     * 
     */
    public OriginDestinationType createOriginDestinationType() {
        return new OriginDestinationType();
    }

    /**
     * Create an instance of {@link FlightReferences }
     * 
     */
    public FlightReferences createFlightReferences() {
        return new FlightReferences();
    }

    /**
     * Create an instance of {@link ItemIDType }
     * 
     */
    public ItemIDType createItemIDType() {
        return new ItemIDType();
    }

    /**
     * Create an instance of {@link BagDetailAssociation }
     * 
     */
    public BagDetailAssociation createBagDetailAssociation() {
        return new BagDetailAssociation();
    }

    /**
     * Create an instance of {@link FlightSegmentReference }
     * 
     */
    public FlightSegmentReference createFlightSegmentReference() {
        return new FlightSegmentReference();
    }

    /**
     * Create an instance of {@link SimpleAircraftCabinType }
     * 
     */
    public SimpleAircraftCabinType createSimpleAircraftCabinType() {
        return new SimpleAircraftCabinType();
    }

    /**
     * Create an instance of {@link SegmentReferences }
     * 
     */
    public SegmentReferences createSegmentReferences() {
        return new SegmentReferences();
    }

    /**
     * Create an instance of {@link AddressMetadatas }
     * 
     */
    public AddressMetadatas createAddressMetadatas() {
        return new AddressMetadatas();
    }

    /**
     * Create an instance of {@link AircraftMetadatas }
     * 
     */
    public AircraftMetadatas createAircraftMetadatas() {
        return new AircraftMetadatas();
    }

    /**
     * Create an instance of {@link AircraftMetadataType }
     * 
     */
    public AircraftMetadataType createAircraftMetadataType() {
        return new AircraftMetadataType();
    }

    /**
     * Create an instance of {@link AirportMetadatas }
     * 
     */
    public AirportMetadatas createAirportMetadatas() {
        return new AirportMetadatas();
    }

    /**
     * Create an instance of {@link CityMetadatas }
     * 
     */
    public CityMetadatas createCityMetadatas() {
        return new CityMetadatas();
    }

    /**
     * Create an instance of {@link CityMetadataType }
     * 
     */
    public CityMetadataType createCityMetadataType() {
        return new CityMetadataType();
    }

    /**
     * Create an instance of {@link CodesetMetadatas }
     * 
     */
    public CodesetMetadatas createCodesetMetadatas() {
        return new CodesetMetadatas();
    }

    /**
     * Create an instance of {@link ContactMetadatas }
     * 
     */
    public ContactMetadatas createContactMetadatas() {
        return new ContactMetadatas();
    }

    /**
     * Create an instance of {@link ContactMetadataType }
     * 
     */
    public ContactMetadataType createContactMetadataType() {
        return new ContactMetadataType();
    }

    /**
     * Create an instance of {@link ContentMetadatas }
     * 
     */
    public ContentMetadatas createContentMetadatas() {
        return new ContentMetadatas();
    }

    /**
     * Create an instance of {@link ContentMetadataType }
     * 
     */
    public ContentMetadataType createContentMetadataType() {
        return new ContentMetadataType();
    }

    /**
     * Create an instance of {@link CountryMetadatas }
     * 
     */
    public CountryMetadatas createCountryMetadatas() {
        return new CountryMetadatas();
    }

    /**
     * Create an instance of {@link CountryMetadataType }
     * 
     */
    public CountryMetadataType createCountryMetadataType() {
        return new CountryMetadataType();
    }

    /**
     * Create an instance of {@link CurrencyMetadatas }
     * 
     */
    public CurrencyMetadatas createCurrencyMetadatas() {
        return new CurrencyMetadatas();
    }

    /**
     * Create an instance of {@link CurrencyMetadata }
     * 
     */
    public CurrencyMetadata createCurrencyMetadata() {
        return new CurrencyMetadata();
    }

    /**
     * Create an instance of {@link CurrencyMetadataType }
     * 
     */
    public CurrencyMetadataType createCurrencyMetadataType() {
        return new CurrencyMetadataType();
    }

    /**
     * Create an instance of {@link MetadataObjectBaseType }
     * 
     */
    public MetadataObjectBaseType createMetadataObjectBaseType() {
        return new MetadataObjectBaseType();
    }

    /**
     * Create an instance of {@link DescriptionMetadatas }
     * 
     */
    public DescriptionMetadatas createDescriptionMetadatas() {
        return new DescriptionMetadatas();
    }

    /**
     * Create an instance of {@link DescriptionMetadataType }
     * 
     */
    public DescriptionMetadataType createDescriptionMetadataType() {
        return new DescriptionMetadataType();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadatas }
     * 
     */
    public EquivalentIDMetadatas createEquivalentIDMetadatas() {
        return new EquivalentIDMetadatas();
    }

    /**
     * Create an instance of {@link LanguageMetadatas }
     * 
     */
    public LanguageMetadatas createLanguageMetadatas() {
        return new LanguageMetadatas();
    }

    /**
     * Create an instance of {@link LanguageMetadataType }
     * 
     */
    public LanguageMetadataType createLanguageMetadataType() {
        return new LanguageMetadataType();
    }

    /**
     * Create an instance of {@link MediaMetadatas }
     * 
     */
    public MediaMetadatas createMediaMetadatas() {
        return new MediaMetadatas();
    }

    /**
     * Create an instance of {@link PaymentCardMetadatas }
     * 
     */
    public PaymentCardMetadatas createPaymentCardMetadatas() {
        return new PaymentCardMetadatas();
    }

    /**
     * Create an instance of {@link PaymentFormMetadatas }
     * 
     */
    public PaymentFormMetadatas createPaymentFormMetadatas() {
        return new PaymentFormMetadatas();
    }

    /**
     * Create an instance of {@link PaymentFormMetadataType }
     * 
     */
    public PaymentFormMetadataType createPaymentFormMetadataType() {
        return new PaymentFormMetadataType();
    }

    /**
     * Create an instance of {@link PriceMetadatas }
     * 
     */
    public PriceMetadatas createPriceMetadatas() {
        return new PriceMetadatas();
    }

    /**
     * Create an instance of {@link PriceMetadataType }
     * 
     */
    public PriceMetadataType createPriceMetadataType() {
        return new PriceMetadataType();
    }

    /**
     * Create an instance of {@link RuleMetadatas }
     * 
     */
    public RuleMetadatas createRuleMetadatas() {
        return new RuleMetadatas();
    }

    /**
     * Create an instance of {@link StateProvMetadatas }
     * 
     */
    public StateProvMetadatas createStateProvMetadatas() {
        return new StateProvMetadatas();
    }

    /**
     * Create an instance of {@link StateProvMetadataType }
     * 
     */
    public StateProvMetadataType createStateProvMetadataType() {
        return new StateProvMetadataType();
    }

    /**
     * Create an instance of {@link ZoneMetadatas }
     * 
     */
    public ZoneMetadatas createZoneMetadatas() {
        return new ZoneMetadatas();
    }

    /**
     * Create an instance of {@link ZoneMetadataType }
     * 
     */
    public ZoneMetadataType createZoneMetadataType() {
        return new ZoneMetadataType();
    }

    /**
     * Create an instance of {@link Baggage }
     * 
     */
    public Baggage createBaggage() {
        return new Baggage();
    }

    /**
     * Create an instance of {@link CheckedBagMetadatas }
     * 
     */
    public CheckedBagMetadatas createCheckedBagMetadatas() {
        return new CheckedBagMetadatas();
    }

    /**
     * Create an instance of {@link BaggageCheckedMetadataType }
     * 
     */
    public BaggageCheckedMetadataType createBaggageCheckedMetadataType() {
        return new BaggageCheckedMetadataType();
    }

    /**
     * Create an instance of {@link CarryOnBagMetadatas }
     * 
     */
    public CarryOnBagMetadatas createCarryOnBagMetadatas() {
        return new CarryOnBagMetadatas();
    }

    /**
     * Create an instance of {@link BaggageCarryOnMetadataType }
     * 
     */
    public BaggageCarryOnMetadataType createBaggageCarryOnMetadataType() {
        return new BaggageCarryOnMetadataType();
    }

    /**
     * Create an instance of {@link BaggageDisclosureMetadatas }
     * 
     */
    public BaggageDisclosureMetadatas createBaggageDisclosureMetadatas() {
        return new BaggageDisclosureMetadatas();
    }

    /**
     * Create an instance of {@link BaggageDisclosureMetadataType }
     * 
     */
    public BaggageDisclosureMetadataType createBaggageDisclosureMetadataType() {
        return new BaggageDisclosureMetadataType();
    }

    /**
     * Create an instance of {@link BaggageQueryMetadataType }
     * 
     */
    public BaggageQueryMetadataType createBaggageQueryMetadataType() {
        return new BaggageQueryMetadataType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Flight }
     * 
     */
    public com.springboot.dto.offerpricers.Flight createFlight() {
        return new com.springboot.dto.offerpricers.Flight();
    }

    /**
     * Create an instance of {@link FlightMetadatas }
     * 
     */
    public FlightMetadatas createFlightMetadatas() {
        return new FlightMetadatas();
    }

    /**
     * Create an instance of {@link FlightMetadata }
     * 
     */
    public FlightMetadata createFlightMetadata() {
        return new FlightMetadata();
    }

    /**
     * Create an instance of {@link FlightMetadataType.Meals }
     * 
     */
    public FlightMetadataType.Meals createFlightMetadataTypeMeals() {
        return new FlightMetadataType.Meals();
    }

    /**
     * Create an instance of {@link ItineraryMetadataType }
     * 
     */
    public ItineraryMetadataType createItineraryMetadataType() {
        return new ItineraryMetadataType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Location }
     * 
     */
    public com.springboot.dto.offerpricers.Location createLocation() {
        return new com.springboot.dto.offerpricers.Location();
    }

    /**
     * Create an instance of {@link DirectionMetadatas }
     * 
     */
    public DirectionMetadatas createDirectionMetadatas() {
        return new DirectionMetadatas();
    }

    /**
     * Create an instance of {@link DirectionsMetadataType }
     * 
     */
    public DirectionsMetadataType createDirectionsMetadataType() {
        return new DirectionsMetadataType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Offer }
     * 
     */
    public com.springboot.dto.offerpricers.Offer createOffer() {
        return new com.springboot.dto.offerpricers.Offer();
    }

    /**
     * Create an instance of {@link DisclosureMetadatas }
     * 
     */
    public DisclosureMetadatas createDisclosureMetadatas() {
        return new DisclosureMetadatas();
    }

    /**
     * Create an instance of {@link DisclosureMetadataType }
     * 
     */
    public DisclosureMetadataType createDisclosureMetadataType() {
        return new DisclosureMetadataType();
    }

    /**
     * Create an instance of {@link OfferMetadatas }
     * 
     */
    public OfferMetadatas createOfferMetadatas() {
        return new OfferMetadatas();
    }

    /**
     * Create an instance of {@link OfferInstructionMetadatas }
     * 
     */
    public OfferInstructionMetadatas createOfferInstructionMetadatas() {
        return new OfferInstructionMetadatas();
    }

    /**
     * Create an instance of {@link OfferInstructionMetadataType }
     * 
     */
    public OfferInstructionMetadataType createOfferInstructionMetadataType() {
        return new OfferInstructionMetadataType();
    }

    /**
     * Create an instance of {@link OfferPenaltyMetadatas }
     * 
     */
    public OfferPenaltyMetadatas createOfferPenaltyMetadatas() {
        return new OfferPenaltyMetadatas();
    }

    /**
     * Create an instance of {@link PenaltyMetadataType }
     * 
     */
    public PenaltyMetadataType createPenaltyMetadataType() {
        return new PenaltyMetadataType();
    }

    /**
     * Create an instance of {@link OfferTermsMetadatas }
     * 
     */
    public OfferTermsMetadatas createOfferTermsMetadatas() {
        return new OfferTermsMetadatas();
    }

    /**
     * Create an instance of {@link OfferTermsMetadataType }
     * 
     */
    public OfferTermsMetadataType createOfferTermsMetadataType() {
        return new OfferTermsMetadataType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Pricing }
     * 
     */
    public com.springboot.dto.offerpricers.Pricing createPricing() {
        return new com.springboot.dto.offerpricers.Pricing();
    }

    /**
     * Create an instance of {@link DiscountMetadatas }
     * 
     */
    public DiscountMetadatas createDiscountMetadatas() {
        return new DiscountMetadatas();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Qualifier }
     * 
     */
    public com.springboot.dto.offerpricers.Qualifier createQualifier() {
        return new com.springboot.dto.offerpricers.Qualifier();
    }

    /**
     * Create an instance of {@link BaggagePricingQualifierType }
     * 
     */
    public BaggagePricingQualifierType createBaggagePricingQualifierType() {
        return new BaggagePricingQualifierType();
    }

    /**
     * Create an instance of {@link ExistingOrderQualifier }
     * 
     */
    public ExistingOrderQualifier createExistingOrderQualifier() {
        return new ExistingOrderQualifier();
    }

    /**
     * Create an instance of {@link OrderQualiferType }
     * 
     */
    public OrderQualiferType createOrderQualiferType() {
        return new OrderQualiferType();
    }

    /**
     * Create an instance of {@link CardQualifierType }
     * 
     */
    public CardQualifierType createCardQualifierType() {
        return new CardQualifierType();
    }

    /**
     * Create an instance of {@link ProgramQualifiers }
     * 
     */
    public ProgramQualifiers createProgramQualifiers() {
        return new ProgramQualifiers();
    }

    /**
     * Create an instance of {@link ProgramQualifierType }
     * 
     */
    public ProgramQualifierType createProgramQualifierType() {
        return new ProgramQualifierType();
    }

    /**
     * Create an instance of {@link PromotionQualifiers }
     * 
     */
    public PromotionQualifiers createPromotionQualifiers() {
        return new PromotionQualifiers();
    }

    /**
     * Create an instance of {@link PromoQualifierType }
     * 
     */
    public PromoQualifierType createPromoQualifierType() {
        return new PromoQualifierType();
    }

    /**
     * Create an instance of {@link V172PromotionType.Code }
     * 
     */
    public V172PromotionType.Code createV172PromotionTypeCode() {
        return new V172PromotionType.Code();
    }

    /**
     * Create an instance of {@link V172PromotionType.Issuer }
     * 
     */
    public V172PromotionType.Issuer createV172PromotionTypeIssuer() {
        return new V172PromotionType.Issuer();
    }

    /**
     * Create an instance of {@link SeatQualifier.Assignment }
     * 
     */
    public SeatQualifier.Assignment createSeatQualifierAssignment() {
        return new SeatQualifier.Assignment();
    }

    /**
     * Create an instance of {@link SocialQualiferType }
     * 
     */
    public SocialQualiferType createSocialQualiferType() {
        return new SocialQualiferType();
    }

    /**
     * Create an instance of {@link SpecialQualiferType }
     * 
     */
    public SpecialQualiferType createSpecialQualiferType() {
        return new SpecialQualiferType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.Seat }
     * 
     */
    public com.springboot.dto.offerpricers.Seat createSeat() {
        return new com.springboot.dto.offerpricers.Seat();
    }

    /**
     * Create an instance of {@link SeatMetadatas }
     * 
     */
    public SeatMetadatas createSeatMetadatas() {
        return new SeatMetadatas();
    }

    /**
     * Create an instance of {@link SeatMetadataType }
     * 
     */
    public SeatMetadataType createSeatMetadataType() {
        return new SeatMetadataType();
    }

    /**
     * Create an instance of {@link SeatMapMetadatas }
     * 
     */
    public SeatMapMetadatas createSeatMapMetadatas() {
        return new SeatMapMetadatas();
    }

    /**
     * Create an instance of {@link SeatMapMetadataType }
     * 
     */
    public SeatMapMetadataType createSeatMapMetadataType() {
        return new SeatMapMetadataType();
    }

    /**
     * Create an instance of {@link ShopMetadataGroup }
     * 
     */
    public ShopMetadataGroup createShopMetadataGroup() {
        return new ShopMetadataGroup();
    }

    /**
     * Create an instance of {@link ApplicableFlight }
     * 
     */
    public ApplicableFlight createApplicableFlight() {
        return new ApplicableFlight();
    }

    /**
     * Create an instance of {@link FlightInfoAssocType }
     * 
     */
    public FlightInfoAssocType createFlightInfoAssocType() {
        return new FlightInfoAssocType();
    }

    /**
     * Create an instance of {@link ServiceInfoAssocType }
     * 
     */
    public ServiceInfoAssocType createServiceInfoAssocType() {
        return new ServiceInfoAssocType();
    }

    /**
     * Create an instance of {@link PassengerInfoAssocType }
     * 
     */
    public PassengerInfoAssocType createPassengerInfoAssocType() {
        return new PassengerInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferDetailInfoAssocType }
     * 
     */
    public OfferDetailInfoAssocType createOfferDetailInfoAssocType() {
        return new OfferDetailInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociations }
     * 
     */
    public OfferAssociations createOfferAssociations() {
        return new OfferAssociations();
    }

    /**
     * Create an instance of {@link ShopperInfoAssocType }
     * 
     */
    public ShopperInfoAssocType createShopperInfoAssocType() {
        return new ShopperInfoAssocType();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.PriceClass }
     * 
     */
    public OfferAssociationsType.PriceClass createOfferAssociationsTypePriceClass() {
        return new OfferAssociationsType.PriceClass();
    }

    /**
     * Create an instance of {@link BagDetailAssocType }
     * 
     */
    public BagDetailAssocType createBagDetailAssocType() {
        return new BagDetailAssocType();
    }

    /**
     * Create an instance of {@link OfferClassUpgradeType }
     * 
     */
    public OfferClassUpgradeType createOfferClassUpgradeType() {
        return new OfferClassUpgradeType();
    }

    /**
     * Create an instance of {@link FreeFormInstructionsType }
     * 
     */
    public FreeFormInstructionsType createFreeFormInstructionsType() {
        return new FreeFormInstructionsType();
    }

    /**
     * Create an instance of {@link PTCQuantityPricedType }
     * 
     */
    public PTCQuantityPricedType createPTCQuantityPricedType() {
        return new PTCQuantityPricedType();
    }

    /**
     * Create an instance of {@link PriceGuaranteeTimeLimit }
     * 
     */
    public PriceGuaranteeTimeLimit createPriceGuaranteeTimeLimit() {
        return new PriceGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link PriceGuarTimeLimitType }
     * 
     */
    public PriceGuarTimeLimitType createPriceGuarTimeLimitType() {
        return new PriceGuarTimeLimitType();
    }

    /**
     * Create an instance of {@link OrderItemDetails.OrderItemDetail }
     * 
     */
    public OrderItemDetails.OrderItemDetail createOrderItemDetailsOrderItemDetail() {
        return new OrderItemDetails.OrderItemDetail();
    }

    /**
     * Create an instance of {@link OrderInstructions }
     * 
     */
    public OrderInstructions createOrderInstructions() {
        return new OrderInstructions();
    }

    /**
     * Create an instance of {@link OrderInstructionType }
     * 
     */
    public OrderInstructionType createOrderInstructionType() {
        return new OrderInstructionType();
    }

    /**
     * Create an instance of {@link OrderV172CommissionType }
     * 
     */
    public OrderV172CommissionType createOrderV172CommissionType() {
        return new OrderV172CommissionType();
    }

    /**
     * Create an instance of {@link OrderIDType }
     * 
     */
    public OrderIDType createOrderIDType() {
        return new OrderIDType();
    }

    /**
     * Create an instance of {@link FlightItemType }
     * 
     */
    public FlightItemType createFlightItemType() {
        return new FlightItemType();
    }

    /**
     * Create an instance of {@link OtherItemType }
     * 
     */
    public OtherItemType createOtherItemType() {
        return new OtherItemType();
    }

    /**
     * Create an instance of {@link SeatItem }
     * 
     */
    public SeatItem createSeatItem() {
        return new SeatItem();
    }

    /**
     * Create an instance of {@link SeatItemType }
     * 
     */
    public SeatItemType createSeatItemType() {
        return new SeatItemType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.TimeLimits.PaymentTimeLimit }
     * 
     */
    public com.springboot.dto.offerpricers.TimeLimits.PaymentTimeLimit createTimeLimitsPaymentTimeLimit() {
        return new com.springboot.dto.offerpricers.TimeLimits.PaymentTimeLimit();
    }

    /**
     * Create an instance of {@link MiscChargeMethodType }
     * 
     */
    public MiscChargeMethodType createMiscChargeMethodType() {
        return new MiscChargeMethodType();
    }

    /**
     * Create an instance of {@link OtherMethodType }
     * 
     */
    public OtherMethodType createOtherMethodType() {
        return new OtherMethodType();
    }

    /**
     * Create an instance of {@link AltBaggageV172OfferType }
     * 
     */
    public AltBaggageV172OfferType createAltBaggageV172OfferType() {
        return new AltBaggageV172OfferType();
    }

    /**
     * Create an instance of {@link AltPricedFlightV172OfferType }
     * 
     */
    public AltPricedFlightV172OfferType createAltPricedFlightV172OfferType() {
        return new AltPricedFlightV172OfferType();
    }

    /**
     * Create an instance of {@link AltOtherV172OfferType }
     * 
     */
    public AltOtherV172OfferType createAltOtherV172OfferType() {
        return new AltOtherV172OfferType();
    }

    /**
     * Create an instance of {@link AltSeatV172OfferType }
     * 
     */
    public AltSeatV172OfferType createAltSeatV172OfferType() {
        return new AltSeatV172OfferType();
    }

    /**
     * Create an instance of {@link AdditionalReferenceType }
     * 
     */
    public AdditionalReferenceType createAdditionalReferenceType() {
        return new AdditionalReferenceType();
    }

    /**
     * Create an instance of {@link AgentID }
     * 
     */
    public AgentID createAgentID() {
        return new AgentID();
    }

    /**
     * Create an instance of {@link CouponAgentType.ID }
     * 
     */
    public CouponAgentType.ID createCouponAgentTypeID() {
        return new CouponAgentType.ID();
    }

    /**
     * Create an instance of {@link InConnectionWithType }
     * 
     */
    public InConnectionWithType createInConnectionWithType() {
        return new InConnectionWithType();
    }

    /**
     * Create an instance of {@link IssuingAirlineInfo }
     * 
     */
    public IssuingAirlineInfo createIssuingAirlineInfo() {
        return new IssuingAirlineInfo();
    }

    /**
     * Create an instance of {@link AirlineIssuanceType }
     * 
     */
    public AirlineIssuanceType createAirlineIssuanceType() {
        return new AirlineIssuanceType();
    }

    /**
     * Create an instance of {@link OriginalIssueInfo }
     * 
     */
    public OriginalIssueInfo createOriginalIssueInfo() {
        return new OriginalIssueInfo();
    }

    /**
     * Create an instance of {@link OriginalIssueType }
     * 
     */
    public OriginalIssueType createOriginalIssueType() {
        return new OriginalIssueType();
    }

    /**
     * Create an instance of {@link PricingInfo }
     * 
     */
    public PricingInfo createPricingInfo() {
        return new PricingInfo();
    }

    /**
     * Create an instance of {@link PricingInfoType }
     * 
     */
    public PricingInfoType createPricingInfoType() {
        return new PricingInfoType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.TicketDocument }
     * 
     */
    public com.springboot.dto.offerpricers.TicketDocument createTicketDocument() {
        return new com.springboot.dto.offerpricers.TicketDocument();
    }

    /**
     * Create an instance of {@link CouponTicketDocType }
     * 
     */
    public CouponTicketDocType createCouponTicketDocType() {
        return new CouponTicketDocType();
    }

    /**
     * Create an instance of {@link UnstructuredFareCalcType }
     * 
     */
    public UnstructuredFareCalcType createUnstructuredFareCalcType() {
        return new UnstructuredFareCalcType();
    }

    /**
     * Create an instance of {@link AcceptedPaymentFormType }
     * 
     */
    public AcceptedPaymentFormType createAcceptedPaymentFormType() {
        return new AcceptedPaymentFormType();
    }

    /**
     * Create an instance of {@link Security }
     * 
     */
    public Security createSecurity() {
        return new Security();
    }

    /**
     * Create an instance of {@link SecurityType.PseudoCityCode }
     * 
     */
    public SecurityType.PseudoCityCode createSecurityTypePseudoCityCode() {
        return new SecurityType.PseudoCityCode();
    }

    /**
     * Create an instance of {@link SrvcLocationAirportType }
     * 
     */
    public SrvcLocationAirportType createSrvcLocationAirportType() {
        return new SrvcLocationAirportType();
    }

    /**
     * Create an instance of {@link SrvcLocationAddressType }
     * 
     */
    public SrvcLocationAddressType createSrvcLocationAddressType() {
        return new SrvcLocationAddressType();
    }

    /**
     * Create an instance of {@link ServiceCombinations }
     * 
     */
    public ServiceCombinations createServiceCombinations() {
        return new ServiceCombinations();
    }

    /**
     * Create an instance of {@link ServiceCombinationType.Combination }
     * 
     */
    public ServiceCombinationType.Combination createServiceCombinationTypeCombination() {
        return new ServiceCombinationType.Combination();
    }

    /**
     * Create an instance of {@link ServiceItemQuantityType }
     * 
     */
    public ServiceItemQuantityType createServiceItemQuantityType() {
        return new ServiceItemQuantityType();
    }

    /**
     * Create an instance of {@link ServiceIDType }
     * 
     */
    public ServiceIDType createServiceIDType() {
        return new ServiceIDType();
    }

    /**
     * Create an instance of {@link AffinityCountryDepartType }
     * 
     */
    public AffinityCountryDepartType createAffinityCountryDepartType() {
        return new AffinityCountryDepartType();
    }

    /**
     * Create an instance of {@link AffinityCountryArriveType }
     * 
     */
    public AffinityCountryArriveType createAffinityCountryArriveType() {
        return new AffinityCountryArriveType();
    }

    /**
     * Create an instance of {@link AffinityReferencePointDepartType }
     * 
     */
    public AffinityReferencePointDepartType createAffinityReferencePointDepartType() {
        return new AffinityReferencePointDepartType();
    }

    /**
     * Create an instance of {@link AffinityReferencePointArriveType }
     * 
     */
    public AffinityReferencePointArriveType createAffinityReferencePointArriveType() {
        return new AffinityReferencePointArriveType();
    }

    /**
     * Create an instance of {@link AffinityStateProvDepartType }
     * 
     */
    public AffinityStateProvDepartType createAffinityStateProvDepartType() {
        return new AffinityStateProvDepartType();
    }

    /**
     * Create an instance of {@link AffinityStateProvArriveType }
     * 
     */
    public AffinityStateProvArriveType createAffinityStateProvArriveType() {
        return new AffinityStateProvArriveType();
    }

    /**
     * Create an instance of {@link LeadDatePeriodType }
     * 
     */
    public LeadDatePeriodType createLeadDatePeriodType() {
        return new LeadDatePeriodType();
    }

    /**
     * Create an instance of {@link LeadTimePeriodType }
     * 
     */
    public LeadTimePeriodType createLeadTimePeriodType() {
        return new LeadTimePeriodType();
    }

    /**
     * Create an instance of {@link IncentiveProgramQualifier }
     * 
     */
    public IncentiveProgramQualifier createIncentiveProgramQualifier() {
        return new IncentiveProgramQualifier();
    }

    /**
     * Create an instance of {@link IncentiveProgramType.AccountID }
     * 
     */
    public IncentiveProgramType.AccountID createIncentiveProgramTypeAccountID() {
        return new IncentiveProgramType.AccountID();
    }

    /**
     * Create an instance of {@link IncentiveProgramType.MemberStatus }
     * 
     */
    public IncentiveProgramType.MemberStatus createIncentiveProgramTypeMemberStatus() {
        return new IncentiveProgramType.MemberStatus();
    }

    /**
     * Create an instance of {@link ProgramStatusQualifier }
     * 
     */
    public ProgramStatusQualifier createProgramStatusQualifier() {
        return new ProgramStatusQualifier();
    }

    /**
     * Create an instance of {@link StayPeriodDateRangeType }
     * 
     */
    public StayPeriodDateRangeType createStayPeriodDateRangeType() {
        return new StayPeriodDateRangeType();
    }

    /**
     * Create an instance of {@link StayPeriodSeasonType }
     * 
     */
    public StayPeriodSeasonType createStayPeriodSeasonType() {
        return new StayPeriodSeasonType();
    }

    /**
     * Create an instance of {@link SeatAssociation }
     * 
     */
    public SeatAssociation createSeatAssociation() {
        return new SeatAssociation();
    }

    /**
     * Create an instance of {@link CabinPreferencesType }
     * 
     */
    public CabinPreferencesType createCabinPreferencesType() {
        return new CabinPreferencesType();
    }

    /**
     * Create an instance of {@link Preference }
     * 
     */
    public Preference createPreference() {
        return new Preference();
    }

    /**
     * Create an instance of {@link BestPricingPreferencesType }
     * 
     */
    public BestPricingPreferencesType createBestPricingPreferencesType() {
        return new BestPricingPreferencesType();
    }

    /**
     * Create an instance of {@link ServicePricingOnlyPreference }
     * 
     */
    public ServicePricingOnlyPreference createServicePricingOnlyPreference() {
        return new ServicePricingOnlyPreference();
    }

    /**
     * Create an instance of {@link TravelTimePreferencesType }
     * 
     */
    public TravelTimePreferencesType createTravelTimePreferencesType() {
        return new TravelTimePreferencesType();
    }

    /**
     * Create an instance of {@link TravelDistancePreferencesType }
     * 
     */
    public TravelDistancePreferencesType createTravelDistancePreferencesType() {
        return new TravelDistancePreferencesType();
    }

    /**
     * Create an instance of {@link GeoSpecCode }
     * 
     */
    public GeoSpecCode createGeoSpecCode() {
        return new GeoSpecCode();
    }

    /**
     * Create an instance of {@link ImageID }
     * 
     */
    public ImageID createImageID() {
        return new ImageID();
    }

    /**
     * Create an instance of {@link OrderListParamsType }
     * 
     */
    public OrderListParamsType createOrderListParamsType() {
        return new OrderListParamsType();
    }

    /**
     * Create an instance of {@link OfferPriceRS }
     * 
     */
    public OfferPriceRS createOfferPriceRS() {
        return new OfferPriceRS();
    }

    /**
     * Create an instance of {@link IATAPayloadStandardAttributesType }
     * 
     */
    public IATAPayloadStandardAttributesType createIATAPayloadStandardAttributesType() {
        return new IATAPayloadStandardAttributesType();
    }

    /**
     * Create an instance of {@link MessageDocType }
     * 
     */
    public MessageDocType createMessageDocType() {
        return new MessageDocType();
    }

    /**
     * Create an instance of {@link ResponseType }
     * 
     */
    public ResponseType createResponseType() {
        return new ResponseType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link ActorObjectType }
     * 
     */
    public ActorObjectType createActorObjectType() {
        return new ActorObjectType();
    }

    /**
     * Create an instance of {@link CoreBaseType }
     * 
     */
    public CoreBaseType createCoreBaseType() {
        return new CoreBaseType();
    }

    /**
     * Create an instance of {@link ListBaseType }
     * 
     */
    public ListBaseType createListBaseType() {
        return new ListBaseType();
    }

    /**
     * Create an instance of {@link MetaBaseType }
     * 
     */
    public MetaBaseType createMetaBaseType() {
        return new MetaBaseType();
    }

    /**
     * Create an instance of {@link AssociatedObjectBaseType }
     * 
     */
    public AssociatedObjectBaseType createAssociatedObjectBaseType() {
        return new AssociatedObjectBaseType();
    }

    /**
     * Create an instance of {@link AugPointType }
     * 
     */
    public AugPointType createAugPointType() {
        return new AugPointType();
    }

    /**
     * Create an instance of {@link UniqueIDContextType }
     * 
     */
    public UniqueIDContextType createUniqueIDContextType() {
        return new UniqueIDContextType();
    }

    /**
     * Create an instance of {@link DateTimePeriodType }
     * 
     */
    public DateTimePeriodType createDateTimePeriodType() {
        return new DateTimePeriodType();
    }

    /**
     * Create an instance of {@link DatePeriodType }
     * 
     */
    public DatePeriodType createDatePeriodType() {
        return new DatePeriodType();
    }

    /**
     * Create an instance of {@link DayRepType }
     * 
     */
    public DayRepType createDayRepType() {
        return new DayRepType();
    }

    /**
     * Create an instance of {@link TimestampRepType }
     * 
     */
    public TimestampRepType createTimestampRepType() {
        return new TimestampRepType();
    }

    /**
     * Create an instance of {@link BagV172DisclosureType }
     * 
     */
    public BagV172DisclosureType createBagV172DisclosureType() {
        return new BagV172DisclosureType();
    }

    /**
     * Create an instance of {@link ContactCoreType }
     * 
     */
    public ContactCoreType createContactCoreType() {
        return new ContactCoreType();
    }

    /**
     * Create an instance of {@link EmailIDType }
     * 
     */
    public EmailIDType createEmailIDType() {
        return new EmailIDType();
    }

    /**
     * Create an instance of {@link CountryProximityType }
     * 
     */
    public CountryProximityType createCountryProximityType() {
        return new CountryProximityType();
    }

    /**
     * Create an instance of {@link CurrencyCodeType }
     * 
     */
    public CurrencyCodeType createCurrencyCodeType() {
        return new CurrencyCodeType();
    }

    /**
     * Create an instance of {@link MediaIDType }
     * 
     */
    public MediaIDType createMediaIDType() {
        return new MediaIDType();
    }

    /**
     * Create an instance of {@link V172DiscountType }
     * 
     */
    public V172DiscountType createV172DiscountType() {
        return new V172DiscountType();
    }

    /**
     * Create an instance of {@link PriceCoreType }
     * 
     */
    public PriceCoreType createPriceCoreType() {
        return new PriceCoreType();
    }

    /**
     * Create an instance of {@link StateProvCodeType }
     * 
     */
    public StateProvCodeType createStateProvCodeType() {
        return new StateProvCodeType();
    }

    /**
     * Create an instance of {@link TaxCoreType }
     * 
     */
    public TaxCoreType createTaxCoreType() {
        return new TaxCoreType();
    }

    /**
     * Create an instance of {@link InstrV172CommissionType }
     * 
     */
    public InstrV172CommissionType createInstrV172CommissionType() {
        return new InstrV172CommissionType();
    }

    /**
     * Create an instance of {@link InstrV172RemarkType }
     * 
     */
    public InstrV172RemarkType createInstrV172RemarkType() {
        return new InstrV172RemarkType();
    }

    /**
     * Create an instance of {@link GroupType }
     * 
     */
    public GroupType createGroupType() {
        return new GroupType();
    }

    /**
     * Create an instance of {@link AirlineCoreRepType }
     * 
     */
    public AirlineCoreRepType createAirlineCoreRepType() {
        return new AirlineCoreRepType();
    }

    /**
     * Create an instance of {@link MarketingCarrierFlightType }
     * 
     */
    public MarketingCarrierFlightType createMarketingCarrierFlightType() {
        return new MarketingCarrierFlightType();
    }

    /**
     * Create an instance of {@link OperatingCarrierFlightType }
     * 
     */
    public OperatingCarrierFlightType createOperatingCarrierFlightType() {
        return new OperatingCarrierFlightType();
    }

    /**
     * Create an instance of {@link RetailerType }
     * 
     */
    public RetailerType createRetailerType() {
        return new RetailerType();
    }

    /**
     * Create an instance of {@link V172AggregatorType }
     * 
     */
    public V172AggregatorType createV172AggregatorType() {
        return new V172AggregatorType();
    }

    /**
     * Create an instance of {@link V172EnabledSystemType }
     * 
     */
    public V172EnabledSystemType createV172EnabledSystemType() {
        return new V172EnabledSystemType();
    }

    /**
     * Create an instance of {@link SellerCoreRepType }
     * 
     */
    public SellerCoreRepType createSellerCoreRepType() {
        return new SellerCoreRepType();
    }

    /**
     * Create an instance of {@link V172TravelAgencyType }
     * 
     */
    public V172TravelAgencyType createV172TravelAgencyType() {
        return new V172TravelAgencyType();
    }

    /**
     * Create an instance of {@link PartnerCoreRepType }
     * 
     */
    public PartnerCoreRepType createPartnerCoreRepType() {
        return new PartnerCoreRepType();
    }

    /**
     * Create an instance of {@link AgentUserMsgPartyCoreType }
     * 
     */
    public AgentUserMsgPartyCoreType createAgentUserMsgPartyCoreType() {
        return new AgentUserMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link AggregatorMsgPartyCoreType }
     * 
     */
    public AggregatorMsgPartyCoreType createAggregatorMsgPartyCoreType() {
        return new AggregatorMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link AirlineMsgPartyCoreType }
     * 
     */
    public AirlineMsgPartyCoreType createAirlineMsgPartyCoreType() {
        return new AirlineMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link EnabledSysMsgPartyCoreType }
     * 
     */
    public EnabledSysMsgPartyCoreType createEnabledSysMsgPartyCoreType() {
        return new EnabledSysMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link RetailerMsgPartyCoreType }
     * 
     */
    public RetailerMsgPartyCoreType createRetailerMsgPartyCoreType() {
        return new RetailerMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link TrvlAgencyMsgPartyCoreType }
     * 
     */
    public TrvlAgencyMsgPartyCoreType createTrvlAgencyMsgPartyCoreType() {
        return new TrvlAgencyMsgPartyCoreType();
    }

    /**
     * Create an instance of {@link V172ErrorType }
     * 
     */
    public V172ErrorType createV172ErrorType() {
        return new V172ErrorType();
    }

    /**
     * Create an instance of {@link FreeTextType }
     * 
     */
    public FreeTextType createFreeTextType() {
        return new FreeTextType();
    }

    /**
     * Create an instance of {@link ProcessingResultType }
     * 
     */
    public ProcessingResultType createProcessingResultType() {
        return new ProcessingResultType();
    }

    /**
     * Create an instance of {@link AlertType }
     * 
     */
    public AlertType createAlertType() {
        return new AlertType();
    }

    /**
     * Create an instance of {@link MultiAssociationType }
     * 
     */
    public MultiAssociationType createMultiAssociationType() {
        return new MultiAssociationType();
    }

    /**
     * Create an instance of {@link SecurePaymentUrlType }
     * 
     */
    public SecurePaymentUrlType createSecurePaymentUrlType() {
        return new SecurePaymentUrlType();
    }

    /**
     * Create an instance of {@link AuthAccountType }
     * 
     */
    public AuthAccountType createAuthAccountType() {
        return new AuthAccountType();
    }

    /**
     * Create an instance of {@link NoticeBaseType }
     * 
     */
    public NoticeBaseType createNoticeBaseType() {
        return new NoticeBaseType();
    }

    /**
     * Create an instance of {@link FarePriceDetailType }
     * 
     */
    public FarePriceDetailType createFarePriceDetailType() {
        return new FarePriceDetailType();
    }

    /**
     * Create an instance of {@link COSAssocType }
     * 
     */
    public COSAssocType createCOSAssocType() {
        return new COSAssocType();
    }

    /**
     * Create an instance of {@link AircraftCoreType }
     * 
     */
    public AircraftCoreType createAircraftCoreType() {
        return new AircraftCoreType();
    }

    /**
     * Create an instance of {@link AircraftCodeQueryType }
     * 
     */
    public AircraftCodeQueryType createAircraftCodeQueryType() {
        return new AircraftCodeQueryType();
    }

    /**
     * Create an instance of {@link AircraftTailNmbrQueryType }
     * 
     */
    public AircraftTailNmbrQueryType createAircraftTailNmbrQueryType() {
        return new AircraftTailNmbrQueryType();
    }

    /**
     * Create an instance of {@link BagOfferAssocType }
     * 
     */
    public BagOfferAssocType createBagOfferAssocType() {
        return new BagOfferAssocType();
    }

    /**
     * Create an instance of {@link OfferInstructionType }
     * 
     */
    public OfferInstructionType createOfferInstructionType() {
        return new OfferInstructionType();
    }

    /**
     * Create an instance of {@link PTCQuantityType }
     * 
     */
    public PTCQuantityType createPTCQuantityType() {
        return new PTCQuantityType();
    }

    /**
     * Create an instance of {@link OfferV172PenaltyType }
     * 
     */
    public OfferV172PenaltyType createOfferV172PenaltyType() {
        return new OfferV172PenaltyType();
    }

    /**
     * Create an instance of {@link OfferStatusType }
     * 
     */
    public OfferStatusType createOfferStatusType() {
        return new OfferStatusType();
    }

    /**
     * Create an instance of {@link OfferTermsType }
     * 
     */
    public OfferTermsType createOfferTermsType() {
        return new OfferTermsType();
    }

    /**
     * Create an instance of {@link OfferGroupSizeType }
     * 
     */
    public OfferGroupSizeType createOfferGroupSizeType() {
        return new OfferGroupSizeType();
    }

    /**
     * Create an instance of {@link OfferOrderQuantityType }
     * 
     */
    public OfferOrderQuantityType createOfferOrderQuantityType() {
        return new OfferOrderQuantityType();
    }

    /**
     * Create an instance of {@link OrderV172PenaltyType }
     * 
     */
    public OrderV172PenaltyType createOrderV172PenaltyType() {
        return new OrderV172PenaltyType();
    }

    /**
     * Create an instance of {@link OrderProcessResultType }
     * 
     */
    public OrderProcessResultType createOrderProcessResultType() {
        return new OrderProcessResultType();
    }

    /**
     * Create an instance of {@link OrderTimeLimitsType }
     * 
     */
    public OrderTimeLimitsType createOrderTimeLimitsType() {
        return new OrderTimeLimitsType();
    }

    /**
     * Create an instance of {@link OrderItemTimeLimitsType }
     * 
     */
    public OrderItemTimeLimitsType createOrderItemTimeLimitsType() {
        return new OrderItemTimeLimitsType();
    }

    /**
     * Create an instance of {@link CouponOrderKeyType }
     * 
     */
    public CouponOrderKeyType createCouponOrderKeyType() {
        return new CouponOrderKeyType();
    }

    /**
     * Create an instance of {@link TicketDocHistoryType }
     * 
     */
    public TicketDocHistoryType createTicketDocHistoryType() {
        return new TicketDocHistoryType();
    }

    /**
     * Create an instance of {@link V172PriceClassType }
     * 
     */
    public V172PriceClassType createV172PriceClassType() {
        return new V172PriceClassType();
    }

    /**
     * Create an instance of {@link SeatCoreType }
     * 
     */
    public SeatCoreType createSeatCoreType() {
        return new SeatCoreType();
    }

    /**
     * Create an instance of {@link SeatDetailType }
     * 
     */
    public SeatDetailType createSeatDetailType() {
        return new SeatDetailType();
    }

    /**
     * Create an instance of {@link SeatCharacteristicType }
     * 
     */
    public SeatCharacteristicType createSeatCharacteristicType() {
        return new SeatCharacteristicType();
    }

    /**
     * Create an instance of {@link SeatMapRowNbrType }
     * 
     */
    public SeatMapRowNbrType createSeatMapRowNbrType() {
        return new SeatMapRowNbrType();
    }

    /**
     * Create an instance of {@link SuccessType }
     * 
     */
    public SuccessType createSuccessType() {
        return new SuccessType();
    }

    /**
     * Create an instance of {@link WarningsType }
     * 
     */
    public WarningsType createWarningsType() {
        return new WarningsType();
    }

    /**
     * Create an instance of {@link V172WarningType }
     * 
     */
    public V172WarningType createV172WarningType() {
        return new V172WarningType();
    }

    /**
     * Create an instance of {@link OfferGeographicSpecificationType }
     * 
     */
    public OfferGeographicSpecificationType createOfferGeographicSpecificationType() {
        return new OfferGeographicSpecificationType();
    }

    /**
     * Create an instance of {@link ProfileOwnerType }
     * 
     */
    public ProfileOwnerType createProfileOwnerType() {
        return new ProfileOwnerType();
    }

    /**
     * Create an instance of {@link BaggageDeterminingCarrierType }
     * 
     */
    public BaggageDeterminingCarrierType createBaggageDeterminingCarrierType() {
        return new BaggageDeterminingCarrierType();
    }

    /**
     * Create an instance of {@link TicketIdentificationType }
     * 
     */
    public TicketIdentificationType createTicketIdentificationType() {
        return new TicketIdentificationType();
    }

    /**
     * Create an instance of {@link RequestedServiceType }
     * 
     */
    public RequestedServiceType createRequestedServiceType() {
        return new RequestedServiceType();
    }

    /**
     * Create an instance of {@link OrderViewProcessType }
     * 
     */
    public OrderViewProcessType createOrderViewProcessType() {
        return new OrderViewProcessType();
    }

    /**
     * Create an instance of {@link OrdViewProcessType }
     * 
     */
    public OrdViewProcessType createOrdViewProcessType() {
        return new OrdViewProcessType();
    }

    /**
     * Create an instance of {@link OrdCancelProcessType }
     * 
     */
    public OrdCancelProcessType createOrdCancelProcessType() {
        return new OrdCancelProcessType();
    }

    /**
     * Create an instance of {@link ItinReshopProcessType }
     * 
     */
    public ItinReshopProcessType createItinReshopProcessType() {
        return new ItinReshopProcessType();
    }

    /**
     * Create an instance of {@link OrdCreateParamsType }
     * 
     */
    public OrdCreateParamsType createOrdCreateParamsType() {
        return new OrdCreateParamsType();
    }

    /**
     * Create an instance of {@link OrderHistoryParamsType }
     * 
     */
    public OrderHistoryParamsType createOrderHistoryParamsType() {
        return new OrderHistoryParamsType();
    }

    /**
     * Create an instance of {@link OrderListProcessType }
     * 
     */
    public OrderListProcessType createOrderListProcessType() {
        return new OrderListProcessType();
    }

    /**
     * Create an instance of {@link OrdRetrieveParamsType }
     * 
     */
    public OrdRetrieveParamsType createOrdRetrieveParamsType() {
        return new OrdRetrieveParamsType();
    }

    /**
     * Create an instance of {@link AgencyType }
     * 
     */
    public AgencyType createAgencyType() {
        return new AgencyType();
    }

    /**
     * Create an instance of {@link ALaCarteOfferItemType }
     * 
     */
    public ALaCarteOfferItemType createALaCarteOfferItemType() {
        return new ALaCarteOfferItemType();
    }

    /**
     * Create an instance of {@link ALaCarteOfferType }
     * 
     */
    public ALaCarteOfferType createALaCarteOfferType() {
        return new ALaCarteOfferType();
    }

    /**
     * Create an instance of {@link AllianceType }
     * 
     */
    public AllianceType createAllianceType() {
        return new AllianceType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link BaggageAllowanceListType }
     * 
     */
    public BaggageAllowanceListType createBaggageAllowanceListType() {
        return new BaggageAllowanceListType();
    }

    /**
     * Create an instance of {@link BaggageDisclosureListType }
     * 
     */
    public BaggageDisclosureListType createBaggageDisclosureListType() {
        return new BaggageDisclosureListType();
    }

    /**
     * Create an instance of {@link BaggageDisclosureType }
     * 
     */
    public BaggageDisclosureType createBaggageDisclosureType() {
        return new BaggageDisclosureType();
    }

    /**
     * Create an instance of {@link BaggageAllowanceType }
     * 
     */
    public BaggageAllowanceType createBaggageAllowanceType() {
        return new BaggageAllowanceType();
    }

    /**
     * Create an instance of {@link BDCType }
     * 
     */
    public BDCType createBDCType() {
        return new BDCType();
    }

    /**
     * Create an instance of {@link BankAccountType }
     * 
     */
    public BankAccountType createBankAccountType() {
        return new BankAccountType();
    }

    /**
     * Create an instance of {@link BilateralProcessTimeLimitType }
     * 
     */
    public BilateralProcessTimeLimitType createBilateralProcessTimeLimitType() {
        return new BilateralProcessTimeLimitType();
    }

    /**
     * Create an instance of {@link BoardingGateType }
     * 
     */
    public BoardingGateType createBoardingGateType() {
        return new BoardingGateType();
    }

    /**
     * Create an instance of {@link CabinTypeType }
     * 
     */
    public CabinTypeType createCabinTypeType() {
        return new CabinTypeType();
    }

    /**
     * Create an instance of {@link CarrierAircraftTypeType }
     * 
     */
    public CarrierAircraftTypeType createCarrierAircraftTypeType() {
        return new CarrierAircraftTypeType();
    }

    /**
     * Create an instance of {@link CarrierType }
     * 
     */
    public CarrierType createCarrierType() {
        return new CarrierType();
    }

    /**
     * Create an instance of {@link CashType }
     * 
     */
    public CashType createCashType() {
        return new CashType();
    }

    /**
     * Create an instance of {@link CheckType }
     * 
     */
    public CheckType createCheckType() {
        return new CheckType();
    }

    /**
     * Create an instance of {@link CityType }
     * 
     */
    public CityType createCityType() {
        return new CityType();
    }

    /**
     * Create an instance of {@link CollectionPointTaxType }
     * 
     */
    public CollectionPointTaxType createCollectionPointTaxType() {
        return new CollectionPointTaxType();
    }

    /**
     * Create an instance of {@link CommissionType }
     * 
     */
    public CommissionType createCommissionType() {
        return new CommissionType();
    }

    /**
     * Create an instance of {@link ContactInfoListType }
     * 
     */
    public ContactInfoListType createContactInfoListType() {
        return new ContactInfoListType();
    }

    /**
     * Create an instance of {@link ContactInfoType }
     * 
     */
    public ContactInfoType createContactInfoType() {
        return new ContactInfoType();
    }

    /**
     * Create an instance of {@link CountrySubDivisionType }
     * 
     */
    public CountrySubDivisionType createCountrySubDivisionType() {
        return new CountrySubDivisionType();
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link CurConversionType }
     * 
     */
    public CurConversionType createCurConversionType() {
        return new CurConversionType();
    }

    /**
     * Create an instance of {@link DataListsType }
     * 
     */
    public DataListsType createDataListsType() {
        return new DataListsType();
    }

    /**
     * Create an instance of {@link CurParameterType }
     * 
     */
    public CurParameterType createCurParameterType() {
        return new CurParameterType();
    }

    /**
     * Create an instance of {@link DatedMarketingSegmentType }
     * 
     */
    public DatedMarketingSegmentType createDatedMarketingSegmentType() {
        return new DatedMarketingSegmentType();
    }

    /**
     * Create an instance of {@link DatedOperatingLegType }
     * 
     */
    public DatedOperatingLegType createDatedOperatingLegType() {
        return new DatedOperatingLegType();
    }

    /**
     * Create an instance of {@link DatedOperatingSegmentType }
     * 
     */
    public DatedOperatingSegmentType createDatedOperatingSegmentType() {
        return new DatedOperatingSegmentType();
    }

    /**
     * Create an instance of {@link DateTimeType }
     * 
     */
    public DateTimeType createDateTimeType() {
        return new DateTimeType();
    }

    /**
     * Create an instance of {@link DescListType }
     * 
     */
    public DescListType createDescListType() {
        return new DescListType();
    }

    /**
     * Create an instance of {@link DescType }
     * 
     */
    public DescType createDescType() {
        return new DescType();
    }

    /**
     * Create an instance of {@link DimensionAllowanceType }
     * 
     */
    public DimensionAllowanceType createDimensionAllowanceType() {
        return new DimensionAllowanceType();
    }

    /**
     * Create an instance of {@link DirectBillType }
     * 
     */
    public DirectBillType createDirectBillType() {
        return new DirectBillType();
    }

    /**
     * Create an instance of {@link DisclosureListType }
     * 
     */
    public DisclosureListType createDisclosureListType() {
        return new DisclosureListType();
    }

    /**
     * Create an instance of {@link DisclosureType }
     * 
     */
    public DisclosureType createDisclosureType() {
        return new DisclosureType();
    }

    /**
     * Create an instance of {@link DiscountContextType }
     * 
     */
    public DiscountContextType createDiscountContextType() {
        return new DiscountContextType();
    }

    /**
     * Create an instance of {@link DiscountType }
     * 
     */
    public DiscountType createDiscountType() {
        return new DiscountType();
    }

    /**
     * Create an instance of {@link EmailAddressType }
     * 
     */
    public EmailAddressType createEmailAddressType() {
        return new EmailAddressType();
    }

    /**
     * Create an instance of {@link FareListType }
     * 
     */
    public FareListType createFareListType() {
        return new FareListType();
    }

    /**
     * Create an instance of {@link FeeType }
     * 
     */
    public FeeType createFeeType() {
        return new FeeType();
    }

    /**
     * Create an instance of {@link IATAAircraftTypeType }
     * 
     */
    public IATAAircraftTypeType createIATAAircraftTypeType() {
        return new IATAAircraftTypeType();
    }

    /**
     * Create an instance of {@link IdentityDocType }
     * 
     */
    public IdentityDocType createIdentityDocType() {
        return new IdentityDocType();
    }

    /**
     * Create an instance of {@link IndividualType }
     * 
     */
    public IndividualType createIndividualType() {
        return new IndividualType();
    }

    /**
     * Create an instance of {@link JourneyListType }
     * 
     */
    public JourneyListType createJourneyListType() {
        return new JourneyListType();
    }

    /**
     * Create an instance of {@link LangUsageType }
     * 
     */
    public LangUsageType createLangUsageType() {
        return new LangUsageType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramAccountType }
     * 
     */
    public LoyaltyProgramAccountType createLoyaltyProgramAccountType() {
        return new LoyaltyProgramAccountType();
    }

    /**
     * Create an instance of {@link LoyaltyProgramType }
     * 
     */
    public LoyaltyProgramType createLoyaltyProgramType() {
        return new LoyaltyProgramType();
    }

    /**
     * Create an instance of {@link LoyaltyRedemptionType }
     * 
     */
    public LoyaltyRedemptionType createLoyaltyRedemptionType() {
        return new LoyaltyRedemptionType();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link MediaListType }
     * 
     */
    public MediaListType createMediaListType() {
        return new MediaListType();
    }

    /**
     * Create an instance of {@link MediaType }
     * 
     */
    public MediaType createMediaType() {
        return new MediaType();
    }

    /**
     * Create an instance of {@link ResponseParametersType }
     * 
     */
    public ResponseParametersType createResponseParametersType() {
        return new ResponseParametersType();
    }

    /**
     * Create an instance of {@link MiscChargeOrderType }
     * 
     */
    public MiscChargeOrderType createMiscChargeOrderType() {
        return new MiscChargeOrderType();
    }

    /**
     * Create an instance of {@link OfferAssocationsType }
     * 
     */
    public OfferAssocationsType createOfferAssocationsType() {
        return new OfferAssocationsType();
    }

    /**
     * Create an instance of {@link com.springboot.dto.offerpricers.OfferItemType }
     * 
     */
    public com.springboot.dto.offerpricers.OfferItemType createOfferItemType() {
        return new com.springboot.dto.offerpricers.OfferItemType();
    }

    /**
     * Create an instance of {@link OrgType }
     * 
     */
    public OrgType createOrgType() {
        return new OrgType();
    }

    /**
     * Create an instance of {@link OriginDestListType }
     * 
     */
    public OriginDestListType createOriginDestListType() {
        return new OriginDestListType();
    }

    /**
     * Create an instance of {@link OriginDestType }
     * 
     */
    public OriginDestType createOriginDestType() {
        return new OriginDestType();
    }

    /**
     * Create an instance of {@link OtherAddressType }
     * 
     */
    public OtherAddressType createOtherAddressType() {
        return new OtherAddressType();
    }

    /**
     * Create an instance of {@link OtherOffersType }
     * 
     */
    public OtherOffersType createOtherOffersType() {
        return new OtherOffersType();
    }

    /**
     * Create an instance of {@link OtherPaymentMethodType }
     * 
     */
    public OtherPaymentMethodType createOtherPaymentMethodType() {
        return new OtherPaymentMethodType();
    }

    /**
     * Create an instance of {@link PaxGroupType }
     * 
     */
    public PaxGroupType createPaxGroupType() {
        return new PaxGroupType();
    }

    /**
     * Create an instance of {@link PaxJourneyType }
     * 
     */
    public PaxJourneyType createPaxJourneyType() {
        return new PaxJourneyType();
    }

    /**
     * Create an instance of {@link PaxLegType }
     * 
     */
    public PaxLegType createPaxLegType() {
        return new PaxLegType();
    }

    /**
     * Create an instance of {@link PaxListType }
     * 
     */
    public PaxListType createPaxListType() {
        return new PaxListType();
    }

    /**
     * Create an instance of {@link PaxSegmentType }
     * 
     */
    public PaxSegmentType createPaxSegmentType() {
        return new PaxSegmentType();
    }

    /**
     * Create an instance of {@link PaxType }
     * 
     */
    public PaxType createPaxType() {
        return new PaxType();
    }

    /**
     * Create an instance of {@link PaymentCardType }
     * 
     */
    public PaymentCardType createPaymentCardType() {
        return new PaymentCardType();
    }

    /**
     * Create an instance of {@link PaymentInfoType }
     * 
     */
    public PaymentInfoType createPaymentInfoType() {
        return new PaymentInfoType();
    }

    /**
     * Create an instance of {@link PaymentMethodType }
     * 
     */
    public PaymentMethodType createPaymentMethodType() {
        return new PaymentMethodType();
    }

    /**
     * Create an instance of {@link PaymentsType }
     * 
     */
    public PaymentsType createPaymentsType() {
        return new PaymentsType();
    }

    /**
     * Create an instance of {@link PenaltyListType }
     * 
     */
    public PenaltyListType createPenaltyListType() {
        return new PenaltyListType();
    }

    /**
     * Create an instance of {@link PenaltyType }
     * 
     */
    public PenaltyType createPenaltyType() {
        return new PenaltyType();
    }

    /**
     * Create an instance of {@link PhoneType }
     * 
     */
    public PhoneType createPhoneType() {
        return new PhoneType();
    }

    /**
     * Create an instance of {@link PieceAllowanceType }
     * 
     */
    public PieceAllowanceType createPieceAllowanceType() {
        return new PieceAllowanceType();
    }

    /**
     * Create an instance of {@link PostalAddressType }
     * 
     */
    public PostalAddressType createPostalAddressType() {
        return new PostalAddressType();
    }

    /**
     * Create an instance of {@link PriceClassListType }
     * 
     */
    public PriceClassListType createPriceClassListType() {
        return new PriceClassListType();
    }

    /**
     * Create an instance of {@link PriceClassType }
     * 
     */
    public PriceClassType createPriceClassType() {
        return new PriceClassType();
    }

    /**
     * Create an instance of {@link PricedOfferType }
     * 
     */
    public PricedOfferType createPricedOfferType() {
        return new PricedOfferType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleType }
     * 
     */
    public PriceVarianceRuleType createPriceVarianceRuleType() {
        return new PriceVarianceRuleType();
    }

    /**
     * Create an instance of {@link PricingParameterType }
     * 
     */
    public PricingParameterType createPricingParameterType() {
        return new PricingParameterType();
    }

    /**
     * Create an instance of {@link PromotionsType }
     * 
     */
    public PromotionsType createPromotionsType() {
        return new PromotionsType();
    }

    /**
     * Create an instance of {@link PromotionType }
     * 
     */
    public PromotionType createPromotionType() {
        return new PromotionType();
    }

    /**
     * Create an instance of {@link PTCOfferParametersType }
     * 
     */
    public PTCOfferParametersType createPTCOfferParametersType() {
        return new PTCOfferParametersType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link RBDType }
     * 
     */
    public RBDType createRBDType() {
        return new RBDType();
    }

    /**
     * Create an instance of {@link RemarkType }
     * 
     */
    public RemarkType createRemarkType() {
        return new RemarkType();
    }

    /**
     * Create an instance of {@link SeatAssignmentType }
     * 
     */
    public SeatAssignmentType createSeatAssignmentType() {
        return new SeatAssignmentType();
    }

    /**
     * Create an instance of {@link SeatKeywordsType }
     * 
     */
    public SeatKeywordsType createSeatKeywordsType() {
        return new SeatKeywordsType();
    }

    /**
     * Create an instance of {@link SeatProfileListType }
     * 
     */
    public SeatProfileListType createSeatProfileListType() {
        return new SeatProfileListType();
    }

    /**
     * Create an instance of {@link SeatProfileType }
     * 
     */
    public SeatProfileType createSeatProfileType() {
        return new SeatProfileType();
    }

    /**
     * Create an instance of {@link SeatType }
     * 
     */
    public SeatType createSeatType() {
        return new SeatType();
    }

    /**
     * Create an instance of {@link SegmentListType }
     * 
     */
    public SegmentListType createSegmentListType() {
        return new SegmentListType();
    }

    /**
     * Create an instance of {@link ServiceAssociationsType }
     * 
     */
    public ServiceAssociationsType createServiceAssociationsType() {
        return new ServiceAssociationsType();
    }

    /**
     * Create an instance of {@link ServiceBundleType }
     * 
     */
    public ServiceBundleType createServiceBundleType() {
        return new ServiceBundleType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionAssociationType }
     * 
     */
    public ServiceDefinitionAssociationType createServiceDefinitionAssociationType() {
        return new ServiceDefinitionAssociationType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionListType }
     * 
     */
    public ServiceDefinitionListType createServiceDefinitionListType() {
        return new ServiceDefinitionListType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionRefType }
     * 
     */
    public ServiceDefinitionRefType createServiceDefinitionRefType() {
        return new ServiceDefinitionRefType();
    }

    /**
     * Create an instance of {@link ALaCarteServiceType }
     * 
     */
    public ALaCarteServiceType createALaCarteServiceType() {
        return new ALaCarteServiceType();
    }

    /**
     * Create an instance of {@link ServiceType }
     * 
     */
    public ServiceType createServiceType() {
        return new ServiceType();
    }

    /**
     * Create an instance of {@link SettlementInfoType }
     * 
     */
    public SettlementInfoType createSettlementInfoType() {
        return new SettlementInfoType();
    }

    /**
     * Create an instance of {@link ShoppingResponseType }
     * 
     */
    public ShoppingResponseType createShoppingResponseType() {
        return new ShoppingResponseType();
    }

    /**
     * Create an instance of {@link StationType }
     * 
     */
    public StationType createStationType() {
        return new StationType();
    }

    /**
     * Create an instance of {@link SurchargeType }
     * 
     */
    public SurchargeType createSurchargeType() {
        return new SurchargeType();
    }

    /**
     * Create an instance of {@link TaxSummaryType }
     * 
     */
    public TaxSummaryType createTaxSummaryType() {
        return new TaxSummaryType();
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     */
    public TaxType createTaxType() {
        return new TaxType();
    }

    /**
     * Create an instance of {@link TerminalType }
     * 
     */
    public TerminalType createTerminalType() {
        return new TerminalType();
    }

    /**
     * Create an instance of {@link TermsListType }
     * 
     */
    public TermsListType createTermsListType() {
        return new TermsListType();
    }

    /**
     * Create an instance of {@link TransportArrivalType }
     * 
     */
    public TransportArrivalType createTransportArrivalType() {
        return new TransportArrivalType();
    }

    /**
     * Create an instance of {@link TransportDepType }
     * 
     */
    public TransportDepType createTransportDepType() {
        return new TransportDepType();
    }

    /**
     * Create an instance of {@link VisaType }
     * 
     */
    public VisaType createVisaType() {
        return new VisaType();
    }

    /**
     * Create an instance of {@link VoucherType }
     * 
     */
    public VoucherType createVoucherType() {
        return new VoucherType();
    }

    /**
     * Create an instance of {@link WarningType }
     * 
     */
    public WarningType createWarningType() {
        return new WarningType();
    }

    /**
     * Create an instance of {@link WeightAllowanceType }
     * 
     */
    public WeightAllowanceType createWeightAllowanceType() {
        return new WeightAllowanceType();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.Detail }
     * 
     */
    public ServiceDefinitionType.Detail createServiceDefinitionTypeDetail() {
        return new ServiceDefinitionType.Detail();
    }

    /**
     * Create an instance of {@link ServiceDefinitionType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceDefinitionType.BookingInstructions.UpgradeMethod createServiceDefinitionTypeBookingInstructionsUpgradeMethod() {
        return new ServiceDefinitionType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link OfferType.BaggageAllowance }
     * 
     */
    public OfferType.BaggageAllowance createOfferTypeBaggageAllowance() {
        return new OfferType.BaggageAllowance();
    }

    /**
     * Create an instance of {@link JourneyOverviewType.JourneyPriceClass }
     * 
     */
    public JourneyOverviewType.JourneyPriceClass createJourneyOverviewTypeJourneyPriceClass() {
        return new JourneyOverviewType.JourneyPriceClass();
    }

    /**
     * Create an instance of {@link EligibilityType.FlightAssociations }
     * 
     */
    public EligibilityType.FlightAssociations createEligibilityTypeFlightAssociations() {
        return new EligibilityType.FlightAssociations();
    }

    /**
     * Create an instance of {@link OrdChangeMetadataType.Other.OtherMetadata }
     * 
     */
    public OrdChangeMetadataType.Other.OtherMetadata createOrdChangeMetadataTypeOtherOtherMetadata() {
        return new OrdChangeMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.Shopping }
     * 
     */
    public SeatAvailReqMetadataType.Shopping createSeatAvailReqMetadataTypeShopping() {
        return new SeatAvailReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.Passenger }
     * 
     */
    public SeatAvailReqMetadataType.Passenger createSeatAvailReqMetadataTypePassenger() {
        return new SeatAvailReqMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link SeatAvailReqMetadataType.Other.OtherMetadata }
     * 
     */
    public SeatAvailReqMetadataType.Other.OtherMetadata createSeatAvailReqMetadataTypeOtherOtherMetadata() {
        return new SeatAvailReqMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType.Languages }
     * 
     */
    public MessageParamsBaseType.Languages createMessageParamsBaseTypeLanguages() {
        return new MessageParamsBaseType.Languages();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Inventory }
     * 
     */
    public SeatAvailReqParamsType.Inventory createSeatAvailReqParamsTypeInventory() {
        return new SeatAvailReqParamsType.Inventory();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.ServiceFilters }
     * 
     */
    public SeatAvailReqParamsType.ServiceFilters createSeatAvailReqParamsTypeServiceFilters() {
        return new SeatAvailReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Group }
     * 
     */
    public SeatAvailReqParamsType.Group createSeatAvailReqParamsTypeGroup() {
        return new SeatAvailReqParamsType.Group();
    }

    /**
     * Create an instance of {@link SeatAvailReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public SeatAvailReqParamsType.Pricing.FeeExemption.Fee.Code createSeatAvailReqParamsTypePricingFeeExemptionFeeCode() {
        return new SeatAvailReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link MessageParamsBaseType.CurrCodes.FiledInCurrency }
     * 
     */
    public MessageParamsBaseType.CurrCodes.FiledInCurrency createMessageParamsBaseTypeCurrCodesFiledInCurrency() {
        return new MessageParamsBaseType.CurrCodes.FiledInCurrency();
    }

    /**
     * Create an instance of {@link OrdChangeParamsType.RefundFOPPreference }
     * 
     */
    public OrdChangeParamsType.RefundFOPPreference createOrdChangeParamsTypeRefundFOPPreference() {
        return new OrdChangeParamsType.RefundFOPPreference();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.Shopping }
     * 
     */
    public SrvListReqMetadataType.Shopping createSrvListReqMetadataTypeShopping() {
        return new SrvListReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.Passenger }
     * 
     */
    public SrvListReqMetadataType.Passenger createSrvListReqMetadataTypePassenger() {
        return new SrvListReqMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link SrvListReqMetadataType.Other.OtherMetadata }
     * 
     */
    public SrvListReqMetadataType.Other.OtherMetadata createSrvListReqMetadataTypeOtherOtherMetadata() {
        return new SrvListReqMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.Shopping }
     * 
     */
    public SrvListResMetadataType.Shopping createSrvListResMetadataTypeShopping() {
        return new SrvListResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.Passenger }
     * 
     */
    public SrvListResMetadataType.Passenger createSrvListResMetadataTypePassenger() {
        return new SrvListResMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link SrvListResMetadataType.Other.OtherMetadata }
     * 
     */
    public SrvListResMetadataType.Other.OtherMetadata createSrvListResMetadataTypeOtherOtherMetadata() {
        return new SrvListResMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Group }
     * 
     */
    public SrvListResParamsType.Group createSrvListResParamsTypeGroup() {
        return new SrvListResParamsType.Group();
    }

    /**
     * Create an instance of {@link SrvListResParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public SrvListResParamsType.Pricing.FeeExemption.Fee.Code createSrvListResParamsTypePricingFeeExemptionFeeCode() {
        return new SrvListResParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.Shopping }
     * 
     */
    public SeatAvailResMetadataType.Shopping createSeatAvailResMetadataTypeShopping() {
        return new SeatAvailResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.Passenger }
     * 
     */
    public SeatAvailResMetadataType.Passenger createSeatAvailResMetadataTypePassenger() {
        return new SeatAvailResMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link SeatAvailResMetadataType.Other.OtherMetadata }
     * 
     */
    public SeatAvailResMetadataType.Other.OtherMetadata createSeatAvailResMetadataTypeOtherOtherMetadata() {
        return new SeatAvailResMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link ItinReshopMetadataType.Other.OtherMetadata }
     * 
     */
    public ItinReshopMetadataType.Other.OtherMetadata createItinReshopMetadataTypeOtherOtherMetadata() {
        return new ItinReshopMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.Shopping }
     * 
     */
    public FltPriceResMetadataType.Shopping createFltPriceResMetadataTypeShopping() {
        return new FltPriceResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.Traveler }
     * 
     */
    public FltPriceResMetadataType.Traveler createFltPriceResMetadataTypeTraveler() {
        return new FltPriceResMetadataType.Traveler();
    }

    /**
     * Create an instance of {@link FltPriceResMetadataType.Other.OtherMetadata }
     * 
     */
    public FltPriceResMetadataType.Other.OtherMetadata createFltPriceResMetadataTypeOtherOtherMetadata() {
        return new FltPriceResMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.Shopping }
     * 
     */
    public FltPriceReqMetadataType.Shopping createFltPriceReqMetadataTypeShopping() {
        return new FltPriceReqMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.Passenger }
     * 
     */
    public FltPriceReqMetadataType.Passenger createFltPriceReqMetadataTypePassenger() {
        return new FltPriceReqMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link FltPriceReqMetadataType.Other.OtherMetadata }
     * 
     */
    public FltPriceReqMetadataType.Other.OtherMetadata createFltPriceReqMetadataTypeOtherOtherMetadata() {
        return new FltPriceReqMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.ServiceFilters }
     * 
     */
    public FltPriceReqParamsType.ServiceFilters createFltPriceReqParamsTypeServiceFilters() {
        return new FltPriceReqParamsType.ServiceFilters();
    }

    /**
     * Create an instance of {@link FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code }
     * 
     */
    public FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code createFltPriceReqParamsTypePricingFeeExemptionFeeCode() {
        return new FltPriceReqParamsType.Pricing.FeeExemption.Fee.Code();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.Shopping }
     * 
     */
    public AirShopResMetadataType.Shopping createAirShopResMetadataTypeShopping() {
        return new AirShopResMetadataType.Shopping();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.Passenger }
     * 
     */
    public AirShopResMetadataType.Passenger createAirShopResMetadataTypePassenger() {
        return new AirShopResMetadataType.Passenger();
    }

    /**
     * Create an instance of {@link AirShopResMetadataType.Other.OtherMetadata }
     * 
     */
    public AirShopResMetadataType.Other.OtherMetadata createAirShopResMetadataTypeOtherOtherMetadata() {
        return new AirShopResMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link OrdViewMetadataType.Other.OtherMetadata }
     * 
     */
    public OrdViewMetadataType.Other.OtherMetadata createOrdViewMetadataTypeOtherOtherMetadata() {
        return new OrdViewMetadataType.Other.OtherMetadata();
    }

    /**
     * Create an instance of {@link V172OfferItemType.Service.ServiceDefinitionRef }
     * 
     */
    public V172OfferItemType.Service.ServiceDefinitionRef createV172OfferItemTypeServiceServiceDefinitionRef() {
        return new V172OfferItemType.Service.ServiceDefinitionRef();
    }

    /**
     * Create an instance of {@link V172OfferItemType.Service.SelectedSeat.Seat }
     * 
     */
    public V172OfferItemType.Service.SelectedSeat.Seat createV172OfferItemTypeServiceSelectedSeatSeat() {
        return new V172OfferItemType.Service.SelectedSeat.Seat();
    }

    /**
     * Create an instance of {@link V172OfferItemType.TotalPriceDetail.TotalAmount }
     * 
     */
    public V172OfferItemType.TotalPriceDetail.TotalAmount createV172OfferItemTypeTotalPriceDetailTotalAmount() {
        return new V172OfferItemType.TotalPriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link V172OfferItemType.TotalPriceDetail.Surcharges }
     * 
     */
    public V172OfferItemType.TotalPriceDetail.Surcharges createV172OfferItemTypeTotalPriceDetailSurcharges() {
        return new V172OfferItemType.TotalPriceDetail.Surcharges();
    }

    /**
     * Create an instance of {@link V172OfferItemType.TotalPriceDetail.Fees }
     * 
     */
    public V172OfferItemType.TotalPriceDetail.Fees createV172OfferItemTypeTotalPriceDetailFees() {
        return new V172OfferItemType.TotalPriceDetail.Fees();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Total }
     * 
     */
    public FeeSurchargeType.Total createFeeSurchargeTypeTotal() {
        return new FeeSurchargeType.Total();
    }

    /**
     * Create an instance of {@link FeeSurchargeType.Breakdown.Fee }
     * 
     */
    public FeeSurchargeType.Breakdown.Fee createFeeSurchargeTypeBreakdownFee() {
        return new FeeSurchargeType.Breakdown.Fee();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.Service }
     * 
     */
    public ALaCarteV172OfferItemType.Service createALaCarteV172OfferItemTypeService() {
        return new ALaCarteV172OfferItemType.Service();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount }
     * 
     */
    public ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount createALaCarteV172OfferItemTypeUnitPriceDetailTotalAmount() {
        return new ALaCarteV172OfferItemType.UnitPriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges }
     * 
     */
    public ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges createALaCarteV172OfferItemTypeUnitPriceDetailSurcharges() {
        return new ALaCarteV172OfferItemType.UnitPriceDetail.Surcharges();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.UnitPriceDetail.Fees }
     * 
     */
    public ALaCarteV172OfferItemType.UnitPriceDetail.Fees createALaCarteV172OfferItemTypeUnitPriceDetailFees() {
        return new ALaCarteV172OfferItemType.UnitPriceDetail.Fees();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.Eligibility.PassengerRefs }
     * 
     */
    public ALaCarteV172OfferItemType.Eligibility.PassengerRefs createALaCarteV172OfferItemTypeEligibilityPassengerRefs() {
        return new ALaCarteV172OfferItemType.Eligibility.PassengerRefs();
    }

    /**
     * Create an instance of {@link ALaCarteV172OfferItemType.Eligibility.SegmentRefs }
     * 
     */
    public ALaCarteV172OfferItemType.Eligibility.SegmentRefs createALaCarteV172OfferItemTypeEligibilitySegmentRefs() {
        return new ALaCarteV172OfferItemType.Eligibility.SegmentRefs();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.Name }
     * 
     */
    public V172ServiceDefinitionType.Name createV172ServiceDefinitionTypeName() {
        return new V172ServiceDefinitionType.Name();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.FeeMethod }
     * 
     */
    public V172ServiceDefinitionType.FeeMethod createV172ServiceDefinitionTypeFeeMethod() {
        return new V172ServiceDefinitionType.FeeMethod();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.Settlement }
     * 
     */
    public V172ServiceDefinitionType.Settlement createV172ServiceDefinitionTypeSettlement() {
        return new V172ServiceDefinitionType.Settlement();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.Detail }
     * 
     */
    public V172ServiceDefinitionType.Detail createV172ServiceDefinitionTypeDetail() {
        return new V172ServiceDefinitionType.Detail();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.BookingInstructions.UpgradeMethod }
     * 
     */
    public V172ServiceDefinitionType.BookingInstructions.UpgradeMethod createV172ServiceDefinitionTypeBookingInstructionsUpgradeMethod() {
        return new V172ServiceDefinitionType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link V172ServiceDefinitionType.ServiceBundle.ServiceDefinitionRef }
     * 
     */
    public V172ServiceDefinitionType.ServiceBundle.ServiceDefinitionRef createV172ServiceDefinitionTypeServiceBundleServiceDefinitionRef() {
        return new V172ServiceDefinitionType.ServiceBundle.ServiceDefinitionRef();
    }

    /**
     * Create an instance of {@link OrderRequestType.Offer.OfferItem.ALaCarteSelection }
     * 
     */
    public OrderRequestType.Offer.OfferItem.ALaCarteSelection createOrderRequestTypeOfferOfferItemALaCarteSelection() {
        return new OrderRequestType.Offer.OfferItem.ALaCarteSelection();
    }

    /**
     * Create an instance of {@link OrderRequestType.Offer.OfferItem.ServiceSelection }
     * 
     */
    public OrderRequestType.Offer.OfferItem.ServiceSelection createOrderRequestTypeOfferOfferItemServiceSelection() {
        return new OrderRequestType.Offer.OfferItem.ServiceSelection();
    }

    /**
     * Create an instance of {@link OrderRequestType.Offer.OfferItem.SeatSelection }
     * 
     */
    public OrderRequestType.Offer.OfferItem.SeatSelection createOrderRequestTypeOfferOfferItemSeatSelection() {
        return new OrderRequestType.Offer.OfferItem.SeatSelection();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType.Service.ServiceDefinitionRef }
     * 
     */
    public NameChangeV172OfferItemType.Service.ServiceDefinitionRef createNameChangeV172OfferItemTypeServiceServiceDefinitionRef() {
        return new NameChangeV172OfferItemType.Service.ServiceDefinitionRef();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType.TotalPriceDetail.TotalAmount }
     * 
     */
    public NameChangeV172OfferItemType.TotalPriceDetail.TotalAmount createNameChangeV172OfferItemTypeTotalPriceDetailTotalAmount() {
        return new NameChangeV172OfferItemType.TotalPriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType.TotalPriceDetail.Surcharges }
     * 
     */
    public NameChangeV172OfferItemType.TotalPriceDetail.Surcharges createNameChangeV172OfferItemTypeTotalPriceDetailSurcharges() {
        return new NameChangeV172OfferItemType.TotalPriceDetail.Surcharges();
    }

    /**
     * Create an instance of {@link NameChangeV172OfferItemType.TotalPriceDetail.Fees }
     * 
     */
    public NameChangeV172OfferItemType.TotalPriceDetail.Fees createNameChangeV172OfferItemTypeTotalPriceDetailFees() {
        return new NameChangeV172OfferItemType.TotalPriceDetail.Fees();
    }

    /**
     * Create an instance of {@link NonGeographicSpecificationType.PointOfSaleCode }
     * 
     */
    public NonGeographicSpecificationType.PointOfSaleCode createNonGeographicSpecificationTypePointOfSaleCode() {
        return new NonGeographicSpecificationType.PointOfSaleCode();
    }

    /**
     * Create an instance of {@link GeographicSpecificationType.Coordinates.CoordinateRadius }
     * 
     */
    public GeographicSpecificationType.Coordinates.CoordinateRadius createGeographicSpecificationTypeCoordinatesCoordinateRadius() {
        return new GeographicSpecificationType.Coordinates.CoordinateRadius();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType.DepartureDateTime }
     * 
     */
    public CouponFlightSegmentType.DepartureDateTime createCouponFlightSegmentTypeDepartureDateTime() {
        return new CouponFlightSegmentType.DepartureDateTime();
    }

    /**
     * Create an instance of {@link CouponFlightSegmentType.OperatingCarrier }
     * 
     */
    public CouponFlightSegmentType.OperatingCarrier createCouponFlightSegmentTypeOperatingCarrier() {
        return new CouponFlightSegmentType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link ReissuedFlownType.FlightCouponData.IntermediateStop }
     * 
     */
    public ReissuedFlownType.FlightCouponData.IntermediateStop createReissuedFlownTypeFlightCouponDataIntermediateStop() {
        return new ReissuedFlownType.FlightCouponData.IntermediateStop();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo createTaxCouponInfoTypeTicketDocumentCouponNumberTaxCouponInfo() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.TaxCouponInfo();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.Tax }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.Tax createTaxCouponInfoTypeTicketDocumentCouponNumberTax() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.Tax();
    }

    /**
     * Create an instance of {@link TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo }
     * 
     */
    public TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo createTaxCouponInfoTypeTicketDocumentCouponNumberUnticketedPointInfo() {
        return new TaxCouponInfoType.TicketDocument.CouponNumber.UnticketedPointInfo();
    }

    /**
     * Create an instance of {@link TaxDetailType.Total }
     * 
     */
    public TaxDetailType.Total createTaxDetailTypeTotal() {
        return new TaxDetailType.Total();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.CollectionPoint }
     * 
     */
    public TaxDetailType.Breakdown.Tax.CollectionPoint createTaxDetailTypeBreakdownTaxCollectionPoint() {
        return new TaxDetailType.Breakdown.Tax.CollectionPoint();
    }

    /**
     * Create an instance of {@link TaxDetailType.Breakdown.Tax.Conversion }
     * 
     */
    public TaxDetailType.Breakdown.Tax.Conversion createTaxDetailTypeBreakdownTaxConversion() {
        return new TaxDetailType.Breakdown.Tax.Conversion();
    }

    /**
     * Create an instance of {@link GroupFarePreferencesType.GroupFare.FareBasis }
     * 
     */
    public GroupFarePreferencesType.GroupFare.FareBasis createGroupFarePreferencesTypeGroupFareFareBasis() {
        return new GroupFarePreferencesType.GroupFare.FareBasis();
    }

    /**
     * Create an instance of {@link QualifiersType.Qualifier }
     * 
     */
    public QualifiersType.Qualifier createQualifiersTypeQualifier() {
        return new QualifiersType.Qualifier();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.Service }
     * 
     */
    public SocialMediaQualifierType.Service createSocialMediaQualifierTypeService() {
        return new SocialMediaQualifierType.Service();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.User }
     * 
     */
    public SocialMediaQualifierType.User createSocialMediaQualifierTypeUser() {
        return new SocialMediaQualifierType.User();
    }

    /**
     * Create an instance of {@link SocialMediaQualifierType.EmailAddress }
     * 
     */
    public SocialMediaQualifierType.EmailAddress createSocialMediaQualifierTypeEmailAddress() {
        return new SocialMediaQualifierType.EmailAddress();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity.ReferencePoint }
     * 
     */
    public ReferencePointQueryType.Proximity.ReferencePoint createReferencePointQueryTypeProximityReferencePoint() {
        return new ReferencePointQueryType.Proximity.ReferencePoint();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.Proximity.AreaValue }
     * 
     */
    public ReferencePointQueryType.Proximity.AreaValue createReferencePointQueryTypeProximityAreaValue() {
        return new ReferencePointQueryType.Proximity.AreaValue();
    }

    /**
     * Create an instance of {@link ReferencePointQueryType.ReferencePoints.ReferencePoint }
     * 
     */
    public ReferencePointQueryType.ReferencePoints.ReferencePoint createReferencePointQueryTypeReferencePointsReferencePoint() {
        return new ReferencePointQueryType.ReferencePoints.ReferencePoint();
    }

    /**
     * Create an instance of {@link ServicePriceType.RefundableValue }
     * 
     */
    public ServicePriceType.RefundableValue createServicePriceTypeRefundableValue() {
        return new ServicePriceType.RefundableValue();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details.SubTotal }
     * 
     */
    public ServicePriceType.Details.SubTotal createServicePriceTypeDetailsSubTotal() {
        return new ServicePriceType.Details.SubTotal();
    }

    /**
     * Create an instance of {@link ServicePriceType.Details.Detail }
     * 
     */
    public ServicePriceType.Details.Detail createServicePriceTypeDetailsDetail() {
        return new ServicePriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link ServiceFilterType.GroupCode }
     * 
     */
    public ServiceFilterType.GroupCode createServiceFilterTypeGroupCode() {
        return new ServiceFilterType.GroupCode();
    }

    /**
     * Create an instance of {@link ServiceFilterType.SubGroupCode }
     * 
     */
    public ServiceFilterType.SubGroupCode createServiceFilterTypeSubGroupCode() {
        return new ServiceFilterType.SubGroupCode();
    }

    /**
     * Create an instance of {@link ServiceDescriptionType.Description }
     * 
     */
    public ServiceDescriptionType.Description createServiceDescriptionTypeDescription() {
        return new ServiceDescriptionType.Description();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.Code }
     * 
     */
    public ServiceEncodingType.Code createServiceEncodingTypeCode() {
        return new ServiceEncodingType.Code();
    }

    /**
     * Create an instance of {@link ServiceEncodingType.SubCode }
     * 
     */
    public ServiceEncodingType.SubCode createServiceEncodingTypeSubCode() {
        return new ServiceEncodingType.SubCode();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Name }
     * 
     */
    public ServiceCoreType.Name createServiceCoreTypeName() {
        return new ServiceCoreType.Name();
    }

    /**
     * Create an instance of {@link ServiceCoreType.FeeMethod }
     * 
     */
    public ServiceCoreType.FeeMethod createServiceCoreTypeFeeMethod() {
        return new ServiceCoreType.FeeMethod();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Settlement }
     * 
     */
    public ServiceCoreType.Settlement createServiceCoreTypeSettlement() {
        return new ServiceCoreType.Settlement();
    }

    /**
     * Create an instance of {@link ServiceCoreType.Associations }
     * 
     */
    public ServiceCoreType.Associations createServiceCoreTypeAssociations() {
        return new ServiceCoreType.Associations();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Passenger }
     * 
     */
    public ServiceAssocType.Passenger createServiceAssocTypePassenger() {
        return new ServiceAssocType.Passenger();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Flight }
     * 
     */
    public ServiceAssocType.Flight createServiceAssocTypeFlight() {
        return new ServiceAssocType.Flight();
    }

    /**
     * Create an instance of {@link ServiceAssocType.Offer }
     * 
     */
    public ServiceAssocType.Offer createServiceAssocTypeOffer() {
        return new ServiceAssocType.Offer();
    }

    /**
     * Create an instance of {@link ServiceCoreType.BookingInstructions.UpgradeMethod }
     * 
     */
    public ServiceCoreType.BookingInstructions.UpgradeMethod createServiceCoreTypeBookingInstructionsUpgradeMethod() {
        return new ServiceCoreType.BookingInstructions.UpgradeMethod();
    }

    /**
     * Create an instance of {@link ServiceOtherAssocType.OtherAssociation.Type }
     * 
     */
    public ServiceOtherAssocType.OtherAssociation.Type createServiceOtherAssocTypeOtherAssociationType() {
        return new ServiceOtherAssocType.OtherAssociation.Type();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Images }
     * 
     */
    public SeatMapMessageType.Images createSeatMapMessageTypeImages() {
        return new SeatMapMessageType.Images();
    }

    /**
     * Create an instance of {@link SeatMapMessageType.Links }
     * 
     */
    public SeatMapMessageType.Links createSeatMapMessageTypeLinks() {
        return new SeatMapMessageType.Links();
    }

    /**
     * Create an instance of {@link SeatDataType.Keywords }
     * 
     */
    public SeatDataType.Keywords createSeatDataTypeKeywords() {
        return new SeatDataType.Keywords();
    }

    /**
     * Create an instance of {@link SeatDataType.Marketing }
     * 
     */
    public SeatDataType.Marketing createSeatDataTypeMarketing() {
        return new SeatDataType.Marketing();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Row }
     * 
     */
    public CabinCameraPosType.Row createCabinCameraPosTypeRow() {
        return new CabinCameraPosType.Row();
    }

    /**
     * Create an instance of {@link CabinCameraPosType.Column }
     * 
     */
    public CabinCameraPosType.Column createCabinCameraPosTypeColumn() {
        return new CabinCameraPosType.Column();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType.Method }
     * 
     */
    public OrderV172PaymentMethodType.Method createOrderV172PaymentMethodTypeMethod() {
        return new OrderV172PaymentMethodType.Method();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType.Associations.Passengers }
     * 
     */
    public OrderV172PaymentMethodType.Associations.Passengers createOrderV172PaymentMethodTypeAssociationsPassengers() {
        return new OrderV172PaymentMethodType.Associations.Passengers();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType.Associations.OtherAssociation }
     * 
     */
    public OrderV172PaymentMethodType.Associations.OtherAssociation createOrderV172PaymentMethodTypeAssociationsOtherAssociation() {
        return new OrderV172PaymentMethodType.Associations.OtherAssociation();
    }

    /**
     * Create an instance of {@link OrderV172PaymentMethodType.Promotions.Promotion }
     * 
     */
    public OrderV172PaymentMethodType.Promotions.Promotion createOrderV172PaymentMethodTypePromotionsPromotion() {
        return new OrderV172PaymentMethodType.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link V172PaymentMethodType.Method.Promotions.Promotion }
     * 
     */
    public V172PaymentMethodType.Method.Promotions.Promotion createV172PaymentMethodTypeMethodPromotionsPromotion() {
        return new V172PaymentMethodType.Method.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Method }
     * 
     */
    public OrderPaymentFormType.Method createOrderPaymentFormTypeMethod() {
        return new OrderPaymentFormType.Method();
    }

    /**
     * Create an instance of {@link OrderPaymentFormType.Payer }
     * 
     */
    public OrderPaymentFormType.Payer createOrderPaymentFormTypePayer() {
        return new OrderPaymentFormType.Payer();
    }

    /**
     * Create an instance of {@link TicketDocumentType.CpnNbrs }
     * 
     */
    public TicketDocumentType.CpnNbrs createTicketDocumentTypeCpnNbrs() {
        return new TicketDocumentType.CpnNbrs();
    }

    /**
     * Create an instance of {@link HistoryCouponInfoType.SoldAirlineInfo }
     * 
     */
    public HistoryCouponInfoType.SoldAirlineInfo createHistoryCouponInfoTypeSoldAirlineInfo() {
        return new HistoryCouponInfoType.SoldAirlineInfo();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.DepartureDateTime }
     * 
     */
    public CouponSoldAirlineType.DepartureDateTime createCouponSoldAirlineTypeDepartureDateTime() {
        return new CouponSoldAirlineType.DepartureDateTime();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.ArrivalDateTime }
     * 
     */
    public CouponSoldAirlineType.ArrivalDateTime createCouponSoldAirlineTypeArrivalDateTime() {
        return new CouponSoldAirlineType.ArrivalDateTime();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.Stops }
     * 
     */
    public CouponSoldAirlineType.Stops createCouponSoldAirlineTypeStops() {
        return new CouponSoldAirlineType.Stops();
    }

    /**
     * Create an instance of {@link CouponSoldAirlineType.OperatingCarrier }
     * 
     */
    public CouponSoldAirlineType.OperatingCarrier createCouponSoldAirlineTypeOperatingCarrier() {
        return new CouponSoldAirlineType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link CouponEffectiveType.EffectiveDatePeriod }
     * 
     */
    public CouponEffectiveType.EffectiveDatePeriod createCouponEffectiveTypeEffectiveDatePeriod() {
        return new CouponEffectiveType.EffectiveDatePeriod();
    }

    /**
     * Create an instance of {@link CouponEffectiveType.EffectiveDateTimePeriod }
     * 
     */
    public CouponEffectiveType.EffectiveDateTimePeriod createCouponEffectiveTypeEffectiveDateTimePeriod() {
        return new CouponEffectiveType.EffectiveDateTimePeriod();
    }

    /**
     * Create an instance of {@link V172PenaltyType.ApplicableFeeRemarks }
     * 
     */
    public V172PenaltyType.ApplicableFeeRemarks createV172PenaltyTypeApplicableFeeRemarks() {
        return new V172PenaltyType.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks }
     * 
     */
    public V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks createV172PenaltyTypeDetailsDetailAmountsAmountApplicableFeeRemarks() {
        return new V172PenaltyType.Details.Detail.Amounts.Amount.ApplicableFeeRemarks();
    }

    /**
     * Create an instance of {@link V172RemarkType.Remark }
     * 
     */
    public V172RemarkType.Remark createV172RemarkTypeRemark() {
        return new V172RemarkType.Remark();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Status }
     * 
     */
    public PaymentProcessType.Status createPaymentProcessTypeStatus() {
        return new PaymentProcessType.Status();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Amount }
     * 
     */
    public PaymentProcessType.Amount createPaymentProcessTypeAmount() {
        return new PaymentProcessType.Amount();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Method }
     * 
     */
    public PaymentProcessType.Method createPaymentProcessTypeMethod() {
        return new PaymentProcessType.Method();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Variance }
     * 
     */
    public PaymentProcessType.Variance createPaymentProcessTypeVariance() {
        return new PaymentProcessType.Variance();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Payer }
     * 
     */
    public PaymentProcessType.Payer createPaymentProcessTypePayer() {
        return new PaymentProcessType.Payer();
    }

    /**
     * Create an instance of {@link PaymentProcessType.Promotions.Promotion }
     * 
     */
    public PaymentProcessType.Promotions.Promotion createPaymentProcessTypePromotionsPromotion() {
        return new PaymentProcessType.Promotions.Promotion();
    }

    /**
     * Create an instance of {@link PaymentStatusType.IncompletePayment }
     * 
     */
    public PaymentStatusType.IncompletePayment createPaymentStatusTypeIncompletePayment() {
        return new PaymentStatusType.IncompletePayment();
    }

    /**
     * Create an instance of {@link OrderOfferItemType.OfferItemType }
     * 
     */
    public OrderOfferItemType.OfferItemType createOrderOfferItemTypeOfferItemType() {
        return new OrderOfferItemType.OfferItemType();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.InventoryGuarantee }
     * 
     */
    public V172OrderItemType.OrderItem.InventoryGuarantee createV172OrderItemTypeOrderItemInventoryGuarantee() {
        return new V172OrderItemType.OrderItem.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.Service.ServiceDefinitionRef }
     * 
     */
    public V172OrderItemType.OrderItem.Service.ServiceDefinitionRef createV172OrderItemTypeOrderItemServiceServiceDefinitionRef() {
        return new V172OrderItemType.OrderItem.Service.ServiceDefinitionRef();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.Service.SelectedSeat.Seat }
     * 
     */
    public V172OrderItemType.OrderItem.Service.SelectedSeat.Seat createV172OrderItemTypeOrderItemServiceSelectedSeatSeat() {
        return new V172OrderItemType.OrderItem.Service.SelectedSeat.Seat();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.PriceDetail.TotalAmount }
     * 
     */
    public V172OrderItemType.OrderItem.PriceDetail.TotalAmount createV172OrderItemTypeOrderItemPriceDetailTotalAmount() {
        return new V172OrderItemType.OrderItem.PriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.PriceDetail.Surcharges }
     * 
     */
    public V172OrderItemType.OrderItem.PriceDetail.Surcharges createV172OrderItemTypeOrderItemPriceDetailSurcharges() {
        return new V172OrderItemType.OrderItem.PriceDetail.Surcharges();
    }

    /**
     * Create an instance of {@link V172OrderItemType.OrderItem.PriceDetail.Fees }
     * 
     */
    public V172OrderItemType.OrderItem.PriceDetail.Fees createV172OrderItemTypeOrderItemPriceDetailFees() {
        return new V172OrderItemType.OrderItem.PriceDetail.Fees();
    }

    /**
     * Create an instance of {@link V172OrderType.TotalOrderPrice }
     * 
     */
    public V172OrderType.TotalOrderPrice createV172OrderTypeTotalOrderPrice() {
        return new V172OrderType.TotalOrderPrice();
    }

    /**
     * Create an instance of {@link V172OrderType.Status }
     * 
     */
    public V172OrderType.Status createV172OrderTypeStatus() {
        return new V172OrderType.Status();
    }

    /**
     * Create an instance of {@link V172OrderType.Payments }
     * 
     */
    public V172OrderType.Payments createV172OrderTypePayments() {
        return new V172OrderType.Payments();
    }

    /**
     * Create an instance of {@link V172OrderType.TimeLimits.PaymentTimeLimit }
     * 
     */
    public V172OrderType.TimeLimits.PaymentTimeLimit createV172OrderTypeTimeLimitsPaymentTimeLimit() {
        return new V172OrderType.TimeLimits.PaymentTimeLimit();
    }

    /**
     * Create an instance of {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount }
     * 
     */
    public V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount createV172OrderTypeOriginalOrderPriceQuotesPriceQuoteAmount() {
        return new V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Amount();
    }

    /**
     * Create an instance of {@link V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source }
     * 
     */
    public V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source createV172OrderTypeOriginalOrderPriceQuotesPriceQuoteSource() {
        return new V172OrderType.OriginalOrder.PriceQuotes.PriceQuote.Source();
    }

    /**
     * Create an instance of {@link OtherOrderAssocType.OtherAssociation }
     * 
     */
    public OtherOrderAssocType.OtherAssociation createOtherOrderAssocTypeOtherAssociation() {
        return new OtherOrderAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link OfferItemTimeLimitSetType.TimeLimit }
     * 
     */
    public OfferItemTimeLimitSetType.TimeLimit createOfferItemTimeLimitSetTypeTimeLimit() {
        return new OfferItemTimeLimitSetType.TimeLimit();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OfferExpiration }
     * 
     */
    public OfferTimeLimitSetType.OfferExpiration createOfferTimeLimitSetTypeOfferExpiration() {
        return new OfferTimeLimitSetType.OfferExpiration();
    }

    /**
     * Create an instance of {@link OfferTimeLimitSetType.OtherLimits.OtherLimit }
     * 
     */
    public OfferTimeLimitSetType.OtherLimits.OtherLimit createOfferTimeLimitSetTypeOtherLimitsOtherLimit() {
        return new OfferTimeLimitSetType.OtherLimits.OtherLimit();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType.Earliest }
     * 
     */
    public OfferValidPeriodType.Earliest createOfferValidPeriodTypeEarliest() {
        return new OfferValidPeriodType.Earliest();
    }

    /**
     * Create an instance of {@link OfferValidPeriodType.Latest }
     * 
     */
    public OfferValidPeriodType.Latest createOfferValidPeriodTypeLatest() {
        return new OfferValidPeriodType.Latest();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.ExpirationDate }
     * 
     */
    public OfferIncentiveType.Incentive.ExpirationDate createOfferIncentiveTypeIncentiveExpirationDate() {
        return new OfferIncentiveType.Incentive.ExpirationDate();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.OfferSubCode }
     * 
     */
    public OfferIncentiveType.Incentive.OfferSubCode createOfferIncentiveTypeIncentiveOfferSubCode() {
        return new OfferIncentiveType.Incentive.OfferSubCode();
    }

    /**
     * Create an instance of {@link OfferIncentiveType.Incentive.DiscountLevel }
     * 
     */
    public OfferIncentiveType.Incentive.DiscountLevel createOfferIncentiveTypeIncentiveDiscountLevel() {
        return new OfferIncentiveType.Incentive.DiscountLevel();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.TotalAmount }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.TotalAmount createOfferPriceLeadDetailTypePriceDetailTotalAmount() {
        return new OfferPriceLeadDetailType.PriceDetail.TotalAmount();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.Surcharges }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.Surcharges createOfferPriceLeadDetailTypePriceDetailSurcharges() {
        return new OfferPriceLeadDetailType.PriceDetail.Surcharges();
    }

    /**
     * Create an instance of {@link OfferPriceLeadDetailType.PriceDetail.Fees }
     * 
     */
    public OfferPriceLeadDetailType.PriceDetail.Fees createOfferPriceLeadDetailTypePriceDetailFees() {
        return new OfferPriceLeadDetailType.PriceDetail.Fees();
    }

    /**
     * Create an instance of {@link OfferPriceLeadType.RequestedDate }
     * 
     */
    public OfferPriceLeadType.RequestedDate createOfferPriceLeadTypeRequestedDate() {
        return new OfferPriceLeadType.RequestedDate();
    }

    /**
     * Create an instance of {@link SeatOfferCoreType.OfferPrice }
     * 
     */
    public SeatOfferCoreType.OfferPrice createSeatOfferCoreTypeOfferPrice() {
        return new SeatOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link PricedFlightOfferCoreType.OfferPrice }
     * 
     */
    public PricedFlightOfferCoreType.OfferPrice createPricedFlightOfferCoreTypeOfferPrice() {
        return new PricedFlightOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link OtherOfferCoreType.OfferPrice }
     * 
     */
    public OtherOfferCoreType.OfferPrice createOtherOfferCoreTypeOfferPrice() {
        return new OtherOfferCoreType.OfferPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.TotalPrice }
     * 
     */
    public BaggageOfferCoreType.TotalPrice createBaggageOfferCoreTypeTotalPrice() {
        return new BaggageOfferCoreType.TotalPrice();
    }

    /**
     * Create an instance of {@link BaggageOfferCoreType.BagDetails.BagDetail.Price }
     * 
     */
    public BaggageOfferCoreType.BagDetails.BagDetail.Price createBaggageOfferCoreTypeBagDetailsBagDetailPrice() {
        return new BaggageOfferCoreType.BagDetails.BagDetail.Price();
    }

    /**
     * Create an instance of {@link V172OfferType.Parameters }
     * 
     */
    public V172OfferType.Parameters createV172OfferTypeParameters() {
        return new V172OfferType.Parameters();
    }

    /**
     * Create an instance of {@link V172OfferType.TotalPrice }
     * 
     */
    public V172OfferType.TotalPrice createV172OfferTypeTotalPrice() {
        return new V172OfferType.TotalPrice();
    }

    /**
     * Create an instance of {@link PricedFlightOfferAssocType.PriceClass }
     * 
     */
    public PricedFlightOfferAssocType.PriceClass createPricedFlightOfferAssocTypePriceClass() {
        return new PricedFlightOfferAssocType.PriceClass();
    }

    /**
     * Create an instance of {@link ItineraryType.Flight }
     * 
     */
    public ItineraryType.Flight createItineraryTypeFlight() {
        return new ItineraryType.Flight();
    }

    /**
     * Create an instance of {@link FlightType.Flight.Indicators }
     * 
     */
    public FlightType.Flight.Indicators createFlightTypeFlightIndicators() {
        return new FlightType.Flight.Indicators();
    }

    /**
     * Create an instance of {@link FlightType.Flight.Status }
     * 
     */
    public FlightType.Flight.Status createFlightTypeFlightStatus() {
        return new FlightType.Flight.Status();
    }

    /**
     * Create an instance of {@link FlightType.Flight.OperatingCarrier }
     * 
     */
    public FlightType.Flight.OperatingCarrier createFlightTypeFlightOperatingCarrier() {
        return new FlightType.Flight.OperatingCarrier();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType.CabinDesignator }
     * 
     */
    public FlightCabinCoreType.CabinDesignator createFlightCabinCoreTypeCabinDesignator() {
        return new FlightCabinCoreType.CabinDesignator();
    }

    /**
     * Create an instance of {@link FlightCabinCoreType.MarketingName }
     * 
     */
    public FlightCabinCoreType.MarketingName createFlightCabinCoreTypeMarketingName() {
        return new FlightCabinCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link AircraftFeaturesQueryType.Feature }
     * 
     */
    public AircraftFeaturesQueryType.Feature createAircraftFeaturesQueryTypeFeature() {
        return new AircraftFeaturesQueryType.Feature();
    }

    /**
     * Create an instance of {@link FlightOnlyType.OperatingCarrier }
     * 
     */
    public FlightOnlyType.OperatingCarrier createFlightOnlyTypeOperatingCarrier() {
        return new FlightOnlyType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link FlightDetailType.Stops }
     * 
     */
    public FlightDetailType.Stops createFlightDetailTypeStops() {
        return new FlightDetailType.Stops();
    }

    /**
     * Create an instance of {@link COSOtherAssocType.OtherAssociation }
     * 
     */
    public COSOtherAssocType.OtherAssociation createCOSOtherAssocTypeOtherAssociation() {
        return new COSOtherAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link FarePriceBaseType.TotalAmount }
     * 
     */
    public FarePriceBaseType.TotalAmount createFarePriceBaseTypeTotalAmount() {
        return new FarePriceBaseType.TotalAmount();
    }

    /**
     * Create an instance of {@link FarePriceBaseType.Surcharges }
     * 
     */
    public FarePriceBaseType.Surcharges createFarePriceBaseTypeSurcharges() {
        return new FarePriceBaseType.Surcharges();
    }

    /**
     * Create an instance of {@link FareComponentType.Parameters }
     * 
     */
    public FareComponentType.Parameters createFareComponentTypeParameters() {
        return new FareComponentType.Parameters();
    }

    /**
     * Create an instance of {@link FareComponentType.SegmentRefs }
     * 
     */
    public FareComponentType.SegmentRefs createFareComponentTypeSegmentRefs() {
        return new FareComponentType.SegmentRefs();
    }

    /**
     * Create an instance of {@link FareComponentType.FareBasis.CabinType }
     * 
     */
    public FareComponentType.FareBasis.CabinType createFareComponentTypeFareBasisCabinType() {
        return new FareComponentType.FareBasis.CabinType();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType.OperatingCarrier }
     * 
     */
    public ListOfFlightSegmentType.OperatingCarrier createListOfFlightSegmentTypeOperatingCarrier() {
        return new ListOfFlightSegmentType.OperatingCarrier();
    }

    /**
     * Create an instance of {@link ListOfFlightSegmentType.Settlement }
     * 
     */
    public ListOfFlightSegmentType.Settlement createListOfFlightSegmentTypeSettlement() {
        return new ListOfFlightSegmentType.Settlement();
    }

    /**
     * Create an instance of {@link LinkFormattedType.Link }
     * 
     */
    public LinkFormattedType.Link createLinkFormattedTypeLink() {
        return new LinkFormattedType.Link();
    }

    /**
     * Create an instance of {@link LinkDescriptionType.Links }
     * 
     */
    public LinkDescriptionType.Links createLinkDescriptionTypeLinks() {
        return new LinkDescriptionType.Links();
    }

    /**
     * Create an instance of {@link LinkDescriptionType.Texts }
     * 
     */
    public LinkDescriptionType.Texts createLinkDescriptionTypeTexts() {
        return new LinkDescriptionType.Texts();
    }

    /**
     * Create an instance of {@link V172DataListType.DescriptionList }
     * 
     */
    public V172DataListType.DescriptionList createV172DataListTypeDescriptionList() {
        return new V172DataListType.DescriptionList();
    }

    /**
     * Create an instance of {@link V172DataListType.FlightSegmentList }
     * 
     */
    public V172DataListType.FlightSegmentList createV172DataListTypeFlightSegmentList() {
        return new V172DataListType.FlightSegmentList();
    }

    /**
     * Create an instance of {@link V172DataListType.OriginDestinationList }
     * 
     */
    public V172DataListType.OriginDestinationList createV172DataListTypeOriginDestinationList() {
        return new V172DataListType.OriginDestinationList();
    }

    /**
     * Create an instance of {@link V172DataListType.FlightList.Flight.Settlement }
     * 
     */
    public V172DataListType.FlightList.Flight.Settlement createV172DataListTypeFlightListFlightSettlement() {
        return new V172DataListType.FlightList.Flight.Settlement();
    }

    /**
     * Create an instance of {@link V172DataListType.BaggageAllowanceList.BaggageAllowance }
     * 
     */
    public V172DataListType.BaggageAllowanceList.BaggageAllowance createV172DataListTypeBaggageAllowanceListBaggageAllowance() {
        return new V172DataListType.BaggageAllowanceList.BaggageAllowance();
    }

    /**
     * Create an instance of {@link PolicyType.Descriptions }
     * 
     */
    public PolicyType.Descriptions createPolicyTypeDescriptions() {
        return new PolicyType.Descriptions();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata.EncodingScheme }
     * 
     */
    public PolicyType.Metadata.EncodingScheme createPolicyTypeMetadataEncodingScheme() {
        return new PolicyType.Metadata.EncodingScheme();
    }

    /**
     * Create an instance of {@link PolicyType.Metadata.ValidPeriod }
     * 
     */
    public PolicyType.Metadata.ValidPeriod createPolicyTypeMetadataValidPeriod() {
        return new PolicyType.Metadata.ValidPeriod();
    }

    /**
     * Create an instance of {@link CorePeriodGrpType.TimeStamp }
     * 
     */
    public CorePeriodGrpType.TimeStamp createCorePeriodGrpTypeTimeStamp() {
        return new CorePeriodGrpType.TimeStamp();
    }

    /**
     * Create an instance of {@link EncSchemeType.Metadata }
     * 
     */
    public EncSchemeType.Metadata createEncSchemeTypeMetadata() {
        return new EncSchemeType.Metadata();
    }

    /**
     * Create an instance of {@link EncSchemeType.Detail.SupportedDomain }
     * 
     */
    public EncSchemeType.Detail.SupportedDomain createEncSchemeTypeDetailSupportedDomain() {
        return new EncSchemeType.Detail.SupportedDomain();
    }

    /**
     * Create an instance of {@link PolicyType.Nodes.Node }
     * 
     */
    public PolicyType.Nodes.Node createPolicyTypeNodesNode() {
        return new PolicyType.Nodes.Node();
    }

    /**
     * Create an instance of {@link NodePathType.Path }
     * 
     */
    public NodePathType.Path createNodePathTypePath() {
        return new NodePathType.Path();
    }

    /**
     * Create an instance of {@link NodePathType.TagName }
     * 
     */
    public NodePathType.TagName createNodePathTypeTagName() {
        return new NodePathType.TagName();
    }

    /**
     * Create an instance of {@link LocalizationNoticeType.Currencies }
     * 
     */
    public LocalizationNoticeType.Currencies createLocalizationNoticeTypeCurrencies() {
        return new LocalizationNoticeType.Currencies();
    }

    /**
     * Create an instance of {@link InfoPolicyNoticeType.Policy }
     * 
     */
    public InfoPolicyNoticeType.Policy createInfoPolicyNoticeTypePolicy() {
        return new InfoPolicyNoticeType.Policy();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Status }
     * 
     */
    public PinPhraseQuestionType.Status createPinPhraseQuestionTypeStatus() {
        return new PinPhraseQuestionType.Status();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Device }
     * 
     */
    public PinPhraseQuestionType.Device createPinPhraseQuestionTypeDevice() {
        return new PinPhraseQuestionType.Device();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.OriginalTransactionID }
     * 
     */
    public PinPhraseQuestionType.OriginalTransactionID createPinPhraseQuestionTypeOriginalTransactionID() {
        return new PinPhraseQuestionType.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link V172DeviceType.Type }
     * 
     */
    public V172DeviceType.Type createV172DeviceTypeType() {
        return new V172DeviceType.Type();
    }

    /**
     * Create an instance of {@link PinPhraseQuestionType.Challenge.Parameters.Positions }
     * 
     */
    public PinPhraseQuestionType.Challenge.Parameters.Positions createPinPhraseQuestionTypeChallengeParametersPositions() {
        return new PinPhraseQuestionType.Challenge.Parameters.Positions();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.Status }
     * 
     */
    public PinPhraseAnswerType.Status createPinPhraseAnswerTypeStatus() {
        return new PinPhraseAnswerType.Status();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.Device }
     * 
     */
    public PinPhraseAnswerType.Device createPinPhraseAnswerTypeDevice() {
        return new PinPhraseAnswerType.Device();
    }

    /**
     * Create an instance of {@link PinPhraseAnswerType.OriginalTransactionID }
     * 
     */
    public PinPhraseAnswerType.OriginalTransactionID createPinPhraseAnswerTypeOriginalTransactionID() {
        return new PinPhraseAnswerType.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link MarketMsgAssocType.Association }
     * 
     */
    public MarketMsgAssocType.Association createMarketMsgAssocTypeAssociation() {
        return new MarketMsgAssocType.Association();
    }

    /**
     * Create an instance of {@link MarketingInfoType.Message }
     * 
     */
    public MarketingInfoType.Message createMarketingInfoTypeMessage() {
        return new MarketingInfoType.Message();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.PseudoCity }
     * 
     */
    public AgencyCoreRepType.PseudoCity createAgencyCoreRepTypePseudoCity() {
        return new AgencyCoreRepType.PseudoCity();
    }

    /**
     * Create an instance of {@link AgencyCoreRepType.OtherIDs.OtherID }
     * 
     */
    public AgencyCoreRepType.OtherIDs.OtherID createAgencyCoreRepTypeOtherIDsOtherID() {
        return new AgencyCoreRepType.OtherIDs.OtherID();
    }

    /**
     * Create an instance of {@link SupplierCoreRepType.OtherIDs.OtherID }
     * 
     */
    public SupplierCoreRepType.OtherIDs.OtherID createSupplierCoreRepTypeOtherIDsOtherID() {
        return new SupplierCoreRepType.OtherIDs.OtherID();
    }

    /**
     * Create an instance of {@link IntermediaryCoreRepType.Contact }
     * 
     */
    public IntermediaryCoreRepType.Contact createIntermediaryCoreRepTypeContact() {
        return new IntermediaryCoreRepType.Contact();
    }

    /**
     * Create an instance of {@link AgentUserType.AgentUserID }
     * 
     */
    public AgentUserType.AgentUserID createAgentUserTypeAgentUserID() {
        return new AgentUserType.AgentUserID();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.Location }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.Location createFulfillmentPartnerTypeFulfillmentsFulfillmentLocation() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start createFulfillmentPartnerTypeFulfillmentsFulfillmentOfferValidDatesStart() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End }
     * 
     */
    public FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End createFulfillmentPartnerTypeFulfillmentsFulfillmentOfferValidDatesEnd() {
        return new FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link TravelerFOIDType.FOID }
     * 
     */
    public TravelerFOIDType.FOID createTravelerFOIDTypeFOID() {
        return new TravelerFOIDType.FOID();
    }

    /**
     * Create an instance of {@link InstrClassUpgradeType.Classes }
     * 
     */
    public InstrClassUpgradeType.Classes createInstrClassUpgradeTypeClasses() {
        return new InstrClassUpgradeType.Classes();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.Penalty }
     * 
     */
    public TicketAutoExchangeType.Penalty createTicketAutoExchangeTypePenalty() {
        return new TicketAutoExchangeType.Penalty();
    }

    /**
     * Create an instance of {@link TicketAutoExchangeType.TicketNumbers.TicketNumber }
     * 
     */
    public TicketAutoExchangeType.TicketNumbers.TicketNumber createTicketAutoExchangeTypeTicketNumbersTicketNumber() {
        return new TicketAutoExchangeType.TicketNumbers.TicketNumber();
    }

    /**
     * Create an instance of {@link LocationProximityType.AreaValue }
     * 
     */
    public LocationProximityType.AreaValue createLocationProximityTypeAreaValue() {
        return new LocationProximityType.AreaValue();
    }

    /**
     * Create an instance of {@link StateProvProximityType.StateCode }
     * 
     */
    public StateProvProximityType.StateCode createStateProvProximityTypeStateCode() {
        return new StateProvProximityType.StateCode();
    }

    /**
     * Create an instance of {@link StateProvQueryType.Keywords.KeyWord }
     * 
     */
    public StateProvQueryType.Keywords.KeyWord createStateProvQueryTypeKeywordsKeyWord() {
        return new StateProvQueryType.Keywords.KeyWord();
    }

    /**
     * Create an instance of {@link StateProvQueryType.StateCodes.StateCode }
     * 
     */
    public StateProvQueryType.StateCodes.StateCode createStateProvQueryTypeStateCodesStateCode() {
        return new StateProvQueryType.StateCodes.StateCode();
    }

    /**
     * Create an instance of {@link SpecialType.Code }
     * 
     */
    public SpecialType.Code createSpecialTypeCode() {
        return new SpecialType.Code();
    }

    /**
     * Create an instance of {@link SpecialType.Description }
     * 
     */
    public SpecialType.Description createSpecialTypeDescription() {
        return new SpecialType.Description();
    }

    /**
     * Create an instance of {@link RuleType.Value }
     * 
     */
    public RuleType.Value createRuleTypeValue() {
        return new RuleType.Value();
    }

    /**
     * Create an instance of {@link RuleType.Name }
     * 
     */
    public RuleType.Name createRuleTypeName() {
        return new RuleType.Name();
    }

    /**
     * Create an instance of {@link RuleType.EffectivePeriod }
     * 
     */
    public RuleType.EffectivePeriod createRuleTypeEffectivePeriod() {
        return new RuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link RuleSetType.RuleSetID }
     * 
     */
    public RuleSetType.RuleSetID createRuleSetTypeRuleSetID() {
        return new RuleSetType.RuleSetID();
    }

    /**
     * Create an instance of {@link RuleSetType.RuleValid }
     * 
     */
    public RuleSetType.RuleValid createRuleSetTypeRuleValid() {
        return new RuleSetType.RuleValid();
    }

    /**
     * Create an instance of {@link V172PriceVarianceRuleType.AcceptableVariance }
     * 
     */
    public V172PriceVarianceRuleType.AcceptableVariance createV172PriceVarianceRuleTypeAcceptableVariance() {
        return new V172PriceVarianceRuleType.AcceptableVariance();
    }

    /**
     * Create an instance of {@link V172PriceVarianceRuleType.Name }
     * 
     */
    public V172PriceVarianceRuleType.Name createV172PriceVarianceRuleTypeName() {
        return new V172PriceVarianceRuleType.Name();
    }

    /**
     * Create an instance of {@link V172PriceVarianceRuleType.EffectivePeriod }
     * 
     */
    public V172PriceVarianceRuleType.EffectivePeriod createV172PriceVarianceRuleTypeEffectivePeriod() {
        return new V172PriceVarianceRuleType.EffectivePeriod();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Unit }
     * 
     */
    public AwardRedemptionType.Unit createAwardRedemptionTypeUnit() {
        return new AwardRedemptionType.Unit();
    }

    /**
     * Create an instance of {@link AwardRedemptionType.Conversion }
     * 
     */
    public AwardRedemptionType.Conversion createAwardRedemptionTypeConversion() {
        return new AwardRedemptionType.Conversion();
    }

    /**
     * Create an instance of {@link CombinationPriceSimpleType.Partial.Currency }
     * 
     */
    public CombinationPriceSimpleType.Partial.Currency createCombinationPriceSimpleTypePartialCurrency() {
        return new CombinationPriceSimpleType.Partial.Currency();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account.SignInID }
     * 
     */
    public TravelerFQTVType.Account.SignInID createTravelerFQTVTypeAccountSignInID() {
        return new TravelerFQTVType.Account.SignInID();
    }

    /**
     * Create an instance of {@link TravelerFQTVType.Account.Number }
     * 
     */
    public TravelerFQTVType.Account.Number createTravelerFQTVTypeAccountNumber() {
        return new TravelerFQTVType.Account.Number();
    }

    /**
     * Create an instance of {@link RenderingParameterType.Parameter }
     * 
     */
    public RenderingParameterType.Parameter createRenderingParameterTypeParameter() {
        return new RenderingParameterType.Parameter();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.OutputFormat }
     * 
     */
    public RenderingInstructionsType.OutputFormat createRenderingInstructionsTypeOutputFormat() {
        return new RenderingInstructionsType.OutputFormat();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.AttachmentURI }
     * 
     */
    public RenderingInstructionsType.AttachmentURI createRenderingInstructionsTypeAttachmentURI() {
        return new RenderingInstructionsType.AttachmentURI();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.Parameters }
     * 
     */
    public RenderingInstructionsType.Parameters createRenderingInstructionsTypeParameters() {
        return new RenderingInstructionsType.Parameters();
    }

    /**
     * Create an instance of {@link RenderingInstructionsType.Overview }
     * 
     */
    public RenderingInstructionsType.Overview createRenderingInstructionsTypeOverview() {
        return new RenderingInstructionsType.Overview();
    }

    /**
     * Create an instance of {@link MediaAttachmentType.AttachmentURI }
     * 
     */
    public MediaAttachmentType.AttachmentURI createMediaAttachmentTypeAttachmentURI() {
        return new MediaAttachmentType.AttachmentURI();
    }

    /**
     * Create an instance of {@link CountryQueryType.CountryCodes }
     * 
     */
    public CountryQueryType.CountryCodes createCountryQueryTypeCountryCodes() {
        return new CountryQueryType.CountryCodes();
    }

    /**
     * Create an instance of {@link CountryQueryType.Keywords }
     * 
     */
    public CountryQueryType.Keywords createCountryQueryTypeKeywords() {
        return new CountryQueryType.Keywords();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc.Group }
     * 
     */
    public NamedAssocType.NamedAssoc.Group createNamedAssocTypeNamedAssocGroup() {
        return new NamedAssocType.NamedAssoc.Group();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc.List }
     * 
     */
    public NamedAssocType.NamedAssoc.List createNamedAssocTypeNamedAssocList() {
        return new NamedAssocType.NamedAssoc.List();
    }

    /**
     * Create an instance of {@link NamedAssocType.NamedAssoc.UniqueKeyID }
     * 
     */
    public NamedAssocType.NamedAssoc.UniqueKeyID createNamedAssocTypeNamedAssocUniqueKeyID() {
        return new NamedAssocType.NamedAssoc.UniqueKeyID();
    }

    /**
     * Create an instance of {@link AugPointListType.List.AugPointAssoc }
     * 
     */
    public AugPointListType.List.AugPointAssoc createAugPointListTypeListAugPointAssoc() {
        return new AugPointListType.List.AugPointAssoc();
    }

    /**
     * Create an instance of {@link AugPointAssocType.AugPointAssoc }
     * 
     */
    public AugPointAssocType.AugPointAssoc createAugPointAssocTypeAugPointAssoc() {
        return new AugPointAssocType.AugPointAssoc();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.Alerts }
     * 
     */
    public ItinReshopParamsType.Alerts createItinReshopParamsTypeAlerts() {
        return new ItinReshopParamsType.Alerts();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.CurrCodes }
     * 
     */
    public ItinReshopParamsType.CurrCodes createItinReshopParamsTypeCurrCodes() {
        return new ItinReshopParamsType.CurrCodes();
    }

    /**
     * Create an instance of {@link ItinReshopParamsType.Notices.PricingParameters }
     * 
     */
    public ItinReshopParamsType.Notices.PricingParameters createItinReshopParamsTypeNoticesPricingParameters() {
        return new ItinReshopParamsType.Notices.PricingParameters();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Pricing }
     * 
     */
    public TransferPreferencesType.Pricing createTransferPreferencesTypePricing() {
        return new TransferPreferencesType.Pricing();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Interline }
     * 
     */
    public TransferPreferencesType.Connection.Interline createTransferPreferencesTypeConnectionInterline() {
        return new TransferPreferencesType.Connection.Interline();
    }

    /**
     * Create an instance of {@link TransferPreferencesType.Connection.Codes.Code }
     * 
     */
    public TransferPreferencesType.Connection.Codes.Code createTransferPreferencesTypeConnectionCodesCode() {
        return new TransferPreferencesType.Connection.Codes.Code();
    }

    /**
     * Create an instance of {@link FltSegmentMaxTimePreferencesType.MaxFlightTime }
     * 
     */
    public FltSegmentMaxTimePreferencesType.MaxFlightTime createFltSegmentMaxTimePreferencesTypeMaxFlightTime() {
        return new FltSegmentMaxTimePreferencesType.MaxFlightTime();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Exclusion }
     * 
     */
    public FarePreferencesType.Exclusion createFarePreferencesTypeExclusion() {
        return new FarePreferencesType.Exclusion();
    }

    /**
     * Create an instance of {@link FarePreferencesType.TicketDesigs.TicketDesig }
     * 
     */
    public FarePreferencesType.TicketDesigs.TicketDesig createFarePreferencesTypeTicketDesigsTicketDesig() {
        return new FarePreferencesType.TicketDesigs.TicketDesig();
    }

    /**
     * Create an instance of {@link FarePreferencesType.FareCodes.Code }
     * 
     */
    public FarePreferencesType.FareCodes.Code createFarePreferencesTypeFareCodesCode() {
        return new FarePreferencesType.FareCodes.Code();
    }

    /**
     * Create an instance of {@link FarePreferencesType.Types.Type }
     * 
     */
    public FarePreferencesType.Types.Type createFarePreferencesTypeTypesType() {
        return new FarePreferencesType.Types.Type();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.WaitListing.WaitListPreferences }
     * 
     */
    public FlightPreferencesType.WaitListing.WaitListPreferences createFlightPreferencesTypeWaitListingWaitListPreferences() {
        return new FlightPreferencesType.WaitListing.WaitListPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.NonStopPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.NonStopPreferences createFlightPreferencesTypeCharacteristicNonStopPreferences() {
        return new FlightPreferencesType.Characteristic.NonStopPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.DirectPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.DirectPreferences createFlightPreferencesTypeCharacteristicDirectPreferences() {
        return new FlightPreferencesType.Characteristic.DirectPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.OvernightStopPreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.OvernightStopPreferences createFlightPreferencesTypeCharacteristicOvernightStopPreferences() {
        return new FlightPreferencesType.Characteristic.OvernightStopPreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.AirportChangePreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.AirportChangePreferences createFlightPreferencesTypeCharacteristicAirportChangePreferences() {
        return new FlightPreferencesType.Characteristic.AirportChangePreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Characteristic.RedEyePreferences }
     * 
     */
    public FlightPreferencesType.Characteristic.RedEyePreferences createFlightPreferencesTypeCharacteristicRedEyePreferences() {
        return new FlightPreferencesType.Characteristic.RedEyePreferences();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Equipment }
     * 
     */
    public FlightPreferencesType.Aircraft.Equipment createFlightPreferencesTypeAircraftEquipment() {
        return new FlightPreferencesType.Aircraft.Equipment();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows.Feature }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows.Feature createFlightPreferencesTypeAircraftRowsFeature() {
        return new FlightPreferencesType.Aircraft.Rows.Feature();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Rows.Number }
     * 
     */
    public FlightPreferencesType.Aircraft.Rows.Number createFlightPreferencesTypeAircraftRowsNumber() {
        return new FlightPreferencesType.Aircraft.Rows.Number();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats.Characteristic }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats.Characteristic createFlightPreferencesTypeAircraftSeatsCharacteristic() {
        return new FlightPreferencesType.Aircraft.Seats.Characteristic();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Seats.Position }
     * 
     */
    public FlightPreferencesType.Aircraft.Seats.Position createFlightPreferencesTypeAircraftSeatsPosition() {
        return new FlightPreferencesType.Aircraft.Seats.Position();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Classes.Class }
     * 
     */
    public FlightPreferencesType.Aircraft.Classes.Class createFlightPreferencesTypeAircraftClassesClass() {
        return new FlightPreferencesType.Aircraft.Classes.Class();
    }

    /**
     * Create an instance of {@link FlightPreferencesType.Aircraft.Cabins.Cabin }
     * 
     */
    public FlightPreferencesType.Aircraft.Cabins.Cabin createFlightPreferencesTypeAircraftCabinsCabin() {
        return new FlightPreferencesType.Aircraft.Cabins.Cabin();
    }

    /**
     * Create an instance of {@link AlliancePreferencesType.Alliance }
     * 
     */
    public AlliancePreferencesType.Alliance createAlliancePreferencesTypeAlliance() {
        return new AlliancePreferencesType.Alliance();
    }

    /**
     * Create an instance of {@link AirlinePreferencesType.Airline }
     * 
     */
    public AirlinePreferencesType.Airline createAirlinePreferencesTypeAirline() {
        return new AirlinePreferencesType.Airline();
    }

    /**
     * Create an instance of {@link PersonBudgetType.Amount }
     * 
     */
    public PersonBudgetType.Amount createPersonBudgetTypeAmount() {
        return new PersonBudgetType.Amount();
    }

    /**
     * Create an instance of {@link GroupBudgetType.Amount }
     * 
     */
    public GroupBudgetType.Amount createGroupBudgetTypeAmount() {
        return new GroupBudgetType.Amount();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName createPrePaidProgramQualifierPrepaidProgramDetailProgramName() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.ProgramName();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Holder }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Holder createPrePaidProgramQualifierPrepaidProgramDetailHolder() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Holder();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number createPrePaidProgramQualifierPrepaidProgramDetailCertificateNumber() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.Number();
    }

    /**
     * Create an instance of {@link PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod }
     * 
     */
    public PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod createPrePaidProgramQualifierPrepaidProgramDetailCertificateEffectivePeriod() {
        return new PrePaidProgramQualifier.PrepaidProgramDetail.Certificate.EffectivePeriod();
    }

    /**
     * Create an instance of {@link DiscountProgramType.Account }
     * 
     */
    public DiscountProgramType.Account createDiscountProgramTypeAccount() {
        return new DiscountProgramType.Account();
    }

    /**
     * Create an instance of {@link DiscountProgramType.AssocCode }
     * 
     */
    public DiscountProgramType.AssocCode createDiscountProgramTypeAssocCode() {
        return new DiscountProgramType.AssocCode();
    }

    /**
     * Create an instance of {@link DiscountProgramType.Name }
     * 
     */
    public DiscountProgramType.Name createDiscountProgramTypeName() {
        return new DiscountProgramType.Name();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType.LocationCode }
     * 
     */
    public FltArriveQualifiedQueryType.LocationCode createFltArriveQualifiedQueryTypeLocationCode() {
        return new FltArriveQualifiedQueryType.LocationCode();
    }

    /**
     * Create an instance of {@link FltArriveQualifiedQueryType.LeadPricing }
     * 
     */
    public FltArriveQualifiedQueryType.LeadPricing createFltArriveQualifiedQueryTypeLeadPricing() {
        return new FltArriveQualifiedQueryType.LeadPricing();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType.LocationCode }
     * 
     */
    public FltDepartQualifiedQueryType.LocationCode createFltDepartQualifiedQueryTypeLocationCode() {
        return new FltDepartQualifiedQueryType.LocationCode();
    }

    /**
     * Create an instance of {@link FltDepartQualifiedQueryType.LeadPricing }
     * 
     */
    public FltDepartQualifiedQueryType.LeadPricing createFltDepartQualifiedQueryTypeLeadPricing() {
        return new FltDepartQualifiedQueryType.LeadPricing();
    }

    /**
     * Create an instance of {@link ServiceCouponType.CouponType }
     * 
     */
    public ServiceCouponType.CouponType createServiceCouponTypeCouponType() {
        return new ServiceCouponType.CouponType();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.Location }
     * 
     */
    public ServiceFulfillmentType.Location createServiceFulfillmentTypeLocation() {
        return new ServiceFulfillmentType.Location();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.Start }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.Start createServiceFulfillmentTypeOfferValidDatesStart() {
        return new ServiceFulfillmentType.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceFulfillmentType.OfferValidDates.End }
     * 
     */
    public ServiceFulfillmentType.OfferValidDates.End createServiceFulfillmentTypeOfferValidDatesEnd() {
        return new ServiceFulfillmentType.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link TotalFareTransactionType.Amount }
     * 
     */
    public TotalFareTransactionType.Amount createTotalFareTransactionTypeAmount() {
        return new TotalFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link ETFareInfoType.Waiver }
     * 
     */
    public ETFareInfoType.Waiver createETFareInfoTypeWaiver() {
        return new ETFareInfoType.Waiver();
    }

    /**
     * Create an instance of {@link ETFareInfoType.RuleInd }
     * 
     */
    public ETFareInfoType.RuleInd createETFareInfoTypeRuleInd() {
        return new ETFareInfoType.RuleInd();
    }

    /**
     * Create an instance of {@link ETFareInfoType.Detail }
     * 
     */
    public ETFareInfoType.Detail createETFareInfoTypeDetail() {
        return new ETFareInfoType.Detail();
    }

    /**
     * Create an instance of {@link EquivFareTransactionType.Amount }
     * 
     */
    public EquivFareTransactionType.Amount createEquivFareTransactionTypeAmount() {
        return new EquivFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link BaseFareTransactionType.Amount }
     * 
     */
    public BaseFareTransactionType.Amount createBaseFareTransactionTypeAmount() {
        return new BaseFareTransactionType.Amount();
    }

    /**
     * Create an instance of {@link CouponInfoType.SoldAirlineInfo }
     * 
     */
    public CouponInfoType.SoldAirlineInfo createCouponInfoTypeSoldAirlineInfo() {
        return new CouponInfoType.SoldAirlineInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.PresentInfo }
     * 
     */
    public CouponInfoType.PresentInfo createCouponInfoTypePresentInfo() {
        return new CouponInfoType.PresentInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ReasonForIssuance }
     * 
     */
    public CouponInfoType.ReasonForIssuance createCouponInfoTypeReasonForIssuance() {
        return new CouponInfoType.ReasonForIssuance();
    }

    /**
     * Create an instance of {@link CouponInfoType.FiledFeeInfo }
     * 
     */
    public CouponInfoType.FiledFeeInfo createCouponInfoTypeFiledFeeInfo() {
        return new CouponInfoType.FiledFeeInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ProductCharacteristic }
     * 
     */
    public CouponInfoType.ProductCharacteristic createCouponInfoTypeProductCharacteristic() {
        return new CouponInfoType.ProductCharacteristic();
    }

    /**
     * Create an instance of {@link CouponInfoType.AdditionalServicesInfo }
     * 
     */
    public CouponInfoType.AdditionalServicesInfo createCouponInfoTypeAdditionalServicesInfo() {
        return new CouponInfoType.AdditionalServicesInfo();
    }

    /**
     * Create an instance of {@link CouponInfoType.ExcessBaggage }
     * 
     */
    public CouponInfoType.ExcessBaggage createCouponInfoTypeExcessBaggage() {
        return new CouponInfoType.ExcessBaggage();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResDesigAirportCityCode }
     * 
     */
    public CouponInfoType.ResDesigAirportCityCode createCouponInfoTypeResDesigAirportCityCode() {
        return new CouponInfoType.ResDesigAirportCityCode();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResFlightDepartureTime }
     * 
     */
    public CouponInfoType.ResFlightDepartureTime createCouponInfoTypeResFlightDepartureTime() {
        return new CouponInfoType.ResFlightDepartureTime();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResFlightNumber }
     * 
     */
    public CouponInfoType.ResFlightNumber createCouponInfoTypeResFlightNumber() {
        return new CouponInfoType.ResFlightNumber();
    }

    /**
     * Create an instance of {@link CouponInfoType.ResOriginAirportCityCode }
     * 
     */
    public CouponInfoType.ResOriginAirportCityCode createCouponInfoTypeResOriginAirportCityCode() {
        return new CouponInfoType.ResOriginAirportCityCode();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.AllowableBag }
     * 
     */
    public AddlBaggageInfoType.AllowableBag createAddlBaggageInfoTypeAllowableBag() {
        return new AddlBaggageInfoType.AllowableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.BagCharge }
     * 
     */
    public AddlBaggageInfoType.BagCharge createAddlBaggageInfoTypeBagCharge() {
        return new AddlBaggageInfoType.BagCharge();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnAllowableBag }
     * 
     */
    public AddlBaggageInfoType.CarryOnAllowableBag createAddlBaggageInfoTypeCarryOnAllowableBag() {
        return new AddlBaggageInfoType.CarryOnAllowableBag();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnFree }
     * 
     */
    public AddlBaggageInfoType.CarryOnFree createAddlBaggageInfoTypeCarryOnFree() {
        return new AddlBaggageInfoType.CarryOnFree();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedFree }
     * 
     */
    public AddlBaggageInfoType.CheckedFree createAddlBaggageInfoTypeCheckedFree() {
        return new AddlBaggageInfoType.CheckedFree();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CheckedChargeableBag.Embargo }
     * 
     */
    public AddlBaggageInfoType.CheckedChargeableBag.Embargo createAddlBaggageInfoTypeCheckedChargeableBagEmbargo() {
        return new AddlBaggageInfoType.CheckedChargeableBag.Embargo();
    }

    /**
     * Create an instance of {@link AddlBaggageInfoType.CarryOnChargeableBag.Embargo }
     * 
     */
    public AddlBaggageInfoType.CarryOnChargeableBag.Embargo createAddlBaggageInfoTypeCarryOnChargeableBagEmbargo() {
        return new AddlBaggageInfoType.CarryOnChargeableBag.Embargo();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.Taxes }
     * 
     */
    public CarrierFeeInfoType.Taxes createCarrierFeeInfoTypeTaxes() {
        return new CarrierFeeInfoType.Taxes();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.FeeAmount }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.FeeAmount createCarrierFeeInfoTypeCarrierFeesFeeFeeAmount() {
        return new CarrierFeeInfoType.CarrierFees.Fee.FeeAmount();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.Taxes }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.Taxes createCarrierFeeInfoTypeCarrierFeesFeeTaxes() {
        return new CarrierFeeInfoType.CarrierFees.Fee.Taxes();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.FareComponent }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.FareComponent createCarrierFeeInfoTypeCarrierFeesFeeFareComponent() {
        return new CarrierFeeInfoType.CarrierFees.Fee.FareComponent();
    }

    /**
     * Create an instance of {@link CarrierFeeInfoType.CarrierFees.Fee.AirlineID }
     * 
     */
    public CarrierFeeInfoType.CarrierFees.Fee.AirlineID createCarrierFeeInfoTypeCarrierFeesFeeAirlineID() {
        return new CarrierFeeInfoType.CarrierFees.Fee.AirlineID();
    }

    /**
     * Create an instance of {@link VoucherMethodType.EffectiveExpireDate }
     * 
     */
    public VoucherMethodType.EffectiveExpireDate createVoucherMethodTypeEffectiveExpireDate() {
        return new VoucherMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.MemberNumber }
     * 
     */
    public RedemptionMethodType.MemberNumber createRedemptionMethodTypeMemberNumber() {
        return new RedemptionMethodType.MemberNumber();
    }

    /**
     * Create an instance of {@link RedemptionMethodType.Certificates.CertificateNumber }
     * 
     */
    public RedemptionMethodType.Certificates.CertificateNumber createRedemptionMethodTypeCertificatesCertificateNumber() {
        return new RedemptionMethodType.Certificates.CertificateNumber();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.MaskedCardNumber }
     * 
     */
    public PaymentCardMethodType.MaskedCardNumber createPaymentCardMethodTypeMaskedCardNumber() {
        return new PaymentCardMethodType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardHolderName }
     * 
     */
    public PaymentCardMethodType.CardHolderName createPaymentCardMethodTypeCardHolderName() {
        return new PaymentCardMethodType.CardHolderName();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardIssuerName }
     * 
     */
    public PaymentCardMethodType.CardIssuerName createPaymentCardMethodTypeCardIssuerName() {
        return new PaymentCardMethodType.CardIssuerName();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.CardholderAddress }
     * 
     */
    public PaymentCardMethodType.CardholderAddress createPaymentCardMethodTypeCardholderAddress() {
        return new PaymentCardMethodType.CardholderAddress();
    }

    /**
     * Create an instance of {@link PaymentCardMethodType.EffectiveExpireDate }
     * 
     */
    public PaymentCardMethodType.EffectiveExpireDate createPaymentCardMethodTypeEffectiveExpireDate() {
        return new PaymentCardMethodType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link DirectBillMethodType.Address }
     * 
     */
    public DirectBillMethodType.Address createDirectBillMethodTypeAddress() {
        return new DirectBillMethodType.Address();
    }

    /**
     * Create an instance of {@link CashMethodType.Address }
     * 
     */
    public CashMethodType.Address createCashMethodTypeAddress() {
        return new CashMethodType.Address();
    }

    /**
     * Create an instance of {@link BankAccountMethodType.Name }
     * 
     */
    public BankAccountMethodType.Name createBankAccountMethodTypeName() {
        return new BankAccountMethodType.Name();
    }

    /**
     * Create an instance of {@link SeatLocationType.Characteristics.Characteristic }
     * 
     */
    public SeatLocationType.Characteristics.Characteristic createSeatLocationTypeCharacteristicsCharacteristic() {
        return new SeatLocationType.Characteristics.Characteristic();
    }

    /**
     * Create an instance of {@link SeatLocationType.Row.SeatData }
     * 
     */
    public SeatLocationType.Row.SeatData createSeatLocationTypeRowSeatData() {
        return new SeatLocationType.Row.SeatData();
    }

    /**
     * Create an instance of {@link GenericPriceType.Surcharges }
     * 
     */
    public GenericPriceType.Surcharges createGenericPriceTypeSurcharges() {
        return new GenericPriceType.Surcharges();
    }

    /**
     * Create an instance of {@link GenericPriceType.Fees }
     * 
     */
    public GenericPriceType.Fees createGenericPriceTypeFees() {
        return new GenericPriceType.Fees();
    }

    /**
     * Create an instance of {@link GenericPriceType.Total }
     * 
     */
    public GenericPriceType.Total createGenericPriceTypeTotal() {
        return new GenericPriceType.Total();
    }

    /**
     * Create an instance of {@link BaggageItemType.BagDetails.BagDetail.Price }
     * 
     */
    public BaggageItemType.BagDetails.BagDetail.Price createBaggageItemTypeBagDetailsBagDetailPrice() {
        return new BaggageItemType.BagDetails.BagDetail.Price();
    }

    /**
     * Create an instance of {@link SettlementType.Surcharges }
     * 
     */
    public SettlementType.Surcharges createSettlementTypeSurcharges() {
        return new SettlementType.Surcharges();
    }

    /**
     * Create an instance of {@link SettlementType.Fees }
     * 
     */
    public SettlementType.Fees createSettlementTypeFees() {
        return new SettlementType.Fees();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Passengers }
     * 
     */
    public OrderItemAssociationType.Passengers createOrderItemAssociationTypePassengers() {
        return new OrderItemAssociationType.Passengers();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Flight }
     * 
     */
    public OrderItemAssociationType.Flight createOrderItemAssociationTypeFlight() {
        return new OrderItemAssociationType.Flight();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.OrderItems }
     * 
     */
    public OrderItemAssociationType.OrderItems createOrderItemAssociationTypeOrderItems() {
        return new OrderItemAssociationType.OrderItems();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.OfferItems }
     * 
     */
    public OrderItemAssociationType.OfferItems createOrderItemAssociationTypeOfferItems() {
        return new OrderItemAssociationType.OfferItems();
    }

    /**
     * Create an instance of {@link OrderItemAssociationType.Services }
     * 
     */
    public OrderItemAssociationType.Services createOrderItemAssociationTypeServices() {
        return new OrderItemAssociationType.Services();
    }

    /**
     * Create an instance of {@link TicketByTimeLimitType.TicketBy }
     * 
     */
    public TicketByTimeLimitType.TicketBy createTicketByTimeLimitTypeTicketBy() {
        return new TicketByTimeLimitType.TicketBy();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.PassengerQuantity }
     * 
     */
    public AirlineOffersSnapshotType.PassengerQuantity createAirlineOffersSnapshotTypePassengerQuantity() {
        return new AirlineOffersSnapshotType.PassengerQuantity();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.SubTotal }
     * 
     */
    public AirlineOffersSnapshotType.SubTotal createAirlineOffersSnapshotTypeSubTotal() {
        return new AirlineOffersSnapshotType.SubTotal();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.Highest }
     * 
     */
    public AirlineOffersSnapshotType.Highest createAirlineOffersSnapshotTypeHighest() {
        return new AirlineOffersSnapshotType.Highest();
    }

    /**
     * Create an instance of {@link AirlineOffersSnapshotType.Lowest }
     * 
     */
    public AirlineOffersSnapshotType.Lowest createAirlineOffersSnapshotTypeLowest() {
        return new AirlineOffersSnapshotType.Lowest();
    }

    /**
     * Create an instance of {@link OfferMatchType.MatchResult }
     * 
     */
    public OfferMatchType.MatchResult createOfferMatchTypeMatchResult() {
        return new OfferMatchType.MatchResult();
    }

    /**
     * Create an instance of {@link InvGuaranteeType.InvGuaranteeTimeLimit }
     * 
     */
    public InvGuaranteeType.InvGuaranteeTimeLimit createInvGuaranteeTypeInvGuaranteeTimeLimit() {
        return new InvGuaranteeType.InvGuaranteeTimeLimit();
    }

    /**
     * Create an instance of {@link MediaAssocType.MediaItems }
     * 
     */
    public MediaAssocType.MediaItems createMediaAssocTypeMediaItems() {
        return new MediaAssocType.MediaItems();
    }

    /**
     * Create an instance of {@link OfferAssociationsType.Services.Service }
     * 
     */
    public OfferAssociationsType.Services.Service createOfferAssociationsTypeServicesService() {
        return new OfferAssociationsType.Services.Service();
    }

    /**
     * Create an instance of {@link OtherOfferAssocType.OtherAssociation }
     * 
     */
    public OtherOfferAssocType.OtherAssociation createOtherOfferAssocTypeOtherAssociation() {
        return new OtherOfferAssocType.OtherAssociation();
    }

    /**
     * Create an instance of {@link PassengerMetadataType.NameDetail }
     * 
     */
    public PassengerMetadataType.NameDetail createPassengerMetadataTypeNameDetail() {
        return new PassengerMetadataType.NameDetail();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Associations }
     * 
     */
    public ServiceQualifierPriceType.Associations createServiceQualifierPriceTypeAssociations() {
        return new ServiceQualifierPriceType.Associations();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.Location }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.Location createServiceQualifierPriceTypeFulfillmentLocation() {
        return new ServiceQualifierPriceType.Fulfillment.Location();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start createServiceQualifierPriceTypeFulfillmentOfferValidDatesStart() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start();
    }

    /**
     * Create an instance of {@link ServiceQualifierPriceType.Fulfillment.OfferValidDates.End }
     * 
     */
    public ServiceQualifierPriceType.Fulfillment.OfferValidDates.End createServiceQualifierPriceTypeFulfillmentOfferValidDatesEnd() {
        return new ServiceQualifierPriceType.Fulfillment.OfferValidDates.End();
    }

    /**
     * Create an instance of {@link OrderKeysType.AssociatedIDs.AssociatedID }
     * 
     */
    public OrderKeysType.AssociatedIDs.AssociatedID createOrderKeysTypeAssociatedIDsAssociatedID() {
        return new OrderKeysType.AssociatedIDs.AssociatedID();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.ATPCO }
     * 
     */
    public OfferItemMetadataType.ATPCO createOfferItemMetadataTypeATPCO() {
        return new OfferItemMetadataType.ATPCO();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Incentives }
     * 
     */
    public OfferItemMetadataType.Incentives createOfferItemMetadataTypeIncentives() {
        return new OfferItemMetadataType.Incentives();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Terms }
     * 
     */
    public OfferItemMetadataType.Terms createOfferItemMetadataTypeTerms() {
        return new OfferItemMetadataType.Terms();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.TimeLimits }
     * 
     */
    public OfferItemMetadataType.TimeLimits createOfferItemMetadataTypeTimeLimits() {
        return new OfferItemMetadataType.TimeLimits();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Rule }
     * 
     */
    public OfferItemMetadataType.Rule createOfferItemMetadataTypeRule() {
        return new OfferItemMetadataType.Rule();
    }

    /**
     * Create an instance of {@link OfferItemMetadataType.Matches.Match }
     * 
     */
    public OfferItemMetadataType.Matches.Match createOfferItemMetadataTypeMatchesMatch() {
        return new OfferItemMetadataType.Matches.Match();
    }

    /**
     * Create an instance of {@link BaggageDetailMetadataType.FareTariff }
     * 
     */
    public BaggageDetailMetadataType.FareTariff createBaggageDetailMetadataTypeFareTariff() {
        return new BaggageDetailMetadataType.FareTariff();
    }

    /**
     * Create an instance of {@link RuleMetadataType.RuleID }
     * 
     */
    public RuleMetadataType.RuleID createRuleMetadataTypeRuleID() {
        return new RuleMetadataType.RuleID();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Status }
     * 
     */
    public RuleMetadataType.Status createRuleMetadataTypeStatus() {
        return new RuleMetadataType.Status();
    }

    /**
     * Create an instance of {@link RuleMetadataType.Values.Value.Instruction }
     * 
     */
    public RuleMetadataType.Values.Value.Instruction createRuleMetadataTypeValuesValueInstruction() {
        return new RuleMetadataType.Values.Value.Instruction();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.Surcharge }
     * 
     */
    public PaymentCardMetadataType.Surcharge createPaymentCardMetadataTypeSurcharge() {
        return new PaymentCardMetadataType.Surcharge();
    }

    /**
     * Create an instance of {@link PaymentCardMetadataType.CardFields.FieldName }
     * 
     */
    public PaymentCardMetadataType.CardFields.FieldName createPaymentCardMetadataTypeCardFieldsFieldName() {
        return new PaymentCardMetadataType.CardFields.FieldName();
    }

    /**
     * Create an instance of {@link MediaMetadataType.Dimensions }
     * 
     */
    public MediaMetadataType.Dimensions createMediaMetadataTypeDimensions() {
        return new MediaMetadataType.Dimensions();
    }

    /**
     * Create an instance of {@link MediaMetadataType.MediaSource }
     * 
     */
    public MediaMetadataType.MediaSource createMediaMetadataTypeMediaSource() {
        return new MediaMetadataType.MediaSource();
    }

    /**
     * Create an instance of {@link EquivalentIDMetadataType.EquivID }
     * 
     */
    public EquivalentIDMetadataType.EquivID createEquivalentIDMetadataTypeEquivID() {
        return new EquivalentIDMetadataType.EquivID();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.OtherLanguage }
     * 
     */
    public CodesetMetadataType.OtherLanguage createCodesetMetadataTypeOtherLanguage() {
        return new CodesetMetadataType.OtherLanguage();
    }

    /**
     * Create an instance of {@link CodesetMetadataType.Source.OwnerID }
     * 
     */
    public CodesetMetadataType.Source.OwnerID createCodesetMetadataTypeSourceOwnerID() {
        return new CodesetMetadataType.Source.OwnerID();
    }

    /**
     * Create an instance of {@link AirportMetadataType.Directions }
     * 
     */
    public AirportMetadataType.Directions createAirportMetadataTypeDirections() {
        return new AirportMetadataType.Directions();
    }

    /**
     * Create an instance of {@link AddressMetadataType.AddressFields.FieldName }
     * 
     */
    public AddressMetadataType.AddressFields.FieldName createAddressMetadataTypeAddressFieldsFieldName() {
        return new AddressMetadataType.AddressFields.FieldName();
    }

    /**
     * Create an instance of {@link TotalJourneyType.Distance }
     * 
     */
    public TotalJourneyType.Distance createTotalJourneyTypeDistance() {
        return new TotalJourneyType.Distance();
    }

    /**
     * Create an instance of {@link FlightArrivalType.AirportCode }
     * 
     */
    public FlightArrivalType.AirportCode createFlightArrivalTypeAirportCode() {
        return new FlightArrivalType.AirportCode();
    }

    /**
     * Create an instance of {@link FlightArrivalType.Terminal }
     * 
     */
    public FlightArrivalType.Terminal createFlightArrivalTypeTerminal() {
        return new FlightArrivalType.Terminal();
    }

    /**
     * Create an instance of {@link StopLocationType.StopLocation }
     * 
     */
    public StopLocationType.StopLocation createStopLocationTypeStopLocation() {
        return new StopLocationType.StopLocation();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.Code }
     * 
     */
    public FlightCOSCoreType.Code createFlightCOSCoreTypeCode() {
        return new FlightCOSCoreType.Code();
    }

    /**
     * Create an instance of {@link FlightCOSCoreType.MarketingName }
     * 
     */
    public FlightCOSCoreType.MarketingName createFlightCOSCoreTypeMarketingName() {
        return new FlightCOSCoreType.MarketingName();
    }

    /**
     * Create an instance of {@link FareQualifierType.CompanyIndex }
     * 
     */
    public FareQualifierType.CompanyIndex createFareQualifierTypeCompanyIndex() {
        return new FareQualifierType.CompanyIndex();
    }

    /**
     * Create an instance of {@link FareQualifierType.Contract }
     * 
     */
    public FareQualifierType.Contract createFareQualifierTypeContract() {
        return new FareQualifierType.Contract();
    }

    /**
     * Create an instance of {@link FareQualifierType.Account }
     * 
     */
    public FareQualifierType.Account createFareQualifierTypeAccount() {
        return new FareQualifierType.Account();
    }

    /**
     * Create an instance of {@link FareRulesType.AdvanceStay }
     * 
     */
    public FareRulesType.AdvanceStay createFareRulesTypeAdvanceStay() {
        return new FareRulesType.AdvanceStay();
    }

    /**
     * Create an instance of {@link FareRulesType.Ticketing.Endorsements }
     * 
     */
    public FareRulesType.Ticketing.Endorsements createFareRulesTypeTicketingEndorsements() {
        return new FareRulesType.Ticketing.Endorsements();
    }

    /**
     * Create an instance of {@link FareDetailType.FareIndicatorCode }
     * 
     */
    public FareDetailType.FareIndicatorCode createFareDetailTypeFareIndicatorCode() {
        return new FareDetailType.FareIndicatorCode();
    }

    /**
     * Create an instance of {@link FareDetailType.PassengerRefs }
     * 
     */
    public FareDetailType.PassengerRefs createFareDetailTypePassengerRefs() {
        return new FareDetailType.PassengerRefs();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle.Associations }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle.Associations createListOfServiceBundleTypeServiceBundleAssociations() {
        return new ListOfServiceBundleType.ServiceBundle.Associations();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle.Selection }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle.Selection createListOfServiceBundleTypeServiceBundleSelection() {
        return new ListOfServiceBundleType.ServiceBundle.Selection();
    }

    /**
     * Create an instance of {@link ListOfServiceBundleType.ServiceBundle.BundleID }
     * 
     */
    public ListOfServiceBundleType.ServiceBundle.BundleID createListOfServiceBundleTypeServiceBundleBundleID() {
        return new ListOfServiceBundleType.ServiceBundle.BundleID();
    }

    /**
     * Create an instance of {@link ServiceDetailType.Detail }
     * 
     */
    public ServiceDetailType.Detail createServiceDetailTypeDetail() {
        return new ServiceDetailType.Detail();
    }

    /**
     * Create an instance of {@link ListOfOfferV172PenaltyType.Penalty }
     * 
     */
    public ListOfOfferV172PenaltyType.Penalty createListOfOfferV172PenaltyTypePenalty() {
        return new ListOfOfferV172PenaltyType.Penalty();
    }

    /**
     * Create an instance of {@link ListOfOfferInstructionsType.Instruction }
     * 
     */
    public ListOfOfferInstructionsType.Instruction createListOfOfferInstructionsTypeInstruction() {
        return new ListOfOfferInstructionsType.Instruction();
    }

    /**
     * Create an instance of {@link ListOfMediaType.Media }
     * 
     */
    public ListOfMediaType.Media createListOfMediaTypeMedia() {
        return new ListOfMediaType.Media();
    }

    /**
     * Create an instance of {@link ListOfClassOfServiceType.ServiceClass }
     * 
     */
    public ListOfClassOfServiceType.ServiceClass createListOfClassOfServiceTypeServiceClass() {
        return new ListOfClassOfServiceType.ServiceClass();
    }

    /**
     * Create an instance of {@link FareList.FareGroup.Fare }
     * 
     */
    public FareList.FareGroup.Fare createFareListFareGroupFare() {
        return new FareList.FareGroup.Fare();
    }

    /**
     * Create an instance of {@link FareList.FareGroup.FareBasisCode }
     * 
     */
    public FareList.FareGroup.FareBasisCode createFareListFareGroupFareBasisCode() {
        return new FareList.FareGroup.FareBasisCode();
    }

    /**
     * Create an instance of {@link ListOfV172DisclosureType.Disclosures }
     * 
     */
    public ListOfV172DisclosureType.Disclosures createListOfV172DisclosureTypeDisclosures() {
        return new ListOfV172DisclosureType.Disclosures();
    }

    /**
     * Create an instance of {@link ListOfContentSourceType.ContentSource.OtherID }
     * 
     */
    public ListOfContentSourceType.ContentSource.OtherID createListOfContentSourceTypeContentSourceOtherID() {
        return new ListOfContentSourceType.ContentSource.OtherID();
    }

    /**
     * Create an instance of {@link ListOfBagV172DisclosureType.BagDisclosure }
     * 
     */
    public ListOfBagV172DisclosureType.BagDisclosure createListOfBagV172DisclosureTypeBagDisclosure() {
        return new ListOfBagV172DisclosureType.BagDisclosure();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Results.TaxExemption.RuleID }
     * 
     */
    public TaxExemptionNoticeType.Results.TaxExemption.RuleID createTaxExemptionNoticeTypeResultsTaxExemptionRuleID() {
        return new TaxExemptionNoticeType.Results.TaxExemption.RuleID();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.Countries }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.Countries createTaxExemptionNoticeTypeQueryNamedCountries() {
        return new TaxExemptionNoticeType.Query.Named.Countries();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.Entities }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.Entities createTaxExemptionNoticeTypeQueryNamedEntities() {
        return new TaxExemptionNoticeType.Query.Named.Entities();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.Territories }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.Territories createTaxExemptionNoticeTypeQueryNamedTerritories() {
        return new TaxExemptionNoticeType.Query.Named.Territories();
    }

    /**
     * Create an instance of {@link TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode }
     * 
     */
    public TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode createTaxExemptionNoticeTypeQueryNamedTaxCodesTaxCode() {
        return new TaxExemptionNoticeType.Query.Named.TaxCodes.TaxCode();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Query }
     * 
     */
    public ServiceFilterNoticeType.Query createServiceFilterNoticeTypeQuery() {
        return new ServiceFilterNoticeType.Query();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociationsOfferPriceClass() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.PriceClass();
    }

    /**
     * Create an instance of {@link ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation }
     * 
     */
    public ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation createServiceFilterNoticeTypeResultsAppliedFiltersAppliedFilterAssociationsOfferOtherAssociation() {
        return new ServiceFilterNoticeType.Results.AppliedFilters.AppliedFilter.Associations.Offer.OtherAssociation();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType.Query }
     * 
     */
    public PricingParametersNoticeType.Query createPricingParametersNoticeTypeQuery() {
        return new PricingParametersNoticeType.Query();
    }

    /**
     * Create an instance of {@link PricingParametersNoticeType.Results }
     * 
     */
    public PricingParametersNoticeType.Results createPricingParametersNoticeTypeResults() {
        return new PricingParametersNoticeType.Results();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID createPriceVarianceRuleNoticeTypeResultsPriceVarianceRuleID() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance.RuleID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Results.PriceVariance.Amount }
     * 
     */
    public PriceVarianceRuleNoticeType.Results.PriceVariance.Amount createPriceVarianceRuleNoticeTypeResultsPriceVarianceAmount() {
        return new PriceVarianceRuleNoticeType.Results.PriceVariance.Amount();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleRuleID() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleID();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleAcceptableVariance() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.AcceptableVariance();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleName() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Name();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleRuleValid() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.RuleValid();
    }

    /**
     * Create an instance of {@link PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies }
     * 
     */
    public PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies createPriceVarianceRuleNoticeTypeQueryPriceVarianceRuleCurrencies() {
        return new PriceVarianceRuleNoticeType.Query.PriceVarianceRule.Currencies();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Query }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Query createPaymentRulesNoticeTypeFormOfPaymentQuery() {
        return new PaymentRulesNoticeType.FormOfPayment.Query();
    }

    /**
     * Create an instance of {@link PaymentRulesNoticeType.FormOfPayment.Results }
     * 
     */
    public PaymentRulesNoticeType.FormOfPayment.Results createPaymentRulesNoticeTypeFormOfPaymentResults() {
        return new PaymentRulesNoticeType.FormOfPayment.Results();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Query }
     * 
     */
    public InvGuaranteeNoticeType.Query createInvGuaranteeNoticeTypeQuery() {
        return new InvGuaranteeNoticeType.Query();
    }

    /**
     * Create an instance of {@link InvGuaranteeNoticeType.Results.InventoryGuarantee }
     * 
     */
    public InvGuaranteeNoticeType.Results.InventoryGuarantee createInvGuaranteeNoticeTypeResultsInventoryGuarantee() {
        return new InvGuaranteeNoticeType.Results.InventoryGuarantee();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.StopLocations.StopLocation }
     * 
     */
    public SecurePaymentPaxInfoType.StopLocations.StopLocation createSecurePaymentPaxInfoTypeStopLocationsStopLocation() {
        return new SecurePaymentPaxInfoType.StopLocations.StopLocation();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.DateTimes.DateTime }
     * 
     */
    public SecurePaymentPaxInfoType.DateTimes.DateTime createSecurePaymentPaxInfoTypeDateTimesDateTime() {
        return new SecurePaymentPaxInfoType.DateTimes.DateTime();
    }

    /**
     * Create an instance of {@link SecurePaymentPaxInfoType.Carriers.Carrier }
     * 
     */
    public SecurePaymentPaxInfoType.Carriers.Carrier createSecurePaymentPaxInfoTypeCarriersCarrier() {
        return new SecurePaymentPaxInfoType.Carriers.Carrier();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.PayerAuth }
     * 
     */
    public SecurePaymentAlertType.PayerAuth createSecurePaymentAlertTypePayerAuth() {
        return new SecurePaymentAlertType.PayerAuth();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.TransactionType }
     * 
     */
    public SecurePaymentAlertType.TransactionType createSecurePaymentAlertTypeTransactionType() {
        return new SecurePaymentAlertType.TransactionType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.EnrollmentStatus }
     * 
     */
    public SecurePaymentAlertType.EnrollmentStatus createSecurePaymentAlertTypeEnrollmentStatus() {
        return new SecurePaymentAlertType.EnrollmentStatus();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.URLs }
     * 
     */
    public SecurePaymentAlertType.URLs createSecurePaymentAlertTypeURLs() {
        return new SecurePaymentAlertType.URLs();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification createSecurePaymentAlertTypeProcessingInfosProcessingInfoAddrVerification() {
        return new SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.AddrVerification();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus }
     * 
     */
    public SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus createSecurePaymentAlertTypeProcessingInfosProcessingInfoCustomerAuthStatus() {
        return new SecurePaymentAlertType.ProcessingInfos.ProcessingInfo.CustomerAuthStatus();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.ClientType }
     * 
     */
    public SecurePaymentAlertType.Details.ClientType createSecurePaymentAlertTypeDetailsClientType() {
        return new SecurePaymentAlertType.Details.ClientType();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.CustomerDevice }
     * 
     */
    public SecurePaymentAlertType.Details.CustomerDevice createSecurePaymentAlertTypeDetailsCustomerDevice() {
        return new SecurePaymentAlertType.Details.CustomerDevice();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.Currency }
     * 
     */
    public SecurePaymentAlertType.Details.Currency createSecurePaymentAlertTypeDetailsCurrency() {
        return new SecurePaymentAlertType.Details.Currency();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Details.TxnDatas }
     * 
     */
    public SecurePaymentAlertType.Details.TxnDatas createSecurePaymentAlertTypeDetailsTxnDatas() {
        return new SecurePaymentAlertType.Details.TxnDatas();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference.OriginalTransactionID }
     * 
     */
    public SecurePaymentAlertType.Reference.OriginalTransactionID createSecurePaymentAlertTypeReferenceOriginalTransactionID() {
        return new SecurePaymentAlertType.Reference.OriginalTransactionID();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Reference.TxnDatas }
     * 
     */
    public SecurePaymentAlertType.Reference.TxnDatas createSecurePaymentAlertTypeReferenceTxnDatas() {
        return new SecurePaymentAlertType.Reference.TxnDatas();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.ID }
     * 
     */
    public SecurePaymentAlertType.Airline.ID createSecurePaymentAlertTypeAirlineID() {
        return new SecurePaymentAlertType.Airline.ID();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.Name }
     * 
     */
    public SecurePaymentAlertType.Airline.Name createSecurePaymentAlertTypeAirlineName() {
        return new SecurePaymentAlertType.Airline.Name();
    }

    /**
     * Create an instance of {@link SecurePaymentAlertType.Airline.CountryCode }
     * 
     */
    public SecurePaymentAlertType.Airline.CountryCode createSecurePaymentAlertTypeAirlineCountryCode() {
        return new SecurePaymentAlertType.Airline.CountryCode();
    }

    /**
     * Create an instance of {@link PINAuthTravelerType.AuthRequest }
     * 
     */
    public PINAuthTravelerType.AuthRequest createPINAuthTravelerTypeAuthRequest() {
        return new PINAuthTravelerType.AuthRequest();
    }

    /**
     * Create an instance of {@link InvDiscrepencyAlertType.AlternateOffers.AlternateOffer }
     * 
     */
    public InvDiscrepencyAlertType.AlternateOffers.AlternateOffer createInvDiscrepencyAlertTypeAlternateOffersAlternateOffer() {
        return new InvDiscrepencyAlertType.AlternateOffers.AlternateOffer();
    }

    /**
     * Create an instance of {@link AlertsType.Alert }
     * 
     */
    public AlertsType.Alert createAlertsTypeAlert() {
        return new AlertsType.Alert();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Sender }
     * 
     */
    public MsgPartiesType.Sender createMsgPartiesTypeSender() {
        return new MsgPartiesType.Sender();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Recipient }
     * 
     */
    public MsgPartiesType.Recipient createMsgPartiesTypeRecipient() {
        return new MsgPartiesType.Recipient();
    }

    /**
     * Create an instance of {@link MsgPartiesType.Participants.Participant }
     * 
     */
    public MsgPartiesType.Participants.Participant createMsgPartiesTypeParticipantsParticipant() {
        return new MsgPartiesType.Participants.Participant();
    }

    /**
     * Create an instance of {@link PointOfSaleType.Location }
     * 
     */
    public PointOfSaleType.Location createPointOfSaleTypeLocation() {
        return new PointOfSaleType.Location();
    }

    /**
     * Create an instance of {@link PointOfSaleType.RequestTime }
     * 
     */
    public PointOfSaleType.RequestTime createPointOfSaleTypeRequestTime() {
        return new PointOfSaleType.RequestTime();
    }

    /**
     * Create an instance of {@link PointOfSaleType.TouchPoint.Device }
     * 
     */
    public PointOfSaleType.TouchPoint.Device createPointOfSaleTypeTouchPointDevice() {
        return new PointOfSaleType.TouchPoint.Device();
    }

    /**
     * Create an instance of {@link PolicyAugmentationType.Policy }
     * 
     */
    public PolicyAugmentationType.Policy createPolicyAugmentationTypePolicy() {
        return new PolicyAugmentationType.Policy();
    }

    /**
     * Create an instance of {@link PolicyDefaultType.Policy }
     * 
     */
    public PolicyDefaultType.Policy createPolicyDefaultTypePolicy() {
        return new PolicyDefaultType.Policy();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Surname }
     * 
     */
    public PrimaryContact.Name.Surname createPrimaryContactNameSurname() {
        return new PrimaryContact.Name.Surname();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Given }
     * 
     */
    public PrimaryContact.Name.Given createPrimaryContactNameGiven() {
        return new PrimaryContact.Name.Given();
    }

    /**
     * Create an instance of {@link PrimaryContact.Name.Middle }
     * 
     */
    public PrimaryContact.Name.Middle createPrimaryContactNameMiddle() {
        return new PrimaryContact.Name.Middle();
    }

    /**
     * Create an instance of {@link BilateralTimeLimitsType.BilateralTimeLimit }
     * 
     */
    public BilateralTimeLimitsType.BilateralTimeLimit createBilateralTimeLimitsTypeBilateralTimeLimit() {
        return new BilateralTimeLimitsType.BilateralTimeLimit();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Total }
     * 
     */
    public TaxExemptionType.Total createTaxExemptionTypeTotal() {
        return new TaxExemptionType.Total();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Entities }
     * 
     */
    public TaxExemptionType.Entities createTaxExemptionTypeEntities() {
        return new TaxExemptionType.Entities();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Territories }
     * 
     */
    public TaxExemptionType.Territories createTaxExemptionTypeTerritories() {
        return new TaxExemptionType.Territories();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Countries }
     * 
     */
    public TaxExemptionType.Countries createTaxExemptionTypeCountries() {
        return new TaxExemptionType.Countries();
    }

    /**
     * Create an instance of {@link TaxExemptionType.Tax }
     * 
     */
    public TaxExemptionType.Tax createTaxExemptionTypeTax() {
        return new TaxExemptionType.Tax();
    }

    /**
     * Create an instance of {@link ShoppingResponseIDType.ResponseID }
     * 
     */
    public ShoppingResponseIDType.ResponseID createShoppingResponseIDTypeResponseID() {
        return new ShoppingResponseIDType.ResponseID();
    }

    /**
     * Create an instance of {@link CombinationPriceType.Partial.Currency }
     * 
     */
    public CombinationPriceType.Partial.Currency createCombinationPriceTypePartialCurrency() {
        return new CombinationPriceType.Partial.Currency();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Taxes }
     * 
     */
    public DetailCurrencyPriceType.Taxes createDetailCurrencyPriceTypeTaxes() {
        return new DetailCurrencyPriceType.Taxes();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Fees }
     * 
     */
    public DetailCurrencyPriceType.Fees createDetailCurrencyPriceTypeFees() {
        return new DetailCurrencyPriceType.Fees();
    }

    /**
     * Create an instance of {@link DetailCurrencyPriceType.Details.Detail }
     * 
     */
    public DetailCurrencyPriceType.Details.Detail createDetailCurrencyPriceTypeDetailsDetail() {
        return new DetailCurrencyPriceType.Details.Detail();
    }

    /**
     * Create an instance of {@link Voucher.Name.Surname }
     * 
     */
    public Voucher.Name.Surname createVoucherNameSurname() {
        return new Voucher.Name.Surname();
    }

    /**
     * Create an instance of {@link Voucher.Name.Given }
     * 
     */
    public Voucher.Name.Given createVoucherNameGiven() {
        return new Voucher.Name.Given();
    }

    /**
     * Create an instance of {@link Voucher.Name.Middle }
     * 
     */
    public Voucher.Name.Middle createVoucherNameMiddle() {
        return new Voucher.Name.Middle();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.CardNumber }
     * 
     */
    public V172PaymentCardType.CardNumber createV172PaymentCardTypeCardNumber() {
        return new V172PaymentCardType.CardNumber();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.SeriesCode }
     * 
     */
    public V172PaymentCardType.SeriesCode createV172PaymentCardTypeSeriesCode() {
        return new V172PaymentCardType.SeriesCode();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.CardHolderName }
     * 
     */
    public V172PaymentCardType.CardHolderName createV172PaymentCardTypeCardHolderName() {
        return new V172PaymentCardType.CardHolderName();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.CardIssuerName }
     * 
     */
    public V172PaymentCardType.CardIssuerName createV172PaymentCardTypeCardIssuerName() {
        return new V172PaymentCardType.CardIssuerName();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.CardHolderBillingAddress }
     * 
     */
    public V172PaymentCardType.CardHolderBillingAddress createV172PaymentCardTypeCardHolderBillingAddress() {
        return new V172PaymentCardType.CardHolderBillingAddress();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.MaskedCardNumber }
     * 
     */
    public V172PaymentCardType.MaskedCardNumber createV172PaymentCardTypeMaskedCardNumber() {
        return new V172PaymentCardType.MaskedCardNumber();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.Surcharge }
     * 
     */
    public V172PaymentCardType.Surcharge createV172PaymentCardTypeSurcharge() {
        return new V172PaymentCardType.Surcharge();
    }

    /**
     * Create an instance of {@link V172PaymentCardType.EffectiveExpireDate }
     * 
     */
    public V172PaymentCardType.EffectiveExpireDate createV172PaymentCardTypeEffectiveExpireDate() {
        return new V172PaymentCardType.EffectiveExpireDate();
    }

    /**
     * Create an instance of {@link LoyaltyRedemption.Certificates.CertificateNumber }
     * 
     */
    public LoyaltyRedemption.Certificates.CertificateNumber createLoyaltyRedemptionCertificatesCertificateNumber() {
        return new LoyaltyRedemption.Certificates.CertificateNumber();
    }

    /**
     * Create an instance of {@link V172DirectBillType.Address }
     * 
     */
    public V172DirectBillType.Address createV172DirectBillTypeAddress() {
        return new V172DirectBillType.Address();
    }

    /**
     * Create an instance of {@link V172BankAccountType.Name }
     * 
     */
    public V172BankAccountType.Name createV172BankAccountTypeName() {
        return new V172BankAccountType.Name();
    }

    /**
     * Create an instance of {@link V172BankAccountType.BankID }
     * 
     */
    public V172BankAccountType.BankID createV172BankAccountTypeBankID() {
        return new V172BankAccountType.BankID();
    }

    /**
     * Create an instance of {@link V172BankAccountType.AccountNumber }
     * 
     */
    public V172BankAccountType.AccountNumber createV172BankAccountTypeAccountNumber() {
        return new V172BankAccountType.AccountNumber();
    }

    /**
     * Create an instance of {@link DirectionsType.Text }
     * 
     */
    public DirectionsType.Text createDirectionsTypeText() {
        return new DirectionsType.Text();
    }

    /**
     * Create an instance of {@link V172PhoneType.Number }
     * 
     */
    public V172PhoneType.Number createV172PhoneTypeNumber() {
        return new V172PhoneType.Number();
    }

    /**
     * Create an instance of {@link EmailType.Address }
     * 
     */
    public EmailType.Address createEmailTypeAddress() {
        return new EmailType.Address();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name.Surname }
     * 
     */
    public Contacts.Contact.Name.Surname createContactsContactNameSurname() {
        return new Contacts.Contact.Name.Surname();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name.Given }
     * 
     */
    public Contacts.Contact.Name.Given createContactsContactNameGiven() {
        return new Contacts.Contact.Name.Given();
    }

    /**
     * Create an instance of {@link Contacts.Contact.Name.Middle }
     * 
     */
    public Contacts.Contact.Name.Middle createContactsContactNameMiddle() {
        return new Contacts.Contact.Name.Middle();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MaxLinear }
     * 
     */
    public BagAllowanceDimensionType.MaxLinear createBagAllowanceDimensionTypeMaxLinear() {
        return new BagAllowanceDimensionType.MaxLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.MinLinear }
     * 
     */
    public BagAllowanceDimensionType.MinLinear createBagAllowanceDimensionTypeMinLinear() {
        return new BagAllowanceDimensionType.MinLinear();
    }

    /**
     * Create an instance of {@link BagAllowanceDimensionType.Dimensions }
     * 
     */
    public BagAllowanceDimensionType.Dimensions createBagAllowanceDimensionTypeDimensions() {
        return new BagAllowanceDimensionType.Dimensions();
    }

    /**
     * Create an instance of {@link AttributesType.Group }
     * 
     */
    public AttributesType.Group createAttributesTypeGroup() {
        return new AttributesType.Group();
    }

    /**
     * Create an instance of {@link AttributesType.SubGroup }
     * 
     */
    public AttributesType.SubGroup createAttributesTypeSubGroup() {
        return new AttributesType.SubGroup();
    }

    /**
     * Create an instance of {@link AttributesType.Desc1 }
     * 
     */
    public AttributesType.Desc1 createAttributesTypeDesc1() {
        return new AttributesType.Desc1();
    }

    /**
     * Create an instance of {@link AttributesType.Desc2 }
     * 
     */
    public AttributesType.Desc2 createAttributesTypeDesc2() {
        return new AttributesType.Desc2();
    }

    /**
     * Create an instance of {@link PaymentAddrType.City }
     * 
     */
    public PaymentAddrType.City createPaymentAddrTypeCity() {
        return new PaymentAddrType.City();
    }

    /**
     * Create an instance of {@link AddressCoreType.Address }
     * 
     */
    public AddressCoreType.Address createAddressCoreTypeAddress() {
        return new AddressCoreType.Address();
    }

    /**
     * Create an instance of {@link AddressDetailType.Directions }
     * 
     */
    public AddressDetailType.Directions createAddressDetailTypeDirections() {
        return new AddressDetailType.Directions();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AugPointInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AugPointInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AugmentationPoint")
    public JAXBElement<AugPointInfoType> createAugmentationPoint(AugPointInfoType value) {
        return new JAXBElement<AugPointInfoType>(_AugmentationPoint_QNAME, AugPointInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonthRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Month")
    public JAXBElement<MonthRepType> createMonth(MonthRepType value) {
        return new JAXBElement<MonthRepType>(_Month_QNAME, MonthRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatePeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DatePeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DatePeriod")
    public JAXBElement<DatePeriodRepType> createDatePeriod(DatePeriodRepType value) {
        return new JAXBElement<DatePeriodRepType>(_DatePeriod_QNAME, DatePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DateTimePeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DateTimePeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DateTimePeriod")
    public JAXBElement<DateTimePeriodRepType> createDateTimePeriod(DateTimePeriodRepType value) {
        return new JAXBElement<DateTimePeriodRepType>(_DateTimePeriod_QNAME, DateTimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DayPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DayPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DayPeriod")
    public JAXBElement<DayPeriodRepType> createDayPeriod(DayPeriodRepType value) {
        return new JAXBElement<DayPeriodRepType>(_DayPeriod_QNAME, DayPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonthPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonthPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MonthPeriod")
    public JAXBElement<MonthPeriodRepType> createMonthPeriod(MonthPeriodRepType value) {
        return new JAXBElement<MonthPeriodRepType>(_MonthPeriod_QNAME, MonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QuarterPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QuarterPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "QuarterPeriod")
    public JAXBElement<QuarterPeriodRepType> createQuarterPeriod(QuarterPeriodRepType value) {
        return new JAXBElement<QuarterPeriodRepType>(_QuarterPeriod_QNAME, QuarterPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TimePeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TimePeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TimePeriod")
    public JAXBElement<TimePeriodRepType> createTimePeriod(TimePeriodRepType value) {
        return new JAXBElement<TimePeriodRepType>(_TimePeriod_QNAME, TimePeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link YearPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "YearPeriod")
    public JAXBElement<YearPeriodRepType> createYearPeriod(YearPeriodRepType value) {
        return new JAXBElement<YearPeriodRepType>(_YearPeriod_QNAME, YearPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodRepType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link YearMonthPeriodRepType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "YearMonthPeriod")
    public JAXBElement<YearMonthPeriodRepType> createYearMonthPeriod(YearMonthPeriodRepType value) {
        return new JAXBElement<YearMonthPeriodRepType>(_YearMonthPeriod_QNAME, YearMonthPeriodRepType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressCoreType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressCoreType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AddressCore")
    public JAXBElement<AddressCoreType> createAddressCore(AddressCoreType value) {
        return new JAXBElement<AddressCoreType>(_AddressCore_QNAME, AddressCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressDetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressDetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AddressDetail")
    public JAXBElement<AddressDetailType> createAddressDetail(AddressDetailType value) {
        return new JAXBElement<AddressDetailType>(_AddressDetail_QNAME, AddressDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentAddrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentAddrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentAddress")
    public JAXBElement<PaymentAddrType> createPaymentAddress(PaymentAddrType value) {
        return new JAXBElement<PaymentAddrType>(_PaymentAddress_QNAME, PaymentAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleAddrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimpleAddrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SimpleAddress")
    public JAXBElement<SimpleAddrType> createSimpleAddress(SimpleAddrType value) {
        return new JAXBElement<SimpleAddrType>(_SimpleAddress_QNAME, SimpleAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StructuredAddrType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StructuredAddrType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StructuredAddress")
    public JAXBElement<StructuredAddrType> createStructuredAddress(StructuredAddrType value) {
        return new JAXBElement<StructuredAddrType>(_StructuredAddress_QNAME, StructuredAddrType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AttributesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AttributesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Attributes")
    public JAXBElement<AttributesType> createAttributes(AttributesType value) {
        return new JAXBElement<AttributesType>(_Attributes_QNAME, AttributesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDescType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BagAllowanceDescType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AllowanceDescription")
    public JAXBElement<BagAllowanceDescType> createAllowanceDescription(BagAllowanceDescType value) {
        return new JAXBElement<BagAllowanceDescType>(_AllowanceDescription_QNAME, BagAllowanceDescType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BagAllowanceDimensionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BagAllowanceDimensionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DimensionAllowance")
    public JAXBElement<BagAllowanceDimensionType> createDimensionAllowance(BagAllowanceDimensionType value) {
        return new JAXBElement<BagAllowanceDimensionType>(_DimensionAllowance_QNAME, BagAllowanceDimensionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CityName")
    public JAXBElement<String> createCityName(String value) {
        return new JAXBElement<String>(_CityName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressContactType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressContactType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AddressContact")
    public JAXBElement<AddressContactType> createAddressContact(AddressContactType value) {
        return new JAXBElement<AddressContactType>(_AddressContact_QNAME, AddressContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EmailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EmailContact")
    public JAXBElement<EmailType> createEmailContact(EmailType value) {
        return new JAXBElement<EmailType>(_EmailContact_QNAME, EmailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PhoneContactType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PhoneContactType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PhoneContact")
    public JAXBElement<PhoneContactType> createPhoneContact(PhoneContactType value) {
        return new JAXBElement<PhoneContactType>(_PhoneContact_QNAME, PhoneContactType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link V172PhoneType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link V172PhoneType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PhoneNumber")
    public JAXBElement<V172PhoneType> createPhoneNumber(V172PhoneType value) {
        return new JAXBElement<V172PhoneType>(_PhoneNumber_QNAME, V172PhoneType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherContactMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherContactMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OtherContactMethod")
    public JAXBElement<OtherContactMethodType> createOtherContactMethod(OtherContactMethodType value) {
        return new JAXBElement<OtherContactMethodType>(_OtherContactMethod_QNAME, OtherContactMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link V172CommissionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link V172CommissionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Commission")
    public JAXBElement<V172CommissionType> createCommission(V172CommissionType value) {
        return new JAXBElement<V172CommissionType>(_Commission_QNAME, V172CommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CurrencyAmount")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountEncodedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountEncodedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EncodedCurrencyAmount")
    public JAXBElement<CurrencyAmountEncodedType> createEncodedCurrencyAmount(CurrencyAmountEncodedType value) {
        return new JAXBElement<CurrencyAmountEncodedType>(_EncodedCurrencyAmount_QNAME, CurrencyAmountEncodedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OriginDestinationReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOriginDestinationReference(String value) {
        return new JAXBElement<String>(_OriginDestinationReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DescriptionReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createDescriptionReferences(String value) {
        return new JAXBElement<String>(_DescriptionReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Direction")
    public JAXBElement<DirectionsType> createDirection(DirectionsType value) {
        return new JAXBElement<DirectionsType>(_Direction_QNAME, DirectionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DiscountAmount")
    public JAXBElement<CurrencyAmountOptType> createDiscountAmount(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_DiscountAmount_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DiscountPercent")
    public JAXBElement<Integer> createDiscountPercent(Integer value) {
        return new JAXBElement<Integer>(_DiscountPercent_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "InstantPurchase")
    public JAXBElement<String> createInstantPurchase(String value) {
        return new JAXBElement<String>(_InstantPurchase_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanguageCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "LanguageCode")
    public JAXBElement<LanguageCodeType> createLanguageCode(LanguageCodeType value) {
        return new JAXBElement<LanguageCodeType>(_LanguageCode_QNAME, LanguageCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodePathType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NodePathType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "NodePath")
    public JAXBElement<NodePathType> createNodePath(NodePathType value) {
        return new JAXBElement<NodePathType>(_NodePath_QNAME, NodePathType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link V172BankAccountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link V172BankAccountType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BankAccount")
    public JAXBElement<V172BankAccountType> createBankAccount(V172BankAccountType value) {
        return new JAXBElement<V172BankAccountType>(_BankAccount_QNAME, V172BankAccountType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link V172DirectBillType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link V172DirectBillType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DirectBill")
    public JAXBElement<V172DirectBillType> createDirectBill(V172DirectBillType value) {
        return new JAXBElement<V172DirectBillType>(_DirectBill_QNAME, V172DirectBillType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link V172RemarkType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link V172RemarkType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Remarks")
    public JAXBElement<V172RemarkType> createRemarks(V172RemarkType value) {
        return new JAXBElement<V172RemarkType>(_Remarks_QNAME, V172RemarkType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link V172PaymentCardType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link V172PaymentCardType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentCard")
    public JAXBElement<V172PaymentCardType> createPaymentCard(V172PaymentCardType value) {
        return new JAXBElement<V172PaymentCardType>(_PaymentCard_QNAME, V172PaymentCardType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyDetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PenaltyDetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Penalty")
    public JAXBElement<PenaltyDetailType> createPenalty(PenaltyDetailType value) {
        return new JAXBElement<PenaltyDetailType>(_Penalty_QNAME, PenaltyDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailCurrencyPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DetailCurrencyPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DetailCurrencyPrice")
    public JAXBElement<DetailCurrencyPriceType> createDetailCurrencyPrice(DetailCurrencyPriceType value) {
        return new JAXBElement<DetailCurrencyPriceType>(_DetailCurrencyPrice_QNAME, DetailCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AwardPriceUnitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AwardPriceUnitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AwardPricing")
    public JAXBElement<AwardPriceUnitType> createAwardPricing(AwardPriceUnitType value) {
        return new JAXBElement<AwardPriceUnitType>(_AwardPricing_QNAME, AwardPriceUnitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CombinationPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CombinationPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CombinationPricing")
    public JAXBElement<CombinationPriceType> createCombinationPricing(CombinationPriceType value) {
        return new JAXBElement<CombinationPriceType>(_CombinationPricing_QNAME, CombinationPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EncodedPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EncodedPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EncodedCurrencyPrice")
    public JAXBElement<EncodedPriceType> createEncodedCurrencyPrice(EncodedPriceType value) {
        return new JAXBElement<EncodedPriceType>(_EncodedCurrencyPrice_QNAME, EncodedPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SimpleCurrencyPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SimpleCurrencyPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SimpleCurrencyPrice")
    public JAXBElement<SimpleCurrencyPriceType> createSimpleCurrencyPrice(SimpleCurrencyPriceType value) {
        return new JAXBElement<SimpleCurrencyPriceType>(_SimpleCurrencyPrice_QNAME, SimpleCurrencyPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CurrencyAmountOptType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CurrencyAmountValue")
    public JAXBElement<CurrencyAmountOptType> createCurrencyAmountValue(CurrencyAmountOptType value) {
        return new JAXBElement<CurrencyAmountOptType>(_CurrencyAmountValue_QNAME, CurrencyAmountOptType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PercentageValue")
    public JAXBElement<BigDecimal> createPercentageValue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PercentageValue_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShoppingResponseIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ShoppingResponseIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ShoppingResponseID")
    public JAXBElement<ShoppingResponseIDType> createShoppingResponseID(ShoppingResponseIDType value) {
        return new JAXBElement<ShoppingResponseIDType>(_ShoppingResponseID_QNAME, ShoppingResponseIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxExemptionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TaxExemption")
    public JAXBElement<TaxExemptionType> createTaxExemption(TaxExemptionType value) {
        return new JAXBElement<TaxExemptionType>(_TaxExemption_QNAME, TaxExemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TicketDesignatorType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TicketDesig")
    public JAXBElement<TicketDesignatorType> createTicketDesig(TicketDesignatorType value) {
        return new JAXBElement<TicketDesignatorType>(_TicketDesig_QNAME, TicketDesignatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BilateralTimeLimitsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BilateralTimeLimitsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BilateralTimeLimits")
    public JAXBElement<BilateralTimeLimitsType> createBilateralTimeLimits(BilateralTimeLimitsType value) {
        return new JAXBElement<BilateralTimeLimitsType>(_BilateralTimeLimits_QNAME, BilateralTimeLimitsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTimeLimitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentTimeLimitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentTimeLimit")
    public JAXBElement<PaymentTimeLimitType> createPaymentTimeLimit(PaymentTimeLimitType value) {
        return new JAXBElement<PaymentTimeLimitType>(_PaymentTimeLimit_QNAME, PaymentTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceGuaranteeTimeLimitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceGuaranteeTimeLimitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PriceGuaranteeTimeLimits")
    public JAXBElement<PriceGuaranteeTimeLimitType> createPriceGuaranteeTimeLimits(PriceGuaranteeTimeLimitType value) {
        return new JAXBElement<PriceGuaranteeTimeLimitType>(_PriceGuaranteeTimeLimits_QNAME, PriceGuaranteeTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailerIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetailerIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RetailerID")
    public JAXBElement<RetailerIDType> createRetailerID(RetailerIDType value) {
        return new JAXBElement<RetailerIDType>(_RetailerID_QNAME, RetailerIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarketingCarrierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MarketingCarrierAirline")
    public JAXBElement<MarketingCarrierType> createMarketingCarrierAirline(MarketingCarrierType value) {
        return new JAXBElement<MarketingCarrierType>(_MarketingCarrierAirline_QNAME, MarketingCarrierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ValidatingCarrier")
    public JAXBElement<String> createValidatingCarrier(String value) {
        return new JAXBElement<String>(_ValidatingCarrier_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggregatorIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AggregatorID")
    public JAXBElement<AggregatorIDType> createAggregatorID(AggregatorIDType value) {
        return new JAXBElement<AggregatorIDType>(_AggregatorID_QNAME, AggregatorIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RoleOfIntermediaryReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RoleOfIntermediaryReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RoleOfIntermediaryReference")
    public JAXBElement<RoleOfIntermediaryReferenceType> createRoleOfIntermediaryReference(RoleOfIntermediaryReferenceType value) {
        return new JAXBElement<RoleOfIntermediaryReferenceType>(_RoleOfIntermediaryReference_QNAME, RoleOfIntermediaryReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SystemIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SystemID")
    public JAXBElement<SystemIDType> createSystemID(SystemIDType value) {
        return new JAXBElement<SystemIDType>(_SystemID_QNAME, SystemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgentUserType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AgentUser")
    public JAXBElement<AgentUserType> createAgentUser(AgentUserType value) {
        return new JAXBElement<AgentUserType>(_AgentUser_QNAME, AgentUserType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgencyIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AgencyID")
    public JAXBElement<AgencyIDType> createAgencyID(AgencyIDType value) {
        return new JAXBElement<AgencyIDType>(_AgencyID_QNAME, AgencyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgentUserIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AgentUserID")
    public JAXBElement<AgentUserIDType> createAgentUserID(AgentUserIDType value) {
        return new JAXBElement<AgentUserIDType>(_AgentUserID_QNAME, AgentUserIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnerCompanyIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PartnerCompanyIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PartnerID")
    public JAXBElement<PartnerCompanyIDType> createPartnerID(PartnerCompanyIDType value) {
        return new JAXBElement<PartnerCompanyIDType>(_PartnerID_QNAME, PartnerCompanyIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgDocumentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgDocumentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Document")
    public JAXBElement<MsgDocumentType> createDocument(MsgDocumentType value) {
        return new JAXBElement<MsgDocumentType>(_Document_QNAME, MsgDocumentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyDefaultType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyDefaultType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DefaultPolicy")
    public JAXBElement<PolicyDefaultType> createDefaultPolicy(PolicyDefaultType value) {
        return new JAXBElement<PolicyDefaultType>(_DefaultPolicy_QNAME, PolicyDefaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PolicyAugmentationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PolicyAugmentationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PolicyAugmentation")
    public JAXBElement<PolicyAugmentationType> createPolicyAugmentation(PolicyAugmentationType value) {
        return new JAXBElement<PolicyAugmentationType>(_PolicyAugmentation_QNAME, PolicyAugmentationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PolicyLink")
    public JAXBElement<String> createPolicyLink(String value) {
        return new JAXBElement<String>(_PolicyLink_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PointOfSaleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PointOfSaleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PointOfSale")
    public JAXBElement<PointOfSaleType> createPointOfSale(PointOfSaleType value) {
        return new JAXBElement<PointOfSaleType>(_PointOfSale_QNAME, PointOfSaleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgPartiesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Party")
    public JAXBElement<MsgPartiesType> createParty(MsgPartiesType value) {
        return new JAXBElement<MsgPartiesType>(_Party_QNAME, MsgPartiesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ORAAirlineSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ORA_Sender")
    public JAXBElement<ORAAirlineSenderType> createORASender(ORAAirlineSenderType value) {
        return new JAXBElement<ORAAirlineSenderType>(_ORASender_QNAME, ORAAirlineSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link POAAirlineSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "POA_Sender")
    public JAXBElement<POAAirlineSenderType> createPOASender(POAAirlineSenderType value) {
        return new JAXBElement<POAAirlineSenderType>(_POASender_QNAME, POAAirlineSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggregatorSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AggregatorSender")
    public JAXBElement<AggregatorSenderType> createAggregatorSender(AggregatorSenderType value) {
        return new JAXBElement<AggregatorSenderType>(_AggregatorSender_QNAME, AggregatorSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgentUserSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AgentUserSender")
    public JAXBElement<AgentUserSenderType> createAgentUserSender(AgentUserSenderType value) {
        return new JAXBElement<AgentUserSenderType>(_AgentUserSender_QNAME, AgentUserSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnabledSysSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EnabledSystemSender")
    public JAXBElement<EnabledSysSenderType> createEnabledSystemSender(EnabledSysSenderType value) {
        return new JAXBElement<EnabledSysSenderType>(_EnabledSystemSender_QNAME, EnabledSysSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarketingCarrierSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MarketingCarrierSender")
    public JAXBElement<MarketingCarrierSenderType> createMarketingCarrierSender(MarketingCarrierSenderType value) {
        return new JAXBElement<MarketingCarrierSenderType>(_MarketingCarrierSender_QNAME, MarketingCarrierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingCarrierSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OperatingCarrierSender")
    public JAXBElement<OperatingCarrierSenderType> createOperatingCarrierSender(OperatingCarrierSenderType value) {
        return new JAXBElement<OperatingCarrierSenderType>(_OperatingCarrierSender_QNAME, OperatingCarrierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierSenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetailSupplierSenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RetailPartnerSender")
    public JAXBElement<RetailSupplierSenderType> createRetailPartnerSender(RetailSupplierSenderType value) {
        return new JAXBElement<RetailSupplierSenderType>(_RetailPartnerSender_QNAME, RetailSupplierSenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencySenderType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelAgencySenderType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TravelAgencySender")
    public JAXBElement<TravelAgencySenderType> createTravelAgencySender(TravelAgencySenderType value) {
        return new JAXBElement<TravelAgencySenderType>(_TravelAgencySender_QNAME, TravelAgencySenderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggregatorRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AggregatorRecipient")
    public JAXBElement<AggregatorRecipientType> createAggregatorRecipient(AggregatorRecipientType value) {
        return new JAXBElement<AggregatorRecipientType>(_AggregatorRecipient_QNAME, AggregatorRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgentUserRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AgentUserRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AgentUserRecipient")
    public JAXBElement<AgentUserRecipientType> createAgentUserRecipient(AgentUserRecipientType value) {
        return new JAXBElement<AgentUserRecipientType>(_AgentUserRecipient_QNAME, AgentUserRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnabledSysRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EnabledSystemRecipient")
    public JAXBElement<EnabledSysRecipientType> createEnabledSystemRecipient(EnabledSysRecipientType value) {
        return new JAXBElement<EnabledSysRecipientType>(_EnabledSystemRecipient_QNAME, EnabledSysRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarketingCarrierRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MarketingCarrierRecipient")
    public JAXBElement<MarketingCarrierRecipientType> createMarketingCarrierRecipient(MarketingCarrierRecipientType value) {
        return new JAXBElement<MarketingCarrierRecipientType>(_MarketingCarrierRecipient_QNAME, MarketingCarrierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingCarrierRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OperatingCarrierRecipient")
    public JAXBElement<OperatingCarrierRecipientType> createOperatingCarrierRecipient(OperatingCarrierRecipientType value) {
        return new JAXBElement<OperatingCarrierRecipientType>(_OperatingCarrierRecipient_QNAME, OperatingCarrierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ORAAirlineRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ORA_Recipient")
    public JAXBElement<ORAAirlineRecipientType> createORARecipient(ORAAirlineRecipientType value) {
        return new JAXBElement<ORAAirlineRecipientType>(_ORARecipient_QNAME, ORAAirlineRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link POAAirlineRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "POA_Recipient")
    public JAXBElement<POAAirlineRecipientType> createPOARecipient(POAAirlineRecipientType value) {
        return new JAXBElement<POAAirlineRecipientType>(_POARecipient_QNAME, POAAirlineRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetailSupplierRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RetailPartnerRecipient")
    public JAXBElement<RetailSupplierRecipientType> createRetailPartnerRecipient(RetailSupplierRecipientType value) {
        return new JAXBElement<RetailSupplierRecipientType>(_RetailPartnerRecipient_QNAME, RetailSupplierRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencyRecipientType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelAgencyRecipientType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TravelAgencyRecipient")
    public JAXBElement<TravelAgencyRecipientType> createTravelAgencyRecipient(TravelAgencyRecipientType value) {
        return new JAXBElement<TravelAgencyRecipientType>(_TravelAgencyRecipient_QNAME, TravelAgencyRecipientType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AggregatorParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AggregatorParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AggregatorParticipant")
    public JAXBElement<AggregatorParticipantType> createAggregatorParticipant(AggregatorParticipantType value) {
        return new JAXBElement<AggregatorParticipantType>(_AggregatorParticipant_QNAME, AggregatorParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnabledSysParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EnabledSysParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EnabledSystemParticipant")
    public JAXBElement<EnabledSysParticipantType> createEnabledSystemParticipant(EnabledSysParticipantType value) {
        return new JAXBElement<EnabledSysParticipantType>(_EnabledSystemParticipant_QNAME, EnabledSysParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MarketingCarrierParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MarketingCarrierParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MarketingCarrierParticipant")
    public JAXBElement<MarketingCarrierParticipantType> createMarketingCarrierParticipant(MarketingCarrierParticipantType value) {
        return new JAXBElement<MarketingCarrierParticipantType>(_MarketingCarrierParticipant_QNAME, MarketingCarrierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OperatingCarrierParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OperatingCarrierParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OperatingCarrierParticipant")
    public JAXBElement<OperatingCarrierParticipantType> createOperatingCarrierParticipant(OperatingCarrierParticipantType value) {
        return new JAXBElement<OperatingCarrierParticipantType>(_OperatingCarrierParticipant_QNAME, OperatingCarrierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ORAAirlineParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ORAAirlineParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ORA_Participant")
    public JAXBElement<ORAAirlineParticipantType> createORAParticipant(ORAAirlineParticipantType value) {
        return new JAXBElement<ORAAirlineParticipantType>(_ORAParticipant_QNAME, ORAAirlineParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link POAAirlineParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link POAAirlineParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "POA_Participant")
    public JAXBElement<POAAirlineParticipantType> createPOAParticipant(POAAirlineParticipantType value) {
        return new JAXBElement<POAAirlineParticipantType>(_POAParticipant_QNAME, POAAirlineParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RetailSupplierParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RetailSupplierParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RetailSupplierParticipant")
    public JAXBElement<RetailSupplierParticipantType> createRetailSupplierParticipant(RetailSupplierParticipantType value) {
        return new JAXBElement<RetailSupplierParticipantType>(_RetailSupplierParticipant_QNAME, RetailSupplierParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelAgencyParticipantType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelAgencyParticipantType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TravelAgencyParticipant")
    public JAXBElement<TravelAgencyParticipantType> createTravelAgencyParticipant(TravelAgencyParticipantType value) {
        return new JAXBElement<TravelAgencyParticipantType>(_TravelAgencyParticipant_QNAME, TravelAgencyParticipantType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ErrorsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Errors")
    public JAXBElement<ErrorsType> createErrors(ErrorsType value) {
        return new JAXBElement<ErrorsType>(_Errors_QNAME, ErrorsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlertsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlertsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Alerts")
    public JAXBElement<AlertsType> createAlerts(AlertsType value) {
        return new JAXBElement<AlertsType>(_Alerts_QNAME, AlertsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvDiscrepencyAlertType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvDiscrepencyAlertType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "InventoryDiscrepancyAlert")
    public JAXBElement<InvDiscrepencyAlertType> createInventoryDiscrepancyAlert(InvDiscrepencyAlertType value) {
        return new JAXBElement<InvDiscrepencyAlertType>(_InventoryDiscrepancyAlert_QNAME, InvDiscrepencyAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PINAuthTravelerType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PINAuthTravelerType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PIN_AuthenticationAlert")
    public JAXBElement<PINAuthTravelerType> createPINAuthenticationAlert(PINAuthTravelerType value) {
        return new JAXBElement<PINAuthTravelerType>(_PINAuthenticationAlert_QNAME, PINAuthTravelerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SecurePaymentAlertType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SecurePaymentAlertType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SecurePaymentAlert")
    public JAXBElement<SecurePaymentAlertType> createSecurePaymentAlert(SecurePaymentAlertType value) {
        return new JAXBElement<SecurePaymentAlertType>(_SecurePaymentAlert_QNAME, SecurePaymentAlertType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvGuaranteeNoticeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvGuaranteeNoticeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "InventoryGuaranteeNotif")
    public JAXBElement<InvGuaranteeNoticeType> createInventoryGuaranteeNotif(InvGuaranteeNoticeType value) {
        return new JAXBElement<InvGuaranteeNoticeType>(_InventoryGuaranteeNotif_QNAME, InvGuaranteeNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentRulesNoticeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentRulesNoticeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentRulesNotice")
    public JAXBElement<PaymentRulesNoticeType> createPaymentRulesNotice(PaymentRulesNoticeType value) {
        return new JAXBElement<PaymentRulesNoticeType>(_PaymentRulesNotice_QNAME, PaymentRulesNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PricingParametersNoticeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PricingParametersNoticeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PricingParametersNotice")
    public JAXBElement<PricingParametersNoticeType> createPricingParametersNotice(PricingParametersNoticeType value) {
        return new JAXBElement<PricingParametersNoticeType>(_PricingParametersNotice_QNAME, PricingParametersNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFilterNoticeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceFilterNoticeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceFilterNotice")
    public JAXBElement<ServiceFilterNoticeType> createServiceFilterNotice(ServiceFilterNoticeType value) {
        return new JAXBElement<ServiceFilterNoticeType>(_ServiceFilterNotice_QNAME, ServiceFilterNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxExemptionNoticeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxExemptionNoticeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TaxExemptionNotice")
    public JAXBElement<TaxExemptionNoticeType> createTaxExemptionNotice(TaxExemptionNoticeType value) {
        return new JAXBElement<TaxExemptionNoticeType>(_TaxExemptionNotice_QNAME, TaxExemptionNoticeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfBagV172DisclosureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfBagV172DisclosureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BagDisclosureList")
    public JAXBElement<ListOfBagV172DisclosureType> createBagDisclosureList(ListOfBagV172DisclosureType value) {
        return new JAXBElement<ListOfBagV172DisclosureType>(_BagDisclosureList_QNAME, ListOfBagV172DisclosureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfContentSourceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfContentSourceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ContentSourceList")
    public JAXBElement<ListOfContentSourceType> createContentSourceList(ListOfContentSourceType value) {
        return new JAXBElement<ListOfContentSourceType>(_ContentSourceList_QNAME, ListOfContentSourceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfV172DisclosureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfV172DisclosureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DisclosureList")
    public JAXBElement<ListOfV172DisclosureType> createDisclosureList(ListOfV172DisclosureType value) {
        return new JAXBElement<ListOfV172DisclosureType>(_DisclosureList_QNAME, ListOfV172DisclosureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfClassOfServiceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfClassOfServiceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ClassOfServiceList")
    public JAXBElement<ListOfClassOfServiceType> createClassOfServiceList(ListOfClassOfServiceType value) {
        return new JAXBElement<ListOfClassOfServiceType>(_ClassOfServiceList_QNAME, ListOfClassOfServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfMediaType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfMediaType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MediaList")
    public JAXBElement<ListOfMediaType> createMediaList(ListOfMediaType value) {
        return new JAXBElement<ListOfMediaType>(_MediaList_QNAME, ListOfMediaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferInstructionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfOfferInstructionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "InstructionsList")
    public JAXBElement<ListOfOfferInstructionsType> createInstructionsList(ListOfOfferInstructionsType value) {
        return new JAXBElement<ListOfOfferInstructionsType>(_InstructionsList_QNAME, ListOfOfferInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferV172PenaltyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfOfferV172PenaltyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PenaltyList")
    public JAXBElement<ListOfOfferV172PenaltyType> createPenaltyList(ListOfOfferV172PenaltyType value) {
        return new JAXBElement<ListOfOfferV172PenaltyType>(_PenaltyList_QNAME, ListOfOfferV172PenaltyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfOfferTermsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfOfferTermsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TermsList")
    public JAXBElement<ListOfOfferTermsType> createTermsList(ListOfOfferTermsType value) {
        return new JAXBElement<ListOfOfferTermsType>(_TermsList_QNAME, ListOfOfferTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfV172PriceClassType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfV172PriceClassType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PriceClassList")
    public JAXBElement<ListOfV172PriceClassType> createPriceClassList(ListOfV172PriceClassType value) {
        return new JAXBElement<ListOfV172PriceClassType>(_PriceClassList_QNAME, ListOfV172PriceClassType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfServiceBundleType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListOfServiceBundleType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceBundleList")
    public JAXBElement<ListOfServiceBundleType> createServiceBundleList(ListOfServiceBundleType value) {
        return new JAXBElement<ListOfServiceBundleType>(_ServiceBundleList_QNAME, ListOfServiceBundleType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareCode")
    public JAXBElement<String> createFareCode(String value) {
        return new JAXBElement<String>(_FareCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareBasisCodeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareBasisCode")
    public JAXBElement<FareBasisCodeType> createFareBasisCode(FareBasisCodeType value) {
        return new JAXBElement<FareBasisCodeType>(_FareBasisCode_QNAME, FareBasisCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Fare")
    public JAXBElement<FareType> createFare(FareType value) {
        return new JAXBElement<FareType>(_Fare_QNAME, FareType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareDetailType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareDetailType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareDetail")
    public JAXBElement<FareDetailType> createFareDetail(FareDetailType value) {
        return new JAXBElement<FareDetailType>(_FareDetail_QNAME, FareDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareRulesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareRulesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareRules")
    public JAXBElement<FareRulesType> createFareRules(FareRulesType value) {
        return new JAXBElement<FareRulesType>(_FareRules_QNAME, FareRulesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TourCode")
    public JAXBElement<String> createTourCode(String value) {
        return new JAXBElement<String>(_TourCode_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareBasisCityPair")
    public JAXBElement<String> createFareBasisCityPair(String value) {
        return new JAXBElement<String>(_FareBasisCityPair_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareFilingType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareFilingType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareFiledIn")
    public JAXBElement<FareFilingType> createFareFiledIn(FareFilingType value) {
        return new JAXBElement<FareFilingType>(_FareFiledIn_QNAME, FareFilingType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareInd")
    public JAXBElement<String> createFareInd(String value) {
        return new JAXBElement<String>(_FareInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareRuleCategory")
    public JAXBElement<String> createFareRuleCategory(String value) {
        return new JAXBElement<String>(_FareRuleCategory_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareTextInd")
    public JAXBElement<String> createFareTextInd(String value) {
        return new JAXBElement<String>(_FareTextInd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightCOSCoreType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightCOSCoreType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ClassOfService")
    public JAXBElement<FlightCOSCoreType> createClassOfService(FlightCOSCoreType value) {
        return new JAXBElement<FlightCOSCoreType>(_ClassOfService_QNAME, FlightCOSCoreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopLocationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StopLocationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StopLocations")
    public JAXBElement<StopLocationType> createStopLocations(StopLocationType value) {
        return new JAXBElement<StopLocationType>(_StopLocations_QNAME, StopLocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightArrivalType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightArrivalType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Arrival")
    public JAXBElement<FlightArrivalType> createArrival(FlightArrivalType value) {
        return new JAXBElement<FlightArrivalType>(_Arrival_QNAME, FlightArrivalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DepartureDate")
    public JAXBElement<XMLGregorianCalendar> createDepartureDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DepartureDate_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDistanceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightDistanceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlightDistance")
    public JAXBElement<FlightDistanceType> createFlightDistance(FlightDistanceType value) {
        return new JAXBElement<FlightDistanceType>(_FlightDistance_QNAME, FlightDistanceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightDurationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightDurationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlightDuration")
    public JAXBElement<FlightDurationType> createFlightDuration(FlightDurationType value) {
        return new JAXBElement<FlightDurationType>(_FlightDuration_QNAME, FlightDurationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalJourneyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotalJourneyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TotalJourney")
    public JAXBElement<TotalJourneyType> createTotalJourney(TotalJourneyType value) {
        return new JAXBElement<TotalJourneyType>(_TotalJourney_QNAME, TotalJourneyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlightStatus")
    public JAXBElement<String> createFlightStatus(String value) {
        return new JAXBElement<String>(_FlightStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightFrequencyType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightFrequencyType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Frequency")
    public JAXBElement<FlightFrequencyType> createFrequency(FlightFrequencyType value) {
        return new JAXBElement<FlightFrequencyType>(_Frequency_QNAME, FlightFrequencyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightMileageType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightMileageType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlightMileage")
    public JAXBElement<FlightMileageType> createFlightMileage(FlightMileageType value) {
        return new JAXBElement<FlightMileageType>(_FlightMileage_QNAME, FlightMileageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlightSegmentType")
    public JAXBElement<String> createFlightSegmentType(String value) {
        return new JAXBElement<String>(_FlightSegmentType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AircraftSummaryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Equipment")
    public JAXBElement<AircraftSummaryType> createEquipment(AircraftSummaryType value) {
        return new JAXBElement<AircraftSummaryType>(_Equipment_QNAME, AircraftSummaryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OriginDestinationReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOriginDestinationReferences(String value) {
        return new JAXBElement<String>(_OriginDestinationReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferItemID")
    public JAXBElement<ItemIDType> createOfferItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OfferItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItemIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OrderItemID")
    public JAXBElement<ItemIDType> createOrderItemID(ItemIDType value) {
        return new JAXBElement<ItemIDType>(_OrderItemID_QNAME, ItemIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BagDisclosureReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBagDisclosureReferences(String value) {
        return new JAXBElement<String>(_BagDisclosureReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CheckedBagReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCheckedBagReferences(String value) {
        return new JAXBElement<String>(_CheckedBagReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CarryOnReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createCarryOnReferences(String value) {
        return new JAXBElement<String>(_CarryOnReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BagDisclosureKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBagDisclosureKey(String value) {
        return new JAXBElement<String>(_BagDisclosureKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EquivalentID_Key")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createEquivalentIDKey(String value) {
        return new JAXBElement<String>(_EquivalentIDKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OriginDestinationKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOriginDestinationKey(String value) {
        return new JAXBElement<String>(_OriginDestinationKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SegmentKey")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSegmentKey(String value) {
        return new JAXBElement<String>(_SegmentKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "GroupReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createGroupReference(String value) {
        return new JAXBElement<String>(_GroupReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MediaGroupreference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMediaGroupreference(String value) {
        return new JAXBElement<String>(_MediaGroupreference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MediaItemReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createMediaItemReference(String value) {
        return new JAXBElement<String>(_MediaItemReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOfferReferences(String value) {
        return new JAXBElement<String>(_OfferReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferInstructionReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOfferInstructionReferences(String value) {
        return new JAXBElement<String>(_OfferInstructionReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferPenaltyReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOfferPenaltyReferences(String value) {
        return new JAXBElement<String>(_OfferPenaltyReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferTermReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createOfferTermReferences(String value) {
        return new JAXBElement<String>(_OfferTermReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PassengerReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPassengerReference(String value) {
        return new JAXBElement<String>(_PassengerReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PassengerReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPassengerReferences(String value) {
        return new JAXBElement<String>(_PassengerReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PriceClassReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createPriceClassReference(String value) {
        return new JAXBElement<String>(_PriceClassReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SeatReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createSeatReference(String value) {
        return new JAXBElement<String>(_SeatReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createServiceReference(String value) {
        return new JAXBElement<String>(_ServiceReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceReferences")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createServiceReferences(String value) {
        return new JAXBElement<String>(_ServiceReferences_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BundleReference")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createBundleReference(String value) {
        return new JAXBElement<String>(_BundleReference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddressMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AddressMetadata")
    public JAXBElement<AddressMetadataType> createAddressMetadata(AddressMetadataType value) {
        return new JAXBElement<AddressMetadataType>(_AddressMetadata_QNAME, AddressMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AircraftMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AircraftMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AircraftMetadata")
    public JAXBElement<AircraftMetadataType> createAircraftMetadata(AircraftMetadataType value) {
        return new JAXBElement<AircraftMetadataType>(_AircraftMetadata_QNAME, AircraftMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirportMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AirportMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AirportMetadata")
    public JAXBElement<AirportMetadataType> createAirportMetadata(AirportMetadataType value) {
        return new JAXBElement<AirportMetadataType>(_AirportMetadata_QNAME, AirportMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CityMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CityMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CityMetadata")
    public JAXBElement<CityMetadataType> createCityMetadata(CityMetadataType value) {
        return new JAXBElement<CityMetadataType>(_CityMetadata_QNAME, CityMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodesetMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CodesetMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CodesetMetadata")
    public JAXBElement<CodesetMetadataType> createCodesetMetadata(CodesetMetadataType value) {
        return new JAXBElement<CodesetMetadataType>(_CodesetMetadata_QNAME, CodesetMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContactMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ContactMetadata")
    public JAXBElement<ContactMetadataType> createContactMetadata(ContactMetadataType value) {
        return new JAXBElement<ContactMetadataType>(_ContactMetadata_QNAME, ContactMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContentMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ContentMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ContentMetadata")
    public JAXBElement<ContentMetadataType> createContentMetadata(ContentMetadataType value) {
        return new JAXBElement<ContentMetadataType>(_ContentMetadata_QNAME, ContentMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountryMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CountryMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CountryMetadata")
    public JAXBElement<CountryMetadataType> createCountryMetadata(CountryMetadataType value) {
        return new JAXBElement<CountryMetadataType>(_CountryMetadata_QNAME, CountryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DescriptionMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DescriptionMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DescriptionMetadata")
    public JAXBElement<DescriptionMetadataType> createDescriptionMetadata(DescriptionMetadataType value) {
        return new JAXBElement<DescriptionMetadataType>(_DescriptionMetadata_QNAME, DescriptionMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquivalentIDMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EquivalentIDMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EquivalentID_Metadata")
    public JAXBElement<EquivalentIDMetadataType> createEquivalentIDMetadata(EquivalentIDMetadataType value) {
        return new JAXBElement<EquivalentIDMetadataType>(_EquivalentIDMetadata_QNAME, EquivalentIDMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LanguageMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LanguageMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "LanguageMetadata")
    public JAXBElement<LanguageMetadataType> createLanguageMetadata(LanguageMetadataType value) {
        return new JAXBElement<LanguageMetadataType>(_LanguageMetadata_QNAME, LanguageMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MediaMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MediaMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MediaMetadata")
    public JAXBElement<MediaMetadataType> createMediaMetadata(MediaMetadataType value) {
        return new JAXBElement<MediaMetadataType>(_MediaMetadata_QNAME, MediaMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentCardMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentCardMetadata")
    public JAXBElement<PaymentCardMetadataType> createPaymentCardMetadata(PaymentCardMetadataType value) {
        return new JAXBElement<PaymentCardMetadataType>(_PaymentCardMetadata_QNAME, PaymentCardMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentFormMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentFormMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentFormMetadata")
    public JAXBElement<PaymentFormMetadataType> createPaymentFormMetadata(PaymentFormMetadataType value) {
        return new JAXBElement<PaymentFormMetadataType>(_PaymentFormMetadata_QNAME, PaymentFormMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PriceMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PriceMetadata")
    public JAXBElement<PriceMetadataType> createPriceMetadata(PriceMetadataType value) {
        return new JAXBElement<PriceMetadataType>(_PriceMetadata_QNAME, PriceMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RuleMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RuleMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RuleMetadata")
    public JAXBElement<RuleMetadataType> createRuleMetadata(RuleMetadataType value) {
        return new JAXBElement<RuleMetadataType>(_RuleMetadata_QNAME, RuleMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StateProvMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StateProvMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StateProvMetadata")
    public JAXBElement<StateProvMetadataType> createStateProvMetadata(StateProvMetadataType value) {
        return new JAXBElement<StateProvMetadataType>(_StateProvMetadata_QNAME, StateProvMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ZoneMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ZoneMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ZoneMetadata")
    public JAXBElement<ZoneMetadataType> createZoneMetadata(ZoneMetadataType value) {
        return new JAXBElement<ZoneMetadataType>(_ZoneMetadata_QNAME, ZoneMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageCheckedMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageCheckedMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CheckedBagMetadata")
    public JAXBElement<BaggageCheckedMetadataType> createCheckedBagMetadata(BaggageCheckedMetadataType value) {
        return new JAXBElement<BaggageCheckedMetadataType>(_CheckedBagMetadata_QNAME, BaggageCheckedMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageCarryOnMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageCarryOnMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CarryOnBagMetadata")
    public JAXBElement<BaggageCarryOnMetadataType> createCarryOnBagMetadata(BaggageCarryOnMetadataType value) {
        return new JAXBElement<BaggageCarryOnMetadataType>(_CarryOnBagMetadata_QNAME, BaggageCarryOnMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageDisclosureMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageDisclosureMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BaggageDisclosureMetadata")
    public JAXBElement<BaggageDisclosureMetadataType> createBaggageDisclosureMetadata(BaggageDisclosureMetadataType value) {
        return new JAXBElement<BaggageDisclosureMetadataType>(_BaggageDisclosureMetadata_QNAME, BaggageDisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageDetailMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageDetailMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BaggageDetailMetadata")
    public JAXBElement<BaggageDetailMetadataType> createBaggageDetailMetadata(BaggageDetailMetadataType value) {
        return new JAXBElement<BaggageDetailMetadataType>(_BaggageDetailMetadata_QNAME, BaggageDetailMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageQueryMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageQueryMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BaggageQueryMetadata")
    public JAXBElement<BaggageQueryMetadataType> createBaggageQueryMetadata(BaggageQueryMetadataType value) {
        return new JAXBElement<BaggageQueryMetadataType>(_BaggageQueryMetadata_QNAME, BaggageQueryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItineraryMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItineraryMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ItineraryMetadata")
    public JAXBElement<ItineraryMetadataType> createItineraryMetadata(ItineraryMetadataType value) {
        return new JAXBElement<ItineraryMetadataType>(_ItineraryMetadata_QNAME, ItineraryMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectionsMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectionsMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DirectionMetadata")
    public JAXBElement<DirectionsMetadataType> createDirectionMetadata(DirectionsMetadataType value) {
        return new JAXBElement<DirectionsMetadataType>(_DirectionMetadata_QNAME, DirectionsMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DisclosureMetadata")
    public JAXBElement<DisclosureMetadataType> createDisclosureMetadata(DisclosureMetadataType value) {
        return new JAXBElement<DisclosureMetadataType>(_DisclosureMetadata_QNAME, DisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferItemMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferItemMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferMetadata")
    public JAXBElement<OfferItemMetadataType> createOfferMetadata(OfferItemMetadataType value) {
        return new JAXBElement<OfferItemMetadataType>(_OfferMetadata_QNAME, OfferItemMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferInstructionMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferInstructionMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferInstructionMetadata")
    public JAXBElement<OfferInstructionMetadataType> createOfferInstructionMetadata(OfferInstructionMetadataType value) {
        return new JAXBElement<OfferInstructionMetadataType>(_OfferInstructionMetadata_QNAME, OfferInstructionMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PenaltyMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PenaltyMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferPenaltyMetadata")
    public JAXBElement<PenaltyMetadataType> createOfferPenaltyMetadata(PenaltyMetadataType value) {
        return new JAXBElement<PenaltyMetadataType>(_OfferPenaltyMetadata_QNAME, PenaltyMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferTermsMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferTermsMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferTermsMetadata")
    public JAXBElement<OfferTermsMetadataType> createOfferTermsMetadata(OfferTermsMetadataType value) {
        return new JAXBElement<OfferTermsMetadataType>(_OfferTermsMetadata_QNAME, OfferTermsMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DisclosureMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DiscountMetadata")
    public JAXBElement<DisclosureMetadataType> createDiscountMetadata(DisclosureMetadataType value) {
        return new JAXBElement<DisclosureMetadataType>(_DiscountMetadata_QNAME, DisclosureMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggagePricingQualifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggagePricingQualifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BaggagePricingQualifier")
    public JAXBElement<BaggagePricingQualifierType> createBaggagePricingQualifier(BaggagePricingQualifierType value) {
        return new JAXBElement<BaggagePricingQualifierType>(_BaggagePricingQualifier_QNAME, BaggagePricingQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderKeysType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderKeysType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OrderKeys")
    public JAXBElement<OrderKeysType> createOrderKeys(OrderKeysType value) {
        return new JAXBElement<OrderKeysType>(_OrderKeys_QNAME, OrderKeysType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardQualifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardQualifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentCardQualifiers")
    public JAXBElement<CardQualifierType> createPaymentCardQualifiers(CardQualifierType value) {
        return new JAXBElement<CardQualifierType>(_PaymentCardQualifiers_QNAME, CardQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceQualifierPriceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceQualifierPriceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceQualifier")
    public JAXBElement<ServiceQualifierPriceType> createServiceQualifier(ServiceQualifierPriceType value) {
        return new JAXBElement<ServiceQualifierPriceType>(_ServiceQualifier_QNAME, ServiceQualifierPriceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SocialQualiferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SocialQualiferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SocialMediaQualifiers")
    public JAXBElement<SocialQualiferType> createSocialMediaQualifiers(SocialQualiferType value) {
        return new JAXBElement<SocialQualiferType>(_SocialMediaQualifiers_QNAME, SocialQualiferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FareQualifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FareQualifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SpecialFareQualifiers")
    public JAXBElement<FareQualifierType> createSpecialFareQualifiers(FareQualifierType value) {
        return new JAXBElement<FareQualifierType>(_SpecialFareQualifiers_QNAME, FareQualifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecialQualiferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecialQualiferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SpecialNeedQualifiers")
    public JAXBElement<SpecialQualiferType> createSpecialNeedQualifiers(SpecialQualiferType value) {
        return new JAXBElement<SpecialQualiferType>(_SpecialNeedQualifiers_QNAME, SpecialQualiferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TripPurposeListType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TripPurposeListType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TripPurposeQualifier")
    public JAXBElement<TripPurposeListType> createTripPurposeQualifier(TripPurposeListType value) {
        return new JAXBElement<TripPurposeListType>(_TripPurposeQualifier_QNAME, TripPurposeListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeatMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SeatMetadata")
    public JAXBElement<SeatMetadataType> createSeatMetadata(SeatMetadataType value) {
        return new JAXBElement<SeatMetadataType>(_SeatMetadata_QNAME, SeatMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatMapMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SeatMapMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SeatMapMetadata")
    public JAXBElement<SeatMapMetadataType> createSeatMapMetadata(SeatMapMetadataType value) {
        return new JAXBElement<SeatMapMetadataType>(_SeatMapMetadata_QNAME, SeatMapMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerMetadataType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PassengerMetadataType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PassengerMetadata")
    public JAXBElement<PassengerMetadataType> createPassengerMetadata(PassengerMetadataType value) {
        return new JAXBElement<PassengerMetadataType>(_PassengerMetadata_QNAME, PassengerMetadataType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AssociatedService")
    public JAXBElement<ServiceInfoAssocType> createAssociatedService(ServiceInfoAssocType value) {
        return new JAXBElement<ServiceInfoAssocType>(_AssociatedService_QNAME, ServiceInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerInfoAssocType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PassengerInfoAssocType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AssociatedPassenger")
    public JAXBElement<PassengerInfoAssocType> createAssociatedPassenger(PassengerInfoAssocType value) {
        return new JAXBElement<PassengerInfoAssocType>(_AssociatedPassenger_QNAME, PassengerInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceInfoAssocType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "IncludedService")
    public JAXBElement<ServiceInfoAssocType> createIncludedService(ServiceInfoAssocType value) {
        return new JAXBElement<ServiceInfoAssocType>(_IncludedService_QNAME, ServiceInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferDetailInfoAssocType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferDetailInfoAssocType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OfferDetailAssociation")
    public JAXBElement<OfferDetailInfoAssocType> createOfferDetailAssociation(OfferDetailInfoAssocType value) {
        return new JAXBElement<OfferDetailInfoAssocType>(_OfferDetailAssociation_QNAME, OfferDetailInfoAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherOfferAssocType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherOfferAssocType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OtherAssociation")
    public JAXBElement<OtherOfferAssocType> createOtherAssociation(OtherOfferAssocType value) {
        return new JAXBElement<OtherOfferAssocType>(_OtherAssociation_QNAME, OtherOfferAssocType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferClassUpgradeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferClassUpgradeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ClassOfServiceUpgrade")
    public JAXBElement<OfferClassUpgradeType> createClassOfServiceUpgrade(OfferClassUpgradeType value) {
        return new JAXBElement<OfferClassUpgradeType>(_ClassOfServiceUpgrade_QNAME, OfferClassUpgradeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FreeFormInstructionsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FreeFormInstructionsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FreeFormTextInstruction")
    public JAXBElement<FreeFormInstructionsType> createFreeFormTextInstruction(FreeFormInstructionsType value) {
        return new JAXBElement<FreeFormInstructionsType>(_FreeFormTextInstruction_QNAME, FreeFormInstructionsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvGuaranteeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvGuaranteeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "InventoryGuarantee")
    public JAXBElement<InvGuaranteeType> createInventoryGuarantee(InvGuaranteeType value) {
        return new JAXBElement<InvGuaranteeType>(_InventoryGuarantee_QNAME, InvGuaranteeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OfferMatchType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OfferMatchType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Match")
    public JAXBElement<OfferMatchType> createMatch(OfferMatchType value) {
        return new JAXBElement<OfferMatchType>(_Match_QNAME, OfferMatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PTCQuantityPricedType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PTCQuantityPricedType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PTC_Priced")
    public JAXBElement<PTCQuantityPricedType> createPTCPriced(PTCQuantityPricedType value) {
        return new JAXBElement<PTCQuantityPricedType>(_PTCPriced_QNAME, PTCQuantityPricedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AllOffersSnapshot")
    public JAXBElement<AirlineOffersSnapshotType> createAllOffersSnapshot(AirlineOffersSnapshotType value) {
        return new JAXBElement<AirlineOffersSnapshotType>(_AllOffersSnapshot_QNAME, AirlineOffersSnapshotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AirlineOffersSnapshotType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AirlineOfferSnapshot")
    public JAXBElement<AirlineOffersSnapshotType> createAirlineOfferSnapshot(AirlineOffersSnapshotType value) {
        return new JAXBElement<AirlineOffersSnapshotType>(_AirlineOfferSnapshot_QNAME, AirlineOffersSnapshotType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TicketByTimeLimitType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TicketByTimeLimitType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TicketByTimeLimit")
    public JAXBElement<TicketByTimeLimitType> createTicketByTimeLimit(TicketByTimeLimitType value) {
        return new JAXBElement<TicketByTimeLimitType>(_TicketByTimeLimit_QNAME, TicketByTimeLimitType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Associations")
    public JAXBElement<OrderItemAssociationType> createAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_Associations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderItemAssociationType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OrderAssociations")
    public JAXBElement<OrderItemAssociationType> createOrderAssociations(OrderItemAssociationType value) {
        return new JAXBElement<OrderItemAssociationType>(_OrderAssociations_QNAME, OrderItemAssociationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderV172CommissionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderV172CommissionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OrderCommision")
    public JAXBElement<OrderV172CommissionType> createOrderCommision(OrderV172CommissionType value) {
        return new JAXBElement<OrderV172CommissionType>(_OrderCommision_QNAME, OrderV172CommissionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OrderID")
    public JAXBElement<OrderIDType> createOrderID(OrderIDType value) {
        return new JAXBElement<OrderIDType>(_OrderID_QNAME, OrderIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaggageItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BaggageItem")
    public JAXBElement<BaggageItemType> createBaggageItem(BaggageItemType value) {
        return new JAXBElement<BaggageItemType>(_BaggageItem_QNAME, BaggageItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DetailedFlightItem")
    public JAXBElement<FlightItemType> createDetailedFlightItem(FlightItemType value) {
        return new JAXBElement<FlightItemType>(_DetailedFlightItem_QNAME, FlightItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherItemType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OtherItem")
    public JAXBElement<OtherItemType> createOtherItem(OtherItemType value) {
        return new JAXBElement<OtherItemType>(_OtherItem_QNAME, OtherItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BankAccountMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BankAccountMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BankAccountMethod")
    public JAXBElement<BankAccountMethodType> createBankAccountMethod(BankAccountMethodType value) {
        return new JAXBElement<BankAccountMethodType>(_BankAccountMethod_QNAME, BankAccountMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CashMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CashMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CashMethod")
    public JAXBElement<CashMethodType> createCashMethod(CashMethodType value) {
        return new JAXBElement<CashMethodType>(_CashMethod_QNAME, CashMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DirectBillMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DirectBillMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DirectBillMethod")
    public JAXBElement<DirectBillMethodType> createDirectBillMethod(DirectBillMethodType value) {
        return new JAXBElement<DirectBillMethodType>(_DirectBillMethod_QNAME, DirectBillMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MiscChargeMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MiscChargeMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MiscChargeMethod")
    public JAXBElement<MiscChargeMethodType> createMiscChargeMethod(MiscChargeMethodType value) {
        return new JAXBElement<MiscChargeMethodType>(_MiscChargeMethod_QNAME, MiscChargeMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OtherMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OtherMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OtherMethod")
    public JAXBElement<OtherMethodType> createOtherMethod(OtherMethodType value) {
        return new JAXBElement<OtherMethodType>(_OtherMethod_QNAME, OtherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentCardMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentCardMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentCardMethod")
    public JAXBElement<PaymentCardMethodType> createPaymentCardMethod(PaymentCardMethodType value) {
        return new JAXBElement<PaymentCardMethodType>(_PaymentCardMethod_QNAME, PaymentCardMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RedemptionMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RedemptionMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RedemptionMethod")
    public JAXBElement<RedemptionMethodType> createRedemptionMethod(RedemptionMethodType value) {
        return new JAXBElement<RedemptionMethodType>(_RedemptionMethod_QNAME, RedemptionMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VoucherMethodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link VoucherMethodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "VoucherMethod")
    public JAXBElement<VoucherMethodType> createVoucherMethod(VoucherMethodType value) {
        return new JAXBElement<VoucherMethodType>(_VoucherMethod_QNAME, VoucherMethodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltBaggageV172OfferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltBaggageV172OfferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AltBaggageOffer")
    public JAXBElement<AltBaggageV172OfferType> createAltBaggageOffer(AltBaggageV172OfferType value) {
        return new JAXBElement<AltBaggageV172OfferType>(_AltBaggageOffer_QNAME, AltBaggageV172OfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltPricedFlightV172OfferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltPricedFlightV172OfferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AltPricedFlightOffer")
    public JAXBElement<AltPricedFlightV172OfferType> createAltPricedFlightOffer(AltPricedFlightV172OfferType value) {
        return new JAXBElement<AltPricedFlightV172OfferType>(_AltPricedFlightOffer_QNAME, AltPricedFlightV172OfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltOtherV172OfferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltOtherV172OfferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AltOtherOffer")
    public JAXBElement<AltOtherV172OfferType> createAltOtherOffer(AltOtherV172OfferType value) {
        return new JAXBElement<AltOtherV172OfferType>(_AltOtherOffer_QNAME, AltOtherV172OfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltSeatV172OfferType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AltSeatV172OfferType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AltSeatOffer")
    public JAXBElement<AltSeatV172OfferType> createAltSeatOffer(AltSeatV172OfferType value) {
        return new JAXBElement<AltSeatV172OfferType>(_AltSeatOffer_QNAME, AltSeatV172OfferType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ItemStatus")
    public JAXBElement<String> createItemStatus(String value) {
        return new JAXBElement<String>(_ItemStatus_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CarrierFeeInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CarrierFeeInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CarrierFeeInfo")
    public JAXBElement<CarrierFeeInfoType> createCarrierFeeInfo(CarrierFeeInfoType value) {
        return new JAXBElement<CarrierFeeInfoType>(_CarrierFeeInfo_QNAME, CarrierFeeInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalReferenceType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalReferenceType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AddlReferenceID")
    public JAXBElement<AdditionalReferenceType> createAddlReferenceID(AdditionalReferenceType value) {
        return new JAXBElement<AdditionalReferenceType>(_AddlReferenceID_QNAME, AdditionalReferenceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CheckedInAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createCheckedInAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CheckedInAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CurrentAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createCurrentAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_CurrentAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CouponSoldAirlineType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlownAirlineInfo")
    public JAXBElement<CouponSoldAirlineType> createFlownAirlineInfo(CouponSoldAirlineType value) {
        return new JAXBElement<CouponSoldAirlineType>(_FlownAirlineInfo_QNAME, CouponSoldAirlineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InConnectionWithType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InConnectionWithType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "InConnectionWithInfo")
    public JAXBElement<InConnectionWithType> createInConnectionWithInfo(InConnectionWithType value) {
        return new JAXBElement<InConnectionWithType>(_InConnectionWithInfo_QNAME, InConnectionWithType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TicketDocQuantity")
    public JAXBElement<BigInteger> createTicketDocQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_TicketDocQuantity_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BaseFareTransactionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BaseFareTransactionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "BaseFare")
    public JAXBElement<BaseFareTransactionType> createBaseFare(BaseFareTransactionType value) {
        return new JAXBElement<BaseFareTransactionType>(_BaseFare_QNAME, BaseFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EquivFareTransactionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EquivFareTransactionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "EquivFare")
    public JAXBElement<EquivFareTransactionType> createEquivFare(EquivFareTransactionType value) {
        return new JAXBElement<EquivFareTransactionType>(_EquivFare_QNAME, EquivFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ETFareInfoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ETFareInfoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FareInfo")
    public JAXBElement<ETFareInfoType> createFareInfo(ETFareInfoType value) {
        return new JAXBElement<ETFareInfoType>(_FareInfo_QNAME, ETFareInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TotalFareTransactionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TotalFareTransactionType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Total")
    public JAXBElement<TotalFareTransactionType> createTotal(TotalFareTransactionType value) {
        return new JAXBElement<TotalFareTransactionType>(_Total_QNAME, TotalFareTransactionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnstructuredFareCalcType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UnstructuredFareCalcType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "UnstructuredFareCalcInfo")
    public JAXBElement<UnstructuredFareCalcType> createUnstructuredFareCalcInfo(UnstructuredFareCalcType value) {
        return new JAXBElement<UnstructuredFareCalcType>(_UnstructuredFareCalcInfo_QNAME, UnstructuredFareCalcType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptedPaymentFormType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptedPaymentFormType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PaymentForm")
    public JAXBElement<AcceptedPaymentFormType> createPaymentForm(AcceptedPaymentFormType value) {
        return new JAXBElement<AcceptedPaymentFormType>(_PaymentForm_QNAME, AcceptedPaymentFormType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "RFIC")
    public JAXBElement<String> createRFIC(String value) {
        return new JAXBElement<String>(_RFIC_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAirportType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SrvcLocationAirportType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AirportFulfillmentLocation")
    public JAXBElement<SrvcLocationAirportType> createAirportFulfillmentLocation(SrvcLocationAirportType value) {
        return new JAXBElement<SrvcLocationAirportType>(_AirportFulfillmentLocation_QNAME, SrvcLocationAirportType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SrvcLocationAddressType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SrvcLocationAddressType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OtherFulfillmentLocation")
    public JAXBElement<SrvcLocationAddressType> createOtherFulfillmentLocation(SrvcLocationAddressType value) {
        return new JAXBElement<SrvcLocationAddressType>(_OtherFulfillmentLocation_QNAME, SrvcLocationAddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceFulfillmentType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceFulfillmentType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceFulfillment")
    public JAXBElement<ServiceFulfillmentType> createServiceFulfillment(ServiceFulfillmentType value) {
        return new JAXBElement<ServiceFulfillmentType>(_ServiceFulfillment_QNAME, ServiceFulfillmentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceCouponType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceCouponType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceCoupon")
    public JAXBElement<ServiceCouponType> createServiceCoupon(ServiceCouponType value) {
        return new JAXBElement<ServiceCouponType>(_ServiceCoupon_QNAME, ServiceCouponType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceItemQuantityType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceItemQuantityType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceItemQuantityRules")
    public JAXBElement<ServiceItemQuantityType> createServiceItemQuantityRules(ServiceItemQuantityType value) {
        return new JAXBElement<ServiceItemQuantityType>(_ServiceItemQuantityRules_QNAME, ServiceItemQuantityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceIDType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ServiceIDType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ServiceID")
    public JAXBElement<ServiceIDType> createServiceID(ServiceIDType value) {
        return new JAXBElement<ServiceIDType>(_ServiceID_QNAME, ServiceIDType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltDepartQualifiedQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FltDepartQualifiedQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AirportCityDeparture")
    public JAXBElement<FltDepartQualifiedQueryType> createAirportCityDeparture(FltDepartQualifiedQueryType value) {
        return new JAXBElement<FltDepartQualifiedQueryType>(_AirportCityDeparture_QNAME, FltDepartQualifiedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltArriveQualifiedQueryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FltArriveQualifiedQueryType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AirportCityArrival")
    public JAXBElement<FltArriveQualifiedQueryType> createAirportCityArrival(FltArriveQualifiedQueryType value) {
        return new JAXBElement<FltArriveQualifiedQueryType>(_AirportCityArrival_QNAME, FltArriveQualifiedQueryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityCountryDepartType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AffinityCountryDepartType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CountryDeparture")
    public JAXBElement<AffinityCountryDepartType> createCountryDeparture(AffinityCountryDepartType value) {
        return new JAXBElement<AffinityCountryDepartType>(_CountryDeparture_QNAME, AffinityCountryDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityCountryArriveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AffinityCountryArriveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CountryArrival")
    public JAXBElement<AffinityCountryArriveType> createCountryArrival(AffinityCountryArriveType value) {
        return new JAXBElement<AffinityCountryArriveType>(_CountryArrival_QNAME, AffinityCountryArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointDepartType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointDepartType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ReferencePointDeparture")
    public JAXBElement<AffinityReferencePointDepartType> createReferencePointDeparture(AffinityReferencePointDepartType value) {
        return new JAXBElement<AffinityReferencePointDepartType>(_ReferencePointDeparture_QNAME, AffinityReferencePointDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointArriveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AffinityReferencePointArriveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ReferencePointArrival")
    public JAXBElement<AffinityReferencePointArriveType> createReferencePointArrival(AffinityReferencePointArriveType value) {
        return new JAXBElement<AffinityReferencePointArriveType>(_ReferencePointArrival_QNAME, AffinityReferencePointArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityStateProvDepartType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AffinityStateProvDepartType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StateProvDeparture")
    public JAXBElement<AffinityStateProvDepartType> createStateProvDeparture(AffinityStateProvDepartType value) {
        return new JAXBElement<AffinityStateProvDepartType>(_StateProvDeparture_QNAME, AffinityStateProvDepartType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AffinityStateProvArriveType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AffinityStateProvArriveType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StateProvArrival")
    public JAXBElement<AffinityStateProvArriveType> createStateProvArrival(AffinityStateProvArriveType value) {
        return new JAXBElement<AffinityStateProvArriveType>(_StateProvArrival_QNAME, AffinityStateProvArriveType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadDatePeriodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LeadDatePeriodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "LeadDatePeriod")
    public JAXBElement<LeadDatePeriodType> createLeadDatePeriod(LeadDatePeriodType value) {
        return new JAXBElement<LeadDatePeriodType>(_LeadDatePeriod_QNAME, LeadDatePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LeadTimePeriodType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link LeadTimePeriodType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "LeadTimePeriod")
    public JAXBElement<LeadTimePeriodType> createLeadTimePeriod(LeadTimePeriodType value) {
        return new JAXBElement<LeadTimePeriodType>(_LeadTimePeriod_QNAME, LeadTimePeriodType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscountProgramType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DiscountProgramType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "DiscountProgramQualifier")
    public JAXBElement<DiscountProgramType> createDiscountProgramQualifier(DiscountProgramType value) {
        return new JAXBElement<DiscountProgramType>(_DiscountProgramQualifier_QNAME, DiscountProgramType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StayPeriodDateRangeType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StayPeriodDateRangeType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StayPeriodDateRange")
    public JAXBElement<StayPeriodDateRangeType> createStayPeriodDateRange(StayPeriodDateRangeType value) {
        return new JAXBElement<StayPeriodDateRangeType>(_StayPeriodDateRange_QNAME, StayPeriodDateRangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StayPeriodSeasonType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link StayPeriodSeasonType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "StayPeriodSeason")
    public JAXBElement<StayPeriodSeasonType> createStayPeriodSeason(StayPeriodSeasonType value) {
        return new JAXBElement<StayPeriodSeasonType>(_StayPeriodSeason_QNAME, StayPeriodSeasonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupBudgetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GroupBudgetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "GroupBudget")
    public JAXBElement<GroupBudgetType> createGroupBudget(GroupBudgetType value) {
        return new JAXBElement<GroupBudgetType>(_GroupBudget_QNAME, GroupBudgetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonBudgetType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersonBudgetType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PerPersonBudget")
    public JAXBElement<PersonBudgetType> createPerPersonBudget(PersonBudgetType value) {
        return new JAXBElement<PersonBudgetType>(_PerPersonBudget_QNAME, PersonBudgetType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirlinePreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AirlinePreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AirlinePreferences")
    public JAXBElement<AirlinePreferencesType> createAirlinePreferences(AirlinePreferencesType value) {
        return new JAXBElement<AirlinePreferencesType>(_AirlinePreferences_QNAME, AirlinePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlliancePreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AlliancePreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "AlliancePreferences")
    public JAXBElement<AlliancePreferencesType> createAlliancePreferences(AlliancePreferencesType value) {
        return new JAXBElement<AlliancePreferencesType>(_AlliancePreferences_QNAME, AlliancePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CabinPreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CabinPreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "CabinPreferences")
    public JAXBElement<CabinPreferencesType> createCabinPreferences(CabinPreferencesType value) {
        return new JAXBElement<CabinPreferencesType>(_CabinPreferences_QNAME, CabinPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightPreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FlightPreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FlightPreferences")
    public JAXBElement<FlightPreferencesType> createFlightPreferences(FlightPreferencesType value) {
        return new JAXBElement<FlightPreferencesType>(_FlightPreferences_QNAME, FlightPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarePreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FarePreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "FarePreferences")
    public JAXBElement<FarePreferencesType> createFarePreferences(FarePreferencesType value) {
        return new JAXBElement<FarePreferencesType>(_FarePreferences_QNAME, FarePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BestPricingPreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BestPricingPreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "PricingMethodPreference")
    public JAXBElement<BestPricingPreferencesType> createPricingMethodPreference(BestPricingPreferencesType value) {
        return new JAXBElement<BestPricingPreferencesType>(_PricingMethodPreference_QNAME, BestPricingPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FltSegmentMaxTimePreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FltSegmentMaxTimePreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "SegMaxTimePreferences")
    public JAXBElement<FltSegmentMaxTimePreferencesType> createSegMaxTimePreferences(FltSegmentMaxTimePreferencesType value) {
        return new JAXBElement<FltSegmentMaxTimePreferencesType>(_SegMaxTimePreferences_QNAME, FltSegmentMaxTimePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransferPreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TransferPreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TransferPreferences")
    public JAXBElement<TransferPreferencesType> createTransferPreferences(TransferPreferencesType value) {
        return new JAXBElement<TransferPreferencesType>(_TransferPreferences_QNAME, TransferPreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelTimePreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelTimePreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TripTime")
    public JAXBElement<TravelTimePreferencesType> createTripTime(TravelTimePreferencesType value) {
        return new JAXBElement<TravelTimePreferencesType>(_TripTime_QNAME, TravelTimePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TravelDistancePreferencesType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TravelDistancePreferencesType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "TripDistance")
    public JAXBElement<TravelDistancePreferencesType> createTripDistance(TravelDistancePreferencesType value) {
        return new JAXBElement<TravelDistancePreferencesType>(_TripDistance_QNAME, TravelDistancePreferencesType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrderListParamsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link OrderListParamsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "OrderListParameters")
    public JAXBElement<OrderListParamsType> createOrderListParameters(OrderListParamsType value) {
        return new JAXBElement<OrderListParamsType>(_OrderListParameters_QNAME, OrderListParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItinReshopParamsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ItinReshopParamsType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "ReshopParameters")
    public JAXBElement<ItinReshopParamsType> createReshopParameters(ItinReshopParamsType value) {
        return new JAXBElement<ItinReshopParamsType>(_ReshopParameters_QNAME, ItinReshopParamsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Minimum", scope = OfferGroupSizeType.class)
    public JAXBElement<BigInteger> createOfferGroupSizeTypeMinimum(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferGroupSizeTypeMinimum_QNAME, BigInteger.class, OfferGroupSizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Maximum", scope = OfferGroupSizeType.class)
    public JAXBElement<BigInteger> createOfferGroupSizeTypeMaximum(BigInteger value) {
        return new JAXBElement<BigInteger>(_OfferGroupSizeTypeMaximum_QNAME, BigInteger.class, OfferGroupSizeType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MinimumQuantity", scope = ListOfServiceBundleType.ServiceBundle.Selection.class)
    public JAXBElement<BigInteger> createListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListOfServiceBundleTypeServiceBundleSelectionMinimumQuantity_QNAME, BigInteger.class, ListOfServiceBundleType.ServiceBundle.Selection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "MaximumQuantity", scope = ListOfServiceBundleType.ServiceBundle.Selection.class)
    public JAXBElement<BigInteger> createListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity(BigInteger value) {
        return new JAXBElement<BigInteger>(_ListOfServiceBundleTypeServiceBundleSelectionMaximumQuantity_QNAME, BigInteger.class, ListOfServiceBundleType.ServiceBundle.Selection.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Participants }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Participants }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Participants", scope = MsgPartiesType.class)
    public JAXBElement<MsgPartiesType.Participants> createMsgPartiesTypeParticipants(MsgPartiesType.Participants value) {
        return new JAXBElement<MsgPartiesType.Participants>(_MsgPartiesTypeParticipants_QNAME, MsgPartiesType.Participants.class, MsgPartiesType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Recipient }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MsgPartiesType.Recipient }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.iata.org/IATA/2015/00/2018.1/OfferPriceRS", name = "Recipient", scope = MsgPartiesType.class)
    public JAXBElement<MsgPartiesType.Recipient> createMsgPartiesTypeRecipient(MsgPartiesType.Recipient value) {
        return new JAXBElement<MsgPartiesType.Recipient>(_MsgPartiesTypeRecipient_QNAME, MsgPartiesType.Recipient.class, MsgPartiesType.class, value);
    }

}
