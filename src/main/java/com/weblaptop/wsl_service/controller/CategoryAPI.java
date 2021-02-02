package com.weblaptop.wsl_service.controller;

import com.weblaptop.wsl_service.service.ICategoryService;
import com.weblaptop.wsl_service.service.dto.CategoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryAPI {

    @Autowired
    ICategoryService categoryService;

    @GetMapping
    public List<CategoryDTO> findAll() {
        return categoryService.findAll();
    }

    @PostMapping
    public CategoryDTO create(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.save(categoryDTO);
    }

    @PutMapping(value = "/{id}")
    public CategoryDTO update(@RequestBody CategoryDTO categoryDTO,@PathVariable("id") Long id) {
        categoryDTO.setId(id);
        return categoryService.update(categoryDTO);
    }
}
