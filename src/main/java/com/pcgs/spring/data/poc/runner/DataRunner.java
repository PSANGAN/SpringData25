package com.pcgs.spring.data.poc.runner;

import com.pcgs.spring.data.poc.domain.Customer;
import com.pcgs.spring.data.poc.domain.Parcel;
import com.pcgs.spring.data.poc.repository.CustomerRepository;
import com.pcgs.spring.data.poc.repository.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataRunner implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final OrderRepository orderRepository;

    public DataRunner(CustomerRepository customerRepository, OrderRepository orderRepository) {
        this.customerRepository = customerRepository;
        this.orderRepository = orderRepository;
    }

    @Override
    public void run(String... args) {
        // Create and save customer
        Customer customer = new Customer("Alice");
        customerRepository.save(customer);

        // Create and save order for customer
        Parcel order = new Parcel("Laptop", customer.getId());
        orderRepository.save(order);

        // Fetch and print data
        System.out.println("Customers:");
        customerRepository.findAll().forEach(System.out::println);

        System.out.println("Orders:");
        orderRepository.findAll().forEach(System.out::println);
    }
}