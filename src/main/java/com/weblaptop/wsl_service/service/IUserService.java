package com.weblaptop.wsl_service.service;

import com.weblaptop.wsl_service.service.dto.UserDTO;

import java.util.List;

public interface IUserService {
    List<UserDTO> findAll();
}
