package com.weblaptop.wsl_service.service.impl;

import com.weblaptop.wsl_service.service.IProductService;
import com.weblaptop.wsl_service.service.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService {

    @Override
    public List<ProductDTO> findAll() {
        return null;
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
