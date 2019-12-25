package com.lxc.swagger.entity;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import javax.persistence.*;
@Data
@Table(name = "classes")
@ApiModel(value = "com.lxc.swagger.entity.Classes", description = "班级字段特征")
public class Classes {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//班级编号
    private int studentNumbers;//学生人数
    private  String major;//专业
    private String college;//所属学院
}
