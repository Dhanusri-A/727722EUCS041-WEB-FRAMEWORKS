package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public boolean postEmployee(DhanusriEmployee employee)
    {
        try{

            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhanusriEmployee> sortEmployee(String field)
    {
        return employeeRepo.findAll(Sort.by(field));
    }
    public List<DhanusriEmployee> paginationEmployee(int pageno,int size)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size)).getContent();
    }
    public List<DhanusriEmployee>  sortPaginationEmployee(int pageno,int size,String field)
    {
        return employeeRepo.findAll(PageRequest.of(pageno, size,Sort.by(field))).getContent();
    }
}