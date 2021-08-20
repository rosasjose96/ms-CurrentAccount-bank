package com.bootcamp.msCurrentAccount.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The type Customer.
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private String id;
    private String name;
    private String customerIdentityType;
    private String customerIdentityNumber;
    private CustomerType customerType;
    private String debitCard;
}
