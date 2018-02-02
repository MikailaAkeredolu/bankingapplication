package com.example.bankingapplication.services;

import com.example.bankingapplication.Domain.Customer;
import com.example.bankingapplication.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        List<Customer>customer = new ArrayList<>();
        customerRepository.findAll().forEach(customer::add);
        return customer;
    }

    public Customer getCustomerById(Long id){
        return customerRepository.findOne(id);
    }


    public void createCustomer(Customer customer){
        customerRepository.save(customer);
    }


    public void updateCustomer( Long id, Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.delete(id);
    }


}
