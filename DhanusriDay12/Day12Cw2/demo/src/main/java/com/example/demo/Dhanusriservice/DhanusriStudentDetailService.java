package com.example.demo.Dhanusriservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriStudentDetail;
import com.example.demo.Dhanusrirepository.DhanusriStudentDetailRepository;
import com.example.demo.Dhanusrirepository.DhanusriStudentRepository;
@Service
public class DhanusriStudentDetailService {
    @Autowired
    DhanusriStudentDetailRepository studentDetailRepository;
    @Autowired
    DhanusriStudentRepository studentRepository;
    public DhanusriStudentDetail addStudentDetail(int id,DhanusriStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}