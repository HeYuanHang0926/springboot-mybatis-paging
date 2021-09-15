package com.heyuanhang.controller;

import com.github.pagehelper.PageInfo;
import com.heyuanhang.beans.Student;
import com.heyuanhang.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

/**
 * @Author 何远航
 * @Date: 2021/9/15 10:46
 * @Version 1.8
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public PageInfo<Student> getAllStudent() {
        List<Student> allStudent = studentService.getAllStudent();
        PageInfo<Student> pageInfo = new PageInfo<>(allStudent);
        return pageInfo;
    }
}
