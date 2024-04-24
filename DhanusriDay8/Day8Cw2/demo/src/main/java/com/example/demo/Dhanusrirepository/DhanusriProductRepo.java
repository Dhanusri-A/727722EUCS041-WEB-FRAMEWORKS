package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriProduct;

import java.util.List;


@Repository
public interface DhanusriProductRepo extends JpaRepository<DhanusriProduct,Integer>{

    List<DhanusriProduct> findByProductNameStartingWith(String name);
    List<DhanusriProduct> findByProductNameEndingWith(String name);
    
}
