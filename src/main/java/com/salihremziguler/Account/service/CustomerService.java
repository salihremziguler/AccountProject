package com.salihremziguler.Account.service;

import com.salihremziguler.Account.exception.CustomerNotFoundException;
import com.salihremziguler.Account.model.Customer;
import com.salihremziguler.Account.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    protected Customer findcustomerById(String id)
    {
        return customerRepository.findById(id).orElseThrow(()->new CustomerNotFoundException("Customer could not find by id:"+id));

    }




}
