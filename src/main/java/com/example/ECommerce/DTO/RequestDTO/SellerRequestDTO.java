package com.example.ECommerce.DTO.RequestDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SellerRequestDTO {
    String name;
    String emailId;
    int age;
    String mobno;
    String address;
}
