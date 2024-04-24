package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriPerson;
import com.example.demo.Dhanusrirepository.DhanusriPersonRepo;


@Service
public class DhanusriPersonService {
    @Autowired
    private DhanusriPersonRepo rep;

    public boolean post(DhanusriPerson person)
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

    public List<DhanusriPerson> start(String lastname)
    {
        return rep.findByLastnameNot(lastname);
    }

    public List<DhanusriPerson> end(List<Integer> ages)
    {
        return rep.findByAgeNotIn(ages);
    }
    
}
