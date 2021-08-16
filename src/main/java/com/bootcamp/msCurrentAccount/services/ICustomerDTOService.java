package com.bootcamp.msCurrentAccount.services;

import com.bootcamp.msCurrentAccount.models.dto.Customer;
import reactor.core.publisher.Mono;

public interface ICustomerDTOService {
    public Mono<Customer> getCustomer(String customerIdentityNumber);
    public Mono<Customer> newPan(String id, Customer customerDTO);
}
