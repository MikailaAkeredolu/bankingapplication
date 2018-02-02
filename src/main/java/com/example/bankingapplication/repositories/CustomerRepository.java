package com.example.bankingapplication.repositories;

import com.example.bankingapplication.Domain.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
