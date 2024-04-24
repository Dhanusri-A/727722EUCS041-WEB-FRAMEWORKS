package com.example.demo.Dhanusriservice;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriEmployee;
import com.example.demo.Dhanusrirepository.DhanusriEmployeeRepo;


@Service
public class DhanusriEmployeeService {
    public DhanusriEmployeeRepo employeeRepo;
    public DhanusriEmployeeService(DhanusriEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(DhanusriEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DhanusriEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public DhanusriEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}
