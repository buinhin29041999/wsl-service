package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Table
@Entity
@Data
public class Product extends Base {
    @Column
    private String name;
    @Column
    private String thumbnail;
    @Column
    private String shortDescription;
    @Column
    private String content;
    @Column
    private Integer amount;
    @Column
    private Integer price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @OneToMany(mappedBy = "product")
    private List<Comment> comments;


}
