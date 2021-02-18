package com.weblaptop.wsl_service.service;

import com.weblaptop.wsl_service.entity.Product;
import com.weblaptop.wsl_service.service.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Page<ProductDTO> findAll(Pageable pageable);

    ProductDTO create(ProductDTO productDTO);

    ProductDTO update(ProductDTO productDTO);

    void delete(Long[] ids);
}
