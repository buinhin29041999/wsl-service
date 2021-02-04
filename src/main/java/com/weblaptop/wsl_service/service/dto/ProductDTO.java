package com.weblaptop.wsl_service.service.dto;

import com.weblaptop.wsl_service.entity.Product;
import lombok.Data;

@Data
public class ProductDTO extends BaseDTO<Product> {
    private String title;
    private String shortDescription;
    private String name;
    private String content;
    private Integer amount;
    private Integer price;
    private Long categoryId;
    private Long brandId;
}
