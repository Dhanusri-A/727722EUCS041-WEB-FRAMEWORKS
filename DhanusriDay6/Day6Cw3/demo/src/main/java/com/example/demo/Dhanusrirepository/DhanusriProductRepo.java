package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriProduct;



@Repository
public interface DhanusriProductRepo extends JpaRepository<DhanusriProduct,Integer>{
    
}
