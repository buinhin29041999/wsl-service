package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Role extends Base {

    private String code;

    private String name;

    @OneToMany(mappedBy = "role")
    private List<User> users;

}
