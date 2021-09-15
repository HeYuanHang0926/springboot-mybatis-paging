package com.heyuanhang.mapper;

import com.heyuanhang.beans.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 何远航
 * @Date: 2021/9/15 10:45
 * @Version 1.8
 */
@Repository
@Mapper
public interface StudentMapper {
    //查询所有的学生信息
    public List<Student> getAllStudent();
}
