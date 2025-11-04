package com.acrux95.code.customer_microservice.Customer;

import lombok.Builder;

@Builder
public record CustomerResponse(
        String id,
        String firstName,
        String lastName,
        String email,
        String phone,
        String address,
        String city
) {

}
