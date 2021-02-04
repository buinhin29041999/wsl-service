package com.weblaptop.wsl_service.service;

import com.weblaptop.wsl_service.entity.Product;
import com.weblaptop.wsl_service.service.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll();

    ProductDTO create(ProductDTO productDTO);

    ProductDTO update(ProductDTO productDTO);

    void delete(Long[] ids);
}
