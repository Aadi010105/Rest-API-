package com.example.college_management_app;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> studentDb = new HashMap<>();

    public String addStudent(Student student) {
        if(studentDb.containsKey(student.getId())){
            return "Student Already Registered";
        }
        studentDb.put(student.getId(),student);
        return "Student Registered Successfully!!";
    }

    public Student getStudent(int id) {
        if(studentDb.containsKey(id)) {
            return studentDb.get(id);
        }

        return null;
    }

    public Student getStudentByName(String name) {
        for(Integer x: studentDb.keySet()){
            if(studentDb.get(x).getName().equals(name)){
                return studentDb.get(x);
            }
        }
        return null;
    }
}
