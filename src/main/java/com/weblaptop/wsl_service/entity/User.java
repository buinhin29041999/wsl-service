package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class User extends Base {
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;

    private String fullName;

    private String thumbnail;

    private String status;
    @Column(nullable = false, unique = true)
    private String email;

    private String address;

    private String phone;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

}
