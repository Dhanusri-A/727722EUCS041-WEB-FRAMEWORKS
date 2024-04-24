package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriCar;
import com.example.demo.Dhanusrirepository.DhanusriCarRepo;


@Service
public class DhanusriCarService {
    @Autowired
    private DhanusriCarRepo carRepo;

    public boolean post(DhanusriCar car)
    {
        try
        {
            carRepo.save(car);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<DhanusriCar> getAll()
    {
        return carRepo.findAll();
    }

    public DhanusriCar getByDetails(String currentOwnerName, String address)
    {
        try{
        return carRepo.findDistinctBycurrentOwnerNameAndAddress(currentOwnerName, address);
        }
        catch(IncorrectResultSizeDataAccessException i)
        {
            System.out.println("\n\n"+i+"\n\nUse List if needed");
            return null;
        }
        catch(Exception e)
        {
            System.out.println("\n\n"+e);
            return null;
        }
    }
    
}