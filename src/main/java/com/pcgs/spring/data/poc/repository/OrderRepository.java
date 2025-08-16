package com.pcgs.spring.data.poc.repository;

import com.pcgs.spring.data.poc.domain.Parcel;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Parcel, Long> {
}