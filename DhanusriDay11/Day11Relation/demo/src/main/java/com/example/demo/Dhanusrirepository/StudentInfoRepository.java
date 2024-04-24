package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriStudentInfo;


@Repository
public interface StudentInfoRepository extends JpaRepository<DhanusriStudentInfo,Integer>{
    
}
