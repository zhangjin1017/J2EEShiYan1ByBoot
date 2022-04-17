package com.zj.entity;

import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "t_admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
}