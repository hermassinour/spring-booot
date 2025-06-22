package com.springboot.utils;

import com.springboot.model.Order;
import com.springboot.model.FlightSegment;
import com.springboot.model.User;
import com.springboot.dto.orderviewrs.OrderViewRS;
import com.springboot.dto.orderviewrs.ResponseType;
import com.springboot.dto.orderviewrs.OrderType;
import com.springboot.dto.orderviewrs.PriceType;
import com.springboot.dto.orderviewrs.PaxSegmentType;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderMapper {
    public static Order fromOrderViewRS(OrderViewRS rs, User user, String rawResponse) {
        Order order = new Order();

        // --- Main Order Info
        ResponseType response = rs.getResponse();
        if (response != null) {
            List<OrderType> orders = response.getOrder();
            if (orders != null && !orders.isEmpty()) {
                OrderType dto = orders.get(0);

                order.setNdcOrderId(dto.getOrderID());
                order.setOwnerCode(dto.getOwnerCode());
                order.setOrderStatus(dto.getStatusCode());

                // Payment deadline
                order.setPaymentTimeLimit(toLocalDateTime(dto.getPaymentTimeLimitDateTime()));

                // Booking ID: from first BookingRef if present
                if (dto.getBookingRef() != null && !dto.getBookingRef().isEmpty()) {
                    order.setBookingId(dto.getBookingRef().get(0).getBookingID());
                }

                // Price fields
                PriceType price = dto.getTotalPrice();
                if (price != null) {
                    if (price.getTotalAmount() != null) {
                        order.setCurrency(price.getTotalAmount().getCurCode());
                        order.setTotalAmount(parseDouble(price.getTotalAmount().getValue()));
                    }
                    if (price.getBaseAmount() != null) {
                        order.setBaseAmount(parseDouble(price.getBaseAmount().getValue()));
                    }
                    if (price.getTaxSummary() != null && !price.getTaxSummary().isEmpty()
                            && price.getTaxSummary().get(0).getTotalTaxAmount() != null) {
                        order.setTaxAmount(parseDouble(price.getTaxSummary().get(0).getTotalTaxAmount().getValue()));
                    }
                }

                // Get price guarantee from the first OrderItem, if present
                if (dto.getOrderItem() != null && !dto.getOrderItem().isEmpty()) {
                    var item = dto.getOrderItem().get(0);
                    order.setPriceGuaranteeTimeLimit(toLocalDateTime(item.getPriceGuaranteeTimeLimitDateTime()));
                }
            }
        }


        // --- Segment (Flight) Info
        List<FlightSegment> segmentEntities = new ArrayList<>();
        if (response != null && response.getDataLists() != null
                && response.getDataLists().getPaxSegmentList() != null
                && !response.getDataLists().getPaxSegmentList().getPaxSegment().isEmpty()) {

            List<PaxSegmentType> paxSegments = response.getDataLists().getPaxSegmentList().getPaxSegment();
            for (PaxSegmentType seg : paxSegments) {
                FlightSegment fs = new FlightSegment();
                fs.setOrder(order); // set relation if needed

                // Dep/Arrival airports & times
                if (seg.getDep() != null) {
                    fs.setDepartureAirport(seg.getDep().getIATALocationCode());
                    fs.setDepartureTime(toLocalDateTime(seg.getDep().getAircraftScheduledDateTime()));
                }
                if (seg.getArrival() != null) {
                    fs.setArrivalAirport(seg.getArrival().getIATALocationCode());
                    fs.setArrivalTime(toLocalDateTime(seg.getArrival().getAircraftScheduledDateTime()));
                }

                // Airline, flight number, cabin
                if (seg.getMarketingCarrierInfo() != null) {
                    fs.setAirline(seg.getMarketingCarrierInfo().getCarrierName());
                    fs.setFlightNumber(seg.getMarketingCarrierInfo().getMarketingCarrierFlightNumberText());
                    fs.setCabin(seg.getCabinType() != null ? seg.getCabinType().getCabinTypeCode() : null); // If you want cabin type from segment, otherwise from carrier
                }

                segmentEntities.add(fs);
            }
        }
        order.setSegments(segmentEntities);

        // --- Audit Fields
        order.setCreatedAt(LocalDateTime.now());
        order.setUser(user);
        order.setRawResponse(rawResponse);

        return order;
    }

    // Utility: Converts a JAXB DateTimeType to LocalDateTime (assumes value() returns ISO string)
    private static LocalDateTime toLocalDateTime(Object dtObj) {
        if (dtObj == null) return null;
        try {
            // If dtObj is a String (sometimes happens)
            if (dtObj instanceof String) {
                return LocalDateTime.parse((String) dtObj, DateTimeFormatter.ISO_DATE_TIME);
            }
            // If dtObj is a generated class with a getValue()
            var method = dtObj.getClass().getMethod("getValue");
            String value = (String) method.invoke(dtObj);
            // Try parsing as ISO instant or ISO local
            try {
                return LocalDateTime.parse(value, DateTimeFormatter.ISO_DATE_TIME);
            } catch (Exception e) {
                // Try as OffsetDateTime and convert to LocalDateTime
                return java.time.OffsetDateTime.parse(value, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toLocalDateTime();
            }
        } catch (Exception e) {
            // Handle/log as needed
            return null;
        }
    }

    private static Double parseDouble(java.math.BigDecimal b) {
        return b != null ? b.doubleValue() : null;
    }
}
