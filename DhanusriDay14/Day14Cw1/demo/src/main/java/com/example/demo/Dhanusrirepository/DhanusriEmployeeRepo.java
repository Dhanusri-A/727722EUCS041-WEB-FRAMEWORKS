package com.example.demo.Dhanusrirepository;
import com.example.demo.Dhanusrimodel.DhanusriEmployee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DhanusriEmployeeRepo extends JpaRepository<DhanusriEmployee, Long> {
}