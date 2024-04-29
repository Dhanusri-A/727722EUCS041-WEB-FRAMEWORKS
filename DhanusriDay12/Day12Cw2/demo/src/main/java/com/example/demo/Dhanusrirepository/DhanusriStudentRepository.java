package com.example.demo.Dhanusrirepository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriStudent;
@Repository
public interface DhanusriStudentRepository extends JpaRepository<DhanusriStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<DhanusriStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<DhanusriStudent> getStudentsLeftOuter();

    

    
}

