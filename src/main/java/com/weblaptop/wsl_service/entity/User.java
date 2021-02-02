package com.weblaptop.wsl_service.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
@Data
public class User extends Base{
    @Column
    private String userName;
    @Column
    private String passWord;
    @Column
    private String fullName;
    @Column
    private String thumbnail;
    @Column
    private String status;
    @Column
    private String email;
    @Column
    private String address;
    @Column
    private String phone;
    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Comment> comments;

}
