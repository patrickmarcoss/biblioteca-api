package com.iesb.apibiblioteca.repository;

import com.iesb.apibiblioteca.model.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
