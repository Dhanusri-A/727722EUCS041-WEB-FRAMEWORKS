package com.example.demo.Dhanusricontroller;



import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Dhanusrimodel.DhanusriMedicine;
import com.example.demo.Dhanusriservice.DhanusriMedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class DhanusriMedicineController {

     @Autowired
     public DhanusriMedicineService medicineService;

     @GetMapping("/api/medicines")
     public ResponseEntity<List<DhanusriMedicine>> getMethodName() {

          List<DhanusriMedicine> medicines = medicineService.getAllMedicines();
          if (medicines.isEmpty()) {
               return new ResponseEntity<>(medicines, HttpStatus.NOT_FOUND);

          } else {

               return new ResponseEntity<>(medicines, HttpStatus.CREATED);
          }
     }

     @PostMapping("/api/medicine")
     public ResponseEntity<DhanusriMedicine> postMethodName(@RequestBody DhanusriMedicine medicine) {

          DhanusriMedicine tablet = medicineService.addMedicine(medicine);
          return new ResponseEntity<>(tablet, HttpStatus.OK);
     }

     @GetMapping("/api/medicine/{medicineId}")
     public ResponseEntity<Optional<DhanusriMedicine>> SearchMedicine(@PathVariable int medicineId) {
          Optional<DhanusriMedicine> search = medicineService.getRequiredMedicin(medicineId);
          if (search.isPresent()) {

               return new ResponseEntity<>(search, HttpStatus.OK);
          } else {
               return new ResponseEntity<>(search, HttpStatus.NOT_FOUND);
          }

     }

}