package com.springboot.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ndc_order_id")
    private String ndcOrderId;

    @Column(name = "owner_code")
    private String ownerCode;

    @Column(name = "booking_id")
    private String bookingId;

    @Column(name = "order_status")
    private String orderStatus;

    @Column(name = "currency")
    private String currency;

    @Column(name = "total_amount")
    private Double totalAmount;

    @Column(name = "base_amount")
    private Double baseAmount;

    @Column(name = "tax_amount")
    private Double taxAmount;

    @Column(name = "payment_time_limit")
    private LocalDateTime paymentTimeLimit;

    @Column(name = "price_guarantee_time_limit")
    private LocalDateTime priceGuaranteeTimeLimit;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Lob
    @Column(name = "raw_response", columnDefinition = "LONGTEXT")
    private String rawResponse;

    // Passenger
    @Column(name = "passenger_name")
    private String passengerName;

    @Column(name = "passenger_type")
    private String passengerType;

    @Column(name = "baggage_info")
    private String baggageInfo;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<FlightSegment> segments = new ArrayList<>();

    // --- Getters & Setters ---

    // ... existing fields ...
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNdcOrderId() { return ndcOrderId; }
    public void setNdcOrderId(String ndcOrderId) { this.ndcOrderId = ndcOrderId; }

    public String getOwnerCode() { return ownerCode; }
    public void setOwnerCode(String ownerCode) { this.ownerCode = ownerCode; }

    public String getBookingId() { return bookingId; }
    public void setBookingId(String bookingId) { this.bookingId = bookingId; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public String getCurrency() { return currency; }
    public void setCurrency(String currency) { this.currency = currency; }

    public Double getTotalAmount() { return totalAmount; }
    public void setTotalAmount(Double totalAmount) { this.totalAmount = totalAmount; }

    public Double getBaseAmount() { return baseAmount; }
    public void setBaseAmount(Double baseAmount) { this.baseAmount = baseAmount; }

    public Double getTaxAmount() { return taxAmount; }
    public void setTaxAmount(Double taxAmount) { this.taxAmount = taxAmount; }

    public LocalDateTime getPaymentTimeLimit() { return paymentTimeLimit; }
    public void setPaymentTimeLimit(LocalDateTime paymentTimeLimit) { this.paymentTimeLimit = paymentTimeLimit; }

    public LocalDateTime getPriceGuaranteeTimeLimit() { return priceGuaranteeTimeLimit; }
    public void setPriceGuaranteeTimeLimit(LocalDateTime priceGuaranteeTimeLimit) { this.priceGuaranteeTimeLimit = priceGuaranteeTimeLimit; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }

    public String getRawResponse() { return rawResponse; }
    public void setRawResponse(String rawResponse) { this.rawResponse = rawResponse; }

    // New fields
    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public String getPassengerType() { return passengerType; }
    public void setPassengerType(String passengerType) { this.passengerType = passengerType; }

    public String getBaggageInfo() { return baggageInfo; }
    public void setBaggageInfo(String baggageInfo) { this.baggageInfo = baggageInfo; }

    public List<FlightSegment> getSegments() { return segments; }
    public void setSegments(List<FlightSegment> segments) { this.segments = segments; }
}
