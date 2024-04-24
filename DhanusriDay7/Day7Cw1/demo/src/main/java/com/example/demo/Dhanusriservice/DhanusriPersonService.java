package com.example.demo.Dhanusriservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriPerson;
import com.example.demo.Dhanusrirepository.DhanusriPersonRepo;


@Service
public class DhanusriPersonService {

     @Autowired
     public DhanusriPersonRepo personRepo;

     public DhanusriPerson SaveEntity(DhanusriPerson entity) {
          return personRepo.save(entity);

     }

     public List<DhanusriPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<DhanusriPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}

