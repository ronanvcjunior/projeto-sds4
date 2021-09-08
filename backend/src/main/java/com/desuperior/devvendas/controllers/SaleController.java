package com.desuperior.devvendas.controllers;

import com.desuperior.devvendas.dto.SaleDTO;
import com.desuperior.devvendas.service.SaleService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("sales")
@RequiredArgsConstructor
public class SaleController {
    private final SaleService saleService;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> list(Pageable pageable) {
        return ResponseEntity.ok(saleService.listAll(pageable));
    }

}
