package com.lxc.swagger.dao;

import com.lxc.swagger.entity.Classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ClassesMapperTest {
    @Autowired ClassesMapper classesMapper;
    @Test
    public void saveClasses(){
        Classes classes=new Classes();
        classes.setId(1);
        classes.setCollege("航空航天学院");
        classes.setMajor("控制工程");
        classes.setStudentNumbers(48);
        classesMapper.save(classes);
    }

}