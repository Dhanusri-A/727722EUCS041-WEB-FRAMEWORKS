package com.example.demo.Dhanusrirepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.Dhanusrimodel.DhanusriMedicine;

/**
 * MedicineRepository
 */
@Repository
public interface DhanusriMedicineRepository extends JpaRepository<DhanusriMedicine, Integer> {

}
