package com.example.demo.Dhanusriservice;

import org.springframework.stereotype.Service;


import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusrirepository.DhanusriProductRepo;

@Service
public class DhanusriProductService {
    public DhanusriProductRepo productRepo;
    public DhanusriProductService(DhanusriProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(DhanusriProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,DhanusriProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public DhanusriProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}
