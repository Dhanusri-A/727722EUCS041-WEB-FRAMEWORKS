package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Dhanusrimodel.DhanusriPatient;



public interface DhanusriPatientRepo extends JpaRepository<DhanusriPatient, Integer> {

}
