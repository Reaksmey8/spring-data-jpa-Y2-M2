package co.istad.springmvcy2.repository;

import co.istad.springmvcy2.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
