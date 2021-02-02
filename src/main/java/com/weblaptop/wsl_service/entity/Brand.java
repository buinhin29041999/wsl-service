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
public class Brand extends Base {
    @Column
    private String name;

    @Column
    private String content;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;
}
