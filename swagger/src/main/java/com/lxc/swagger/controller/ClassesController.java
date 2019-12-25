package com.lxc.swagger.controller;

import com.gitee.fastmybatis.core.query.Query;
import com.lxc.swagger.dao.ClassesMapper;
import com.lxc.swagger.entity.Classes;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClassesController {
    @Autowired
   private ClassesMapper classesMapper;
    @GetMapping("pageClasses")
    @ResponseBody
    //配置swagger的说明
    @ApiOperation(value ="根据给定的页数和页面大小来获取班级列表",httpMethod ="GET"
            ,response=Classes.class, notes="根据页面获取班级列表")
    public List<Classes> page1(int pageIndex, int pageSize) {
        Query query = new Query();
        query.page(pageIndex, pageSize);
        List<Classes> list = classesMapper.list(query);
        return list;
    }
}
