package com.weblaptop.wsl_service.controller;

import com.weblaptop.wsl_service.service.IUserService;
import com.weblaptop.wsl_service.service.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(value = "/user")
public class UserAPI {
    @Autowired
    private IUserService userService;


    @GetMapping(value = "/isExistUsername/{username}")
    public Boolean isExistUsername(@PathVariable(value = "username") String username) {
        return userService.isExistUsername(username);
    }

    @GetMapping(value = "/isExistEmail/{email}")
    public Boolean isExistEmail(@PathVariable(value = "email") String email) {
        return userService.isExistEmail(email);
    }


    @PostMapping(value = "register")
    public UserDTO create(@RequestBody UserDTO userDTO) {
        return userService.create(userDTO);
    }
}
