package com.weblaptop.wsl_service.service.dto;

import com.weblaptop.wsl_service.entity.User;
import lombok.Data;

@Data
public class UserDTO extends BaseDTO<User> {
    private String username;
    private String password;
    private String fullName;
    private String thumbnail;
    private String status;
    private String email;
    private String address;
    private String phone;
    private Long roleId;
}
