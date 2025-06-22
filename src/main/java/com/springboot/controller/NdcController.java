package com.springboot.controller;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import com.springboot.dto.orderviewrs.ErrorType;
import com.springboot.dto.airshoppingrq.AirShoppingRQ;
import com.springboot.dto.airshoppingrs.AirShoppingRS;
import com.springboot.dto.offerpricerq.OfferPriceRQ;
import com.springboot.dto.offerpricers.OfferPriceRS;
import com.springboot.dto.ordercancelrs.OrderCancelRS;
import com.springboot.dto.ordercreaterq.OrderCreateRQ;
import com.springboot.dto.orderviewrs.OrderViewRS;
import com.springboot.dto.orderretrieverq.OrderRetrieveRQ;
import com.springboot.dto.orderreshoprq.OrderReshopRQ;
import com.springboot.dto.orderreshoprs.OrderReshopRS;
import com.springboot.dto.orderchangerq.OrderChangeRQ;
import com.springboot.dto.seatavailabilityrq.SeatAvailabilityRQ;
import com.springboot.dto.seatavailabilityrs.SeatAvailabilityRS;
import com.springboot.dto.servicelistrq.ServiceListRQ;
import com.springboot.dto.servicelistrs.ServiceListRS;
import com.springboot.dto.ordercancelrq.OrderCancelRQ;
import com.springboot.service.NdcService;
import com.springboot.service.EmailService;
import com.springboot.repository.OrderRepository;
import com.springboot.repository.UserRepository;
import com.springboot.utils.ConvertObjectToXml;
import com.springboot.model.Order;
import com.springboot.model.User;
import com.springboot.utils.OrderMapper;

import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

import com.springboot.dto.OrderEmailRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ndc")
public class NdcController {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private NdcService ndcService;

    @Autowired
    private EmailService emailService;

    @Value("${ndc.api.airshopping-url}")
    private String airShoppingUrl;

    @Value("${ndc.api.offerprice-url}")
    private String offerPriceUrl;

    @Value("${ndc.api.ordercreate-url}")
    private String orderCreateUrl;

    @Value("${ndc.api.orderretrieve-url}")
    private String orderRetrieveUrl;

    @Value("${ndc.api.orderreshop-url}")
    private String orderReshopUrl;

    @Value("${ndc.api.orderreshop-url}")
    private String orderReshopRepriceUrl;

    @Value("${ndc.api.orderchange-url}")
    private String orderChangeUrl;

    @Value("${ndc.api.seatavailability-url}")
    private String seatAvailabilityUrl;

    @Value("${ndc.api.servicelist-url}")
    private String serviceListUrl;

    @Value("${ndc.api.ordercancel-url}")
    private String orderCancelUrl;

    @PostMapping(value = "/airshopping", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public AirShoppingRS airShopping(@RequestBody AirShoppingRQ request) {
        return ndcService.sendNdcRequest(request, AirShoppingRS.class, airShoppingUrl);
    }

    @PostMapping(value = "/offerprice", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OfferPriceRS offerPrice(@RequestBody OfferPriceRQ request) {
        return ndcService.sendNdcRequest(request, OfferPriceRS.class, offerPriceUrl);
    }

    @PostMapping(value = "/ordercreate", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ResponseEntity<?> orderCreate(
            @RequestBody OrderCreateRQ request,
            @RequestParam Long userId
    ) {
        // 1. Send NDC request
        OrderViewRS orderViewRS = ndcService.sendNdcRequest(request, OrderViewRS.class, orderCreateUrl);

        // 2. Check for <Errors> block at top level
        if (orderViewRS.getErrors() != null && !orderViewRS.getErrors().isEmpty()) {
            List<String> messages = new ArrayList<>();
            for (OrderViewRS.Errors errorGroup : orderViewRS.getErrors()) {
                for (ErrorType err : errorGroup.getError()) {
                    messages.add(err.getDescText());
                }
            }

            Map<String, Object> errorPayload = new HashMap<>();
            errorPayload.put("message", "Order creation failed");
            errorPayload.put("errors", messages);

            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorPayload);
        }


        // 3. Find user
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        // 4. Convert response to XML for audit/debug
        String rawXml = ConvertObjectToXml.convertObjectToXml(orderViewRS);

        // 5. Map and persist order
        Order order = OrderMapper.fromOrderViewRS(orderViewRS, user, rawXml);
        if (order.getOrderStatus() == null || order.getOrderStatus().isEmpty()) {
            order.setOrderStatus("CREATED");
        }
        orderRepository.save(order);

        // 6. Return successful response
        return ResponseEntity.ok(orderViewRS);
    }

    @PostMapping(value = "/orderretrieve", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OrderViewRS orderRetrieve(@RequestBody OrderRetrieveRQ request) {
        return ndcService.sendNdcRequest(request, OrderViewRS.class, orderRetrieveUrl);
    }

    @PostMapping(value = "/orderreshop", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OrderReshopRS orderReshop(@RequestBody OrderReshopRQ request) {
        return ndcService.sendNdcRequest(request, OrderReshopRS.class, orderReshopUrl);
    }

    @PostMapping(value = "/orderreshop-reprice", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OrderViewRS orderReshopReprice(@RequestBody OrderReshopRQ request) {
        return ndcService.sendNdcRequest(request, OrderViewRS.class, orderReshopRepriceUrl);
    }

    @PostMapping(value = "/orderchange", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OrderViewRS orderChange(@RequestBody OrderChangeRQ request) {
        return ndcService.sendNdcRequest(request, OrderViewRS.class, orderChangeUrl);
    }

    @PostMapping(value = "/seatavailability", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public SeatAvailabilityRS seatAvailability(@RequestBody SeatAvailabilityRQ request) {
        return ndcService.sendNdcRequest(request, SeatAvailabilityRS.class, seatAvailabilityUrl);
    }

    @PostMapping(value = "/servicelist", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public ServiceListRS serviceList(@RequestBody ServiceListRQ request) {
        return ndcService.sendNdcRequest(request, ServiceListRS.class, serviceListUrl);
    }

    @PostMapping(value = "/ordercancel", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    public OrderCancelRS orderCancel(@RequestBody OrderCancelRQ request) {
        // 1. Call NDC service
        OrderCancelRS cancelResponse = ndcService.sendNdcRequest(request, OrderCancelRS.class, orderCancelUrl);

        // 2. Get the OrderID from the request, not the response
        String orderId = null;
        try {
            if (request != null && request.getRequest() != null && request.getRequest().getOrder() != null) {
                orderId = request.getRequest().getOrder().getOrderID();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // 3. Update status in DB
        if (orderId != null) {
            Order order = orderRepository.findByNdcOrderId(orderId).orElse(null);
            if (order != null) {
                order.setOrderStatus("CANCELED");
                orderRepository.save(order);
            }
        }

        // 4. Return NDC response as-is
        return cancelResponse;
    }


    @PostMapping(value = "/sendOrderEmail", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> sendOrderEmail(@RequestBody OrderEmailRequest request) {
        System.out.println("Email received: " + request.getEmail());
        try {
            emailService.sendOrderConfirmationEmail(
                    request.getEmail(),
                    request.getOrder(),
                    request.getPdfBase64()
            );
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Email sending failed: " + e.getMessage());
        }
    }
}
