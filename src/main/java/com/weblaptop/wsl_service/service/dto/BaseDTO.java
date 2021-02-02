package com.weblaptop.wsl_service.service.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public abstract class BaseDTO<T> {
    private Long id;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private String modifiedDate;
    private List<T> listResult = new ArrayList<>();

}
