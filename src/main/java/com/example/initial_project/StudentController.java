package com.example.initial_project;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class StudentController {
    HashMap<Integer,Student> map=new HashMap<>();
    @PostMapping("/registerStudent")
    public void addStudent(@RequestBody Student stu){
        int key=stu.getRollNo();
        map.put(key,stu);
    }
    @GetMapping("/getStudentInfo")
    public Student getStudent(@RequestParam("rollNo") Integer rollNo){
        return map.get(rollNo);
    }
}
