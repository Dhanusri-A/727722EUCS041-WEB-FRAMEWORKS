package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;



@Repository
public interface DhanusriEmployeeRepo extends JpaRepository<DhanusriEmployee,Integer>{
    
}
