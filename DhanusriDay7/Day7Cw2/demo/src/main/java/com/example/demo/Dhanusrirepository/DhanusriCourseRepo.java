package com.example.demo.Dhanusrirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriCourse;


@Repository
public interface DhanusriCourseRepo extends JpaRepository<DhanusriCourse, Integer> {

     List<DhanusriCourse> findByCourseName(String courseName);

}
