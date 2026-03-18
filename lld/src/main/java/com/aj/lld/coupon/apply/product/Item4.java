package com.aj.lld.coupon.apply.product;

public class Item4 extends Product {

    public Item4(String name, double price, ProductType type) {
        super(name, price, type);
    }

    @Override
    public double getPrice() {
        return originalPrice;
    }
}
