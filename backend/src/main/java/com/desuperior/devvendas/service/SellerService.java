package com.desuperior.devvendas.service;

import java.util.List;
import java.util.stream.Collectors;

import com.desuperior.devvendas.dto.SellerDTO;
import com.desuperior.devvendas.entities.Seller;
import com.desuperior.devvendas.repositories.SellerRepository;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SellerService {
    
    private final SellerRepository sellerRepository;

    public List<SellerDTO> listAll() {
        List<Seller> result = sellerRepository.findAll();
        return result.stream().map(entity -> new SellerDTO(entity)).collect(Collectors.toList());
    }
}
