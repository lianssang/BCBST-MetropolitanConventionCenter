package com.training.metro.repository;

import com.training.metro.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepository extends CrudRepository<Customer, Long> {

}
