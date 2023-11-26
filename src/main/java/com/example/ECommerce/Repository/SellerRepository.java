package com.example.ECommerce.Repository;

import com.example.ECommerce.DTO.ResponseDTO.SellerResponseDTO;
import com.example.ECommerce.Model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller,Integer> {
    Seller findByEmailId(String emailId);
}
