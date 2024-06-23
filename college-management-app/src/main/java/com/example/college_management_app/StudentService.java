package com.example.college_management_app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

//    StudentRepository studentRepository= new StudentRepository(); --->>> so now this is not REQUIRED

    @Autowired
    StudentRepository studentRepository;

    public String addStudent(Student student) {
//        student.setAge(student.getAge()+5);
        return studentRepository.addStudent(student);
    }

    public Student getStudent(int id) {
        return studentRepository.getStudent(id);
    }

    public Student getStudentByName(String name) {
        return studentRepository.getStudentByName(name);
    }
}
