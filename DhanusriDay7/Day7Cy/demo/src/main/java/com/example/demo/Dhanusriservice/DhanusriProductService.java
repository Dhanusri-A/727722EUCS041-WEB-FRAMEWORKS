package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusrirepository.DhanusriProductRepo;

@Service
public class DhanusriProductService {
    @Autowired
    DhanusriProductRepo repo;

    @SuppressWarnings("null")
    public boolean post(DhanusriProduct c) {
        try {

            repo.save(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<DhanusriProduct> getAll() {
        return repo.findAll();

    }

    public List<DhanusriProduct> getProduct(String age) {
        return repo.findByProductCategory(age);

    }
    public List<DhanusriProduct> getProductbyprice(String age) {
        return repo.findByPriceCategory(age);

    }

}

