package com.example.demo.Dhanusricontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriStudentDetail;
import com.example.demo.Dhanusriservice.DhanusriStudentDetailService;

@RestController
public class DhanusriStudentDetailController {
    @Autowired
    DhanusriStudentDetailService studentDetailService;
    
    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<DhanusriStudentDetail> addStudentDetails(@PathVariable int id,@RequestBody DhanusriStudentDetail studentDetail)
    {
       return new ResponseEntity<>(studentDetailService.addStudentDetail(id,studentDetail),HttpStatus.CREATED);
    }
    
}
