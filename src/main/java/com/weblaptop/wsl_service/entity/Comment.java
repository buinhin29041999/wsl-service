package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data
public class Comment extends Base {
    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
