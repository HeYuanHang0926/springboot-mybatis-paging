package com.heyuanhang;

import com.github.pagehelper.PageInfo;
import com.heyuanhang.beans.Student;
import com.heyuanhang.controller.StudentController;
import com.heyuanhang.mapper.StudentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisPageingApplicationTests {

    @Autowired
    private StudentMapper studentMapper;

    @Autowired
    private StudentController studentController;

    @Test
    void contextLoads() {
        List<Student> allStudent = studentMapper.getAllStudent();
        System.out.println(allStudent);
    }


    @Test
    public void testPageInfo() {
        PageInfo<Student> pageInfo = studentController.getAllStudent();
        System.out.println(pageInfo);
    }
}
