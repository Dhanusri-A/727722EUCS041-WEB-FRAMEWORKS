package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriVillage;

import java.util.List;

@Repository
public interface DhanusriVillageRepo extends JpaRepository<DhanusriVillage, Integer> {

    @Query("select v from Village as v where v.villageName=?1")
    DhanusriVillage findByName(String villageName);

    @Query("select v from Village as v where v.villageId=?1")
    DhanusriVillage findById(int id);

    @Query("select v from Village as v where v.villagePopulation=?1")
    List<DhanusriVillage> findByPopulation(int population);

}
