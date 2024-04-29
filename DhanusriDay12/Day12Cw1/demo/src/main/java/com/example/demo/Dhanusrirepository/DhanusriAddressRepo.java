package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriAddress;

import jakarta.transaction.Transactional;
@Repository
public interface DhanusriAddressRepo extends JpaRepository<DhanusriAddress,Integer>{

    @Modifying
    @Transactional
    @Query(value="insert into address(city,street,employee_id) values(?1,?2,?3)",nativeQuery = true)
    void setByemployeeId(String city,String street,int id);
     
}
