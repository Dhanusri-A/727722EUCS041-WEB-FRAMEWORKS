package com.example.demo.Dhanusriservice;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriJob;
import com.example.demo.Dhanusrirepository.DhanusriJobRepo;



@Service
public class DhanusriJobService {

     @Autowired
     public DhanusriJobRepo jobRepo;

     public List<DhanusriJob> getList() {
          return jobRepo.findAll();
     }

     public DhanusriJob postJob(DhanusriJob job) {
          return jobRepo.save(job);
     }

     public Optional<DhanusriJob> getId(int jobId) {
          return jobRepo.findById(jobId);
     }

}