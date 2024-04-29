package com.example.demo.Dhanusrirepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Dhanusrimodel.DhanusriAuthor;
@Repository
public interface DhanusriAuthorRepository extends JpaRepository<DhanusriAuthor, Long> {
}
