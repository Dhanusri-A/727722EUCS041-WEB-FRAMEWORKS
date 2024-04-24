package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusrirepository.DhanusriStudentRepo;

@Service
public class DhanusriStudentService {
    @Autowired
    private DhanusriStudentRepo studentRepo;

    public boolean post(DhanusriStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DhanusriStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<DhanusriStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}

