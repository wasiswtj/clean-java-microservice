package com.wasis.ordersystem.orderservice.domain.entity;

import com.wasis.ordersystem.domain.entity.BaseEntity;
import com.wasis.ordersystem.domain.valueobject.Money;
import com.wasis.ordersystem.domain.valueobject.OrderId;
import com.wasis.ordersystem.orderservice.domain.valueobject.OrderItemId;

public class OrderItem extends BaseEntity<OrderItemId> {
    private OrderId orderId;
    private final Product  product;
    private final int quantity;
    private final Money price;
    private final Money subTotal;

    public OrderId getOrderId() {
        return orderId;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Money getPrice() {
        return price;
    }

    public Money getSubTotal() {
        return subTotal;
    }

    public static class Builder {
        private OrderItemId orderItemId;
        private Product product;
        private int quantity;
        private Money price;
        private Money subTotal;

        public Builder() {
        }

        public Builder orderItem(OrderItemId orderItemId) {
            this.orderItemId = orderItemId;
            return Builder.this;
        }

        public Builder product(Product product) {
            this.product = product;
            return Builder.this;
        }

        public Builder quantity(int quantity) {
            this.quantity = quantity;
            return Builder.this;
        }

        public Builder price(Money price) {
            this.price = price;
            return Builder.this;
        }

        public Builder subTotal(Money subTotal) {
            this.subTotal = subTotal;
            return Builder.this;
        }

        public OrderItem build() {

            return new OrderItem(this);
        }
    }

    private OrderItem(Builder builder) {
        super.setId(builder.orderItemId);
        this.product = builder.product;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.subTotal = builder.subTotal;
    }

}
