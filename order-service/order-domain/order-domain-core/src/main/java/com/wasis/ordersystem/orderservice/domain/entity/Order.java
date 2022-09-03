package com.wasis.ordersystem.orderservice.domain.entity;

import java.util.ArrayList;
import java.util.List;

import com.wasis.ordersystem.domain.entity.AggregateRoot;
import com.wasis.ordersystem.domain.valueobject.CustomerId;
import com.wasis.ordersystem.domain.valueobject.Money;
import com.wasis.ordersystem.domain.valueobject.OrderId;
import com.wasis.ordersystem.domain.valueobject.OrderStatus;
import com.wasis.ordersystem.domain.valueobject.SellerId;
import com.wasis.ordersystem.orderservice.domain.valueobject.StreetAddress;
import com.wasis.ordersystem.orderservice.domain.valueobject.TrackingId;

public class Order extends AggregateRoot<OrderId> {
    private final CustomerId customerId;
    private final SellerId sellerId;
    private final StreetAddress streetAddress;
    private final Money money;
    private final List<OrderItem> orderItems;
    private TrackingId trackingId;
    private OrderStatus orderStatus;
    private List<String> failureMessages;

    public CustomerId getCustomerId() {
        return customerId;
    }

    public SellerId getSellerId() {
        return sellerId;
    }

    public StreetAddress getStreetAddress() {
        return streetAddress;
    }

    public Money getMoney() {
        return money;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public TrackingId getTrackingId() {
        return trackingId;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public List<String> getFailureMessages() {
        return failureMessages;
    }

    public static class Builder {
        private OrderId orderId;
        private CustomerId customerId;
        private SellerId sellerId;
        private StreetAddress streetAddress;
        private Money money;
        private List<OrderItem> orderItems = new ArrayList<OrderItem>();
        private TrackingId trackingId;
        private OrderStatus orderStatus;
        private List<String> failureMessages = new ArrayList<String>();

        public Builder() {
        }

        public Builder orderId(OrderId orderId) {
            this.orderId = orderId;
            return Builder.this;
        }

        public Builder customerId(CustomerId customerId) {
            this.customerId = customerId;
            return Builder.this;
        }

        public Builder sellerId(SellerId sellerId) {
            this.sellerId = sellerId;
            return Builder.this;
        }

        public Builder streetAddress(StreetAddress streetAddress) {
            this.streetAddress = streetAddress;
            return Builder.this;
        }

        public Builder money(Money money) {
            this.money = money;
            return Builder.this;
        }

        public Builder orderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
            return Builder.this;
        }

        public Builder addOrderItems(OrderItem orderItems) {
            this.orderItems.add(orderItems);
            return Builder.this;
        }

        public Builder trackingId(TrackingId trackingId) {
            this.trackingId = trackingId;
            return Builder.this;
        }

        public Builder orderStatus(OrderStatus orderStatus) {
            this.orderStatus = orderStatus;
            return Builder.this;
        }

        public Builder failureMessages(List<String> failureMessages) {
            this.failureMessages = failureMessages;
            return Builder.this;
        }

        public Builder addFailureMessages(String failureMessages) {
            this.failureMessages.add(failureMessages);
            return Builder.this;
        }

        public Order build() {

            return new Order(this);
        }
    }

    private Order(Builder builder) {
        super.setId(builder.orderId);
        this.customerId = builder.customerId;
        this.sellerId = builder.sellerId;
        this.streetAddress = builder.streetAddress;
        this.money = builder.money;
        this.orderItems = builder.orderItems;
        this.trackingId = builder.trackingId;
        this.orderStatus = builder.orderStatus;
        this.failureMessages = builder.failureMessages;
    }

}
