package com.salihremziguler.Account.service;

import com.salihremziguler.Account.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {


    private final AccountRepository accountRepository;


    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }








}
