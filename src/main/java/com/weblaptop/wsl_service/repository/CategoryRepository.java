package com.weblaptop.wsl_service.repository;

import com.weblaptop.wsl_service.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findCategoryByCode(String code);

}
