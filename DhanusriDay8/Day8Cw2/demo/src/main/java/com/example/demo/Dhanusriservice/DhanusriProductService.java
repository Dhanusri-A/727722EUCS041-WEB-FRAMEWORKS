package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusrirepository.DhanusriProductRepo;

@Service
public class DhanusriProductService {
    @Autowired
    private DhanusriProductRepo rep;

    @SuppressWarnings("null")
    public boolean post(DhanusriProduct person)
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

    public List<DhanusriProduct> start(String value)
    {
        return rep.findByProductNameStartingWith(value);
    }

    public List<DhanusriProduct> end(String value)
    {
        return rep.findByProductNameEndingWith(value);
    }
    public List<DhanusriProduct> sort()
    {
        return rep.findAll(Sort.by("price"));
    }
    
}

