package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriLanguage;


@Repository
public interface DhanusriLanguageRepo extends JpaRepository<DhanusriLanguage,Integer>{
    
}
