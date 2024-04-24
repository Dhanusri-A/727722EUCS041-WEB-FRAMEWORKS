package com.example.demo.Dhanusrimodel;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class DhanusriStudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;

    @JsonBackReference
    @OneToOne(cascade = CascadeType.ALL)
    private DhanusriStudent student;
}
