package com.example.college_management_app;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Student {

     int id;

     String name;

     int age;

     long mobile;

     String department;

}
