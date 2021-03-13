package com.weblaptop.wsl_service.service.mapper;

import com.weblaptop.wsl_service.entity.Product;
import com.weblaptop.wsl_service.service.dto.ProductDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mapping(source = "category.id", target = "categoryId")
    @Mapping(source = "brand.id", target = "brandId")
    ProductDTO toDTO(Product product);

    @InheritInverseConfiguration
    Product toEntity(ProductDTO productDTO);

    List<ProductDTO> lstEntitytoDTO(List<Product> productList);

    void dtoToEntity(ProductDTO productDTO, @MappingTarget Product product);
}
