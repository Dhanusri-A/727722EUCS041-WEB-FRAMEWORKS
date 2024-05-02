package com.example.demo.Dhanusricontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Dhanusrimodel.DhanusriCompany;
import com.example.demo.Dhanusriservice.DhanusriCompanyService;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class DhanusriCompanyController {

    private static final Logger logger = LoggerFactory.getLogger(DhanusriCompanyController.class);

    @Autowired
    private DhanusriCompanyService CompanyService;

    @GetMapping
    public ResponseEntity<List<DhanusriCompany>> getAllCompanys() {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                "N/A", HttpStatus.OK.value(), "List of Companies", "N/A");
        List<DhanusriCompany> Companys = CompanyService.getAllCompanies();
        return ResponseEntity.ok(Companys);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DhanusriCompany> getCompanyById(@PathVariable("id") int id) {
        logger.info("FINISHED PROCESSING : METHOD=GET; REQUESTURI=/Companies/{}; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                id, HttpStatus.OK.value(), "Company details", "N/A");
        DhanusriCompany Company = CompanyService.getCompanyById(id);
        return ResponseEntity.ok(Company);
    }

    @PostMapping
    public ResponseEntity<DhanusriCompany> addCompany(@RequestBody DhanusriCompany Company) {
        logger.info("FINISHED PROCESSING : METHOD=POST; REQUESTURI=/companies; REQUEST PAYLOAD={}; RESPONSE CODE={}; RESPONSE={}; TIME TAKEN={}",
                Company, HttpStatus.CREATED.value(), "Company added successfully", "N/A");
        DhanusriCompany savedCompany = CompanyService.addCompany(Company);
        return new ResponseEntity<>(savedCompany, HttpStatus.CREATED);
    }
}