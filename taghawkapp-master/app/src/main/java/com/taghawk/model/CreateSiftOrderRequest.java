package com.taghawk.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CreateSiftOrderRequest {
    @Expose
    @SerializedName("transaction")
    private PaymentStatusRequest.Transaction transaction;
    @Expose
    @SerializedName("ship_to")
    private PaymentStatusRequest.Ship_to ship_to;
    @Expose
    @SerializedName("products")
    private List<PaymentStatusRequest.Products> products;


    public PaymentStatusRequest.Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(PaymentStatusRequest.Transaction transaction) {
        this.transaction = transaction;
    }

    public PaymentStatusRequest.Ship_to getShip_to() {
        return ship_to;
    }

    public void setShip_to(PaymentStatusRequest.Ship_to ship_to) {
        this.ship_to = ship_to;
    }

    public List<PaymentStatusRequest.Products> getProducts() {
        return products;
    }

    public void setProducts(List<PaymentStatusRequest.Products> products) {
        this.products = products;
    }
}
