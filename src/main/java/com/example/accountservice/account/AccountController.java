package com.example.accountservice.account;

import com.example.accountservice.account.model.Account;
import com.example.accountservice.account.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @Autowired
    private AccountRepository accountRepository;

    @PostMapping("/account")
    public Account insertAccount(Account account){
        accountRepository.insert(account);
        return account;
    }
}