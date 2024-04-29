package com.example.demo.Dhanusriservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriAddress;
import com.example.demo.Dhanusrirepository.DhanusriAddressRepo;
import com.example.demo.Dhanusrirepository.DhanusriEmployeeRepo;

@Service
public class DhanusriAddressService {
    @Autowired
    DhanusriAddressRepo addressRepo;
    @Autowired
    DhanusriEmployeeRepo employeeRepo;
    public DhanusriAddress setAddressById(int id,DhanusriAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}
