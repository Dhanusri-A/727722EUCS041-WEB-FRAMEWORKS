package com.example.demo.Dhanusrirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Dhanusrimodel.DhanusriPerson;


public interface DhanusriPersonRepo extends JpaRepository<DhanusriPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<DhanusriPerson> findByAge(int age);
}

