package com.example.demo.Dhanusriservice;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriMedicine;
import com.example.demo.Dhanusrirepository.DhanusriMedicineRepository;

@Service
public class DhanusriMedicineService {

     @Autowired
     DhanusriMedicineRepository medicineRepository;

     public List<DhanusriMedicine> getAllMedicines() {
          // List<Medicine> list ;
          return medicineRepository.findAll();
     }

     public DhanusriMedicine addMedicine(DhanusriMedicine medicine) {
          return medicineRepository.save(medicine);
     }

     public Optional<DhanusriMedicine> getRequiredMedicin(int medicineId) {
          return medicineRepository.findById(medicineId);
     }

}

