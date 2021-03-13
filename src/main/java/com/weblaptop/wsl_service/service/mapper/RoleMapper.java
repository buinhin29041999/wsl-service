package com.weblaptop.wsl_service.service.mapper;

import com.weblaptop.wsl_service.entity.Role;
import com.weblaptop.wsl_service.service.dto.RoleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface RoleMapper {

    RoleDTO toDTO(Role role);

    Role toEntity(RoleDTO roleDTO);


}
