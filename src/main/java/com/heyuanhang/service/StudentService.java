package com.heyuanhang.service;

import com.heyuanhang.beans.Student;
import com.heyuanhang.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 何远航
 * @Date: 2021/9/15 10:46
 * @Version 1.8
 */
@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;

    //获取所有的学生的信息
    public List<Student> getAllStudent() {
        List<Student> allStudent = studentMapper.getAllStudent();
        return allStudent;
    }
}
