package com.wasis.ordersystem.orderservice.domain.valueobject;

import com.wasis.ordersystem.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
