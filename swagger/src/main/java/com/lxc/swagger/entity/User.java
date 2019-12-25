package com.lxc.swagger.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //姓名
    private String name;
    //座右铭
    private String motto;
    //专长
    private String expertise;
}
