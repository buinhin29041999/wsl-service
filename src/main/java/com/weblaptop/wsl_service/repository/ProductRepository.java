package com.weblaptop.wsl_service.repository;

import com.weblaptop.wsl_service.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
