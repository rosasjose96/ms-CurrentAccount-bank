package com.bootcamp.msCurrentAccount.services;

import com.bootcamp.msCurrentAccount.models.entities.Account;
import reactor.core.publisher.Mono;

public interface IAccountService extends ICRUDService<Account,String> {
    public Mono<Account> findByCustomerIdentityNumber(String customerIdentityNumber);
    public Mono<Account> validateCustomerIdentityNumber(String customerIdentityNumber);
    public Mono<Account> findByAccountNumber(String accountNumber);
}
