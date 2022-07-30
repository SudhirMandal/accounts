package com.sudhir.accounts.controllers;

import com.sudhir.accounts.config.AccountsServiceConfig;
import com.sudhir.accounts.entities.Accounts;
import com.sudhir.accounts.repos.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
@Slf4j
public class AccountsController {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private AccountsServiceConfig accountsServiceConfig;

    @PostMapping("/save")
    public Accounts save(@RequestBody Accounts accounts) {
        accountRepository.save(accounts);
        log.info("Account created with ID: " + accounts.getAccountId());
        return accounts;
    }

    @GetMapping
    public List<Accounts> getAccounts(){
        log.info("myname is : "+accountsServiceConfig.getMyname());
        return  accountRepository.findAll();
    }

}
