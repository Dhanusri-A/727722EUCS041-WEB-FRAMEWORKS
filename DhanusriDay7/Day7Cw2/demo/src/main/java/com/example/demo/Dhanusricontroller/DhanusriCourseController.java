package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriCourse;
import com.example.demo.Dhanusriservice.DhanusriCourseService;


@RestController
public class DhanusriCourseController {

     @Autowired
     public DhanusriCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<DhanusriCourse> postMethodName(@RequestBody DhanusriCourse entity) {

          DhanusriCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<DhanusriCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<DhanusriCourse>> getMethodName() {

          List<DhanusriCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<DhanusriCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<DhanusriCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<DhanusriCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}
