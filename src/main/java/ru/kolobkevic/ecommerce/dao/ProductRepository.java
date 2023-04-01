package ru.kolobkevic.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kolobkevic.ecommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}