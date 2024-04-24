package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
import com.example.demo.Dhanusriservice.DhanusriStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DhanusriStudentController {

     @Autowired
     public DhanusriStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<DhanusriStudent>> getDetails() {
          List<DhanusriStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<DhanusriStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DhanusriStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<DhanusriStudent> postMethodName(@RequestBody DhanusriStudent student) {

          DhanusriStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<DhanusriStudent>> sortedDetails(@PathVariable String field) {
          List<DhanusriStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<DhanusriStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<DhanusriStudent>>(list, HttpStatus.OK);

     }
}

