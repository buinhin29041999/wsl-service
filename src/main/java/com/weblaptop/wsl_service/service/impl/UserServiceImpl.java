package com.weblaptop.wsl_service.service.impl;

import com.weblaptop.wsl_service.entity.User;
import com.weblaptop.wsl_service.repository.UserRepository;
import com.weblaptop.wsl_service.service.IUserService;
import com.weblaptop.wsl_service.service.dto.UserDTO;
import com.weblaptop.wsl_service.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserDTO> findAll() {
        List<User> userList = userRepository.findAll();
        return userMapper.lstEntityToDTO(userList);
    }
}
