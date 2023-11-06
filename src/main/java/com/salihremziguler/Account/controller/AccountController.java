package com.salihremziguler.Account.controller;

import com.salihremziguler.Account.dto.AccountDto;
import com.salihremziguler.Account.service.AccountService;
import com.salihremziguler.Account.service.CreateAccountRequest;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/account")
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping
    public ResponseEntity<AccountDto> createAccount(@RequestBody CreateAccountRequest request)
    {
        return ResponseEntity.ok(accountService.createAccount(request));
    }

}
