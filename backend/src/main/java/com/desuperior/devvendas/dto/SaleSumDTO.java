package com.desuperior.devvendas.dto;

import java.io.Serializable;

import com.desuperior.devvendas.entities.Seller;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sumAmount;

    public SaleSumDTO(Seller seller, Double sumAmount) {
        this.sellerName = seller.getName();
        this.sumAmount = sumAmount;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSumAmount(Double sumAmount) {
        this.sumAmount = sumAmount;
    }

    public Double getSumAmount() {
        return sumAmount;
    }
}
