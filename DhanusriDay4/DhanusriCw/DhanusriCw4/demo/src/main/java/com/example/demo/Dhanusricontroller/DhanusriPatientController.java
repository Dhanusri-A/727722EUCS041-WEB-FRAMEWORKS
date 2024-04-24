package com.example.demo.Dhanusricontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dhanusrimodel.DhanusriPatient;
import com.example.demo.Dhanusriservice.DhanusriPatientService;



@RestController
@RequestMapping("api")
public class DhanusriPatientController {

    @Autowired
    private DhanusriPatientService patientService;

    @PostMapping("/patient")
    @ResponseStatus(HttpStatus.CREATED)
    public DhanusriPatient getAllPatient(@RequestBody DhanusriPatient patient) {
        return patientService.addPatient(patient);
    }

    @GetMapping("/patient")
    public ResponseEntity<List<DhanusriPatient>> getAllPatients() {
        List<DhanusriPatient> list = patientService.getAllPatients();

        if (list.isEmpty()) {
            return new ResponseEntity<>(new ArrayList<DhanusriPatient>(), HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<DhanusriPatient> getPatientById(@PathVariable int patientId) {
        Optional<DhanusriPatient> patient = patientService.getPatientById(patientId);

        if (patient.isPresent()) {
            return new ResponseEntity<>(patient.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

}
