package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusrimodel.DhanusriStudentInfo;
import com.example.demo.Dhanusrirepository.DhanusriStudentInfoRepository;
import com.example.demo.Dhanusrirepository.DhanusriStudentRepository;

@Service
public class DhanusriStudentService {
    public DhanusriStudentRepository studentRepository;
    public DhanusriStudentInfoRepository studentInfoRepository;
    public DhanusriStudentService(DhanusriStudentRepository studentRepository,DhanusriStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public DhanusriStudent saveStudent(DhanusriStudent student)
    {
        return studentRepository.save(student);
    }
    public DhanusriStudentInfo saveStudentInfo(DhanusriStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<DhanusriStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

