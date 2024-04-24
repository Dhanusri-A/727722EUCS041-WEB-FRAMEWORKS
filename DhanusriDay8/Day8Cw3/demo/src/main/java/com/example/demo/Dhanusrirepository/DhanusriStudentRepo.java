package com.example.demo.Dhanusrirepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Dhanusrimodel.DhanusriStudent;

import java.util.List;

@Repository
public interface DhanusriStudentRepo extends JpaRepository<DhanusriStudent, Long> {

    List<DhanusriStudent> findByMarksGreaterThan(int mark);

    List<DhanusriStudent> findByMarksLessThan(int mark);

}

