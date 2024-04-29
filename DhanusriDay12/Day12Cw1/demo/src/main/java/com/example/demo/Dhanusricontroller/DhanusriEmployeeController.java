package com.example.demo.Dhanusricontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusriservice.DhanusriEmployeeService;


@RestController
public class DhanusriEmployeeController {
    @Autowired
    DhanusriEmployeeService employeeService;

    @PostMapping("/employee")
    public DhanusriEmployee setMethod(@RequestBody DhanusriEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<DhanusriEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<DhanusriEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}
