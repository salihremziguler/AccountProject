package com.salihremziguler.Account.service;

import com.salihremziguler.Account.dto.AccountDto;
import com.salihremziguler.Account.dto.AccountDtoConverter;
import com.salihremziguler.Account.model.Account;
import com.salihremziguler.Account.model.Customer;
import com.salihremziguler.Account.model.Transaction;
import com.salihremziguler.Account.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Service
public class AccountService {


    private final AccountRepository accountRepository;
    private final CustomerService customerService;

    private final TransactionService transactionService;

    private final AccountDtoConverter accountDtoConverter;

    public AccountService(AccountRepository accountRepository, CustomerService customerService, TransactionService transactionService, AccountDtoConverter accountDtoConverter) {
        this.accountRepository = accountRepository;
        this.customerService = customerService;
        this.transactionService = transactionService;
        this.accountDtoConverter = accountDtoConverter;
    }


    public AccountDto createAccount(CreateAccountRequest createAccountRequest) {
        Customer customer=customerService.findcustomerById(createAccountRequest.getCustomerId());

        Account account=new Account(customer,createAccountRequest.getInitialCredit(), LocalDateTime.now());

        if(createAccountRequest.getInitialCredit().compareTo(BigDecimal.ZERO)>0)
        {
            Transaction transaction=transactionService.initiateMoney(account,createAccountRequest.getInitialCredit());
            account.getTransaction().add(transaction);
        }

        return accountDtoConverter.convert(accountRepository.save(account));


    }







}
