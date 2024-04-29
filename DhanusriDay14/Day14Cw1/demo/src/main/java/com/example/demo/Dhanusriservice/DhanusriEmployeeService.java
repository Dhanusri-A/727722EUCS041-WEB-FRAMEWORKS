package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusrirepository.DhanusriEmployeeRepo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DhanusriEmployeeService {
    private final DhanusriEmployeeRepo employeeRepo;

    public DhanusriEmployeeService(DhanusriEmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    public DhanusriEmployee createEmployee(DhanusriEmployee employee) {
        return employeeRepo.save(employee);
    }

    public List<DhanusriEmployee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<DhanusriEmployee> getEmployeeById(Long id) {
        return employeeRepo.findById(id);
    }
}
