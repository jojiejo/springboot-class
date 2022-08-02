package com.ecommerce.ecommerce.repository;

import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);
}
