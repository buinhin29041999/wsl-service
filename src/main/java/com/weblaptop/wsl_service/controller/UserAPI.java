package com.weblaptop.wsl_service.controller;

import com.weblaptop.wsl_service.service.IUserService;
import com.weblaptop.wsl_service.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAPI {
    @Autowired
    private IUserService userService;

    @GetMapping(value = "employee")
    public List<UserDTO> findAll() {
        return userService.findAll();
    }
}
