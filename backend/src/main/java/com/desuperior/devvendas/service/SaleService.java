package com.desuperior.devvendas.service;

import java.util.List;

import com.desuperior.devvendas.dto.SaleDTO;
import com.desuperior.devvendas.dto.SaleSuccessDTO;
import com.desuperior.devvendas.dto.SaleSumDTO;
import com.desuperior.devvendas.entities.Sale;
import com.desuperior.devvendas.repositories.SaleRepository;
import com.desuperior.devvendas.repositories.SellerRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaleService {
    private final SaleRepository saleRepository;

    private final SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> listAll(Pageable pageable) {
        sellerRepository.findAll();

        Page<Sale> result = saleRepository.findAll(pageable);
        return result.map(entity -> new SaleDTO(entity));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return saleRepository.successGroupedBySeller();
    }
}
