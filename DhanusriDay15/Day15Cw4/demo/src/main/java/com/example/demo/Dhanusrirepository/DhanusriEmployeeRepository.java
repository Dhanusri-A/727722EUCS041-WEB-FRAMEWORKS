package com.example.demo.Dhanusrirepository;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DhanusriEmployeeRepository extends JpaRepository<DhanusriEmployee, Integer> {
}