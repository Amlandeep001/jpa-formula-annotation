package com.jpa.formula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.formula.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
