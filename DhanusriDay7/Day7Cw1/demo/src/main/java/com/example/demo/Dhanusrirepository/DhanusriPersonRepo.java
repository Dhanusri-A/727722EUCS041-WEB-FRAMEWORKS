package com.example.demo.Dhanusrirepository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriPerson;


/**
 * PersonRepo
 */
@Repository
public interface DhanusriPersonRepo extends JpaRepository<DhanusriPerson, Integer> {

     List<DhanusriPerson> findByAge(int byAge);
}
