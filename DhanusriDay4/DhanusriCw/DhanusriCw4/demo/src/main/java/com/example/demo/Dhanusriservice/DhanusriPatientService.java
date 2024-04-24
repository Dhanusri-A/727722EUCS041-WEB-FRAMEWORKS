package com.example.demo.Dhanusriservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dhanusrimodel.DhanusriPatient;
import com.example.demo.Dhanusrirepository.DhanusriPatientRepo;


@Service
public class DhanusriPatientService {

    @Autowired
    private DhanusriPatientRepo patientRepo;

    public List<DhanusriPatient> getAllPatients() {
        return patientRepo.findAll();
    }

    public Optional<DhanusriPatient> getPatientById(int id) {
        return patientRepo.findById(id);
    }

    public DhanusriPatient addPatient(DhanusriPatient patient) {
        return patientRepo.save(patient);
    }

}