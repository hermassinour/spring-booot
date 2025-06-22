package com.springboot.dto.output;

import lombok.Data;
import java.util.List;

@Data
public class OfferPriceResponse {
    private List<Offer> offers;

    @Data
    public static class Offer {
        private String offerRefId;
        private List<OfferItem> items;

        @Data
        public static class OfferItem {
            private String offerItemRefId;
            private List<String> paxRefIds;
        }
    }
}
