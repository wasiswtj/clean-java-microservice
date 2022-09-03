package com.wasis.ordersystem.orderservice.domain.valueobject;

import java.util.UUID;

import com.wasis.ordersystem.domain.valueobject.BaseId;

public class TrackingId extends BaseId<UUID> {
    public TrackingId(UUID value) {
        super(value);
    }
}
