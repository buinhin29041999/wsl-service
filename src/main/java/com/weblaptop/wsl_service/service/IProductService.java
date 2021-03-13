package com.weblaptop.wsl_service.service;

import com.weblaptop.wsl_service.service.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<ProductDTO> findAll(Pageable pageable);

    ProductDTO findById(Long id);

    ProductDTO create(ProductDTO productDTO);

    ProductDTO update(ProductDTO productDTO);

    void delete(Long[] ids);
}
