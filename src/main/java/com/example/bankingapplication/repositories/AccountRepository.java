package com.example.bankingapplication.repositories;

import com.example.bankingapplication.Domain.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
