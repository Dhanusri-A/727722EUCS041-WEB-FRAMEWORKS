package com.example.demo.Dhanusriservice;

import com.example.demo.Dhanusrimodel.DhanusriCompany;
import com.example.demo.Dhanusrirepository.DhanusriCompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DhanusriCompanyService {

    @Autowired
    private DhanusriCompanyRepository companyRepository;

    public List<DhanusriCompany> getAllCompanies() {
        return companyRepository.findAll();
    }

    public DhanusriCompany getCompanyById(int id) {
        return companyRepository.findById(id).orElse(null);
    }

    public DhanusriCompany addCompany(DhanusriCompany company) {
        return companyRepository.save(company);
    }
}