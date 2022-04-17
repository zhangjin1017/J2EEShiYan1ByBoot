package com.zj.service.impl;

import com.zj.entity.Admin;
import com.zj.entity.Student;
import com.zj.repo.AdminRepository;
import com.zj.repo.StudentRepository;
import com.zj.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Integer id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Student getStudentById(Integer id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public int addStudent(Student student) {
       return studentRepository.save(student).getId();
    }

    @Override
    public int updateStudent(Student student) {
        return studentRepository.save(student).getId();
    }


}
