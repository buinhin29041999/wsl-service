package com.weblaptop.wsl_service.service;

import com.weblaptop.wsl_service.service.dto.CategoryDTO;

import java.util.List;

public interface ICategoryService {
    List<CategoryDTO> findAll();

    CategoryDTO save(CategoryDTO categoryDTO);

    CategoryDTO update(CategoryDTO categoryDTO);
}
