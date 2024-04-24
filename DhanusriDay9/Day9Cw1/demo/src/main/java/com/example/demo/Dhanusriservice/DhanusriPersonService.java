package com.example.demo.Dhanusriservice;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriPerson;
import com.example.demo.Dhanusrirepository.DhanusriPersonRepo;


@Service
public class DhanusriPersonService {
    public DhanusriPersonRepo personRepo;

    public DhanusriPersonService(DhanusriPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(DhanusriPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<DhanusriPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}

