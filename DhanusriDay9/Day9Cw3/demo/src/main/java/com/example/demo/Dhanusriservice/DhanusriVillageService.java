package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriVillage;
import com.example.demo.Dhanusrirepository.DhanusriVillageRepo;


@Service
public class DhanusriVillageService {
    @Autowired
    private DhanusriVillageRepo rep;

    public boolean post(DhanusriVillage person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public DhanusriVillage start(String lastname)
    {
        return rep.findByName(lastname);
    }
    public DhanusriVillage get3(int id)
    {
        return rep.findById(id);
    }

    public List<DhanusriVillage> end(int population)
    {
        return rep.findByPopulation(population);
    }
    
}

