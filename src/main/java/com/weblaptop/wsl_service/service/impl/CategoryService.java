package com.weblaptop.wsl_service.service.impl;

import com.weblaptop.wsl_service.entity.Category;
import com.weblaptop.wsl_service.repository.CategoryRepository;
import com.weblaptop.wsl_service.service.ICategoryService;
import com.weblaptop.wsl_service.service.dto.CategoryDTO;
import com.weblaptop.wsl_service.service.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    @Modifying
    @Transactional(readOnly = true)
    @Override
    public List<CategoryDTO> findAll() {
        List<Category> dtoList = categoryRepository.findAll();
        return categoryMapper.lstEntityToDTO(dtoList);
    }

    @Override
    public CategoryDTO create(CategoryDTO categoryDTO) {
        Category category = categoryMapper.toEntity(categoryDTO);
        category = categoryRepository.save(category);
        return categoryMapper.toDTO(category);
    }

    @Override
    public CategoryDTO update(CategoryDTO categoryDTO) {
        Category oldCategory = categoryRepository.getOne(categoryDTO.getId());
        categoryMapper.dtoToEntity(categoryDTO, oldCategory);
        return categoryMapper.toDTO(oldCategory);
    }

    @Override
    public void delete(Long[] ids) {
        for (long id : ids)
            categoryRepository.deleteById(id);
    }


}
