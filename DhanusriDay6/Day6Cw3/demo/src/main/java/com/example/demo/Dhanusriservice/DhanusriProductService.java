package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
    public boolean postProduct(DhanusriProduct product)
    {
        try{

            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public List<DhanusriProduct> pagination(int offset,int size)
    {
        return productRepo.findAll(PageRequest.of(offset, size)).getContent();
    }
    public List<DhanusriProduct> sortPagination(int offset,int size,String field)
    {
        return productRepo.findAll(PageRequest.of(offset, size, Sort.by(field))).getContent();
    }
    public DhanusriProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

