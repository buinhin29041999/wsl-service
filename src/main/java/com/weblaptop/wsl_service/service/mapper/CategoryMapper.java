package com.weblaptop.wsl_service.service.mapper;

import com.weblaptop.wsl_service.entity.Category;
import com.weblaptop.wsl_service.service.dto.CategoryDTO;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface CategoryMapper {

    CategoryDTO toDTO(Category category);

    Category toEntity(CategoryDTO categoryDTO);

    List<CategoryDTO> lstEntityToDTO(List<Category> categoryList);

    void dtoToEntity(CategoryDTO categoryDTO, @MappingTarget Category category);
}
