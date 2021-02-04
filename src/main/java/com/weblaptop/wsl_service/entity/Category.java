package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Table
@Entity
@Data
public class Category extends Base {
    @Column
    private String code;
    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
