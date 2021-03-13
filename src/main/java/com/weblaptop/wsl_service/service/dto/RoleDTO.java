package com.weblaptop.wsl_service.service.dto;

import com.weblaptop.wsl_service.entity.Role;
import lombok.Data;

import java.util.List;

@Data
public class RoleDTO extends BaseDTO<Role> {
    private String name;
    private String code;
    private List<UserDTO> users;
}
