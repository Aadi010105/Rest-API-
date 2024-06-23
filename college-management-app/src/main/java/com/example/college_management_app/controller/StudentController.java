package com.example.college_management_app.controller;

import com.example.college_management_app.Student;
import com.example.college_management_app.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

//    StudentService studentService = new StudentService(); --->> NOT REQ. as @RestController is THERE

    @Autowired
    StudentService studentService;

    @PostMapping("/student/add")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/student/get")
    public Student getStudent(@RequestParam("id") int id /*,@RequestParam("name")  String name*/){

        return studentService.getStudent(id);
    }

    @GetMapping("/student/get/{name}")
    public Student getStudentByName(@PathVariable("name") String name){
        return studentService.getStudentByName(name);
    }
}
