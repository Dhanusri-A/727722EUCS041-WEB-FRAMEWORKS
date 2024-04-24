package com.example.demo.Dhanusrirepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriJob;



@Repository
public interface DhanusriJobRepo extends JpaRepository<DhanusriJob, Integer> {

}
