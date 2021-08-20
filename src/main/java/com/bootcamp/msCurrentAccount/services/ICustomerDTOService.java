package com.bootcamp.msCurrentAccount.services;

import com.bootcamp.msCurrentAccount.models.dto.Customer;
import reactor.core.publisher.Mono;

/**
 * The interface Customer dto service.
 */
public interface ICustomerDTOService {
    /**
     * Gets customer.
     *
     * @param customerIdentityNumber the customer identity number
     * @return the customer
     */
    public Mono<Customer> getCustomer(String customerIdentityNumber);

    /**
     * New pan mono.
     *
     * @param id          the id
     * @param customerDTO the customer dto
     * @return the mono
     */
    public Mono<Customer> newPan(String id, Customer customerDTO);
}
