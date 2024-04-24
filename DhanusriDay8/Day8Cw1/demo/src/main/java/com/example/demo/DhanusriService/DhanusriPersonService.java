package com.example.demo.DhanusriService;

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

    public List<DhanusriPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<DhanusriPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}
