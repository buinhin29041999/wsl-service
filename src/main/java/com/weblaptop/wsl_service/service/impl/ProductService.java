package com.weblaptop.wsl_service.service.impl;

import com.weblaptop.wsl_service.entity.Product;
import com.weblaptop.wsl_service.repository.ProductRepository;
import com.weblaptop.wsl_service.service.IProductService;
import com.weblaptop.wsl_service.service.dto.ProductDTO;
import com.weblaptop.wsl_service.service.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    @Override
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> productPage = productRepository.findAll(pageable);
        List<ProductDTO> productDTOS = productMapper.lstEntitytoDTO(productPage.getContent());
        return new PageImpl<>(productDTOS, pageable, productPage.getTotalElements());
    }

    @Override
    public ProductDTO findById(Long id) {
        return productRepository.findById(id)
                .map(productMapper::toDTO)
                .orElseThrow(() -> new RuntimeException("exeption"));
    }

    @Override
    public ProductDTO create(ProductDTO productDTO) {
        return null;
    }

    @Override
    public ProductDTO update(ProductDTO productDTO) {
        return null;
    }

    @Override
    public void delete(Long[] ids) {

    }
}
