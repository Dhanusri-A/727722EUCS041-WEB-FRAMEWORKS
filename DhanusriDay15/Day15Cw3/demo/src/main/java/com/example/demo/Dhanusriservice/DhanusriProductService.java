package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusrirepository.DhanusriProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhanusriProductService {

    @Autowired
    private DhanusriProductRepo productRepo;

    public List<DhanusriProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public DhanusriProduct getProductById(int id) {
        return productRepo.findById(id).orElse(null);
    }

    public DhanusriProduct addProduct(DhanusriProduct product) {
        return productRepo.save(product);
    }
}