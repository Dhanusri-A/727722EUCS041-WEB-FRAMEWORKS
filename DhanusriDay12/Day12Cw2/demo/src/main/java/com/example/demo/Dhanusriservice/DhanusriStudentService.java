package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusrirepository.DhanusriStudentRepository;

@Service
public class DhanusriStudentService {
    @Autowired
    DhanusriStudentRepository studentRepository;
    public DhanusriStudent addStudents(DhanusriStudent student)
    {
        return studentRepository.save(student);
    }
    public List<DhanusriStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<DhanusriStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<DhanusriStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}
