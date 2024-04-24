package com.example.demo.Dhanusriservice;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriProduct;
import com.example.demo.Dhanusrirepository.DhanusriProductRepo;


@Service
public class DhanusriProductService {

    @Autowired
    private DhanusriProductRepo productRepo;

    public DhanusriProduct addProduct(DhanusriProduct product) {
        return productRepo.save(product);
    }

    public List<DhanusriProduct> getAllProducts() {
        return productRepo.findAll();
    }

    public Optional<DhanusriProduct> getProductById(int productId) {
        return productRepo.findById(productId);
    }

}

    

