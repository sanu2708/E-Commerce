package com.example.ECommerce.Service;

import com.example.ECommerce.DTO.RequestDTO.SellerRequestDTO;
import com.example.ECommerce.DTO.ResponseDTO.SellerResponseDTO;
import com.example.ECommerce.Exceptions.DuplicateEmailId;
import com.example.ECommerce.Model.Seller;
import com.example.ECommerce.Repository.SellerRepository;
import com.example.ECommerce.Transformer.SellerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    SellerRepository sellerRepository;

    public SellerResponseDTO addSeller(SellerRequestDTO sellerRequestDTO) throws DuplicateEmailId {
        if(sellerRepository.findByEmailId(sellerRequestDTO.getEmailId())!=null)
        {
            throw new DuplicateEmailId("Duplicate EmailID");
        }
        Seller seller = SellerTransformer.SellerRequestDtoToSeller(sellerRequestDTO);
        Seller savedSeller = sellerRepository.save(seller);

        SellerResponseDTO sellerResponseDTO = SellerTransformer.SellerToSellerResponseDto(savedSeller);
        return sellerResponseDTO;
    }
}
