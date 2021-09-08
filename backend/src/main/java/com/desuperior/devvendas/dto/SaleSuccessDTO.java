package com.desuperior.devvendas.dto;

import java.io.Serializable;

import com.desuperior.devvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long sellerVisited;
    private Long sellerDeals;

    public SaleSuccessDTO(Seller seller, Long sellerVisited, Long sellerDeals) {
        this.sellerName = seller.getName();
        this.sellerVisited = sellerVisited;
        this.sellerDeals = sellerDeals;
    }
}
