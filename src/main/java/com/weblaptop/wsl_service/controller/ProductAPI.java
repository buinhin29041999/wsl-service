package com.weblaptop.wsl_service.controller;

import com.weblaptop.wsl_service.service.dto.ProductDTO;
import com.weblaptop.wsl_service.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductAPI {
    @Autowired
    ProductService productService;
//    @GetMapping
//    public Page<ProductDTO> findAll(@PageableDefault(size = 10)Pageable pageable){
//        Page<ProductDTO> all = productService.findAll();
//    }
}
