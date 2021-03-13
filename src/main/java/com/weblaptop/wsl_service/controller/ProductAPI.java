package com.weblaptop.wsl_service.controller;

import com.weblaptop.wsl_service.service.dto.ProductDTO;
import com.weblaptop.wsl_service.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductAPI {
    @Autowired
    ProductService productService;

    @CrossOrigin
    @GetMapping
    public Page<ProductDTO> findAll(@PageableDefault Pageable pageable) {
        return productService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ProductDTO findById(@PathVariable(name = "id") Long id) {
        return productService.findById(id);
    }


}
