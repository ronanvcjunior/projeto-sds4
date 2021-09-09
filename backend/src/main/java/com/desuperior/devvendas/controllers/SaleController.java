package com.desuperior.devvendas.controllers;

import java.util.List;

import com.desuperior.devvendas.dto.SaleDTO;
import com.desuperior.devvendas.dto.SaleSuccessDTO;
import com.desuperior.devvendas.dto.SaleSumDTO;
import com.desuperior.devvendas.service.SaleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> list(Pageable pageable) {
        return ResponseEntity.ok(saleService.listAll(pageable));
    }

    @GetMapping(value = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        return ResponseEntity.ok(saleService.amountGroupedBySeller());
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        return ResponseEntity.ok(saleService.successGroupedBySeller());
    }

}
