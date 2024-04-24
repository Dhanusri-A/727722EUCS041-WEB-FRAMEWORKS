package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;


public interface DhanusriEmployeeRepo extends JpaRepository<DhanusriEmployee,Integer>{
    
}
