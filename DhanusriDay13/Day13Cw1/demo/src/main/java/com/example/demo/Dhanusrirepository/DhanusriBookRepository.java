package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriBook;
@Repository
public interface DhanusriBookRepository extends JpaRepository<DhanusriBook, Long> {
}