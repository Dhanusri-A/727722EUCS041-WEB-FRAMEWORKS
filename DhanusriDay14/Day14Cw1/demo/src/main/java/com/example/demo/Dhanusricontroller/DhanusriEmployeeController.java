package com.example.demo.Dhanusricontroller;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusriservice.DhanusriEmployeeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class DhanusriEmployeeController {
    private final DhanusriEmployeeService employeeService;

    public DhanusriEmployeeController(DhanusriEmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public ResponseEntity<DhanusriEmployee> createEmployee(@RequestBody DhanusriEmployee employee) {
        DhanusriEmployee createdEmployee = employeeService.createEmployee(employee);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEmployee);
    }

    @GetMapping
    public ResponseEntity<List<DhanusriEmployee>> getAllEmployees() {
        List<DhanusriEmployee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<DhanusriEmployee> getEmployeeById(@PathVariable Long employeeId) {
        Optional<DhanusriEmployee> employee = employeeService.getEmployeeById(employeeId);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}

