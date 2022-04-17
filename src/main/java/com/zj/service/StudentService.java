package com.zj.service;

import com.zj.entity.Admin;
import com.zj.entity.Student;

import java.util.List;

public interface StudentService {
    //获取所有学生信息
    List<Student> getAllStudent();
    //删除学生信息
    void deleteStudent(Integer id);
    //根据id获取学生信息
    Student getStudentById(Integer id);
    //添加学生信息
    int addStudent(Student student);
    //修改学生信息
    int updateStudent(Student student);
}
