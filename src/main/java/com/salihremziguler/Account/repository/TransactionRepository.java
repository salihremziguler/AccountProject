package com.salihremziguler.Account.repository;

import com.salihremziguler.Account.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction,String> {

}
