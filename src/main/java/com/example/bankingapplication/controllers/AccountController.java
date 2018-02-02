package com.example.bankingapplication.controllers;

import com.example.bankingapplication.Domain.Account;
import com.example.bankingapplication.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    //METHOD- GET Get all accounts
    @RequestMapping("/accounts")
    public List<Account> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    //METHOD- GET account by customer By Id
    @RequestMapping("/accounts/{id}")
    public Account getAccountByAccountId(@PathVariable Long id){
        Account account = accountService.getAccountByAccountId(id);
        return account ;
    }

    //METHOD- POST Create an account and assign it to a customer by customer ID
    @RequestMapping(method = RequestMethod.POST, value = "/customers/{customerId}/accounts")
    public void createAccount(@RequestBody Account account){
        accountService.createAccount(account);
    }

    //METHOD- PUT Update a account by account id
    @RequestMapping(method = RequestMethod.PUT, value = "/accounts/{id}")
    public void updateAccount(@RequestBody Account account, @PathVariable Long id){
         accountService.updateAccount(id,account);
    }

    //METHOD- DELETE - Delete a account by account id
    @RequestMapping(method = RequestMethod.DELETE, value = "/accounts/{id}")
    public void deleteCustomer(@PathVariable Long id){
        accountService.deleteAccount(id);
    }

}
