package com.example.ECommerce.Controller;

import com.example.ECommerce.DTO.RequestDTO.SellerRequestDTO;
import com.example.ECommerce.DTO.ResponseDTO.SellerResponseDTO;
import com.example.ECommerce.Service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpRequest;

@RestController
@RequestMapping("/seller")
public class SellerController {
    @Autowired
    SellerService sellerService;

    @PostMapping("/add")
    public ResponseEntity addSeller(@RequestBody SellerRequestDTO sellerRequestDTO)
    {
        try {
            SellerResponseDTO sellerResponseDTO =  sellerService.addSeller(sellerRequestDTO);
            return new ResponseEntity(sellerResponseDTO, HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
