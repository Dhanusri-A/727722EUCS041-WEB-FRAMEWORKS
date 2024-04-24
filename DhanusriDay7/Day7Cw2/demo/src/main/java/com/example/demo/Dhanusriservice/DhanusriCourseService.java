package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriCourse;
import com.example.demo.Dhanusrirepository.DhanusriCourseRepo;


@Service
public class DhanusriCourseService {

     @Autowired
     public DhanusriCourseRepo courseRepo;

     public DhanusriCourse SaveEntity(DhanusriCourse entity) {
          return courseRepo.save(entity);

     }

     public List<DhanusriCourse> getDetails() {
          return courseRepo.findAll();

     }

     public List<DhanusriCourse> findByCourseName(String courseName) {
          return courseRepo.findByCourseName(courseName);
     }

}

