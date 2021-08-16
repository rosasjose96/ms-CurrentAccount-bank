package com.bootcamp.msCurrentAccount.repositories;

import com.bootcamp.msCurrentAccount.models.entities.Account;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface AccountRepository extends ReactiveMongoRepository<Account,String> {
    public Mono<Account> findByCustomerIdentityNumber(String customerIdentityNumber);
    public Mono<Account> findByAccountNumber(String accountNumber);
}
