package com.wasis.ordersystem.orderservice.domain.entity;

import com.wasis.ordersystem.domain.entity.BaseEntity;
import com.wasis.ordersystem.domain.valueobject.Money;
import com.wasis.ordersystem.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
    private String name;
    private Money money;

    public Product(ProductId productId,String name, Money money) {
        super.setId(productId);
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public Money getMoney() {
        return money;
    }
}
