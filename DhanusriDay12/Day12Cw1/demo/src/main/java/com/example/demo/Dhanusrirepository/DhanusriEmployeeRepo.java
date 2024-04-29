package com.example.demo.Dhanusrirepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;

public interface DhanusriEmployeeRepo extends JpaRepository<DhanusriEmployee,Integer> {
 
    @Query(value = "SELECT e.* FROM employee e INNER JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<DhanusriEmployee> getByInnerEmployees();

    @Query(value = "SELECT e.* FROM employee e LEFT JOIN address a ON e.id = a.employee_id",nativeQuery = true)
    List<DhanusriEmployee> getByLeftOuterEmployees();
}