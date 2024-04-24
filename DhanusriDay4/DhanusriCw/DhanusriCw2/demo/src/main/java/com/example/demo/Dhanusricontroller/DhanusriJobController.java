package com.example.demo.Dhanusricontroller;



import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriJob;
import com.example.demo.Dhanusriservice.DhanusriJobService;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

public class DhanusriJobController {

     @Autowired
     public DhanusriJobService jobService;

     @GetMapping("/api/job")
     public ResponseEntity<List<DhanusriJob>> displayDetails() {
          List<DhanusriJob> list = jobService.getList();
          if (list.isEmpty()) {
               return new ResponseEntity<>(HttpStatus.NOT_FOUND);
          } else {

               return new ResponseEntity<>(list, HttpStatus.OK);
          }

     }

     @PostMapping("/api/job")
     public DhanusriJob postMethodName(@RequestBody DhanusriJob job) {
          return jobService.postJob(job);
     }

     @GetMapping("/api/job/{jobId}")
     public ResponseEntity<Optional<DhanusriJob>> getMethodName(@PathVariable int jobId) {

          Optional<DhanusriJob> Id = jobService.getId(jobId);
          if (Id.isPresent()) {
               return new ResponseEntity<>(Id, HttpStatus.OK);
          }
          return new ResponseEntity<Optional<DhanusriJob>>(Id, HttpStatus.NOT_FOUND);

     }

}