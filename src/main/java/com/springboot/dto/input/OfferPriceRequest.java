    package com.springboot.dto.input;

    import lombok.Data;
    import java.util.List;

    @Data
    public class OfferPriceRequest {
        private String offerRefId;
        private String ownerCode;
        private String shoppingResponseRefId;
        private String agencyId;
        private String iataNumber;
        private String agencyName;
        private String pseudoCityId;
        private String pointOfSaleCountryCode;
        private String aggregatorId;

        private List<OfferItemSelection> selectedOfferItems;
        private List<Pax> paxList;

        @Data
        public static class OfferItemSelection {
            private String offerItemRefId;
            private List<String> paxRefIds;
        }

        @Data
        public static class Pax {
            private String paxId;
            private String ptc;
            private String paxRefId;
        }
    }
