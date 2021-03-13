package com.weblaptop.wsl_service.service.dto;

import lombok.Data;

import java.util.Date;

@Data
public abstract class BaseDTO<T> {
    private Long id;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private String modifiedDate;


}
