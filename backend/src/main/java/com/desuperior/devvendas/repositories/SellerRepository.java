package com.desuperior.devvendas.repositories;

import com.desuperior.devvendas.entities.Seller;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
    
}
