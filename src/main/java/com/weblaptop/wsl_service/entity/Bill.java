package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Bill extends Base{
    @Column
    private String name;
    
}
