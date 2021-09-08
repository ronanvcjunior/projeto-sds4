package com.desuperior.devvendas.controllers;

import java.util.List;

import com.desuperior.devvendas.dto.SellerDTO;
import com.desuperior.devvendas.service.SellerService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("sellers")
@RequiredArgsConstructor
public class SellerController {
    private final SellerService sellerService;

    @GetMapping()
    public ResponseEntity<List<SellerDTO>> listAll() {
        return ResponseEntity.ok(sellerService.listAll());
    }
}
