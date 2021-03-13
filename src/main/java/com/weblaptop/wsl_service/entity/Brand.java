package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Brand extends Base {

    private String name;

    private String content;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;
}
