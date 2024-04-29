package com.example.demo.Dhanusricontroller;

import com.example.demo.Dhanusrimodel.DhanusriPayRoll;
import com.example.demo.Dhanusriservice.DhanusriPayrollService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee/{employeeId}/payroll")
public class DhanusriPayrollController {
    private final DhanusriPayrollService payrollService;

    public DhanusriPayrollController(DhanusriPayrollService payrollService) {
        this.payrollService = payrollService;
    }

    @PostMapping
    public ResponseEntity<DhanusriPayRoll> createPayrollForEmployee(@PathVariable Long employeeId, @RequestBody DhanusriPayRoll payroll) {
        DhanusriPayRoll createdPayroll = payrollService.createPayroll(payroll);
        if (createdPayroll != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(createdPayroll);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @GetMapping
    public ResponseEntity<DhanusriPayRoll> getPayrollForEmployee(@PathVariable Long employeeId) {
        DhanusriPayRoll payroll = payrollService.getPayrollByEmployeeId(employeeId);
        if (payroll != null) {
            return ResponseEntity.ok(payroll);
        } else {
            return ResponseEntity.status(404).build();
        }
    }
}
