package com.salihremziguler.Account.repository;

import com.salihremziguler.Account.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,String> {


}
