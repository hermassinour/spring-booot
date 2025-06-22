package com.springboot.dto.output;

import java.math.BigDecimal;
import java.util.List;

public class AirShoppingResponse {

    private String correlationId;
    private List<Offer> offers;
    private List<Segment> segments;
    private List<Journey> journeys;
    private List<OriginDestination> originDestinations;
    private List<BaggageAllowance> baggageAllowances;

    public String getCorrelationId() {
        return correlationId;
    }

    public void setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
    }

    public List<Offer> getOffers() {
        return offers;
    }

    public void setOffers(List<Offer> offers) {
        this.offers = offers;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<Journey> getJourneys() {
        return journeys;
    }

    public void setJourneys(List<Journey> journeys) {
        this.journeys = journeys;
    }

    public List<OriginDestination> getOriginDestinations() {
        return originDestinations;
    }

    public void setOriginDestinations(List<OriginDestination> originDestinations) {
        this.originDestinations = originDestinations;
    }

    public List<BaggageAllowance> getBaggageAllowances() {
        return baggageAllowances;
    }

    public void setBaggageAllowances(List<BaggageAllowance> baggageAllowances) {
        this.baggageAllowances = baggageAllowances;
    }

    public static class Offer {
        private String offerId;
        private List<OfferItem> items;

        public String getOfferId() {
            return offerId;
        }

        public void setOfferId(String offerId) {
            this.offerId = offerId;
        }

        public List<OfferItem> getItems() {
            return items;
        }

        public void setItems(List<OfferItem> items) {
            this.items = items;
        }

        public static class OfferItem {
            private String offerItemId;
            private List<String> paxRefIds;
            private BigDecimal price;
            private String currency;
            private String fareBasisCode;
            private String cabinTypeCode;
            private String cabinTypeName;

            public String getOfferItemId() {
                return offerItemId;
            }

            public void setOfferItemId(String offerItemId) {
                this.offerItemId = offerItemId;
            }

            public List<String> getPaxRefIds() {
                return paxRefIds;
            }

            public void setPaxRefIds(List<String> paxRefIds) {
                this.paxRefIds = paxRefIds;
            }

            public BigDecimal getPrice() {
                return price;
            }

            public void setPrice(BigDecimal price) {
                this.price = price;
            }

            public String getCurrency() {
                return currency;
            }

            public void setCurrency(String currency) {
                this.currency = currency;
            }

            public String getFareBasisCode() {
                return fareBasisCode;
            }

            public void setFareBasisCode(String fareBasisCode) {
                this.fareBasisCode = fareBasisCode;
            }

            public String getCabinTypeCode() {
                return cabinTypeCode;
            }

            public void setCabinTypeCode(String cabinTypeCode) {
                this.cabinTypeCode = cabinTypeCode;
            }

            public String getCabinTypeName() {
                return cabinTypeName;
            }

            public void setCabinTypeName(String cabinTypeName) {
                this.cabinTypeName = cabinTypeName;
            }
        }
    }

    public static class Segment {
        private String segmentId;
        private String departureAirport;
        private String arrivalAirport;
        private String departureDateTime;
        private String arrivalDateTime;
        private String marketingCarrier;
        private String operatingCarrier;
        private String flightNumber;
        private String duration;
        private String cabinType;

        public String getSegmentId() {
            return segmentId;
        }

        public void setSegmentId(String segmentId) {
            this.segmentId = segmentId;
        }

        public String getDepartureAirport() {
            return departureAirport;
        }

        public void setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
        }

        public String getArrivalAirport() {
            return arrivalAirport;
        }

        public void setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
        }

        public String getDepartureDateTime() {
            return departureDateTime;
        }

        public void setDepartureDateTime(String departureDateTime) {
            this.departureDateTime = departureDateTime;
        }

        public String getArrivalDateTime() {
            return arrivalDateTime;
        }

        public void setArrivalDateTime(String arrivalDateTime) {
            this.arrivalDateTime = arrivalDateTime;
        }

        public String getMarketingCarrier() {
            return marketingCarrier;
        }

        public void setMarketingCarrier(String marketingCarrier) {
            this.marketingCarrier = marketingCarrier;
        }

        public String getOperatingCarrier() {
            return operatingCarrier;
        }

        public void setOperatingCarrier(String operatingCarrier) {
            this.operatingCarrier = operatingCarrier;
        }

        public String getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(String flightNumber) {
            this.flightNumber = flightNumber;
        }

        public String getDuration() {
            return duration;
        }

        public void setDuration(String duration) {
            this.duration = duration;
        }

        public String getCabinType() {
            return cabinType;
        }

        public void setCabinType(String cabinType) {
            this.cabinType = cabinType;
        }

        public void setCabin(String cabin) {
            this.cabinType = cabin;
        }
    }

    public static class Journey {
        private String journeyId;
        private List<String> segmentIds;
        private String priceClassRefId;

        public Journey() {
        }

        public Journey(String journeyId, List<String> segmentIds, String priceClassRefId) {
            this.journeyId = journeyId;
            this.segmentIds = segmentIds;
            this.priceClassRefId = priceClassRefId;
        }

        public String getJourneyId() {
            return journeyId;
        }

        public void setJourneyId(String journeyId) {
            this.journeyId = journeyId;
        }

        public List<String> getSegmentIds() {
            return segmentIds;
        }

        public void setSegmentIds(List<String> segmentIds) {
            this.segmentIds = segmentIds;
        }

        public String getPriceClassRefId() {
            return priceClassRefId;
        }

        public void setPriceClassRefId(String priceClassRefId) {
            this.priceClassRefId = priceClassRefId;
        }
    }

    public static class OriginDestination {
        private String originDestinationId;
        private String departureAirport;
        private String arrivalAirport;
        private String departureDate;
        private String returnDate;

        public String getOriginDestinationId() {
            return originDestinationId;
        }

        public void setOriginDestinationId(String originDestinationId) {
            this.originDestinationId = originDestinationId;
        }

        public String getDepartureAirport() {
            return departureAirport;
        }

        public void setDepartureAirport(String departureAirport) {
            this.departureAirport = departureAirport;
        }

        public String getArrivalAirport() {
            return arrivalAirport;
        }

        public void setArrivalAirport(String arrivalAirport) {
            this.arrivalAirport = arrivalAirport;
        }

        public String getDepartureDate() {
            return departureDate;
        }

        public void setDepartureDate(String departureDate) {
            this.departureDate = departureDate;
        }

        public String getReturnDate() {
            return returnDate;
        }

        public void setReturnDate(String returnDate) {
            this.returnDate = returnDate;
        }
    }


    public static class BaggageAllowance {
        public String id;
        public String quantity;
        public String unit;
    }
}