package com.example.demo.Dhanusrirepository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriUser;



@Repository
public interface DhanusriUserRepo extends JpaRepository<DhanusriUser, Integer> {
    @Query(value = "SELECT u FROM User u WHERE u.userId = ?1")
    DhanusriUser findByUserId(int userId);

    @Query(value = "SELECT u FROM User u WHERE u.userName=?1")
    DhanusriUser findByUserName(String userName);
}
