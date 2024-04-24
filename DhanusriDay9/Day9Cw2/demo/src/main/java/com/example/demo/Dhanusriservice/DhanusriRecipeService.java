package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriRecipe;
import com.example.demo.Dhanusrirepository.DhanusriRecipeRepo;


@Service
public class DhanusriRecipeService {
    @Autowired
    private DhanusriRecipeRepo rep;

  
    @SuppressWarnings("null")
    public boolean post(DhanusriRecipe recipe)
    {
        try
        {
            rep.save(recipe);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public DhanusriRecipe getByid(int id)
    {
        return rep.findById(id).orElse(null);
    }

    public List<DhanusriRecipe> filter(String name)
    {
        return rep.findByProduct(name);
    }
    
    
}
