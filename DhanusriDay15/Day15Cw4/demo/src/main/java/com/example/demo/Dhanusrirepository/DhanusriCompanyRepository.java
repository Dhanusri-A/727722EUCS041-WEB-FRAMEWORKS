package com.example.demo.Dhanusrirepository;

import com.example.demo.Dhanusrimodel.DhanusriCompany;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DhanusriCompanyRepository extends JpaRepository<DhanusriCompany, Integer> {
}