package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;


@Entity
@Data
public class Category extends Base {

    private String code;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
