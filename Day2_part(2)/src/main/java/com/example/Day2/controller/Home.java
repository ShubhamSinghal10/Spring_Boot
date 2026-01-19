package com.example.Day2.controller;

import com.example.Day2.model.studentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Home {

    @GetMapping("/")
    public List<studentModel> getStudent(){
        List<studentModel> list = new ArrayList<>();
        studentModel student1 = new studentModel(1, "shubham", "sh@gmail.com");
        studentModel student2 = new studentModel(1, "shubham", "sh@gmail.com");
        studentModel student3 = new studentModel(1, "shubham", "sh@gmail.com");
        studentModel student4 = new studentModel(1, "shubham", "sh@gmail.com");
        studentModel student5 = new studentModel(1, "shubham", "sh@gmail.com");

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        return list;



    }
}

