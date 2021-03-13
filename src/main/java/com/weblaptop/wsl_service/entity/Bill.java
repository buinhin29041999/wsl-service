package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class Bill extends Base {
    private String name;

}
