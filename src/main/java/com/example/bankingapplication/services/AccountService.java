package com.example.bankingapplication.services;

import com.example.bankingapplication.Domain.Account;
import com.example.bankingapplication.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        List<Account>accounts = new ArrayList<>();
        accountRepository.findAll().forEach(accounts::add);
        return accounts;
    }


    public void createAccount(Account account){
        accountRepository.save(account);
    }

    public Account getAccountByAccountId(Long id){
        return accountRepository.findOne(id);
    }


    public void updateAccount( Long id, Account account){
         accountRepository.save(account);
    }


    public void deleteAccount(Long id) {
        accountRepository.delete(id);
    }


}
