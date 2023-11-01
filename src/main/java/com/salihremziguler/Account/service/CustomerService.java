package com.salihremziguler.Account.service;

import com.salihremziguler.Account.model.Customer;
import com.salihremziguler.Account.repository.CustomerRepository;

public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findcustomerById(String id)
    {
        return customerRepository.findById(id).orElseThrow();

    }




}
