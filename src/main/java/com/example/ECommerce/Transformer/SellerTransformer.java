package com.example.ECommerce.Transformer;

import com.example.ECommerce.DTO.RequestDTO.SellerRequestDTO;
import com.example.ECommerce.DTO.ResponseDTO.SellerResponseDTO;
import com.example.ECommerce.Model.Seller;

public class SellerTransformer {
    public static Seller SellerRequestDtoToSeller(SellerRequestDTO sellerRequestDTO)
    {
       return Seller.builder()
                .name(sellerRequestDTO.getName())
                .age(sellerRequestDTO.getAge())
                .mobno(sellerRequestDTO.getMobno())
                .emailId(sellerRequestDTO.getEmailId())
                .address(sellerRequestDTO.getAddress())
                .build();
    }

    public static SellerResponseDTO SellerToSellerResponseDto(Seller seller)
    {
        return SellerResponseDTO.builder()
                .name(seller.getName())
                .message("Seller added SuccessFully!!").build();
    }
}
