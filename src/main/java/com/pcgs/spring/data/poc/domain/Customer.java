package com.pcgs.spring.data.poc.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    // Constructors
    public Customer(String name) {
        this.name = name;
    }

    public Customer() {}

    // Getters/Setters
    public Long getId() { return id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "'}";
    }
}