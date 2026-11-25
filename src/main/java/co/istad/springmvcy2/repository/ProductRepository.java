package co.istad.springmvcy2.repository;

import co.istad.springmvcy2.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {


}
