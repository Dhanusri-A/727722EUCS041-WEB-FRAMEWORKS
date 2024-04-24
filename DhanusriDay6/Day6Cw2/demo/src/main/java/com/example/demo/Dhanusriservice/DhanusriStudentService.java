package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusrirepository.DhanusriStudentRepo;


@Service
public class DhanusriStudentService {

     @Autowired
     public DhanusriStudentRepo studentRepo;

     public List<DhanusriStudent> getAll() {
          return studentRepo.findAll();
     }

     public DhanusriStudent post(DhanusriStudent student) {
          return studentRepo.save(student);
     }

     public List<DhanusriStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}

