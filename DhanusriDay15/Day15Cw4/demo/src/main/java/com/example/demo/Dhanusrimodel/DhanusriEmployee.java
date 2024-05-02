package com.example.demo.Dhanusrimodel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DhanusriEmployee {
    @Id
    private int employeeId;
    private String name;
    private String position;
    @ManyToOne
    private DhanusriCompany company;
}
