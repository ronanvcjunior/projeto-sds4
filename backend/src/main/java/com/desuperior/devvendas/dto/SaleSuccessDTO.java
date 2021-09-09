package com.desuperior.devvendas.dto;

import java.io.Serializable;

import com.desuperior.devvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Long sellerVisited;
    private Long sellerDeals;

    public SaleSuccessDTO() {

    }

    public SaleSuccessDTO(Seller seller, Long sellerVisited, Long sellerDeals) {
        this.sellerName = seller.getName();
        this.sellerVisited = sellerVisited;
        this.sellerDeals = sellerDeals;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerVisited(Long sellerVisited) {
        this.sellerVisited = sellerVisited;
    }

    public Long getSellerVisited() {
        return sellerVisited;
    }

    public void setSellerDeals(Long sellerDeals) {
        this.sellerDeals = sellerDeals;
    }
    
    public Long getSellerDeals() {
        return sellerDeals;
    }
}
