package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusrirepository.StudentRepository;


@Service
public class StudentService {
    public StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public DhanusriStudent saveStudent(DhanusriStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DhanusriStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}
