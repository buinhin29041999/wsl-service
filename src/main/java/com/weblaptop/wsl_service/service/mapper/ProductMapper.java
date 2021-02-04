package com.weblaptop.wsl_service.service.mapper;

import com.weblaptop.wsl_service.entity.Product;
import com.weblaptop.wsl_service.service.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "brand.id", target = "brandId")
    ProductDTO toDTO(Product product);

    @Mapping(source = "categoryId", target = "category.id")
    @Mapping(source = "brandId", target = "brand.id")
    Product toEntity(ProductDTO productDTO);

    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "brand.id", target = "brandId")
    List<ProductDTO> lstEntitytoDTO(List<Product> productList);


}
