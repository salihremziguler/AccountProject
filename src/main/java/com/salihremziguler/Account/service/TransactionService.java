package com.salihremziguler.Account.service;

import com.salihremziguler.Account.model.Account;
import com.salihremziguler.Account.model.Transaction;
import com.salihremziguler.Account.repository.TransactionRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.function.BiConsumer;

@Service
public class TransactionService {

    private Logger logger= LoggerFactory.getLogger(TransactionService.class);


    private final TransactionRepository transactionRepository;


    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    protected Transaction initiateMoney(final Account account, BigDecimal amount)
    {
        //Jparepository is going to save
        return transactionRepository.save(
            new Transaction(amount,account)
        );
    }


}
