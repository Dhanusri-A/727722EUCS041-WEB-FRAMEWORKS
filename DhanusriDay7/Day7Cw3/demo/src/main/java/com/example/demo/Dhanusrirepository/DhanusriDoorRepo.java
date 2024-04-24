package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriDoor;

import java.util.List;

@Repository
public interface DhanusriDoorRepo extends JpaRepository<DhanusriDoor,Integer>{

    List<DhanusriDoor> findByDoorId(int doorId);
    List<DhanusriDoor> findByAccessType(String accessType);
    
}
