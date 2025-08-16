package com.pcgs.spring.data.poc.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Parcel")
public class Parcel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private Long customerId;

    public Parcel(String product, Long customerId) {
        this.product = product;
        this.customerId = customerId;
    }

    public Parcel() {}

    public Long getId() { return id; }
    public String getProduct() { return product; }
    public Long getCustomerId() { return customerId; }

    @Override
    public String toString() {
        return "Order{id=" + id + ", product='" + product + "', customerId=" + customerId + "}";
    }
}