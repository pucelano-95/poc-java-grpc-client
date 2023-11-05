package com.drathveloper.pocgrpcclient.dto;

import java.time.LocalDate;

public record CreatedUserDto(Long id, String username,
                             String firstName,
                             String lastName,
                             String email,
                             String phone,
                             LocalDate birthDate,
                             String country,
                             String city,
                             String state,
                             String address,
                             String postalCode) {
}
