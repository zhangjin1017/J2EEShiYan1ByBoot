package com.zj.controller;

import com.zj.entity.Admin;
import com.zj.entity.Student;
import com.zj.entity.resp.RestBean;
import com.zj.service.AdminService;
import com.zj.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Resource
    StudentService studentService;
    @GetMapping("/getAllStudent")
    public RestBean<List<Student>> getAllStudent(){
        List<Student> studentList = studentService.getAllStudent();
        return new RestBean<List<Student>>(200,"请求成功",studentList);
    }
    @PostMapping("/deleteStudent")
    public RestBean<Student> deleteStudent(@RequestParam("id") Integer id){
        Student student = studentService.getStudentById(id);
        studentService.deleteStudent(id);
        return new RestBean<Student>(200,"请求成功",student);
    }
    @PostMapping("/addStudent")
    public RestBean<Student> addStudent(@RequestParam("name") String name,@RequestParam("age") Integer age,@RequestParam("gender") String gender,@RequestParam("place") String place){
        Student student=new Student();
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setPlace(place);
        int id = studentService.addStudent(student);
        Student student1 = studentService.getStudentById(id);
        return new RestBean<Student>(200,"请求成功",student1);
    }
    @PostMapping("/updateStudent")
    public RestBean<List<Student>> updateStudent(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("age") Integer age,@RequestParam("gender") String gender,@RequestParam("place") String place){
        Student student=new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setGender(gender);
        student.setPlace(place);
        int id1 = studentService.updateStudent(student);
        List<Student> studentList = studentService.getAllStudent();
        return new RestBean<List<Student>>(200,"请求成功",studentList);
    }
}
