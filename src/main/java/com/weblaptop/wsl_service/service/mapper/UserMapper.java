package com.weblaptop.wsl_service.service.mapper;

import com.weblaptop.wsl_service.entity.User;
import com.weblaptop.wsl_service.service.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "role.id", target = "roleId")
    UserDTO toDTO(User user);

    @Mapping(source = "roleId", target = "role.id")
    User toEntity(UserDTO userDTO);

    @Mapping(source = "role.id", target = "roleId")
    List<UserDTO> lstEntityToDTO(List<User> userList);
}
