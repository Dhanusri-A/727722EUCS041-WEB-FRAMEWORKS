package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriCar;


@Repository
public interface DhanusriCarRepo extends JpaRepository<DhanusriCar,Integer>{

    DhanusriCar findDistinctBycurrentOwnerNameAndAddress(String currentOwnerName, String address); 
}
