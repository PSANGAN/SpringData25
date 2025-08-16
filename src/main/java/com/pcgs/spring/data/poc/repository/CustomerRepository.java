package com.pcgs.spring.data.poc.repository;

import com.pcgs.spring.data.poc.domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
