package com.example.demo.Dhanusrimodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DhanusriPayRoll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long payrollId;
    private double amount;
    private int noOfDaysWorked;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private DhanusriEmployee employee;

}
