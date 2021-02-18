package com.weblaptop.wsl_service.service.impl;

import com.weblaptop.wsl_service.constant.Constant;
import com.weblaptop.wsl_service.entity.User;
import com.weblaptop.wsl_service.repository.UserRepository;
import com.weblaptop.wsl_service.service.IUserService;
import com.weblaptop.wsl_service.service.dto.UserDTO;
import com.weblaptop.wsl_service.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public List<UserDTO> findAll() {
        List<User> userList = userRepository.findAll();
        return userMapper.lstEntityToDTO(userList);
    }

    @Override
    public UserDTO create(UserDTO userDTO) {
        userDTO.setRoleId(Constant.USER);
        userDTO.setStatus("1");
        System.out.println();
        userDTO.setPassword(passwordEncoder.encode(userDTO.getPassword()));
        User user = userMapper.toEntity(userDTO);
        user = userRepository.save(user);
        return userMapper.toDTO(user);
    }

    @Override
    public Boolean isExistUsername(String username) {
        User user = userRepository.findByUsername(username);
        return user != null;
    }

    @Override
    public Boolean isExistEmail(String email) {
        User user = userRepository.findByEmail(email);
        return user != null;
    }
}
