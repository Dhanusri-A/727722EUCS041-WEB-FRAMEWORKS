package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriPayRoll;
import com.example.demo.Dhanusrirepository.DhanusriPayrollRepo;

import org.springframework.stereotype.Service;

@Service
public class DhanusriPayrollService {
    private final DhanusriPayrollRepo payrollRepo;

    public DhanusriPayrollService(DhanusriPayrollRepo payrollRepo) {
        this.payrollRepo = payrollRepo;
    }

    public DhanusriPayRoll createPayroll(DhanusriPayRoll payroll) {
        return payrollRepo.save(payroll);
    }

    public DhanusriPayRoll getPayrollByEmployeeId(Long employeeId) {
        return payrollRepo.findById(employeeId).orElse(null);
    }
}
