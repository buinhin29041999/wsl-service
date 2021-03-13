package com.weblaptop.wsl_service.service.mapper;

import com.weblaptop.wsl_service.entity.User;
import com.weblaptop.wsl_service.service.dto.UserDTO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(source = "role.id", target = "roleId")
    UserDTO toDTO(User user);

    @InheritInverseConfiguration
    User toEntity(UserDTO userDTO);

    List<UserDTO> lstEntityToDTO(List<User> userList);

    void dtoToEntity(UserDTO userDTO, @MappingTarget User user);
}
