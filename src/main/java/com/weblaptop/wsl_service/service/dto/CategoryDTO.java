package com.weblaptop.wsl_service.service.dto;

import com.weblaptop.wsl_service.entity.Category;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDTO extends BaseDTO<Category> {
    private String code;
    private String name;
    private List<ProductDTO> products;
}
