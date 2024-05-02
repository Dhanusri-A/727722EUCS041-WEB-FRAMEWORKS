package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusrirepository.DhanusriEmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhanusriEmployeeService {

    @Autowired
    private DhanusriEmployeeRepository employeeRepository;

    public List<DhanusriEmployee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public DhanusriEmployee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public DhanusriEmployee addEmployee(DhanusriEmployee employee) {
        return employeeRepository.save(employee);
    }
}