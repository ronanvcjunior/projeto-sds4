package com.desuperior.devvendas.dto;

import java.io.Serializable;

import com.desuperior.devvendas.entities.Seller;

public class SellerDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;

    public SellerDTO(Seller seller) {
        id = seller.getId();
        name = seller.getName();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
