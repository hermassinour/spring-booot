package com.springboot.dto.input;

import java.math.BigDecimal;
import java.util.List;

public class AirShoppingRequest {
    private String pointOfSaleCountryCode;
    private String agencyId;
    private BigDecimal iataNumber;
    private String agencyName;
    private String pseudoCityId;
    private String cabinType;
    private String aggregatorId;
    private String airlineCode;
    private List<OriginDestination> originDestinations;
    private List<Pax> paxs;

    // ✅ Inner classes
    public static class OriginDestination {
        private String origin;
        private String destination;
        private String date;

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String origin) {
            this.origin = origin;
        }

        public String getDestination() {
            return destination;
        }

        public void setDestination(String destination) {
            this.destination = destination;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }

    public static class Pax {
        private String paxId;
        private String ptc;

        public String getPaxId() {
            return paxId;
        }

        public void setPaxId(String paxId) {
            this.paxId = paxId;
        }

        public String getPtc() {
            return ptc;
        }

        public void setPtc(String ptc) {
            this.ptc = ptc;
        }
    }

    // ✅ Top-level getters/setters
    public String getPointOfSaleCountryCode() {
        return pointOfSaleCountryCode;
    }

    public void setPointOfSaleCountryCode(String pointOfSaleCountryCode) {
        this.pointOfSaleCountryCode = pointOfSaleCountryCode;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String  agencyId) {
        this.agencyId = agencyId;
    }

    public BigDecimal getIataNumber() {
        return iataNumber;
    }

    public void setIataNumber(BigDecimal iataNumber) {
        this.iataNumber = iataNumber;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getPseudoCityId() {
        return pseudoCityId;
    }

    public void setPseudoCityId(String pseudoCityId) {
        this.pseudoCityId = pseudoCityId;
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public List<OriginDestination> getOriginDestinations() {
        return originDestinations;
    }

    public void setOriginDestinations(List<OriginDestination> originDestinations) {
        this.originDestinations = originDestinations;
    }

    public List<Pax> getPaxs() {
        return paxs;
    }

    public void setPaxs(List<Pax> paxs) {
        this.paxs = paxs;
    }

    // ✅ NEW: Getters & setters for aggregatorId and airlineCode
    public String getAggregatorId() {
        return aggregatorId;
    }

    public void setAggregatorId(String aggregatorId) {
        this.aggregatorId = aggregatorId;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
    }
}
