package com.example.demo.Dhanusrimodel;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DhanusriCompany {
    @Id
    private int id;
    private String name;
    private String address;
    @OneToMany(mappedBy = "company")
    private List<DhanusriEmployee> employees;    
}