package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriRecipe;

import java.util.List;


@Repository
public interface DhanusriRecipeRepo extends JpaRepository<DhanusriRecipe,Integer>{

    @Query("select r from Recipe r where recipeName=?1")
    List<DhanusriRecipe> findByProduct(String name);
    
}
