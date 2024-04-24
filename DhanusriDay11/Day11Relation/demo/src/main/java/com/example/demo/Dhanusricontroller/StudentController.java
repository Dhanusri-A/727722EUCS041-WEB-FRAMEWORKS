package com.example.demo.Dhanusricontroller;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusriservice.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class StudentController {
    public StudentService studentService;
    public StudentController(StudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/student")
    public DhanusriStudent postMethodName(@RequestBody DhanusriStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<DhanusriStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}

