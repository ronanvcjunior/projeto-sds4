package com.desuperior.devvendas.dto;

import java.io.Serializable;

import com.desuperior.devvendas.entities.Seller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double sumAmount;

    public SaleSumDTO(Seller seller, Double sumAmount) {
        this.sellerName = seller.getName();
        this.sumAmount = sumAmount;
    }
}
