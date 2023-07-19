package com.example.githubcopilot_joiners.Model;

import lombok.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer eid;
    private String ename;
    private String eemail;
    private String eaddress;
    private String ephonr;
    private int esalary;

}
