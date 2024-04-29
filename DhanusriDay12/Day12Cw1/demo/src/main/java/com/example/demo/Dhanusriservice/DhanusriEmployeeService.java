package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusrirepository.DhanusriEmployeeRepo;


@Service
public class DhanusriEmployeeService {
    @Autowired
    DhanusriEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public DhanusriEmployee setEmployee(DhanusriEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<DhanusriEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<DhanusriEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}

