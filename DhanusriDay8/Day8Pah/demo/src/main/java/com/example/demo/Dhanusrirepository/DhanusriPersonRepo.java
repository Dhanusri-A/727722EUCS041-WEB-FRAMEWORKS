package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriPerson;

import java.util.List;


@Repository
public interface DhanusriPersonRepo extends JpaRepository<DhanusriPerson,Integer>{

    List<DhanusriPerson> findByLastnameNot(String lastname);
    List<DhanusriPerson> findByAgeNotIn(List<Integer> ages);
    
}

