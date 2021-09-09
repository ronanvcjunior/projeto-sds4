package com.desuperior.devvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.desuperior.devvendas.entities.Sale;

public class SaleDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;

    public SaleDTO() {

    }

    public SaleDTO(Sale entity) {
        id = entity.getId();
        visited = entity.getVisited();
        deals = entity.getDeals();
        amount = entity.getAmount();
        date = entity.getDate();
        seller = new SellerDTO(entity.getSeller());
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setVisited(Integer visited) {
        this.visited = visited;
    }

    public Integer getVisited() {
        return visited;
    }

    public void setDeals(Integer deals) {
        this.deals = deals;
    }

    public Integer getDeals() {
        return deals;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    public LocalDate getDate() {
        return date;
    }

    public void setSeller(SellerDTO seller) {
        this.seller = seller;
    }

    public SellerDTO getSeller() {
        return seller;
    }
}
