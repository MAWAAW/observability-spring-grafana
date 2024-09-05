package com.example.observabilityspringgrafana.repositories;

import com.example.observabilityspringgrafana.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
