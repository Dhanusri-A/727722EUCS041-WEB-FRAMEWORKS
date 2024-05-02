package com.example.demo.Dhanusricontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusriservice.DhanusriEmployeeService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class DhanusriEmployeeController {

    private static final Logger logger = LoggerFactory.getLogger(DhanusriEmployeeController.class);

    @Autowired
    private DhanusriEmployeeService EmployeeService;

    @GetMapping
    public ResponseEntity<List<DhanusriEmployee>> getAllEmployees() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/employees; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Employees", "N/A");
        List<DhanusriEmployee> Employees = EmployeeService.getAllEmployees();
        return ResponseEntity.ok(Employees);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DhanusriEmployee> getEmployeeById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/employees/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Employee details", "N/A");
        DhanusriEmployee Employee = EmployeeService.getEmployeeById(id);
        return ResponseEntity.ok(Employee);
    }

    @PostMapping
    public ResponseEntity<DhanusriEmployee> addEmployee(@RequestBody DhanusriEmployee Employee) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/employees; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Employee, HttpStatus.CREATED.value(), "Employee added successfully", "N/A");
        DhanusriEmployee savedEmployee = EmployeeService.addEmployee(Employee);
        return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }
}