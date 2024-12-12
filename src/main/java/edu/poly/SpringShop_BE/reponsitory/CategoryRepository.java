package edu.poly.SpringShop_BE.reponsitory;

import edu.poly.SpringShop_BE.domain.Category;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
  List<Category> findByNameStartsWith(String name, Pageable pageable);
}