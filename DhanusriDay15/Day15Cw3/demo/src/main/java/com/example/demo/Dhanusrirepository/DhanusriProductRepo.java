package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dhanusrimodel.DhanusriProduct;

public interface DhanusriProductRepo extends JpaRepository<DhanusriProduct, Integer>{
    
}